package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import kotlin.jvm.internal.C19383o;

public final class AddShippingUseCase {
    private final AddressRepository addressRepository;

    public AddShippingUseCase(AddressRepository addressRepository2) {
        C19383o.m32797g(addressRepository2, "addressRepository");
        this.addressRepository = addressRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest r5, kotlin.coroutines.C19340c<? super com.paypal.pyplcheckout.utils.Result<java.util.List<com.paypal.pyplcheckout.pojo.ShippingAddress>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase$invoke$1 r0 = (com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase$invoke$1 r0 = new com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ Exception -> 0x0027 }
            goto L_0x003f
        L_0x0027:
            r5 = move-exception
            goto L_0x0042
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            com.paypal.pyplcheckout.addressvalidation.AddressRepository r6 = r4.addressRepository     // Catch:{ Exception -> 0x0027 }
            r0.label = r3     // Catch:{ Exception -> 0x0027 }
            java.lang.Object r6 = r6.addShippingAddress(r5, r0)     // Catch:{ Exception -> 0x0027 }
            if (r6 != r1) goto L_0x003f
            return r1
        L_0x003f:
            com.paypal.pyplcheckout.utils.Result r6 = (com.paypal.pyplcheckout.utils.Result) r6     // Catch:{ Exception -> 0x0027 }
            goto L_0x0047
        L_0x0042:
            com.paypal.pyplcheckout.utils.Result$Error r6 = new com.paypal.pyplcheckout.utils.Result$Error
            r6.<init>(r5)
        L_0x0047:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase.invoke(com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest, kotlin.coroutines.c):java.lang.Object");
    }
}
