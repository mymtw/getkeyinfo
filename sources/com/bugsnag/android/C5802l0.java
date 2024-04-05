package com.bugsnag.android;

import android.app.ActivityManager;
import android.os.Process;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.Callable;
import kotlin.Result;

/* renamed from: com.bugsnag.android.l0 */
public final class C5802l0<V> implements Callable<Long> {

    /* renamed from: b */
    public final /* synthetic */ C5773j0 f12410b;

    public C5802l0(C5773j0 j0Var) {
        this.f12410b = j0Var;
    }

    public final Object call() {
        Long l;
        Object obj;
        ActivityManager a0 = C0114h.m296a0(this.f12410b.f12360l);
        Long l2 = null;
        if (a0 != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            a0.getMemoryInfo(memoryInfo);
            l = Long.valueOf(memoryInfo.totalMem);
        } else {
            l = null;
        }
        if (l != null) {
            return l;
        }
        try {
            obj = Result.m35480constructorimpl((Long) Process.class.getDeclaredMethod("getTotalMemory", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
        if (!Result.m35485isFailureimpl(obj)) {
            l2 = obj;
        }
        return l2;
    }
}
