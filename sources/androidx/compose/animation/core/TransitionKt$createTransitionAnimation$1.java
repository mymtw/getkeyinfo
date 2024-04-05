package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class TransitionKt$createTransitionAnimation$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ Transition<Object> $this_createTransitionAnimation;
    public final /* synthetic */ Transition<Object>.d<Object, Object> $transitionAnimation;

    /* renamed from: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$a */
    public static final class C0408a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ Transition f1072a;

        /* renamed from: b */
        public final /* synthetic */ Transition.C0404d f1073b;

        public C0408a(Transition transition, Transition.C0404d dVar) {
            this.f1072a = transition;
            this.f1073b = dVar;
        }

        public final void dispose() {
            Transition transition = this.f1072a;
            Transition.C0404d dVar = this.f1073b;
            transition.getClass();
            C19383o.m32797g(dVar, ResponseConstants.ANIMATION);
            transition.f1042h.remove((Object) dVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$createTransitionAnimation$1(Transition<Object> transition, Transition<Object>.d<Object, Object> dVar) {
        super(1);
        this.$this_createTransitionAnimation = transition;
        this.$transitionAnimation = dVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        Transition<Object> transition = this.$this_createTransitionAnimation;
        Transition<Object>.d<Object, Object> dVar = this.$transitionAnimation;
        transition.getClass();
        C19383o.m32797g(dVar, ResponseConstants.ANIMATION);
        transition.f1042h.add(dVar);
        return new C0408a(this.$this_createTransitionAnimation, this.$transitionAnimation);
    }
}
