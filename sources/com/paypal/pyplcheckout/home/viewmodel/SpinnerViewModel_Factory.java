package com.paypal.pyplcheckout.home.viewmodel;

import com.paypal.pyplcheckout.threeds.usecase.ThreeDSUseCase;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class SpinnerViewModel_Factory implements C17555d<SpinnerViewModel> {
    private final C19011a<ThreeDSUseCase> threeDSUseCaseProvider;

    public SpinnerViewModel_Factory(C19011a<ThreeDSUseCase> aVar) {
        this.threeDSUseCaseProvider = aVar;
    }

    public static SpinnerViewModel_Factory create(C19011a<ThreeDSUseCase> aVar) {
        return new SpinnerViewModel_Factory(aVar);
    }

    public static SpinnerViewModel newInstance(ThreeDSUseCase threeDSUseCase) {
        return new SpinnerViewModel(threeDSUseCase);
    }

    public SpinnerViewModel get() {
        return newInstance(this.threeDSUseCaseProvider.get());
    }
}
