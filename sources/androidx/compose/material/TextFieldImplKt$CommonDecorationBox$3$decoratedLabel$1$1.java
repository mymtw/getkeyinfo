package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.C1978h;
import androidx.compose.p015ui.text.C1979i;
import androidx.compose.p015ui.text.C2009k;
import androidx.compose.p015ui.text.C2010l;
import androidx.compose.p015ui.text.C2012n;
import androidx.compose.p015ui.text.C2013o;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1958l;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2025a;
import androidx.compose.p015ui.text.style.C2026b;
import androidx.compose.p015ui.text.style.C2027c;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.p015ui.text.style.C2031f;
import androidx.compose.p015ui.text.style.C2032g;
import androidx.compose.p015ui.text.style.C2033h;
import androidx.compose.p015ui.text.style.TextDrawStyle;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import com.google.android.gms.common.api.Api;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p157k0.C7175c;
import p628nj.C18263b;
import p753kq.C19861p;

public final class TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $it;
    public final /* synthetic */ long $labelContentColor;
    public final /* synthetic */ float $labelProgress;
    public final /* synthetic */ long $labelTextStyleColor;
    public final /* synthetic */ boolean $shouldOverrideTextStyleColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(float f, long j, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, boolean z, long j2) {
        super(2);
        this.$labelProgress = f;
        this.$labelContentColor = j;
        this.$it = pVar;
        this.$$dirty = i;
        this.$shouldOverrideTextStyleColor = z;
        this.$labelTextStyleColor = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C2010l lVar;
        C2009k kVar;
        C2023s sVar;
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1345l1 l1Var = TypographyKt.f2371a;
            C2023s sVar2 = ((C1178d2) dVar2.mo5410J(l1Var)).f2408g;
            C2023s sVar3 = ((C1178d2) dVar2.mo5410J(l1Var)).f2413l;
            float f = this.$labelProgress;
            C19383o.m32797g(sVar2, "start");
            C19383o.m32797g(sVar3, "stop");
            C2012n nVar = sVar2.f4599a;
            C2012n nVar2 = sVar3.f4599a;
            int i2 = C2013o.f4555e;
            C19383o.m32797g(nVar, "start");
            C19383o.m32797g(nVar2, "stop");
            TextDrawStyle textDrawStyle = nVar.f4536a;
            TextDrawStyle textDrawStyle2 = nVar2.f4536a;
            C19383o.m32797g(textDrawStyle, "start");
            C19383o.m32797g(textDrawStyle2, "stop");
            long e0 = C18263b.m30841e0(textDrawStyle.mo7763a(), f, textDrawStyle2.mo7763a());
            TextDrawStyle bVar = (e0 > C1545s.f3364i ? 1 : (e0 == C1545s.f3364i ? 0 : -1)) != 0 ? new C2026b(e0) : TextDrawStyle.C2024a.f4602a;
            C1952g gVar = (C1952g) C2013o.m4413a(f, nVar.f4541f, nVar2.f4541f);
            long b = C2013o.m4414b(nVar.f4537b, f, nVar2.f4537b);
            C1959m mVar = nVar.f4538c;
            if (mVar == null) {
                mVar = C1959m.f4413g;
            }
            C1959m mVar2 = nVar2.f4538c;
            if (mVar2 == null) {
                mVar2 = C1959m.f4413g;
            }
            C19383o.m32797g(mVar, "start");
            C19383o.m32797g(mVar2, "stop");
            int i3 = mVar.f4417b;
            double d = ((double) (mVar2.f4417b - i3)) * ((double) f);
            if (!Double.isNaN(d)) {
                C1959m mVar3 = new C1959m(C19388s.m32833M(i3 + (d > 2.147483647E9d ? Api.BaseClientBuilder.API_PRIORITY_OTHER : d < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(d)), 1, 1000));
                C1957k kVar2 = (C1957k) C2013o.m4413a(f, nVar.f4539d, nVar2.f4539d);
                C1958l lVar2 = (C1958l) C2013o.m4413a(f, nVar.f4540e, nVar2.f4540e);
                String str = (String) C2013o.m4413a(f, nVar.f4542g, nVar2.f4542g);
                long b2 = C2013o.m4414b(nVar.f4543h, f, nVar2.f4543h);
                C2025a aVar = nVar.f4544i;
                float f2 = 0.0f;
                float f3 = aVar != null ? aVar.f4603a : 0.0f;
                C2025a aVar2 = nVar2.f4544i;
                if (aVar2 != null) {
                    f2 = aVar2.f4603a;
                }
                float w0 = C15588c1.m25354w0(f3, f2, f);
                C2032g gVar2 = nVar.f4545j;
                if (gVar2 == null) {
                    gVar2 = C2032g.f4617c;
                }
                C2032g gVar3 = nVar2.f4545j;
                if (gVar3 == null) {
                    gVar3 = C2032g.f4617c;
                }
                C2032g gVar4 = new C2032g(C15588c1.m25354w0(gVar2.f4618a, gVar3.f4618a, f), C15588c1.m25354w0(gVar2.f4619b, gVar3.f4619b, f));
                C7175c cVar = (C7175c) C2013o.m4413a(f, nVar.f4546k, nVar2.f4546k);
                String str2 = "start";
                String str3 = "stop";
                long e02 = C18263b.m30841e0(nVar.f4547l, f, nVar2.f4547l);
                C2030e eVar = (C2030e) C2013o.m4413a(f, nVar.f4548m, nVar2.f4548m);
                C1528j0 j0Var = nVar.f4549n;
                if (j0Var == null) {
                    j0Var = new C1528j0();
                }
                C1528j0 j0Var2 = nVar2.f4549n;
                if (j0Var2 == null) {
                    j0Var2 = new C1528j0();
                }
                C2023s sVar4 = sVar3;
                String str4 = str3;
                C1959m mVar4 = mVar3;
                C1528j0 j0Var3 = new C1528j0(C18263b.m30841e0(j0Var.f3323a, f, j0Var2.f3323a), C19421p.m32929S(j0Var.f3324b, f, j0Var2.f3324b), C15588c1.m25354w0(j0Var.f3325c, j0Var2.f3325c, f));
                C2010l lVar3 = nVar.f4550o;
                C2010l lVar4 = nVar2.f4550o;
                if (lVar3 == null && lVar4 == null) {
                    lVar = null;
                } else {
                    if (lVar3 == null) {
                        lVar3 = C2010l.f4533a;
                    }
                    lVar = lVar3;
                }
                C2025a aVar3 = r1;
                C2025a aVar4 = new C2025a(w0);
                C2012n nVar3 = new C2012n(bVar, b, mVar4, kVar2, lVar2, gVar, str, b2, aVar3, gVar4, cVar, e02, eVar, j0Var3, lVar);
                C1978h hVar = sVar2.f4600b;
                C1978h hVar2 = sVar4.f4600b;
                int i4 = C1979i.f4446b;
                C19383o.m32797g(hVar, str2);
                String str5 = str4;
                C19383o.m32797g(hVar2, str5);
                C2029d dVar3 = (C2029d) C2013o.m4413a(f, hVar.f4439a, hVar2.f4439a);
                C2031f fVar = (C2031f) C2013o.m4413a(f, hVar.f4440b, hVar2.f4440b);
                long b3 = C2013o.m4414b(hVar.f4441c, f, hVar2.f4441c);
                C2033h hVar3 = hVar.f4442d;
                if (hVar3 == null) {
                    hVar3 = C2033h.f4620c;
                }
                C2033h hVar4 = hVar2.f4442d;
                if (hVar4 == null) {
                    hVar4 = C2033h.f4620c;
                }
                C19383o.m32797g(hVar3, str2);
                C19383o.m32797g(hVar4, str5);
                String str6 = str5;
                long j = b3;
                C2029d dVar4 = dVar3;
                C2033h hVar5 = new C2033h(C2013o.m4414b(hVar3.f4621a, f, hVar4.f4621a), C2013o.m4414b(hVar3.f4622b, f, hVar4.f4622b));
                C2009k kVar3 = hVar.f4443e;
                C2009k kVar4 = hVar2.f4443e;
                if (kVar3 == null && kVar4 == null) {
                    kVar = null;
                } else {
                    if (kVar3 == null) {
                        kVar3 = C2009k.f4531b;
                    }
                    if (kVar4 == null) {
                        kVar4 = C2009k.f4531b;
                    }
                    C19383o.m32797g(kVar3, str2);
                    C19383o.m32797g(kVar4, str6);
                    if (kVar3.f4532a == kVar4.f4532a) {
                        kVar = kVar3;
                    } else {
                        kVar = new C2009k(((Boolean) C2013o.m4413a(f, Boolean.valueOf(kVar3.f4532a), Boolean.valueOf(kVar4.f4532a))).booleanValue());
                    }
                }
                sVar = new C2023s(nVar3, new C1978h(dVar4, fVar, j, hVar5, kVar, (C2027c) C2013o.m4413a(f, hVar.f4444f, hVar2.f4444f)));
                boolean z = this.$shouldOverrideTextStyleColor;
                long j2 = this.$labelTextStyleColor;
                if (z) {
                    sVar = C2023s.m4469a(sVar, j2, 0, (C1952g) null, (C2029d) null, 262142);
                }
                TextFieldImplKt.m2268b(this.$labelContentColor, sVar, (Float) null, this.$it, dVar, ((this.$$dirty >> 6) & 14) | 384, 0);
                return;
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        dVar.mo5396C();
    }
}
