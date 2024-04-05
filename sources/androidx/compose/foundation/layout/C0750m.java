package androidx.compose.foundation.layout;

import androidx.appcompat.widget.C0326j;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;

/* renamed from: androidx.compose.foundation.layout.m */
public final class C0750m implements C0736g0 {

    /* renamed from: a */
    public final C0736g0 f1535a;

    /* renamed from: b */
    public final C0736g0 f1536b;

    public C0750m(C0736g0 g0Var, C0736g0 g0Var2) {
        this.f1535a = g0Var;
        this.f1536b = g0Var2;
    }

    /* renamed from: a */
    public final int mo4082a(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        int a = this.f1535a.mo4082a(bVar) - this.f1536b.mo4082a(bVar);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: b */
    public final int mo4083b(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        int b = this.f1535a.mo4083b(bVar) - this.f1536b.mo4083b(bVar);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    /* renamed from: c */
    public final int mo4084c(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        int c = this.f1535a.mo4084c(bVar, layoutDirection) - this.f1536b.mo4084c(bVar, layoutDirection);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    /* renamed from: d */
    public final int mo4085d(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        int d = this.f1535a.mo4085d(bVar, layoutDirection) - this.f1536b.mo4085d(bVar, layoutDirection);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0750m)) {
            return false;
        }
        C0750m mVar = (C0750m) obj;
        return C19383o.m32792b(mVar.f1535a, this.f1535a) && C19383o.m32792b(mVar.f1536b, this.f1536b);
    }

    public final int hashCode() {
        return this.f1536b.hashCode() + (this.f1535a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C0326j.m866k('(');
        k.append(this.f1535a);
        k.append(" - ");
        k.append(this.f1536b);
        k.append(')');
        return k.toString();
    }
}
