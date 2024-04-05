package com.google.common.util.concurrent;

import androidx.preference.C3039b;
import com.google.common.base.C15794l;
import com.google.common.cache.LocalCache;
import com.google.common.util.concurrent.C16372b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.h */
public final class C16381h extends C3039b {
    @CanIgnoreReturnValue
    /* renamed from: u0 */
    public static Object m26507u0(C16388l lVar) throws ExecutionException {
        C15794l.m25622p(lVar, "Future was expected to be done: %s", lVar.isDone());
        return C16397t.m26516a(lVar);
    }

    /* renamed from: v0 */
    public static C16372b.C16373a m26508v0(C16388l lVar, LocalCache.C15843k.C15844a aVar, Executor executor) {
        int i = C16372b.f36486k;
        C16372b.C16373a aVar2 = new C16372b.C16373a(lVar, aVar);
        executor.getClass();
        if (executor != DirectExecutor.INSTANCE) {
            executor = new C16390n(executor, aVar2);
        }
        lVar.mo7981e(aVar2, executor);
        return aVar2;
    }
}
