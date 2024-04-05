package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1 extends Lambda implements C19846a<Float> {
    public final /* synthetic */ LazyListState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1(LazyListState lazyListState) {
        super(0);
        this.$state = lazyListState;
    }

    public final Float invoke() {
        return Float.valueOf((((float) this.$state.mo4225f()) / 100000.0f) + ((float) this.$state.mo4224e()));
    }
}
