package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2 extends Lambda implements C19846a<Float> {
    public final /* synthetic */ C0829l $itemProvider;
    public final /* synthetic */ LazyListState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2(LazyListState lazyListState, C0829l lVar) {
        super(0);
        this.$state = lazyListState;
        this.$itemProvider = lVar;
    }

    public final Float invoke() {
        float f;
        LazyListState lazyListState = this.$state;
        if (lazyListState.f1617q) {
            f = ((float) this.$itemProvider.getItemCount()) + 1.0f;
        } else {
            f = ((float) lazyListState.mo4224e()) + (((float) this.$state.mo4225f()) / 100000.0f);
        }
        return Float.valueOf(f);
    }
}
