package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.p */
public abstract class C6556p {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.p$a */
    public static abstract class C6557a {
        public abstract C6556p build();

        public abstract C6557a setBackendName(String str);

        public abstract C6557a setExtras(byte[] bArr);

        public abstract C6557a setPriority(Priority priority);
    }

    public static C6557a builder() {
        return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
    }

    public abstract String getBackendName();

    public abstract byte[] getExtras();

    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = getBackendName();
        objArr[1] = getPriority();
        objArr[2] = getExtras() == null ? "" : Base64.encodeToString(getExtras(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public C6556p withPriority(Priority priority) {
        return builder().setBackendName(getBackendName()).setPriority(priority).setExtras(getExtras()).build();
    }
}
