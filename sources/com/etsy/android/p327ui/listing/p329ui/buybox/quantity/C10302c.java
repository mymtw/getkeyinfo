package com.etsy.android.p327ui.listing.p329ui.buybox.quantity;

import android.view.View;
import android.widget.AdapterView;
import kotlin.jvm.internal.C19383o;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.quantity.c */
public final /* synthetic */ class C10302c implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C10303d f22613b;

    public /* synthetic */ C10302c(C10303d dVar) {
        this.f22613b = dVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C10303d dVar = this.f22613b;
        C19383o.m32797g(dVar, "this$0");
        dVar.f22614b.mo38043a(new C13597g.C13755w2(i + 1));
    }
}
