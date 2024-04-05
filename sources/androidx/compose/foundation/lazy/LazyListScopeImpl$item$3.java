package androidx.compose.foundation.lazy;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;
import p753kq.C19863r;

final class LazyListScopeImpl$item$3 extends Lambda implements C19863r<C0777d, Integer, C1302d, Integer, C19394m> {
    public final /* synthetic */ C19862q<C0777d, C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListScopeImpl$item$3(C19862q<? super C0777d, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(4);
        this.$content = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C0777d) obj, ((Number) obj2).intValue(), (C1302d) obj3, ((Number) obj4).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0777d dVar, int i, C1302d dVar2, int i2) {
        C19383o.m32797g(dVar, "$this$$receiver");
        if ((i2 & 14) == 0) {
            i2 |= dVar2.mo5408I(dVar) ? 4 : 2;
        }
        if ((i2 & 651) != 130 || !dVar2.mo5442i()) {
            this.$content.invoke(dVar, dVar2, Integer.valueOf(i2 & 14));
        } else {
            dVar2.mo5396C();
        }
    }
}
