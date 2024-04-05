package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class TransitionKt$createDeferredAnimation$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ Transition<Object>.a<Object, Object> $lazyAnim;
    public final /* synthetic */ Transition<Object> $this_createDeferredAnimation;

    /* renamed from: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$a */
    public static final class C0407a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ Transition f1070a;

        /* renamed from: b */
        public final /* synthetic */ Transition.C0400a f1071b;

        public C0407a(Transition transition, Transition.C0400a aVar) {
            this.f1070a = transition;
            this.f1071b = aVar;
        }

        public final void dispose() {
            Transition<S>.d<T, V> dVar;
            Transition transition = this.f1070a;
            Transition.C0400a aVar = this.f1071b;
            transition.getClass();
            C19383o.m32797g(aVar, "deferredAnimation");
            Transition<S>.a<T, V>.a<T, V> aVar2 = aVar.f1049c;
            if (aVar2 != null && (dVar = aVar2.f1051b) != null) {
                transition.f1042h.remove((Object) dVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransitionKt$createDeferredAnimation$1(Transition<Object> transition, Transition<Object>.a<Object, Object> aVar) {
        super(1);
        this.$this_createDeferredAnimation = transition;
        this.$lazyAnim = aVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C0407a(this.$this_createDeferredAnimation, this.$lazyAnim);
    }
}
