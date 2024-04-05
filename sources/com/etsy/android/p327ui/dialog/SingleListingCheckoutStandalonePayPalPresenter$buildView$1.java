package com.etsy.android.p327ui.dialog;

import android.view.View;
import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.googlepay.GooglePayCheckoutSpec;
import com.etsy.android.p327ui.core.listingnomapper.SingleListingCheckoutNavigationSpec;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SingleListingCheckoutKey;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import kotlin.C19394m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.dialog.SingleListingCheckoutStandalonePayPalPresenter$buildView$1 */
final class SingleListingCheckoutStandalonePayPalPresenter$buildView$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9727c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleListingCheckoutStandalonePayPalPresenter$buildView$1(C9727c cVar) {
        super(1);
        this.this$0 = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9727c cVar = this.this$0;
        String string = cVar.f21529b.getString(ResponseConstants.QUANTITY);
        if (string == null) {
            string = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        String str = string;
        String string2 = cVar.f21529b.getString(ResponseConstants.OFFERING_ID);
        String string3 = cVar.f21529b.getString(ResponseConstants.PERSONALIZATION);
        PaymentOption paymentOption = cVar.f21532e.getPaymentOptions().get(0);
        String string4 = cVar.f21529b.getString("listing_variation");
        C19846a<C19394m> aVar = cVar.f21530c;
        if (aVar != null) {
            aVar.invoke();
        }
        C12788a.m20424c(cVar.f21528a.getActivity(), new SingleListingCheckoutKey(C19421p.m32935c0(cVar.f21528a.getActivity()), new SingleListingCheckoutNavigationSpec(cVar.f21531d, str, paymentOption, string2, string3, string4), (GooglePayCheckoutSpec) null, 4, (DefaultConstructorMarker) null));
    }
}
