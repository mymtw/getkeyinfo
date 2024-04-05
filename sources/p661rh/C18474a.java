package p661rh;

import java.io.IOException;
import p513bj.C14077r;
import p644ph.C18336a;
import p644ph.C18346e;
import p644ph.C18354l;
import p644ph.C18358o;

/* renamed from: rh.a */
public final class C18474a extends C18336a {

    /* renamed from: rh.a$a */
    public static final class C18475a implements C18336a.C18342f {

        /* renamed from: a */
        public final C18358o f40680a;

        /* renamed from: b */
        public final int f40681b;

        /* renamed from: c */
        public final C18354l.C18355a f40682c = new C18354l.C18355a();

        public C18475a(C18358o oVar, int i) {
            this.f40680a = oVar;
            this.f40681b = i;
        }

        /* renamed from: a */
        public final C18336a.C18341e mo69868a(C18346e eVar, long j) throws IOException {
            C18346e eVar2 = eVar;
            long j2 = eVar2.f40294d;
            long c = mo69988c(eVar);
            long h = eVar.mo69877h();
            eVar2.mo69880k(Math.max(6, this.f40680a.f40307c), false);
            long c2 = mo69988c(eVar);
            return (c > j || c2 <= j) ? c2 <= j ? new C18336a.C18341e(c2, eVar.mo69877h(), -2) : new C18336a.C18341e(c, j2, -1) : C18336a.C18341e.m30973a(h);
        }

        /* renamed from: c */
        public final long mo69988c(C18346e eVar) throws IOException {
            boolean z;
            C18346e eVar2 = eVar;
            while (eVar.mo69877h() < eVar2.f40293c - 6) {
                C18358o oVar = this.f40680a;
                int i = this.f40681b;
                C18354l.C18355a aVar = this.f40682c;
                long h = eVar.mo69877h();
                int i2 = 2;
                byte[] bArr = new byte[2];
                eVar2.mo69872c(bArr, 0, 2, false);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                    eVar2.f40296f = 0;
                    eVar2.mo69880k((int) (h - eVar2.f40294d), false);
                    z = false;
                } else {
                    C14077r rVar = new C14077r(16);
                    System.arraycopy(bArr, 0, rVar.f30986a, 0, 2);
                    byte[] bArr2 = rVar.f30986a;
                    int i3 = 0;
                    for (int i4 = 14; i3 < i4; i4 = 14) {
                        int m = eVar2.mo69882m(i2 + i3, 14 - i3, bArr2);
                        if (m == -1) {
                            break;
                        }
                        i3 += m;
                        i2 = 2;
                    }
                    rVar.mo46934y(i3);
                    eVar2.f40296f = 0;
                    eVar2.mo69880k((int) (h - eVar2.f40294d), false);
                    z = C18354l.m31023a(rVar, oVar, i, aVar);
                }
                if (z) {
                    break;
                }
                eVar2.mo69880k(1, false);
            }
            long h2 = eVar.mo69877h();
            long j = eVar2.f40293c;
            if (h2 < j - 6) {
                return this.f40682c.f40302a;
            }
            eVar2.mo69880k((int) (j - eVar.mo69877h()), false);
            return this.f40680a.f40314j;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18474a(p644ph.C18358o r15, int r16, long r17, long r19) {
        /*
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            bo.app.f7 r1 = new bo.app.f7
            r2 = 5
            r1.<init>(r15, r2)
            rh.a$a r2 = new rh.a$a
            r3 = r16
            r2.<init>(r15, r3)
            long r3 = r15.mo69888c()
            long r5 = r0.f40314j
            int r7 = r0.f40308d
            if (r7 <= 0) goto L_0x0026
            long r7 = (long) r7
            int r9 = r0.f40307c
            long r9 = (long) r9
            long r7 = r7 + r9
            r9 = 2
            long r7 = r7 / r9
            r9 = 1
            goto L_0x003f
        L_0x0026:
            int r7 = r0.f40305a
            int r8 = r0.f40306b
            if (r7 != r8) goto L_0x0030
            if (r7 <= 0) goto L_0x0030
            long r7 = (long) r7
            goto L_0x0032
        L_0x0030:
            r7 = 4096(0x1000, double:2.0237E-320)
        L_0x0032:
            int r9 = r0.f40311g
            long r9 = (long) r9
            long r7 = r7 * r9
            int r9 = r0.f40312h
            long r9 = (long) r9
            long r7 = r7 * r9
            r9 = 8
            long r7 = r7 / r9
            r9 = 64
        L_0x003f:
            long r11 = r7 + r9
            r7 = 6
            int r0 = r0.f40307c
            int r13 = java.lang.Math.max(r7, r0)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p661rh.C18474a.<init>(ph.o, int, long, long):void");
    }
}
