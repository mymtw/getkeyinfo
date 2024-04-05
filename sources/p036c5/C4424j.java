package p036c5;

import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: c5.j */
public final class C4424j extends FilterInputStream {

    /* renamed from: b */
    public int f9706b = Integer.MIN_VALUE;

    public C4424j(C4415d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final long mo14378a(long j) {
        int i = this.f9706b;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    public final int available() throws IOException {
        int i = this.f9706b;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* renamed from: b */
    public final void mo14380b(long j) {
        int i = this.f9706b;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f9706b = (int) (((long) i) - j);
        }
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.f9706b = i;
    }

    public final int read() throws IOException {
        if (mo14378a(1) == -1) {
            return -1;
        }
        int read = super.read();
        mo14380b(1);
        return read;
    }

    public final synchronized void reset() throws IOException {
        super.reset();
        this.f9706b = Integer.MIN_VALUE;
    }

    public final long skip(long j) throws IOException {
        long a = mo14378a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        mo14380b(skip);
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) mo14378a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        mo14380b((long) read);
        return read;
    }
}
