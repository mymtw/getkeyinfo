package com.paypal.pyplcheckout.threeds;

import android.content.Intent;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.home.view.activities.PYPLHomeActivity;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.threeds.ThreeDS20Activity$onCreate$1", mo70541f = "ThreeDS20Activity.kt", mo70542l = {42}, mo70543m = "invokeSuspend")
public final class ThreeDS20Activity$onCreate$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $paymentAuthenticationRequest;
    public final /* synthetic */ String $transactionId;
    public int label;
    public final /* synthetic */ ThreeDS20Activity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDS20Activity$onCreate$1(ThreeDS20Activity threeDS20Activity, String str, String str2, C19340c<? super ThreeDS20Activity$onCreate$1> cVar) {
        super(2, cVar);
        this.this$0 = threeDS20Activity;
        this.$transactionId = str;
        this.$paymentAuthenticationRequest = str2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ThreeDS20Activity$onCreate$1(this.this$0, this.$transactionId, this.$paymentAuthenticationRequest, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ThreeDS20Activity$onCreate$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            ThreeDS20 threeDS20 = this.this$0.getThreeDS20();
            String str = this.$transactionId;
            String str2 = this.$paymentAuthenticationRequest;
            ThreeDS20Activity threeDS20Activity = this.this$0;
            this.label = 1;
            obj = threeDS20.continueChallenge(str, str2, threeDS20Activity, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Exception e) {
                PLog pLog = PLog.INSTANCE;
                PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E612, String.valueOf(e.getMessage()), (String) null, (Throwable) null, PEnums.TransitionName.THREE_DS_CONTINGENCY_FLOW_FINISHED, PEnums.StateName.THREE_DS, "Not a valid flow", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1816, (Object) null);
                this.this$0.getEvents().fire(PayPalEventTypes.CONTINGENCY_EVENT, new Success(new ContingencyEventsModel(ContingencyType.THREE_DS_V2_CONTINGENCY, ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE, (Exception) null, (String) null, (ThreeDSSource) null, 28, (DefaultConstructorMarker) null)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ValidateResponseAlias validateResponseAlias = (ValidateResponseAlias) obj;
        Intent intent = new Intent(this.this$0, PYPLHomeActivity.class);
        intent.putExtra(ThreeDS20Activity.THREE_DS_20_VALIDATE_RESPONSE, validateResponseAlias.getActionCode());
        intent.putExtra(ThreeDS20Activity.THREE_DS_20_VALIDATE_RESPONSE_ERROR_NUMBER, validateResponseAlias.getErrorNumber());
        intent.putExtra(ThreeDS20Activity.THREE_DS_20_VALIDATE_RESPONSE_ERROR_DESCRIPTION, validateResponseAlias.getErrorDescription());
        this.this$0.setResult(-1, intent);
        this.this$0.finish();
        return C19394m.f43287a;
    }
}
