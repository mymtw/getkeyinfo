package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.datatransport.runtime.l */
public final class C6549l implements C6539b<Executor> {

    /* renamed from: com.google.android.datatransport.runtime.l$a */
    public static final class C6550a {

        /* renamed from: a */
        public static final C6549l f14484a = new C6549l();
    }

    public final Object get() {
        return new C6552n(Executors.newSingleThreadExecutor());
    }
}
