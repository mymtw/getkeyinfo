package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import com.etsy.android.p327ui.shop.viewholder.C11259a0;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.shop.viewholder.z */
public final /* synthetic */ class C11303z implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C11259a0 f24951b;

    /* renamed from: c */
    public final /* synthetic */ C13171a f24952c;

    public /* synthetic */ C11303z(C11259a0 a0Var, C13171a aVar) {
        this.f24951b = a0Var;
        this.f24952c = aVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C11259a0 a0Var = this.f24951b;
        C13171a aVar = this.f24952c;
        C19383o.m32797g(a0Var, "this$0");
        C19383o.m32797g(aVar, "$clickHandler");
        if (z && a0Var.f24864f.isPopupShowing()) {
            aVar.mo31328c(C11259a0.C11260a.C11263c.f24869a);
        }
    }
}
