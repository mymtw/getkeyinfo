package com.etsy.android.p327ui.cart.bottomsheets.applycoupon;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneFragment;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressRecommendationFragment;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.c */
public final /* synthetic */ class C9258c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f20445b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f20446c;

    public /* synthetic */ C9258c(Fragment fragment, int i) {
        this.f20445b = i;
        this.f20446c = fragment;
    }

    public final void onClick(View view) {
        switch (this.f20445b) {
            case 0:
                ApplyCouponBottomSheetFragment.m34923onViewCreated$lambda2((ApplyCouponBottomSheetFragment) this.f20446c, view);
                return;
            case 1:
                OtpPhoneFragment.m35136onViewCreated$lambda6((OtpPhoneFragment) this.f20446c, view);
                return;
            default:
                PYPLAddressRecommendationFragment.m35187initCardViews$lambda6((PYPLAddressRecommendationFragment) this.f20446c, view);
                return;
        }
    }
}
