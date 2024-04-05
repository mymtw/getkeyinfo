package com.paypal.pyplcheckout.addressbook.view.fragments;

import androidx.lifecycle.C2843a0;
import com.paypal.pyplcheckout.addressbook.AddressReviewState;
import com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalTopBannerView;
import com.paypal.pyplcheckout.navigation.interfaces.Identifiable;

/* renamed from: com.paypal.pyplcheckout.addressbook.view.fragments.e */
public final /* synthetic */ class C17187e implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f37693b;

    /* renamed from: c */
    public final /* synthetic */ Identifiable f37694c;

    public /* synthetic */ C17187e(Identifiable identifiable, int i) {
        this.f37693b = i;
        this.f37694c = identifiable;
    }

    public final void onChanged(Object obj) {
        switch (this.f37693b) {
            case 0:
                PYPLNewShippingAddressReviewFragment.m35193addressReviewStateObserver$lambda0((PYPLNewShippingAddressReviewFragment) this.f37694c, (AddressReviewState) obj);
                return;
            case 1:
                PayPalBillingAgreementsToggle.m35233listenForThreeDs$lambda3((PayPalBillingAgreementsToggle) this.f37694c, (ContingencyEventsModel) obj);
                return;
            case 2:
                PayPalPoliciesAndRightsLinkView.m35347initViewModelObservers$lambda2((PayPalPoliciesAndRightsLinkView) this.f37694c, (Boolean) obj);
                return;
            case 3:
                PayPalSnappingRecyclerView.m35355contingencyEventsObserver$lambda4((PayPalSnappingRecyclerView) this.f37694c, (ContingencyEventsModel) obj);
                return;
            default:
                PayPalTopBannerView.m35375initViewModelObservers$lambda4((PayPalTopBannerView) this.f37694c, (Boolean) obj);
                return;
        }
    }
}
