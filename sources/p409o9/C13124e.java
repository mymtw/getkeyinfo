package p409o9;

import android.support.p013v4.media.C0072d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: o9.e */
public final class C13124e {

    /* renamed from: a */
    public final Map<String, String> f28855a;

    public C13124e(LinkedHashMap linkedHashMap) {
        C19383o.m32797g(linkedHashMap, "map");
        this.f28855a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13124e) && C19383o.m32792b(this.f28855a, ((C13124e) obj).f28855a);
    }

    public final int hashCode() {
        return this.f28855a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfigOverrideMap(map=");
        h.append(this.f28855a);
        h.append(')');
        return h.toString();
    }
}
