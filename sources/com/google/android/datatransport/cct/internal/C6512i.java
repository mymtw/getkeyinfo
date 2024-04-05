package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.i */
public abstract class C6512i {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.internal.i$a */
    public static abstract class C6513a {
        public abstract C6512i build();

        public abstract C6513a setEventCode(Integer num);

        public abstract C6513a setEventTimeMs(long j);

        public abstract C6513a setEventUptimeMs(long j);

        public abstract C6513a setNetworkConnectionInfo(NetworkConnectionInfo networkConnectionInfo);

        public abstract C6513a setSourceExtension(byte[] bArr);

        public abstract C6513a setSourceExtensionJsonProto3(String str);

        public abstract C6513a setTimezoneOffsetSeconds(long j);
    }

    private static C6513a builder() {
        return new AutoValue_LogEvent.Builder();
    }

    public static C6513a jsonBuilder(String str) {
        return builder().setSourceExtensionJsonProto3(str);
    }

    public static C6513a protoBuilder(byte[] bArr) {
        return builder().setSourceExtension(bArr);
    }

    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    public abstract NetworkConnectionInfo getNetworkConnectionInfo();

    public abstract byte[] getSourceExtension();

    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
