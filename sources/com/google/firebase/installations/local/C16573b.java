package com.google.firebase.installations.local;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallation;

@AutoValue
/* renamed from: com.google.firebase.installations.local.b */
public abstract class C16573b {
    public static C16573b INSTANCE = builder().build();

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.local.b$a */
    public static abstract class C16574a {
        public abstract C16573b build();

        public abstract C16574a setAuthToken(String str);

        public abstract C16574a setExpiresInSecs(long j);

        public abstract C16574a setFirebaseInstallationId(String str);

        public abstract C16574a setFisError(String str);

        public abstract C16574a setRefreshToken(String str);

        public abstract C16574a setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus);

        public abstract C16574a setTokenCreationEpochInSecs(long j);
    }

    public static C16574a builder() {
        return new AutoValue_PersistedInstallationEntry.Builder().setTokenCreationEpochInSecs(0).setRegistrationStatus(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).setExpiresInSecs(0);
    }

    public abstract String getAuthToken();

    public abstract long getExpiresInSecs();

    public abstract String getFirebaseInstallationId();

    public abstract String getFisError();

    public abstract String getRefreshToken();

    public abstract PersistedInstallation.RegistrationStatus getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public boolean isErrored() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
    }

    public boolean isNotGenerated() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || getRegistrationStatus() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public boolean isRegistered() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.REGISTERED;
    }

    public boolean isUnregistered() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.UNREGISTERED;
    }

    public boolean shouldAttemptMigration() {
        return getRegistrationStatus() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION;
    }

    public abstract C16574a toBuilder();

    public C16573b withAuthToken(String str, long j, long j2) {
        return toBuilder().setAuthToken(str).setExpiresInSecs(j).setTokenCreationEpochInSecs(j2).build();
    }

    public C16573b withClearedAuthToken() {
        return toBuilder().setAuthToken((String) null).build();
    }

    public C16573b withFisError(String str) {
        return toBuilder().setFisError(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).build();
    }

    public C16573b withNoGeneratedFid() {
        return toBuilder().setRegistrationStatus(PersistedInstallation.RegistrationStatus.NOT_GENERATED).build();
    }

    public C16573b withRegisteredFid(String str, String str2, long j, String str3, long j2) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTERED).setAuthToken(str3).setRefreshToken(str2).setExpiresInSecs(j2).setTokenCreationEpochInSecs(j).build();
    }

    public C16573b withUnregisteredFid(String str) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.UNREGISTERED).build();
    }
}
