package p289y0;

import android.graphics.Insets;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: y0.d */
public final class C8352d {

    /* renamed from: e */
    public static final C8352d f18319e = new C8352d(0, 0, 0, 0);

    /* renamed from: a */
    public final int f18320a;

    /* renamed from: b */
    public final int f18321b;

    /* renamed from: c */
    public final int f18322c;

    /* renamed from: d */
    public final int f18323d;

    public C8352d(int i, int i2, int i3, int i4) {
        this.f18320a = i;
        this.f18321b = i2;
        this.f18322c = i3;
        this.f18323d = i4;
    }

    /* renamed from: a */
    public static C8352d m16667a(C8352d dVar, C8352d dVar2) {
        return m16668b(Math.max(dVar.f18320a, dVar2.f18320a), Math.max(dVar.f18321b, dVar2.f18321b), Math.max(dVar.f18322c, dVar2.f18322c), Math.max(dVar.f18323d, dVar2.f18323d));
    }

    /* renamed from: b */
    public static C8352d m16668b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f18319e : new C8352d(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C8352d m16669c(Insets insets) {
        return m16668b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: d */
    public final Insets mo20940d() {
        return Insets.m169of(this.f18320a, this.f18321b, this.f18322c, this.f18323d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8352d.class != obj.getClass()) {
            return false;
        }
        C8352d dVar = (C8352d) obj;
        return this.f18323d == dVar.f18323d && this.f18320a == dVar.f18320a && this.f18322c == dVar.f18322c && this.f18321b == dVar.f18321b;
    }

    public final int hashCode() {
        return (((((this.f18320a * 31) + this.f18321b) * 31) + this.f18322c) * 31) + this.f18323d;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Insets{left=");
        h.append(this.f18320a);
        h.append(", top=");
        h.append(this.f18321b);
        h.append(", right=");
        h.append(this.f18322c);
        h.append(", bottom=");
        return C0073e.m208h(h, this.f18323d, '}');
    }
}
