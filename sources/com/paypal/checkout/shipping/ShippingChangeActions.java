package com.paypal.checkout.shipping;

import com.paypal.checkout.order.actions.OnPatchComplete;
import com.paypal.checkout.order.actions.PatchAction;
import com.paypal.checkout.order.patch.PatchOrderRequest;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

public final class ShippingChangeActions {
    private final Events events;
    private final PatchAction patchActions;

    public ShippingChangeActions(PatchAction patchAction, Events events2) {
        C19383o.m32797g(patchAction, "patchActions");
        C19383o.m32797g(events2, "events");
        this.patchActions = patchAction;
        this.events = events2;
    }

    public final void approve() {
        this.events.fire(PayPalEventTypes.PATCH_SHIPPING_CHANGES_REFRESH_IS_COMPLETE, (ResultData) null);
    }

    public final void patchOrder(PatchOrderRequest patchOrderRequest, C19846a<C19394m> aVar) {
        C19383o.m32797g(patchOrderRequest, "patchOrderRequest");
        C19383o.m32797g(aVar, "onComplete");
        this.patchActions.patchOrder(patchOrderRequest, new ShippingChangeActions$patchOrder$1(aVar));
    }

    public final void reject() {
        this.events.fire(PayPalEventTypes.PATCH_SHIPPING_CHANGES_ERROR, (ResultData) null);
    }

    public final void patchOrder(PatchOrderRequest patchOrderRequest, OnPatchComplete onPatchComplete) {
        C19383o.m32797g(patchOrderRequest, "patchOrderRequest");
        C19383o.m32797g(onPatchComplete, "onComplete");
        this.patchActions.patchOrder(patchOrderRequest, onPatchComplete);
    }
}
