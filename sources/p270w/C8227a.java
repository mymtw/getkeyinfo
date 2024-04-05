package p270w;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: w.a */
public final class C8227a {

    /* renamed from: a */
    public int f18059a;

    public C8227a() {
        this(0);
    }

    public C8227a(int i) {
        this.f18059a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8227a) && this.f18059a == ((C8227a) obj).f18059a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18059a);
    }

    public final String toString() {
        return C0073e.m208h(C0072d.m201h("DeltaCounter(count="), this.f18059a, ')');
    }
}
