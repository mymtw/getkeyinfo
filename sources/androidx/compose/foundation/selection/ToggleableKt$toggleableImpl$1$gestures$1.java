package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.C0612j;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1652w;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1", mo70541f = "Toggleable.kt", mo70542l = {270}, mo70543m = "invokeSuspend")
public final class ToggleableKt$toggleableImpl$1$gestures$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1342k1<C19846a<Boolean>> $delayPressInteraction;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1342k1<C19846a<C19394m>> $onClickState;
    public final /* synthetic */ C1338j0<C0643m> $pressedInteraction;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$1", mo70541f = "Toggleable.kt", mo70542l = {273}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$1 */
    public static final class C08901 extends SuspendLambda implements C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> {
        public /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        public int label;

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m34701invoked4ec7I((C0612j) obj, ((C8343c) obj2).f18299a, (C19340c) obj3);
        }

        /* renamed from: invoke-d-4ec7I  reason: not valid java name */
        public final Object m34701invoked4ec7I(C0612j jVar, long j, C19340c<? super C19394m> cVar) {
            C08901 r0 = new C08901(z, jVar, j0Var, k1Var, cVar);
            r0.L$0 = jVar;
            r0.J$0 = j;
            return r0.invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C0612j jVar = (C0612j) this.L$0;
                long j = this.J$0;
                if (z) {
                    C0640j jVar2 = jVar;
                    C1338j0<C0643m> j0Var = j0Var;
                    C1342k1<C19846a<Boolean>> k1Var = k1Var;
                    this.label = 1;
                    if (ClickableKt.m1301g(jVar, j, jVar2, j0Var, k1Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public ToggleableKt$toggleableImpl$1$gestures$1(boolean z, C0640j jVar, C1338j0<C0643m> j0Var, C1342k1<? extends C19846a<Boolean>> k1Var, C1342k1<? extends C19846a<C19394m>> k1Var2, C19340c<? super ToggleableKt$toggleableImpl$1$gestures$1> cVar) {
        super(2, cVar);
        this.$enabled = z;
        this.$interactionSource = jVar;
        this.$pressedInteraction = j0Var;
        this.$delayPressInteraction = k1Var;
        this.$onClickState = k1Var2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ToggleableKt$toggleableImpl$1$gestures$1 toggleableKt$toggleableImpl$1$gestures$1 = new ToggleableKt$toggleableImpl$1$gestures$1(this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, this.$onClickState, cVar);
        toggleableKt$toggleableImpl$1$gestures$1.L$0 = obj;
        return toggleableKt$toggleableImpl$1$gestures$1;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((ToggleableKt$toggleableImpl$1$gestures$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final boolean z = this.$enabled;
            final C0640j jVar = this.$interactionSource;
            final C1338j0<C0643m> j0Var = this.$pressedInteraction;
            final C1342k1<C19846a<Boolean>> k1Var = this.$delayPressInteraction;
            C08901 r3 = new C08901((C19340c<? super C08901>) null);
            final boolean z2 = this.$enabled;
            final C1342k1<C19846a<C19394m>> k1Var2 = this.$onClickState;
            C08912 r32 = new C19857l<C8343c, C19394m>() {
                public /* synthetic */ Object invoke(Object obj) {
                    m34702invokek4lQ0M(((C8343c) obj).f18299a);
                    return C19394m.f43287a;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m34702invokek4lQ0M(long j) {
                    if (z2) {
                        k1Var2.getValue().invoke();
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.m1412d((C1652w) this.L$0, r3, r32, this) == coroutineSingletons) {
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
