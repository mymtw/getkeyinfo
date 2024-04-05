package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import okhttp3.C19927a;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import p753kq.C19846a;
import p754kr.C19871c;

final class RealConnection$connectTls$1 extends Lambda implements C19846a<List<? extends Certificate>> {
    public final /* synthetic */ C19927a $address;
    public final /* synthetic */ CertificatePinner $certificatePinner;
    public final /* synthetic */ Handshake $unverifiedHandshake;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, C19927a aVar) {
        super(0);
        this.$certificatePinner = certificatePinner;
        this.$unverifiedHandshake = handshake;
        this.$address = aVar;
    }

    public final List<Certificate> invoke() {
        C19871c cVar = this.$certificatePinner.f43938b;
        C19383o.m32794d(cVar);
        return cVar.mo71427a(this.$address.f43948a.f44243e, this.$unverifiedHandshake.mo72830a());
    }
}
