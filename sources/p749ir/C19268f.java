package p749ir;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import p747hr.C19070b;
import p747hr.C19084h;

/* renamed from: ir.f */
public class C19268f implements C19276k {

    /* renamed from: f */
    public static final C19267e f43133f = new C19267e();

    /* renamed from: a */
    public final Method f43134a;

    /* renamed from: b */
    public final Method f43135b;

    /* renamed from: c */
    public final Method f43136c;

    /* renamed from: d */
    public final Method f43137d;

    /* renamed from: e */
    public final Class<? super SSLSocket> f43138e;

    public C19268f(Class<? super SSLSocket> cls) {
        this.f43138e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        C19383o.m32796f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f43134a = declaredMethod;
        this.f43135b = cls.getMethod("setHostname", new Class[]{String.class});
        this.f43136c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f43137d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    /* renamed from: a */
    public final boolean mo71423a(SSLSocket sSLSocket) {
        return this.f43138e.isInstance(sSLSocket);
    }

    /* renamed from: b */
    public final String mo71424b(SSLSocket sSLSocket) {
        if (!this.f43138e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f43136c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            C19383o.m32796f(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e) {
            if (C19383o.m32792b(e.getMessage(), "ssl == null")) {
                return null;
            }
            throw e;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: c */
    public final void mo71425c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C19383o.m32797g(list, "protocols");
        if (this.f43138e.isInstance(sSLSocket)) {
            try {
                this.f43134a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f43135b.invoke(sSLSocket, new Object[]{str});
                }
                Method method = this.f43137d;
                C19084h.f42595c.getClass();
                method.invoke(sSLSocket, new Object[]{C19084h.C19085a.m32359b(list)});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public final boolean isSupported() {
        C19070b.f42568g.getClass();
        return C19070b.f42567f;
    }
}
