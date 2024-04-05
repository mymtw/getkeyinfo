package com.paypal.pyplcheckout.addcard.usecase;

import com.paypal.pyplcheckout.flavorauth.ClearAccessTokenUseCase;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AddCardUseCase_Factory implements C17555d<AddCardUseCase> {
    private final C19011a<ClearAccessTokenUseCase> clearAccessTokenProvider;
    private final C19011a<Repository> repositoryProvider;

    public AddCardUseCase_Factory(C19011a<Repository> aVar, C19011a<ClearAccessTokenUseCase> aVar2) {
        this.repositoryProvider = aVar;
        this.clearAccessTokenProvider = aVar2;
    }

    public static AddCardUseCase_Factory create(C19011a<Repository> aVar, C19011a<ClearAccessTokenUseCase> aVar2) {
        return new AddCardUseCase_Factory(aVar, aVar2);
    }

    public static AddCardUseCase newInstance(Repository repository, ClearAccessTokenUseCase clearAccessTokenUseCase) {
        return new AddCardUseCase(repository, clearAccessTokenUseCase);
    }

    public AddCardUseCase get() {
        return newInstance(this.repositoryProvider.get(), this.clearAccessTokenProvider.get());
    }
}
