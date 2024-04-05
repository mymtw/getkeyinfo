package androidx.compose.foundation.layout;

import androidx.appcompat.widget.C0326j;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;

/* renamed from: androidx.compose.foundation.layout.d0 */
public final class C0730d0 implements C0736g0 {

    /* renamed from: a */
    public final C0736g0 f1492a;

    /* renamed from: b */
    public final C0736g0 f1493b;

    public C0730d0(C0736g0 g0Var, C0736g0 g0Var2) {
        C19383o.m32797g(g0Var2, "second");
        this.f1492a = g0Var;
        this.f1493b = g0Var2;
    }

    /* renamed from: a */
    public final int mo4082a(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        return Math.max(this.f1492a.mo4082a(bVar), this.f1493b.mo4082a(bVar));
    }

    /* renamed from: b */
    public final int mo4083b(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        return Math.max(this.f1492a.mo4083b(bVar), this.f1493b.mo4083b(bVar));
    }

    /* renamed from: c */
    public final int mo4084c(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return Math.max(this.f1492a.mo4084c(bVar, layoutDirection), this.f1493b.mo4084c(bVar, layoutDirection));
    }

    /* renamed from: d */
    public final int mo4085d(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return Math.max(this.f1492a.mo4085d(bVar, layoutDirection), this.f1493b.mo4085d(bVar, layoutDirection));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0730d0)) {
            return false;
        }
        C0730d0 d0Var = (C0730d0) obj;
        return C19383o.m32792b(d0Var.f1492a, this.f1492a) && C19383o.m32792b(d0Var.f1493b, this.f1493b);
    }

    public final int hashCode() {
        return (this.f1493b.hashCode() * 31) + this.f1492a.hashCode();
    }

    public final String toString() {
        StringBuilder k = C0326j.m866k('(');
        k.append(this.f1492a);
        k.append(" ∪ ");
        k.append(this.f1493b);
        k.append(')');
        return k.toString();
    }
}
