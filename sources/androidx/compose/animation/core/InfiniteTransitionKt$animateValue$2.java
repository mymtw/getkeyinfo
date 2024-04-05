package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class InfiniteTransitionKt$animateValue$2 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ InfiniteTransition $this_animateValue;
    public final /* synthetic */ InfiniteTransition.C0394a<Object, Object> $transitionAnimation;

    /* renamed from: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$a */
    public static final class C0398a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ InfiniteTransition f1031a;

        /* renamed from: b */
        public final /* synthetic */ InfiniteTransition.C0394a f1032b;

        public C0398a(InfiniteTransition infiniteTransition, InfiniteTransition.C0394a aVar) {
            this.f1031a = infiniteTransition;
            this.f1032b = aVar;
        }

        public final void dispose() {
            InfiniteTransition infiniteTransition = this.f1031a;
            InfiniteTransition.C0394a aVar = this.f1032b;
            infiniteTransition.getClass();
            C19383o.m32797g(aVar, ResponseConstants.ANIMATION);
            infiniteTransition.f1017a.mo20241o(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$2(InfiniteTransition infiniteTransition, InfiniteTransition.C0394a<Object, Object> aVar) {
        super(1);
        this.$this_animateValue = infiniteTransition;
        this.$transitionAnimation = aVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        InfiniteTransition infiniteTransition = this.$this_animateValue;
        InfiniteTransition.C0394a<Object, Object> aVar = this.$transitionAnimation;
        infiniteTransition.getClass();
        C19383o.m32797g(aVar, ResponseConstants.ANIMATION);
        infiniteTransition.f1017a.mo20232c(aVar);
        infiniteTransition.f1018b.setValue(Boolean.TRUE);
        return new C0398a(this.$this_animateValue, this.$transitionAnimation);
    }
}
