package com.paypal.pyplcheckout.domain.usecase;

import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class GetMerchantConfigUseCase_Factory implements C17555d<GetMerchantConfigUseCase> {
    private final C19011a<MerchantConfigRepository> merchantConfigRepositoryProvider;

    public GetMerchantConfigUseCase_Factory(C19011a<MerchantConfigRepository> aVar) {
        this.merchantConfigRepositoryProvider = aVar;
    }

    public static GetMerchantConfigUseCase_Factory create(C19011a<MerchantConfigRepository> aVar) {
        return new GetMerchantConfigUseCase_Factory(aVar);
    }

    public static GetMerchantConfigUseCase newInstance(MerchantConfigRepository merchantConfigRepository) {
        return new GetMerchantConfigUseCase(merchantConfigRepository);
    }

    public GetMerchantConfigUseCase get() {
        return newInstance(this.merchantConfigRepositoryProvider.get());
    }
}
