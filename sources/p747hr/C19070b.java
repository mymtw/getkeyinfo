package p747hr;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import p747hr.C19084h;
import p749ir.C19264b;
import p749ir.C19268f;
import p749ir.C19269g;
import p749ir.C19271h;
import p749ir.C19272i;
import p749ir.C19274j;
import p749ir.C19276k;
import p749ir.C19277l;
import p754kr.C19869a;
import p754kr.C19871c;
import p754kr.C19873e;

/* renamed from: hr.b */
public final class C19070b extends C19084h {

    /* renamed from: f */
    public static final boolean f42567f = (C19084h.C19085a.m32360c() && Build.VERSION.SDK_INT < 30);

    /* renamed from: g */
    public static final C19071a f42568g = new C19071a();

    /* renamed from: d */
    public final ArrayList f42569d;

    /* renamed from: e */
    public final C19271h f42570e;

    /* renamed from: hr.b$a */
    public static final class C19071a {
    }

    /* renamed from: hr.b$b */
    public static final class C19072b implements C19873e {

        /* renamed from: a */
        public final X509TrustManager f42571a;

        /* renamed from: b */
        public final Method f42572b;

        public C19072b(X509TrustManager x509TrustManager, Method method) {
            this.f42571a = x509TrustManager;
            this.f42572b = method;
        }

        /* renamed from: a */
        public final X509Certificate mo70564a(X509Certificate x509Certificate) {
            try {
                Object invoke = this.f42572b.invoke(this.f42571a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19072b)) {
                return false;
            }
            C19072b bVar = (C19072b) obj;
            return C19383o.m32792b(this.f42571a, bVar.f42571a) && C19383o.m32792b(this.f42572b, bVar.f42572b);
        }

        public final int hashCode() {
            X509TrustManager x509TrustManager = this.f42571a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f42572b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CustomTrustRootIndex(trustManager=");
            h.append(this.f42571a);
            h.append(", findByIssuerAndSignatureMethod=");
            h.append(this.f42572b);
            h.append(")");
            return h.toString();
        }
    }

    static {
        C19084h.f42595c.getClass();
    }

    public C19070b() {
        C19277l lVar;
        Method method;
        Method method2;
        C19276k[] kVarArr = new C19276k[4];
        Method method3 = null;
        try {
            lVar = new C19277l(Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl"), Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl"), Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
        } catch (Exception e) {
            C19084h.f42595c.getClass();
            C19084h.f42593a.getClass();
            C19084h.m32344i(5, "unable to load android socket classes", e);
            lVar = null;
        }
        kVarArr[0] = lVar;
        kVarArr[1] = new C19274j(C19268f.f43133f);
        kVarArr[2] = new C19274j(C19272i.f43143a);
        kVarArr[3] = new C19274j(C19269g.f43139a);
        ArrayList c1 = C19318k.m32611c1(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = c1.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C19276k) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.f42569d = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method = cls.getMethod("open", new Class[]{String.class});
            method2 = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f42570e = new C19271h(method3, method, method2);
    }

    /* renamed from: b */
    public final C19871c mo70556b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        C19264b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new C19264b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar != null ? bVar : new C19869a(mo70560c(x509TrustManager));
    }

    /* renamed from: c */
    public final C19873e mo70560c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            C19383o.m32796f(declaredMethod, ResponseConstants.METHOD);
            declaredMethod.setAccessible(true);
            return new C19072b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo70560c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public final void mo70557d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Object obj;
        C19383o.m32797g(list, "protocols");
        Iterator it = this.f42569d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C19276k) obj).mo71423a(sSLSocket)) {
                break;
            }
        }
        C19276k kVar = (C19276k) obj;
        if (kVar != null) {
            kVar.mo71425c(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public final void mo70561e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        C19383o.m32797g(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* renamed from: f */
    public final String mo70558f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f42569d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C19276k) obj).mo71423a(sSLSocket)) {
                break;
            }
        }
        C19276k kVar = (C19276k) obj;
        if (kVar != null) {
            return kVar.mo71424b(sSLSocket);
        }
        return null;
    }

    /* renamed from: g */
    public final Object mo70562g() {
        C19271h hVar = this.f42570e;
        hVar.getClass();
        Method method = hVar.f43140a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = hVar.f43141b;
            C19383o.m32794d(method2);
            method2.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public final boolean mo70559h(String str) {
        C19383o.m32797g(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    /* renamed from: k */
    public final void mo70563k(Object obj, String str) {
        C19383o.m32797g(str, "message");
        C19271h hVar = this.f42570e;
        hVar.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                Method method = hVar.f43142c;
                C19383o.m32794d(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            C19084h.m32345j(this, str, 5, 4);
        }
    }
}
