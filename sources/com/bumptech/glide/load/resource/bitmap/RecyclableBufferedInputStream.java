package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: b */
    public volatile byte[] f13056b;

    /* renamed from: c */
    public int f13057c;

    /* renamed from: d */
    public int f13058d;

    /* renamed from: e */
    public int f13059e = -1;

    /* renamed from: f */
    public int f13060f;

    /* renamed from: g */
    public final C5996b f13061g;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, C5996b bVar) {
        super(inputStream);
        this.f13061g = bVar;
        this.f13056b = (byte[]) bVar.mo16914c(65536, byte[].class);
    }

    /* renamed from: b */
    public static void m12042b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int mo17013a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.f13059e;
        if (i2 == -1 || this.f13060f - i2 >= (i = this.f13058d)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f13059e = -1;
                this.f13060f = 0;
                this.f13057c = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f13057c == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f13061g.mo16914c(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f13056b = bArr2;
            this.f13061g.put(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f13060f - this.f13059e;
        this.f13060f = i3;
        this.f13059e = 0;
        this.f13057c = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f13060f;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f13057c = i4;
        return read2;
    }

    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f13056b == null || inputStream == null) {
            m12042b();
            throw null;
        }
        return (this.f13057c - this.f13060f) + inputStream.available();
    }

    public final void close() throws IOException {
        if (this.f13056b != null) {
            this.f13061g.put(this.f13056b);
            this.f13056b = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void mark(int i) {
        this.f13058d = Math.max(this.f13058d, i);
        this.f13059e = this.f13060f;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0019=Splitter:B:11:0x0019, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f13056b     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f13060f     // Catch:{ all -> 0x003d }
            int r4 = r6.f13057c     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.mo17013a(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f13056b     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f13056b     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            m12042b()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x0026:
            int r1 = r6.f13057c     // Catch:{ all -> 0x003d }
            int r2 = r6.f13060f     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f13060f = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            m12042b()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read():int");
    }

    public final synchronized void release() {
        if (this.f13056b != null) {
            this.f13061g.put(this.f13056b);
            this.f13056b = null;
        }
    }

    public final synchronized void reset() throws IOException {
        if (this.f13056b != null) {
            int i = this.f13059e;
            if (-1 != i) {
                this.f13060f = i;
            } else {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f13060f + " markLimit: " + this.f13058d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f13056b;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f13057c;
                int i2 = this.f13060f;
                if (((long) (i - i2)) >= j) {
                    this.f13060f = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f13060f = i;
                if (this.f13059e == -1 || j > ((long) this.f13058d)) {
                    long skip = inputStream.skip(j - j2);
                    if (skip > 0) {
                        this.f13059e = -1;
                    }
                    return j2 + skip;
                } else if (mo17013a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f13057c;
                    int i4 = this.f13060f;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f13060f = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f13060f = i3;
                    return j3;
                }
            } else {
                m12042b();
                throw null;
            }
        } else {
            m12042b();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0045, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0052, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f13056b     // Catch:{ all -> 0x0088 }
            r1 = 0
            if (r0 == 0) goto L_0x0084
            if (r9 != 0) goto L_0x000b
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0080
            int r3 = r6.f13060f     // Catch:{ all -> 0x0088 }
            int r4 = r6.f13057c     // Catch:{ all -> 0x0088 }
            if (r3 >= r4) goto L_0x0030
            int r4 = r4 - r3
            if (r4 < r9) goto L_0x0019
            r4 = r9
        L_0x0019:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r3 = r6.f13060f     // Catch:{ all -> 0x0088 }
            int r3 = r3 + r4
            r6.f13060f = r3     // Catch:{ all -> 0x0088 }
            if (r4 == r9) goto L_0x002e
            int r3 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r3 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L_0x0031
        L_0x002e:
            monitor-exit(r6)
            return r4
        L_0x0030:
            r3 = r9
        L_0x0031:
            int r4 = r6.f13059e     // Catch:{ all -> 0x0088 }
            r5 = -1
            if (r4 != r5) goto L_0x0046
            int r4 = r0.length     // Catch:{ all -> 0x0088 }
            if (r3 < r4) goto L_0x0046
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0070
            if (r3 != r9) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            int r5 = r9 - r3
        L_0x0044:
            monitor-exit(r6)
            return r5
        L_0x0046:
            int r4 = r6.mo17013a(r2, r0)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0053
            if (r3 != r9) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            int r5 = r9 - r3
        L_0x0051:
            monitor-exit(r6)
            return r5
        L_0x0053:
            byte[] r4 = r6.f13056b     // Catch:{ all -> 0x0088 }
            if (r0 == r4) goto L_0x0060
            byte[] r0 = r6.f13056b     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            m12042b()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0060:
            int r4 = r6.f13057c     // Catch:{ all -> 0x0088 }
            int r5 = r6.f13060f     // Catch:{ all -> 0x0088 }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0068
            r4 = r3
        L_0x0068:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r5 = r6.f13060f     // Catch:{ all -> 0x0088 }
            int r5 = r5 + r4
            r6.f13060f = r5     // Catch:{ all -> 0x0088 }
        L_0x0070:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0075
            monitor-exit(r6)
            return r9
        L_0x0075:
            int r5 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x007e
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x007e:
            int r8 = r8 + r4
            goto L_0x0031
        L_0x0080:
            m12042b()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0084:
            m12042b()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read(byte[], int, int):int");
    }
}
