package p244t5;

import android.support.p013v4.media.C0072d;
import java.io.EOFException;
import java.io.InputStream;
import p610kp.C18161c;

/* renamed from: t5.w0 */
public final class C8029w0 extends C7968c1 {

    /* renamed from: f */
    public static final byte[] f17512f = new byte[0];

    /* renamed from: d */
    public final int f17513d;

    /* renamed from: e */
    public int f17514e;

    public C8029w0(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i >= 0) {
            this.f17513d = i;
            this.f17514e = i;
            if (i == 0) {
                mo20532b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* renamed from: a */
    public final int mo20531a() {
        return this.f17514e;
    }

    /* renamed from: d */
    public final byte[] mo20583d() {
        int i = this.f17514e;
        if (i == 0) {
            return f17512f;
        }
        byte[] bArr = new byte[i];
        int c = i - C18161c.m30659c(this.f17449b, bArr);
        this.f17514e = c;
        if (c == 0) {
            mo20532b();
            return bArr;
        }
        StringBuilder h = C0072d.m201h("DEF length ");
        h.append(this.f17513d);
        h.append(" object truncated by ");
        h.append(this.f17514e);
        throw new EOFException(h.toString());
    }

    public final int read() {
        if (this.f17514e == 0) {
            return -1;
        }
        int read = this.f17449b.read();
        if (read >= 0) {
            int i = this.f17514e - 1;
            this.f17514e = i;
            if (i == 0) {
                mo20532b();
            }
            return read;
        }
        StringBuilder h = C0072d.m201h("DEF length ");
        h.append(this.f17513d);
        h.append(" object truncated by ");
        h.append(this.f17514e);
        throw new EOFException(h.toString());
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f17514e;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f17449b.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f17514e - read;
            this.f17514e = i4;
            if (i4 == 0) {
                mo20532b();
            }
            return read;
        }
        StringBuilder h = C0072d.m201h("DEF length ");
        h.append(this.f17513d);
        h.append(" object truncated by ");
        h.append(this.f17514e);
        throw new EOFException(h.toString());
    }
}
