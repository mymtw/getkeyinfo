package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 extends Lambda implements C19857l<LazyGridSpanLayoutProvider.C0793a, Integer> {
    public final /* synthetic */ int $itemIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(int i) {
        super(1);
        this.$itemIndex = i;
    }

    public final Integer invoke(LazyGridSpanLayoutProvider.C0793a aVar) {
        C19383o.m32797g(aVar, "it");
        return Integer.valueOf(aVar.f1668a - this.$itemIndex);
    }
}
