package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.jvm.internal.C19383o;

public final class RetrieveInputAddressUseCase {
    private final AddressRepository addressRepository;

    public RetrieveInputAddressUseCase(AddressRepository addressRepository2) {
        C19383o.m32797g(addressRepository2, "addressRepository");
        this.addressRepository = addressRepository2;
    }

    public final PortableShippingAddressRequest invoke() {
        return this.addressRepository.getEnteredAddress();
    }
}
