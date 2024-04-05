package androidx.compose.animation.core;

import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class TransitionKt$createChildTransitionInternal$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ Transition<Object> $this_createChildTransitionInternal;
    public final /* synthetic */ Transition<Object> $transition;

    /* renamed from: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$a */
    public static final class C0406a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ Transition f1068a;

        /* renamed from: b */
        public final /* synthetic */ Transition f1069b;

        public C0406a(Transition transition, Transition transition2) {
            this.f1068a = transition;
            this.f1069b = transition2;
        }

        public final void dispose() {
            Transition transition = this.f1068a;
            Transition transition2 = this.f1069b;
            transition.getClass();
            C19383o.m32797g(transition2, "transition");
            transition.f1043i.remove((Object) transition2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$createChildTransitionInternal$1(Transition<Object> transition, Transition<Object> transition2) {
        super(1);
        this.$this_createChildTransitionInternal = transition;
        this.$transition = transition2;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        Transition<Object> transition = this.$this_createChildTransitionInternal;
        Transition<Object> transition2 = this.$transition;
        transition.getClass();
        C19383o.m32797g(transition2, "transition");
        transition.f1043i.add(transition2);
        return new C0406a(this.$this_createChildTransitionInternal, this.$transition);
    }
}
