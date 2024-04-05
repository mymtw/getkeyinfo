package p717yh;

import androidx.compose.foundation.layout.C0761x;
import java.io.IOException;
import p513bj.C14049b0;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18336a;
import p644ph.C18346e;

/* renamed from: yh.b0 */
public final class C18839b0 extends C18336a {

    /* renamed from: yh.b0$a */
    public static final class C18840a implements C18336a.C18342f {

        /* renamed from: a */
        public final C14086y f41724a;

        /* renamed from: b */
        public final C14077r f41725b = new C14077r();

        /* renamed from: c */
        public final int f41726c;

        /* renamed from: d */
        public final int f41727d;

        public C18840a(int i, C14086y yVar, int i2) {
            this.f41726c = i;
            this.f41724a = yVar;
            this.f41727d = i2;
        }

        /* renamed from: a */
        public final C18336a.C18341e mo69868a(C18346e eVar, long j) throws IOException {
            C18346e eVar2 = eVar;
            long j2 = eVar2.f40294d;
            int min = (int) Math.min((long) this.f41727d, eVar2.f40293c - j2);
            this.f41725b.mo46932w(min);
            eVar2.mo69872c(this.f41725b.f30986a, 0, min, false);
            C14077r rVar = this.f41725b;
            int i = rVar.f30988c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (true) {
                int i2 = rVar.f30988c;
                int i3 = rVar.f30987b;
                if (i2 - i3 < 188) {
                    break;
                }
                byte[] bArr = rVar.f30986a;
                while (i3 < i && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i) {
                    break;
                }
                long C0 = C0761x.m1660C0(rVar, i3, this.f41726c);
                if (C0 != -9223372036854775807L) {
                    long b = this.f41724a.mo46958b(C0);
                    if (b > j) {
                        return j5 == -9223372036854775807L ? new C18336a.C18341e(b, j2, -1) : C18336a.C18341e.m30973a(j2 + j4);
                    }
                    if (100000 + b > j) {
                        return C18336a.C18341e.m30973a(j2 + ((long) i3));
                    }
                    j5 = b;
                    j4 = (long) i3;
                }
                rVar.mo46935z(i4);
                j3 = (long) i4;
            }
            return j5 != -9223372036854775807L ? new C18336a.C18341e(j5, j2 + j3, -2) : C18336a.C18341e.f40275d;
        }

        /* renamed from: b */
        public final void mo69869b() {
            C14077r rVar = this.f41725b;
            byte[] bArr = C14049b0.f30918f;
            rVar.getClass();
            rVar.mo46933x(bArr.length, bArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18839b0(C14086y yVar, long j, long j2, int i, int i2) {
        super(new C18336a.C18338b(), new C18840a(i, yVar, i2), j, j + 1, 0, j2, 188, 940);
        C14086y yVar2 = yVar;
    }
}
