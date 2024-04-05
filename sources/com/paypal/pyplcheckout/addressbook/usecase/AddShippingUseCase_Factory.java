package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AddShippingUseCase_Factory implements C17555d<AddShippingUseCase> {
    private final C19011a<AddressRepository> addressRepositoryProvider;

    public AddShippingUseCase_Factory(C19011a<AddressRepository> aVar) {
        this.addressRepositoryProvider = aVar;
    }

    public static AddShippingUseCase_Factory create(C19011a<AddressRepository> aVar) {
        return new AddShippingUseCase_Factory(aVar);
    }

    public static AddShippingUseCase newInstance(AddressRepository addressRepository) {
        return new AddShippingUseCase(addressRepository);
    }

    public AddShippingUseCase get() {
        return newInstance(this.addressRepositoryProvider.get());
    }
}
