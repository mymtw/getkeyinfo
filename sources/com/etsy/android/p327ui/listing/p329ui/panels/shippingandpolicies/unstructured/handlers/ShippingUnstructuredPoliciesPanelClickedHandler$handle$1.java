package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.C10664w;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.unstructured.handlers.ShippingUnstructuredPoliciesPanelClickedHandler$handle$1 */
public final class ShippingUnstructuredPoliciesPanelClickedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13749v3 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingUnstructuredPoliciesPanelClickedHandler$handle$1(C13597g.C13749v3 v3Var) {
        super(1);
        this.$event = v3Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13749v3 v3Var = this.$event;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final C13597g.C13749v3 v3Var = v3Var;
                rVar.mo34254d(new C19857l<C10664w, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10664w) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10664w wVar) {
                        C19383o.m32797g(wVar, "$this$shippingUnstructuredPoliciesPanel");
                        wVar.f23463a = v3Var.f30277a;
                    }
                });
            }
        });
    }
}
