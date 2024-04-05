package com.paypal.pyplcheckout.home.viewmodel;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class PostAuthSuccessHandler_Factory implements C17555d<PostAuthSuccessHandler> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<PYPLCheckoutUtils> pyplCheckoutUtilsProvider;
    private final C19011a<Repository> repositoryProvider;

    public PostAuthSuccessHandler_Factory(C19011a<DebugConfigManager> aVar, C19011a<Repository> aVar2, C19011a<PYPLCheckoutUtils> aVar3, C19011a<Events> aVar4) {
        this.debugConfigManagerProvider = aVar;
        this.repositoryProvider = aVar2;
        this.pyplCheckoutUtilsProvider = aVar3;
        this.eventsProvider = aVar4;
    }

    public static PostAuthSuccessHandler_Factory create(C19011a<DebugConfigManager> aVar, C19011a<Repository> aVar2, C19011a<PYPLCheckoutUtils> aVar3, C19011a<Events> aVar4) {
        return new PostAuthSuccessHandler_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static PostAuthSuccessHandler newInstance(DebugConfigManager debugConfigManager, Repository repository, PYPLCheckoutUtils pYPLCheckoutUtils, Events events) {
        return new PostAuthSuccessHandler(debugConfigManager, repository, pYPLCheckoutUtils, events);
    }

    public PostAuthSuccessHandler get() {
        return newInstance(this.debugConfigManagerProvider.get(), this.repositoryProvider.get(), this.pyplCheckoutUtilsProvider.get(), this.eventsProvider.get());
    }
}
