package com.paypal.pyplcheckout.services.callbacks;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.p539ab.AbManager;
import p634np.C18290b;
import p740eq.C19011a;

public final class BaseCallback_MembersInjector implements C18290b<BaseCallback> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<Events> eventsProvider;

    public BaseCallback_MembersInjector(C19011a<AbManager> aVar, C19011a<Events> aVar2) {
        this.abManagerProvider = aVar;
        this.eventsProvider = aVar2;
    }

    public static C18290b<BaseCallback> create(C19011a<AbManager> aVar, C19011a<Events> aVar2) {
        return new BaseCallback_MembersInjector(aVar, aVar2);
    }

    public static void injectAbManager(BaseCallback baseCallback, AbManager abManager) {
        baseCallback.abManager = abManager;
    }

    public static void injectEvents(BaseCallback baseCallback, Events events) {
        baseCallback.events = events;
    }

    public void injectMembers(BaseCallback baseCallback) {
        injectAbManager(baseCallback, this.abManagerProvider.get());
        injectEvents(baseCallback, this.eventsProvider.get());
    }
}
