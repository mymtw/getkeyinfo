package p499zd;

import android.view.KeyEvent;
import android.widget.TextView;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;

/* renamed from: zd.c */
public final /* synthetic */ class C13955c implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ int f30674b;

    /* renamed from: c */
    public final /* synthetic */ Object f30675c;

    public /* synthetic */ C13955c(Object obj, int i) {
        this.f30674b = i;
        this.f30675c = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f30674b) {
            case 0:
                return ThirdPartySignInFragment.m35017onViewCreated$lambda10((ThirdPartySignInFragment) this.f30675c, textView, i, keyEvent);
            case 1:
                return PayPalNewShippingAddressReviewView.m35178setViewsActionListener$lambda14$lambda13((PayPalNewShippingAddressReviewView) this.f30675c, textView, i, keyEvent);
            default:
                return AddCardView.m35281initViews$lambda12((AddCardView) this.f30675c, textView, i, keyEvent);
        }
    }
}
