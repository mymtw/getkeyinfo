package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.View;
import com.etsy.android.p327ui.shop.viewholder.C11259a0;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.r */
public final /* synthetic */ class C11078r implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f24543b;

    /* renamed from: c */
    public final /* synthetic */ Object f24544c;

    /* renamed from: d */
    public final /* synthetic */ Object f24545d;

    public /* synthetic */ C11078r(int i, Object obj, Object obj2) {
        this.f24543b = i;
        this.f24544c = obj;
        this.f24545d = obj2;
    }

    public final void onClick(View view) {
        boolean z;
        switch (this.f24543b) {
            case 0:
                C11051f fVar = (C11051f) this.f24544c;
                C11079s sVar = (C11079s) this.f24545d;
                C19383o.m32797g(sVar, "this$0");
                if (fVar != null) {
                    fVar.mo36649a(sVar.getAdapterPosition());
                    return;
                }
                return;
            default:
                C11259a0 a0Var = (C11259a0) this.f24544c;
                C13171a aVar = (C13171a) this.f24545d;
                int i = C11259a0.f24860i;
                C19383o.m32797g(a0Var, "this$0");
                C19383o.m32797g(aVar, "$clickHandler");
                if (a0Var.f24866h) {
                    z = false;
                } else {
                    if (a0Var.f24864f.isPopupShowing()) {
                        aVar.mo31328c(C11259a0.C11260a.C11263c.f24869a);
                    }
                    z = true;
                }
                a0Var.f24866h = z;
                return;
        }
    }
}
