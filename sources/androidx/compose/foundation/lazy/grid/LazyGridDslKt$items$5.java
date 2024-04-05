package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19863r;

public final class LazyGridDslKt$items$5 extends Lambda implements C19863r<C0808j, Integer, C1302d, Integer, C19394m> {
    public final /* synthetic */ C19863r<C0808j, Object, C1302d, Integer, C19394m> $itemContent;
    public final /* synthetic */ List<Object> $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$items$5(C19863r<? super C0808j, Object, ? super C1302d, ? super Integer, C19394m> rVar, List<Object> list) {
        super(4);
        this.$itemContent = rVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C0808j) obj, ((Number) obj2).intValue(), (C1302d) obj3, ((Number) obj4).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0808j jVar, int i, C1302d dVar, int i2) {
        int i3;
        C19383o.m32797g(jVar, "$this$items");
        if ((i2 & 14) == 0) {
            i3 = (dVar.mo5408I(jVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= dVar.mo5432d(i) ? 32 : 16;
        }
        if ((i3 & 731) != 146 || !dVar.mo5442i()) {
            this.$itemContent.invoke(jVar, this.$items.get(i), dVar, Integer.valueOf(i3 & 14));
        } else {
            dVar.mo5396C();
        }
    }
}
