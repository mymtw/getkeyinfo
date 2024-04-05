package com.paypal.pyplcheckout.fundingOptions.usecase;

import com.paypal.pyplcheckout.addcard.usecase.GetAddCardEnabledUseCase;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p740eq.C19011a;

public final class GetSelectedFundingOptionUseCase_Factory implements C17555d<GetSelectedFundingOptionUseCase> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<GetAddCardEnabledUseCase> getAddCardEnabledUseCaseProvider;
    private final C19011a<Repository> repositoryProvider;
    private final C19011a<C19525d0> scopeProvider;

    public GetSelectedFundingOptionUseCase_Factory(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<C19525d0> aVar3, C19011a<GetAddCardEnabledUseCase> aVar4) {
        this.eventsProvider = aVar;
        this.repositoryProvider = aVar2;
        this.scopeProvider = aVar3;
        this.getAddCardEnabledUseCaseProvider = aVar4;
    }

    public static GetSelectedFundingOptionUseCase_Factory create(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<C19525d0> aVar3, C19011a<GetAddCardEnabledUseCase> aVar4) {
        return new GetSelectedFundingOptionUseCase_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static GetSelectedFundingOptionUseCase newInstance(Events events, Repository repository, C19525d0 d0Var, GetAddCardEnabledUseCase getAddCardEnabledUseCase) {
        return new GetSelectedFundingOptionUseCase(events, repository, d0Var, getAddCardEnabledUseCase);
    }

    public GetSelectedFundingOptionUseCase get() {
        return newInstance(this.eventsProvider.get(), this.repositoryProvider.get(), this.scopeProvider.get(), this.getAddCardEnabledUseCaseProvider.get());
    }
}
