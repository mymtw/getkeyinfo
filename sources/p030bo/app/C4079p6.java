package p030bo.app;

import com.braze.support.BrazeLogger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.p6 */
public final class C4079p6 {

    /* renamed from: a */
    public static final C4079p6 f9086a = new C4079p6();

    /* renamed from: b */
    private static C4140r5 f9087b;

    /* renamed from: bo.app.p6$a */
    public static final class C4080a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4080a f9088b = new C4080a();

        public C4080a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception initializing static TLS socket factory.";
        }
    }

    /* renamed from: bo.app.p6$b */
    public static final class C4081b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4081b f9089b = new C4081b();

        public C4081b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception setting TLS socket factory on url connection.";
        }
    }

    static {
        try {
            f9087b = new C4140r5();
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f9086a, BrazeLogger.Priority.E, e, C4080a.f9088b, 4);
        }
    }

    private C4079p6() {
    }

    /* renamed from: a */
    public final HttpURLConnection mo13882a(URL url) {
        C19383o.m32797g(url, "url");
        URLConnection openConnection = url.openConnection();
        if (C19383o.m32792b(url.getProtocol(), "https")) {
            if (openConnection != null) {
                try {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    C4140r5 r5Var = f9087b;
                    if (r5Var != null) {
                        httpsURLConnection.setSSLSocketFactory(r5Var);
                    } else {
                        C19383o.m32805o("socketFactory");
                        throw null;
                    }
                } catch (Exception e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4081b.f9089b, 4);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            }
        }
        if (openConnection != null) {
            return (HttpURLConnection) openConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }
}
