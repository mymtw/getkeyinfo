package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.facebook.stetho.common.ProcessUtil;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.protocol.module.Console;
import com.facebook.stetho.inspector.screencast.ScreencastDispatcher;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.json.annotation.JsonValue;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class Page implements ChromeDevtoolsDomain {
    public static final String BANNER = "_____/\\\\\\\\\\\\\\\\\\\\\\_______________________________________________/\\\\\\_______________________\n ___/\\\\\\/////////\\\\\\____________________________________________\\/\\\\\\_______________________\n  __\\//\\\\\\______\\///______/\\\\\\_________________________/\\\\\\______\\/\\\\\\_______________________\n   ___\\////\\\\\\__________/\\\\\\\\\\\\\\\\\\\\\\_____/\\\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_____________/\\\\\\\\\\____\n    ______\\////\\\\\\______\\////\\\\\\////____/\\\\\\/////\\\\\\_\\////\\\\\\////__\\/\\\\\\\\\\\\\\\\\\\\____/\\\\\\///\\\\\\__\n     _________\\////\\\\\\______\\/\\\\\\_______/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______\\/\\\\\\/////\\\\\\__/\\\\\\__\\//\\\\\\_\n      __/\\\\\\______\\//\\\\\\_____\\/\\\\\\_/\\\\__\\//\\\\///////______\\/\\\\\\_/\\\\__\\/\\\\\\___\\/\\\\\\_\\//\\\\\\__/\\\\\\__\n       _\\///\\\\\\\\\\\\\\\\\\\\\\/______\\//\\\\\\\\\\____\\//\\\\\\\\\\\\\\\\\\\\____\\//\\\\\\\\\\___\\/\\\\\\___\\/\\\\\\__\\///\\\\\\\\\\/___\n        ___\\///////////_________\\/////______\\//////////______\\/////____\\///____\\///_____\\/////_____\n         Welcome to Stetho";
    private final Context mContext;
    private final String mMessage;
    private final ObjectMapper mObjectMapper;
    private ScreencastDispatcher mScreencastDispatcher;

    public static class ExecutionContextCreatedParams {
        @JsonProperty(required = true)
        public ExecutionContextDescription context;

        private ExecutionContextCreatedParams() {
        }
    }

    public static class ExecutionContextDescription {
        @JsonProperty(required = true)
        public String frameId;
        @JsonProperty(required = true)

        /* renamed from: id */
        public int f27608id;

        private ExecutionContextDescription() {
        }
    }

    public static class Frame {
        @JsonProperty(required = true)

        /* renamed from: id */
        public String f27609id;
        @JsonProperty(required = true)
        public String loaderId;
        @JsonProperty(required = true)
        public String mimeType;
        @JsonProperty
        public String name;
        @JsonProperty
        public String parentId;
        @JsonProperty(required = true)
        public String securityOrigin;
        @JsonProperty(required = true)
        public String url;

        private Frame() {
        }
    }

    public static class FrameResourceTree {
        @JsonProperty
        public List<FrameResourceTree> childFrames;
        @JsonProperty(required = true)
        public Frame frame;
        @JsonProperty(required = true)
        public List<Resource> resources;

        private FrameResourceTree() {
        }
    }

    public static class GetResourceTreeParams implements JsonRpcResult {
        @JsonProperty(required = true)
        public FrameResourceTree frameTree;

        private GetResourceTreeParams() {
        }
    }

    public static class Resource {
        private Resource() {
        }
    }

    public enum ResourceType {
        DOCUMENT("Document"),
        STYLESHEET("Stylesheet"),
        IMAGE("Image"),
        FONT("Font"),
        SCRIPT("Script"),
        XHR("XHR"),
        WEBSOCKET("WebSocket"),
        OTHER("Other");
        
        private final String mProtocolValue;

        private ResourceType(String str) {
            this.mProtocolValue = str;
        }

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }

    public static class ScreencastFrameEvent {
        @JsonProperty(required = true)
        public String data;
        @JsonProperty(required = true)
        public ScreencastFrameEventMetadata metadata;
    }

    public static class ScreencastFrameEventMetadata {
        @JsonProperty(required = true)
        public int deviceHeight;
        @JsonProperty(required = true)
        public int deviceWidth;
        @JsonProperty(required = true)
        public int offsetTop;
        @JsonProperty(required = true)
        public int pageScaleFactor;
        @JsonProperty(required = true)
        public int scrollOffsetX;
        @JsonProperty(required = true)
        public int scrollOffsetY;
    }

    public static class StartScreencastRequest {
        @JsonProperty
        public String format;
        @JsonProperty
        public int maxHeight;
        @JsonProperty
        public int maxWidth;
        @JsonProperty
        public int quality;
    }

    public Page(Context context) {
        this(context, BANNER);
    }

    private static FrameResourceTree createSimpleFrameResourceTree(String str, String str2, String str3, String str4) {
        Frame frame = new Frame();
        frame.f27609id = str;
        frame.parentId = str2;
        frame.loaderId = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        frame.name = str3;
        frame.url = "";
        frame.securityOrigin = str4;
        frame.mimeType = "text/plain";
        FrameResourceTree frameResourceTree = new FrameResourceTree();
        frameResourceTree.frame = frame;
        frameResourceTree.resources = Collections.emptyList();
        frameResourceTree.childFrames = null;
        return frameResourceTree;
    }

    private void notifyExecutionContexts(JsonRpcPeer jsonRpcPeer) {
        ExecutionContextDescription executionContextDescription = new ExecutionContextDescription();
        executionContextDescription.frameId = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        executionContextDescription.f27608id = 1;
        ExecutionContextCreatedParams executionContextCreatedParams = new ExecutionContextCreatedParams();
        executionContextCreatedParams.context = executionContextDescription;
        jsonRpcPeer.invokeMethod("Runtime.executionContextCreated", executionContextCreatedParams, (PendingRequestCallback) null);
    }

    private void sendWelcomeMessage(JsonRpcPeer jsonRpcPeer) {
        Console.ConsoleMessage consoleMessage = new Console.ConsoleMessage();
        consoleMessage.source = Console.MessageSource.JAVASCRIPT;
        consoleMessage.level = Console.MessageLevel.LOG;
        consoleMessage.text = this.mMessage + "\n          Attached to " + ProcessUtil.getProcessName() + "\n";
        Console.MessageAddedRequest messageAddedRequest = new Console.MessageAddedRequest();
        messageAddedRequest.message = consoleMessage;
        jsonRpcPeer.invokeMethod("Console.messageAdded", messageAddedRequest, (PendingRequestCallback) null);
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult canScreencast(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        return new SimpleBooleanResult(true);
    }

    @ChromeDevtoolsMethod
    public void clearDeviceOrientationOverride(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void clearGeolocationOverride(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        notifyExecutionContexts(jsonRpcPeer);
        sendWelcomeMessage(jsonRpcPeer);
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getResourceTree(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        Iterator<String> it = SharedPreferencesHelper.getSharedPreferenceTags(this.mContext).iterator();
        FrameResourceTree createSimpleFrameResourceTree = createSimpleFrameResourceTree(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, (String) null, "Stetho", it.hasNext() ? it.next() : "");
        if (createSimpleFrameResourceTree.childFrames == null) {
            createSimpleFrameResourceTree.childFrames = new ArrayList();
        }
        int i = 1;
        while (it.hasNext()) {
            StringBuilder h = C0072d.m201h("1.");
            int i2 = i + 1;
            h.append(i);
            String sb = h.toString();
            createSimpleFrameResourceTree.childFrames.add(createSimpleFrameResourceTree(sb, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, C0326j.m864i("Child #", sb), it.next()));
            i = i2;
        }
        GetResourceTreeParams getResourceTreeParams = new GetResourceTreeParams();
        getResourceTreeParams.frameTree = createSimpleFrameResourceTree;
        return getResourceTreeParams;
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult hasTouchInputs(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        return new SimpleBooleanResult(false);
    }

    @ChromeDevtoolsMethod
    public void screencastFrameAck(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void setDeviceMetricsOverride(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void setEmulatedMedia(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void setShowViewportSizeOnResize(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void setTouchEmulationEnabled(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void startScreencast(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        StartScreencastRequest startScreencastRequest = (StartScreencastRequest) this.mObjectMapper.convertValue(jSONObject, StartScreencastRequest.class);
        if (this.mScreencastDispatcher == null) {
            ScreencastDispatcher screencastDispatcher = new ScreencastDispatcher();
            this.mScreencastDispatcher = screencastDispatcher;
            screencastDispatcher.startScreencast(jsonRpcPeer, startScreencastRequest);
        }
    }

    @ChromeDevtoolsMethod
    public void stopScreencast(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        ScreencastDispatcher screencastDispatcher = this.mScreencastDispatcher;
        if (screencastDispatcher != null) {
            screencastDispatcher.stopScreencast();
            this.mScreencastDispatcher = null;
        }
    }

    public Page(Context context, String str) {
        this.mObjectMapper = new ObjectMapper();
        this.mContext = context;
        this.mMessage = str;
    }
}
