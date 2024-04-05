package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1958l;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2025a;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.p015ui.text.style.C2032g;
import androidx.compose.p015ui.text.style.TextDrawStyle;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p157k0.C7175c;
import p174m0.C7292j;
import p174m0.C7293k;
import p504ai.C13983i;

/* renamed from: androidx.compose.ui.text.n */
public final class C2012n {

    /* renamed from: a */
    public final TextDrawStyle f4536a;

    /* renamed from: b */
    public final long f4537b;

    /* renamed from: c */
    public final C1959m f4538c;

    /* renamed from: d */
    public final C1957k f4539d;

    /* renamed from: e */
    public final C1958l f4540e;

    /* renamed from: f */
    public final C1952g f4541f;

    /* renamed from: g */
    public final String f4542g;

    /* renamed from: h */
    public final long f4543h;

    /* renamed from: i */
    public final C2025a f4544i;

    /* renamed from: j */
    public final C2032g f4545j;

    /* renamed from: k */
    public final C7175c f4546k;

    /* renamed from: l */
    public final long f4547l;

    /* renamed from: m */
    public final C2030e f4548m;

    /* renamed from: n */
    public final C1528j0 f4549n;

    /* renamed from: o */
    public final C2010l f4550o;

    public C2012n(TextDrawStyle textDrawStyle, long j, C1959m mVar, C1957k kVar, C1958l lVar, C1952g gVar, String str, long j2, C2025a aVar, C2032g gVar2, C7175c cVar, long j3, C2030e eVar, C1528j0 j0Var, C2010l lVar2) {
        this.f4536a = textDrawStyle;
        this.f4537b = j;
        this.f4538c = mVar;
        this.f4539d = kVar;
        this.f4540e = lVar;
        this.f4541f = gVar;
        this.f4542g = str;
        this.f4543h = j2;
        this.f4544i = aVar;
        this.f4545j = gVar2;
        this.f4546k = cVar;
        this.f4547l = j3;
        this.f4548m = eVar;
        this.f4549n = j0Var;
        this.f4550o = lVar2;
    }

    /* renamed from: a */
    public final long mo7712a() {
        return this.f4536a.mo7763a();
    }

    /* renamed from: b */
    public final boolean mo7713b(C2012n nVar) {
        C19383o.m32797g(nVar, "other");
        if (this == nVar) {
            return true;
        }
        return C7292j.m13997a(this.f4537b, nVar.f4537b) && C19383o.m32792b(this.f4538c, nVar.f4538c) && C19383o.m32792b(this.f4539d, nVar.f4539d) && C19383o.m32792b(this.f4540e, nVar.f4540e) && C19383o.m32792b(this.f4541f, nVar.f4541f) && C19383o.m32792b(this.f4542g, nVar.f4542g) && C7292j.m13997a(this.f4543h, nVar.f4543h) && C19383o.m32792b(this.f4544i, nVar.f4544i) && C19383o.m32792b(this.f4545j, nVar.f4545j) && C19383o.m32792b(this.f4546k, nVar.f4546k) && C1545s.m3357c(this.f4547l, nVar.f4547l) && C19383o.m32792b(this.f4550o, nVar.f4550o);
    }

    /* renamed from: c */
    public final C2012n mo7714c(C2012n nVar) {
        C2012n nVar2 = nVar;
        if (nVar2 == null) {
            return this;
        }
        TextDrawStyle b = this.f4536a.mo7764b(nVar2.f4536a);
        C1952g gVar = nVar2.f4541f;
        if (gVar == null) {
            gVar = this.f4541f;
        }
        C1952g gVar2 = gVar;
        long j = !C0114h.m307l0(nVar2.f4537b) ? nVar2.f4537b : this.f4537b;
        C1959m mVar = nVar2.f4538c;
        if (mVar == null) {
            mVar = this.f4538c;
        }
        C1959m mVar2 = mVar;
        C1957k kVar = nVar2.f4539d;
        if (kVar == null) {
            kVar = this.f4539d;
        }
        C1957k kVar2 = kVar;
        C1958l lVar = nVar2.f4540e;
        if (lVar == null) {
            lVar = this.f4540e;
        }
        C1958l lVar2 = lVar;
        String str = nVar2.f4542g;
        if (str == null) {
            str = this.f4542g;
        }
        String str2 = str;
        long j2 = !C0114h.m307l0(nVar2.f4543h) ? nVar2.f4543h : this.f4543h;
        C2025a aVar = nVar2.f4544i;
        if (aVar == null) {
            aVar = this.f4544i;
        }
        C2025a aVar2 = aVar;
        C2032g gVar3 = nVar2.f4545j;
        if (gVar3 == null) {
            gVar3 = this.f4545j;
        }
        C2032g gVar4 = gVar3;
        C7175c cVar = nVar2.f4546k;
        if (cVar == null) {
            cVar = this.f4546k;
        }
        C7175c cVar2 = cVar;
        long j3 = nVar2.f4547l;
        if (!(j3 != C1545s.f3364i)) {
            j3 = this.f4547l;
        }
        long j4 = j3;
        C2030e eVar = nVar2.f4548m;
        if (eVar == null) {
            eVar = this.f4548m;
        }
        C2030e eVar2 = eVar;
        C1528j0 j0Var = nVar2.f4549n;
        if (j0Var == null) {
            j0Var = this.f4549n;
        }
        C1528j0 j0Var2 = j0Var;
        C2010l lVar3 = nVar2.f4550o;
        C2010l lVar4 = this.f4550o;
        return new C2012n(b, j, mVar2, kVar2, lVar2, gVar2, str2, j2, aVar2, gVar4, cVar2, j4, eVar2, j0Var2, lVar4 == null ? lVar3 : lVar4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2012n)) {
            return false;
        }
        C2012n nVar = (C2012n) obj;
        if (mo7713b(nVar)) {
            if (C19383o.m32792b(this.f4536a, nVar.f4536a) && C19383o.m32792b(this.f4548m, nVar.f4548m) && C19383o.m32792b(this.f4549n, nVar.f4549n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long a = mo7712a();
        int i = C1545s.f3365j;
        this.f4536a.mo7766d();
        int i2 = 0;
        long j = this.f4537b;
        C7293k[] kVarArr = C7292j.f16172b;
        int b = C0071c.m190b(j, ((C19356i.m32678a(a) * 31) + 0) * 31, 31);
        C1959m mVar = this.f4538c;
        int i3 = (b + (mVar != null ? mVar.f4417b : 0)) * 31;
        C1957k kVar = this.f4539d;
        int hashCode = (i3 + (kVar != null ? Integer.hashCode(kVar.f4407a) : 0)) * 31;
        C1958l lVar = this.f4540e;
        int hashCode2 = (hashCode + (lVar != null ? Integer.hashCode(lVar.f4408a) : 0)) * 31;
        C1952g gVar = this.f4541f;
        int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str = this.f4542g;
        int b2 = C0071c.m190b(this.f4543h, (hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31);
        C2025a aVar = this.f4544i;
        int hashCode4 = (b2 + (aVar != null ? Float.hashCode(aVar.f4603a) : 0)) * 31;
        C2032g gVar2 = this.f4545j;
        int hashCode5 = (hashCode4 + (gVar2 != null ? gVar2.hashCode() : 0)) * 31;
        C7175c cVar = this.f4546k;
        int f = C13983i.m21487f(this.f4547l, (hashCode5 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31);
        C2030e eVar = this.f4548m;
        int i4 = (f + (eVar != null ? eVar.f4615a : 0)) * 31;
        C1528j0 j0Var = this.f4549n;
        int hashCode6 = (i4 + (j0Var != null ? j0Var.hashCode() : 0)) * 31;
        C2010l lVar2 = this.f4550o;
        if (lVar2 != null) {
            i2 = lVar2.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SpanStyle(color=");
        h.append(C1545s.m3363i(mo7712a()));
        h.append(", brush=");
        this.f4536a.mo7766d();
        h.append((Object) null);
        h.append(", fontSize=");
        h.append(C7292j.m14000d(this.f4537b));
        h.append(", fontWeight=");
        h.append(this.f4538c);
        h.append(", fontStyle=");
        h.append(this.f4539d);
        h.append(", fontSynthesis=");
        h.append(this.f4540e);
        h.append(", fontFamily=");
        h.append(this.f4541f);
        h.append(", fontFeatureSettings=");
        h.append(this.f4542g);
        h.append(", letterSpacing=");
        h.append(C7292j.m14000d(this.f4543h));
        h.append(", baselineShift=");
        h.append(this.f4544i);
        h.append(", textGeometricTransform=");
        h.append(this.f4545j);
        h.append(", localeList=");
        h.append(this.f4546k);
        h.append(", background=");
        C0048b.m165d(this.f4547l, h, ", textDecoration=");
        h.append(this.f4548m);
        h.append(", shadow=");
        h.append(this.f4549n);
        h.append(", platformStyle=");
        h.append(this.f4550o);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2012n(long r23, long r25, androidx.compose.p015ui.text.font.C1959m r27, androidx.compose.p015ui.text.font.C1957k r28, androidx.compose.p015ui.text.font.C1958l r29, androidx.compose.p015ui.text.font.C1952g r30, java.lang.String r31, long r32, androidx.compose.p015ui.text.style.C2025a r34, androidx.compose.p015ui.text.style.C2032g r35, p157k0.C7175c r36, long r37, androidx.compose.p015ui.text.style.C2030e r39, androidx.compose.p015ui.graphics.C1528j0 r40) {
        /*
            r22 = this;
            r0 = r23
            long r2 = androidx.compose.p015ui.graphics.C1545s.f3364i
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x000a
            r2 = 1
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            if (r2 == 0) goto L_0x0013
            androidx.compose.ui.text.style.b r2 = new androidx.compose.ui.text.style.b
            r2.<init>(r0)
            goto L_0x0015
        L_0x0013:
            androidx.compose.ui.text.style.TextDrawStyle$a r2 = androidx.compose.p015ui.text.style.TextDrawStyle.C2024a.f4602a
        L_0x0015:
            r4 = r2
            r21 = 0
            r3 = r22
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r19 = r39
            r20 = r40
            r3.<init>((androidx.compose.p015ui.text.style.TextDrawStyle) r4, (long) r5, (androidx.compose.p015ui.text.font.C1959m) r7, (androidx.compose.p015ui.text.font.C1957k) r8, (androidx.compose.p015ui.text.font.C1958l) r9, (androidx.compose.p015ui.text.font.C1952g) r10, (java.lang.String) r11, (long) r12, (androidx.compose.p015ui.text.style.C2025a) r14, (androidx.compose.p015ui.text.style.C2032g) r15, (p157k0.C7175c) r16, (long) r17, (androidx.compose.p015ui.text.style.C2030e) r19, (androidx.compose.p015ui.graphics.C1528j0) r20, (androidx.compose.p015ui.text.C2010l) r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.C2012n.<init>(long, long, androidx.compose.ui.text.font.m, androidx.compose.ui.text.font.k, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.g, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.g, k0.c, long, androidx.compose.ui.text.style.e, androidx.compose.ui.graphics.j0):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2012n(long r19, long r21, androidx.compose.p015ui.text.font.C1959m r23, androidx.compose.p015ui.text.font.C1957k r24, androidx.compose.p015ui.text.font.C1958l r25, androidx.compose.p015ui.text.font.C1952g r26, java.lang.String r27, long r28, androidx.compose.p015ui.text.style.C2025a r30, androidx.compose.p015ui.text.style.C2032g r31, p157k0.C7175c r32, long r33, androidx.compose.p015ui.text.style.C2030e r35, androidx.compose.p015ui.graphics.C1528j0 r36, int r37) {
        /*
            r18 = this;
            r0 = r37
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            long r1 = androidx.compose.p015ui.graphics.C1545s.f3364i
            goto L_0x000b
        L_0x0009:
            r1 = r19
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            long r3 = p174m0.C7292j.f16173c
            goto L_0x0014
        L_0x0012:
            r3 = r21
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r23
        L_0x001c:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x0022
            r7 = 0
            goto L_0x0024
        L_0x0022:
            r7 = r24
        L_0x0024:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002a
            r8 = 0
            goto L_0x002c
        L_0x002a:
            r8 = r25
        L_0x002c:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0032
            r9 = 0
            goto L_0x0034
        L_0x0032:
            r9 = r26
        L_0x0034:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x003a
            r10 = 0
            goto L_0x003c
        L_0x003a:
            r10 = r27
        L_0x003c:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0043
            long r11 = p174m0.C7292j.f16173c
            goto L_0x0045
        L_0x0043:
            r11 = r28
        L_0x0045:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x004b
            r13 = 0
            goto L_0x004d
        L_0x004b:
            r13 = r30
        L_0x004d:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x0053
            r14 = 0
            goto L_0x0055
        L_0x0053:
            r14 = r31
        L_0x0055:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x005b
            r15 = 0
            goto L_0x005d
        L_0x005b:
            r15 = r32
        L_0x005d:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0064
            long r16 = androidx.compose.p015ui.graphics.C1545s.f3364i
            goto L_0x0066
        L_0x0064:
            r16 = r33
        L_0x0066:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x006c
            r6 = 0
            goto L_0x006e
        L_0x006c:
            r6 = r35
        L_0x006e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0074
            r0 = 0
            goto L_0x0076
        L_0x0074:
            r0 = r36
        L_0x0076:
            r19 = r18
            r20 = r1
            r22 = r3
            r24 = r5
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r16
            r36 = r6
            r37 = r0
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.C2012n.<init>(long, long, androidx.compose.ui.text.font.m, androidx.compose.ui.text.font.k, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.g, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.g, k0.c, long, androidx.compose.ui.text.style.e, androidx.compose.ui.graphics.j0, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2012n(long r23, long r25, androidx.compose.p015ui.text.font.C1959m r27, androidx.compose.p015ui.text.font.C1957k r28, androidx.compose.p015ui.text.font.C1958l r29, androidx.compose.p015ui.text.font.C1952g r30, java.lang.String r31, long r32, androidx.compose.p015ui.text.style.C2025a r34, androidx.compose.p015ui.text.style.C2032g r35, p157k0.C7175c r36, long r37, androidx.compose.p015ui.text.style.C2030e r39, androidx.compose.p015ui.graphics.C1528j0 r40, androidx.compose.p015ui.text.C2010l r41) {
        /*
            r22 = this;
            r0 = r23
            long r2 = androidx.compose.p015ui.graphics.C1545s.f3364i
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x000a
            r2 = 1
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            if (r2 == 0) goto L_0x0013
            androidx.compose.ui.text.style.b r2 = new androidx.compose.ui.text.style.b
            r2.<init>(r0)
            goto L_0x0015
        L_0x0013:
            androidx.compose.ui.text.style.TextDrawStyle$a r2 = androidx.compose.p015ui.text.style.TextDrawStyle.C2024a.f4602a
        L_0x0015:
            r4 = r2
            r3 = r22
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r19 = r39
            r20 = r40
            r21 = r41
            r3.<init>((androidx.compose.p015ui.text.style.TextDrawStyle) r4, (long) r5, (androidx.compose.p015ui.text.font.C1959m) r7, (androidx.compose.p015ui.text.font.C1957k) r8, (androidx.compose.p015ui.text.font.C1958l) r9, (androidx.compose.p015ui.text.font.C1952g) r10, (java.lang.String) r11, (long) r12, (androidx.compose.p015ui.text.style.C2025a) r14, (androidx.compose.p015ui.text.style.C2032g) r15, (p157k0.C7175c) r16, (long) r17, (androidx.compose.p015ui.text.style.C2030e) r19, (androidx.compose.p015ui.graphics.C1528j0) r20, (androidx.compose.p015ui.text.C2010l) r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.C2012n.<init>(long, long, androidx.compose.ui.text.font.m, androidx.compose.ui.text.font.k, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.g, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.g, k0.c, long, androidx.compose.ui.text.style.e, androidx.compose.ui.graphics.j0, androidx.compose.ui.text.l):void");
    }
}
