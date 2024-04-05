package p505aj;

import java.io.IOException;
import java.io.InputStream;
import p513bj.C14075p;

/* renamed from: aj.h */
public final class C14001h extends InputStream {

    /* renamed from: b */
    public final C13999g f30769b;

    /* renamed from: c */
    public final C14002i f30770c;

    /* renamed from: d */
    public final byte[] f30771d;

    /* renamed from: e */
    public boolean f30772e = false;

    /* renamed from: f */
    public boolean f30773f = false;

    public C14001h(C13999g gVar, C14002i iVar) {
        this.f30769b = gVar;
        this.f30770c = iVar;
        this.f30771d = new byte[1];
    }

    /* renamed from: a */
    public final void mo46817a() throws IOException {
        if (!this.f30772e) {
            this.f30769b.mo46812b(this.f30770c);
            this.f30772e = true;
        }
    }

    public final void close() throws IOException {
        if (!this.f30773f) {
            this.f30769b.close();
            this.f30773f = true;
        }
    }

    public final int read() throws IOException {
        if (read(this.f30771d) == -1) {
            return -1;
        }
        return this.f30771d[0] & 255;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C14075p.m21694f(!this.f30773f);
        mo46817a();
        int read = this.f30769b.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
