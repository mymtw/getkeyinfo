package com.paypal.pyplcheckout.domain.usecase.address;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class GetLocaleMetadataUseCase_Factory implements C17555d<GetLocaleMetadataUseCase> {
    private final C19011a<AddressRepository> addressRepositoryProvider;

    public GetLocaleMetadataUseCase_Factory(C19011a<AddressRepository> aVar) {
        this.addressRepositoryProvider = aVar;
    }

    public static GetLocaleMetadataUseCase_Factory create(C19011a<AddressRepository> aVar) {
        return new GetLocaleMetadataUseCase_Factory(aVar);
    }

    public static GetLocaleMetadataUseCase newInstance(AddressRepository addressRepository) {
        return new GetLocaleMetadataUseCase(addressRepository);
    }

    public GetLocaleMetadataUseCase get() {
        return newInstance(this.addressRepositoryProvider.get());
    }
}
