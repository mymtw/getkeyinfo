package com.paypal.pyplcheckout.threeds.usecase;

import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p740eq.C19011a;

public final class StartAddCardThreeDsUseCase_Factory implements C17555d<StartAddCardThreeDsUseCase> {
    private final C19011a<Repository> repositoryProvider;
    private final C19011a<C19525d0> scopeProvider;
    private final C19011a<ThreeDSUseCase> threeDSUseCaseProvider;

    public StartAddCardThreeDsUseCase_Factory(C19011a<Repository> aVar, C19011a<ThreeDSUseCase> aVar2, C19011a<C19525d0> aVar3) {
        this.repositoryProvider = aVar;
        this.threeDSUseCaseProvider = aVar2;
        this.scopeProvider = aVar3;
    }

    public static StartAddCardThreeDsUseCase_Factory create(C19011a<Repository> aVar, C19011a<ThreeDSUseCase> aVar2, C19011a<C19525d0> aVar3) {
        return new StartAddCardThreeDsUseCase_Factory(aVar, aVar2, aVar3);
    }

    public static StartAddCardThreeDsUseCase newInstance(Repository repository, ThreeDSUseCase threeDSUseCase, C19525d0 d0Var) {
        return new StartAddCardThreeDsUseCase(repository, threeDSUseCase, d0Var);
    }

    public StartAddCardThreeDsUseCase get() {
        return newInstance(this.repositoryProvider.get(), this.threeDSUseCaseProvider.get(), this.scopeProvider.get());
    }
}
