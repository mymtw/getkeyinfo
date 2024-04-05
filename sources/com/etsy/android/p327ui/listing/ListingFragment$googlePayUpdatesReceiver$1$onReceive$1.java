package com.etsy.android.p327ui.listing;

import com.google.android.gms.wallet.PaymentData;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ListingFragment$googlePayUpdatesReceiver$1$onReceive$1 */
public final class ListingFragment$googlePayUpdatesReceiver$1$onReceive$1 extends Lambda implements C19857l<PaymentData, C19394m> {
    public final /* synthetic */ ListingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingFragment$googlePayUpdatesReceiver$1$onReceive$1(ListingFragment listingFragment) {
        super(1);
        this.this$0 = listingFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PaymentData) obj);
        return C19394m.f43287a;
    }

    public final void invoke(PaymentData paymentData) {
        this.this$0.getViewModel().mo33464b(new C13597g.C13628e1(paymentData));
    }
}
