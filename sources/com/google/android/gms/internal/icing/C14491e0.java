package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.C14479b0;
import com.google.android.gms.internal.icing.C14491e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.icing.e0 */
public abstract class C14491e0<MessageType extends C14491e0<MessageType, BuilderType>, BuilderType extends C14479b0<MessageType, BuilderType>> extends C14506i<MessageType, BuilderType> {
    private static final Map<Object, C14491e0<?, ?>> zzb = new ConcurrentHashMap();
    public C14564y1 zzc = C14564y1.f32724d;
    public int zzd = -1;

    /* renamed from: f */
    public static <T extends C14491e0> T m22949f(Class<T> cls) {
        Map<Object, C14491e0<?, ?>> map = zzb;
        T t = (C14491e0) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C14491e0) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C14491e0) ((C14491e0) C14505h2.m23031e(cls)).mo49756e(6);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: g */
    public static <T extends C14491e0> void m22950g(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: h */
    public static Object m22951h(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    public final int mo49757a() {
        return this.zzd;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14491e0 mo49737b() {
        return (C14491e0) mo49756e(6);
    }

    /* renamed from: c */
    public final int mo49741c() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int c = C14512j1.f32651c.mo49820a(getClass()).mo49764c(this);
        this.zzd = c;
        return c;
    }

    /* renamed from: d */
    public final void mo49758d(int i) {
        this.zzd = i;
    }

    /* renamed from: e */
    public abstract Object mo49756e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C14512j1.f32651c.mo49820a(getClass()).mo49768g(this, (C14491e0) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int b = C14512j1.f32651c.mo49820a(getClass()).mo49763b(this);
        this.zza = b;
        return b;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C14488d1.m22943b(this, sb, 0);
        return sb.toString();
    }

    public final C14479b0 zzy() {
        C14479b0 b0Var = (C14479b0) mo49756e(5);
        if (b0Var.f32618d) {
            b0Var.mo49739d();
            b0Var.f32618d = false;
        }
        C14479b0.m22934a(b0Var.f32617c, this);
        return b0Var;
    }
}
