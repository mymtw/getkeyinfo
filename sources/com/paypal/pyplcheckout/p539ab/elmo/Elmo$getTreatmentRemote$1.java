package com.paypal.pyplcheckout.p539ab.elmo;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentCallback;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19764o1;
import kotlinx.coroutines.internal.C19729m;
import p744gq.C19060c;
import p753kq.C19861p;
import p768rq.C20153b;

@C19060c(mo70540c = "com.paypal.pyplcheckout.ab.elmo.Elmo$getTreatmentRemote$1", mo70541f = "Elmo.kt", mo70542l = {78, 79}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.pyplcheckout.ab.elmo.Elmo$getTreatmentRemote$1 */
public final class Elmo$getTreatmentRemote$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ ExperimentCallback $callback;
    public final /* synthetic */ ExperimentRequest $experimentRequest;
    public int label;
    public final /* synthetic */ Elmo this$0;

    @C19060c(mo70540c = "com.paypal.pyplcheckout.ab.elmo.Elmo$getTreatmentRemote$1$1", mo70541f = "Elmo.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.pyplcheckout.ab.elmo.Elmo$getTreatmentRemote$1$1 */
    public static final class C171731 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C171731(experimentCallback, experimentResponse, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C171731) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                experimentCallback.onResponse(experimentResponse);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Elmo$getTreatmentRemote$1(Elmo elmo, ExperimentRequest experimentRequest, ExperimentCallback experimentCallback, C19340c<? super Elmo$getTreatmentRemote$1> cVar) {
        super(2, cVar);
        this.this$0 = elmo;
        this.$experimentRequest = experimentRequest;
        this.$callback = experimentCallback;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new Elmo$getTreatmentRemote$1(this.this$0, this.$experimentRequest, this.$callback, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((Elmo$getTreatmentRemote$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Elmo elmo = this.this$0;
            ExperimentRequest experimentRequest = this.$experimentRequest;
            this.label = 1;
            obj = elmo.fetchRemoteTreatment(experimentRequest, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else if (i == 2) {
            C0761x.m1684O0(obj);
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final ExperimentResponse experimentResponse = (ExperimentResponse) obj;
        C20153b bVar = C19760n0.f43719a;
        C19764o1 o1Var = C19729m.f43681a;
        final ExperimentCallback experimentCallback = this.$callback;
        C171731 r3 = new C171731((C19340c<? super C171731>) null);
        this.label = 2;
        if (C19697g.m33471i(this, o1Var, r3) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C19394m.f43287a;
    }
}
