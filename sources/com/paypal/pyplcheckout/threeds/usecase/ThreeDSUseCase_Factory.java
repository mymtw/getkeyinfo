package com.paypal.pyplcheckout.threeds.usecase;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19525d0;
import p740eq.C19011a;

public final class ThreeDSUseCase_Factory implements C17555d<ThreeDSUseCase> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<Repository> repositoryProvider;
    private final C19011a<C19525d0> scopeProvider;
    private final C19011a<ThreeDSDecisionFlow> threeDSDecisionFlowProvider;

    public ThreeDSUseCase_Factory(C19011a<Events> aVar, C19011a<C19525d0> aVar2, C19011a<ThreeDSDecisionFlow> aVar3, C19011a<Repository> aVar4) {
        this.eventsProvider = aVar;
        this.scopeProvider = aVar2;
        this.threeDSDecisionFlowProvider = aVar3;
        this.repositoryProvider = aVar4;
    }

    public static ThreeDSUseCase_Factory create(C19011a<Events> aVar, C19011a<C19525d0> aVar2, C19011a<ThreeDSDecisionFlow> aVar3, C19011a<Repository> aVar4) {
        return new ThreeDSUseCase_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static ThreeDSUseCase newInstance(Events events, C19525d0 d0Var, ThreeDSDecisionFlow threeDSDecisionFlow, Repository repository) {
        return new ThreeDSUseCase(events, d0Var, threeDSDecisionFlow, repository);
    }

    public ThreeDSUseCase get() {
        return newInstance(this.eventsProvider.get(), this.scopeProvider.get(), this.threeDSDecisionFlowProvider.get(), this.repositoryProvider.get());
    }
}
