package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class LazyGridStateKt$rememberLazyGridState$1 extends Lambda implements C19846a<LazyGridState> {
    public final /* synthetic */ int $initialFirstVisibleItemIndex;
    public final /* synthetic */ int $initialFirstVisibleItemScrollOffset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridStateKt$rememberLazyGridState$1(int i, int i2) {
        super(0);
        this.$initialFirstVisibleItemIndex = i;
        this.$initialFirstVisibleItemScrollOffset = i2;
    }

    public final LazyGridState invoke() {
        return new LazyGridState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
