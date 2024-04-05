package p709xh;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p513bj.C14049b0;
import p513bj.C14077r;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18371x;

/* renamed from: xh.c */
public final class C18761c implements C18349h {

    /* renamed from: a */
    public C18351j f41559a;

    /* renamed from: b */
    public C18766h f41560b;

    /* renamed from: c */
    public boolean f41561c;

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0181  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47757a(p644ph.C18350i r21, p644ph.C18363s r22) throws java.io.IOException {
        /*
            r20 = this;
            r0 = r20
            ph.j r1 = r0.f41559a
            p513bj.C14075p.m21696h(r1)
            xh.h r1 = r0.f41560b
            r2 = 0
            if (r1 != 0) goto L_0x0021
            r1 = r21
            ph.e r1 = (p644ph.C18346e) r1
            boolean r3 = r0.mo70252d(r1)
            if (r3 == 0) goto L_0x0019
            r1.f40296f = r2
            goto L_0x0021
        L_0x0019:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Failed to determine bitstream type"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0021:
            boolean r1 = r0.f41561c
            r3 = 1
            if (r1 != 0) goto L_0x003e
            ph.j r1 = r0.f41559a
            ph.v r1 = r1.mo4164r(r2, r3)
            ph.j r4 = r0.f41559a
            r4.mo4163p()
            xh.h r4 = r0.f41560b
            ph.j r5 = r0.f41559a
            r4.f41578c = r5
            r4.f41577b = r1
            r4.mo70251d(r3)
            r0.f41561c = r3
        L_0x003e:
            xh.h r1 = r0.f41560b
            ph.v r4 = r1.f41577b
            p513bj.C14075p.m21696h(r4)
            int r4 = p513bj.C14049b0.f30913a
            int r4 = r1.f41583h
            r5 = -1
            r7 = -1
            r8 = 3
            r14 = 2
            if (r4 == 0) goto L_0x00f5
            if (r4 == r3) goto L_0x00e7
            if (r4 == r14) goto L_0x005e
            if (r4 != r8) goto L_0x0058
            goto L_0x0120
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x005e:
            xh.f r4 = r1.f41579d
            r9 = r21
            ph.e r9 = (p644ph.C18346e) r9
            long r10 = r4.mo70247b(r9)
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x0075
            r4 = r22
            r4.f40327a = r10
            r2 = r3
            goto L_0x0193
        L_0x0075:
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0080
            r14 = 2
            long r10 = r10 + r14
            long r10 = -r10
            r1.mo70256a(r10)
        L_0x0080:
            boolean r4 = r1.f41587l
            if (r4 != 0) goto L_0x0094
            xh.f r4 = r1.f41579d
            ph.t r4 = r4.mo70246a()
            p513bj.C14075p.m21696h(r4)
            ph.j r10 = r1.f41578c
            r10.mo4162l(r4)
            r1.f41587l = r3
        L_0x0094:
            long r3 = r1.f41586k
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x00a7
            xh.d r3 = r1.f41576a
            boolean r3 = r3.mo70253a(r9)
            if (r3 == 0) goto L_0x00a3
            goto L_0x00a7
        L_0x00a3:
            r1.f41583h = r8
            goto L_0x0120
        L_0x00a7:
            r1.f41586k = r12
            xh.d r3 = r1.f41576a
            bj.r r3 = r3.f41563b
            long r7 = r1.mo70249b(r3)
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x00e0
            long r9 = r1.f41582g
            long r11 = r9 + r7
            long r13 = r1.f41580e
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x00e0
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r11
            int r4 = r1.f41584i
            long r11 = (long) r4
            long r14 = r9 / r11
            ph.v r4 = r1.f41577b
            int r9 = r3.f30988c
            r4.mo69899d(r9, r3)
            ph.v r13 = r1.f41577b
            r16 = 1
            int r3 = r3.f30988c
            r18 = 0
            r19 = 0
            r17 = r3
            r13.mo47754c(r14, r16, r17, r18, r19)
            r1.f41580e = r5
        L_0x00e0:
            long r3 = r1.f41582g
            long r3 = r3 + r7
            r1.f41582g = r3
            goto L_0x0192
        L_0x00e7:
            long r3 = r1.f41581f
            int r3 = (int) r3
            r4 = r21
            ph.e r4 = (p644ph.C18346e) r4
            r4.mo69879j(r3)
            r1.f41583h = r14
            goto L_0x0192
        L_0x00f5:
            xh.d r4 = r1.f41576a
            r9 = r21
            ph.e r9 = (p644ph.C18346e) r9
            boolean r4 = r4.mo70253a(r9)
            if (r4 != 0) goto L_0x0105
            r1.f41583h = r8
            r4 = r2
            goto L_0x011e
        L_0x0105:
            long r10 = r9.f40294d
            long r12 = r1.f41581f
            long r10 = r10 - r12
            r1.f41586k = r10
            xh.d r4 = r1.f41576a
            bj.r r4 = r4.f41563b
            xh.h$a r10 = r1.f41585j
            boolean r4 = r1.mo70250c(r4, r12, r10)
            if (r4 == 0) goto L_0x011d
            long r9 = r9.f40294d
            r1.f41581f = r9
            goto L_0x00f5
        L_0x011d:
            r4 = r3
        L_0x011e:
            if (r4 != 0) goto L_0x0123
        L_0x0120:
            r2 = r7
            goto L_0x0193
        L_0x0123:
            xh.h$a r4 = r1.f41585j
            com.google.android.exoplayer2.Format r4 = r4.f41589a
            int r7 = r4.sampleRate
            r1.f41584i = r7
            boolean r7 = r1.f41588m
            if (r7 != 0) goto L_0x0136
            ph.v r7 = r1.f41577b
            r7.mo47752a(r4)
            r1.f41588m = r3
        L_0x0136:
            xh.h$a r4 = r1.f41585j
            xh.b$a r4 = r4.f41590b
            if (r4 == 0) goto L_0x013f
            r1.f41579d = r4
            goto L_0x014c
        L_0x013f:
            long r10 = r9.f40293c
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x014e
            xh.h$b r3 = new xh.h$b
            r3.<init>()
            r1.f41579d = r3
        L_0x014c:
            r2 = r14
            goto L_0x0172
        L_0x014e:
            xh.d r4 = r1.f41576a
            xh.e r4 = r4.f41562a
            int r5 = r4.f41567a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x015b
            r16 = r3
            goto L_0x015d
        L_0x015b:
            r16 = r2
        L_0x015d:
            xh.a r3 = new xh.a
            long r8 = r1.f41581f
            int r5 = r4.f41570d
            int r6 = r4.f41571e
            int r5 = r5 + r6
            long r12 = (long) r5
            long r4 = r4.f41568b
            r6 = r3
            r7 = r1
            r2 = r14
            r14 = r4
            r6.<init>(r7, r8, r10, r12, r14, r16)
            r1.f41579d = r3
        L_0x0172:
            r1.f41583h = r2
            xh.d r1 = r1.f41576a
            bj.r r2 = r1.f41563b
            byte[] r3 = r2.f30986a
            int r4 = r3.length
            r5 = 65025(0xfe01, float:9.112E-41)
            if (r4 != r5) goto L_0x0181
            goto L_0x0192
        L_0x0181:
            int r4 = r2.f30988c
            int r4 = java.lang.Math.max(r5, r4)
            byte[] r3 = java.util.Arrays.copyOf(r3, r4)
            bj.r r1 = r1.f41563b
            int r1 = r1.f30988c
            r2.mo46933x(r1, r3)
        L_0x0192:
            r2 = 0
        L_0x0193:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p709xh.C18761c.mo47757a(ph.i, ph.s):int");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f41559a = jVar;
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        C18766h hVar = this.f41560b;
        if (hVar != null) {
            C18762d dVar = hVar.f41576a;
            C18763e eVar = dVar.f41562a;
            eVar.f41567a = 0;
            eVar.f41568b = 0;
            eVar.f41569c = 0;
            eVar.f41570d = 0;
            eVar.f41571e = 0;
            dVar.f41563b.mo46932w(0);
            dVar.f41564c = -1;
            dVar.f41566e = false;
            if (j == 0) {
                hVar.mo70251d(!hVar.f41587l);
            } else if (hVar.f41583h != 0) {
                long j3 = (((long) hVar.f41584i) * j2) / 1000000;
                hVar.f41580e = j3;
                C18764f fVar = hVar.f41579d;
                int i = C14049b0.f30913a;
                fVar.mo70248c(j3);
                hVar.f41583h = 2;
            }
        }
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: d */
    public final boolean mo70252d(C18346e eVar) throws IOException {
        boolean z;
        boolean z2;
        C18763e eVar2 = new C18763e();
        if (eVar2.mo70254a(eVar, true) && (eVar2.f41567a & 2) == 2) {
            int min = Math.min(eVar2.f41571e, 8);
            C14077r rVar = new C14077r(min);
            eVar.mo69872c(rVar.f30986a, 0, min, false);
            rVar.mo46935z(0);
            if (rVar.f30988c - rVar.f30987b >= 5 && rVar.mo46925p() == 127 && rVar.mo46926q() == 1179402563) {
                this.f41560b = new C18759b();
            } else {
                rVar.mo46935z(0);
                try {
                    z = C18371x.m31056b(1, rVar, true);
                } catch (ParserException unused) {
                    z = false;
                }
                if (z) {
                    this.f41560b = new C18769i();
                } else {
                    rVar.mo46935z(0);
                    int i = rVar.f30988c - rVar.f30987b;
                    byte[] bArr = C18765g.f41574o;
                    if (i < 8) {
                        z2 = false;
                    } else {
                        byte[] bArr2 = new byte[8];
                        rVar.mo46911b(0, 8, bArr2);
                        z2 = Arrays.equals(bArr2, bArr);
                    }
                    if (z2) {
                        this.f41560b = new C18765g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        try {
            return mo70252d((C18346e) iVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final void release() {
    }
}
