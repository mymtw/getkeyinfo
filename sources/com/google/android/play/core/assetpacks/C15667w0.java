package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.play.core.assetpacks.w0 */
public final class C15667w0 extends OutputStream {

    /* renamed from: b */
    public final C15648r1 f35384b = new C15648r1();

    /* renamed from: c */
    public final File f35385c;

    /* renamed from: d */
    public final C15617j2 f35386d;

    /* renamed from: e */
    public long f35387e;

    /* renamed from: f */
    public long f35388f;

    /* renamed from: g */
    public FileOutputStream f35389g;

    /* renamed from: h */
    public C15615j0 f35390h;

    public C15667w0(File file, C15617j2 j2Var) {
        this.f35385c = file;
        this.f35386d = j2Var;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            boolean z = true;
            if (this.f35387e == 0 && this.f35388f == 0) {
                int a = this.f35384b.mo55482a(i, i2, bArr);
                if (a != -1) {
                    i += a;
                    i2 -= a;
                    C15615j0 b = this.f35384b.mo55483b();
                    this.f35390h = b;
                    if (b.f35203e) {
                        this.f35387e = 0;
                        C15617j2 j2Var = this.f35386d;
                        byte[] bArr2 = b.f35204f;
                        int length = bArr2.length;
                        j2Var.f35216g++;
                        FileOutputStream fileOutputStream = new FileOutputStream(j2Var.mo55434c());
                        try {
                            fileOutputStream.write(bArr2, 0, length);
                            fileOutputStream.close();
                            this.f35388f = (long) this.f35390h.f35204f.length;
                        } catch (Throwable unused) {
                        }
                    } else {
                        if (!(b.mo55423a() == 0) || this.f35390h.mo55476g()) {
                            byte[] bArr3 = this.f35390h.f35204f;
                            C15617j2 j2Var2 = this.f35386d;
                            int length2 = bArr3.length;
                            j2Var2.f35216g++;
                            FileOutputStream fileOutputStream2 = new FileOutputStream(j2Var2.mo55434c());
                            try {
                                fileOutputStream2.write(bArr3, 0, length2);
                                fileOutputStream2.close();
                                this.f35387e = this.f35390h.f35200b;
                            } catch (Throwable unused2) {
                            }
                        } else {
                            this.f35386d.mo55439h(this.f35390h.f35204f);
                            File file = new File(this.f35385c, this.f35390h.f35199a);
                            file.getParentFile().mkdirs();
                            this.f35387e = this.f35390h.f35200b;
                            this.f35389g = new FileOutputStream(file);
                        }
                    }
                } else {
                    return;
                }
            }
            if (!this.f35390h.mo55476g()) {
                C15615j0 j0Var = this.f35390h;
                if (j0Var.f35203e) {
                    C15617j2 j2Var3 = this.f35386d;
                    long j = this.f35388f;
                    RandomAccessFile randomAccessFile = new RandomAccessFile(j2Var3.mo55434c(), "rw");
                    try {
                        randomAccessFile.seek(j);
                        randomAccessFile.write(bArr, i, i2);
                        randomAccessFile.close();
                        this.f35388f += (long) i2;
                        i3 = i2;
                    } catch (Throwable unused3) {
                    }
                } else {
                    if (j0Var.mo55423a() != 0) {
                        z = false;
                    }
                    if (z) {
                        i3 = (int) Math.min((long) i2, this.f35387e);
                        this.f35389g.write(bArr, i, i3);
                        long j2 = this.f35387e - ((long) i3);
                        this.f35387e = j2;
                        if (j2 == 0) {
                            this.f35389g.close();
                        }
                    } else {
                        i3 = (int) Math.min((long) i2, this.f35387e);
                        C15615j0 j0Var2 = this.f35390h;
                        long length3 = (((long) j0Var2.f35204f.length) + j0Var2.f35200b) - this.f35387e;
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f35386d.mo55434c(), "rw");
                        try {
                            randomAccessFile2.seek(length3);
                            randomAccessFile2.write(bArr, i, i3);
                            randomAccessFile2.close();
                            this.f35387e -= (long) i3;
                        } catch (Throwable unused4) {
                        }
                    }
                }
                i += i3;
                i2 -= i3;
            }
        }
        return;
        throw th;
        throw th;
        throw th;
        throw th;
    }
}
