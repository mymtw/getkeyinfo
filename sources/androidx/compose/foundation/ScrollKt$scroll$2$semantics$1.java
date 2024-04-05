package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.semantics.C1901h;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

public final class ScrollKt$scroll$2$semantics$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ C19525d0 $coroutineScope;
    public final /* synthetic */ boolean $isScrollable;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ boolean $reverseScrolling;
    public final /* synthetic */ ScrollState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1(boolean z, boolean z2, boolean z3, ScrollState scrollState, C19525d0 d0Var) {
        super(1);
        this.$reverseScrolling = z;
        this.$isVertical = z2;
        this.$isScrollable = z3;
        this.$state = scrollState;
        this.$coroutineScope = d0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        C1901h hVar = new C1901h(new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(this.$state), new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(this.$state), this.$reverseScrolling);
        if (this.$isVertical) {
            C1908o.m4203j(qVar, hVar);
        } else {
            C1908o.m4201h(qVar, hVar);
        }
        if (this.$isScrollable) {
            final C19525d0 d0Var = this.$coroutineScope;
            final boolean z = this.$isVertical;
            final ScrollState scrollState = this.$state;
            C1908o.m4199f(qVar, new C19861p<Float, Float, Boolean>() {

                @C19060c(mo70540c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", mo70541f = "Scroll.kt", mo70542l = {276, 278}, mo70543m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1 */
                public static final class C05421 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        return new C05421(z, scrollState, f3, f4, cVar);
                    }

                    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
                        return ((C05421) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            C0761x.m1684O0(obj);
                            if (z) {
                                ScrollState scrollState = scrollState;
                                float f = f3;
                                this.label = 1;
                                if (ScrollExtensionsKt.m1396b(scrollState, f, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                ScrollState scrollState2 = scrollState;
                                float f2 = f4;
                                this.label = 2;
                                if (ScrollExtensionsKt.m1396b(scrollState2, f2, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else if (i == 1 || i == 2) {
                            C0761x.m1684O0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return C19394m.f43287a;
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }

                public final Boolean invoke(float f, float f2) {
                    C19525d0 d0Var = d0Var;
                    final boolean z = z;
                    final ScrollState scrollState = scrollState;
                    final float f3 = f2;
                    final float f4 = f;
                    C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C05421((C19340c<? super C05421>) null), 3);
                    return Boolean.TRUE;
                }
            });
        }
    }
}
