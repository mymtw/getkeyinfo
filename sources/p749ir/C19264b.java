package p749ir;

import android.net.http.X509TrustManagerExtensions;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C19383o;
import p754kr.C19871c;

/* renamed from: ir.b */
public final class C19264b extends C19871c {

    /* renamed from: a */
    public final X509TrustManager f43127a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f43128b;

    public C19264b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f43127a = x509TrustManager;
        this.f43128b = x509TrustManagerExtensions;
    }

    /* renamed from: a */
    public final List mo71427a(String str, List list) throws SSLPeerUnverifiedException {
        C19383o.m32797g(list, "chain");
        C19383o.m32797g(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f43128b.checkServerTrusted((X509Certificate[]) array, BaseSecureKeyWrapper.RSA_ALGORITHM, str);
                C19383o.m32796f(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19264b) && ((C19264b) obj).f43127a == this.f43127a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f43127a);
    }
}
