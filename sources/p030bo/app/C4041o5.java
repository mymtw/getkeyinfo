package p030bo.app;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: bo.app.o5 */
class C4041o5 implements Closeable {

    /* renamed from: b */
    private final InputStream f9020b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Charset f9021c;

    /* renamed from: d */
    private byte[] f9022d;

    /* renamed from: e */
    private int f9023e;

    /* renamed from: f */
    private int f9024f;

    /* renamed from: bo.app.o5$a */
    public class C4042a extends ByteArrayOutputStream {
        public C4042a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0) {
                int i2 = i - 1;
                if (this.buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(this.buf, 0, i, C4041o5.this.f9021c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C4041o5(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public boolean mo13818b() {
        return this.f9024f == -1;
    }

    /* renamed from: c */
    public String mo13819c() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f9020b) {
            if (this.f9022d != null) {
                if (this.f9023e >= this.f9024f) {
                    m9303a();
                }
                for (int i3 = this.f9023e; i3 != this.f9024f; i3++) {
                    byte[] bArr2 = this.f9022d;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f9023e;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f9021c.name());
                                this.f9023e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f9021c.name());
                        this.f9023e = i3 + 1;
                        return str2;
                    }
                }
                C4042a aVar = new C4042a((this.f9024f - this.f9023e) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f9022d;
                    int i5 = this.f9023e;
                    aVar.write(bArr3, i5, this.f9024f - i5);
                    this.f9024f = -1;
                    m9303a();
                    i = this.f9023e;
                    while (true) {
                        if (i != this.f9024f) {
                            bArr = this.f9022d;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f9023e;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f9023e = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() {
        synchronized (this.f9020b) {
            if (this.f9022d != null) {
                this.f9022d = null;
                this.f9020b.close();
            }
        }
    }

    public C4041o5(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C4187s6.f9298a)) {
            this.f9020b = inputStream;
            this.f9021c = charset;
            this.f9022d = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    private void m9303a() {
        InputStream inputStream = this.f9020b;
        byte[] bArr = this.f9022d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f9023e = 0;
            this.f9024f = read;
            return;
        }
        throw new EOFException();
    }
}
