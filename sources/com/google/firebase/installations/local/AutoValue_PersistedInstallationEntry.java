package com.google.firebase.installations.local;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.firebase.installations.local.C16573b;
import com.google.firebase.installations.local.PersistedInstallation;
import p003a2.C0023f;

final class AutoValue_PersistedInstallationEntry extends C16573b {
    private final String authToken;
    private final long expiresInSecs;
    private final String firebaseInstallationId;
    private final String fisError;
    private final String refreshToken;
    private final PersistedInstallation.RegistrationStatus registrationStatus;
    private final long tokenCreationEpochInSecs;

    public static final class Builder extends C16573b.C16574a {
        private String authToken;
        private Long expiresInSecs;
        private String firebaseInstallationId;
        private String fisError;
        private String refreshToken;
        private PersistedInstallation.RegistrationStatus registrationStatus;
        private Long tokenCreationEpochInSecs;

        public C16573b build() {
            String str = this.registrationStatus == null ? " registrationStatus" : "";
            if (this.expiresInSecs == null) {
                str = C0326j.m864i(str, " expiresInSecs");
            }
            if (this.tokenCreationEpochInSecs == null) {
                str = C0326j.m864i(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.firebaseInstallationId, this.registrationStatus, this.authToken, this.refreshToken, this.expiresInSecs.longValue(), this.tokenCreationEpochInSecs.longValue(), this.fisError);
            }
            throw new IllegalStateException(C0326j.m864i("Missing required properties:", str));
        }

        public C16573b.C16574a setAuthToken(String str) {
            this.authToken = str;
            return this;
        }

        public C16573b.C16574a setExpiresInSecs(long j) {
            this.expiresInSecs = Long.valueOf(j);
            return this;
        }

        public C16573b.C16574a setFirebaseInstallationId(String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        public C16573b.C16574a setFisError(String str) {
            this.fisError = str;
            return this;
        }

        public C16573b.C16574a setRefreshToken(String str) {
            this.refreshToken = str;
            return this;
        }

        public C16573b.C16574a setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus2) {
            if (registrationStatus2 != null) {
                this.registrationStatus = registrationStatus2;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public C16573b.C16574a setTokenCreationEpochInSecs(long j) {
            this.tokenCreationEpochInSecs = Long.valueOf(j);
            return this;
        }

        public Builder() {
        }

        private Builder(C16573b bVar) {
            this.firebaseInstallationId = bVar.getFirebaseInstallationId();
            this.registrationStatus = bVar.getRegistrationStatus();
            this.authToken = bVar.getAuthToken();
            this.refreshToken = bVar.getRefreshToken();
            this.expiresInSecs = Long.valueOf(bVar.getExpiresInSecs());
            this.tokenCreationEpochInSecs = Long.valueOf(bVar.getTokenCreationEpochInSecs());
            this.fisError = bVar.getFisError();
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16573b)) {
            return false;
        }
        C16573b bVar = (C16573b) obj;
        String str3 = this.firebaseInstallationId;
        if (str3 != null ? str3.equals(bVar.getFirebaseInstallationId()) : bVar.getFirebaseInstallationId() == null) {
            if (this.registrationStatus.equals(bVar.getRegistrationStatus()) && ((str = this.authToken) != null ? str.equals(bVar.getAuthToken()) : bVar.getAuthToken() == null) && ((str2 = this.refreshToken) != null ? str2.equals(bVar.getRefreshToken()) : bVar.getRefreshToken() == null) && this.expiresInSecs == bVar.getExpiresInSecs() && this.tokenCreationEpochInSecs == bVar.getTokenCreationEpochInSecs()) {
                String str4 = this.fisError;
                if (str4 == null) {
                    if (bVar.getFisError() == null) {
                        return true;
                    }
                } else if (str4.equals(bVar.getFisError())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public long getExpiresInSecs() {
        return this.expiresInSecs;
    }

    public String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public String getFisError() {
        return this.fisError;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.registrationStatus;
    }

    public long getTokenCreationEpochInSecs() {
        return this.tokenCreationEpochInSecs;
    }

    public int hashCode() {
        String str = this.firebaseInstallationId;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.registrationStatus.hashCode()) * 1000003;
        String str2 = this.authToken;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.refreshToken;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.expiresInSecs;
        long j2 = this.tokenCreationEpochInSecs;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.fisError;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    public C16573b.C16574a toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("PersistedInstallationEntry{firebaseInstallationId=");
        h.append(this.firebaseInstallationId);
        h.append(", registrationStatus=");
        h.append(this.registrationStatus);
        h.append(", authToken=");
        h.append(this.authToken);
        h.append(", refreshToken=");
        h.append(this.refreshToken);
        h.append(", expiresInSecs=");
        h.append(this.expiresInSecs);
        h.append(", tokenCreationEpochInSecs=");
        h.append(this.tokenCreationEpochInSecs);
        h.append(", fisError=");
        return C0023f.m110k(h, this.fisError, "}");
    }

    private AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.RegistrationStatus registrationStatus2, String str2, String str3, long j, long j2, String str4) {
        this.firebaseInstallationId = str;
        this.registrationStatus = registrationStatus2;
        this.authToken = str2;
        this.refreshToken = str3;
        this.expiresInSecs = j;
        this.tokenCreationEpochInSecs = j2;
        this.fisError = str4;
    }
}
