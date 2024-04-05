package com.google.firebase.installations;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.AutoValue_InstallationTokenResult;

@AutoValue
/* renamed from: com.google.firebase.installations.g */
public abstract class C16566g {

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.g$a */
    public static abstract class C16567a {
        public abstract C16566g build();

        public abstract C16567a setToken(String str);

        public abstract C16567a setTokenCreationTimestamp(long j);

        public abstract C16567a setTokenExpirationTimestamp(long j);
    }

    public static C16567a builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    public abstract String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract C16567a toBuilder();
}
