package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.p3 */
public final class C15059p3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f33747a;

    /* renamed from: b */
    public final /* synthetic */ C15086s3 f33748b;

    public C15059p3(C15086s3 s3Var, String str) {
        this.f33748b = s3Var;
        Preconditions.checkNotNull(str);
        this.f33747a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        ((C15103u3) this.f33748b.f33681b).mo52016b().f33724g.mo52238b(th, this.f33747a);
    }
}
