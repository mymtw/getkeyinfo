package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p003a2.C0015b;

/* renamed from: com.bumptech.glide.load.data.g */
public final class C5975g extends FilterInputStream {

    /* renamed from: d */
    public static final byte[] f12784d = {-1, -31, 0, 28, 69, Framer.EXIT_FRAME_PREFIX, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: e */
    public static final int f12785e = 31;

    /* renamed from: b */
    public final byte f12786b;

    /* renamed from: c */
    public int f12787c;

    public C5975g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(C0015b.m88g("Cannot add invalid orientation: ", i));
        }
        this.f12786b = (byte) i;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f12787c;
        if (i3 < 2 || i3 > (i2 = f12785e)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f12786b;
        } else {
            i = f12784d[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f12787c++;
        }
        return i;
    }

    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f12787c = (int) (((long) this.f12787c) + skip);
        }
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f12787c;
        int i5 = f12785e;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f12786b;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f12784d, this.f12787c - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f12787c += i3;
        }
        return i3;
    }
}
