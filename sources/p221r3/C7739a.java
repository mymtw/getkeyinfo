package p221r3;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;

/* renamed from: r3.a */
public final class C7739a {

    /* renamed from: a */
    public final int f17164a;

    public C7739a(int i) {
        this.f17164a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C7739a) && this.f17164a == ((C7739a) obj).f17164a;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17164a);
    }

    public final String toString() {
        return C0071c.m191c(C0072d.m201h("ColorValue(colorValue="), this.f17164a, ")");
    }
}
