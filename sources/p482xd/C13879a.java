package p482xd;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: xd.a */
public final class C13879a {

    /* renamed from: a */
    public final String f30538a;

    /* renamed from: b */
    public final String f30539b;

    public C13879a(String str, String str2) {
        this.f30538a = str;
        this.f30539b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13879a)) {
            return false;
        }
        C13879a aVar = (C13879a) obj;
        return C19383o.m32792b(this.f30538a, aVar.f30538a) && C19383o.m32792b(this.f30539b, aVar.f30539b);
    }

    public final int hashCode() {
        int hashCode = this.f30538a.hashCode() * 31;
        String str = this.f30539b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShareInfo(listingUrl=");
        h.append(this.f30538a);
        h.append(", imageUrl=");
        return C0391c.m1057c(h, this.f30539b, ')');
    }
}
