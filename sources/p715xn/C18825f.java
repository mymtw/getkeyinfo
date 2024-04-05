package p715xn;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import p683tn.C18561a;

/* renamed from: xn.f */
public class C18825f {

    /* renamed from: i */
    public static C18825f[] f41686i = {new C18825f(false, 3, 5, 8, 8, 1), new C18825f(false, 5, 7, 10, 10, 1), new C18825f(true, 5, 7, 16, 6, 1), new C18825f(false, 8, 10, 12, 12, 1), new C18825f(true, 10, 11, 14, 6, 2), new C18825f(false, 12, 12, 14, 14, 1), new C18825f(true, 16, 14, 24, 10, 1), new C18825f(false, 18, 14, 16, 16, 1), new C18825f(false, 22, 18, 18, 18, 1), new C18825f(true, 22, 18, 16, 10, 2), new C18825f(false, 30, 20, 20, 20, 1), new C18825f(true, 32, 24, 16, 14, 2), new C18825f(false, 36, 24, 22, 22, 1), new C18825f(false, 44, 28, 24, 24, 1), new C18825f(true, 49, 28, 22, 14, 2), new C18825f(false, 62, 36, 14, 14, 4), new C18825f(false, 86, 42, 16, 16, 4), new C18825f(false, 114, 48, 18, 18, 4), new C18825f(false, 144, 56, 20, 20, 4), new C18825f(false, 174, 68, 22, 22, 4), new C18825f(false, 204, 84, 24, 24, 4, 102, 42), new C18825f(false, 280, 112, 14, 14, 16, 140, 56), new C18825f(false, 368, 144, 16, 16, 16, 92, 36), new C18825f(false, 456, 192, 18, 18, 16, 114, 48), new C18825f(false, 576, 224, 20, 20, 16, 144, 56), new C18825f(false, 696, 272, 22, 22, 16, 174, 68), new C18825f(false, 816, 336, 24, 24, 16, 136, 56), new C18825f(false, 1050, 408, 18, 18, 36, 175, 68), new C18825f(false, 1304, 496, 20, 20, 36, 163, 62), new C18820a()};

    /* renamed from: a */
    public final boolean f41687a;

    /* renamed from: b */
    public final int f41688b;

    /* renamed from: c */
    public final int f41689c;

    /* renamed from: d */
    public final int f41690d;

    /* renamed from: e */
    public final int f41691e;

    /* renamed from: f */
    public final int f41692f;

    /* renamed from: g */
    public final int f41693g;

    /* renamed from: h */
    public final int f41694h;

    public C18825f(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: f */
    public static C18825f m31810f(int i, SymbolShapeHint symbolShapeHint, C18561a aVar, C18561a aVar2) {
        C18825f[] fVarArr = f41686i;
        for (int i2 = 0; i2 < 30; i2++) {
            C18825f fVar = fVarArr[i2];
            if ((symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !fVar.f41687a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || fVar.f41687a) && ((aVar == null || (fVar.mo70274d() >= 0 && (fVar.mo70275e() * fVar.f41691e) + (fVar.mo70275e() << 1) >= 0)) && ((aVar2 == null || (fVar.mo70274d() <= 0 && (fVar.mo70275e() * fVar.f41691e) + (fVar.mo70275e() << 1) <= 0)) && i <= fVar.f41688b)))) {
                return fVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public int mo70264a(int i) {
        return this.f41693g;
    }

    /* renamed from: b */
    public final int mo70273b() {
        int i = this.f41692f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: c */
    public int mo70265c() {
        return this.f41688b / this.f41693g;
    }

    /* renamed from: d */
    public final int mo70274d() {
        return (mo70273b() * this.f41690d) + (mo70273b() << 1);
    }

    /* renamed from: e */
    public final int mo70275e() {
        int i = this.f41692f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41687a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f41690d);
        sb.append('x');
        sb.append(this.f41691e);
        sb.append(", symbol size ");
        sb.append(mo70274d());
        sb.append('x');
        sb.append((mo70275e() * this.f41691e) + (mo70275e() << 1));
        sb.append(", symbol data size ");
        sb.append(mo70273b() * this.f41690d);
        sb.append('x');
        sb.append(mo70275e() * this.f41691e);
        sb.append(", codewords ");
        sb.append(this.f41688b);
        sb.append('+');
        sb.append(this.f41689c);
        return sb.toString();
    }

    public C18825f(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f41687a = z;
        this.f41688b = i;
        this.f41689c = i2;
        this.f41690d = i3;
        this.f41691e = i4;
        this.f41692f = i5;
        this.f41693g = i6;
        this.f41694h = i7;
    }
}
