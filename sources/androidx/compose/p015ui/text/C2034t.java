package androidx.compose.p015ui.text;

import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1958l;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2025a;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.p015ui.text.style.C2031f;
import androidx.compose.p015ui.text.style.C2032g;
import androidx.compose.p015ui.text.style.C2033h;
import androidx.compose.p015ui.text.style.TextDrawStyle;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p157k0.C7175c;

/* renamed from: androidx.compose.ui.text.t */
public final class C2034t {

    /* renamed from: androidx.compose.ui.text.t$a */
    public /* synthetic */ class C2035a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4623a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f4623a = iArr;
        }
    }

    /* renamed from: a */
    public static final C2023s m4482a(C2023s sVar, LayoutDirection layoutDirection) {
        C2023s sVar2 = sVar;
        C19383o.m32797g(sVar2, "style");
        C19383o.m32797g(layoutDirection, "direction");
        C2012n nVar = sVar2.f4599a;
        int i = C2013o.f4555e;
        C19383o.m32797g(nVar, "style");
        TextDrawStyle c = nVar.f4536a.mo7765c(SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE);
        long j = C0114h.m307l0(nVar.f4537b) ? C2013o.f4551a : nVar.f4537b;
        C1959m mVar = nVar.f4538c;
        if (mVar == null) {
            mVar = C1959m.f4413g;
        }
        C1959m mVar2 = mVar;
        C1957k kVar = nVar.f4539d;
        C1957k kVar2 = new C1957k(kVar != null ? kVar.f4407a : 0);
        C1958l lVar = nVar.f4540e;
        C1958l lVar2 = new C1958l(lVar != null ? lVar.f4408a : 1);
        C1952g gVar = nVar.f4541f;
        if (gVar == null) {
            gVar = C1952g.f4396b;
        }
        C1952g gVar2 = gVar;
        String str = nVar.f4542g;
        if (str == null) {
            str = "";
        }
        long j2 = C0114h.m307l0(nVar.f4543h) ? C2013o.f4552b : nVar.f4543h;
        C2025a aVar = nVar.f4544i;
        C2025a aVar2 = new C2025a(aVar != null ? aVar.f4603a : 0.0f);
        C2032g gVar3 = nVar.f4545j;
        if (gVar3 == null) {
            gVar3 = C2032g.f4617c;
        }
        C2032g gVar4 = gVar3;
        C7175c cVar = nVar.f4546k;
        if (cVar == null) {
            cVar = C7175c.C7176a.m13834a();
        }
        C7175c cVar2 = cVar;
        C2025a aVar3 = aVar2;
        long j3 = nVar.f4547l;
        if (!(j3 != C1545s.f3364i)) {
            j3 = C2013o.f4553c;
        }
        long j4 = j3;
        C2030e eVar = nVar.f4548m;
        if (eVar == null) {
            eVar = C2030e.f4612b;
        }
        C2030e eVar2 = eVar;
        C1528j0 j0Var = nVar.f4549n;
        if (j0Var == null) {
            j0Var = C1528j0.f3322d;
        }
        C2025a aVar4 = aVar3;
        C2012n nVar2 = new C2012n(c, j, mVar2, kVar2, lVar2, gVar2, str, j2, aVar3, gVar4, cVar2, j4, eVar2, j0Var, nVar.f4550o);
        C1978h hVar = sVar2.f4600b;
        int i2 = C1979i.f4446b;
        C19383o.m32797g(hVar, "style");
        C2029d dVar = hVar.f4439a;
        int i3 = 5;
        C2029d dVar2 = new C2029d(dVar != null ? dVar.f4611a : 5);
        C2031f fVar = hVar.f4440b;
        if (fVar != null && fVar.f4616a == 3) {
            int i4 = C2035a.f4623a[layoutDirection.ordinal()];
            if (i4 == 1) {
                i3 = 4;
            } else if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (fVar == null) {
            int i5 = C2035a.f4623a[layoutDirection.ordinal()];
            if (i5 == 1) {
                i3 = 1;
            } else if (i5 == 2) {
                i3 = 2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i3 = fVar.f4616a;
        }
        C2031f fVar2 = new C2031f(i3);
        long j5 = C0114h.m307l0(hVar.f4441c) ? C1979i.f4445a : hVar.f4441c;
        C2033h hVar2 = hVar.f4442d;
        if (hVar2 == null) {
            hVar2 = C2033h.f4620c;
        }
        return new C2023s(nVar2, new C1978h(dVar2, fVar2, j5, hVar2, hVar.f4443e, hVar.f4444f), sVar2.f4601c);
    }
}
