package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.remote.AutoValue_TokenResult;

@AutoValue
public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.remote.TokenResult$a */
    public static abstract class C16578a {
        public abstract TokenResult build();

        public abstract C16578a setResponseCode(ResponseCode responseCode);

        public abstract C16578a setToken(String str);

        public abstract C16578a setTokenExpirationTimestamp(long j);
    }

    public static C16578a builder() {
        return new AutoValue_TokenResult.Builder().setTokenExpirationTimestamp(0);
    }

    public abstract ResponseCode getResponseCode();

    public abstract String getToken();

    public abstract long getTokenExpirationTimestamp();

    public abstract C16578a toBuilder();
}
