package com.paypal.pyplcheckout.common.instrumentation.amplitude.logger;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.repository.AmplitudeRepository;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import org.json.JSONObject;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.common.instrumentation.amplitude.logger.AmplitudeService$logEvent$1", mo70541f = "AmplitudeService.kt", mo70542l = {49}, mo70543m = "invokeSuspend")
public final class AmplitudeService$logEvent$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ JSONObject $event;
    public final /* synthetic */ String $transitionName;
    public int label;
    public final /* synthetic */ AmplitudeService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AmplitudeService$logEvent$1(AmplitudeService amplitudeService, String str, JSONObject jSONObject, C19340c<? super AmplitudeService$logEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = amplitudeService;
        this.$transitionName = str;
        this.$event = jSONObject;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new AmplitudeService$logEvent$1(this.this$0, this.$transitionName, this.$event, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AmplitudeService$logEvent$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            AmplitudeRepository repository = this.this$0.getRepository();
            String str = this.$transitionName;
            JSONObject jSONObject = this.$event;
            this.label = 1;
            if (repository.logEvent(str, jSONObject, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
