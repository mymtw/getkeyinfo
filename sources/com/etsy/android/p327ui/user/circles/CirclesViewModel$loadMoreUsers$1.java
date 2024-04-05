package com.etsy.android.p327ui.user.circles;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.user.circles.C11509d;
import com.etsy.android.p327ui.user.circles.CirclesViewModel;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.StateFlowImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.user.circles.CirclesViewModel$loadMoreUsers$1", mo70541f = "CirclesViewModel.kt", mo70542l = {58}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.user.circles.CirclesViewModel$loadMoreUsers$1 */
public final class CirclesViewModel$loadMoreUsers$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C11512e $spec;
    public int label;
    public final /* synthetic */ CirclesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CirclesViewModel$loadMoreUsers$1(CirclesViewModel circlesViewModel, C11512e eVar, C19340c<? super CirclesViewModel$loadMoreUsers$1> cVar) {
        super(2, cVar);
        this.this$0 = circlesViewModel;
        this.$spec = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CirclesViewModel$loadMoreUsers$1(this.this$0, this.$spec, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CirclesViewModel$loadMoreUsers$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            CirclesRepository circlesRepository = this.this$0.f25375b;
            C11512e eVar = this.$spec;
            this.label = 1;
            obj = circlesRepository.mo37366a(eVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11509d dVar = (C11509d) obj;
        CirclesViewModel circlesViewModel = this.this$0;
        StateFlowImpl stateFlowImpl = circlesViewModel.f25377d;
        if (dVar instanceof C11509d.C11510a) {
            C11509d.C11510a aVar = (C11509d.C11510a) dVar;
            LogCatKt.m17045a().error(aVar.f25393a);
            obj2 = new CirclesViewModel.C11501a.C11502a(aVar.f25393a);
        } else if (dVar instanceof C11509d.C11511b) {
            obj2 = new CirclesViewModel.C11501a.C11505d(C19327t.m32650f1(((C11509d.C11511b) dVar).f25395a, circlesViewModel.f25381h));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        stateFlowImpl.setValue(obj2);
        return C19394m.f43287a;
    }
}
