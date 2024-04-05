package com.paypal.pyplcheckout.shippingcallbacks;

import com.paypal.checkout.order.actions.PatchAction;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class ShippingCallbackHandler_Factory implements C17555d<ShippingCallbackHandler> {
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<PatchAction> patchActionProvider;
    private final C19011a<Repository> repositoryProvider;

    public ShippingCallbackHandler_Factory(C19011a<DebugConfigManager> aVar, C19011a<Events> aVar2, C19011a<Repository> aVar3, C19011a<PatchAction> aVar4) {
        this.debugConfigManagerProvider = aVar;
        this.eventsProvider = aVar2;
        this.repositoryProvider = aVar3;
        this.patchActionProvider = aVar4;
    }

    public static ShippingCallbackHandler_Factory create(C19011a<DebugConfigManager> aVar, C19011a<Events> aVar2, C19011a<Repository> aVar3, C19011a<PatchAction> aVar4) {
        return new ShippingCallbackHandler_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static ShippingCallbackHandler newInstance(DebugConfigManager debugConfigManager, Events events, Repository repository, PatchAction patchAction) {
        return new ShippingCallbackHandler(debugConfigManager, events, repository, patchAction);
    }

    public ShippingCallbackHandler get() {
        return newInstance(this.debugConfigManagerProvider.get(), this.eventsProvider.get(), this.repositoryProvider.get(), this.patchActionProvider.get());
    }
}
