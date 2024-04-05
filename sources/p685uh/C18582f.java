package p685uh;

import java.io.IOException;
import p644ph.C18346e;

/* renamed from: uh.f */
public final class C18582f {

    /* renamed from: d */
    public static final long[] f41028d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f41029a = new byte[8];

    /* renamed from: b */
    public int f41030b;

    /* renamed from: c */
    public int f41031c;

    /* renamed from: a */
    public static long m31341a(int i, boolean z, byte[] bArr) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f41028d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: b */
    public final long mo70086b(C18346e eVar, boolean z, boolean z2, int i) throws IOException {
        int i2;
        if (this.f41030b == 0) {
            if (!eVar.mo69874g(this.f41029a, 0, 1, z)) {
                return -1;
            }
            byte b = this.f41029a[0] & 255;
            int i3 = 0;
            while (true) {
                long[] jArr = f41028d;
                if (i3 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((((long) b) & jArr[i3]) != 0) {
                    i2 = i3 + 1;
                    break;
                }
                i3++;
            }
            this.f41031c = i2;
            if (i2 != -1) {
                this.f41030b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i4 = this.f41031c;
        if (i4 > i) {
            this.f41030b = 0;
            return -2;
        }
        if (i4 != 1) {
            eVar.mo69874g(this.f41029a, 1, i4 - 1, false);
        }
        this.f41030b = 0;
        return m31341a(this.f41031c, z2, this.f41029a);
    }
}
