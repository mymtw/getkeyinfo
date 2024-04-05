package p749ir;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p747hr.C19073c;
import p747hr.C19084h;
import p749ir.C19274j;

/* renamed from: ir.g */
public final class C19269g implements C19276k {

    /* renamed from: a */
    public static final C19270a f43139a = new C19270a();

    /* renamed from: ir.g$a */
    public static final class C19270a implements C19274j.C19275a {
        /* renamed from: a */
        public final boolean mo71433a(SSLSocket sSLSocket) {
            C19073c.f42574f.getClass();
            return C19073c.f42573e && (sSLSocket instanceof BCSSLSocket);
        }

        /* renamed from: b */
        public final C19276k mo71434b(SSLSocket sSLSocket) {
            return new C19269g();
        }
    }

    /* renamed from: a */
    public final boolean mo71423a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    /* renamed from: b */
    public final String mo71424b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo71425c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C19383o.m32797g(list, "protocols");
        if (mo71423a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C19383o.m32796f(parameters, "sslParameters");
            C19084h.f42595c.getClass();
            Object[] array = C19084h.C19085a.m32358a(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public final boolean isSupported() {
        C19073c.f42574f.getClass();
        return C19073c.f42573e;
    }
}
