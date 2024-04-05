package com.paypal.pyplcheckout.threeds.usecase;

import android.app.Activity;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.threeds.ThreeDSSource;
import com.paypal.pyplcheckout.threeds.ThreeDSState;
import kotlin.C19394m;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19689x1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase$launchThreeDs$1", mo70541f = "StartAddCardThreeDsUseCase.kt", mo70542l = {137}, mo70543m = "invokeSuspend")
public final class StartAddCardThreeDsUseCase$launchThreeDs$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Activity $activity;
    public int label;
    public final /* synthetic */ StartAddCardThreeDsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartAddCardThreeDsUseCase$launchThreeDs$1(StartAddCardThreeDsUseCase startAddCardThreeDsUseCase, Activity activity, C19340c<? super StartAddCardThreeDsUseCase$launchThreeDs$1> cVar) {
        super(2, cVar);
        this.this$0 = startAddCardThreeDsUseCase;
        this.$activity = activity;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new StartAddCardThreeDsUseCase$launchThreeDs$1(this.this$0, this.$activity, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((StartAddCardThreeDsUseCase$launchThreeDs$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19689x1<ThreeDSState> launch3DS = this.this$0.threeDSUseCase.launch3DS(this.$activity, ThreeDSSource.ADD_CARD);
            final StartAddCardThreeDsUseCase startAddCardThreeDsUseCase = this.this$0;
            C172701 r1 = new C19600e() {
                public final Object emit(ThreeDSState threeDSState, C19340c<? super C19394m> cVar) {
                    startAddCardThreeDsUseCase.onThreeDsState(threeDSState);
                    return C19394m.f43287a;
                }
            };
            this.label = 1;
            if (launch3DS.collect(r1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C0761x.m1684O0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
