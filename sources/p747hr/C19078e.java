package p747hr;

import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C19383o;
import okhttp3.Protocol;
import p747hr.C19084h;

/* renamed from: hr.e */
public final class C19078e extends C19084h {

    /* renamed from: d */
    public final Method f42580d;

    /* renamed from: e */
    public final Method f42581e;

    /* renamed from: f */
    public final Method f42582f;

    /* renamed from: g */
    public final Class<?> f42583g;

    /* renamed from: h */
    public final Class<?> f42584h;

    /* renamed from: hr.e$a */
    public static final class C19079a implements InvocationHandler {

        /* renamed from: a */
        public boolean f42585a;

        /* renamed from: b */
        public String f42586b;

        /* renamed from: c */
        public final List<String> f42587c;

        public C19079a(ArrayList arrayList) {
            this.f42587c = arrayList;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            C19383o.m32797g(obj, "proxy");
            C19383o.m32797g(method, ResponseConstants.METHOD);
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C19383o.m32792b(name, "supports") && C19383o.m32792b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!C19383o.m32792b(name, "unsupported") || !C19383o.m32792b(Void.TYPE, returnType)) {
                if (C19383o.m32792b(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.f42587c;
                    }
                }
                if ((C19383o.m32792b(name, "selectProtocol") || C19383o.m32792b(name, "select")) && C19383o.m32792b(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 != null) {
                            List list = (List) obj2;
                            int size = list.size();
                            if (size >= 0) {
                                int i = 0;
                                while (true) {
                                    Object obj3 = list.get(i);
                                    if (obj3 != null) {
                                        String str = (String) obj3;
                                        if (!this.f42587c.contains(str)) {
                                            if (i == size) {
                                                break;
                                            }
                                            i++;
                                        } else {
                                            this.f42586b = str;
                                            return str;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                }
                            }
                            String str2 = this.f42587c.get(0);
                            this.f42586b = str2;
                            return str2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((!C19383o.m32792b(name, "protocolSelected") && !C19383o.m32792b(name, ResponseConstants.SELECTED)) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.f42586b = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f42585a = true;
            return null;
        }
    }

    public C19078e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f42580d = method;
        this.f42581e = method2;
        this.f42582f = method3;
        this.f42583g = cls;
        this.f42584h = cls2;
    }

    /* renamed from: a */
    public final void mo70571a(SSLSocket sSLSocket) {
        try {
            this.f42582f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    /* renamed from: d */
    public final void mo70557d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C19383o.m32797g(list, "protocols");
        C19084h.f42595c.getClass();
        ArrayList a = C19084h.C19085a.m32358a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C19084h.class.getClassLoader(), new Class[]{this.f42583g, this.f42584h}, new C19079a(a));
            this.f42580d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    /* renamed from: f */
    public final String mo70558f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f42581e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                C19079a aVar = (C19079a) invocationHandler;
                boolean z = aVar.f42585a;
                if (!z && aVar.f42586b == null) {
                    C19084h.m32345j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return aVar.f42586b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
