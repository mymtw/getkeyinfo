package com.etsy.android.feedback;

import androidx.lifecycle.C2843a0;
import com.etsy.android.R;
import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11409f;
import com.etsy.android.p327ui.user.addresses.C11414g;
import com.paypal.pyplcheckout.conversionrate.view.customviews.PayPalConversionRateInfoView;
import com.paypal.pyplcheckout.home.view.customviews.AddCardView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalContinueButton;
import com.paypal.pyplcheckout.home.view.customviews.PayPalEnterLoadingSpinner;
import com.paypal.pyplcheckout.home.view.customviews.PayPalHomeBodyContainer;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailablePpBalanceView;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.feedback.l */
public final /* synthetic */ class C6467l implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ int f14361b;

    /* renamed from: c */
    public final /* synthetic */ Object f14362c;

    public /* synthetic */ C6467l(Object obj, int i) {
        this.f14361b = i;
        this.f14362c = obj;
    }

    public final void onChanged(Object obj) {
        switch (this.f14361b) {
            case 0:
                ((ItemReviewsFragment) this.f14362c).handleSortFilterEvent((FeedbackViewModel.C6448c) obj);
                return;
            case 1:
                C11409f fVar = (C11409f) this.f14362c;
                AddressDetailViewModel.C11361a aVar = (AddressDetailViewModel.C11361a) obj;
                C19383o.m32797g(fVar, "this$0");
                if (C19383o.m32792b(aVar, AddressDetailViewModel.C11361a.C11367f.f25065a)) {
                    C11414g gVar = fVar.f25146a;
                    if (gVar != null) {
                        gVar.showAddressLoadingView();
                        return;
                    }
                    return;
                } else if (aVar instanceof AddressDetailViewModel.C11361a.C11370i) {
                    C11414g gVar2 = fVar.f25146a;
                    if (gVar2 != null) {
                        gVar2.showAddressDetails(((AddressDetailViewModel.C11361a.C11370i) aVar).f25068a);
                        return;
                    }
                    return;
                } else if (aVar instanceof AddressDetailViewModel.C11361a.C11366e) {
                    C11414g gVar3 = fVar.f25146a;
                    if (gVar3 != null) {
                        gVar3.showAddressDetailError();
                        return;
                    }
                    return;
                } else if (C19383o.m32792b(aVar, AddressDetailViewModel.C11361a.C11363b.f25062a)) {
                    C11414g gVar4 = fVar.f25146a;
                    if (gVar4 != null) {
                        gVar4.showSuccessPopup(R.string.address_delete_toast_success);
                    }
                    C8672b bVar = fVar.f25148c;
                    if (bVar != null) {
                        bVar.mo21333d("existing_address_deleted", (Map<? extends AnalyticsProperty, Object>) null);
                        return;
                    }
                    return;
                } else if (C19383o.m32792b(aVar, AddressDetailViewModel.C11361a.C11362a.f25061a)) {
                    C11414g gVar5 = fVar.f25146a;
                    if (gVar5 != null) {
                        gVar5.showFailurePopup(R.string.address_delete_toast_error);
                    }
                    C11414g gVar6 = fVar.f25146a;
                    if (gVar6 != null) {
                        gVar6.showAddressDetails((List<? extends C11396e>) null);
                        return;
                    }
                    return;
                } else if (aVar instanceof AddressDetailViewModel.C11361a.C11371j) {
                    C11414g gVar7 = fVar.f25146a;
                    if (gVar7 != null) {
                        gVar7.updateAddressDetails(((AddressDetailViewModel.C11361a.C11371j) aVar).f25069a);
                        return;
                    }
                    return;
                } else if (aVar instanceof AddressDetailViewModel.C11361a.C11369h) {
                    C11414g gVar8 = fVar.f25146a;
                    if (gVar8 != null) {
                        gVar8.showSuccessPopup(R.string.new_address_saved_success);
                    }
                    fVar.mo37270b(((AddressDetailViewModel.C11361a.C11369h) aVar).f25067a);
                    return;
                } else if (aVar instanceof AddressDetailViewModel.C11361a.C11368g) {
                    C11414g gVar9 = fVar.f25146a;
                    if (gVar9 != null) {
                        gVar9.showFailurePopup(R.string.new_address_saved_failure);
                    }
                    C11414g gVar10 = fVar.f25146a;
                    if (gVar10 != null) {
                        gVar10.showAddressDetails((List<? extends C11396e>) null);
                        return;
                    }
                    return;
                } else if (aVar instanceof AddressDetailViewModel.C11361a.C11365d) {
                    C11414g gVar11 = fVar.f25146a;
                    if (gVar11 != null) {
                        gVar11.showSuccessPopup(R.string.edit_address_success);
                    }
                    fVar.mo37270b(((AddressDetailViewModel.C11361a.C11365d) aVar).f25064a);
                    return;
                } else if (C19383o.m32792b(aVar, AddressDetailViewModel.C11361a.C11364c.f25063a)) {
                    C11414g gVar12 = fVar.f25146a;
                    if (gVar12 != null) {
                        gVar12.showFailurePopup(R.string.edit_address_failure);
                    }
                    C11414g gVar13 = fVar.f25146a;
                    if (gVar13 != null) {
                        gVar13.showAddressDetails((List<? extends C11396e>) null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                PayPalConversionRateInfoView.m35242initViewModelObservers$lambda4((PayPalConversionRateInfoView) this.f14362c, (String) obj);
                return;
            case 3:
                AddCardView.m35279initViewModelObservers$lambda7((AddCardView) this.f14362c, (Boolean) obj);
                return;
            case 4:
                PayPalContinueButton.m35295initViewModelObservers$lambda0((PayPalContinueButton) this.f14362c, (Boolean) obj);
                return;
            case 5:
                PayPalEnterLoadingSpinner.m35316initViewModelObservers$lambda0((PayPalEnterLoadingSpinner) this.f14362c, (PayPalEnterLoadingSpinner.LoadingTextPhases) obj);
                return;
            case 6:
                PayPalHomeBodyContainer.m35332attachEventListeners$lambda2((PayPalHomeBodyContainer) this.f14362c, ((Boolean) obj).booleanValue());
                return;
            default:
                AvailablePpBalanceView.m35404initViewModelObservers$lambda1((AvailablePpBalanceView) this.f14362c, ((Boolean) obj).booleanValue());
                return;
        }
    }
}
