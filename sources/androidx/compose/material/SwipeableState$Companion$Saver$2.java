package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SwipeableState$Companion$Saver$2 extends Lambda implements C19857l<Object, SwipeableState<Object>> {
    public final /* synthetic */ C0422e<Float> $animationSpec;
    public final /* synthetic */ C19857l<Object, Boolean> $confirmStateChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$Companion$Saver$2(C0422e<Float> eVar, C19857l<Object, Boolean> lVar) {
        super(1);
        this.$animationSpec = eVar;
        this.$confirmStateChange = lVar;
    }

    public final SwipeableState<Object> invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        return new SwipeableState<>(obj, this.$animationSpec, this.$confirmStateChange);
    }
}
