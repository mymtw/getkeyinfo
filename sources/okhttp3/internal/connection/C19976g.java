package okhttp3.internal.connection;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.common.api.Api;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import okhttp3.C19927a;
import okhttp3.C19940c0;
import okhttp3.C19989m;
import okhttp3.C19994o;
import okhttp3.C19997p;
import okhttp3.C20009t;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okhttp3.C20018z;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import p735br.C18980c;
import p737cr.C18983b;
import p737cr.C18985d;
import p739dr.C19004d;
import p739dr.C19006f;
import p741er.C19013b;
import p743fr.C19026c;
import p743fr.C19027d;
import p743fr.C19044n;
import p743fr.C19049p;
import p743fr.C19053q;
import p743fr.C19057t;
import p747hr.C19084h;
import p756lr.C19906r;
import p756lr.C19912w;
import p756lr.C19913x;

/* renamed from: okhttp3.internal.connection.g */
public final class C19976g extends C19027d.C19030c {

    /* renamed from: b */
    public Socket f44177b;

    /* renamed from: c */
    public Socket f44178c;

    /* renamed from: d */
    public Handshake f44179d;

    /* renamed from: e */
    public Protocol f44180e;

    /* renamed from: f */
    public C19027d f44181f;

    /* renamed from: g */
    public C19913x f44182g;

    /* renamed from: h */
    public C19912w f44183h;

    /* renamed from: i */
    public boolean f44184i;

    /* renamed from: j */
    public boolean f44185j;

    /* renamed from: k */
    public int f44186k;

    /* renamed from: l */
    public int f44187l;

    /* renamed from: m */
    public int f44188m;

    /* renamed from: n */
    public int f44189n = 1;

    /* renamed from: o */
    public final ArrayList f44190o = new ArrayList();

    /* renamed from: p */
    public long f44191p = Long.MAX_VALUE;

    /* renamed from: q */
    public final C19940c0 f44192q;

    public C19976g(C19978i iVar, C19940c0 c0Var) {
        C19383o.m32797g(iVar, "connectionPool");
        C19383o.m32797g(c0Var, "route");
        this.f44192q = c0Var;
    }

    /* renamed from: d */
    public static void m34166d(C20009t tVar, C19940c0 c0Var, IOException iOException) {
        C19383o.m32797g(tVar, "client");
        C19383o.m32797g(c0Var, "failedRoute");
        C19383o.m32797g(iOException, EventsNameKt.FAILED);
        if (c0Var.f43996b.type() != Proxy.Type.DIRECT) {
            C19927a aVar = c0Var.f43995a;
            aVar.f43958k.connectFailed(aVar.f43948a.mo72971g(), c0Var.f43996b.address(), iOException);
        }
        C19979j jVar = tVar.f44285E;
        synchronized (jVar) {
            jVar.f44199a.add(c0Var);
        }
    }

    /* renamed from: a */
    public final synchronized void mo70494a(C19027d dVar, C19057t tVar) {
        C19383o.m32797g(dVar, "connection");
        C19383o.m32797g(tVar, "settings");
        this.f44189n = (tVar.f42553a & 16) != 0 ? tVar.f42554b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* renamed from: b */
    public final void mo70495b(C19049p pVar) throws IOException {
        C19383o.m32797g(pVar, "stream");
        pVar.mo70513c(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0166 A[EDGE_INSN: B:87:0x0166->B:80:0x0166 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72923c(int r17, int r18, int r19, int r20, boolean r21, okhttp3.internal.connection.C19971e r22, okhttp3.C19989m r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            okhttp3.Protocol r0 = r7.f44180e
            r12 = 1
            if (r0 != 0) goto L_0x001b
            r0 = r12
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0174
            okhttp3.c0 r0 = r7.f44192q
            okhttp3.a r0 = r0.f43995a
            java.util.List<okhttp3.h> r0 = r0.f43950c
            okhttp3.internal.connection.b r13 = new okhttp3.internal.connection.b
            r13.<init>(r0)
            okhttp3.c0 r1 = r7.f44192q
            okhttp3.a r1 = r1.f43995a
            javax.net.ssl.SSLSocketFactory r2 = r1.f43953f
            if (r2 != 0) goto L_0x006f
            okhttp3.h r1 = okhttp3.C19950h.f44040f
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0062
            okhttp3.c0 r0 = r7.f44192q
            okhttp3.a r0 = r0.f43995a
            okhttp3.p r0 = r0.f43948a
            java.lang.String r0 = r0.f44243e
            hr.h$a r1 = p747hr.C19084h.f42595c
            r1.getClass()
            hr.h r1 = p747hr.C19084h.f42593a
            boolean r1 = r1.mo70559h(r0)
            if (r1 == 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = p010a9.C0048b.m163a(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0062:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006f:
            java.util.List<okhttp3.Protocol> r0 = r1.f43949b
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0167
        L_0x0079:
            r14 = 0
            r15 = r14
        L_0x007b:
            okhttp3.c0 r0 = r7.f44192q     // Catch:{ IOException -> 0x00ff }
            okhttp3.a r1 = r0.f43995a     // Catch:{ IOException -> 0x00ff }
            javax.net.ssl.SSLSocketFactory r1 = r1.f43953f     // Catch:{ IOException -> 0x00ff }
            if (r1 == 0) goto L_0x008f
            java.net.Proxy r0 = r0.f43996b     // Catch:{ IOException -> 0x00ff }
            java.net.Proxy$Type r0 = r0.type()     // Catch:{ IOException -> 0x00ff }
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x00ff }
            if (r0 != r1) goto L_0x008f
            r0 = r12
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            if (r0 == 0) goto L_0x00b0
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.mo72925f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00ff }
            java.net.Socket r0 = r7.f44177b     // Catch:{ IOException -> 0x00ff }
            if (r0 != 0) goto L_0x00a6
            goto L_0x00ca
        L_0x00a6:
            r1 = r17
            r2 = r18
            goto L_0x00b7
        L_0x00ab:
            r1 = r17
            r2 = r18
            goto L_0x00fc
        L_0x00b0:
            r1 = r17
            r2 = r18
            r7.mo72924e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00fb }
        L_0x00b7:
            r3 = r20
            r7.mo72926g(r13, r3, r8, r9)     // Catch:{ IOException -> 0x00f9 }
            okhttp3.c0 r0 = r7.f44192q     // Catch:{ IOException -> 0x00f9 }
            java.net.InetSocketAddress r4 = r0.f43997c     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy r0 = r0.f43996b     // Catch:{ IOException -> 0x00f9 }
            okhttp3.m$a r5 = okhttp3.C19989m.f44227a     // Catch:{ IOException -> 0x00f9 }
            kotlin.jvm.internal.C19383o.m32797g(r4, r11)     // Catch:{ IOException -> 0x00f9 }
            kotlin.jvm.internal.C19383o.m32797g(r0, r10)     // Catch:{ IOException -> 0x00f9 }
        L_0x00ca:
            okhttp3.c0 r0 = r7.f44192q
            okhttp3.a r1 = r0.f43995a
            javax.net.ssl.SSLSocketFactory r1 = r1.f43953f
            if (r1 == 0) goto L_0x00dd
            java.net.Proxy r0 = r0.f43996b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r12 = 0
        L_0x00de:
            if (r12 == 0) goto L_0x00f2
            java.net.Socket r0 = r7.f44177b
            if (r0 == 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            long r0 = java.lang.System.nanoTime()
            r7.f44191p = r0
            return
        L_0x00f9:
            r0 = move-exception
            goto L_0x0101
        L_0x00fb:
            r0 = move-exception
        L_0x00fc:
            r3 = r20
            goto L_0x0101
        L_0x00ff:
            r0 = move-exception
            goto L_0x00ab
        L_0x0101:
            java.net.Socket r4 = r7.f44178c
            if (r4 == 0) goto L_0x0108
            p735br.C18980c.m32100d(r4)
        L_0x0108:
            java.net.Socket r4 = r7.f44177b
            if (r4 == 0) goto L_0x010f
            p735br.C18980c.m32100d(r4)
        L_0x010f:
            r7.f44178c = r14
            r7.f44177b = r14
            r7.f44182g = r14
            r7.f44183h = r14
            r7.f44179d = r14
            r7.f44180e = r14
            r7.f44181f = r14
            r7.f44189n = r12
            okhttp3.c0 r4 = r7.f44192q
            java.net.InetSocketAddress r5 = r4.f43997c
            java.net.Proxy r4 = r4.f43996b
            kotlin.jvm.internal.C19383o.m32797g(r5, r11)
            kotlin.jvm.internal.C19383o.m32797g(r4, r10)
            if (r15 != 0) goto L_0x0133
            okhttp3.internal.connection.RouteException r15 = new okhttp3.internal.connection.RouteException
            r15.<init>(r0)
            goto L_0x0136
        L_0x0133:
            r15.addConnectException(r0)
        L_0x0136:
            if (r21 == 0) goto L_0x0166
            r13.f44124c = r12
            boolean r4 = r13.f44123b
            if (r4 != 0) goto L_0x013f
            goto L_0x0161
        L_0x013f:
            boolean r4 = r0 instanceof java.net.ProtocolException
            if (r4 == 0) goto L_0x0144
            goto L_0x0161
        L_0x0144:
            boolean r4 = r0 instanceof java.io.InterruptedIOException
            if (r4 == 0) goto L_0x0149
            goto L_0x0161
        L_0x0149:
            boolean r4 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 == 0) goto L_0x0156
            java.lang.Throwable r4 = r0.getCause()
            boolean r4 = r4 instanceof java.security.cert.CertificateException
            if (r4 == 0) goto L_0x0156
            goto L_0x0161
        L_0x0156:
            boolean r4 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L_0x015b
            goto L_0x0161
        L_0x015b:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x0161
            r0 = r12
            goto L_0x0162
        L_0x0161:
            r0 = 0
        L_0x0162:
            if (r0 == 0) goto L_0x0166
            goto L_0x007b
        L_0x0166:
            throw r15
        L_0x0167:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0174:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C19976g.mo72923c(int, int, int, int, boolean, okhttp3.internal.connection.e, okhttp3.m):void");
    }

    /* renamed from: e */
    public final void mo72924e(int i, int i2, C19971e eVar, C19989m mVar) throws IOException {
        Socket socket;
        int i3;
        C19940c0 c0Var = this.f44192q;
        Proxy proxy = c0Var.f43996b;
        C19927a aVar = c0Var.f43995a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = C19975f.f44176a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = aVar.f43952e.createSocket();
            C19383o.m32794d(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f44177b = socket;
        InetSocketAddress inetSocketAddress = this.f44192q.f43997c;
        mVar.getClass();
        C19383o.m32797g(eVar, "call");
        C19383o.m32797g(inetSocketAddress, "inetSocketAddress");
        socket.setSoTimeout(i2);
        try {
            C19084h.f42595c.getClass();
            C19084h.f42593a.mo70561e(socket, this.f44192q.f43997c, i);
            try {
                this.f44182g = C19906r.m33998b(C19906r.m34001e(socket));
                this.f44183h = C19906r.m33997a(C19906r.m34000d(socket));
            } catch (NullPointerException e) {
                if (C19383o.m32792b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder h = C0072d.m201h("Failed to connect to ");
            h.append(this.f44192q.f43997c);
            ConnectException connectException = new ConnectException(h.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: f */
    public final void mo72925f(int i, int i2, int i3, C19971e eVar, C19989m mVar) throws IOException {
        C20011u uVar;
        int i4 = i2;
        C19971e eVar2 = eVar;
        C20011u.C20012a aVar = new C20011u.C20012a();
        C19997p pVar = this.f44192q.f43995a.f43948a;
        C19383o.m32797g(pVar, "url");
        aVar.f44347a = pVar;
        C20009t tVar = null;
        aVar.mo73001d("CONNECT", (C20016y) null);
        boolean z = true;
        aVar.mo73000c("Host", C18980c.m32117u(this.f44192q.f43995a.f43948a, true));
        aVar.mo73000c("Proxy-Connection", "Keep-Alive");
        aVar.mo73000c("User-Agent", "okhttp/4.9.1");
        C20011u b = aVar.mo72999b();
        C20018z.C20019a aVar2 = new C20018z.C20019a();
        aVar2.f44375a = b;
        Protocol protocol = Protocol.HTTP_1_1;
        C19383o.m32797g(protocol, "protocol");
        aVar2.f44376b = protocol;
        aVar2.f44377c = 407;
        aVar2.f44378d = "Preemptive Authenticate";
        aVar2.f44381g = C18980c.f42303c;
        aVar2.f44385k = -1;
        aVar2.f44386l = -1;
        C19994o.C19995a aVar3 = aVar2.f44380f;
        aVar3.getClass();
        C19994o.f44234c.getClass();
        C19994o.C19996b.m34214a("Proxy-Authenticate");
        C19994o.C19996b.m34215b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.mo72963f("Proxy-Authenticate");
        aVar3.mo72960c("Proxy-Authenticate", "OkHttp-Preemptive");
        C20018z a = aVar2.mo73008a();
        C19940c0 c0Var = this.f44192q;
        C20011u c = c0Var.f43995a.f43956i.mo30010c(c0Var, a);
        if (c != null) {
            b = c;
        }
        C19997p pVar2 = uVar.f44342b;
        int i5 = 0;
        while (i5 < 21) {
            mo72924e(i, i4, eVar2, mVar);
            String str = "CONNECT " + C18980c.m32117u(pVar2, z) + " HTTP/1.1";
            while (true) {
                C19913x xVar = this.f44182g;
                C19383o.m32794d(xVar);
                C19912w wVar = this.f44183h;
                C19383o.m32794d(wVar);
                C19013b bVar = new C19013b(tVar, this, xVar, wVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                xVar.mo68547m().mo72705g((long) i4, timeUnit);
                wVar.mo68515m().mo72705g((long) i3, timeUnit);
                bVar.mo70464k(uVar.f44344d, str);
                bVar.mo70444a();
                C20018z.C20019a g = bVar.mo70451g(false);
                C19383o.m32794d(g);
                g.f44375a = uVar;
                C20018z a2 = g.mo73008a();
                long j = C18980c.m32106j(a2);
                if (j != -1) {
                    C19013b.C19017d j2 = bVar.mo70463j(j);
                    C18980c.m32115s(j2, Api.BaseClientBuilder.API_PRIORITY_OTHER, timeUnit);
                    j2.close();
                }
                int i6 = a2.f44365f;
                if (i6 != 200) {
                    if (i6 == 407) {
                        C19940c0 c0Var2 = this.f44192q;
                        C20011u c2 = c0Var2.f43995a.f43956i.mo30010c(c0Var2, a2);
                        if (c2 == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        } else if (C19457k.m33019W0(ConstantsKt.CLOSE, C20018z.m34284b(a2, "Connection"), true)) {
                            uVar = c2;
                            z = true;
                            break;
                        } else {
                            int i7 = i;
                            C19989m mVar2 = mVar;
                            C20011u uVar2 = c2;
                            tVar = null;
                            uVar = uVar2;
                        }
                    } else {
                        StringBuilder h = C0072d.m201h("Unexpected response code for CONNECT: ");
                        h.append(a2.f44365f);
                        throw new IOException(h.toString());
                    }
                } else if (!xVar.f43916b.mo72733e0() || !wVar.f43913b.mo72733e0()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else {
                    z = true;
                    uVar = null;
                }
            }
            if (uVar != null) {
                Socket socket = this.f44177b;
                if (socket != null) {
                    C18980c.m32100d(socket);
                }
                tVar = null;
                this.f44177b = null;
                this.f44183h = null;
                this.f44182g = null;
                C19940c0 c0Var3 = this.f44192q;
                InetSocketAddress inetSocketAddress = c0Var3.f43997c;
                Proxy proxy = c0Var3.f43996b;
                C19989m.C19990a aVar4 = C19989m.f44227a;
                C19383o.m32797g(eVar2, "call");
                C19383o.m32797g(inetSocketAddress, "inetSocketAddress");
                C19383o.m32797g(proxy, "proxy");
                i5++;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a6  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72926g(okhttp3.internal.connection.C19966b r9, int r10, okhttp3.internal.connection.C19971e r11, okhttp3.C19989m r12) throws java.io.IOException {
        /*
            r8 = this;
            okhttp3.c0 r0 = r8.f44192q
            okhttp3.a r0 = r0.f43995a
            javax.net.ssl.SSLSocketFactory r1 = r0.f43953f
            if (r1 != 0) goto L_0x0025
            java.util.List<okhttp3.Protocol> r9 = r0.f43949b
            okhttp3.Protocol r11 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x001c
            java.net.Socket r9 = r8.f44177b
            r8.f44178c = r9
            r8.f44180e = r11
            r8.mo72931l(r10)
            return
        L_0x001c:
            java.net.Socket r9 = r8.f44177b
            r8.f44178c = r9
            okhttp3.Protocol r9 = okhttp3.Protocol.HTTP_1_1
            r8.f44180e = r9
            return
        L_0x0025:
            r12.getClass()
            java.lang.String r12 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r11, r12)
            okhttp3.c0 r11 = r8.f44192q
            okhttp3.a r11 = r11.f43995a
            javax.net.ssl.SSLSocketFactory r12 = r11.f43953f
            r0 = 0
            kotlin.jvm.internal.C19383o.m32794d(r12)     // Catch:{ all -> 0x0197 }
            java.net.Socket r1 = r8.f44177b     // Catch:{ all -> 0x0197 }
            okhttp3.p r2 = r11.f43948a     // Catch:{ all -> 0x0197 }
            java.lang.String r3 = r2.f44243e     // Catch:{ all -> 0x0197 }
            int r2 = r2.f44244f     // Catch:{ all -> 0x0197 }
            r4 = 1
            java.net.Socket r12 = r12.createSocket(r1, r3, r2, r4)     // Catch:{ all -> 0x0197 }
            if (r12 == 0) goto L_0x018f
            javax.net.ssl.SSLSocket r12 = (javax.net.ssl.SSLSocket) r12     // Catch:{ all -> 0x0197 }
            okhttp3.h r9 = r9.mo72905a(r12)     // Catch:{ all -> 0x018c }
            boolean r1 = r9.f44042b     // Catch:{ all -> 0x018c }
            if (r1 == 0) goto L_0x0060
            hr.h$a r1 = p747hr.C19084h.f42595c     // Catch:{ all -> 0x018c }
            r1.getClass()     // Catch:{ all -> 0x018c }
            hr.h r1 = p747hr.C19084h.f42593a     // Catch:{ all -> 0x018c }
            okhttp3.p r2 = r11.f43948a     // Catch:{ all -> 0x018c }
            java.lang.String r2 = r2.f44243e     // Catch:{ all -> 0x018c }
            java.util.List<okhttp3.Protocol> r3 = r11.f43949b     // Catch:{ all -> 0x018c }
            r1.mo70557d(r12, r2, r3)     // Catch:{ all -> 0x018c }
        L_0x0060:
            r12.startHandshake()     // Catch:{ all -> 0x018c }
            javax.net.ssl.SSLSession r1 = r12.getSession()     // Catch:{ all -> 0x018c }
            okhttp3.Handshake$Companion r2 = okhttp3.Handshake.f43943e     // Catch:{ all -> 0x018c }
            java.lang.String r3 = "sslSocketSession"
            kotlin.jvm.internal.C19383o.m32796f(r1, r3)     // Catch:{ all -> 0x018c }
            r2.getClass()     // Catch:{ all -> 0x018c }
            okhttp3.Handshake r2 = okhttp3.Handshake.Companion.m34071a(r1)     // Catch:{ all -> 0x018c }
            javax.net.ssl.HostnameVerifier r3 = r11.f43954g     // Catch:{ all -> 0x018c }
            kotlin.jvm.internal.C19383o.m32794d(r3)     // Catch:{ all -> 0x018c }
            okhttp3.p r5 = r11.f43948a     // Catch:{ all -> 0x018c }
            java.lang.String r5 = r5.f44243e     // Catch:{ all -> 0x018c }
            boolean r1 = r3.verify(r5, r1)     // Catch:{ all -> 0x018c }
            if (r1 != 0) goto L_0x0120
            java.util.List r9 = r2.mo72830a()     // Catch:{ all -> 0x018c }
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x018c }
            r10 = r10 ^ r4
            if (r10 == 0) goto L_0x0100
            r10 = 0
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x018c }
            if (r9 != 0) goto L_0x009e
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x018c }
            java.lang.String r10 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r9.<init>(r10)     // Catch:{ all -> 0x018c }
            throw r9     // Catch:{ all -> 0x018c }
        L_0x009e:
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ all -> 0x018c }
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r0.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r1 = "\n              |Hostname "
            r0.append(r1)     // Catch:{ all -> 0x018c }
            okhttp3.p r11 = r11.f43948a     // Catch:{ all -> 0x018c }
            java.lang.String r11 = r11.f44243e     // Catch:{ all -> 0x018c }
            r0.append(r11)     // Catch:{ all -> 0x018c }
            java.lang.String r11 = " not verified:\n              |    certificate: "
            r0.append(r11)     // Catch:{ all -> 0x018c }
            okhttp3.CertificatePinner$b r11 = okhttp3.CertificatePinner.f43936d     // Catch:{ all -> 0x018c }
            r11.getClass()     // Catch:{ all -> 0x018c }
            java.lang.String r11 = okhttp3.CertificatePinner.C19923b.m34068a(r9)     // Catch:{ all -> 0x018c }
            r0.append(r11)     // Catch:{ all -> 0x018c }
            java.lang.String r11 = "\n              |    DN: "
            r0.append(r11)     // Catch:{ all -> 0x018c }
            java.security.Principal r11 = r9.getSubjectDN()     // Catch:{ all -> 0x018c }
            java.lang.String r1 = "cert.subjectDN"
            kotlin.jvm.internal.C19383o.m32796f(r11, r1)     // Catch:{ all -> 0x018c }
            java.lang.String r11 = r11.getName()     // Catch:{ all -> 0x018c }
            r0.append(r11)     // Catch:{ all -> 0x018c }
            java.lang.String r11 = "\n              |    subjectAltNames: "
            r0.append(r11)     // Catch:{ all -> 0x018c }
            r11 = 7
            java.util.List r11 = p754kr.C19872d.m33863a(r9, r11)     // Catch:{ all -> 0x018c }
            r1 = 2
            java.util.List r9 = p754kr.C19872d.m33863a(r9, r1)     // Catch:{ all -> 0x018c }
            java.util.ArrayList r9 = kotlin.collections.C19327t.m32650f1(r9, r11)     // Catch:{ all -> 0x018c }
            r0.append(r9)     // Catch:{ all -> 0x018c }
            java.lang.String r9 = "\n              "
            r0.append(r9)     // Catch:{ all -> 0x018c }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x018c }
            java.lang.String r9 = kotlin.text.C19453g.m33014R0(r9)     // Catch:{ all -> 0x018c }
            r10.<init>(r9)     // Catch:{ all -> 0x018c }
            throw r10     // Catch:{ all -> 0x018c }
        L_0x0100:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r10.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "Hostname "
            r10.append(r0)     // Catch:{ all -> 0x018c }
            okhttp3.p r11 = r11.f43948a     // Catch:{ all -> 0x018c }
            java.lang.String r11 = r11.f44243e     // Catch:{ all -> 0x018c }
            r10.append(r11)     // Catch:{ all -> 0x018c }
            java.lang.String r11 = " not verified (no certificates)"
            r10.append(r11)     // Catch:{ all -> 0x018c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x018c }
            r9.<init>(r10)     // Catch:{ all -> 0x018c }
            throw r9     // Catch:{ all -> 0x018c }
        L_0x0120:
            okhttp3.CertificatePinner r1 = r11.f43955h     // Catch:{ all -> 0x018c }
            kotlin.jvm.internal.C19383o.m32794d(r1)     // Catch:{ all -> 0x018c }
            okhttp3.Handshake r3 = new okhttp3.Handshake     // Catch:{ all -> 0x018c }
            okhttp3.TlsVersion r4 = r2.f43945b     // Catch:{ all -> 0x018c }
            okhttp3.g r5 = r2.f43946c     // Catch:{ all -> 0x018c }
            java.util.List<java.security.cert.Certificate> r6 = r2.f43947d     // Catch:{ all -> 0x018c }
            okhttp3.internal.connection.RealConnection$connectTls$1 r7 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch:{ all -> 0x018c }
            r7.<init>(r1, r2, r11)     // Catch:{ all -> 0x018c }
            r3.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x018c }
            r8.f44179d = r3     // Catch:{ all -> 0x018c }
            okhttp3.p r11 = r11.f43948a     // Catch:{ all -> 0x018c }
            java.lang.String r11 = r11.f44243e     // Catch:{ all -> 0x018c }
            okhttp3.internal.connection.RealConnection$connectTls$2 r2 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch:{ all -> 0x018c }
            r2.<init>(r8)     // Catch:{ all -> 0x018c }
            r1.mo72824b(r11, r2)     // Catch:{ all -> 0x018c }
            boolean r9 = r9.f44042b     // Catch:{ all -> 0x018c }
            if (r9 == 0) goto L_0x0152
            hr.h$a r9 = p747hr.C19084h.f42595c     // Catch:{ all -> 0x018c }
            r9.getClass()     // Catch:{ all -> 0x018c }
            hr.h r9 = p747hr.C19084h.f42593a     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r9.mo70558f(r12)     // Catch:{ all -> 0x018c }
        L_0x0152:
            r8.f44178c = r12     // Catch:{ all -> 0x018c }
            lr.d r9 = p756lr.C19906r.m34001e(r12)     // Catch:{ all -> 0x018c }
            lr.x r9 = p756lr.C19906r.m33998b(r9)     // Catch:{ all -> 0x018c }
            r8.f44182g = r9     // Catch:{ all -> 0x018c }
            lr.c r9 = p756lr.C19906r.m34000d(r12)     // Catch:{ all -> 0x018c }
            lr.w r9 = p756lr.C19906r.m33997a(r9)     // Catch:{ all -> 0x018c }
            r8.f44183h = r9     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0174
            okhttp3.Protocol$a r9 = okhttp3.Protocol.Companion     // Catch:{ all -> 0x018c }
            r9.getClass()     // Catch:{ all -> 0x018c }
            okhttp3.Protocol r9 = okhttp3.Protocol.C19925a.m34073a(r0)     // Catch:{ all -> 0x018c }
            goto L_0x0176
        L_0x0174:
            okhttp3.Protocol r9 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x018c }
        L_0x0176:
            r8.f44180e = r9     // Catch:{ all -> 0x018c }
            hr.h$a r9 = p747hr.C19084h.f42595c
            r9.getClass()
            hr.h r9 = p747hr.C19084h.f42593a
            r9.mo70571a(r12)
            okhttp3.Protocol r9 = r8.f44180e
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_2
            if (r9 != r11) goto L_0x018b
            r8.mo72931l(r10)
        L_0x018b:
            return
        L_0x018c:
            r9 = move-exception
            r0 = r12
            goto L_0x0198
        L_0x018f:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x0197 }
            java.lang.String r10 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r9.<init>(r10)     // Catch:{ all -> 0x0197 }
            throw r9     // Catch:{ all -> 0x0197 }
        L_0x0197:
            r9 = move-exception
        L_0x0198:
            if (r0 == 0) goto L_0x01a4
            hr.h$a r10 = p747hr.C19084h.f42595c
            r10.getClass()
            hr.h r10 = p747hr.C19084h.f42593a
            r10.mo70571a(r0)
        L_0x01a4:
            if (r0 == 0) goto L_0x01a9
            p735br.C18980c.m32100d(r0)
        L_0x01a9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C19976g.mo72926g(okhttp3.internal.connection.b, int, okhttp3.internal.connection.e, okhttp3.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        if (r7 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc A[SYNTHETIC, Splitter:B:57:0x00dc] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo72927h(okhttp3.C19927a r6, java.util.List<okhttp3.C19940c0> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            byte[] r0 = p735br.C18980c.f42301a
            java.util.ArrayList r0 = r5.f44190o
            int r0 = r0.size()
            int r1 = r5.f44189n
            r2 = 0
            if (r0 >= r1) goto L_0x00f2
            boolean r0 = r5.f44184i
            if (r0 == 0) goto L_0x0018
            goto L_0x00f2
        L_0x0018:
            okhttp3.c0 r0 = r5.f44192q
            okhttp3.a r0 = r0.f43995a
            boolean r0 = r0.mo72837a(r6)
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            okhttp3.p r0 = r6.f43948a
            java.lang.String r0 = r0.f44243e
            okhttp3.c0 r1 = r5.f44192q
            okhttp3.a r1 = r1.f43995a
            okhttp3.p r1 = r1.f43948a
            java.lang.String r1 = r1.f44243e
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            r1 = 1
            if (r0 == 0) goto L_0x0037
            return r1
        L_0x0037:
            fr.d r0 = r5.f44181f
            if (r0 != 0) goto L_0x003c
            return r2
        L_0x003c:
            if (r7 == 0) goto L_0x00f2
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0045
            goto L_0x007e
        L_0x0045:
            java.util.Iterator r7 = r7.iterator()
        L_0x0049:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r7.next()
            okhttp3.c0 r0 = (okhttp3.C19940c0) r0
            java.net.Proxy r3 = r0.f43996b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            okhttp3.c0 r3 = r5.f44192q
            java.net.Proxy r3 = r3.f43996b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            okhttp3.c0 r3 = r5.f44192q
            java.net.InetSocketAddress r3 = r3.f43997c
            java.net.InetSocketAddress r0 = r0.f43997c
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r3, r0)
            if (r0 == 0) goto L_0x0079
            r0 = r1
            goto L_0x007a
        L_0x0079:
            r0 = r2
        L_0x007a:
            if (r0 == 0) goto L_0x0049
            r7 = r1
            goto L_0x007f
        L_0x007e:
            r7 = r2
        L_0x007f:
            if (r7 != 0) goto L_0x0083
            goto L_0x00f2
        L_0x0083:
            javax.net.ssl.HostnameVerifier r7 = r6.f43954g
            kr.d r0 = p754kr.C19872d.f43855a
            if (r7 == r0) goto L_0x008a
            return r2
        L_0x008a:
            okhttp3.p r7 = r6.f43948a
            byte[] r0 = p735br.C18980c.f42301a
            okhttp3.c0 r0 = r5.f44192q
            okhttp3.a r0 = r0.f43995a
            okhttp3.p r0 = r0.f43948a
            int r3 = r7.f44244f
            int r4 = r0.f44244f
            if (r3 == r4) goto L_0x009b
            goto L_0x00d8
        L_0x009b:
            java.lang.String r3 = r7.f44243e
            java.lang.String r0 = r0.f44243e
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r3, r0)
            if (r0 == 0) goto L_0x00a6
            goto L_0x00d6
        L_0x00a6:
            boolean r0 = r5.f44185j
            if (r0 != 0) goto L_0x00d8
            okhttp3.Handshake r0 = r5.f44179d
            if (r0 == 0) goto L_0x00d8
            java.util.List r0 = r0.mo72830a()
            boolean r3 = r0.isEmpty()
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x00d3
            java.lang.String r7 = r7.f44243e
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x00cb
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            boolean r7 = p754kr.C19872d.m33864b(r7, r0)
            if (r7 == 0) goto L_0x00d3
            r7 = r1
            goto L_0x00d4
        L_0x00cb:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r6.<init>(r7)
            throw r6
        L_0x00d3:
            r7 = r2
        L_0x00d4:
            if (r7 == 0) goto L_0x00d8
        L_0x00d6:
            r7 = r1
            goto L_0x00d9
        L_0x00d8:
            r7 = r2
        L_0x00d9:
            if (r7 != 0) goto L_0x00dc
            return r2
        L_0x00dc:
            okhttp3.CertificatePinner r7 = r6.f43955h     // Catch:{ SSLPeerUnverifiedException -> 0x00f2 }
            kotlin.jvm.internal.C19383o.m32794d(r7)     // Catch:{ SSLPeerUnverifiedException -> 0x00f2 }
            okhttp3.p r6 = r6.f43948a     // Catch:{ SSLPeerUnverifiedException -> 0x00f2 }
            java.lang.String r6 = r6.f44243e     // Catch:{ SSLPeerUnverifiedException -> 0x00f2 }
            okhttp3.Handshake r0 = r5.f44179d     // Catch:{ SSLPeerUnverifiedException -> 0x00f2 }
            kotlin.jvm.internal.C19383o.m32794d(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00f2 }
            java.util.List r0 = r0.mo72830a()     // Catch:{ SSLPeerUnverifiedException -> 0x00f2 }
            r7.mo72823a(r6, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00f2 }
            return r1
        L_0x00f2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C19976g.mo72927h(okhttp3.a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo72928i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = p735br.C18980c.f42301a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f44177b
            kotlin.jvm.internal.C19383o.m32794d(r2)
            java.net.Socket r3 = r9.f44178c
            kotlin.jvm.internal.C19383o.m32794d(r3)
            lr.x r4 = r9.f44182g
            kotlin.jvm.internal.C19383o.m32794d(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x007d
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x007d
        L_0x002f:
            fr.d r2 = r9.f44181f
            r6 = 1
            if (r2 == 0) goto L_0x0051
            monitor-enter(r2)
            boolean r10 = r2.f42431h     // Catch:{ all -> 0x004e }
            if (r10 == 0) goto L_0x003b
            monitor-exit(r2)
            goto L_0x004d
        L_0x003b:
            long r3 = r2.f42440q     // Catch:{ all -> 0x004e }
            long r7 = r2.f42439p     // Catch:{ all -> 0x004e }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004b
            long r3 = r2.f42441r     // Catch:{ all -> 0x004e }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004b
            monitor-exit(r2)
            goto L_0x004d
        L_0x004b:
            monitor-exit(r2)
            r5 = r6
        L_0x004d:
            return r5
        L_0x004e:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0051:
            monitor-enter(r9)
            long r7 = r9.f44191p     // Catch:{ all -> 0x007a }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0079
            if (r10 == 0) goto L_0x0079
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x0072 }
            boolean r0 = r4.mo72733e0()     // Catch:{ all -> 0x0072 }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            r5 = r0
            goto L_0x0078
        L_0x0072:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0077, IOException -> 0x0078 }
        L_0x0077:
            r5 = r6
        L_0x0078:
            return r5
        L_0x0079:
            return r6
        L_0x007a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x007d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C19976g.mo72928i(boolean):boolean");
    }

    /* renamed from: j */
    public final C19004d mo72929j(C20009t tVar, C19006f fVar) throws SocketException {
        Socket socket = this.f44178c;
        C19383o.m32794d(socket);
        C19913x xVar = this.f44182g;
        C19383o.m32794d(xVar);
        C19912w wVar = this.f44183h;
        C19383o.m32794d(wVar);
        C19027d dVar = this.f44181f;
        if (dVar != null) {
            return new C19044n(tVar, this, fVar, dVar);
        }
        socket.setSoTimeout(fVar.f42353h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVar.mo68547m().mo72705g((long) fVar.f42353h, timeUnit);
        wVar.mo68515m().mo72705g((long) fVar.f42354i, timeUnit);
        return new C19013b(tVar, this, xVar, wVar);
    }

    /* renamed from: k */
    public final synchronized void mo72930k() {
        this.f44184i = true;
    }

    /* renamed from: l */
    public final void mo72931l(int i) throws IOException {
        String str;
        Socket socket = this.f44178c;
        C19383o.m32794d(socket);
        C19913x xVar = this.f44182g;
        C19383o.m32794d(xVar);
        C19912w wVar = this.f44183h;
        C19383o.m32794d(wVar);
        socket.setSoTimeout(0);
        C18985d dVar = C18985d.f42320h;
        C19027d.C19029b bVar = new C19027d.C19029b(dVar);
        String str2 = this.f44192q.f43995a.f43948a.f44243e;
        C19383o.m32797g(str2, "peerName");
        bVar.f42452a = socket;
        if (bVar.f42459h) {
            str = C18980c.f42307g + ' ' + str2;
        } else {
            str = C0326j.m864i("MockWebServer ", str2);
        }
        bVar.f42453b = str;
        bVar.f42454c = xVar;
        bVar.f42455d = wVar;
        bVar.f42456e = this;
        bVar.f42458g = i;
        C19027d dVar2 = new C19027d(bVar);
        this.f44181f = dVar2;
        C19057t tVar = C19027d.f42422C;
        this.f44189n = (tVar.f42553a & 16) != 0 ? tVar.f42554b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        C19053q qVar = dVar2.f42449z;
        synchronized (qVar) {
            if (qVar.f42542d) {
                throw new IOException("closed");
            } else if (qVar.f42545g) {
                Logger logger = C19053q.f42539h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C18980c.m32104h(">> CONNECTION " + C19026c.f42417a.hex(), new Object[0]));
                }
                qVar.f42544f.mo72757s0(C19026c.f42417a);
                qVar.f42544f.flush();
            }
        }
        C19053q qVar2 = dVar2.f42449z;
        C19057t tVar2 = dVar2.f42442s;
        synchronized (qVar2) {
            C19383o.m32797g(tVar2, "settings");
            if (!qVar2.f42542d) {
                qVar2.mo70529d(0, Integer.bitCount(tVar2.f42553a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z = true;
                    if (((1 << i2) & tVar2.f42553a) == 0) {
                        z = false;
                    }
                    if (z) {
                        qVar2.f42544f.writeShort(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                        qVar2.f42544f.writeInt(tVar2.f42554b[i2]);
                    }
                    i2++;
                }
                qVar2.f42544f.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a = dVar2.f42442s.mo70535a();
        if (a != 65535) {
            dVar2.f42449z.mo70533h(0, (long) (a - SupportMenu.USER_MASK));
        }
        dVar.mo70430f().mo70422c(new C18983b(dVar2.f42423A, dVar2.f42428e), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder h = C0072d.m201h("Connection{");
        h.append(this.f44192q.f43995a.f43948a.f44243e);
        h.append(':');
        h.append(this.f44192q.f43995a.f43948a.f44244f);
        h.append(',');
        h.append(" proxy=");
        h.append(this.f44192q.f43996b);
        h.append(" hostAddress=");
        h.append(this.f44192q.f43997c);
        h.append(" cipherSuite=");
        Handshake handshake = this.f44179d;
        if (handshake == null || (obj = handshake.f43946c) == null) {
            obj = "none";
        }
        h.append(obj);
        h.append(" protocol=");
        h.append(this.f44180e);
        h.append('}');
        return h.toString();
    }
}
