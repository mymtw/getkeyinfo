package p409o9;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: o9.n */
public final class C13135n {

    /* renamed from: a */
    public final String f28885a;

    /* renamed from: b */
    public final String f28886b;

    public C13135n(String str, String str2) {
        C19383o.m32797g(str, "apiKey");
        C19383o.m32797g(str2, "apiSecret");
        this.f28885a = str;
        this.f28886b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13135n)) {
            return false;
        }
        C13135n nVar = (C13135n) obj;
        return C19383o.m32792b(this.f28885a, nVar.f28885a) && C19383o.m32792b(this.f28886b, nVar.f28886b);
    }

    public final int hashCode() {
        return this.f28886b.hashCode() + (this.f28885a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("EtsyConfigSecrets(apiKey=");
        h.append(this.f28885a);
        h.append(", apiSecret=");
        return C0391c.m1057c(h, this.f28886b, ')');
    }
}
