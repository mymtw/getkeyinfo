package p030bo.app;

import com.braze.support.BrazeLogger;
import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.r5 */
public final class C4140r5 extends SSLSocketFactory {

    /* renamed from: b */
    public static final C4141a f9188b = new C4141a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private SSLSocketFactory f9189a;

    /* renamed from: bo.app.r5$a */
    public static final class C4141a {
        private C4141a() {
        }

        public /* synthetic */ C4141a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.r5$b */
    public static final class C4142b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ List<String> f9190b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4142b(List<String> list) {
            super(0);
            this.f9190b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9190b, "Enabling SSL protocols: ");
        }
    }

    public C4140r5() {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
        SSLSocketFactory socketFactory = instance.getSocketFactory();
        C19383o.m32796f(socketFactory, "sslContext.socketFactory");
        this.f9189a = socketFactory;
    }

    /* renamed from: a */
    private final Socket m9509a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            C19383o.m32796f(supportedProtocols, "socket.supportedProtocols");
            int length = supportedProtocols.length;
            int i = 0;
            while (i < length) {
                String str = supportedProtocols[i];
                i++;
                if (!C19383o.m32792b(str, "SSLv3")) {
                    C19383o.m32796f(str, "protocol");
                    arrayList.add(str);
                }
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4142b(arrayList), 6);
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                sSLSocket.setEnabledProtocols((String[]) array);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        return socket;
    }

    public Socket createSocket() {
        Socket createSocket = this.f9189a.createSocket();
        C19383o.m32796f(createSocket, "internalSSLSocketFactory.createSocket()");
        return m9509a(createSocket);
    }

    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f9189a.getDefaultCipherSuites();
        C19383o.m32796f(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f9189a.getSupportedCipherSuites();
        C19383o.m32796f(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        C19383o.m32797g(socket, "socket");
        C19383o.m32797g(str, "host");
        Socket createSocket = this.f9189a.createSocket(socket, str, i, z);
        C19383o.m32796f(createSocket, "internalSSLSocketFactory…t, host, port, autoClose)");
        return m9509a(createSocket);
    }

    public Socket createSocket(String str, int i) {
        C19383o.m32797g(str, "host");
        Socket createSocket = this.f9189a.createSocket(str, i);
        C19383o.m32796f(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return m9509a(createSocket);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        C19383o.m32797g(str, "host");
        C19383o.m32797g(inetAddress, "localHost");
        Socket createSocket = this.f9189a.createSocket(str, i, inetAddress, i2);
        C19383o.m32796f(createSocket, "internalSSLSocketFactory…rt, localHost, localPort)");
        return m9509a(createSocket);
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        C19383o.m32797g(inetAddress, "host");
        Socket createSocket = this.f9189a.createSocket(inetAddress, i);
        C19383o.m32796f(createSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return m9509a(createSocket);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        C19383o.m32797g(inetAddress, "address");
        C19383o.m32797g(inetAddress2, "localAddress");
        Socket createSocket = this.f9189a.createSocket(inetAddress, i, inetAddress2, i2);
        C19383o.m32796f(createSocket, "internalSSLSocketFactory… localAddress, localPort)");
        return m9509a(createSocket);
    }
}
