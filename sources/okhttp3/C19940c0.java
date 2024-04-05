package okhttp3;

import android.support.p013v4.media.C0072d;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.C19383o;

/* renamed from: okhttp3.c0 */
public final class C19940c0 {

    /* renamed from: a */
    public final C19927a f43995a;

    /* renamed from: b */
    public final Proxy f43996b;

    /* renamed from: c */
    public final InetSocketAddress f43997c;

    public C19940c0(C19927a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C19383o.m32797g(aVar, "address");
        C19383o.m32797g(inetSocketAddress, "socketAddress");
        this.f43995a = aVar;
        this.f43996b = proxy;
        this.f43997c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19940c0) {
            C19940c0 c0Var = (C19940c0) obj;
            return C19383o.m32792b(c0Var.f43995a, this.f43995a) && C19383o.m32792b(c0Var.f43996b, this.f43996b) && C19383o.m32792b(c0Var.f43997c, this.f43997c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f43996b.hashCode();
        return this.f43997c.hashCode() + ((hashCode + ((this.f43995a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Route{");
        h.append(this.f43997c);
        h.append('}');
        return h.toString();
    }
}
