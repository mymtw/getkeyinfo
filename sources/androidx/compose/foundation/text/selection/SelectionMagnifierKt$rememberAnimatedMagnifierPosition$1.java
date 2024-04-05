package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0428h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1333i1;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19835w1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19665q1;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", mo70541f = "SelectionMagnifier.kt", mo70542l = {88}, mo70543m = "invokeSuspend")
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Animatable<C8343c, C0428h> $animatable;
    public final /* synthetic */ C1342k1<C8343c> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    public int label;

    /* renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$a */
    public static final class C0978a implements C19600e<C8343c> {

        /* renamed from: b */
        public final /* synthetic */ Animatable<C8343c, C0428h> f2063b;

        /* renamed from: c */
        public final /* synthetic */ C19525d0 f2064c;

        public C0978a(Animatable<C8343c, C0428h> animatable, C19525d0 d0Var) {
            this.f2063b = animatable;
            this.f2064c = d0Var;
        }

        public final Object emit(Object obj, C19340c cVar) {
            long j = ((C8343c) obj).f18299a;
            if (C19421p.m32928R(this.f2063b.mo3375e().f18299a) && C19421p.m32928R(j)) {
                if (!(C8343c.m16643d(this.f2063b.mo3375e().f18299a) == C8343c.m16643d(j))) {
                    C19835w1 f = C19697g.m33468f(this.f2064c, (CoroutineContext) null, (CoroutineStart) null, new C0979x2d93455c(this.f2063b, j, (C19340c<? super C0979x2d93455c>) null), 3);
                    return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : C19394m.f43287a;
                }
            }
            Object f2 = this.f2063b.mo3376f(new C8343c(j), cVar);
            return f2 == CoroutineSingletons.COROUTINE_SUSPENDED ? f2 : C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(C1342k1<C8343c> k1Var, Animatable<C8343c, C0428h> animatable, C19340c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1> cVar) {
        super(2, cVar);
        this.$targetValue$delegate = k1Var;
        this.$animatable = animatable;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$targetValue$delegate, this.$animatable, cVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C1342k1<C8343c> k1Var = this.$targetValue$delegate;
            C19665q1 b = C1333i1.m2796b(new C19846a<C8343c>() {
                public /* synthetic */ Object invoke() {
                    return new C8343c(m34721invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0  reason: not valid java name */
                public final long m34721invokeF1C5BW0() {
                    C1342k1<C8343c> k1Var = k1Var;
                    C0428h hVar = SelectionMagnifierKt.f2059a;
                    return k1Var.getValue().f18299a;
                }
            });
            C0978a aVar = new C0978a(this.$animatable, (C19525d0) this.L$0);
            this.label = 1;
            if (b.collect(aVar, this) == coroutineSingletons) {
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
