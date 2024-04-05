package com.paypal.pyplcheckout.addressbook.viewmodel;

import com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AddressReviewViewModel_Factory implements C17555d<AddressReviewViewModel> {
    private final C19011a<ValidateAndAddAddressUseCase> validateAndAddAddressProvider;

    public AddressReviewViewModel_Factory(C19011a<ValidateAndAddAddressUseCase> aVar) {
        this.validateAndAddAddressProvider = aVar;
    }

    public static AddressReviewViewModel_Factory create(C19011a<ValidateAndAddAddressUseCase> aVar) {
        return new AddressReviewViewModel_Factory(aVar);
    }

    public static AddressReviewViewModel newInstance(ValidateAndAddAddressUseCase validateAndAddAddressUseCase) {
        return new AddressReviewViewModel(validateAndAddAddressUseCase);
    }

    public AddressReviewViewModel get() {
        return newInstance(this.validateAndAddAddressProvider.get());
    }
}
