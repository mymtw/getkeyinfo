package p691un;

import p699vn.C18666a;

/* renamed from: un.d */
public final class C18629d extends C18631f {

    /* renamed from: c */
    public final short f41135c;

    /* renamed from: d */
    public final short f41136d;

    public C18629d(C18631f fVar, int i, int i2) {
        super(fVar);
        this.f41135c = (short) i;
        this.f41136d = (short) i2;
    }

    /* renamed from: a */
    public final void mo70135a(C18666a aVar, byte[] bArr) {
        aVar.mo70167b(this.f41135c, this.f41136d);
    }

    public final String toString() {
        short s = this.f41135c;
        short s2 = this.f41136d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.f41136d)).substring(1) + '>';
    }
}
