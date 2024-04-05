package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.AutoValue_InstallationResponse;

@AutoValue
public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.remote.InstallationResponse$a */
    public static abstract class C16577a {
        public abstract InstallationResponse build();

        public abstract C16577a setAuthToken(TokenResult tokenResult);

        public abstract C16577a setFid(String str);

        public abstract C16577a setRefreshToken(String str);

        public abstract C16577a setResponseCode(ResponseCode responseCode);

        public abstract C16577a setUri(String str);
    }

    public static C16577a builder() {
        return new AutoValue_InstallationResponse.Builder();
    }

    public abstract TokenResult getAuthToken();

    public abstract String getFid();

    public abstract String getRefreshToken();

    public abstract ResponseCode getResponseCode();

    public abstract String getUri();

    public abstract C16577a toBuilder();
}
