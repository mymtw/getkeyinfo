package p002a1;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: a1.d */
public final class C0010d {

    /* renamed from: a */
    public C0011e f22a;

    static {
        new LocaleList(new Locale[0]);
    }

    public C0010d(C0012f fVar) {
        this.f22a = fVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0010d) && this.f22a.equals(((C0010d) obj).f22a);
    }

    public final int hashCode() {
        return this.f22a.hashCode();
    }

    public final String toString() {
        return this.f22a.toString();
    }
}
