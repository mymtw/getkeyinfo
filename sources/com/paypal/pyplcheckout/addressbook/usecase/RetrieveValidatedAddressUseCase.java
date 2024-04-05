package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import com.paypal.pyplcheckout.pojo.AddressValidation;
import kotlin.jvm.internal.C19383o;

public final class RetrieveValidatedAddressUseCase {
    private final AddressRepository addressRepository;

    public RetrieveValidatedAddressUseCase(AddressRepository addressRepository2) {
        C19383o.m32797g(addressRepository2, "addressRepository");
        this.addressRepository = addressRepository2;
    }

    public final AddressValidation invoke() {
        return this.addressRepository.getAddressValidation();
    }
}
