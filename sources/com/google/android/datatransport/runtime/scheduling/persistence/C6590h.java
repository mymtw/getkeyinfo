package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.h */
public abstract class C6590h {
    public static C6590h create(long j, C6556p pVar, C6547k kVar) {
        return new AutoValue_PersistedEvent(j, pVar, kVar);
    }

    public abstract C6547k getEvent();

    public abstract long getId();

    public abstract C6556p getTransportContext();
}
