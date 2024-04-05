package com.paypal.pyplcheckout.domain.usecase;

import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository;
import kotlin.jvm.internal.C19383o;

public final class GetMerchantConfigUseCase {
    private final MerchantConfigRepository merchantConfigRepository;

    public GetMerchantConfigUseCase(MerchantConfigRepository merchantConfigRepository2) {
        C19383o.m32797g(merchantConfigRepository2, "merchantConfigRepository");
        this.merchantConfigRepository = merchantConfigRepository2;
    }

    /* renamed from: invoke-d1pmJ48  reason: not valid java name */
    public final Object m35250invoked1pmJ48() {
        return this.merchantConfigRepository.m35247getMerchantConfigd1pmJ48();
    }
}
