package p002a1;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: a1.f */
public final class C0012f implements C0011e {

    /* renamed from: a */
    public final LocaleList f23a;

    public C0012f(LocaleList localeList) {
        this.f23a = localeList;
    }

    /* renamed from: a */
    public final Object mo28a() {
        return this.f23a;
    }

    public final boolean equals(Object obj) {
        return this.f23a.equals(((C0011e) obj).mo28a());
    }

    public final Locale get() {
        return this.f23a.get(0);
    }

    public final int hashCode() {
        return this.f23a.hashCode();
    }

    public final String toString() {
        return this.f23a.toString();
    }
}
