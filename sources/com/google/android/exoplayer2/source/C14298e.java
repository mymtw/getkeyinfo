package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p505aj.C13999g;
import p505aj.C14002i;
import p505aj.C14013s;
import p505aj.C14014t;
import p513bj.C14075p;

/* renamed from: com.google.android.exoplayer2.source.e */
public final class C14298e implements C13999g {

    /* renamed from: a */
    public final C13999g f31807a;

    /* renamed from: b */
    public final int f31808b;

    /* renamed from: c */
    public final C14299a f31809c;

    /* renamed from: d */
    public final byte[] f31810d;

    /* renamed from: e */
    public int f31811e;

    /* renamed from: com.google.android.exoplayer2.source.e$a */
    public interface C14299a {
    }

    public C14298e(C14013s sVar, int i, C14299a aVar) {
        C14075p.m21691c(i > 0);
        this.f31807a = sVar;
        this.f31808b = i;
        this.f31809c = aVar;
        this.f31810d = new byte[1];
        this.f31811e = i;
    }

    /* renamed from: b */
    public final long mo46812b(C14002i iVar) {
        throw new UnsupportedOperationException();
    }

    public final void close() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo46815d() {
        return this.f31807a.mo46815d();
    }

    /* renamed from: e */
    public final void mo46806e(C14014t tVar) {
        tVar.getClass();
        this.f31807a.mo46806e(tVar);
    }

    public final Uri getUri() {
        return this.f31807a.getUri();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f31811e
            r2 = -1
            if (r1 != 0) goto L_0x00b7
            aj.g r1 = r0.f31807a
            byte[] r3 = r0.f31810d
            r4 = 1
            r5 = 0
            int r1 = r1.read(r3, r5, r4)
            if (r1 != r2) goto L_0x0014
            goto L_0x002f
        L_0x0014:
            byte[] r1 = r0.f31810d
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 4
            if (r1 != 0) goto L_0x0021
        L_0x001e:
            r1 = r4
            goto L_0x00ac
        L_0x0021:
            byte[] r3 = new byte[r1]
            r6 = r1
            r7 = r5
        L_0x0025:
            if (r6 <= 0) goto L_0x0035
            aj.g r8 = r0.f31807a
            int r8 = r8.read(r3, r7, r6)
            if (r8 != r2) goto L_0x0032
        L_0x002f:
            r4 = r5
            goto L_0x00ad
        L_0x0032:
            int r7 = r7 + r8
            int r6 = r6 - r8
            goto L_0x0025
        L_0x0035:
            if (r1 <= 0) goto L_0x003f
            int r6 = r1 + -1
            byte r7 = r3[r6]
            if (r7 != 0) goto L_0x003f
            r1 = r6
            goto L_0x0035
        L_0x003f:
            if (r1 <= 0) goto L_0x001e
            com.google.android.exoplayer2.source.e$a r6 = r0.f31809c
            com.google.android.exoplayer2.source.m$a r6 = (com.google.android.exoplayer2.source.C14355m.C14356a) r6
            boolean r7 = r6.f32233n
            if (r7 != 0) goto L_0x004c
            long r7 = r6.f32229j
            goto L_0x005a
        L_0x004c:
            com.google.android.exoplayer2.source.m r7 = com.google.android.exoplayer2.source.C14355m.this
            java.util.Map<java.lang.String, java.lang.String> r8 = com.google.android.exoplayer2.source.C14355m.f32180N
            long r7 = r7.mo47807x()
            long r9 = r6.f32229j
            long r7 = java.lang.Math.max(r7, r9)
        L_0x005a:
            r10 = r7
            int r13 = r1 + 0
            com.google.android.exoplayer2.source.p r9 = r6.f32232m
            r9.getClass()
            com.google.android.exoplayer2.source.o r1 = r9.f32282a
            r7 = r13
        L_0x0065:
            if (r7 <= 0) goto L_0x00a0
            int r8 = r1.mo47840c(r7)
            com.google.android.exoplayer2.source.o$a r12 = r1.f32267f
            aj.a r14 = r12.f32272d
            byte[] r15 = r14.f30751a
            r16 = r3
            long r2 = r1.f32268g
            r17 = r5
            long r4 = r12.f32269a
            long r2 = r2 - r4
            int r2 = (int) r2
            int r3 = r14.f30752b
            int r2 = r2 + r3
            r3 = r16
            r5 = r17
            java.lang.System.arraycopy(r3, r5, r15, r2, r8)
            int r5 = r5 + r8
            int r7 = r7 - r8
            long r14 = r1.f32268g
            r16 = r3
            long r2 = (long) r8
            long r14 = r14 + r2
            r1.f32268g = r14
            com.google.android.exoplayer2.source.o$a r2 = r1.f32267f
            long r3 = r2.f32270b
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x009b
            com.google.android.exoplayer2.source.o$a r2 = r2.f32273e
            r1.f32267f = r2
        L_0x009b:
            r3 = r16
            r2 = -1
            r4 = 1
            goto L_0x0065
        L_0x00a0:
            r1.getClass()
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo47754c(r10, r12, r13, r14, r15)
            r1 = 1
            r6.f32233n = r1
        L_0x00ac:
            r4 = r1
        L_0x00ad:
            if (r4 == 0) goto L_0x00b5
            int r1 = r0.f31808b
            r0.f31811e = r1
            r1 = -1
            goto L_0x00b8
        L_0x00b5:
            r1 = -1
            return r1
        L_0x00b7:
            r1 = r2
        L_0x00b8:
            aj.g r2 = r0.f31807a
            int r3 = r0.f31811e
            r4 = r21
            int r3 = java.lang.Math.min(r3, r4)
            r4 = r19
            r5 = r20
            int r2 = r2.read(r4, r5, r3)
            if (r2 == r1) goto L_0x00d1
            int r1 = r0.f31811e
            int r1 = r1 - r2
            r0.f31811e = r1
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14298e.read(byte[], int, int):int");
    }
}
