package p513bj;

/* renamed from: bj.i */
public final class C14058i {

    /* renamed from: a */
    public int f30934a = 0;

    /* renamed from: b */
    public int f30935b = -1;

    /* renamed from: c */
    public int f30936c = 0;

    /* renamed from: d */
    public int[] f30937d;

    /* renamed from: e */
    public int f30938e;

    public C14058i() {
        int[] iArr = new int[16];
        this.f30937d = iArr;
        this.f30938e = iArr.length - 1;
    }

    /* renamed from: a */
    public final void mo46880a(int i) {
        int i2 = this.f30936c;
        int[] iArr = this.f30937d;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i3 = this.f30934a;
                int i4 = length2 - i3;
                System.arraycopy(iArr, i3, iArr2, 0, i4);
                System.arraycopy(this.f30937d, 0, iArr2, i4, i3);
                this.f30934a = 0;
                this.f30935b = this.f30936c - 1;
                this.f30937d = iArr2;
                this.f30938e = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = (this.f30935b + 1) & this.f30938e;
        this.f30935b = i5;
        this.f30937d[i5] = i;
        this.f30936c++;
    }
}
