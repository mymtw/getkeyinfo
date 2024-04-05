package p687uj;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: uj.f */
public final class C18590f extends FilterInputStream {

    /* renamed from: b */
    public long f41059b;

    /* renamed from: c */
    public long f41060c = -1;

    public C18590f(InputStream inputStream) {
        super(inputStream);
        inputStream.getClass();
        this.f41059b = 1048577;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.f41059b);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f41060c = this.f41059b;
    }

    public final int read() throws IOException {
        if (this.f41059b == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f41059b--;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f41060c != -1) {
            this.in.reset();
            this.f41059b = this.f41060c;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.f41059b));
        this.f41059b -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f41059b;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f41059b -= (long) read;
        }
        return read;
    }
}
