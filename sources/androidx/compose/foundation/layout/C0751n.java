package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;

/* renamed from: androidx.compose.foundation.layout.n */
public final class C0751n implements C0736g0 {

    /* renamed from: a */
    public final int f1537a = 0;

    /* renamed from: b */
    public final int f1538b = 0;

    /* renamed from: c */
    public final int f1539c = 0;

    /* renamed from: d */
    public final int f1540d = 0;

    /* renamed from: a */
    public final int mo4082a(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        return this.f1538b;
    }

    /* renamed from: b */
    public final int mo4083b(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        return this.f1540d;
    }

    /* renamed from: c */
    public final int mo4084c(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return this.f1537a;
    }

    /* renamed from: d */
    public final int mo4085d(C7282b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return this.f1539c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0751n)) {
            return false;
        }
        C0751n nVar = (C0751n) obj;
        return this.f1537a == nVar.f1537a && this.f1538b == nVar.f1538b && this.f1539c == nVar.f1539c && this.f1540d == nVar.f1540d;
    }

    public final int hashCode() {
        return (((((this.f1537a * 31) + this.f1538b) * 31) + this.f1539c) * 31) + this.f1540d;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Insets(left=");
        h.append(this.f1537a);
        h.append(", top=");
        h.append(this.f1538b);
        h.append(", right=");
        h.append(this.f1539c);
        h.append(", bottom=");
        return C0073e.m208h(h, this.f1540d, ')');
    }
}
