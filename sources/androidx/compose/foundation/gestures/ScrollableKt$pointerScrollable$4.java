package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4", mo70541f = "Scrollable.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class ScrollableKt$pointerScrollable$4 extends SuspendLambda implements C19862q<C19525d0, Float, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1338j0<NestedScrollDispatcher> $nestedScrollDispatcher;
    public final /* synthetic */ C1342k1<ScrollingLogic> $scrollLogic;
    public /* synthetic */ float F$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4$1", mo70541f = "Scrollable.kt", mo70542l = {258}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$4$1 */
    public static final class C05821 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C05821(k1Var, f, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C05821) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                float f = f;
                this.label = 1;
                if (k1Var.getValue().mo3819c(f, this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$4(C1338j0<NestedScrollDispatcher> j0Var, C1342k1<ScrollingLogic> k1Var, C19340c<? super ScrollableKt$pointerScrollable$4> cVar) {
        super(3, cVar);
        this.$nestedScrollDispatcher = j0Var;
        this.$scrollLogic = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C19525d0) obj, ((Number) obj2).floatValue(), (C19340c<? super C19394m>) (C19340c) obj3);
    }

    public final Object invoke(C19525d0 d0Var, float f, C19340c<? super C19394m> cVar) {
        ScrollableKt$pointerScrollable$4 scrollableKt$pointerScrollable$4 = new ScrollableKt$pointerScrollable$4(this.$nestedScrollDispatcher, this.$scrollLogic, cVar);
        scrollableKt$pointerScrollable$4.F$0 = f;
        return scrollableKt$pointerScrollable$4.invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            final float f = this.F$0;
            C19525d0 d = this.$nestedScrollDispatcher.getValue().mo6538d();
            final C1342k1<ScrollingLogic> k1Var = this.$scrollLogic;
            C19697g.m33468f(d, (CoroutineContext) null, (CoroutineStart) null, new C05821((C19340c<? super C05821>) null), 3);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
