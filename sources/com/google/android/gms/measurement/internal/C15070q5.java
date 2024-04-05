package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.q5 */
public final class C15070q5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Bundle f33778b;

    /* renamed from: c */
    public final /* synthetic */ C15061p5 f33779c;

    /* renamed from: d */
    public final /* synthetic */ C15061p5 f33780d;

    /* renamed from: e */
    public final /* synthetic */ long f33781e;

    /* renamed from: f */
    public final /* synthetic */ C15113v5 f33782f;

    public C15070q5(C15113v5 v5Var, Bundle bundle, C15061p5 p5Var, C15061p5 p5Var2, long j) {
        this.f33782f = v5Var;
        this.f33778b = bundle;
        this.f33779c = p5Var;
        this.f33780d = p5Var2;
        this.f33781e = j;
    }

    public final void run() {
        C15113v5 v5Var = this.f33782f;
        Bundle bundle = this.f33778b;
        C15061p5 p5Var = this.f33779c;
        C15061p5 p5Var2 = this.f33780d;
        long j = this.f33781e;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        v5Var.mo52346l(p5Var, p5Var2, j, true, ((C15103u3) v5Var.f33681b).mo52335w().mo52216l0((String) null, "screen_view", bundle, (List<String>) null, false));
    }
}
