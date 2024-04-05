package p674sm;

import android.support.p013v4.media.C0072d;
import java.util.Collections;
import java.util.Map;

/* renamed from: sm.c */
public final class C18536c {

    /* renamed from: a */
    public final String f40805a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f40806b;

    public C18536c(String str, Map<Class<?>, Object> map) {
        this.f40805a = str;
        this.f40806b = map;
    }

    /* renamed from: a */
    public static C18536c m31275a(String str) {
        return new C18536c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18536c)) {
            return false;
        }
        C18536c cVar = (C18536c) obj;
        return this.f40805a.equals(cVar.f40805a) && this.f40806b.equals(cVar.f40806b);
    }

    public final int hashCode() {
        return this.f40806b.hashCode() + (this.f40805a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FieldDescriptor{name=");
        h.append(this.f40805a);
        h.append(", properties=");
        h.append(this.f40806b.values());
        h.append("}");
        return h.toString();
    }
}
