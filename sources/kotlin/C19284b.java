package kotlin;

import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p764pq.C20057i;

/* renamed from: kotlin.b */
public final class C19284b implements Comparable<C19284b> {

    /* renamed from: f */
    public static final C19284b f43149f = new C19284b();

    /* renamed from: b */
    public final int f43150b = 1;

    /* renamed from: c */
    public final int f43151c = 7;

    /* renamed from: d */
    public final int f43152d = 0;

    /* renamed from: e */
    public final int f43153e;

    public C19284b() {
        boolean z = true;
        if ((!new C20057i(0, 255).mo74327m(1) || !new C20057i(0, 255).mo74327m(7) || !new C20057i(0, 255).mo74327m(0)) ? false : z) {
            this.f43153e = 67328;
            return;
        }
        throw new IllegalArgumentException("Version components are out of range: 1.7.0".toString());
    }

    public final int compareTo(Object obj) {
        C19284b bVar = (C19284b) obj;
        C19383o.m32797g(bVar, "other");
        return this.f43153e - bVar.f43153e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C19284b bVar = obj instanceof C19284b ? (C19284b) obj : null;
        if (bVar == null) {
            return false;
        }
        return this.f43153e == bVar.f43153e;
    }

    public final int hashCode() {
        return this.f43153e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f43150b);
        sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        sb.append(this.f43151c);
        sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        sb.append(this.f43152d);
        return sb.toString();
    }
}
