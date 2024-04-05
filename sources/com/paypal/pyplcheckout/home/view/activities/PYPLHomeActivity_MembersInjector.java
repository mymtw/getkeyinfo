package com.paypal.pyplcheckout.home.view.activities;

import androidx.lifecycle.C2870k0;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuthPresenter;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import p634np.C18290b;
import p740eq.C19011a;

public final class PYPLHomeActivity_MembersInjector implements C18290b<PYPLHomeActivity> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<C2870k0.C2872b> factoryProvider;
    private final C19011a<ThirdPartyAuthPresenter> thirdPartyAuthPresenterProvider;

    public PYPLHomeActivity_MembersInjector(C19011a<C2870k0.C2872b> aVar, C19011a<DebugConfigManager> aVar2, C19011a<Events> aVar3, C19011a<ThirdPartyAuthPresenter> aVar4) {
        this.factoryProvider = aVar;
        this.debugConfigManagerProvider = aVar2;
        this.eventsProvider = aVar3;
        this.thirdPartyAuthPresenterProvider = aVar4;
    }

    public static C18290b<PYPLHomeActivity> create(C19011a<C2870k0.C2872b> aVar, C19011a<DebugConfigManager> aVar2, C19011a<Events> aVar3, C19011a<ThirdPartyAuthPresenter> aVar4) {
        return new PYPLHomeActivity_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectDebugConfigManager(PYPLHomeActivity pYPLHomeActivity, DebugConfigManager debugConfigManager) {
        pYPLHomeActivity.debugConfigManager = debugConfigManager;
    }

    public static void injectEvents(PYPLHomeActivity pYPLHomeActivity, Events events) {
        pYPLHomeActivity.events = events;
    }

    public static void injectFactory(PYPLHomeActivity pYPLHomeActivity, C2870k0.C2872b bVar) {
        pYPLHomeActivity.factory = bVar;
    }

    public static void injectThirdPartyAuthPresenter(PYPLHomeActivity pYPLHomeActivity, ThirdPartyAuthPresenter thirdPartyAuthPresenter) {
        pYPLHomeActivity.thirdPartyAuthPresenter = thirdPartyAuthPresenter;
    }

    public void injectMembers(PYPLHomeActivity pYPLHomeActivity) {
        injectFactory(pYPLHomeActivity, this.factoryProvider.get());
        injectDebugConfigManager(pYPLHomeActivity, this.debugConfigManagerProvider.get());
        injectEvents(pYPLHomeActivity, this.eventsProvider.get());
        injectThirdPartyAuthPresenter(pYPLHomeActivity, this.thirdPartyAuthPresenterProvider.get());
    }
}
