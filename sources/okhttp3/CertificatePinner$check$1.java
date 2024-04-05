package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p754kr.C19871c;

public final class CertificatePinner$check$1 extends Lambda implements C19846a<List<? extends X509Certificate>> {
    public final /* synthetic */ String $hostname;
    public final /* synthetic */ List $peerCertificates;
    public final /* synthetic */ CertificatePinner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    public final List<X509Certificate> invoke() {
        List<Certificate> list;
        C19871c cVar = this.this$0.f43938b;
        if (cVar == null || (list = cVar.mo71427a(this.$hostname, this.$peerCertificates)) == null) {
            list = this.$peerCertificates;
        }
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (Certificate certificate : list) {
            if (certificate != null) {
                arrayList.add((X509Certificate) certificate);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        return arrayList;
    }
}
