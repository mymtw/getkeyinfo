package p747hr;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import okhttp3.Protocol;
import p754kr.C19869a;
import p754kr.C19870b;
import p754kr.C19871c;
import p754kr.C19873e;
import p756lr.C19893f;

/* renamed from: hr.h */
public class C19084h {

    /* renamed from: a */
    public static volatile C19084h f42593a;

    /* renamed from: b */
    public static final Logger f42594b = Logger.getLogger(C20009t.class.getName());

    /* renamed from: c */
    public static final C19085a f42595c = new C19085a();

    /* renamed from: hr.h$a */
    public static final class C19085a {
        /* renamed from: a */
        public static ArrayList m32358a(List list) {
            C19383o.m32797g(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((Protocol) next) != Protocol.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        /* renamed from: b */
        public static byte[] m32359b(List list) {
            C19383o.m32797g(list, "protocols");
            C19893f fVar = new C19893f();
            Iterator it = m32358a(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                fVar.mo72771x0(str.length());
                fVar.mo72715G0(str);
            }
            return fVar.mo72732d0();
        }

        /* renamed from: c */
        public static boolean m32360c() {
            return C19383o.m32792b("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: hr.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: hr.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: hr.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: hr.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: hr.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: hr.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        if (r0 != null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dc, code lost:
        if (r0 != null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0105, code lost:
        if (r0 != null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
        if (java.lang.Integer.parseInt(r0) >= 9) goto L_0x0193;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0197  */
    static {
        /*
            hr.h$a r0 = new hr.h$a
            r0.<init>()
            f42595c = r0
            boolean r0 = p747hr.C19084h.C19085a.m32360c()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x008c
            java.util.Map<java.lang.String, java.lang.String> r0 = p749ir.C19265c.f43130b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = p749ir.C19265c.f43129a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x0019
            java.lang.String r5 = "logger"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x004f
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x005b
        L_0x004f:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x0059
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x005b
        L_0x0059:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x005b:
            r4.setLevel(r3)
            ir.d r3 = p749ir.C19266d.f43131a
            r4.addHandler(r3)
            goto L_0x0019
        L_0x0064:
            hr.a$a r0 = p747hr.C19068a.f42565f
            r0.getClass()
            boolean r0 = p747hr.C19068a.f42564e
            if (r0 == 0) goto L_0x0073
            hr.a r0 = new hr.a
            r0.<init>()
            goto L_0x0074
        L_0x0073:
            r0 = r1
        L_0x0074:
            if (r0 == 0) goto L_0x0078
            goto L_0x019c
        L_0x0078:
            hr.b$a r0 = p747hr.C19070b.f42568g
            r0.getClass()
            boolean r0 = p747hr.C19070b.f42567f
            if (r0 == 0) goto L_0x0086
            hr.b r1 = new hr.b
            r1.<init>()
        L_0x0086:
            kotlin.jvm.internal.C19383o.m32794d(r1)
        L_0x0089:
            r0 = r1
            goto L_0x019c
        L_0x008c:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r4, r0)
            if (r0 == 0) goto L_0x00b7
            hr.d$a r0 = p747hr.C19075d.f42577f
            r0.getClass()
            boolean r0 = p747hr.C19075d.f42576e
            if (r0 == 0) goto L_0x00b2
            hr.d r0 = new hr.d
            r0.<init>()
            goto L_0x00b3
        L_0x00b2:
            r0 = r1
        L_0x00b3:
            if (r0 == 0) goto L_0x00b7
            goto L_0x019c
        L_0x00b7:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "BC"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r4, r0)
            if (r0 == 0) goto L_0x00e0
            hr.c$a r0 = p747hr.C19073c.f42574f
            r0.getClass()
            boolean r0 = p747hr.C19073c.f42573e
            if (r0 == 0) goto L_0x00db
            hr.c r0 = new hr.c
            r0.<init>()
            goto L_0x00dc
        L_0x00db:
            r0 = r1
        L_0x00dc:
            if (r0 == 0) goto L_0x00e0
            goto L_0x019c
        L_0x00e0:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r3, r0)
            if (r0 == 0) goto L_0x0109
            hr.g$a r0 = p747hr.C19082g.f42591f
            r0.getClass()
            boolean r0 = p747hr.C19082g.f42590e
            if (r0 == 0) goto L_0x0104
            hr.g r0 = new hr.g
            r0.<init>()
            goto L_0x0105
        L_0x0104:
            r0 = r1
        L_0x0105:
            if (r0 == 0) goto L_0x0109
            goto L_0x019c
        L_0x0109:
            hr.f$a r0 = p747hr.C19080f.f42589e
            r0.getClass()
            boolean r0 = p747hr.C19080f.f42588d
            if (r0 == 0) goto L_0x0118
            hr.f r0 = new hr.f
            r0.<init>()
            goto L_0x0119
        L_0x0118:
            r0 = r1
        L_0x0119:
            if (r0 == 0) goto L_0x011d
            goto L_0x019c
        L_0x011d:
            java.lang.String r0 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)
            java.lang.String r3 = "jvmVersion"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)     // Catch:{ NumberFormatException -> 0x0133 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0133 }
            r3 = 9
            if (r0 < r3) goto L_0x0133
            goto L_0x0193
        L_0x0133:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            r6[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            hr.e r0 = new hr.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r2 = "putMethod"
            kotlin.jvm.internal.C19383o.m32796f(r7, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r2 = "getMethod"
            kotlin.jvm.internal.C19383o.m32796f(r8, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r2 = "removeMethod"
            kotlin.jvm.internal.C19383o.m32796f(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r2 = "clientProviderClass"
            kotlin.jvm.internal.C19383o.m32796f(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            java.lang.String r2 = "serverProviderClass"
            kotlin.jvm.internal.C19383o.m32796f(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0193 }
            r1 = r0
        L_0x0193:
            if (r1 == 0) goto L_0x0197
            goto L_0x0089
        L_0x0197:
            hr.h r0 = new hr.h
            r0.<init>()
        L_0x019c:
            f42593a = r0
            java.lang.Class<okhttp3.t> r0 = okhttp3.C20009t.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f42594b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p747hr.C19084h.<clinit>():void");
    }

    /* renamed from: i */
    public static void m32344i(int i, String str, Throwable th) {
        C19383o.m32797g(str, "message");
        f42594b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: j */
    public static /* synthetic */ void m32345j(C19084h hVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        hVar.getClass();
        m32344i(i, str, (Throwable) null);
    }

    /* renamed from: a */
    public void mo70571a(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public C19871c mo70556b(X509TrustManager x509TrustManager) {
        return new C19869a(mo70560c(x509TrustManager));
    }

    /* renamed from: c */
    public C19873e mo70560c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C19383o.m32796f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C19870b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: d */
    public void mo70557d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C19383o.m32797g(list, "protocols");
    }

    /* renamed from: e */
    public void mo70561e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        C19383o.m32797g(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: f */
    public String mo70558f(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: g */
    public Object mo70562g() {
        if (f42594b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo70559h(String str) {
        C19383o.m32797g(str, "hostname");
        return true;
    }

    /* renamed from: k */
    public void mo70563k(Object obj, String str) {
        C19383o.m32797g(str, "message");
        if (obj == null) {
            str = C0326j.m864i(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m32344i(5, str, (Throwable) obj);
    }

    /* renamed from: l */
    public SSLContext mo70568l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C19383o.m32796f(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    /* renamed from: m */
    public SSLSocketFactory mo70570m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l = mo70568l();
            l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = l.getSocketFactory();
            C19383o.m32796f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: n */
    public X509TrustManager mo70569n() {
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

    public final String toString() {
        return getClass().getSimpleName();
    }
}
