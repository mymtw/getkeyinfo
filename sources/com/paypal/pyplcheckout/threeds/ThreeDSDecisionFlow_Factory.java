package com.paypal.pyplcheckout.threeds;

import android.content.Context;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import kotlin.coroutines.CoroutineContext;
import p740eq.C19011a;

public final class ThreeDSDecisionFlow_Factory implements C17555d<ThreeDSDecisionFlow> {
    private final C19011a<DebugConfigManager> configManagerProvider;
    private final C19011a<Context> contextProvider;
    private final C19011a<CoroutineContext> coroutineContextProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<Repository> repositoryProvider;
    private final C19011a<ThreeDS20> threeDS20Provider;
    private final C19011a<ThreeDsDecisionFlowInfo> threeDsDecisionFlowInfoProvider;

    public ThreeDSDecisionFlow_Factory(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<DebugConfigManager> aVar3, C19011a<Context> aVar4, C19011a<ThreeDS20> aVar5, C19011a<ThreeDsDecisionFlowInfo> aVar6, C19011a<CoroutineContext> aVar7) {
        this.eventsProvider = aVar;
        this.repositoryProvider = aVar2;
        this.configManagerProvider = aVar3;
        this.contextProvider = aVar4;
        this.threeDS20Provider = aVar5;
        this.threeDsDecisionFlowInfoProvider = aVar6;
        this.coroutineContextProvider = aVar7;
    }

    public static ThreeDSDecisionFlow_Factory create(C19011a<Events> aVar, C19011a<Repository> aVar2, C19011a<DebugConfigManager> aVar3, C19011a<Context> aVar4, C19011a<ThreeDS20> aVar5, C19011a<ThreeDsDecisionFlowInfo> aVar6, C19011a<CoroutineContext> aVar7) {
        return new ThreeDSDecisionFlow_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static ThreeDSDecisionFlow newInstance(Events events, Repository repository, DebugConfigManager debugConfigManager, Context context, ThreeDS20 threeDS20, ThreeDsDecisionFlowInfo threeDsDecisionFlowInfo, CoroutineContext coroutineContext) {
        return new ThreeDSDecisionFlow(events, repository, debugConfigManager, context, threeDS20, threeDsDecisionFlowInfo, coroutineContext);
    }

    public ThreeDSDecisionFlow get() {
        return newInstance(this.eventsProvider.get(), this.repositoryProvider.get(), this.configManagerProvider.get(), this.contextProvider.get(), this.threeDS20Provider.get(), this.threeDsDecisionFlowInfoProvider.get(), this.coroutineContextProvider.get());
    }
}
