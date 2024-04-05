package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.m */
public final class C2011m {

    /* renamed from: a */
    public final C2010l f4534a;

    /* renamed from: b */
    public final C2009k f4535b;

    public C2011m(C2010l lVar, C2009k kVar) {
        this.f4534a = lVar;
        this.f4535b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011m)) {
            return false;
        }
        C2011m mVar = (C2011m) obj;
        return C19383o.m32792b(this.f4535b, mVar.f4535b) && C19383o.m32792b(this.f4534a, mVar.f4534a);
    }

    public final int hashCode() {
        C2010l lVar = this.f4534a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        C2009k kVar = this.f4535b;
        if (kVar != null) {
            i = kVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PlatformTextStyle(spanStyle=");
        h.append(this.f4534a);
        h.append(", paragraphSyle=");
        h.append(this.f4535b);
        h.append(')');
        return h.toString();
    }

    public C2011m() {
        this((C2010l) null, new C2009k(false));
    }
}
