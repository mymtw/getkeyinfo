package com.google.firebase.installations;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import androidx.appcompat.widget.C0326j;
import com.google.firebase.installations.C16566g;

final class AutoValue_InstallationTokenResult extends C16566g {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    public static final class Builder extends C16566g.C16567a {
        private String token;
        private Long tokenCreationTimestamp;
        private Long tokenExpirationTimestamp;

        public C16566g build() {
            String str = this.token == null ? " token" : "";
            if (this.tokenExpirationTimestamp == null) {
                str = C0326j.m864i(str, " tokenExpirationTimestamp");
            }
            if (this.tokenCreationTimestamp == null) {
                str = C0326j.m864i(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.tokenCreationTimestamp.longValue());
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public C16566g.C16567a setToken(String str) {
            if (str != null) {
                this.token = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public C16566g.C16567a setTokenCreationTimestamp(long j) {
            this.tokenCreationTimestamp = Long.valueOf(j);
            return this;
        }

        public C16566g.C16567a setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = Long.valueOf(j);
            return this;
        }

        public Builder() {
        }

        private Builder(C16566g gVar) {
            this.token = gVar.getToken();
            this.tokenExpirationTimestamp = Long.valueOf(gVar.getTokenExpirationTimestamp());
            this.tokenCreationTimestamp = Long.valueOf(gVar.getTokenCreationTimestamp());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16566g)) {
            return false;
        }
        C16566g gVar = (C16566g) obj;
        return this.token.equals(gVar.getToken()) && this.tokenExpirationTimestamp == gVar.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == gVar.getTokenCreationTimestamp();
    }

    public String getToken() {
        return this.token;
    }

    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        long j = this.tokenExpirationTimestamp;
        long j2 = this.tokenCreationTimestamp;
        return ((((this.token.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public C16566g.C16567a toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("InstallationTokenResult{token=");
        h.append(this.token);
        h.append(", tokenExpirationTimestamp=");
        h.append(this.tokenExpirationTimestamp);
        h.append(", tokenCreationTimestamp=");
        return C0087d.m236f(h, this.tokenCreationTimestamp, "}");
    }

    private AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.tokenCreationTimestamp = j2;
    }
}
