package com.paypal.pyplcheckout.viewmodels;

import com.paypal.pyplcheckout.domain.usecase.GetMerchantConfigUseCase;
import com.paypal.pyplcheckout.state.usecase.GetCheckoutStateUseCase;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class CancelViewModel_Factory implements C17555d<CancelViewModel> {
    private final C19011a<GetCheckoutStateUseCase> getCheckoutStateUseCaseProvider;
    private final C19011a<GetMerchantConfigUseCase> getMerchantConfigUseCaseProvider;
    private final C19011a<Boolean> is1pProvider;

    public CancelViewModel_Factory(C19011a<GetMerchantConfigUseCase> aVar, C19011a<GetCheckoutStateUseCase> aVar2, C19011a<Boolean> aVar3) {
        this.getMerchantConfigUseCaseProvider = aVar;
        this.getCheckoutStateUseCaseProvider = aVar2;
        this.is1pProvider = aVar3;
    }

    public static CancelViewModel_Factory create(C19011a<GetMerchantConfigUseCase> aVar, C19011a<GetCheckoutStateUseCase> aVar2, C19011a<Boolean> aVar3) {
        return new CancelViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static CancelViewModel newInstance(GetMerchantConfigUseCase getMerchantConfigUseCase, GetCheckoutStateUseCase getCheckoutStateUseCase, boolean z) {
        return new CancelViewModel(getMerchantConfigUseCase, getCheckoutStateUseCase, z);
    }

    public CancelViewModel get() {
        return newInstance(this.getMerchantConfigUseCaseProvider.get(), this.getCheckoutStateUseCaseProvider.get(), this.is1pProvider.get().booleanValue());
    }
}
