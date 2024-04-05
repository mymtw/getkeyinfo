package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class SwipeableKt$rememberSwipeableState$2 extends Lambda implements C19846a<SwipeableState<Object>> {
    public final /* synthetic */ C0422e<Float> $animationSpec;
    public final /* synthetic */ C19857l<Object, Boolean> $confirmStateChange;
    public final /* synthetic */ Object $initialValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$rememberSwipeableState$2(Object obj, C0422e<Float> eVar, C19857l<Object, Boolean> lVar) {
        super(0);
        this.$initialValue = obj;
        this.$animationSpec = eVar;
        this.$confirmStateChange = lVar;
    }

    public final SwipeableState<Object> invoke() {
        return new SwipeableState<>(this.$initialValue, this.$animationSpec, this.$confirmStateChange);
    }
}
