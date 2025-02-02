package com.google.firebase.installations.remote;

import android.support.p013v4.media.C0072d;
import com.google.firebase.installations.remote.InstallationResponse;

final class AutoValue_InstallationResponse extends InstallationResponse {
    private final TokenResult authToken;
    private final String fid;
    private final String refreshToken;
    private final InstallationResponse.ResponseCode responseCode;
    private final String uri;

    public static final class Builder extends InstallationResponse.C16577a {
        private TokenResult authToken;
        private String fid;
        private String refreshToken;
        private InstallationResponse.ResponseCode responseCode;
        private String uri;

        public InstallationResponse build() {
            return new AutoValue_InstallationResponse(this.uri, this.fid, this.refreshToken, this.authToken, this.responseCode);
        }

        public InstallationResponse.C16577a setAuthToken(TokenResult tokenResult) {
            this.authToken = tokenResult;
            return this;
        }

        public InstallationResponse.C16577a setFid(String str) {
            this.fid = str;
            return this;
        }

        public InstallationResponse.C16577a setRefreshToken(String str) {
            this.refreshToken = str;
            return this;
        }

        public InstallationResponse.C16577a setResponseCode(InstallationResponse.ResponseCode responseCode2) {
            this.responseCode = responseCode2;
            return this;
        }

        public InstallationResponse.C16577a setUri(String str) {
            this.uri = str;
            return this;
        }

        public Builder() {
        }

        private Builder(InstallationResponse installationResponse) {
            this.uri = installationResponse.getUri();
            this.fid = installationResponse.getFid();
            this.refreshToken = installationResponse.getRefreshToken();
            this.authToken = installationResponse.getAuthToken();
            this.responseCode = installationResponse.getResponseCode();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.uri;
        if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
            String str2 = this.fid;
            if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                String str3 = this.refreshToken;
                if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                    TokenResult tokenResult = this.authToken;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                        InstallationResponse.ResponseCode responseCode2 = this.responseCode;
                        if (responseCode2 == null) {
                            if (installationResponse.getResponseCode() == null) {
                                return true;
                            }
                        } else if (responseCode2.equals(installationResponse.getResponseCode())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public TokenResult getAuthToken() {
        return this.authToken;
    }

    public String getFid() {
        return this.fid;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public InstallationResponse.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.fid;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.refreshToken;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.authToken;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode2 = this.responseCode;
        if (responseCode2 != null) {
            i = responseCode2.hashCode();
        }
        return hashCode4 ^ i;
    }

    public InstallationResponse.C16577a toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InstallationResponse{uri=");
        h.append(this.uri);
        h.append(", fid=");
        h.append(this.fid);
        h.append(", refreshToken=");
        h.append(this.refreshToken);
        h.append(", authToken=");
        h.append(this.authToken);
        h.append(", responseCode=");
        h.append(this.responseCode);
        h.append("}");
        return h.toString();
    }

    private AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode2) {
        this.uri = str;
        this.fid = str2;
        this.refreshToken = str3;
        this.authToken = tokenResult;
        this.responseCode = responseCode2;
    }
}
