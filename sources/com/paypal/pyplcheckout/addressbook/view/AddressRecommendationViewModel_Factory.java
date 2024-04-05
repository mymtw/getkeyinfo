package com.paypal.pyplcheckout.addressbook.view;

import com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase;
import com.paypal.pyplcheckout.addressbook.usecase.RetrieveInputAddressUseCase;
import com.paypal.pyplcheckout.addressbook.usecase.RetrieveValidatedAddressUseCase;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AddressRecommendationViewModel_Factory implements C17555d<AddressRecommendationViewModel> {
    private final C19011a<AddShippingUseCase> addShippingUseCaseProvider;
    private final C19011a<RetrieveInputAddressUseCase> retrieveInputAddressUseCaseProvider;
    private final C19011a<RetrieveValidatedAddressUseCase> retrieveValidatedAddressUseCaseProvider;

    public AddressRecommendationViewModel_Factory(C19011a<RetrieveInputAddressUseCase> aVar, C19011a<RetrieveValidatedAddressUseCase> aVar2, C19011a<AddShippingUseCase> aVar3) {
        this.retrieveInputAddressUseCaseProvider = aVar;
        this.retrieveValidatedAddressUseCaseProvider = aVar2;
        this.addShippingUseCaseProvider = aVar3;
    }

    public static AddressRecommendationViewModel_Factory create(C19011a<RetrieveInputAddressUseCase> aVar, C19011a<RetrieveValidatedAddressUseCase> aVar2, C19011a<AddShippingUseCase> aVar3) {
        return new AddressRecommendationViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static AddressRecommendationViewModel newInstance(RetrieveInputAddressUseCase retrieveInputAddressUseCase, RetrieveValidatedAddressUseCase retrieveValidatedAddressUseCase, AddShippingUseCase addShippingUseCase) {
        return new AddressRecommendationViewModel(retrieveInputAddressUseCase, retrieveValidatedAddressUseCase, addShippingUseCase);
    }

    public AddressRecommendationViewModel get() {
        return newInstance(this.retrieveInputAddressUseCaseProvider.get(), this.retrieveValidatedAddressUseCaseProvider.get(), this.addShippingUseCaseProvider.get());
    }
}
