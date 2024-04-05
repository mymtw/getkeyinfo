package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$1 extends Lambda implements C19846a<Float> {
    public final /* synthetic */ LazyGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$1(LazyGridState lazyGridState) {
        super(0);
        this.$state = lazyGridState;
    }

    public final Float invoke() {
        return Float.valueOf((((float) this.$state.mo4314f()) / 100000.0f) + ((float) this.$state.mo4313e()));
    }
}
