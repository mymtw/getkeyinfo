package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1958l;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2025a;
import androidx.compose.p015ui.text.style.C2026b;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.p015ui.text.style.C2031f;
import androidx.compose.p015ui.text.style.C2032g;
import androidx.compose.p015ui.text.style.C2033h;
import androidx.compose.p015ui.text.style.TextDrawStyle;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p157k0.C7175c;
import p174m0.C7292j;

/* renamed from: androidx.compose.ui.text.s */
public final class C2023s {

    /* renamed from: d */
    public static final C2023s f4598d = new C2023s(0, 0, (C1959m) null, (C1957k) null, (C1952g) null, 0, (C2030e) null, (C2029d) null, 0, 262143);

    /* renamed from: a */
    public final C2012n f4599a;

    /* renamed from: b */
    public final C1978h f4600b;

    /* renamed from: c */
    public final C2011m f4601c;

    public C2023s(C2012n nVar, C1978h hVar, C2011m mVar) {
        C19383o.m32797g(nVar, "spanStyle");
        this.f4599a = nVar;
        this.f4600b = hVar;
        this.f4601c = mVar;
    }

    /* renamed from: a */
    public static C2023s m4469a(C2023s sVar, long j, long j2, C1952g gVar, C2029d dVar, int i) {
        C2026b bVar;
        TextDrawStyle textDrawStyle;
        C2023s sVar2 = sVar;
        int i2 = i;
        long a = (i2 & 1) != 0 ? sVar2.f4599a.mo7712a() : j;
        long j3 = (i2 & 2) != 0 ? sVar2.f4599a.f4537b : j2;
        C1959m mVar = (i2 & 4) != 0 ? sVar2.f4599a.f4538c : null;
        C1957k kVar = (i2 & 8) != 0 ? sVar2.f4599a.f4539d : null;
        C1958l lVar = (i2 & 16) != 0 ? sVar2.f4599a.f4540e : null;
        C1952g gVar2 = (i2 & 32) != 0 ? sVar2.f4599a.f4541f : gVar;
        String str = (i2 & 64) != 0 ? sVar2.f4599a.f4542g : null;
        long j4 = (i2 & 128) != 0 ? sVar2.f4599a.f4543h : 0;
        C2025a aVar = (i2 & 256) != 0 ? sVar2.f4599a.f4544i : null;
        C2032g gVar3 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? sVar2.f4599a.f4545j : null;
        C7175c cVar = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? sVar2.f4599a.f4546k : null;
        long j5 = (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? sVar2.f4599a.f4547l : 0;
        C2030e eVar = (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? sVar2.f4599a.f4548m : null;
        C1528j0 j0Var = (i2 & 8192) != 0 ? sVar2.f4599a.f4549n : null;
        C2029d dVar2 = (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? sVar2.f4600b.f4439a : dVar;
        C2031f fVar = (32768 & i2) != 0 ? sVar2.f4600b.f4440b : null;
        long j6 = (65536 & i2) != 0 ? sVar2.f4600b.f4441c : 0;
        C2033h hVar = (i2 & 131072) != 0 ? sVar2.f4600b.f4442d : null;
        if (C1545s.m3357c(a, sVar2.f4599a.mo7712a())) {
            textDrawStyle = sVar2.f4599a.f4536a;
        } else {
            if (a != C1545s.f3364i) {
                bVar = new C2026b(a);
                C2012n nVar = new C2012n(bVar, j3, mVar, kVar, lVar, gVar2, str, j4, aVar, gVar3, cVar, j5, eVar, j0Var, sVar2.f4599a.f4550o);
                C1978h hVar2 = sVar2.f4600b;
                return new C2023s(nVar, new C1978h(dVar2, fVar, j6, hVar, hVar2.f4443e, hVar2.f4444f), sVar2.f4601c);
            }
            textDrawStyle = TextDrawStyle.C2024a.f4602a;
        }
        bVar = textDrawStyle;
        C2012n nVar2 = new C2012n(bVar, j3, mVar, kVar, lVar, gVar2, str, j4, aVar, gVar3, cVar, j5, eVar, j0Var, sVar2.f4599a.f4550o);
        C1978h hVar22 = sVar2.f4600b;
        return new C2023s(nVar2, new C1978h(dVar2, fVar, j6, hVar, hVar22.f4443e, hVar22.f4444f), sVar2.f4601c);
    }

    /* renamed from: b */
    public final long mo7758b() {
        return this.f4599a.mo7712a();
    }

    /* renamed from: c */
    public final C2023s mo7759c(C2023s sVar) {
        return (sVar == null || C19383o.m32792b(sVar, f4598d)) ? this : new C2023s(this.f4599a.mo7714c(sVar.f4599a), this.f4600b.mo7593a(sVar.f4600b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2023s)) {
            return false;
        }
        C2023s sVar = (C2023s) obj;
        return C19383o.m32792b(this.f4599a, sVar.f4599a) && C19383o.m32792b(this.f4600b, sVar.f4600b) && C19383o.m32792b(this.f4601c, sVar.f4601c);
    }

    public final int hashCode() {
        int hashCode = (this.f4600b.hashCode() + (this.f4599a.hashCode() * 31)) * 31;
        C2011m mVar = this.f4601c;
        return hashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextStyle(color=");
        h.append(C1545s.m3363i(mo7758b()));
        h.append(", brush=");
        this.f4599a.f4536a.mo7766d();
        h.append((Object) null);
        h.append(", fontSize=");
        h.append(C7292j.m14000d(this.f4599a.f4537b));
        h.append(", fontWeight=");
        h.append(this.f4599a.f4538c);
        h.append(", fontStyle=");
        h.append(this.f4599a.f4539d);
        h.append(", fontSynthesis=");
        h.append(this.f4599a.f4540e);
        h.append(", fontFamily=");
        h.append(this.f4599a.f4541f);
        h.append(", fontFeatureSettings=");
        h.append(this.f4599a.f4542g);
        h.append(", letterSpacing=");
        h.append(C7292j.m14000d(this.f4599a.f4543h));
        h.append(", baselineShift=");
        h.append(this.f4599a.f4544i);
        h.append(", textGeometricTransform=");
        h.append(this.f4599a.f4545j);
        h.append(", localeList=");
        h.append(this.f4599a.f4546k);
        h.append(", background=");
        C0048b.m165d(this.f4599a.f4547l, h, ", textDecoration=");
        h.append(this.f4599a.f4548m);
        h.append(", shadow=");
        h.append(this.f4599a.f4549n);
        h.append(", textAlign=");
        h.append(this.f4600b.f4439a);
        h.append(", textDirection=");
        h.append(this.f4600b.f4440b);
        h.append(", lineHeight=");
        h.append(C7292j.m14000d(this.f4600b.f4441c));
        h.append(", textIndent=");
        h.append(this.f4600b.f4442d);
        h.append(", platformStyle=");
        h.append(this.f4601c);
        h.append("lineHeightStyle=");
        h.append(this.f4600b.f4444f);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2023s(androidx.compose.p015ui.text.C2012n r4, androidx.compose.p015ui.text.C1978h r5) {
        /*
            r3 = this;
            java.lang.String r0 = "spanStyle"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            androidx.compose.ui.text.l r0 = r4.f4550o
            androidx.compose.ui.text.k r1 = r5.f4443e
            if (r0 != 0) goto L_0x000f
            if (r1 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0015
        L_0x000f:
            androidx.compose.ui.text.m r2 = new androidx.compose.ui.text.m
            r2.<init>(r0, r1)
            r0 = r2
        L_0x0015:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.C2023s.<init>(androidx.compose.ui.text.n, androidx.compose.ui.text.h):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2023s(long r27, long r29, androidx.compose.p015ui.text.font.C1959m r31, androidx.compose.p015ui.text.font.C1957k r32, androidx.compose.p015ui.text.font.C1952g r33, long r34, androidx.compose.p015ui.text.style.C2030e r36, androidx.compose.p015ui.text.style.C2029d r37, long r38, int r40) {
        /*
            r26 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000a
            long r1 = androidx.compose.p015ui.graphics.C1545s.f3364i
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r27
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0014
            long r1 = p174m0.C7292j.f16173c
            r6 = r1
            goto L_0x0016
        L_0x0014:
            r6 = r29
        L_0x0016:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x001d
            r8 = r2
            goto L_0x001f
        L_0x001d:
            r8 = r31
        L_0x001f:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0025
            r9 = r2
            goto L_0x0027
        L_0x0025:
            r9 = r32
        L_0x0027:
            r10 = 0
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002e
            r11 = r2
            goto L_0x0030
        L_0x002e:
            r11 = r33
        L_0x0030:
            r12 = 0
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0038
            long r13 = p174m0.C7292j.f16173c
            goto L_0x003a
        L_0x0038:
            r13 = r34
        L_0x003a:
            r15 = 0
            r16 = 0
            r17 = 0
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0046
            long r18 = androidx.compose.p015ui.graphics.C1545s.f3364i
            goto L_0x0048
        L_0x0046:
            r18 = 0
        L_0x0048:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x004f
            r20 = r2
            goto L_0x0051
        L_0x004f:
            r20 = r36
        L_0x0051:
            r21 = 0
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0059
            r1 = r2
            goto L_0x005b
        L_0x0059:
            r1 = r37
        L_0x005b:
            r23 = 0
            r3 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0065
            long r24 = p174m0.C7292j.f16173c
            goto L_0x0067
        L_0x0065:
            r24 = r38
        L_0x0067:
            r0 = 0
            androidx.compose.ui.text.n r3 = new androidx.compose.ui.text.n
            r35 = r3
            r22 = 0
            r3.<init>((long) r4, (long) r6, (androidx.compose.p015ui.text.font.C1959m) r8, (androidx.compose.p015ui.text.font.C1957k) r9, (androidx.compose.p015ui.text.font.C1958l) r10, (androidx.compose.p015ui.text.font.C1952g) r11, (java.lang.String) r12, (long) r13, (androidx.compose.p015ui.text.style.C2025a) r15, (androidx.compose.p015ui.text.style.C2032g) r16, (p157k0.C7175c) r17, (long) r18, (androidx.compose.p015ui.text.style.C2030e) r20, (androidx.compose.p015ui.graphics.C1528j0) r21, (androidx.compose.p015ui.text.C2010l) r22)
            androidx.compose.ui.text.h r3 = new androidx.compose.ui.text.h
            r4 = 0
            r5 = 0
            r27 = r3
            r28 = r1
            r29 = r23
            r30 = r24
            r32 = r0
            r33 = r5
            r34 = r4
            r27.<init>(r28, r29, r30, r32, r33, r34)
            r0 = r26
            r1 = r35
            r0.<init>(r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.C2023s.<init>(long, long, androidx.compose.ui.text.font.m, androidx.compose.ui.text.font.k, androidx.compose.ui.text.font.g, long, androidx.compose.ui.text.style.e, androidx.compose.ui.text.style.d, long, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2023s(long r30, androidx.compose.p015ui.text.font.C1959m r32, androidx.compose.p015ui.text.font.C1956j r33, long r34, androidx.compose.p015ui.text.C2011m r36) {
        /*
            r29 = this;
            r0 = r36
            long r16 = androidx.compose.p015ui.graphics.C1545s.f3364i
            r7 = 0
            r8 = 0
            r10 = 0
            long r11 = p174m0.C7292j.f16173c
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r27 = 0
            androidx.compose.ui.text.n r9 = new androidx.compose.ui.text.n
            androidx.compose.ui.text.l r6 = r0.f4534a
            r1 = r9
            r2 = r16
            r4 = r30
            r20 = r6
            r6 = r32
            r28 = r9
            r9 = r33
            r1.<init>((long) r2, (long) r4, (androidx.compose.p015ui.text.font.C1959m) r6, (androidx.compose.p015ui.text.font.C1957k) r7, (androidx.compose.p015ui.text.font.C1958l) r8, (androidx.compose.p015ui.text.font.C1952g) r9, (java.lang.String) r10, (long) r11, (androidx.compose.p015ui.text.style.C2025a) r13, (androidx.compose.p015ui.text.style.C2032g) r14, (p157k0.C7175c) r15, (long) r16, (androidx.compose.p015ui.text.style.C2030e) r18, (androidx.compose.p015ui.graphics.C1528j0) r19, (androidx.compose.p015ui.text.C2010l) r20)
            androidx.compose.ui.text.h r1 = new androidx.compose.ui.text.h
            androidx.compose.ui.text.k r2 = r0.f4535b
            r20 = r1
            r23 = r34
            r26 = r2
            r20.<init>(r21, r22, r23, r25, r26, r27)
            r2 = r29
            r3 = r28
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.C2023s.<init>(long, androidx.compose.ui.text.font.m, androidx.compose.ui.text.font.j, long, androidx.compose.ui.text.m):void");
    }
}
