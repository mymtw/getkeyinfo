package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers;

import android.text.Spanned;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.handlers.ShippingAndPoliciesPanelClickedHandler$handle$1 */
public final class ShippingAndPoliciesPanelClickedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13728s3 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingAndPoliciesPanelClickedHandler$handle$1(C13597g.C13728s3 s3Var) {
        super(1);
        this.$event = s3Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13728s3 s3Var = this.$event;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                C10590a aVar = rVar.f23319c;
                rVar.f23319c = aVar != null ? C10590a.m18529b(aVar, s3Var.f30248a, (String) null, false, (Spanned) null, (Spanned) null, (C10563f) null, false, false, false, -2) : null;
            }
        });
    }
}
