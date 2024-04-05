package p464va;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.core.HttpMethod;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: va.a */
public final class C13546a {

    /* renamed from: a */
    public final String f29624a;

    /* renamed from: b */
    public final Map<String, String> f29625b;

    /* renamed from: c */
    public final HttpMethod f29626c;

    public C13546a(String str, Map<String, String> map, HttpMethod httpMethod) {
        C19383o.m32797g(str, ResponseConstants.PATH);
        C19383o.m32797g(httpMethod, ResponseConstants.METHOD);
        this.f29624a = str;
        this.f29625b = map;
        this.f29626c = httpMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13546a)) {
            return false;
        }
        C13546a aVar = (C13546a) obj;
        return C19383o.m32792b(this.f29624a, aVar.f29624a) && C19383o.m32792b(this.f29625b, aVar.f29625b) && this.f29626c == aVar.f29626c;
    }

    public final int hashCode() {
        int hashCode = this.f29625b.hashCode();
        return this.f29626c.hashCode() + ((hashCode + (this.f29624a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GetPageSpec(path=");
        h.append(this.f29624a);
        h.append(", params=");
        h.append(this.f29625b);
        h.append(", method=");
        h.append(this.f29626c);
        h.append(')');
        return h.toString();
    }
}
