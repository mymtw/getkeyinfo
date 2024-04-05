package p694vi;

import android.text.Layout;

/* renamed from: vi.f */
public final class C18652f {

    /* renamed from: a */
    public String f41239a;

    /* renamed from: b */
    public int f41240b;

    /* renamed from: c */
    public boolean f41241c;

    /* renamed from: d */
    public int f41242d;

    /* renamed from: e */
    public boolean f41243e;

    /* renamed from: f */
    public int f41244f = -1;

    /* renamed from: g */
    public int f41245g = -1;

    /* renamed from: h */
    public int f41246h = -1;

    /* renamed from: i */
    public int f41247i = -1;

    /* renamed from: j */
    public int f41248j = -1;

    /* renamed from: k */
    public float f41249k;

    /* renamed from: l */
    public String f41250l;

    /* renamed from: m */
    public int f41251m = -1;

    /* renamed from: n */
    public int f41252n = -1;

    /* renamed from: o */
    public Layout.Alignment f41253o;

    /* renamed from: p */
    public Layout.Alignment f41254p;

    /* renamed from: q */
    public int f41255q = -1;

    /* renamed from: r */
    public C18645b f41256r;

    /* renamed from: s */
    public float f41257s = Float.MAX_VALUE;

    /* renamed from: a */
    public final void mo70161a(C18652f fVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f41241c && fVar.f41241c) {
                this.f41240b = fVar.f41240b;
                this.f41241c = true;
            }
            if (this.f41246h == -1) {
                this.f41246h = fVar.f41246h;
            }
            if (this.f41247i == -1) {
                this.f41247i = fVar.f41247i;
            }
            if (this.f41239a == null && (str = fVar.f41239a) != null) {
                this.f41239a = str;
            }
            if (this.f41244f == -1) {
                this.f41244f = fVar.f41244f;
            }
            if (this.f41245g == -1) {
                this.f41245g = fVar.f41245g;
            }
            if (this.f41252n == -1) {
                this.f41252n = fVar.f41252n;
            }
            if (this.f41253o == null && (alignment2 = fVar.f41253o) != null) {
                this.f41253o = alignment2;
            }
            if (this.f41254p == null && (alignment = fVar.f41254p) != null) {
                this.f41254p = alignment;
            }
            if (this.f41255q == -1) {
                this.f41255q = fVar.f41255q;
            }
            if (this.f41248j == -1) {
                this.f41248j = fVar.f41248j;
                this.f41249k = fVar.f41249k;
            }
            if (this.f41256r == null) {
                this.f41256r = fVar.f41256r;
            }
            if (this.f41257s == Float.MAX_VALUE) {
                this.f41257s = fVar.f41257s;
            }
            if (!this.f41243e && fVar.f41243e) {
                this.f41242d = fVar.f41242d;
                this.f41243e = true;
            }
            if (this.f41251m == -1 && (i = fVar.f41251m) != -1) {
                this.f41251m = i;
            }
        }
    }
}
