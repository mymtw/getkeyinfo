package com.facebook.stetho.inspector.jsonrpc;

import android.database.Observable;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcRequest;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.websocket.SimpleSession;
import java.nio.channels.NotYetConnectedException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class JsonRpcPeer {
    private final DisconnectObservable mDisconnectObservable = new DisconnectObservable();
    private long mNextRequestId;
    private final ObjectMapper mObjectMapper;
    private final SimpleSession mPeer;
    private final Map<Long, PendingRequest> mPendingRequests = new HashMap();

    public static class DisconnectObservable extends Observable<DisconnectReceiver> {
        private DisconnectObservable() {
        }

        public void onDisconnect() {
            int size = this.mObservers.size();
            for (int i = 0; i < size; i++) {
                ((DisconnectReceiver) this.mObservers.get(i)).onDisconnect();
            }
        }
    }

    public JsonRpcPeer(ObjectMapper objectMapper, SimpleSession simpleSession) {
        this.mObjectMapper = objectMapper;
        this.mPeer = (SimpleSession) Util.throwIfNull(simpleSession);
    }

    private synchronized long preparePendingRequest(PendingRequestCallback pendingRequestCallback) {
        long j;
        j = this.mNextRequestId;
        this.mNextRequestId = 1 + j;
        this.mPendingRequests.put(Long.valueOf(j), new PendingRequest(j, pendingRequestCallback));
        return j;
    }

    public synchronized PendingRequest getAndRemovePendingRequest(long j) {
        return this.mPendingRequests.remove(Long.valueOf(j));
    }

    public SimpleSession getWebSocket() {
        return this.mPeer;
    }

    public void invokeDisconnectReceivers() {
        this.mDisconnectObservable.onDisconnect();
    }

    public void invokeMethod(String str, Object obj, PendingRequestCallback pendingRequestCallback) throws NotYetConnectedException {
        Util.throwIfNull(str);
        this.mPeer.sendText(((JSONObject) this.mObjectMapper.convertValue(new JsonRpcRequest(pendingRequestCallback != null ? Long.valueOf(preparePendingRequest(pendingRequestCallback)) : null, str, (JSONObject) this.mObjectMapper.convertValue(obj, JSONObject.class)), JSONObject.class)).toString());
    }

    public void registerDisconnectReceiver(DisconnectReceiver disconnectReceiver) {
        this.mDisconnectObservable.registerObserver(disconnectReceiver);
    }

    public void unregisterDisconnectReceiver(DisconnectReceiver disconnectReceiver) {
        this.mDisconnectObservable.unregisterObserver(disconnectReceiver);
    }
}
