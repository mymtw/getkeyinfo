package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.addressvalidation.ValidateAddressUseCase;
import com.paypal.pyplcheckout.p539ab.AbManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class ValidateAndAddAddressUseCase_Factory implements C17555d<ValidateAndAddAddressUseCase> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<AddShippingUseCase> addShippingProvider;
    private final C19011a<ValidateAddressUseCase> validateAddressProvider;

    public ValidateAndAddAddressUseCase_Factory(C19011a<AddShippingUseCase> aVar, C19011a<ValidateAddressUseCase> aVar2, C19011a<AbManager> aVar3) {
        this.addShippingProvider = aVar;
        this.validateAddressProvider = aVar2;
        this.abManagerProvider = aVar3;
    }

    public static ValidateAndAddAddressUseCase_Factory create(C19011a<AddShippingUseCase> aVar, C19011a<ValidateAddressUseCase> aVar2, C19011a<AbManager> aVar3) {
        return new ValidateAndAddAddressUseCase_Factory(aVar, aVar2, aVar3);
    }

    public static ValidateAndAddAddressUseCase newInstance(AddShippingUseCase addShippingUseCase, ValidateAddressUseCase validateAddressUseCase, AbManager abManager) {
        return new ValidateAndAddAddressUseCase(addShippingUseCase, validateAddressUseCase, abManager);
    }

    public ValidateAndAddAddressUseCase get() {
        return newInstance(this.addShippingProvider.get(), this.validateAddressProvider.get(), this.abManagerProvider.get());
    }
}
