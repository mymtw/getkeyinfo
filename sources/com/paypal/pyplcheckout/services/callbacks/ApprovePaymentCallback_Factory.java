package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class ApprovePaymentCallback_Factory implements C17555d<ApprovePaymentCallback> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<Handler> handlerProvider;
    private final C19011a<PYPLCheckoutUtils> pyplCheckoutUtilsProvider;

    public ApprovePaymentCallback_Factory(C19011a<DebugConfigManager> aVar, C19011a<PYPLCheckoutUtils> aVar2, C19011a<Handler> aVar3, C19011a<AbManager> aVar4, C19011a<Events> aVar5) {
        this.debugConfigManagerProvider = aVar;
        this.pyplCheckoutUtilsProvider = aVar2;
        this.handlerProvider = aVar3;
        this.abManagerProvider = aVar4;
        this.eventsProvider = aVar5;
    }

    public static ApprovePaymentCallback_Factory create(C19011a<DebugConfigManager> aVar, C19011a<PYPLCheckoutUtils> aVar2, C19011a<Handler> aVar3, C19011a<AbManager> aVar4, C19011a<Events> aVar5) {
        return new ApprovePaymentCallback_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static ApprovePaymentCallback newInstance(DebugConfigManager debugConfigManager, PYPLCheckoutUtils pYPLCheckoutUtils, Handler handler) {
        return new ApprovePaymentCallback(debugConfigManager, pYPLCheckoutUtils, handler);
    }

    public ApprovePaymentCallback get() {
        ApprovePaymentCallback newInstance = newInstance(this.debugConfigManagerProvider.get(), this.pyplCheckoutUtilsProvider.get(), this.handlerProvider.get());
        BaseCallback_MembersInjector.injectAbManager(newInstance, this.abManagerProvider.get());
        BaseCallback_MembersInjector.injectEvents(newInstance, this.eventsProvider.get());
        return newInstance;
    }
}
