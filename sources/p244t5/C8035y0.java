package p244t5;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: t5.y0 */
public final class C8035y0 extends C7968c1 {

    /* renamed from: d */
    public int f17520d;

    /* renamed from: e */
    public int f17521e;

    /* renamed from: f */
    public boolean f17522f = false;

    /* renamed from: g */
    public boolean f17523g = true;

    public C8035y0(InputStream inputStream, int i) {
        super(inputStream, i);
        this.f17520d = inputStream.read();
        int read = inputStream.read();
        this.f17521e = read;
        if (read >= 0) {
            mo20590d();
            return;
        }
        throw new EOFException();
    }

    /* renamed from: d */
    public final boolean mo20590d() {
        if (!this.f17522f && this.f17523g && this.f17520d == 0 && this.f17521e == 0) {
            this.f17522f = true;
            mo20532b();
        }
        return this.f17522f;
    }

    public final int read() {
        if (mo20590d()) {
            return -1;
        }
        int read = this.f17449b.read();
        if (read >= 0) {
            int i = this.f17520d;
            this.f17520d = this.f17521e;
            this.f17521e = read;
            return i;
        }
        throw new EOFException();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f17523g || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f17522f) {
            return -1;
        }
        int read = this.f17449b.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.f17520d;
            bArr[i + 1] = (byte) this.f17521e;
            this.f17520d = this.f17449b.read();
            int read2 = this.f17449b.read();
            this.f17521e = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
