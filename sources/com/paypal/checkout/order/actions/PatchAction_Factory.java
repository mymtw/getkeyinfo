package com.paypal.checkout.order.actions;

import com.paypal.checkout.order.patch.PatchOrderAction;
import com.paypal.pyplcheckout.events.Events;
import dagger.internal.C17555d;
import kotlin.coroutines.CoroutineContext;
import p740eq.C19011a;

public final class PatchAction_Factory implements C17555d<PatchAction> {
    private final C19011a<CoroutineContext> coroutineContextProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<PatchOrderAction> patchOrderActionProvider;

    public PatchAction_Factory(C19011a<PatchOrderAction> aVar, C19011a<Events> aVar2, C19011a<CoroutineContext> aVar3) {
        this.patchOrderActionProvider = aVar;
        this.eventsProvider = aVar2;
        this.coroutineContextProvider = aVar3;
    }

    public static PatchAction_Factory create(C19011a<PatchOrderAction> aVar, C19011a<Events> aVar2, C19011a<CoroutineContext> aVar3) {
        return new PatchAction_Factory(aVar, aVar2, aVar3);
    }

    public static PatchAction newInstance(PatchOrderAction patchOrderAction, Events events, CoroutineContext coroutineContext) {
        return new PatchAction(patchOrderAction, events, coroutineContext);
    }

    public PatchAction get() {
        return newInstance(this.patchOrderActionProvider.get(), this.eventsProvider.get(), this.coroutineContextProvider.get());
    }
}
