package p497zb;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: zb.b */
public final class C13945b {

    /* renamed from: a */
    public final String f30664a;

    /* renamed from: b */
    public final String f30665b;

    /* renamed from: c */
    public final boolean f30666c;

    public C13945b(String str, String str2, boolean z) {
        this.f30664a = str;
        this.f30665b = str2;
        this.f30666c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13945b)) {
            return false;
        }
        C13945b bVar = (C13945b) obj;
        return C19383o.m32792b(this.f30664a, bVar.f30664a) && C19383o.m32792b(this.f30665b, bVar.f30665b) && this.f30666c == bVar.f30666c;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f30665b, this.f30664a.hashCode() * 31, 31);
        boolean z = this.f30666c;
        if (z) {
            z = true;
        }
        return e + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SaveForLaterItem(listingTitle=");
        h.append(this.f30664a);
        h.append(", shopName=");
        h.append(this.f30665b);
        h.append(", isShippable=");
        return C0391c.m1058d(h, this.f30666c, ')');
    }
}
