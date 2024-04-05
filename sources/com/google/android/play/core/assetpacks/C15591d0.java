package com.google.android.play.core.assetpacks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.d0 */
public final class C15591d0 extends InputStream {

    /* renamed from: b */
    public final InputStream f35101b;

    /* renamed from: c */
    public long f35102c;

    public C15591d0(FileInputStream fileInputStream, long j) {
        this.f35101b = fileInputStream;
        this.f35102c = j;
    }

    public final void close() throws IOException {
        super.close();
        this.f35101b.close();
        this.f35102c = 0;
    }

    public final int read() throws IOException {
        long j = this.f35102c;
        if (j <= 0) {
            return -1;
        }
        this.f35102c = j - 1;
        return this.f35101b.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f35102c;
        if (j <= 0) {
            return -1;
        }
        int read = this.f35101b.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f35102c -= (long) read;
        }
        return read;
    }
}
