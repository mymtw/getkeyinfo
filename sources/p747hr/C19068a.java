package p747hr;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import p747hr.C19084h;
import p749ir.C19262a;
import p749ir.C19264b;
import p749ir.C19268f;
import p749ir.C19269g;
import p749ir.C19272i;
import p749ir.C19274j;
import p749ir.C19276k;
import p754kr.C19869a;
import p754kr.C19871c;

/* renamed from: hr.a */
public final class C19068a extends C19084h {

    /* renamed from: e */
    public static final boolean f42564e = (C19084h.C19085a.m32360c() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: f */
    public static final C19069a f42565f = new C19069a();

    /* renamed from: d */
    public final ArrayList f42566d;

    /* renamed from: hr.a$a */
    public static final class C19069a {
    }

    static {
        C19084h.f42595c.getClass();
    }

    public C19068a() {
        C19276k[] kVarArr = new C19276k[4];
        C19262a.f43126a.getClass();
        C19084h.f42595c.getClass();
        kVarArr[0] = C19084h.C19085a.m32360c() && Build.VERSION.SDK_INT >= 29 ? new C19262a() : null;
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
        this.f42566d = arrayList;
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

    /* renamed from: d */
    public final void mo70557d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object obj;
        C19383o.m32797g(list, "protocols");
        Iterator it = this.f42566d.iterator();
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

    /* renamed from: f */
    public final String mo70558f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f42566d.iterator();
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

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public final boolean mo70559h(String str) {
        C19383o.m32797g(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
