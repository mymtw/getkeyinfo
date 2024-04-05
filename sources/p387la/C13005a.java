package p387la;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C19383o;
import okhttp3.TlsVersion;

/* renamed from: la.a */
public final class C13005a extends SSLSocketFactory {

    /* renamed from: a */
    public final SSLSocketFactory f28627a;

    /* renamed from: b */
    public final String[] f28628b = {TlsVersion.TLS_1_2.javaName()};

    public C13005a(SSLSocketFactory sSLSocketFactory) {
        this.f28627a = sSLSocketFactory;
    }

    /* renamed from: a */
    public final void mo45800a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(this.f28628b);
        }
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f28627a.createSocket(socket, str, i, z);
        C19383o.m32796f(createSocket, "baseSocketFactory.create…s, host, port, autoClose)");
        mo45800a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f28627a.getDefaultCipherSuites();
        C19383o.m32796f(defaultCipherSuites, "baseSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f28627a.getSupportedCipherSuites();
        C19383o.m32796f(supportedCipherSuites, "baseSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    public final Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        Socket createSocket = this.f28627a.createSocket(str, i);
        C19383o.m32796f(createSocket, "baseSocketFactory.createSocket(host, port)");
        mo45800a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        Socket createSocket = this.f28627a.createSocket(str, i, inetAddress, i2);
        C19383o.m32796f(createSocket, "baseSocketFactory.create…rt, localHost, localPort)");
        mo45800a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f28627a.createSocket(inetAddress, i);
        C19383o.m32796f(createSocket, "baseSocketFactory.createSocket(host, port)");
        mo45800a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f28627a.createSocket(inetAddress, i, inetAddress2, i2);
        C19383o.m32796f(createSocket, "baseSocketFactory.create… localAddress, localPort)");
        mo45800a(createSocket);
        return createSocket;
    }
}
