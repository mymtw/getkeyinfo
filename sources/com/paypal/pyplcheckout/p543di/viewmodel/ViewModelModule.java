package com.paypal.pyplcheckout.p543di.viewmodel;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.addressbook.view.AddressRecommendationViewModel;
import com.paypal.pyplcheckout.addressbook.viewmodel.AddressReviewViewModel;
import com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
import com.paypal.pyplcheckout.crypto.viewmodel.CryptoViewModel;
import com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceViewModel;
import com.paypal.pyplcheckout.home.viewmodel.CartViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.viewmodels.CancelViewModel;

/* renamed from: com.paypal.pyplcheckout.di.viewmodel.ViewModelModule */
public abstract class ViewModelModule {
    public abstract C2870k0.C2872b bindViewModelFactory(CustomViewModelFactory customViewModelFactory);

    @ViewModelKey(AddCardViewModel.class)
    public abstract C2866i0 provideAddCardViewModel(AddCardViewModel addCardViewModel);

    @ViewModelKey(AddressAutoCompleteViewModel.class)
    public abstract C2866i0 provideAddressAutoCompleteViewModel(AddressAutoCompleteViewModel addressAutoCompleteViewModel);

    @ViewModelKey(AddressRecommendationViewModel.class)
    public abstract C2866i0 provideAddressRecommendationViewModel(AddressRecommendationViewModel addressRecommendationViewModel);

    @ViewModelKey(AddressReviewViewModel.class)
    public abstract C2866i0 provideAddressReviewViewModel(AddressReviewViewModel addressReviewViewModel);

    @ViewModelKey(AvailableBalanceViewModel.class)
    public abstract C2866i0 provideAvailableBalanceViewModel(AvailableBalanceViewModel availableBalanceViewModel);

    @ViewModelKey(BillingAgreementsViewModel.class)
    public abstract C2866i0 provideBillingAgreementsViewModel(BillingAgreementsViewModel billingAgreementsViewModel);

    @ViewModelKey(CancelViewModel.class)
    public abstract C2866i0 provideCancelViewModel(CancelViewModel cancelViewModel);

    @ViewModelKey(CartViewModel.class)
    public abstract C2866i0 provideCartViewModel(CartViewModel cartViewModel);

    @ViewModelKey(CryptoViewModel.class)
    public abstract C2866i0 provideCryptoQuoteViewModel(CryptoViewModel cryptoViewModel);

    @ViewModelKey(FundingOptionsViewModel.class)
    public abstract C2866i0 provideFundingOptionsViewModel(FundingOptionsViewModel fundingOptionsViewModel);

    @ViewModelKey(MainPaysheetViewModel.class)
    public abstract C2866i0 provideMainPaysheetViewModel(MainPaysheetViewModel mainPaysheetViewModel);

    @ViewModelKey(UserViewModel.class)
    public abstract C2866i0 provideUserViewModel(UserViewModel userViewModel);
}
