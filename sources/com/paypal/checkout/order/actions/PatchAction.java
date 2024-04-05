package com.paypal.checkout.order.actions;

import com.paypal.checkout.order.patch.PatchOrderAction;
import com.paypal.checkout.order.patch.PatchOrderRequest;
import com.paypal.pyplcheckout.events.Events;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;

public final class PatchAction {
    private final CoroutineContext coroutineContext;
    /* access modifiers changed from: private */
    public final Events events;
    /* access modifiers changed from: private */
    public final PatchOrderAction patchOrderAction;

    public PatchAction(PatchOrderAction patchOrderAction2, Events events2, CoroutineContext coroutineContext2) {
        C19383o.m32797g(patchOrderAction2, "patchOrderAction");
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(coroutineContext2, "coroutineContext");
        this.patchOrderAction = patchOrderAction2;
        this.events = events2;
        this.coroutineContext = coroutineContext2;
    }

    public final void patchOrder(PatchOrderRequest patchOrderRequest, OnPatchComplete onPatchComplete) {
        C19383o.m32797g(patchOrderRequest, "patchOrderRequest");
        C19383o.m32797g(onPatchComplete, "onComplete");
        C19697g.m33468f(C19697g.m33463a(this.coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new PatchAction$patchOrder$1(this, patchOrderRequest, onPatchComplete, (C19340c<? super PatchAction$patchOrder$1>) null), 3);
    }
}
