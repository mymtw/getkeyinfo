package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import android.widget.AdapterView;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.p327ui.shop.viewholder.C11259a0;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.shop.viewholder.y */
public final /* synthetic */ class C11302y implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C13171a f24949b;

    /* renamed from: c */
    public final /* synthetic */ C11259a0 f24950c;

    public /* synthetic */ C11302y(C11259a0 a0Var, C13171a aVar) {
        this.f24949b = aVar;
        this.f24950c = a0Var;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C13171a aVar = this.f24949b;
        C11259a0 a0Var = this.f24950c;
        C19383o.m32797g(aVar, "$clickHandler");
        C19383o.m32797g(a0Var, "this$0");
        aVar.mo31328c(new C11259a0.C11260a.C11261a((ShopSection) a0Var.f24862d.getItem(i)));
        a0Var.f24862d.setSelectedItemPosition(i);
        a0Var.f24865g = true;
    }
}
