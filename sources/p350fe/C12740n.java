package p350fe;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import kotlin.jvm.internal.C19383o;

/* renamed from: fe.n */
public final class C12740n {

    /* renamed from: a */
    public final DeepLinkEntity f28145a;

    /* renamed from: b */
    public final String f28146b;

    public C12740n(DeepLinkEntity deepLinkEntity, String str) {
        C19383o.m32797g(deepLinkEntity, "deepLinkEntity");
        this.f28145a = deepLinkEntity;
        this.f28146b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12740n)) {
            return false;
        }
        C12740n nVar = (C12740n) obj;
        return this.f28145a == nVar.f28145a && C19383o.m32792b(this.f28146b, nVar.f28146b);
    }

    public final int hashCode() {
        int hashCode = this.f28145a.hashCode() * 31;
        String str = this.f28146b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("RouteInfo(deepLinkEntity=");
        h.append(this.f28145a);
        h.append(", id=");
        return C0391c.m1057c(h, this.f28146b, ')');
    }
}
