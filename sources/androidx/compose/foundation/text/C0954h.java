package androidx.compose.foundation.text;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.input.C1989i;
import androidx.compose.p015ui.text.input.C1993m;
import p772tq.C20203a;

/* renamed from: androidx.compose.foundation.text.h */
public final class C0954h {

    /* renamed from: e */
    public static final C0954h f1985e = new C0954h(0, 1, 1, true);

    /* renamed from: a */
    public final int f1986a;

    /* renamed from: b */
    public final boolean f1987b;

    /* renamed from: c */
    public final int f1988c;

    /* renamed from: d */
    public final int f1989d;

    public C0954h(int i, int i2, int i3, boolean z) {
        this.f1986a = i;
        this.f1987b = z;
        this.f1988c = i2;
        this.f1989d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0954h)) {
            return false;
        }
        C0954h hVar = (C0954h) obj;
        if (!(this.f1986a == hVar.f1986a) || this.f1987b != hVar.f1987b) {
            return false;
        }
        if (!(this.f1988c == hVar.f1988c)) {
            return false;
        }
        return this.f1989d == hVar.f1989d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f1987b);
        return Integer.hashCode(this.f1989d) + C0069a.m170a(this.f1988c, (hashCode + (Integer.hashCode(this.f1986a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("KeyboardOptions(capitalization=");
        h.append(C20203a.m34523F(this.f1986a));
        h.append(", autoCorrect=");
        h.append(this.f1987b);
        h.append(", keyboardType=");
        h.append(C1993m.m4366a0(this.f1988c));
        h.append(", imeAction=");
        h.append(C1989i.m4331a(this.f1989d));
        h.append(')');
        return h.toString();
    }
}
