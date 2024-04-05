package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;
import p753kq.C19863r;

final class LazyGridScopeImpl$item$4 extends Lambda implements C19863r<C0808j, Integer, C1302d, Integer, C19394m> {
    public final /* synthetic */ C19862q<C0808j, C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridScopeImpl$item$4(C19862q<? super C0808j, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(4);
        this.$content = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C0808j) obj, ((Number) obj2).intValue(), (C1302d) obj3, ((Number) obj4).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0808j jVar, int i, C1302d dVar, int i2) {
        C19383o.m32797g(jVar, "$this$$receiver");
        if ((i2 & 14) == 0) {
            i2 |= dVar.mo5408I(jVar) ? 4 : 2;
        }
        if ((i2 & 651) != 130 || !dVar.mo5442i()) {
            this.$content.invoke(jVar, dVar, Integer.valueOf(i2 & 14));
        } else {
            dVar.mo5396C();
        }
    }
}
