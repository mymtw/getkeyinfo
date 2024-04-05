package p492yf;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p401mg.C13080a;

/* renamed from: yf.h */
public final class C13936h {

    /* renamed from: g */
    public static C13936h f30644g;

    /* renamed from: h */
    public static final AtomicBoolean f30645h = new AtomicBoolean(false);

    /* renamed from: i */
    public static final C13937a f30646i = new C13937a();

    /* renamed from: a */
    public final Class<?> f30647a;

    /* renamed from: b */
    public final Class<?> f30648b;

    /* renamed from: c */
    public final Method f30649c;

    /* renamed from: d */
    public final Method f30650d;

    /* renamed from: e */
    public final Method f30651e;

    /* renamed from: f */
    public final Method f30652f;

    /* renamed from: yf.h$a */
    public static final class C13937a {
    }

    public C13936h(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f30647a = cls;
        this.f30648b = cls2;
        this.f30649c = method;
        this.f30650d = method2;
        this.f30651e = method3;
        this.f30652f = method4;
    }

    /* renamed from: a */
    public final Object mo46760a(ArrayList arrayList) {
        Object c;
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            Object c2 = C13938i.m21466c(this.f30647a, (Object) null, this.f30649c, new Object[0]);
            if (c2 == null || (c = C13938i.m21466c(this.f30648b, c2, this.f30650d, "inapp")) == null) {
                return null;
            }
            Object c3 = C13938i.m21466c(this.f30648b, c, this.f30651e, arrayList);
            if (c3 == null) {
                return null;
            }
            return C13938i.m21466c(this.f30648b, c3, this.f30652f, new Object[0]);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }
}
