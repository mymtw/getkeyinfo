package p749ir;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import p747hr.C19084h;

@SuppressLint({"NewApi"})
/* renamed from: ir.a */
public final class C19262a implements C19276k {

    /* renamed from: a */
    public static final C19263a f43126a = new C19263a();

    /* renamed from: ir.a$a */
    public static final class C19263a {
    }

    /* renamed from: a */
    public final boolean mo71423a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public final String mo71424b(SSLSocket sSLSocket) {
        String c = sSLSocket.getApplicationProtocol();
        if (c != null && (c.hashCode() != 0 || !c.equals(""))) {
            return c;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public final void mo71425c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C19383o.m32797g(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C19383o.m32796f(sSLParameters, "sslParameters");
            C19084h.f42595c.getClass();
            Object[] array = C19084h.C19085a.m32358a(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    public final boolean isSupported() {
        f43126a.getClass();
        C19084h.f42595c.getClass();
        return C19084h.C19085a.m32360c() && Build.VERSION.SDK_INT >= 29;
    }
}
