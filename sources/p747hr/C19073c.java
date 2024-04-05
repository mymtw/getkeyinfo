package p747hr;

import android.support.p013v4.media.C0072d;
import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p747hr.C19084h;

/* renamed from: hr.c */
public final class C19073c extends C19084h {

    /* renamed from: e */
    public static final boolean f42573e;

    /* renamed from: f */
    public static final C19074a f42574f;

    /* renamed from: d */
    public final Provider f42575d = new BouncyCastleJsseProvider();

    /* renamed from: hr.c$a */
    public static final class C19074a {
    }

    static {
        C19074a aVar = new C19074a();
        f42574f = aVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f42573e = z;
    }

    /* renamed from: d */
    public final void mo70557d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C19383o.m32797g(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C19084h.f42595c.getClass();
            ArrayList a = C19084h.C19085a.m32358a(list);
            C19383o.m32796f(parameters, "sslParameters");
            Object[] array = a.toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.mo70557d(sSLSocket, str, list);
    }

    /* renamed from: f */
    public final String mo70558f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    /* renamed from: l */
    public final SSLContext mo70568l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f42575d);
        C19383o.m32796f(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: n */
    public final X509TrustManager mo70569n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
