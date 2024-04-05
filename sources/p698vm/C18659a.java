package p698vm;

import java.io.OutputStream;

/* renamed from: vm.a */
public final class C18659a extends OutputStream {

    /* renamed from: b */
    public long f41267b = 0;

    public final void write(int i) {
        this.f41267b++;
    }

    public final void write(byte[] bArr) {
        this.f41267b += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f41267b += (long) i2;
    }
}
