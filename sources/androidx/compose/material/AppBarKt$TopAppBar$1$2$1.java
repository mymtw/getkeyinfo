package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p753kq.C19861p;

public final class AppBarKt$TopAppBar$1$2$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$1$2$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$title = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            CompositionLocalKt.m2530a(new C1412t0[]{ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C19543e0.m33301S(dVar)))}, this.$title, dVar, ((this.$$dirty << 3) & 112) | 8);
            return;
        }
        dVar.mo5396C();
    }
}
