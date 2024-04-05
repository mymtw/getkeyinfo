package com.facebook.stetho.inspector;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.PendingRequest;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcRequest;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcResponse;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.websocket.CloseCodes;
import com.facebook.stetho.websocket.SimpleEndpoint;
import com.facebook.stetho.websocket.SimpleSession;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ChromeDevtoolsServer implements SimpleEndpoint {
    public static final String PATH = "/inspector";
    private static final String TAG = "ChromeDevtoolsServer";
    private final MethodDispatcher mMethodDispatcher;
    private final ObjectMapper mObjectMapper;
    private final Map<SimpleSession, JsonRpcPeer> mPeers = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.facebook.stetho.inspector.ChromeDevtoolsServer$1 */
    public static /* synthetic */ class C124461 {

        /* renamed from: $SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode */
        public static final /* synthetic */ int[] f27600x978b462;

        static {
            int[] iArr = new int[JsonRpcError.ErrorCode.values().length];
            f27600x978b462 = iArr;
            try {
                iArr[JsonRpcError.ErrorCode.METHOD_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ChromeDevtoolsServer(Iterable<ChromeDevtoolsDomain> iterable) {
        ObjectMapper objectMapper = new ObjectMapper();
        this.mObjectMapper = objectMapper;
        this.mMethodDispatcher = new MethodDispatcher(objectMapper, iterable);
    }

    private void closeSafely(SimpleSession simpleSession, int i, String str) {
        simpleSession.close(i, str);
    }

    private void handleRemoteMessage(JsonRpcPeer jsonRpcPeer, String str) throws IOException, MessageHandlingException, JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has(ResponseConstants.METHOD)) {
            handleRemoteRequest(jsonRpcPeer, jSONObject);
        } else if (jSONObject.has("result")) {
            handleRemoteResponse(jsonRpcPeer, jSONObject);
        } else {
            throw new MessageHandlingException(C0326j.m864i("Improper JSON-RPC message: ", str));
        }
    }

    private void handleRemoteRequest(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws MessageHandlingException {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String str;
        JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) this.mObjectMapper.convertValue(jSONObject, JsonRpcRequest.class);
        try {
            jSONObject3 = this.mMethodDispatcher.dispatch(jsonRpcPeer, jsonRpcRequest.method, jsonRpcRequest.params);
            jSONObject2 = null;
        } catch (JsonRpcException e) {
            logDispatchException(e);
            jSONObject2 = (JSONObject) this.mObjectMapper.convertValue(e.getErrorMessage(), JSONObject.class);
            jSONObject3 = null;
        }
        if (jsonRpcRequest.f27601id != null) {
            JsonRpcResponse jsonRpcResponse = new JsonRpcResponse();
            jsonRpcResponse.f27602id = jsonRpcRequest.f27601id.longValue();
            jsonRpcResponse.result = jSONObject3;
            jsonRpcResponse.error = jSONObject2;
            try {
                str = ((JSONObject) this.mObjectMapper.convertValue(jsonRpcResponse, JSONObject.class)).toString();
            } catch (OutOfMemoryError e2) {
                jsonRpcResponse.result = null;
                jsonRpcResponse.error = (JSONObject) this.mObjectMapper.convertValue(e2.getMessage(), JSONObject.class);
                str = ((JSONObject) this.mObjectMapper.convertValue(jsonRpcResponse, JSONObject.class)).toString();
            }
            jsonRpcPeer.getWebSocket().sendText(str);
        }
    }

    private void handleRemoteResponse(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws MismatchedResponseException {
        JsonRpcResponse jsonRpcResponse = (JsonRpcResponse) this.mObjectMapper.convertValue(jSONObject, JsonRpcResponse.class);
        PendingRequest andRemovePendingRequest = jsonRpcPeer.getAndRemovePendingRequest(jsonRpcResponse.f27602id);
        if (andRemovePendingRequest != null) {
            PendingRequestCallback pendingRequestCallback = andRemovePendingRequest.callback;
            if (pendingRequestCallback != null) {
                pendingRequestCallback.onResponse(jsonRpcPeer, jsonRpcResponse);
                return;
            }
            return;
        }
        throw new MismatchedResponseException(jsonRpcResponse.f27602id);
    }

    private static void logDispatchException(JsonRpcException jsonRpcException) {
        JsonRpcError errorMessage = jsonRpcException.getErrorMessage();
        if (C124461.f27600x978b462[errorMessage.code.ordinal()] != 1) {
            LogRedirector.m20232w(TAG, "Error processing remote message", jsonRpcException);
            return;
        }
        StringBuilder h = C0072d.m201h("Method not implemented: ");
        h.append(errorMessage.message);
        LogRedirector.m20223d(TAG, h.toString());
    }

    public void onClose(SimpleSession simpleSession, int i, String str) {
        LogRedirector.m20223d(TAG, "onClose: reason=" + i + " " + str);
        JsonRpcPeer remove = this.mPeers.remove(simpleSession);
        if (remove != null) {
            remove.invokeDisconnectReceivers();
        }
    }

    public void onError(SimpleSession simpleSession, Throwable th) {
        StringBuilder h = C0072d.m201h("onError: ex=");
        h.append(th.toString());
        LogRedirector.m20225e(TAG, h.toString());
    }

    public void onMessage(SimpleSession simpleSession, byte[] bArr, int i) {
        LogRedirector.m20223d(TAG, "Ignoring binary message of length " + i);
    }

    public void onOpen(SimpleSession simpleSession) {
        LogRedirector.m20223d(TAG, "onOpen");
        this.mPeers.put(simpleSession, new JsonRpcPeer(this.mObjectMapper, simpleSession));
    }

    public void onMessage(SimpleSession simpleSession, String str) {
        if (LogRedirector.isLoggable(TAG, 2)) {
            LogRedirector.m20229v(TAG, "onMessage: message=" + str);
        }
        try {
            JsonRpcPeer jsonRpcPeer = this.mPeers.get(simpleSession);
            Util.throwIfNull(jsonRpcPeer);
            handleRemoteMessage(jsonRpcPeer, str);
        } catch (IOException e) {
            if (LogRedirector.isLoggable(TAG, 2)) {
                LogRedirector.m20229v(TAG, "Unexpected I/O exception processing message: " + e);
            }
            closeSafely(simpleSession, CloseCodes.UNEXPECTED_CONDITION, e.getClass().getSimpleName());
        } catch (MessageHandlingException e2) {
            LogRedirector.m20227i(TAG, "Message could not be processed by implementation: " + e2);
            closeSafely(simpleSession, CloseCodes.UNEXPECTED_CONDITION, e2.getClass().getSimpleName());
        } catch (JSONException e3) {
            LogRedirector.m20230v(TAG, "Unexpected JSON exception processing message", e3);
            closeSafely(simpleSession, CloseCodes.UNEXPECTED_CONDITION, e3.getClass().getSimpleName());
        }
    }
}
