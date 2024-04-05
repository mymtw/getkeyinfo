package com.paypal.pyplcheckout.threeds;

import android.app.Activity;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$startThreeDsFlow$1", mo70541f = "ThreeDSDecisionFlow.kt", mo70542l = {204}, mo70543m = "invokeSuspend")
public final class ThreeDSDecisionFlow$startThreeDsFlow$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C19857l<ContingencyEventsModel, C19394m> $onError;
    public int label;
    public final /* synthetic */ ThreeDSDecisionFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDSDecisionFlow$startThreeDsFlow$1(ThreeDSDecisionFlow threeDSDecisionFlow, Activity activity, C19857l<? super ContingencyEventsModel, C19394m> lVar, C19340c<? super ThreeDSDecisionFlow$startThreeDsFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = threeDSDecisionFlow;
        this.$activity = activity;
        this.$onError = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ThreeDSDecisionFlow$startThreeDsFlow$1(this.this$0, this.$activity, this.$onError, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ThreeDSDecisionFlow$startThreeDsFlow$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ThreeDSDecisionFlow threeDSDecisionFlow = this.this$0;
            Activity activity = this.$activity;
            this.label = 1;
            if (threeDSDecisionFlow.decisioningFlow(activity, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Exception e) {
                Exception exc = e;
                this.this$0.logException(exc);
                this.$onError.invoke(new ContingencyEventsModel(ContingencyType.THREE_DS_V2_CONTINGENCY, ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE, exc, exc.getMessage(), (ThreeDSSource) null, 16, (DefaultConstructorMarker) null));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
