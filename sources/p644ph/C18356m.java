package p644ph;

import java.util.Arrays;
import p513bj.C14077r;
import p644ph.C18358o;

/* renamed from: ph.m */
public final class C18356m {
    /* renamed from: a */
    public static C18358o.C18359a m31025a(C14077r rVar) {
        rVar.mo46909A(1);
        int r = rVar.mo46927r();
        long j = ((long) rVar.f30987b) + ((long) r);
        int i = r / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j2 = rVar.mo46919j();
            if (j2 == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = j2;
            jArr2[i2] = rVar.mo46919j();
            rVar.mo46909A(2);
            i2++;
        }
        rVar.mo46909A((int) (j - ((long) rVar.f30987b)));
        return new C18358o.C18359a(jArr, jArr2);
    }
}
