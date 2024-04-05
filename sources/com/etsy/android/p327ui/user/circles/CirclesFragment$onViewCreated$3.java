package com.etsy.android.p327ui.user.circles;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.etsy.android.p327ui.user.circles.CirclesViewModel;
import kotlin.C19394m;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.StateFlowImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.user.circles.CirclesFragment$onViewCreated$3", mo70541f = "CirclesFragment.kt", mo70542l = {123}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$onViewCreated$3 */
public final class CirclesFragment$onViewCreated$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ CirclesFragment this$0;

    @C19060c(mo70540c = "com.etsy.android.ui.user.circles.CirclesFragment$onViewCreated$3$1", mo70541f = "CirclesFragment.kt", mo70542l = {127}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$onViewCreated$3$1 */
    public static final class C114961 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        /* renamed from: com.etsy.android.ui.user.circles.CirclesFragment$onViewCreated$3$1$a */
        public static final class C11497a implements C19600e<CirclesViewModel.C11501a> {

            /* renamed from: b */
            public final /* synthetic */ CirclesFragment f25371b;

            public C11497a(CirclesFragment circlesFragment) {
                this.f25371b = circlesFragment;
            }

            public final Object emit(Object obj, C19340c cVar) {
                this.f25371b.onViewState((CirclesViewModel.C11501a) obj);
                return C19394m.f43287a;
            }
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C114961(circlesFragment, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C114961) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                StateFlowImpl stateFlowImpl = circlesFragment.getViewModel().f25378e;
                C11497a aVar = new C11497a(circlesFragment);
                this.label = 1;
                if (stateFlowImpl.collect(aVar, this) == coroutineSingletons) {
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
    public CirclesFragment$onViewCreated$3(CirclesFragment circlesFragment, C19340c<? super CirclesFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.this$0 = circlesFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CirclesFragment$onViewCreated$3(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CirclesFragment$onViewCreated$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C2887s viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
            Lifecycle.State state = Lifecycle.State.STARTED;
            final CirclesFragment circlesFragment = this.this$0;
            C114961 r3 = new C114961((C19340c<? super C114961>) null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m6783b(viewLifecycleOwner, state, r3, this) == coroutineSingletons) {
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
