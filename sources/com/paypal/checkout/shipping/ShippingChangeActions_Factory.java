package com.paypal.checkout.shipping;

import com.paypal.checkout.order.actions.PatchAction;
import com.paypal.pyplcheckout.events.Events;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class ShippingChangeActions_Factory implements C17555d<ShippingChangeActions> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<PatchAction> patchActionsProvider;

    public ShippingChangeActions_Factory(C19011a<PatchAction> aVar, C19011a<Events> aVar2) {
        this.patchActionsProvider = aVar;
        this.eventsProvider = aVar2;
    }

    public static ShippingChangeActions_Factory create(C19011a<PatchAction> aVar, C19011a<Events> aVar2) {
        return new ShippingChangeActions_Factory(aVar, aVar2);
    }

    public static ShippingChangeActions newInstance(PatchAction patchAction, Events events) {
        return new ShippingChangeActions(patchAction, events);
    }

    public ShippingChangeActions get() {
        return newInstance(this.patchActionsProvider.get(), this.eventsProvider.get());
    }
}
