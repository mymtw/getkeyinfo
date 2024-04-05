package com.paypal.pyplcheckout.addressvalidation;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;

public final class ValidateAddressUseCase {
    private final AddressRepository addressRepository;

    public ValidateAddressUseCase(AddressRepository addressRepository2) {
        C19383o.m32797g(addressRepository2, "addressRepository");
        this.addressRepository = addressRepository2;
    }

    public final Object invoke(PortableShippingAddressRequest portableShippingAddressRequest, C19340c<? super AddressRepository.ValidateResult> cVar) {
        return this.addressRepository.validateAddress(portableShippingAddressRequest, cVar);
    }
}
