package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class RetrieveValidatedAddressUseCase_Factory implements C17555d<RetrieveValidatedAddressUseCase> {
    private final C19011a<AddressRepository> addressRepositoryProvider;

    public RetrieveValidatedAddressUseCase_Factory(C19011a<AddressRepository> aVar) {
        this.addressRepositoryProvider = aVar;
    }

    public static RetrieveValidatedAddressUseCase_Factory create(C19011a<AddressRepository> aVar) {
        return new RetrieveValidatedAddressUseCase_Factory(aVar);
    }

    public static RetrieveValidatedAddressUseCase newInstance(AddressRepository addressRepository) {
        return new RetrieveValidatedAddressUseCase(addressRepository);
    }

    public RetrieveValidatedAddressUseCase get() {
        return newInstance(this.addressRepositoryProvider.get());
    }
}
