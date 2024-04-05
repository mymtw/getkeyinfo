package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.data.c */
public final class C5967c extends OutputStream {

    /* renamed from: b */
    public final OutputStream f12777b;

    /* renamed from: c */
    public byte[] f12778c;

    /* renamed from: d */
    public C5996b f12779d;

    /* renamed from: e */
    public int f12780e;

    public C5967c(FileOutputStream fileOutputStream, C5996b bVar) {
        this.f12777b = fileOutputStream;
        this.f12779d = bVar;
        this.f12778c = (byte[]) bVar.mo16914c(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() throws IOException {
        try {
            flush();
            this.f12777b.close();
            byte[] bArr = this.f12778c;
            if (bArr != null) {
                this.f12779d.put(bArr);
                this.f12778c = null;
            }
        } catch (Throwable th) {
            this.f12777b.close();
            throw th;
        }
    }

    public final void flush() throws IOException {
        int i = this.f12780e;
        if (i > 0) {
            this.f12777b.write(this.f12778c, 0, i);
            this.f12780e = 0;
        }
        this.f12777b.flush();
    }

    public final void write(int i) throws IOException {
        byte[] bArr = this.f12778c;
        int i2 = this.f12780e;
        int i3 = i2 + 1;
        this.f12780e = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length && i3 > 0) {
            this.f12777b.write(bArr, 0, i3);
            this.f12780e = 0;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f12780e;
            if (i6 != 0 || i4 < this.f12778c.length) {
                int min = Math.min(i4, this.f12778c.length - i6);
                System.arraycopy(bArr, i5, this.f12778c, this.f12780e, min);
                int i7 = this.f12780e + min;
                this.f12780e = i7;
                i3 += min;
                byte[] bArr2 = this.f12778c;
                if (i7 == bArr2.length && i7 > 0) {
                    this.f12777b.write(bArr2, 0, i7);
                    this.f12780e = 0;
                    continue;
                }
            } else {
                this.f12777b.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
