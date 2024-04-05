package p747hr;

import android.support.p013v4.media.C0072d;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p747hr.C19084h;

/* renamed from: hr.g */
public final class C19082g extends C19084h {

    /* renamed from: e */
    public static final boolean f42590e;

    /* renamed from: f */
    public static final C19083a f42591f;

    /* renamed from: d */
    public final Provider f42592d = new OpenJSSE();

    /* renamed from: hr.g$a */
    public static final class C19083a {
    }

    static {
        C19083a aVar = new C19083a();
        f42591f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f42590e = z;
    }

    /* renamed from: d */
    public final void mo70557d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C19383o.m32797g(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                C19084h.f42595c.getClass();
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = C19084h.C19085a.m32358a(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.mo70557d(sSLSocket, str, list);
    }

    /* renamed from: f */
    public final String mo70558f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) || (applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol()) == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    /* renamed from: l */
    public final SSLContext mo70568l() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f42592d);
        C19383o.m32796f(instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    /* renamed from: n */
    public final X509TrustManager mo70569n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f42592d);
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        C19383o.m32794d(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder h = C0072d.m201h("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C19383o.m32796f(arrays, "java.util.Arrays.toString(this)");
        h.append(arrays);
        throw new IllegalStateException(h.toString().toString());
    }
}
