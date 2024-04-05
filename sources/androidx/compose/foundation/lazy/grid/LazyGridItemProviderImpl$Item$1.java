package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class LazyGridItemProviderImpl$Item$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $index;
    public final /* synthetic */ LazyGridItemProviderImpl $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderImpl$Item$1(LazyGridItemProviderImpl lazyGridItemProviderImpl, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = lazyGridItemProviderImpl;
        this.$index = i;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp0_rcvr.mo4199c(this.$index, dVar, this.$$changed | 1);
    }
}
