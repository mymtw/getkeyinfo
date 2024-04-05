package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import okhttp3.Handshake;
import p753kq.C19846a;

final class RealConnection$connectTls$2 extends Lambda implements C19846a<List<? extends X509Certificate>> {
    public final /* synthetic */ C19976g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(C19976g gVar) {
        super(0);
        this.this$0 = gVar;
    }

    public final List<X509Certificate> invoke() {
        Handshake handshake = this.this$0.f44179d;
        C19383o.m32794d(handshake);
        List<Certificate> a = handshake.mo72830a();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(a));
        for (Certificate certificate : a) {
            if (certificate != null) {
                arrayList.add((X509Certificate) certificate);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        return arrayList;
    }
}
