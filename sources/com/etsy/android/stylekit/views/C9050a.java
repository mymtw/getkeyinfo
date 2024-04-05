package com.etsy.android.stylekit.views;

import android.view.View;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneFragment;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressRecommendationFragment;

/* renamed from: com.etsy.android.stylekit.views.a */
public final /* synthetic */ class C9050a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19920b;

    /* renamed from: c */
    public final /* synthetic */ Object f19921c;

    public /* synthetic */ C9050a(Object obj, int i) {
        this.f19920b = i;
        this.f19921c = obj;
    }

    public final void onClick(View view) {
        switch (this.f19920b) {
            case 0:
                CollageAccessibilityGroup.m34879setDelegateClickAndAccessibilityActions$lambda15$lambda11((View) this.f19921c, view);
                return;
            case 1:
                CollageSelectDropdown.m34897setSmall$lambda1((CollageSelectDropdown) this.f19921c, view);
                return;
            case 2:
                OtpPhoneFragment.m35137onViewCreated$lambda7((OtpPhoneFragment) this.f19921c, view);
                return;
            default:
                PYPLAddressRecommendationFragment.m35188initCardViews$lambda8((PYPLAddressRecommendationFragment) this.f19921c, view);
                return;
        }
    }
}
