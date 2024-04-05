package com.etsy.android.p327ui.home.editorspicks;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
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

@C19060c(mo70540c = "com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$onViewCreated$1", mo70541f = "EditorsPicksFragment.kt", mo70542l = {138}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$onViewCreated$1 */
public final class EditorsPicksFragment$onViewCreated$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ EditorsPicksFragment this$0;

    @C19060c(mo70540c = "com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$onViewCreated$1$1", mo70541f = "EditorsPicksFragment.kt", mo70542l = {139}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$onViewCreated$1$1 */
    public static final class C99221 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        /* renamed from: com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$onViewCreated$1$1$a */
        public static final class C9923a implements C19600e<C9938f> {

            /* renamed from: b */
            public final /* synthetic */ EditorsPicksFragment f21879b;

            public C9923a(EditorsPicksFragment editorsPicksFragment) {
                this.f21879b = editorsPicksFragment;
            }

            public final Object emit(Object obj, C19340c cVar) {
                this.f21879b.handleState((C9938f) obj);
                return C19394m.f43287a;
            }
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C99221(editorsPicksFragment, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C99221) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                StateFlowImpl stateFlowImpl = editorsPicksFragment.getEditorsPicksViewModel().f21903e;
                C9923a aVar = new C9923a(editorsPicksFragment);
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
    public EditorsPicksFragment$onViewCreated$1(EditorsPicksFragment editorsPicksFragment, C19340c<? super EditorsPicksFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.this$0 = editorsPicksFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new EditorsPicksFragment$onViewCreated$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((EditorsPicksFragment$onViewCreated$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C2887s viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
            Lifecycle.State state = Lifecycle.State.STARTED;
            final EditorsPicksFragment editorsPicksFragment = this.this$0;
            C99221 r3 = new C99221((C19340c<? super C99221>) null);
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
