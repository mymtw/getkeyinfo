package com.paypal.pyplcheckout.services.callbacks;

import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.p539ab.AbManager;
import p634np.C18290b;
import p740eq.C19011a;

public final class UpdateCurrencyConversionCallback_MembersInjector implements C18290b<UpdateCurrencyConversionCallback> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<Events> eventsProvider;

    public UpdateCurrencyConversionCallback_MembersInjector(C19011a<AbManager> aVar, C19011a<Events> aVar2) {
        this.abManagerProvider = aVar;
        this.eventsProvider = aVar2;
    }

    public static C18290b<UpdateCurrencyConversionCallback> create(C19011a<AbManager> aVar, C19011a<Events> aVar2) {
        return new UpdateCurrencyConversionCallback_MembersInjector(aVar, aVar2);
    }

    public void injectMembers(UpdateCurrencyConversionCallback updateCurrencyConversionCallback) {
        BaseCallback_MembersInjector.injectAbManager(updateCurrencyConversionCallback, this.abManagerProvider.get());
        BaseCallback_MembersInjector.injectEvents(updateCurrencyConversionCallback, this.eventsProvider.get());
    }
}
