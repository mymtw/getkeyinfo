package com.paypal.pyplcheckout.home.viewmodel;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2895z;
import com.paypal.pyplcheckout.threeds.ThreeDSState;
import kotlin.C19394m;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19689x1;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

public final class SpinnerViewModel$spinnerState$2 extends Lambda implements C19846a<C2895z<SpinnerState>> {
    public final /* synthetic */ SpinnerViewModel this$0;

    @C19060c(mo70540c = "com.paypal.pyplcheckout.home.viewmodel.SpinnerViewModel$spinnerState$2$1", mo70541f = "SpinnerViewModel.kt", mo70542l = {27}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.pyplcheckout.home.viewmodel.SpinnerViewModel$spinnerState$2$1 */
    public static final class C172621 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C172621(spinnerViewModel, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C172621) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19689x1<ThreeDSState> invoke = spinnerViewModel.threeDSUseCase.invoke();
                final SpinnerViewModel spinnerViewModel = spinnerViewModel;
                C172631 r1 = new C19600e() {
                    public final Object emit(ThreeDSState threeDSState, C19340c<? super C19394m> cVar) {
                        spinnerViewModel._spinnerState.postValue(spinnerViewModel.mapThreeDSState(threeDSState));
                        return C19394m.f43287a;
                    }
                };
                this.label = 1;
                if (invoke.collect(r1, this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpinnerViewModel$spinnerState$2(SpinnerViewModel spinnerViewModel) {
        super(0);
        this.this$0 = spinnerViewModel;
    }

    public final C2895z<SpinnerState> invoke() {
        C19525d0 i0 = C19388s.m32866i0(this.this$0);
        final SpinnerViewModel spinnerViewModel = this.this$0;
        C19697g.m33468f(i0, (CoroutineContext) null, (CoroutineStart) null, new C172621((C19340c<? super C172621>) null), 3);
        return this.this$0._spinnerState;
    }
}
