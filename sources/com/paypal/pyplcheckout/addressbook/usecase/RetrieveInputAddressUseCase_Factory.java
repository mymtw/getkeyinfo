package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class RetrieveInputAddressUseCase_Factory implements C17555d<RetrieveInputAddressUseCase> {
    private final C19011a<AddressRepository> addressRepositoryProvider;

    public RetrieveInputAddressUseCase_Factory(C19011a<AddressRepository> aVar) {
        this.addressRepositoryProvider = aVar;
    }

    public static RetrieveInputAddressUseCase_Factory create(C19011a<AddressRepository> aVar) {
        return new RetrieveInputAddressUseCase_Factory(aVar);
    }

    public static RetrieveInputAddressUseCase newInstance(AddressRepository addressRepository) {
        return new RetrieveInputAddressUseCase(addressRepository);
    }

    public RetrieveInputAddressUseCase get() {
        return newInstance(this.addressRepositoryProvider.get());
    }
}
