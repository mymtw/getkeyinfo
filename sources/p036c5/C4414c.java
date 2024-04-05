package p036c5;

import android.support.p013v4.media.C0072d;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c5.c */
public final class C4414c extends FilterInputStream {

    /* renamed from: b */
    public final long f9689b;

    /* renamed from: c */
    public int f9690c;

    public C4414c(InputStream inputStream, long j) {
        super(inputStream);
        this.f9689b = j;
    }

    /* renamed from: a */
    public final void mo14356a(int i) throws IOException {
        if (i >= 0) {
            this.f9690c += i;
        } else if (this.f9689b - ((long) this.f9690c) > 0) {
            StringBuilder h = C0072d.m201h("Failed to read all expected data, expected: ");
            h.append(this.f9689b);
            h.append(", but read: ");
            h.append(this.f9690c);
            throw new IOException(h.toString());
        }
    }

    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f9689b - ((long) this.f9690c), (long) this.in.available());
    }

    public final synchronized int read() throws IOException {
        int read;
        read = super.read();
        mo14356a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        mo14356a(read);
        return read;
    }
}
