package com.paypal.pyplcheckout.userprofile.usecase;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p740eq.C19011a;

public final class GetUserUseCase_Factory implements C17555d<GetUserUseCase> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<Repository> repositoryProvider;
    private final C19011a<C19525d0> scopeProvider;

    public GetUserUseCase_Factory(C19011a<Repository> aVar, C19011a<Events> aVar2, C19011a<C19525d0> aVar3) {
        this.repositoryProvider = aVar;
        this.eventsProvider = aVar2;
        this.scopeProvider = aVar3;
    }

    public static GetUserUseCase_Factory create(C19011a<Repository> aVar, C19011a<Events> aVar2, C19011a<C19525d0> aVar3) {
        return new GetUserUseCase_Factory(aVar, aVar2, aVar3);
    }

    public static GetUserUseCase newInstance(Repository repository, Events events, C19525d0 d0Var) {
        return new GetUserUseCase(repository, events, d0Var);
    }

    public GetUserUseCase get() {
        return newInstance(this.repositoryProvider.get(), this.eventsProvider.get(), this.scopeProvider.get());
    }
}
