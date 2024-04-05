package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        private ClientType(int i) {
            this.value = i;
        }
    }

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.internal.ClientInfo$a */
    public static abstract class C6501a {
        public abstract ClientInfo build();

        public abstract C6501a setAndroidClientInfo(C6503a aVar);

        public abstract C6501a setClientType(ClientType clientType);
    }

    public static C6501a builder() {
        return new AutoValue_ClientInfo.Builder();
    }

    public abstract C6503a getAndroidClientInfo();

    public abstract ClientType getClientType();
}
