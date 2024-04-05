package androidx.compose.foundation.lazy.layout;

import androidx.compose.p015ui.layout.SubcomposeLayoutState;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C0839c $itemContentFactory;
    public final /* synthetic */ C0845h $prefetchState;
    public final /* synthetic */ SubcomposeLayoutState $subcomposeLayoutState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(C0845h hVar, C0839c cVar, SubcomposeLayoutState subcomposeLayoutState, int i) {
        super(2);
        this.$prefetchState = hVar;
        this.$itemContentFactory = cVar;
        this.$subcomposeLayoutState = subcomposeLayoutState;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        LazyLayoutPrefetcher_androidKt.m1864a(this.$prefetchState, this.$itemContentFactory, this.$subcomposeLayoutState, dVar, this.$$changed | 1);
    }
}
