package com.squareup.picasso;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.o */
public final class C17454o extends InputStream {

    /* renamed from: b */
    public final InputStream f38129b;

    /* renamed from: c */
    public long f38130c;

    /* renamed from: d */
    public long f38131d;

    /* renamed from: e */
    public long f38132e;

    /* renamed from: f */
    public long f38133f = -1;

    /* renamed from: g */
    public boolean f38134g = true;

    /* renamed from: h */
    public int f38135h = -1;

    /* JADX WARNING: Incorrect type for immutable var: ssa=lr.x$a, code=java.io.InputStream, for r3v0, types: [lr.x$a, java.io.InputStream] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17454o(java.io.InputStream r3) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f38133f = r0
            r0 = 1
            r2.f38134g = r0
            r0 = -1
            r2.f38135h = r0
            boolean r0 = r3.markSupported()
            if (r0 != 0) goto L_0x001b
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x001b:
            r2.f38129b = r3
            r3 = 1024(0x400, float:1.435E-42)
            r2.f38135h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C17454o.<init>(lr.x$a):void");
    }

    /* renamed from: a */
    public final void mo68610a(long j) throws IOException {
        if (this.f38130c > this.f38132e || j < this.f38131d) {
            throw new IOException("Cannot reset");
        }
        this.f38129b.reset();
        mo68614d(this.f38131d, j);
        this.f38130c = j;
    }

    public final int available() throws IOException {
        return this.f38129b.available();
    }

    /* renamed from: b */
    public final void mo68612b(long j) {
        try {
            long j2 = this.f38131d;
            long j3 = this.f38130c;
            if (j2 >= j3 || j3 > this.f38132e) {
                this.f38131d = j3;
                this.f38129b.mark((int) (j - j3));
            } else {
                this.f38129b.reset();
                this.f38129b.mark((int) (j - this.f38131d));
                mo68614d(this.f38131d, this.f38130c);
            }
            this.f38132e = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    public final void close() throws IOException {
        this.f38129b.close();
    }

    /* renamed from: d */
    public final void mo68614d(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f38129b.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public final void mark(int i) {
        long j = this.f38130c + ((long) i);
        if (this.f38132e < j) {
            mo68612b(j);
        }
        this.f38133f = this.f38130c;
    }

    public final boolean markSupported() {
        return this.f38129b.markSupported();
    }

    public final int read() throws IOException {
        if (!this.f38134g) {
            long j = this.f38132e;
            if (this.f38130c + 1 > j) {
                mo68612b(j + ((long) this.f38135h));
            }
        }
        int read = this.f38129b.read();
        if (read != -1) {
            this.f38130c++;
        }
        return read;
    }

    public final void reset() throws IOException {
        mo68610a(this.f38133f);
    }

    public final long skip(long j) throws IOException {
        if (!this.f38134g) {
            long j2 = this.f38130c;
            if (j2 + j > this.f38132e) {
                mo68612b(j2 + j + ((long) this.f38135h));
            }
        }
        long skip = this.f38129b.skip(j);
        this.f38130c += skip;
        return skip;
    }

    public final int read(byte[] bArr) throws IOException {
        if (!this.f38134g) {
            long j = this.f38130c;
            if (((long) bArr.length) + j > this.f38132e) {
                mo68612b(j + ((long) bArr.length) + ((long) this.f38135h));
            }
        }
        int read = this.f38129b.read(bArr);
        if (read != -1) {
            this.f38130c += (long) read;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f38134g) {
            long j = this.f38130c;
            long j2 = (long) i2;
            if (j + j2 > this.f38132e) {
                mo68612b(j + j2 + ((long) this.f38135h));
            }
        }
        int read = this.f38129b.read(bArr, i, i2);
        if (read != -1) {
            this.f38130c += (long) read;
        }
        return read;
    }
}
