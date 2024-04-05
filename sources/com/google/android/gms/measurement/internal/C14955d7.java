package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.compose.runtime.C1353o0;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
public final class C14955d7 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f33359b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f33360c;

    /* renamed from: d */
    public final /* synthetic */ C1353o0 f33361d;

    public C14955d7(C1353o0 o0Var, String str, Bundle bundle) {
        this.f33361d = o0Var;
        this.f33359b = str;
        this.f33360c = bundle;
    }

    public final void run() {
        ((C14973f7) this.f33361d.f2952b).mo52024j((zzat) Preconditions.checkNotNull(((C14973f7) this.f33361d.f2952b).mo52013Q().mo52217m0(this.f33359b, "_err", this.f33360c, "auto", ((C14973f7) this.f33361d.f2952b).mo52017c().currentTimeMillis(), false)), this.f33359b);
    }
}
