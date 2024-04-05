package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
public final class C15068q3<V> extends FutureTask<V> implements Comparable<C15068q3<V>> {

    /* renamed from: b */
    public final long f33764b;

    /* renamed from: c */
    public final boolean f33765c;

    /* renamed from: d */
    public final String f33766d;

    /* renamed from: e */
    public final /* synthetic */ C15086s3 f33767e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15068q3(C15086s3 s3Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f33767e = s3Var;
        Preconditions.checkNotNull(str);
        long andIncrement = C15086s3.f33826l.getAndIncrement();
        this.f33764b = andIncrement;
        this.f33766d = str;
        this.f33765c = z;
        if (andIncrement == Long.MAX_VALUE) {
            ((C15103u3) s3Var.f33681b).mo52016b().f33724g.mo52237a("Tasks index overflow");
        }
    }

    public final int compareTo(Object obj) {
        C15068q3 q3Var = (C15068q3) obj;
        boolean z = this.f33765c;
        if (z != q3Var.f33765c) {
            return !z ? 1 : -1;
        }
        int i = (this.f33764b > q3Var.f33764b ? 1 : (this.f33764b == q3Var.f33764b ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        ((C15103u3) this.f33767e.f33681b).mo52016b().f33725h.mo52238b(Long.valueOf(this.f33764b), "Two tasks share the same index. index");
        return 0;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        ((C15103u3) this.f33767e.f33681b).mo52016b().f33724g.mo52238b(th, this.f33766d);
        if ((th instanceof zzfo) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15068q3(C15086s3 s3Var, Callable callable, boolean z) {
        super(callable);
        this.f33767e = s3Var;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = C15086s3.f33826l.getAndIncrement();
        this.f33764b = andIncrement;
        this.f33766d = "Task exception on worker thread";
        this.f33765c = z;
        if (andIncrement == Long.MAX_VALUE) {
            ((C15103u3) s3Var.f33681b).mo52016b().f33724g.mo52237a("Tasks index overflow");
        }
    }
}
