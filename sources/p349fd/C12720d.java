package p349fd;

import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout;
import com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOption;
import com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckoutPaymentOptionKt;
import com.etsy.android.p327ui.cart.googlepay.GooglePayCheckoutSpec;
import com.etsy.android.p327ui.listing.ListingViewState;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: fd.d */
public final class C12720d {

    /* renamed from: a */
    public final C13573c f28041a;

    public C12720d(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f28041a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo45491a(ListingViewState.C10092d dVar, C13597g.C13628e1 e1Var) {
        List<ListingExpressCheckoutPaymentOption> paymentOptions;
        T t;
        C19383o.m32797g(e1Var, "event");
        if (dVar.f22240h == null) {
            return C13574d.C13575a.f29662a;
        }
        if (e1Var.f30104a != null) {
            ListingExpressCheckout singleListingCheckout = dVar.f22239g.getSingleListingCheckout();
            PaymentOption paymentOption = null;
            if (!(singleListingCheckout == null || (paymentOptions = singleListingCheckout.getPaymentOptions()) == null)) {
                Iterator<T> it = paymentOptions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C19383o.m32792b(((ListingExpressCheckoutPaymentOption) t).getPaymentMethod(), "google_pay")) {
                        break;
                    }
                }
                ListingExpressCheckoutPaymentOption listingExpressCheckoutPaymentOption = (ListingExpressCheckoutPaymentOption) t;
                if (listingExpressCheckoutPaymentOption != null) {
                    paymentOption = ListingExpressCheckoutPaymentOptionKt.toPaymentOption(listingExpressCheckoutPaymentOption);
                }
            }
            if (paymentOption == null) {
                this.f28041a.mo38043a(C13597g.C13614c1.f30087a);
            } else {
                this.f28041a.mo38043a(new C13597g.C13636f2(paymentOption, new GooglePayCheckoutSpec(e1Var.f30104a, dVar.f22240h)));
            }
        }
        return C13574d.C13575a.f29662a;
    }
}
