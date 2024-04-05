package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.utils.DialogMaker;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;

/* renamed from: com.paypal.pyplcheckout.home.view.customviews.h */
public final /* synthetic */ class C17244h implements DialogMaker.PositiveClickListener {

    /* renamed from: b */
    public final /* synthetic */ PEnums.TransitionName f37762b;

    /* renamed from: c */
    public final /* synthetic */ PayPalContinueButton f37763c;

    /* renamed from: d */
    public final /* synthetic */ PYPLCheckoutUtils.FallbackScenario f37764d;

    public /* synthetic */ C17244h(PEnums.TransitionName transitionName, PayPalContinueButton payPalContinueButton, PYPLCheckoutUtils.FallbackScenario fallbackScenario) {
        this.f37762b = transitionName;
        this.f37763c = payPalContinueButton;
        this.f37764d = fallbackScenario;
    }

    public final void onPositiveClick(DialogMaker dialogMaker) {
        PayPalContinueButton.m35299showOfferDialog$lambda7(this.f37762b, this.f37763c, this.f37764d, dialogMaker);
    }
}
