package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.backends.AutoValue_BackendRequest;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.c */
public abstract class C6527c {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.backends.c$a */
    public static abstract class C6528a {
        public abstract C6527c build();

        public abstract C6528a setEvents(Iterable<C6547k> iterable);

        public abstract C6528a setExtras(byte[] bArr);
    }

    public static C6528a builder() {
        return new AutoValue_BackendRequest.Builder();
    }

    public static C6527c create(Iterable<C6547k> iterable) {
        return builder().setEvents(iterable).build();
    }

    public abstract Iterable<C6547k> getEvents();

    public abstract byte[] getExtras();
}
