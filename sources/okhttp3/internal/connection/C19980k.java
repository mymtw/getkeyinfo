package okhttp3.internal.connection;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19927a;
import okhttp3.C19940c0;
import okhttp3.C19944e;
import okhttp3.C19989m;
import okhttp3.C19997p;

/* renamed from: okhttp3.internal.connection.k */
public final class C19980k {

    /* renamed from: a */
    public List<? extends Proxy> f44200a;

    /* renamed from: b */
    public int f44201b;

    /* renamed from: c */
    public List<? extends InetSocketAddress> f44202c;

    /* renamed from: d */
    public final ArrayList f44203d = new ArrayList();

    /* renamed from: e */
    public final C19927a f44204e;

    /* renamed from: f */
    public final C19979j f44205f;

    /* renamed from: g */
    public final C19944e f44206g;

    /* renamed from: h */
    public final C19989m f44207h;

    /* renamed from: okhttp3.internal.connection.k$a */
    public static final class C19981a {

        /* renamed from: a */
        public int f44208a;

        /* renamed from: b */
        public final List<C19940c0> f44209b;

        public C19981a(ArrayList arrayList) {
            this.f44209b = arrayList;
        }

        /* renamed from: a */
        public final boolean mo72936a() {
            return this.f44208a < this.f44209b.size();
        }
    }

    public C19980k(C19927a aVar, C19979j jVar, C19971e eVar, C19989m mVar) {
        C19383o.m32797g(aVar, "address");
        C19383o.m32797g(jVar, "routeDatabase");
        C19383o.m32797g(eVar, "call");
        C19383o.m32797g(mVar, "eventListener");
        this.f44204e = aVar;
        this.f44205f = jVar;
        this.f44206g = eVar;
        this.f44207h = mVar;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f44200a = emptyList;
        this.f44202c = emptyList;
        C19997p pVar = aVar.f43948a;
        RouteSelector$resetNextProxy$1 routeSelector$resetNextProxy$1 = new RouteSelector$resetNextProxy$1(this, aVar.f43957j, pVar);
        C19383o.m32797g(pVar, "url");
        List<? extends Proxy> invoke = routeSelector$resetNextProxy$1.invoke();
        this.f44200a = invoke;
        this.f44201b = 0;
        C19383o.m32797g(invoke, "proxies");
    }

    /* renamed from: a */
    public final boolean mo72935a() {
        return (this.f44201b < this.f44200a.size()) || (this.f44203d.isEmpty() ^ true);
    }
}
