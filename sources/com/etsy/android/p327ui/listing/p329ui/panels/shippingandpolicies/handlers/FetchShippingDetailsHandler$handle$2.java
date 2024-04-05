package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import com.etsy.android.lib.models.apiv3.ListingShippingDetails;
import com.etsy.android.lib.models.apiv3.listing.EstimatedDeliveryDateNudge;
import com.etsy.android.p327ui.core.C9697m;
import com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery.C10253a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.FetchShippingDetailsHandler$handle$2 */
final class FetchShippingDetailsHandler$handle$2 extends Lambda implements C19857l<C9697m, C19394m> {
    public final /* synthetic */ String $countryIso;
    public final /* synthetic */ String $postalCode;
    public final /* synthetic */ C10575b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchShippingDetailsHandler$handle$2(C10575b bVar, String str, String str2) {
        super(1);
        this.this$0 = bVar;
        this.$countryIso = str;
        this.$postalCode = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9697m) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9697m mVar) {
        if (mVar instanceof C9697m.C9699b) {
            C9697m.C9699b bVar = (C9697m.C9699b) mVar;
            ListingShippingDetails listingShippingDetails = bVar.f21475a;
            C10253a aVar = null;
            EstimatedDeliveryDateNudge estimatedDeliveryDateNudge = listingShippingDetails != null ? listingShippingDetails.getEstimatedDeliveryDateNudge() : null;
            if (estimatedDeliveryDateNudge != null && C18263b.m30839d0(estimatedDeliveryDateNudge.getFullDisplayText())) {
                String fullDisplayText = estimatedDeliveryDateNudge.getFullDisplayText();
                C19383o.m32794d(fullDisplayText);
                String underlinedText = estimatedDeliveryDateNudge.getUnderlinedText();
                String str = "";
                if (underlinedText == null) {
                    underlinedText = str;
                }
                String disclaimer = estimatedDeliveryDateNudge.getDisclaimer();
                if (disclaimer != null) {
                    str = disclaimer;
                }
                aVar = new C10253a(fullDisplayText, underlinedText, str);
            }
            if (aVar != null) {
                this.this$0.f23179a.mo38043a(new C13597g.C13620d0(aVar));
            }
            this.this$0.f23179a.mo38043a(new C13597g.C13735t3(bVar.f21475a));
            this.this$0.f23179a.mo38043a(new C13597g.C13651h3(this.$countryIso, this.$postalCode));
            return;
        }
        this.this$0.f23179a.mo38043a(C13597g.C13753w0.f30281a);
    }
}
