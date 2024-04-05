package com.etsy.android.p327ui.shop.homesection;

import android.view.View;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p460ue.C13497g;

/* renamed from: com.etsy.android.ui.shop.homesection.m */
public final class C11163m extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C13497g f24680b;

    /* renamed from: c */
    public final /* synthetic */ C11192q0 f24681c;

    /* renamed from: d */
    public final /* synthetic */ C11164n f24682d;

    public C11163m(C11164n nVar, C13497g gVar, C11192q0 q0Var) {
        this.f24682d = nVar;
        this.f24680b = gVar;
        this.f24681c = q0Var;
    }

    public final void onViewClick(View view) {
        this.f24680b.mo46160c().setTranslating();
        this.f24682d.f24683c.configureForState(this.f24680b.mo46160c());
        C11192q0 q0Var = this.f24681c;
        C13497g gVar = this.f24680b;
        C11192q0.C11193a aVar = q0Var.f24741a;
        if (aVar != null) {
            aVar.translatePrivacyOther(gVar);
        }
    }
}
