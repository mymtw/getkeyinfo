package com.paypal.checkout.order.actions;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.checkout.order.patch.PatchOrderAction;
import com.paypal.checkout.order.patch.PatchOrderRequest;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.order.actions.PatchAction$patchOrder$1", mo70541f = "PatchAction.kt", mo70542l = {40}, mo70543m = "invokeSuspend")
public final class PatchAction$patchOrder$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ OnPatchComplete $onComplete;
    public final /* synthetic */ PatchOrderRequest $patchOrderRequest;
    public int label;
    public final /* synthetic */ PatchAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PatchAction$patchOrder$1(PatchAction patchAction, PatchOrderRequest patchOrderRequest, OnPatchComplete onPatchComplete, C19340c<? super PatchAction$patchOrder$1> cVar) {
        super(2, cVar);
        this.this$0 = patchAction;
        this.$patchOrderRequest = patchOrderRequest;
        this.$onComplete = onPatchComplete;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new PatchAction$patchOrder$1(this.this$0, this.$patchOrderRequest, this.$onComplete, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((PatchAction$patchOrder$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            PatchOrderAction access$getPatchOrderAction$p = this.this$0.patchOrderAction;
            PatchOrderRequest patchOrderRequest = this.$patchOrderRequest;
            this.label = 1;
            if (access$getPatchOrderAction$p.execute(patchOrderRequest, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Exception e) {
                DebugConfigManager.getInstance().invokeOnErrorCallback(e, ErrorReason.PATCH_ORDER_ERROR);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$onComplete.onPatchComplete();
        this.this$0.events.fire(PayPalEventTypes.PATCH_SHIPPING_CHANGES_REFRESH_IS_COMPLETE, (ResultData) null);
        return C19394m.f43287a;
    }
}
