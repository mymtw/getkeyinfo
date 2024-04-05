package com.etsy.android.feedback;

import androidx.lifecycle.C2843a0;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetFragment;
import com.etsy.android.p327ui.user.help.HelpPhoneNumbersFragment;
import com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalContinueButton;
import com.paypal.pyplcheckout.home.view.customviews.PayPalEnterLoadingSpinner;
import com.paypal.pyplcheckout.home.view.customviews.PayPalHomeBodyContainer;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailablePpBalanceView;
import java.util.List;

/* renamed from: com.etsy.android.feedback.m */
public final /* synthetic */ class C6468m implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f14363b;

    /* renamed from: c */
    public final /* synthetic */ Object f14364c;

    public /* synthetic */ C6468m(Object obj, int i) {
        this.f14363b = i;
        this.f14364c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f14363b) {
            case 0:
                ((ItemReviewsFragment) this.f14364c).handleContactShopVisibilityChanged((Boolean) obj);
                return;
            case 1:
                ApplyCouponBottomSheetFragment.m34924onViewCreated$lambda3((ApplyCouponBottomSheetFragment) this.f14364c, (Boolean) obj);
                return;
            case 2:
                HelpPhoneNumbersFragment.m35061onViewCreated$lambda0((HelpPhoneNumbersFragment) this.f14364c, (List) obj);
                return;
            case 3:
                PayPalConversionRateInfoView.m35243initViewModelObservers$lambda5((PayPalConversionRateInfoView) this.f14364c, (String) obj);
                return;
            case 4:
                AddCardView.m35280initViewModelObservers$lambda9((AddCardView) this.f14364c, (ContingencyEventsModel) obj);
                return;
            case 5:
                PayPalContinueButton.m35296initViewModelObservers$lambda1((PayPalContinueButton) this.f14364c, (Boolean) obj);
                return;
            case 6:
                PayPalEnterLoadingSpinner.m35317initViewModelObservers$lambda1((PayPalEnterLoadingSpinner) this.f14364c, (Boolean) obj);
                return;
            case 7:
                PayPalHomeBodyContainer.m35333attachEventListeners$lambda3((PayPalHomeBodyContainer) this.f14364c, ((Boolean) obj).booleanValue());
                return;
            default:
                AvailablePpBalanceView.m35405initViewModelObservers$lambda2((AvailablePpBalanceView) this.f14364c, (Boolean) obj);
                return;
        }
    }
}
