package androidx.compose.animation.core;

import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class TransitionKt$updateTransition$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ Transition<T> $transition;

    /* renamed from: androidx.compose.animation.core.TransitionKt$updateTransition$1$a */
    public static final class C0409a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ Transition f1074a;

        public C0409a(Transition transition) {
            this.f1074a = transition;
        }

        public final void dispose() {
            this.f1074a.mo3415g();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$updateTransition$1(Transition<T> transition) {
        super(1);
        this.$transition = transition;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C0409a(this.$transition);
    }
}
