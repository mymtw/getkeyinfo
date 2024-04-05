package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import p772tq.C20203a;

/* renamed from: androidx.compose.ui.text.input.j */
public final class C1990j {

    /* renamed from: f */
    public static final C1990j f4480f = new C1990j(false, 0, true, 1, 1);

    /* renamed from: a */
    public final boolean f4481a;

    /* renamed from: b */
    public final int f4482b;

    /* renamed from: c */
    public final boolean f4483c;

    /* renamed from: d */
    public final int f4484d;

    /* renamed from: e */
    public final int f4485e;

    public C1990j(boolean z, int i, boolean z2, int i2, int i3) {
        this.f4481a = z;
        this.f4482b = i;
        this.f4483c = z2;
        this.f4484d = i2;
        this.f4485e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1990j)) {
            return false;
        }
        C1990j jVar = (C1990j) obj;
        if (this.f4481a != jVar.f4481a) {
            return false;
        }
        if (!(this.f4482b == jVar.f4482b) || this.f4483c != jVar.f4483c) {
            return false;
        }
        if (!(this.f4484d == jVar.f4484d)) {
            return false;
        }
        return this.f4485e == jVar.f4485e;
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f4482b, Boolean.hashCode(this.f4481a) * 31, 31);
        return Integer.hashCode(this.f4485e) + C0069a.m170a(this.f4484d, (Boolean.hashCode(this.f4483c) + a) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ImeOptions(singleLine=");
        h.append(this.f4481a);
        h.append(", capitalization=");
        h.append(C20203a.m34523F(this.f4482b));
        h.append(", autoCorrect=");
        h.append(this.f4483c);
        h.append(", keyboardType=");
        h.append(C1993m.m4366a0(this.f4484d));
        h.append(", imeAction=");
        h.append(C1989i.m4331a(this.f4485e));
        h.append(')');
        return h.toString();
    }
}
