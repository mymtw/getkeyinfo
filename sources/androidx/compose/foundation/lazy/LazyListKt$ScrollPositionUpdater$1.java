package androidx.compose.foundation.lazy;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class LazyListKt$ScrollPositionUpdater$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C0829l $itemProvider;
    public final /* synthetic */ LazyListState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListKt$ScrollPositionUpdater$1(C0829l lVar, LazyListState lazyListState, int i) {
        super(2);
        this.$itemProvider = lVar;
        this.$state = lazyListState;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        LazyListKt.m1785b(this.$itemProvider, this.$state, dVar, this.$$changed | 1);
    }
}
