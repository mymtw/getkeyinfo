package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$2 extends Lambda implements C19846a<Float> {
    public final /* synthetic */ C0807i $itemProvider;
    public final /* synthetic */ LazyGridState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$2(LazyGridState lazyGridState, C0807i iVar) {
        super(0);
        this.$state = lazyGridState;
        this.$itemProvider = iVar;
    }

    public final Float invoke() {
        float f;
        LazyGridState lazyGridState = this.$state;
        if (lazyGridState.f1691s) {
            f = ((float) this.$itemProvider.getItemCount()) + 1.0f;
        } else {
            f = ((float) lazyGridState.mo4313e()) + (((float) this.$state.mo4314f()) / 100000.0f);
        }
        return Float.valueOf(f);
    }
}
