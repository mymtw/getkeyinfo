package p747hr;

import android.support.p013v4.media.C0072d;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p747hr.C19084h;

/* renamed from: hr.d */
public final class C19075d extends C19084h {

    /* renamed from: e */
    public static final boolean f42576e;

    /* renamed from: f */
    public static final C19076a f42577f = new C19076a(0);

    /* renamed from: d */
    public final Provider f42578d;

    /* renamed from: hr.d$a */
    public static final class C19076a {
        public C19076a() {
        }

        /* renamed from: a */
        public static boolean m32333a() {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
        }

        /* renamed from: b */
        public static boolean m32334b() {
            return C19075d.f42576e;
        }

        public /* synthetic */ C19076a(int i) {
            this();
        }
    }

    /* renamed from: hr.d$b */
    public static final class C19077b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C19077b f42579a = new C19077b();
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, C19076a.class.getClassLoader());
            if (Conscrypt.isAvailable() && C19076a.m32333a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f42576e = z;
    }

    public C19075d() {
        Provider newProvider = Conscrypt.newProvider();
        C19383o.m32796f(newProvider, "Conscrypt.newProvider()");
        this.f42578d = newProvider;
    }

    /* renamed from: d */
    public final void mo70557d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C19383o.m32797g(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C19084h.f42595c.getClass();
            Object[] array = C19084h.C19085a.m32358a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.mo70557d(sSLSocket, str, list);
    }

    /* renamed from: f */
    public final String mo70558f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* renamed from: l */
    public final SSLContext mo70568l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f42578d);
        C19383o.m32796f(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: m */
    public final SSLSocketFactory mo70570m(X509TrustManager x509TrustManager) {
        SSLContext l = mo70568l();
        l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = l.getSocketFactory();
        C19383o.m32796f(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    /* renamed from: n */
    public final X509TrustManager mo70569n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C19077b.f42579a);
                return x509TrustManager;
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
