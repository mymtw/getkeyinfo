package androidx.compose.material;

import android.support.p013v4.media.C0073e;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0739i;
import androidx.compose.foundation.layout.C0742j;
import androidx.compose.foundation.layout.C0755r;
import androidx.compose.foundation.layout.C0757t;
import androidx.compose.foundation.layout.C0758u;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p010a9.C0048b;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

public final class MenuKt$DropdownMenuContent$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$2(C1436d dVar, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, int i) {
        super(2);
        this.$modifier = dVar;
        this.$content = qVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1436d dVar2;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d H0 = C15588c1.m25283H0(this.$modifier, 0.0f, MenuKt.f2222d, 1);
            IntrinsicSize intrinsicSize = IntrinsicSize.Max;
            C19383o.m32797g(H0, "<this>");
            C19383o.m32797g(intrinsicSize, "intrinsicSize");
            int i2 = C0755r.f1549a[intrinsicSize.ordinal()];
            if (i2 == 1) {
                dVar2 = H0.mo6148i0(C0758u.f1553b);
            } else if (i2 == 2) {
                dVar2 = H0.mo6148i0(C0757t.f1552b);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C1436d c = ScrollKt.m1317c(dVar2, ScrollKt.m1315a(dVar));
            C19862q<C0739i, C1302d, Integer, C19394m> qVar = this.$content;
            int i3 = this.$$dirty & 7168;
            dVar.mo5465u(-483455358);
            C1711v a = ColumnKt.m1461a(C0718d.f1478c, C1428a.C1429a.f3116l, dVar);
            dVar.mo5465u(-1323940314);
            C7282b bVar = (C7282b) dVar.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) dVar.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) dVar.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a2 = C1700o.m3617a(c);
            int i4 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
            if (dVar.mo5446k() instanceof C1299c) {
                dVar.mo5392A();
                if (dVar.mo5436f()) {
                    dVar.mo5450m(aVar);
                } else {
                    dVar.mo5452n();
                }
                dVar.mo5394B();
                Updater.m2571b(dVar, a, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(dVar, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(dVar, layoutDirection, ComposeUiNode.Companion.f3782f);
                a2.invoke(C0073e.m204d(dVar, j1Var, ComposeUiNode.Companion.f3783g, dVar), dVar, Integer.valueOf((i4 >> 3) & 112));
                dVar.mo5465u(2058660585);
                dVar.mo5465u(-1163856341);
                if (((i4 >> 9) & 14 & 11) != 2 || !dVar.mo5442i()) {
                    qVar.invoke(C0742j.f1527a, dVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                } else {
                    dVar.mo5396C();
                }
                C0048b.m166e(dVar);
                return;
            }
            C0005b.m45j0();
            throw null;
        }
        dVar.mo5396C();
    }
}
