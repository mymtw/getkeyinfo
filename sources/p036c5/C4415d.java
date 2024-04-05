package p036c5;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: c5.d */
public final class C4415d extends InputStream {

    /* renamed from: d */
    public static final ArrayDeque f9691d = new ArrayDeque(0);

    /* renamed from: b */
    public InputStream f9692b;

    /* renamed from: c */
    public IOException f9693c;

    static {
        char[] cArr = C4426l.f9710a;
    }

    public final int available() throws IOException {
        return this.f9692b.available();
    }

    public final void close() throws IOException {
        this.f9692b.close();
    }

    public final void mark(int i) {
        this.f9692b.mark(i);
    }

    public final boolean markSupported() {
        return this.f9692b.markSupported();
    }

    public final int read() throws IOException {
        try {
            return this.f9692b.read();
        } catch (IOException e) {
            this.f9693c = e;
            throw e;
        }
    }

    public final synchronized void reset() throws IOException {
        this.f9692b.reset();
    }

    public final long skip(long j) throws IOException {
        try {
            return this.f9692b.skip(j);
        } catch (IOException e) {
            this.f9693c = e;
            throw e;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f9692b.read(bArr);
        } catch (IOException e) {
            this.f9693c = e;
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f9692b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f9693c = e;
            throw e;
        }
    }
}
