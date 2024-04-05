package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.text.C2012n;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.C2034t;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1958l;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p174m0.C7282b;
import p174m0.C7290i;
import p753kq.C19857l;
import p753kq.C19862q;

final class TextFieldSizeKt$textFieldMinSize$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C2023s $style;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1(C2023s sVar) {
        super(3);
        this.$style = sVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(1582736677);
        C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
        C1952g.C1953a aVar = (C1952g.C1953a) dVar2.mo5410J(CompositionLocalsKt.f4022h);
        LayoutDirection layoutDirection = (LayoutDirection) dVar2.mo5410J(CompositionLocalsKt.f4025k);
        C2023s sVar = this.$style;
        dVar2.mo5465u(511388516);
        boolean I = dVar2.mo5408I(sVar) | dVar2.mo5408I(layoutDirection);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = C2034t.m4482a(sVar, layoutDirection);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C2023s sVar2 = (C2023s) v;
        dVar2.mo5465u(511388516);
        boolean I2 = dVar2.mo5408I(aVar) | dVar2.mo5408I(sVar2);
        Object v2 = dVar2.mo5467v();
        if (I2 || v2 == C1302d.C1303a.f2828a) {
            C2012n nVar = sVar2.f4599a;
            C1952g gVar = nVar.f4541f;
            C1959m mVar = nVar.f4538c;
            if (mVar == null) {
                mVar = C1959m.f4413g;
            }
            C1957k kVar = nVar.f4539d;
            int i2 = kVar != null ? kVar.f4407a : 0;
            C1958l lVar = nVar.f4540e;
            v2 = aVar.mo7537a(gVar, mVar, i2, lVar != null ? lVar.f4408a : 1);
            dVar2.mo5454o(v2);
        }
        dVar2.mo5406H();
        C1342k1 k1Var = (C1342k1) v2;
        C2023s sVar3 = this.$style;
        dVar2.mo5465u(-492369756);
        Object v3 = dVar2.mo5467v();
        C0964q qVar = v3;
        if (v3 == C1302d.C1303a.f2828a) {
            C0964q qVar2 = new C0964q(layoutDirection, bVar, aVar, sVar3, k1Var.getValue());
            dVar2.mo5454o(qVar2);
            qVar = qVar2;
        }
        dVar2.mo5406H();
        final C0964q qVar3 = (C0964q) qVar;
        Object value = k1Var.getValue();
        qVar3.getClass();
        C19383o.m32797g(layoutDirection, "layoutDirection");
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(aVar, "fontFamilyResolver");
        C19383o.m32797g(sVar2, "resolvedStyle");
        C19383o.m32797g(value, "typeface");
        if (layoutDirection != qVar3.f2036a || !C19383o.m32792b(bVar, qVar3.f2037b) || !C19383o.m32792b(aVar, qVar3.f2038c) || !C19383o.m32792b(sVar2, qVar3.f2039d) || !C19383o.m32792b(value, qVar3.f2040e)) {
            qVar3.f2036a = layoutDirection;
            qVar3.f2037b = bVar;
            qVar3.f2038c = aVar;
            qVar3.f2039d = sVar2;
            qVar3.f2040e = value;
            qVar3.f2041f = C0960n.m1999a(sVar2, bVar, aVar, C0960n.f2024a, 1);
        }
        C1436d v0 = C15588c1.m25352v0(C1436d.C1437a.f3125b, new C19862q<C1713x, C1710u, C7280a, C1712w>() {
            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m34713invoke3p2s80s((C1713x) obj, (C1710u) obj2, ((C7280a) obj3).f16152a);
            }

            /* renamed from: invoke-3p2s80s  reason: not valid java name */
            public final C1712w m34713invoke3p2s80s(C1713x xVar, C1710u uVar, long j) {
                C1713x xVar2 = xVar;
                C1710u uVar2 = uVar;
                C19383o.m32797g(xVar2, "$this$layout");
                C19383o.m32797g(uVar2, "measurable");
                SizeKt.m1484d(C1436d.C1437a.f3125b, 0.0f, 3);
                long j2 = qVar3.f2041f;
                final C1686i0 J = uVar2.mo6665J(C7280a.m13956a(j, C19388s.m32833M((int) (j2 >> 32), C7280a.m13965j(j), C7280a.m13963h(j)), 0, C19388s.m32833M(C7290i.m13995b(j2), C7280a.m13964i(j), C7280a.m13962g(j)), 0, 10));
                return xVar2.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new C19857l<C1686i0.C1687a, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C1686i0.C1687a) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C1686i0.C1687a aVar) {
                        C19383o.m32797g(aVar, "$this$layout");
                        C1686i0.C1687a.m3583e(aVar, J, 0, 0);
                    }
                });
            }
        });
        dVar2.mo5406H();
        return v0;
    }
}
