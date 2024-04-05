package p717yh;

import java.io.IOException;
import p513bj.C14049b0;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18336a;
import p644ph.C18346e;

/* renamed from: yh.u */
public final class C18875u extends C18336a {

    /* renamed from: yh.u$a */
    public static final class C18876a implements C18336a.C18342f {

        /* renamed from: a */
        public final C14086y f42023a;

        /* renamed from: b */
        public final C14077r f42024b = new C14077r();

        public C18876a(C14086y yVar) {
            this.f42023a = yVar;
        }

        /* renamed from: a */
        public final C18336a.C18341e mo69868a(C18346e eVar, long j) throws IOException {
            int d;
            C18346e eVar2 = eVar;
            long j2 = eVar2.f40294d;
            int min = (int) Math.min(20000, eVar2.f40293c - j2);
            this.f42024b.mo46932w(min);
            eVar2.mo69872c(this.f42024b.f30986a, 0, min, false);
            C14077r rVar = this.f42024b;
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (true) {
                int i3 = rVar.f30988c;
                int i4 = rVar.f30987b;
                if (i3 - i4 < 4) {
                    return j3 != -9223372036854775807L ? new C18336a.C18341e(j3, j2 + ((long) i), -2) : C18336a.C18341e.f40275d;
                }
                if (C18875u.m31939d(i4, rVar.f30986a) != 442) {
                    rVar.mo46909A(1);
                } else {
                    rVar.mo46909A(4);
                    long c = C18877v.m31943c(rVar);
                    if (c != -9223372036854775807L) {
                        long b = this.f42023a.mo46958b(c);
                        if (b > j) {
                            return j3 == -9223372036854775807L ? new C18336a.C18341e(b, j2, -1) : C18336a.C18341e.m30973a(j2 + ((long) i2));
                        }
                        if (100000 + b > j) {
                            return C18336a.C18341e.m30973a(j2 + ((long) rVar.f30987b));
                        }
                        i2 = rVar.f30987b;
                        j3 = b;
                    }
                    int i5 = rVar.f30988c;
                    if (i5 - rVar.f30987b >= 10) {
                        rVar.mo46909A(9);
                        int p = rVar.mo46925p() & 7;
                        if (rVar.f30988c - rVar.f30987b >= p) {
                            rVar.mo46909A(p);
                            int i6 = rVar.f30988c;
                            int i7 = rVar.f30987b;
                            if (i6 - i7 >= 4) {
                                if (C18875u.m31939d(i7, rVar.f30986a) == 443) {
                                    rVar.mo46909A(4);
                                    int u = rVar.mo46930u();
                                    if (rVar.f30988c - rVar.f30987b < u) {
                                        rVar.mo46935z(i5);
                                    } else {
                                        rVar.mo46909A(u);
                                    }
                                }
                                while (true) {
                                    int i8 = rVar.f30988c;
                                    int i9 = rVar.f30987b;
                                    if (i8 - i9 < 4 || (d = C18875u.m31939d(i9, rVar.f30986a)) == 442 || d == 441 || (d >>> 8) != 1) {
                                        break;
                                    }
                                    rVar.mo46909A(4);
                                    if (rVar.f30988c - rVar.f30987b < 2) {
                                        rVar.mo46935z(i5);
                                        break;
                                    }
                                    rVar.mo46935z(Math.min(rVar.f30988c, rVar.f30987b + rVar.mo46930u()));
                                }
                            } else {
                                rVar.mo46935z(i5);
                            }
                        } else {
                            rVar.mo46935z(i5);
                        }
                    } else {
                        rVar.mo46935z(i5);
                    }
                    i = rVar.f30987b;
                }
            }
        }

        /* renamed from: b */
        public final void mo69869b() {
            C14077r rVar = this.f42024b;
            byte[] bArr = C14049b0.f30918f;
            rVar.getClass();
            rVar.mo46933x(bArr.length, bArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18875u(C14086y yVar, long j, long j2) {
        super(new C18336a.C18338b(), new C18876a(yVar), j, j + 1, 0, j2, 188, 1000);
        C14086y yVar2 = yVar;
    }

    /* renamed from: d */
    public static int m31939d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
