package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.k */
public abstract class C6547k {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.k$a */
    public static abstract class C6548a {
        public final C6548a addMetadata(String str, String str2) {
            getAutoMetadata().put(str, str2);
            return this;
        }

        public abstract C6547k build();

        public abstract Map<String, String> getAutoMetadata();

        public abstract C6548a setAutoMetadata(Map<String, String> map);

        public abstract C6548a setCode(Integer num);

        public abstract C6548a setEncodedPayload(C6546j jVar);

        public abstract C6548a setEventMillis(long j);

        public abstract C6548a setTransportName(String str);

        public abstract C6548a setUptimeMillis(long j);

        public final C6548a addMetadata(String str, long j) {
            getAutoMetadata().put(str, String.valueOf(j));
            return this;
        }

        public final C6548a addMetadata(String str, int i) {
            getAutoMetadata().put(str, String.valueOf(i));
            return this;
        }
    }

    public static C6548a builder() {
        return new AutoValue_EventInternal.Builder().setAutoMetadata(new HashMap());
    }

    public final String get(String str) {
        String str2 = getAutoMetadata().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> getAutoMetadata();

    public abstract Integer getCode();

    public abstract C6546j getEncodedPayload();

    public abstract long getEventMillis();

    public final int getInteger(String str) {
        String str2 = getAutoMetadata().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long getLong(String str) {
        String str2 = getAutoMetadata().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(getAutoMetadata());
    }

    public final String getOrDefault(String str, String str2) {
        String str3 = getAutoMetadata().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    public byte[] getPayload() {
        return getEncodedPayload().f14483b;
    }

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public C6548a toBuilder() {
        return new AutoValue_EventInternal.Builder().setTransportName(getTransportName()).setCode(getCode()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).setAutoMetadata(new HashMap(getAutoMetadata()));
    }
}
