package com.etsy.android.lib.logger.perf;

import com.etsy.android.lib.util.C8890e0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.logger.perf.d */
public final class C8707d {

    /* renamed from: a */
    public final C8890e0 f19127a;

    /* renamed from: b */
    public long f19128b = -1;

    /* renamed from: c */
    public long f19129c = -1;

    public C8707d(C8890e0 e0Var) {
        C19383o.m32797g(e0Var, "time");
        this.f19127a = e0Var;
    }

    /* renamed from: a */
    public final void mo21377a() {
        boolean z = true;
        if (this.f19128b != -1) {
            if (this.f19129c == -1) {
                z = false;
            }
            if (!z) {
                this.f19127a.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f19128b;
                if (currentTimeMillis >= j) {
                    this.f19129c = currentTimeMillis - j;
                }
            }
        }
    }
}
