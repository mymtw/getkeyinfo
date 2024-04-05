package com.paypal.pyplcheckout.eligibility;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class EligibilityManager_Factory implements C17555d<EligibilityManager> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<PYPLCheckoutUtils> checkoutUtilsProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<Repository> repositoryProvider;

    public EligibilityManager_Factory(C19011a<Events> aVar, C19011a<PYPLCheckoutUtils> aVar2, C19011a<DebugConfigManager> aVar3, C19011a<AbManager> aVar4, C19011a<Repository> aVar5) {
        this.eventsProvider = aVar;
        this.checkoutUtilsProvider = aVar2;
        this.debugConfigManagerProvider = aVar3;
        this.abManagerProvider = aVar4;
        this.repositoryProvider = aVar5;
    }

    public static EligibilityManager_Factory create(C19011a<Events> aVar, C19011a<PYPLCheckoutUtils> aVar2, C19011a<DebugConfigManager> aVar3, C19011a<AbManager> aVar4, C19011a<Repository> aVar5) {
        return new EligibilityManager_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static EligibilityManager newInstance(Events events, PYPLCheckoutUtils pYPLCheckoutUtils, DebugConfigManager debugConfigManager, AbManager abManager, Repository repository) {
        return new EligibilityManager(events, pYPLCheckoutUtils, debugConfigManager, abManager, repository);
    }

    public EligibilityManager get() {
        return newInstance(this.eventsProvider.get(), this.checkoutUtilsProvider.get(), this.debugConfigManagerProvider.get(), this.abManagerProvider.get(), this.repositoryProvider.get());
    }
}
