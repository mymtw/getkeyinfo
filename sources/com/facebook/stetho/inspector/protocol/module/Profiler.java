package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public class Profiler implements ChromeDevtoolsDomain {

    public static class ProfileHeader {
        @JsonProperty(required = true)
        public String title;
        @JsonProperty(required = true)
        public String typeId;
        @JsonProperty(required = true)
        public int uid;

        private ProfileHeader() {
        }
    }

    public static class ProfileHeaderResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public List<ProfileHeader> headers;

        private ProfileHeaderResponse() {
        }
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getProfileHeaders(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        ProfileHeaderResponse profileHeaderResponse = new ProfileHeaderResponse();
        profileHeaderResponse.headers = Collections.emptyList();
        return profileHeaderResponse;
    }

    @ChromeDevtoolsMethod
    public void setSamplingInterval(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }
}
