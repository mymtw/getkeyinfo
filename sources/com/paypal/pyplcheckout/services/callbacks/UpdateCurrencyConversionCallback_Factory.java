package com.paypal.pyplcheckout.services.callbacks;

import com.google.gson.C16708i;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.p539ab.AbManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class UpdateCurrencyConversionCallback_Factory implements C17555d<UpdateCurrencyConversionCallback> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<ApprovePaymentCallback> approvePaymentCallbackProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<C16708i> gsonProvider;

    public UpdateCurrencyConversionCallback_Factory(C19011a<ApprovePaymentCallback> aVar, C19011a<C16708i> aVar2, C19011a<AbManager> aVar3, C19011a<Events> aVar4) {
        this.approvePaymentCallbackProvider = aVar;
        this.gsonProvider = aVar2;
        this.abManagerProvider = aVar3;
        this.eventsProvider = aVar4;
    }

    public static UpdateCurrencyConversionCallback_Factory create(C19011a<ApprovePaymentCallback> aVar, C19011a<C16708i> aVar2, C19011a<AbManager> aVar3, C19011a<Events> aVar4) {
        return new UpdateCurrencyConversionCallback_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static UpdateCurrencyConversionCallback newInstance(ApprovePaymentCallback approvePaymentCallback, C16708i iVar) {
        return new UpdateCurrencyConversionCallback(approvePaymentCallback, iVar);
    }

    public UpdateCurrencyConversionCallback get() {
        UpdateCurrencyConversionCallback newInstance = newInstance(this.approvePaymentCallbackProvider.get(), this.gsonProvider.get());
        BaseCallback_MembersInjector.injectAbManager(newInstance, this.abManagerProvider.get());
        BaseCallback_MembersInjector.injectEvents(newInstance, this.eventsProvider.get());
        return newInstance;
    }
}
