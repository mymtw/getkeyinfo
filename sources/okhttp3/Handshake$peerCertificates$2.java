package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class Handshake$peerCertificates$2 extends Lambda implements C19846a<List<? extends Certificate>> {
    public final /* synthetic */ C19846a $peerCertificatesFn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(C19846a aVar) {
        super(0);
        this.$peerCertificatesFn = aVar;
    }

    public final List<Certificate> invoke() {
        try {
            return (List) this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return EmptyList.INSTANCE;
        }
    }
}
