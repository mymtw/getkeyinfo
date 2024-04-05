package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.draw.DrawModifierKt$drawWithCache$2 */
final class DrawModifierKt$drawWithCache$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C19857l<C1440b, C1445g> $onBuildDrawCache;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawModifierKt$drawWithCache$2(C19857l<? super C1440b, C1445g> lVar) {
        super(3);
        this.$onBuildDrawCache = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-1689569019);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = new C1440b();
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C1436d i0 = dVar.mo6148i0(new C1443e((C1440b) v, this.$onBuildDrawCache));
        dVar2.mo5406H();
        return i0;
    }
}
