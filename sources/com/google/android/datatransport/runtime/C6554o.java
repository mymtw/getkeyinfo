package com.google.android.datatransport.runtime;

import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.C6494b;
import com.google.android.datatransport.C6495c;
import com.google.android.datatransport.runtime.AutoValue_SendRequest;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.o */
public abstract class C6554o {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.o$a */
    public static abstract class C6555a {
        public abstract C6554o build();

        public abstract C6555a setEncoding(C6493a aVar);

        public abstract C6555a setEvent(C6494b<?> bVar);

        public <T> C6555a setEvent(C6494b<T> bVar, C6493a aVar, C6495c<T, byte[]> cVar) {
            setEvent(bVar);
            setEncoding(aVar);
            setTransformer(cVar);
            return this;
        }

        public abstract C6555a setTransformer(C6495c<?, byte[]> cVar);

        public abstract C6555a setTransportContext(C6556p pVar);

        public abstract C6555a setTransportName(String str);
    }

    public static C6555a builder() {
        return new AutoValue_SendRequest.Builder();
    }

    public abstract C6493a getEncoding();

    public abstract C6494b<?> getEvent();

    public byte[] getPayload() {
        return getTransformer().apply(getEvent().getPayload());
    }

    public abstract C6495c<?, byte[]> getTransformer();

    public abstract C6556p getTransportContext();

    public abstract String getTransportName();
}
