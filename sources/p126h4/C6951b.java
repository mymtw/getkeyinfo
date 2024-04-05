package p126h4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: h4.b */
public final class C6951b implements Closeable {

    /* renamed from: b */
    public final InputStream f15419b;

    /* renamed from: c */
    public final Charset f15420c;

    /* renamed from: d */
    public byte[] f15421d;

    /* renamed from: e */
    public int f15422e;

    /* renamed from: f */
    public int f15423f;

    /* renamed from: h4.b$a */
    public class C6952a extends ByteArrayOutputStream {
        public C6952a(int i) {
            super(i);
        }

        public final String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C6951b.this.f15420c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C6951b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(C6953c.f15425a)) {
            this.f15419b = fileInputStream;
            this.f15420c = charset;
            this.f15421d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public final String mo19112a() throws IOException {
        int i;
        synchronized (this.f15419b) {
            byte[] bArr = this.f15421d;
            if (bArr != null) {
                if (this.f15422e >= this.f15423f) {
                    int read = this.f15419b.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f15422e = 0;
                        this.f15423f = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i2 = this.f15422e; i2 != this.f15423f; i2++) {
                    byte[] bArr2 = this.f15421d;
                    if (bArr2[i2] == 10) {
                        int i3 = this.f15422e;
                        if (i2 != i3) {
                            i = i2 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i3, i - i3, this.f15420c.name());
                                this.f15422e = i2 + 1;
                                return str;
                            }
                        }
                        i = i2;
                        String str2 = new String(bArr2, i3, i - i3, this.f15420c.name());
                        this.f15422e = i2 + 1;
                        return str2;
                    }
                }
                C6952a aVar = new C6952a((this.f15423f - this.f15422e) + 80);
                while (true) {
                    byte[] bArr3 = this.f15421d;
                    int i4 = this.f15422e;
                    aVar.write(bArr3, i4, this.f15423f - i4);
                    this.f15423f = -1;
                    InputStream inputStream = this.f15419b;
                    byte[] bArr4 = this.f15421d;
                    int read2 = inputStream.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f15422e = 0;
                        this.f15423f = read2;
                        int i5 = 0;
                        while (true) {
                            if (i5 != this.f15423f) {
                                byte[] bArr5 = this.f15421d;
                                if (bArr5[i5] == 10) {
                                    int i6 = this.f15422e;
                                    if (i5 != i6) {
                                        aVar.write(bArr5, i6, i5 - i6);
                                    }
                                    this.f15422e = i5 + 1;
                                    String aVar2 = aVar.toString();
                                    return aVar2;
                                }
                                i5++;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    public final void close() throws IOException {
        synchronized (this.f15419b) {
            if (this.f15421d != null) {
                this.f15421d = null;
                this.f15419b.close();
            }
        }
    }
}
