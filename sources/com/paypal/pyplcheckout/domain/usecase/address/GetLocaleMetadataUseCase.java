package com.paypal.pyplcheckout.domain.usecase.address;

import com.paypal.pyplcheckout.addressvalidation.AddressRepository;
import kotlin.jvm.internal.C19383o;

public final class GetLocaleMetadataUseCase {
    private final AddressRepository addressRepository;

    public GetLocaleMetadataUseCase(AddressRepository addressRepository2) {
        C19383o.m32797g(addressRepository2, "addressRepository");
        this.addressRepository = addressRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m35251invokegIAlus(java.lang.String r14, kotlin.coroutines.C19340c<? super kotlin.Result<com.paypal.pyplcheckout.addressvalidation.response.Address>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase$invoke$1 r0 = (com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase$invoke$1 r0 = new com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase$invoke$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)     // Catch:{ Exception -> 0x0042 }
            goto L_0x003d
        L_0x0027:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)
            com.paypal.pyplcheckout.addressvalidation.AddressRepository r15 = r13.addressRepository     // Catch:{ Exception -> 0x0042 }
            r0.label = r3     // Catch:{ Exception -> 0x0042 }
            java.lang.Object r15 = r15.getLocaleMetaData(r14, r0)     // Catch:{ Exception -> 0x0042 }
            if (r15 != r1) goto L_0x003d
            return r1
        L_0x003d:
            java.lang.Object r14 = kotlin.Result.m35480constructorimpl(r15)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0072
        L_0x0042:
            r14 = move-exception
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.WARNING
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E651
            java.lang.Class r15 = r14.getClass()
            java.lang.String r15 = r15.getCanonicalName()
            java.lang.String r2 = r14.getMessage()
            java.lang.String r3 = "Encountered an "
            java.lang.String r4 = " with message: "
            java.lang.String r2 = p003a2.C0015b.m90i(r3, r15, r4, r2)
            r3 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.GRAPH_QL_PAYLOAD
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1992(0x7c8, float:2.791E-42)
            r12 = 0
            r4 = r14
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.Result$Failure r14 = androidx.compose.foundation.layout.C0761x.m1673J(r14)
            java.lang.Object r14 = kotlin.Result.m35480constructorimpl(r14)
        L_0x0072:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase.m35251invokegIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
