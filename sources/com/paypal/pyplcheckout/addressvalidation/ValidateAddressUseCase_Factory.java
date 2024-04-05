package com.paypal.pyplcheckout.addressvalidation;

import dagger.internal.C17555d;
import p740eq.C19011a;

public final class ValidateAddressUseCase_Factory implements C17555d<ValidateAddressUseCase> {
    private final C19011a<AddressRepository> addressRepositoryProvider;

    public ValidateAddressUseCase_Factory(C19011a<AddressRepository> aVar) {
        this.addressRepositoryProvider = aVar;
    }

    public static ValidateAddressUseCase_Factory create(C19011a<AddressRepository> aVar) {
        return new ValidateAddressUseCase_Factory(aVar);
    }

    public static ValidateAddressUseCase newInstance(AddressRepository addressRepository) {
        return new ValidateAddressUseCase(addressRepository);
    }

    public ValidateAddressUseCase get() {
        return newInstance(this.addressRepositoryProvider.get());
    }
}
