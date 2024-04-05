package com.etsy.android.p327ui.shop.viewholder;

import android.widget.AutoCompleteTextView;
import com.etsy.android.p327ui.shop.viewholder.C11259a0;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.shop.viewholder.x */
public final /* synthetic */ class C11301x implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C11259a0 f24947a;

    /* renamed from: b */
    public final /* synthetic */ C13171a f24948b;

    public /* synthetic */ C11301x(C11259a0 a0Var, C13171a aVar) {
        this.f24947a = a0Var;
        this.f24948b = aVar;
    }

    public final void onDismiss() {
        C11259a0 a0Var = this.f24947a;
        C13171a aVar = this.f24948b;
        C19383o.m32797g(a0Var, "this$0");
        C19383o.m32797g(aVar, "$clickHandler");
        if (!a0Var.f24865g) {
            aVar.mo31328c(C11259a0.C11260a.C11262b.f24868a);
        }
        a0Var.f24865g = false;
    }
}
