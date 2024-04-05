package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import okhttp3.C19997p;
import p568fn.C17782b;
import p735br.C18980c;
import p753kq.C19846a;

final class RouteSelector$resetNextProxy$1 extends Lambda implements C19846a<List<? extends Proxy>> {
    public final /* synthetic */ Proxy $proxy;
    public final /* synthetic */ C19997p $url;
    public final /* synthetic */ C19980k this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteSelector$resetNextProxy$1(C19980k kVar, Proxy proxy, C19997p pVar) {
        super(0);
        this.this$0 = kVar;
        this.$proxy = proxy;
        this.$url = pVar;
    }

    public final List<Proxy> invoke() {
        Proxy proxy = this.$proxy;
        if (proxy != null) {
            return C17782b.m29864d0(proxy);
        }
        URI g = this.$url.mo72971g();
        if (g.getHost() == null) {
            return C18980c.m32107k(Proxy.NO_PROXY);
        }
        List<Proxy> select = this.this$0.f44204e.f43958k.select(g);
        if (!(select == null || select.isEmpty())) {
            return C18980c.m32118v(select);
        }
        return C18980c.m32107k(Proxy.NO_PROXY);
    }
}
