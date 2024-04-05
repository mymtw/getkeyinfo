package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import androidx.compose.p015ui.input.pointer.C1634f;
import com.google.android.gms.measurement.internal.C14944c5;

/* renamed from: com.google.android.play.core.assetpacks.w */
public final /* synthetic */ class C15666w implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C15674y f35381b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f35382c;

    /* renamed from: d */
    public final /* synthetic */ AssetPackState f35383d;

    public /* synthetic */ C15666w(C15674y yVar, Bundle bundle, C15603g0 g0Var) {
        this.f35381b = yVar;
        this.f35382c = bundle;
        this.f35383d = g0Var;
    }

    public final void run() {
        C15674y yVar = this.f35381b;
        Bundle bundle = this.f35382c;
        AssetPackState assetPackState = this.f35383d;
        C15608h1 h1Var = yVar.f35409g;
        h1Var.getClass();
        if (((Boolean) h1Var.mo55412d(new C1634f(5, h1Var, bundle))).booleanValue()) {
            yVar.f35417o.post(new C14944c5((Object) yVar, (Object) assetPackState, 2));
            ((C15677y2) yVar.f35411i.zza()).zzf();
        }
    }
}
