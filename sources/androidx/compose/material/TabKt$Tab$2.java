package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class TabKt$Tab$2 extends Lambda implements C19862q<C0739i, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $styledText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$2(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i) {
        super(3);
        this.$styledText = pVar;
        this.$icon = pVar2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0739i) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0739i iVar, C1302d dVar, int i) {
        C19383o.m32797g(iVar, "$this$Tab");
        if ((i & 81) != 16 || !dVar.mo5442i()) {
            TabKt.m2258d(this.$styledText, this.$icon, dVar, (this.$$dirty >> 12) & 112);
        } else {
            dVar.mo5396C();
        }
    }
}
