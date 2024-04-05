package com.paypal.pyplcheckout.userprofile.usecase;

import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p740eq.C19011a;

public final class GetUserCountryUseCase_Factory implements C17555d<GetUserCountryUseCase> {
    private final C19011a<GetUserUseCase> getUserUseCaseProvider;
    private final C19011a<C19525d0> scopeProvider;

    public GetUserCountryUseCase_Factory(C19011a<GetUserUseCase> aVar, C19011a<C19525d0> aVar2) {
        this.getUserUseCaseProvider = aVar;
        this.scopeProvider = aVar2;
    }

    public static GetUserCountryUseCase_Factory create(C19011a<GetUserUseCase> aVar, C19011a<C19525d0> aVar2) {
        return new GetUserCountryUseCase_Factory(aVar, aVar2);
    }

    public static GetUserCountryUseCase newInstance(GetUserUseCase getUserUseCase, C19525d0 d0Var) {
        return new GetUserCountryUseCase(getUserUseCase, d0Var);
    }

    public GetUserCountryUseCase get() {
        return newInstance(this.getUserUseCaseProvider.get(), this.scopeProvider.get());
    }
}
