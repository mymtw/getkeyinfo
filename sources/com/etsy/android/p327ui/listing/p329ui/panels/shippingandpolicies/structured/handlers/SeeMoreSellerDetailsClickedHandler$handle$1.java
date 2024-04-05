package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10194a;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.handlers.SeeMoreSellerDetailsClickedHandler$handle$1 */
public final class SeeMoreSellerDetailsClickedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13693n3 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeeMoreSellerDetailsClickedHandler$handle$1(C13597g.C13693n3 n3Var) {
        super(1);
        this.$event = n3Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13693n3 n3Var = this.$event;
        gVar.mo33961a(new C19857l<C10194a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10194a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10194a aVar) {
                C19383o.m32797g(aVar, "$this$bottomSheetContent");
                C13597g.C13693n3 n3Var = n3Var;
                aVar.f22367a = n3Var.f30197a;
                aVar.f22369c = n3Var.f30198b;
            }
        });
    }
}
