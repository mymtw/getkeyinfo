package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e */
public final class C6585e implements C6539b<String> {

    /* renamed from: a */
    public final C19011a<Context> f14547a;

    public C6585e(C19011a<Context> aVar) {
        this.f14547a = aVar;
    }

    public final Object get() {
        String packageName = this.f14547a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
