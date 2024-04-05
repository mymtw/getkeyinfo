package p685uh;

import java.io.IOException;
import p513bj.C14077r;
import p644ph.C18346e;

/* renamed from: uh.e */
public final class C18581e {

    /* renamed from: a */
    public final C14077r f41026a = new C14077r(8);

    /* renamed from: b */
    public int f41027b;

    /* renamed from: a */
    public final long mo70085a(C18346e eVar) throws IOException {
        int i = 0;
        eVar.mo69872c(this.f41026a.f30986a, 0, 1, false);
        byte b = this.f41026a.f30986a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        eVar.mo69872c(this.f41026a.f30986a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f41026a.f30986a[i] & 255) + (i4 << 8);
        }
        this.f41027b = i3 + 1 + this.f41027b;
        return (long) i4;
    }
}
