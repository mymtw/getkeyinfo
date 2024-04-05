package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1696m0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.runtime.C1302d;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19863r;

final class BackdropScaffoldKt$BackdropStack$1$1 extends Lambda implements C19861p<C1696m0, C7280a, C1712w> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $backLayer;
    public final /* synthetic */ C19857l<C7280a, C7280a> $calculateBackLayerConstraints;
    public final /* synthetic */ C19863r<C7280a, Float, C1302d, Integer, C19394m> $frontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$1$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19857l<? super C7280a, C7280a> lVar, C19863r<? super C7280a, ? super Float, ? super C1302d, ? super Integer, C19394m> rVar, int i) {
        super(2);
        this.$backLayer = pVar;
        this.$calculateBackLayerConstraints = lVar;
        this.$frontLayer = rVar;
        this.$$dirty = i;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34743invoke0kLqBqw((C1696m0) obj, ((C7280a) obj2).f16152a);
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final C1712w m34743invoke0kLqBqw(C1696m0 m0Var, long j) {
        C19383o.m32797g(m0Var, "$this$SubcomposeLayout");
        final C1686i0 J = ((C1710u) C19327t.m32638T0(m0Var.mo6700T(BackdropLayers.Back, this.$backLayer))).mo6665J(this.$calculateBackLayerConstraints.invoke(new C7280a(j)).f16152a);
        List<C1710u> T = m0Var.mo6700T(BackdropLayers.Front, C18263b.m30807B(new BackdropScaffoldKt$BackdropStack$1$1$placeables$1(this.$frontLayer, j, (float) J.f3723c, this.$$dirty), -1222642649, true));
        final ArrayList arrayList = new ArrayList(T.size());
        int size = T.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(T.get(i).mo6665J(j));
        }
        int max = Math.max(C7280a.m13965j(j), J.f3722b);
        int max2 = Math.max(C7280a.m13964i(j), J.f3723c);
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1686i0 i0Var = (C1686i0) arrayList.get(i2);
            max = Math.max(max, i0Var.f3722b);
            max2 = Math.max(max2, i0Var.f3723c);
        }
        return m0Var.mo4387Z(max, max2, C19294b0.m32559p0(), new C19857l<C1686i0.C1687a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1686i0.C1687a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C1686i0.C1687a aVar) {
                C19383o.m32797g(aVar, "$this$layout");
                C1686i0.C1687a.m3583e(aVar, J, 0, 0);
                List<C1686i0> list = arrayList;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C1686i0.C1687a.m3583e(aVar, list.get(i), 0, 0);
                }
            }
        });
    }
}
