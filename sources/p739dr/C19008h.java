package p739dr;

import com.facebook.login.LoginFragment;
import com.google.android.gms.common.api.Api;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.text.Regex;
import okhttp3.C19927a;
import okhttp3.C19928a0;
import okhttp3.C19940c0;
import okhttp3.C19997p;
import okhttp3.C20000q;
import okhttp3.C20009t;
import okhttp3.C20011u;
import okhttp3.C20018z;
import okhttp3.CertificatePinner;
import okhttp3.internal.connection.C19967c;
import okhttp3.internal.connection.C19970d;
import okhttp3.internal.connection.C19971e;
import okhttp3.internal.connection.C19976g;
import okhttp3.internal.connection.C19978i;
import okhttp3.internal.connection.C19980k;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import p735br.C18980c;

/* renamed from: dr.h */
public final class C19008h implements C20000q {

    /* renamed from: b */
    public final C20009t f42358b;

    public C19008h(C20009t tVar) {
        C19383o.m32797g(tVar, "client");
        this.f42358b = tVar;
    }

    /* renamed from: c */
    public static int m32161c(C20018z zVar, int i) {
        String b = C20018z.m34284b(zVar, "Retry-After");
        if (b == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(b)) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Integer valueOf = Integer.valueOf(b);
        C19383o.m32796f(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r12.f44127b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C20011u mo70459a(okhttp3.C20018z r11, okhttp3.internal.connection.C19967c r12) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            if (r12 == 0) goto L_0x000a
            okhttp3.internal.connection.g r1 = r12.f44127b
            if (r1 == 0) goto L_0x000a
            okhttp3.c0 r1 = r1.f44192q
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            int r2 = r11.f44365f
            okhttp3.u r3 = r11.f44362c
            java.lang.String r3 = r3.f44343c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00b3
            if (r2 == r5) goto L_0x00b3
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00aa
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0081
            r12 = 503(0x1f7, float:7.05E-43)
            if (r2 == r12) goto L_0x006b
            r12 = 407(0x197, float:5.7E-43)
            if (r2 == r12) goto L_0x004d
            r12 = 408(0x198, float:5.72E-43)
            if (r2 == r12) goto L_0x0033
            switch(r2) {
                case 300: goto L_0x00b3;
                case 301: goto L_0x00b3;
                case 302: goto L_0x00b3;
                case 303: goto L_0x00b3;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r0
        L_0x0033:
            okhttp3.t r1 = r10.f42358b
            boolean r1 = r1.f44291g
            if (r1 != 0) goto L_0x003a
            return r0
        L_0x003a:
            okhttp3.z r1 = r11.f44371l
            if (r1 == 0) goto L_0x0043
            int r1 = r1.f44365f
            if (r1 != r12) goto L_0x0043
            return r0
        L_0x0043:
            int r12 = m32161c(r11, r4)
            if (r12 <= 0) goto L_0x004a
            return r0
        L_0x004a:
            okhttp3.u r11 = r11.f44362c
            return r11
        L_0x004d:
            kotlin.jvm.internal.C19383o.m32794d(r1)
            java.net.Proxy r12 = r1.f43996b
            java.net.Proxy$Type r12 = r12.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r12 != r0) goto L_0x0063
            okhttp3.t r12 = r10.f42358b
            okhttp3.b r12 = r12.f44300p
            okhttp3.u r11 = r12.mo30010c(r1, r11)
            return r11
        L_0x0063:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r12 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r11.<init>(r12)
            throw r11
        L_0x006b:
            okhttp3.z r1 = r11.f44371l
            if (r1 == 0) goto L_0x0074
            int r1 = r1.f44365f
            if (r1 != r12) goto L_0x0074
            return r0
        L_0x0074:
            r12 = 2147483647(0x7fffffff, float:NaN)
            int r12 = m32161c(r11, r12)
            if (r12 != 0) goto L_0x0080
            okhttp3.u r11 = r11.f44362c
            return r11
        L_0x0080:
            return r0
        L_0x0081:
            if (r12 == 0) goto L_0x00a9
            okhttp3.internal.connection.d r1 = r12.f44130e
            okhttp3.a r1 = r1.f44150h
            okhttp3.p r1 = r1.f43948a
            java.lang.String r1 = r1.f44243e
            okhttp3.internal.connection.g r2 = r12.f44127b
            okhttp3.c0 r2 = r2.f44192q
            okhttp3.a r2 = r2.f43995a
            okhttp3.p r2 = r2.f43948a
            java.lang.String r2 = r2.f44243e
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            r1 = r1 ^ r7
            if (r1 != 0) goto L_0x009d
            goto L_0x00a9
        L_0x009d:
            okhttp3.internal.connection.g r12 = r12.f44127b
            monitor-enter(r12)
            r12.f44185j = r7     // Catch:{ all -> 0x00a6 }
            monitor-exit(r12)
            okhttp3.u r11 = r11.f44362c
            return r11
        L_0x00a6:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        L_0x00a9:
            return r0
        L_0x00aa:
            okhttp3.t r12 = r10.f42358b
            okhttp3.b r12 = r12.f44292h
            okhttp3.u r11 = r12.mo30010c(r1, r11)
            return r11
        L_0x00b3:
            okhttp3.t r12 = r10.f42358b
            boolean r12 = r12.f44293i
            if (r12 != 0) goto L_0x00bb
            goto L_0x015a
        L_0x00bb:
            java.lang.String r12 = "Location"
            java.lang.String r12 = okhttp3.C20018z.m34284b(r11, r12)
            if (r12 == 0) goto L_0x015a
            okhttp3.u r1 = r11.f44362c
            okhttp3.p r1 = r1.f44342b
            r1.getClass()
            okhttp3.p$a r2 = new okhttp3.p$a     // Catch:{ IllegalArgumentException -> 0x00d3 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x00d3 }
            r2.mo72980f(r12, r1)     // Catch:{ IllegalArgumentException -> 0x00d3 }
            goto L_0x00d4
        L_0x00d3:
            r2 = r0
        L_0x00d4:
            if (r2 == 0) goto L_0x00db
            okhttp3.p r12 = r2.mo72978d()
            goto L_0x00dc
        L_0x00db:
            r12 = r0
        L_0x00dc:
            if (r12 == 0) goto L_0x015a
            java.lang.String r1 = r12.f44240b
            okhttp3.u r2 = r11.f44362c
            okhttp3.p r2 = r2.f44342b
            java.lang.String r2 = r2.f44240b
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r1 != 0) goto L_0x00f3
            okhttp3.t r1 = r10.f42358b
            boolean r1 = r1.f44294j
            if (r1 != 0) goto L_0x00f3
            goto L_0x015a
        L_0x00f3:
            okhttp3.u r1 = r11.f44362c
            r1.getClass()
            okhttp3.u$a r2 = new okhttp3.u$a
            r2.<init>(r1)
            boolean r1 = androidx.compose.p015ui.text.input.C1993m.m4361V(r3)
            if (r1 == 0) goto L_0x0143
            int r1 = r11.f44365f
            java.lang.String r8 = "PROPFIND"
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r3, r8)
            if (r9 != 0) goto L_0x0111
            if (r1 == r5) goto L_0x0111
            if (r1 != r6) goto L_0x0112
        L_0x0111:
            r4 = r7
        L_0x0112:
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r3, r8)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0123
            if (r1 == r5) goto L_0x0123
            if (r1 == r6) goto L_0x0123
            java.lang.String r1 = "GET"
            r2.mo73001d(r1, r0)
            goto L_0x012c
        L_0x0123:
            if (r4 == 0) goto L_0x0129
            okhttp3.u r0 = r11.f44362c
            okhttp3.y r0 = r0.f44345e
        L_0x0129:
            r2.mo73001d(r3, r0)
        L_0x012c:
            if (r4 != 0) goto L_0x0143
            java.lang.String r0 = "Transfer-Encoding"
            okhttp3.o$a r1 = r2.f44349c
            r1.mo72963f(r0)
            java.lang.String r0 = "Content-Length"
            okhttp3.o$a r1 = r2.f44349c
            r1.mo72963f(r0)
            java.lang.String r0 = "Content-Type"
            okhttp3.o$a r1 = r2.f44349c
            r1.mo72963f(r0)
        L_0x0143:
            okhttp3.u r11 = r11.f44362c
            okhttp3.p r11 = r11.f44342b
            boolean r11 = p735br.C18980c.m32097a(r11, r12)
            if (r11 != 0) goto L_0x0154
            java.lang.String r11 = "Authorization"
            okhttp3.o$a r0 = r2.f44349c
            r0.mo72963f(r11)
        L_0x0154:
            r2.f44347a = r12
            okhttp3.u r0 = r2.mo72999b()
        L_0x015a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p739dr.C19008h.mo70459a(okhttp3.z, okhttp3.internal.connection.c):okhttp3.u");
    }

    /* renamed from: b */
    public final boolean mo70460b(IOException iOException, C19971e eVar, C20011u uVar, boolean z) {
        boolean z2;
        C19980k kVar;
        C19976g gVar;
        if (!this.f42358b.f44291g) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        C19970d dVar = eVar.f44158g;
        C19383o.m32794d(dVar);
        int i = dVar.f44145c;
        if (i == 0 && dVar.f44146d == 0 && dVar.f44147e == 0) {
            z2 = false;
        } else {
            if (dVar.f44148f == null) {
                C19940c0 c0Var = null;
                if (i <= 1 && dVar.f44146d <= 1 && dVar.f44147e <= 0 && (gVar = dVar.f44151i.f44159h) != null) {
                    synchronized (gVar) {
                        if (gVar.f44186k == 0) {
                            if (C18980c.m32097a(gVar.f44192q.f43995a.f43948a, dVar.f44150h.f43948a)) {
                                c0Var = gVar.f44192q;
                            }
                        }
                    }
                }
                if (c0Var != null) {
                    dVar.f44148f = c0Var;
                } else {
                    C19980k.C19981a aVar = dVar.f44143a;
                    if ((aVar == null || !aVar.mo72936a()) && (kVar = dVar.f44144b) != null) {
                        z2 = kVar.mo72935a();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final C20018z intercept(C20000q.C20001a aVar) throws IOException {
        C20018z zVar;
        int i;
        List list;
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        C19006f fVar = (C19006f) aVar;
        C20011u uVar = fVar.f42351f;
        C19971e eVar = fVar.f42347b;
        boolean z = true;
        List list2 = EmptyList.INSTANCE;
        C20018z zVar2 = null;
        int i2 = 0;
        C20011u uVar2 = uVar;
        boolean z2 = true;
        while (true) {
            eVar.getClass();
            C19383o.m32797g(uVar2, LoginFragment.EXTRA_REQUEST);
            if (eVar.f44161j == null ? z : false) {
                synchronized (eVar) {
                    if (!(eVar.f44163l ^ z)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    } else if (eVar.f44162k ^ z) {
                        C19394m mVar = C19394m.f43287a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                if (z2) {
                    C19978i iVar = eVar.f44153b;
                    C19997p pVar = uVar2.f44342b;
                    if (pVar.f44239a) {
                        C20009t tVar = eVar.f44168q;
                        SSLSocketFactory sSLSocketFactory2 = tVar.f44302r;
                        if (sSLSocketFactory2 != null) {
                            HostnameVerifier hostnameVerifier2 = tVar.f44306v;
                            certificatePinner = tVar.f44307w;
                            sSLSocketFactory = sSLSocketFactory2;
                            hostnameVerifier = hostnameVerifier2;
                        } else {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        certificatePinner = null;
                    }
                    String str = pVar.f44243e;
                    int i3 = pVar.f44244f;
                    C20009t tVar2 = eVar.f44168q;
                    list = list2;
                    i = i2;
                    zVar = zVar2;
                    C19927a aVar2 = r12;
                    C19927a aVar3 = new C19927a(str, i3, tVar2.f44297m, tVar2.f44301q, sSLSocketFactory, hostnameVerifier, certificatePinner, tVar2.f44300p, tVar2.f44298n, tVar2.f44305u, tVar2.f44304t, tVar2.f44299o);
                    eVar.f44158g = new C19970d(iVar, aVar2, eVar, eVar.f44154c);
                } else {
                    list = list2;
                    zVar = zVar2;
                    i = i2;
                }
                try {
                    if (!eVar.f44165n) {
                        C20018z a = fVar.mo70453a(uVar2);
                        if (zVar != null) {
                            C20018z.C20019a aVar4 = new C20018z.C20019a(a);
                            C20018z.C20019a aVar5 = new C20018z.C20019a(zVar);
                            aVar5.f44381g = null;
                            C20018z a2 = aVar5.mo73008a();
                            if (a2.f44368i == null) {
                                aVar4.f44384j = a2;
                                a = aVar4.mo73008a();
                            } else {
                                throw new IllegalArgumentException("priorResponse.body != null".toString());
                            }
                        }
                        zVar2 = a;
                        C19967c cVar = eVar.f44161j;
                        uVar2 = mo70459a(zVar2, cVar);
                        if (uVar2 == null) {
                            if (cVar != null && cVar.f44126a) {
                                if (!eVar.f44160i) {
                                    eVar.f44160i = true;
                                    eVar.f44155d.mo72695i();
                                } else {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            eVar.mo72917d(false);
                            return zVar2;
                        }
                        C19928a0 a0Var = zVar2.f44368i;
                        if (a0Var != null) {
                            C18980c.m32099c(a0Var);
                        }
                        i2 = i + 1;
                        if (i2 <= 20) {
                            eVar.mo72917d(true);
                            list2 = list;
                            z2 = true;
                            z = true;
                        } else {
                            throw new ProtocolException("Too many follow-up requests: " + i2);
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (RouteException e) {
                    List list3 = list;
                    C20018z zVar3 = zVar;
                    RouteException routeException = e;
                    if (mo70460b(routeException.getLastConnectException(), eVar, uVar2, false)) {
                        list2 = C19327t.m32651g1(list3, routeException.getFirstConnectException());
                        z = true;
                        eVar.mo72917d(true);
                        z2 = false;
                        i2 = i;
                        zVar2 = zVar3;
                    } else {
                        IOException firstConnectException = routeException.getFirstConnectException();
                        C18980c.m32121y(firstConnectException, list3);
                        throw firstConnectException;
                    }
                } catch (IOException e2) {
                    C20018z zVar4 = zVar;
                    IOException iOException = e2;
                    if (mo70460b(iOException, eVar, uVar2, !(iOException instanceof ConnectionShutdownException))) {
                        list2 = C19327t.m32651g1(list, iOException);
                        z = true;
                        eVar.mo72917d(true);
                        zVar2 = zVar4;
                        i2 = i;
                        z2 = false;
                    } else {
                        C18980c.m32121y(iOException, list);
                        throw iOException;
                    }
                } catch (Throwable th) {
                    th = th;
                    eVar.mo72917d(true);
                    throw th;
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }
}
