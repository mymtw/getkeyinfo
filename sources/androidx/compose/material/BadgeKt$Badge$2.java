package androidx.compose.material;

import android.support.p013v4.media.session.C0087d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0708a0;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1432b;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p001a0.C0005b;
import p174m0.C7282b;
import p202p.C7644f;
import p202p.C7645g;
import p504ai.C13983i;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class BadgeKt$Badge$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeKt$Badge$2(C1436d dVar, long j, long j2, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        C1436d dVar2 = this.$modifier;
        long j = this.$backgroundColor;
        long j2 = this.$contentColor;
        C19862q<C0763z, C1302d, Integer, C19394m> qVar = this.$content;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        float f = C1179e.f2415a;
        ComposerImpl h = dVar.mo5440h(1133484502);
        int i5 = i4 & 1;
        if (i5 != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(dVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= ((i4 & 2) != 0 || !h.mo5434e(j)) ? 16 : 32;
        }
        if ((i3 & 896) == 0) {
            i2 |= ((i4 & 4) != 0 || !h.mo5434e(j2)) ? 128 : 256;
        }
        int i6 = i4 & 8;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i2 |= h.mo5408I(qVar) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i2 & 5851) != 1170 || !h.mo5442i()) {
            h.mo5466u0();
            if ((i3 & 1) == 0 || h.mo5425Y()) {
                if (i5 != 0) {
                    dVar2 = C1436d.C1437a.f3125b;
                }
                if ((i4 & 2) != 0) {
                    j = ((C1259v) h.mo5410J(ColorsKt.f2187a)).mo5355b();
                    i2 &= -113;
                }
                if ((i4 & 4) != 0) {
                    j2 = ColorsKt.m2174b(j, h);
                    i2 &= -897;
                }
                if (i6 != 0) {
                    qVar = null;
                }
            } else {
                h.mo5396C();
                if ((i4 & 2) != 0) {
                    i2 &= -113;
                }
                if ((i4 & 4) != 0) {
                    i2 &= -897;
                }
            }
            int i7 = i2;
            h.mo5419S();
            float f2 = qVar != null ? C1179e.f2416b : C1179e.f2415a;
            C7644f a = C7645g.m14661a(f2);
            float f3 = f2 * ((float) 2);
            C1436d H0 = C15588c1.m25283H0(C19543e0.m33286B(C0761x.m1655A(SizeKt.m1483c(dVar2, f3, f3), j, a), a), C1179e.f2418d, 0.0f, 2);
            C1432b.C1434b bVar = C1428a.C1429a.f3114j;
            C0718d.C0720b bVar2 = C0718d.f1480e;
            h.mo5465u(693286680);
            C1711v a2 = RowKt.m1480a(bVar2, bVar, h);
            h.mo5465u(-1323940314);
            C7282b bVar3 = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a3 = C1700o.m3617a(H0);
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, a2, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar3, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                int i8 = i7;
                C0326j.m868m(0, a3, C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, 2058660585, -678309503);
                C0708a0 a0Var = C0708a0.f1463a;
                h.mo5465u(-1024875974);
                if (qVar != null) {
                    CompositionLocalKt.m2530a(new C1412t0[]{ContentColorKt.f2199a.mo5908b(new C1545s(j2))}, C18263b.m30805A(h, 1784526485, new BadgeKt$Badge$1$1(qVar, a0Var, 6, i8)), h, 56);
                }
                C0087d.m238h(h, false, false, false, true);
                h.mo5418R(false);
                h.mo5418R(false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1436d dVar3 = dVar2;
        long j3 = j;
        long j4 = j2;
        C19862q<C0763z, C1302d, Integer, C19394m> qVar2 = qVar;
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new BadgeKt$Badge$2(dVar3, j3, j4, qVar2, i3, i4);
        }
    }
}
