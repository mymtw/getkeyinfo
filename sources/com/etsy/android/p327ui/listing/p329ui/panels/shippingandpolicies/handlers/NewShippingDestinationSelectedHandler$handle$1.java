package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import android.text.Spanned;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.C10615a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.NewShippingDestinationSelectedHandler$handle$1 */
public final class NewShippingDestinationSelectedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13650h2 $event;
    public final /* synthetic */ ListingViewState.C10092d $listing;
    public final /* synthetic */ NewShippingDestinationSelectedHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewShippingDestinationSelectedHandler$handle$1(ListingViewState.C10092d dVar, C13597g.C13650h2 h2Var, NewShippingDestinationSelectedHandler newShippingDestinationSelectedHandler) {
        super(1);
        this.$listing = dVar;
        this.$event = h2Var;
        this.this$0 = newShippingDestinationSelectedHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final ListingViewState.C10092d dVar = this.$listing;
        final C13597g.C13650h2 h2Var = this.$event;
        final NewShippingDestinationSelectedHandler newShippingDestinationSelectedHandler = this.this$0;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C10590a aVar;
                C10625r rVar2 = rVar;
                C19383o.m32797g(rVar2, "$this$panels");
                C13597g.C13746v0 v0Var = new C13597g.C13746v0(dVar.mo33477f(), h2Var.f30137a.getIsoCountryCode(), h2Var.f30138b);
                C10590a aVar2 = rVar2.f23319c;
                C10615a aVar3 = null;
                if (aVar2 != null) {
                    newShippingDestinationSelectedHandler.f23176a.mo38043a(v0Var);
                    aVar = C10590a.m18529b(aVar2, false, (String) null, false, (Spanned) null, (Spanned) null, C10563f.m18515a(aVar2.f23240p, "", true), false, false, false, -32769);
                } else {
                    aVar = null;
                }
                rVar2.f23319c = aVar;
                C10615a aVar4 = rVar2.f23318b;
                if (aVar4 != null) {
                    newShippingDestinationSelectedHandler.f23176a.mo38043a(v0Var);
                    aVar3 = C10615a.m18544b(aVar4, (String) null, (Spanned) null, (Spanned) null, C10563f.m18515a(aVar4.f23299n, "", true), 1040383);
                }
                rVar2.f23318b = aVar3;
            }
        });
    }
}
