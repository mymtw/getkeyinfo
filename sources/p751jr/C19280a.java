package p751jr;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p568fn.C17782b;

/* renamed from: jr.a */
public final class C19280a extends ProxySelector {

    /* renamed from: a */
    public static final C19280a f43147a = new C19280a();

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return C17782b.m29864d0(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
