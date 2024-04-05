package p749ir;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.apache.commons.lang3.ClassUtils;
import p749ir.C19274j;

/* renamed from: ir.e */
public final class C19267e implements C19274j.C19275a {

    /* renamed from: a */
    public final /* synthetic */ String f43132a = "com.google.android.gms.org.conscrypt";

    /* renamed from: a */
    public final boolean mo71433a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return C19457k.m33025c1(name, this.f43132a + ClassUtils.PACKAGE_SEPARATOR_CHAR, false);
    }

    /* renamed from: b */
    public final C19276k mo71434b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!C19383o.m32792b(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C19268f(cls2);
    }
}
