package com.etsy.android.util;

import androidx.lifecycle.C2895z;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.util.q */
public final class C12060q {
    public /* synthetic */ C12060q() {
        throw null;
    }

    /* renamed from: a */
    public static final void m19870a(C2895z zVar, Object obj) {
        C19383o.m32797g(zVar, "<this>");
        zVar.postValue(new C12059p(obj));
    }

    /* renamed from: b */
    public static final void m19871b(C2895z zVar, Object obj) {
        C19383o.m32797g(zVar, "<this>");
        zVar.setValue(new C12059p(obj));
    }

    /* renamed from: c */
    public static ExecutorService m19872c(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
