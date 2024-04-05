package androidx.compose.p015ui.semantics;

import androidx.activity.C0114h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: androidx.compose.ui.semantics.j */
public final class C1903j implements C1910q, Iterable<Map.Entry<? extends C1909p<?>, ? extends Object>>, C19875a {

    /* renamed from: b */
    public final LinkedHashMap f4246b = new LinkedHashMap();

    /* renamed from: c */
    public boolean f4247c;

    /* renamed from: d */
    public boolean f4248d;

    /* renamed from: a */
    public final <T> void mo7342a(C1909p<T> pVar, T t) {
        C19383o.m32797g(pVar, "key");
        this.f4246b.put(pVar, t);
    }

    /* renamed from: c */
    public final <T> boolean mo7343c(C1909p<T> pVar) {
        C19383o.m32797g(pVar, "key");
        return this.f4246b.containsKey(pVar);
    }

    /* renamed from: e */
    public final <T> T mo7344e(C1909p<T> pVar) {
        C19383o.m32797g(pVar, "key");
        T t = this.f4246b.get(pVar);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + pVar + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1903j)) {
            return false;
        }
        C1903j jVar = (C1903j) obj;
        return C19383o.m32792b(this.f4246b, jVar.f4246b) && this.f4247c == jVar.f4247c && this.f4248d == jVar.f4248d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f4247c);
        return Boolean.hashCode(this.f4248d) + ((hashCode + (this.f4246b.hashCode() * 31)) * 31);
    }

    public final Iterator<Map.Entry<C1909p<?>, Object>> iterator() {
        return this.f4246b.entrySet().iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f4247c) {
            sb.append(str);
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f4248d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f4246b.entrySet()) {
            Object value = entry.getValue();
            sb.append(str);
            sb.append(((C1909p) entry.getKey()).f4268a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return C0114h.m328x0(this) + "{ " + sb + " }";
    }
}
