package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import android.text.Spanned;
import com.etsy.android.R;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.C10664w;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.FetchShippingDetailsFailedHandler$handle$1 */
final class FetchShippingDetailsFailedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C10574a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchShippingDetailsFailedHandler$handle$1(C10574a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C10574a aVar = this.this$0;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C10563f fVar;
                C10625r rVar2 = rVar;
                C19383o.m32797g(rVar2, "$this$panels");
                C10590a aVar = rVar2.f23319c;
                if (!(aVar == null || (fVar = aVar.f23240p) == null)) {
                    C10563f a = C10563f.m18515a(fVar, aVar.f23177a.mo38059c(R.string.listing_screen_calculate_shipping_costs_error, new Object[0]), false);
                    C10590a aVar2 = rVar2.f23319c;
                    rVar2.f23319c = aVar2 != null ? C10590a.m18529b(aVar2, false, (String) null, false, (Spanned) null, (Spanned) null, a, false, false, false, -32769) : null;
                }
                final C10574a aVar3 = aVar;
                rVar2.mo34254d(new C19857l<C10664w, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10664w) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10664w wVar) {
                        C19383o.m32797g(wVar, "$this$shippingUnstructuredPoliciesPanel");
                        wVar.f23476n = C10563f.m18515a(wVar.f23476n, aVar3.f23177a.mo38059c(R.string.listing_screen_calculate_shipping_costs_error, new Object[0]), false);
                    }
                });
            }
        });
    }
}
