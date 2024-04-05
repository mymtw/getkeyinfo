package com.paypal.pyplcheckout.home.view.activities;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import p634np.C18290b;
import p740eq.C19011a;

public final class PYPLInitiateCheckoutActivity_MembersInjector implements C18290b<PYPLInitiateCheckoutActivity> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<Events> eventsProvider;

    public PYPLInitiateCheckoutActivity_MembersInjector(C19011a<DebugConfigManager> aVar, C19011a<Events> aVar2, C19011a<AbManager> aVar3) {
        this.debugConfigManagerProvider = aVar;
        this.eventsProvider = aVar2;
        this.abManagerProvider = aVar3;
    }

    public static C18290b<PYPLInitiateCheckoutActivity> create(C19011a<DebugConfigManager> aVar, C19011a<Events> aVar2, C19011a<AbManager> aVar3) {
        return new PYPLInitiateCheckoutActivity_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectAbManager(PYPLInitiateCheckoutActivity pYPLInitiateCheckoutActivity, AbManager abManager) {
        pYPLInitiateCheckoutActivity.abManager = abManager;
    }

    public static void injectDebugConfigManager(PYPLInitiateCheckoutActivity pYPLInitiateCheckoutActivity, DebugConfigManager debugConfigManager) {
        pYPLInitiateCheckoutActivity.debugConfigManager = debugConfigManager;
    }

    public static void injectEvents(PYPLInitiateCheckoutActivity pYPLInitiateCheckoutActivity, Events events) {
        pYPLInitiateCheckoutActivity.events = events;
    }

    public void injectMembers(PYPLInitiateCheckoutActivity pYPLInitiateCheckoutActivity) {
        injectDebugConfigManager(pYPLInitiateCheckoutActivity, this.debugConfigManagerProvider.get());
        injectEvents(pYPLInitiateCheckoutActivity, this.eventsProvider.get());
        injectAbManager(pYPLInitiateCheckoutActivity, this.abManagerProvider.get());
    }
}
