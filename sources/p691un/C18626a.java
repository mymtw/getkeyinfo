package p691un;

import p699vn.C18666a;

/* renamed from: un.a */
public final class C18626a extends C18631f {

    /* renamed from: c */
    public final short f41128c;

    /* renamed from: d */
    public final short f41129d;

    public C18626a(C18631f fVar, int i, int i2) {
        super(fVar);
        this.f41128c = (short) i;
        this.f41129d = (short) i2;
    }

    /* renamed from: a */
    public final void mo70135a(C18666a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f41129d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    aVar.mo70167b(31, 5);
                    short s2 = this.f41129d;
                    if (s2 > 62) {
                        aVar.mo70167b(s2 - 31, 16);
                    } else if (i == 0) {
                        aVar.mo70167b(Math.min(s2, 31), 5);
                    } else {
                        aVar.mo70167b(s2 - 31, 5);
                    }
                }
                aVar.mo70167b(bArr[this.f41128c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f41128c);
        sb.append("::");
        sb.append((this.f41128c + this.f41129d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
