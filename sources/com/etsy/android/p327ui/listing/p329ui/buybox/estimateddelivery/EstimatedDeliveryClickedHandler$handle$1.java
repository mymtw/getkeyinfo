package com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery;

import com.etsy.android.R;
import com.etsy.android.p327ui.listing.p329ui.C10194a;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.estimateddelivery.EstimatedDeliveryClickedHandler$handle$1 */
public final class EstimatedDeliveryClickedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ CharSequence $bodyText;
    public final /* synthetic */ EstimatedDeliveryClickedHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EstimatedDeliveryClickedHandler$handle$1(EstimatedDeliveryClickedHandler estimatedDeliveryClickedHandler, CharSequence charSequence) {
        super(1);
        this.this$0 = estimatedDeliveryClickedHandler;
        this.$bodyText = charSequence;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final EstimatedDeliveryClickedHandler estimatedDeliveryClickedHandler = this.this$0;
        final CharSequence charSequence = this.$bodyText;
        gVar.mo33961a(new C19857l<C10194a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10194a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10194a aVar) {
                C19383o.m32797g(aVar, "$this$bottomSheetContent");
                aVar.f22367a = estimatedDeliveryClickedHandler.f22534a.mo38059c(R.string.estimated_delivery_date_legalese_title, new Object[0]);
                aVar.f22369c = charSequence;
            }
        });
    }
}
