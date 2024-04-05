package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.C14304h;
import java.io.IOException;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17918h1;
import p594jh.C17948m0;
import p595ji.C18000l;

/* renamed from: com.google.android.exoplayer2.source.b */
public final class C14292b implements C14304h, C14304h.C14305a {

    /* renamed from: b */
    public final C14304h f31780b;

    /* renamed from: c */
    public C14304h.C14305a f31781c;

    /* renamed from: d */
    public C14293a[] f31782d = new C14293a[0];

    /* renamed from: e */
    public long f31783e;

    /* renamed from: f */
    public long f31784f;

    /* renamed from: g */
    public long f31785g;

    /* renamed from: com.google.android.exoplayer2.source.b$a */
    public final class C14293a implements C18000l {

        /* renamed from: b */
        public final C18000l f31786b;

        /* renamed from: c */
        public boolean f31787c;

        public C14293a(C18000l lVar) {
            this.f31786b = lVar;
        }

        /* renamed from: c */
        public final void mo47680c() throws IOException {
            this.f31786b.mo47680c();
        }

        /* renamed from: f */
        public final int mo47681f(long j) {
            if (C14292b.this.mo47670g()) {
                return -3;
            }
            return this.f31786b.mo47681f(j);
        }

        public final boolean isReady() {
            return !C14292b.this.mo47670g() && this.f31786b.isReady();
        }

        /* renamed from: j */
        public final int mo47683j(C17948m0 m0Var, DecoderInputBuffer decoderInputBuffer, int i) {
            if (C14292b.this.mo47670g()) {
                return -3;
            }
            if (this.f31787c) {
                decoderInputBuffer.f39937b = 4;
                return -4;
            }
            int j = this.f31786b.mo47683j(m0Var, decoderInputBuffer, i);
            if (j == -5) {
                Format format = m0Var.f39134b;
                format.getClass();
                int i2 = format.encoderDelay;
                if (!(i2 == 0 && format.encoderPadding == 0)) {
                    C14292b bVar = C14292b.this;
                    int i3 = 0;
                    if (bVar.f31784f != 0) {
                        i2 = 0;
                    }
                    if (bVar.f31785g == Long.MIN_VALUE) {
                        i3 = format.encoderPadding;
                    }
                    Format.C14176b buildUpon = format.buildUpon();
                    buildUpon.f31289A = i2;
                    buildUpon.f31290B = i3;
                    m0Var.f39134b = buildUpon.mo47144a();
                }
                return -5;
            }
            C14292b bVar2 = C14292b.this;
            long j2 = bVar2.f31785g;
            if (j2 == Long.MIN_VALUE || ((j != -4 || decoderInputBuffer.f31495f < j2) && (j != -3 || bVar2.mo1412d() != Long.MIN_VALUE || decoderInputBuffer.f31494e))) {
                return j;
            }
            decoderInputBuffer.mo46795j();
            decoderInputBuffer.f39937b = 4;
            this.f31787c = true;
            return -4;
        }
    }

    public C14292b(C14304h hVar, boolean z, long j, long j2) {
        this.f31780b = hVar;
        this.f31783e = z ? j : -9223372036854775807L;
        this.f31784f = j;
        this.f31785g = j2;
    }

    /* renamed from: a */
    public final boolean mo1409a() {
        return this.f31780b.mo1409a();
    }

    /* renamed from: b */
    public final long mo1410b() {
        long b = this.f31780b.mo1410b();
        if (b != Long.MIN_VALUE) {
            long j = this.f31785g;
            if (j == Long.MIN_VALUE || b < j) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: c */
    public final boolean mo1411c(long j) {
        return this.f31780b.mo1411c(j);
    }

    /* renamed from: d */
    public final long mo1412d() {
        long d = this.f31780b.mo1412d();
        if (d != Long.MIN_VALUE) {
            long j = this.f31785g;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: e */
    public final void mo1413e(long j) {
        this.f31780b.mo1413e(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        if (r1 > r5) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo47669f(com.google.android.exoplayer2.trackselection.C14386b[] r16, boolean[] r17, p595ji.C18000l[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            com.google.android.exoplayer2.source.b$a[] r1 = new com.google.android.exoplayer2.source.C14292b.C14293a[r1]
            r0.f31782d = r1
            int r1 = r9.length
            ji.l[] r10 = new p595ji.C18000l[r1]
            r11 = 0
            r1 = r11
        L_0x000f:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L_0x0024
            com.google.android.exoplayer2.source.b$a[] r2 = r0.f31782d
            r3 = r9[r1]
            com.google.android.exoplayer2.source.b$a r3 = (com.google.android.exoplayer2.source.C14292b.C14293a) r3
            r2[r1] = r3
            if (r3 == 0) goto L_0x001f
            ji.l r12 = r3.f31786b
        L_0x001f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0024:
            com.google.android.exoplayer2.source.h r1 = r0.f31780b
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.mo47669f(r2, r3, r4, r5, r6)
            boolean r3 = r15.mo47670g()
            r4 = 1
            if (r3 == 0) goto L_0x0066
            long r5 = r0.f31784f
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0066
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0061
            int r3 = r8.length
            r5 = r11
        L_0x0048:
            if (r5 >= r3) goto L_0x0061
            r6 = r8[r5]
            if (r6 == 0) goto L_0x005e
            com.google.android.exoplayer2.Format r6 = r6.mo47900n()
            java.lang.String r7 = r6.sampleMimeType
            java.lang.String r6 = r6.codecs
            boolean r6 = p513bj.C14065m.m21671a(r7, r6)
            if (r6 != 0) goto L_0x005e
            r3 = r4
            goto L_0x0062
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0048
        L_0x0061:
            r3 = r11
        L_0x0062:
            if (r3 == 0) goto L_0x0066
            r5 = r1
            goto L_0x006b
        L_0x0066:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x006b:
            r0.f31783e = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x0085
            long r5 = r0.f31784f
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0084
            long r5 = r0.f31785g
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0085
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r4 = r11
        L_0x0085:
            p513bj.C14075p.m21694f(r4)
        L_0x0088:
            int r3 = r9.length
            if (r11 >= r3) goto L_0x00ae
            r3 = r10[r11]
            if (r3 != 0) goto L_0x0094
            com.google.android.exoplayer2.source.b$a[] r3 = r0.f31782d
            r3[r11] = r12
            goto L_0x00a5
        L_0x0094:
            com.google.android.exoplayer2.source.b$a[] r4 = r0.f31782d
            r5 = r4[r11]
            if (r5 == 0) goto L_0x009e
            ji.l r5 = r5.f31786b
            if (r5 == r3) goto L_0x00a5
        L_0x009e:
            com.google.android.exoplayer2.source.b$a r5 = new com.google.android.exoplayer2.source.b$a
            r5.<init>(r3)
            r4[r11] = r5
        L_0x00a5:
            com.google.android.exoplayer2.source.b$a[] r3 = r0.f31782d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L_0x0088
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14292b.mo47669f(com.google.android.exoplayer2.trackselection.b[], boolean[], ji.l[], boolean[], long):long");
    }

    /* renamed from: g */
    public final boolean mo47670g() {
        return this.f31783e != -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > r6) goto L_0x0034;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo47671i(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f31783e = r0
            com.google.android.exoplayer2.source.b$a[] r0 = r5.f31782d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0017
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0014
            r4.f31787c = r2
        L_0x0014:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0017:
            com.google.android.exoplayer2.source.h r0 = r5.f31780b
            long r0 = r0.mo47671i(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0033
            long r6 = r5.f31784f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0034
            long r6 = r5.f31785g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0033
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            p513bj.C14075p.m21694f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14292b.mo47671i(long):long");
    }

    /* renamed from: j */
    public final long mo47672j() {
        if (mo47670g()) {
            long j = this.f31783e;
            this.f31783e = -9223372036854775807L;
            long j2 = mo47672j();
            return j2 != -9223372036854775807L ? j2 : j;
        }
        long j3 = this.f31780b.mo47672j();
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C14075p.m21694f(j3 >= this.f31784f);
        long j4 = this.f31785g;
        if (j4 != Long.MIN_VALUE && j3 > j4) {
            z = false;
        }
        C14075p.m21694f(z);
        return j3;
    }

    /* renamed from: k */
    public final void mo47673k(C14304h.C14305a aVar, long j) {
        this.f31781c = aVar;
        this.f31780b.mo47673k(this, j);
    }

    /* renamed from: l */
    public final void mo47674l(C14372q qVar) {
        C14304h hVar = (C14304h) qVar;
        C14304h.C14305a aVar = this.f31781c;
        aVar.getClass();
        aVar.mo47674l(this);
    }

    /* renamed from: m */
    public final void mo47675m(C14304h hVar) {
        C14304h.C14305a aVar = this.f31781c;
        aVar.getClass();
        aVar.mo47675m(this);
    }

    /* renamed from: o */
    public final void mo47676o() throws IOException {
        this.f31780b.mo47676o();
    }

    /* renamed from: q */
    public final TrackGroupArray mo47677q() {
        return this.f31780b.mo47677q();
    }

    /* renamed from: t */
    public final void mo47678t(long j, boolean z) {
        this.f31780b.mo47678t(j, z);
    }

    /* renamed from: u */
    public final long mo47679u(long j, C17918h1 h1Var) {
        long j2 = this.f31784f;
        if (j == j2) {
            return j2;
        }
        long j3 = C14049b0.m21637j(h1Var.f38939a, 0, j - j2);
        long j4 = h1Var.f38940b;
        long j5 = this.f31785g;
        long j6 = C14049b0.m21637j(j4, 0, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (!(j3 == h1Var.f38939a && j6 == h1Var.f38940b)) {
            h1Var = new C17918h1(j3, j6);
        }
        return this.f31780b.mo47679u(j, h1Var);
    }
}
