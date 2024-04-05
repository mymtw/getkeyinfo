package p747hr;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import p747hr.C19084h;

/* renamed from: hr.f */
public final class C19080f extends C19084h {

    /* renamed from: d */
    public static final boolean f42588d;

    /* renamed from: e */
    public static final C19081a f42589e = new C19081a();

    /* renamed from: hr.f$a */
    public static final class C19081a {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0.intValue() >= 9) goto L_0x002d;
     */
    static {
        /*
            hr.f$a r0 = new hr.f$a
            r0.<init>()
            f42589e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r0 = kotlin.text.C19456j.m33016T0(r0)
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            r1 = r2
            goto L_0x002d
        L_0x0024:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0022 }
            r0.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0022 }
        L_0x002d:
            f42588d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p747hr.C19080f.<clinit>():void");
    }

    /* renamed from: d */
    public final void mo70557d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        C19383o.m32797g(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        C19084h.f42595c.getClass();
        ArrayList a = C19084h.C19085a.m32358a(list);
        C19383o.m32796f(sSLParameters, "sslParameters");
        Object[] array = a.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: f */
    public final String mo70558f(SSLSocket sSLSocket) {
        try {
            String c = sSLSocket.getApplicationProtocol();
            if (c != null) {
                if (c.hashCode() != 0) {
                    return c;
                }
                if (c.equals("")) {
                    return null;
                }
                return c;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
