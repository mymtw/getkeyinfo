package p717yh;

import p513bj.C14049b0;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18346e;

/* renamed from: yh.v */
public final class C18877v {

    /* renamed from: a */
    public final C14086y f42025a = new C14086y(0);

    /* renamed from: b */
    public final C14077r f42026b = new C14077r();

    /* renamed from: c */
    public boolean f42027c;

    /* renamed from: d */
    public boolean f42028d;

    /* renamed from: e */
    public boolean f42029e;

    /* renamed from: f */
    public long f42030f = -9223372036854775807L;

    /* renamed from: g */
    public long f42031g = -9223372036854775807L;

    /* renamed from: h */
    public long f42032h = -9223372036854775807L;

    /* renamed from: b */
    public static int m31942b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: c */
    public static long m31943c(C14077r rVar) {
        C14077r rVar2 = rVar;
        int i = rVar2.f30987b;
        if (rVar2.f30988c - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        boolean z = false;
        rVar2.mo46911b(0, 9, bArr);
        rVar2.mo46935z(i);
        byte b = bArr[0];
        if ((b & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            z = true;
        }
        if (!z) {
            return -9223372036854775807L;
        }
        long j = (long) b;
        long j2 = ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20);
        long j3 = (long) bArr[2];
        return j2 | (((j3 & 248) >> 3) << 15) | ((j3 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: a */
    public final void mo70310a(C18346e eVar) {
        C14077r rVar = this.f42026b;
        byte[] bArr = C14049b0.f30918f;
        rVar.getClass();
        rVar.mo46933x(bArr.length, bArr);
        this.f42027c = true;
        eVar.f40296f = 0;
    }
}
