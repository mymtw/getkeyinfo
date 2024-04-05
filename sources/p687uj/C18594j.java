package p687uj;

import java.io.OutputStream;

/* renamed from: uj.j */
public final class C18594j extends OutputStream {

    /* renamed from: b */
    public long f41065b = 0;

    public final void write(int i) {
        this.f41065b++;
    }

    public final void write(byte[] bArr) {
        this.f41065b += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f41065b += (long) i2;
    }
}
