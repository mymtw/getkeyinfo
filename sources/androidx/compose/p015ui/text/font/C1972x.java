package androidx.compose.p015ui.text.font;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.font.x */
public final class C1972x {

    /* renamed from: a */
    public final C1952g f4429a;

    /* renamed from: b */
    public final C1959m f4430b;

    /* renamed from: c */
    public final int f4431c;

    /* renamed from: d */
    public final int f4432d;

    /* renamed from: e */
    public final Object f4433e;

    public C1972x(C1952g gVar, C1959m mVar, int i, int i2, Object obj) {
        this.f4429a = gVar;
        this.f4430b = mVar;
        this.f4431c = i;
        this.f4432d = i2;
        this.f4433e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1972x)) {
            return false;
        }
        C1972x xVar = (C1972x) obj;
        if (!C19383o.m32792b(this.f4429a, xVar.f4429a) || !C19383o.m32792b(this.f4430b, xVar.f4430b)) {
            return false;
        }
        if (!(this.f4431c == xVar.f4431c)) {
            return false;
        }
        return (this.f4432d == xVar.f4432d) && C19383o.m32792b(this.f4433e, xVar.f4433e);
    }

    public final int hashCode() {
        C1952g gVar = this.f4429a;
        int i = 0;
        int a = C0069a.m170a(this.f4432d, C0069a.m170a(this.f4431c, (((gVar == null ? 0 : gVar.hashCode()) * 31) + this.f4430b.f4417b) * 31, 31), 31);
        Object obj = this.f4433e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TypefaceRequest(fontFamily=");
        h.append(this.f4429a);
        h.append(", fontWeight=");
        h.append(this.f4430b);
        h.append(", fontStyle=");
        h.append(C1957k.m4284a(this.f4431c));
        h.append(", fontSynthesis=");
        h.append(C1958l.m4285a(this.f4432d));
        h.append(", resourceLoaderCacheKey=");
        return C0073e.m209i(h, this.f4433e, ')');
    }
}
