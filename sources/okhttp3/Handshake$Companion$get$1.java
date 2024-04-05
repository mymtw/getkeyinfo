package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class Handshake$Companion$get$1 extends Lambda implements C19846a<List<? extends Certificate>> {
    public final /* synthetic */ List $peerCertificatesCopy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Handshake$Companion$get$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
