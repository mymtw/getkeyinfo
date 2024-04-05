package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class LazyListStateKt$rememberLazyListState$1 extends Lambda implements C19846a<LazyListState> {
    public final /* synthetic */ int $initialFirstVisibleItemIndex;
    public final /* synthetic */ int $initialFirstVisibleItemScrollOffset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListStateKt$rememberLazyListState$1(int i, int i2) {
        super(0);
        this.$initialFirstVisibleItemIndex = i;
        this.$initialFirstVisibleItemScrollOffset = i2;
    }

    public final LazyListState invoke() {
        return new LazyListState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
