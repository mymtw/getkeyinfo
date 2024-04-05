package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C14782q5;
import com.google.android.gms.internal.measurement.C14819t5;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.t5 */
public abstract class C14819t5<MessageType extends C14819t5<MessageType, BuilderType>, BuilderType extends C14782q5<MessageType, BuilderType>> extends C14818t4<MessageType, BuilderType> {
    private static final Map<Object, C14819t5<?, ?>> zza = new ConcurrentHashMap();
    public C14758o7 zzc = C14758o7.f33020f;
    public int zzd = -1;

    /* renamed from: j */
    public static <E> C14891z5<E> m23957j(C14891z5<E> z5Var) {
        int size = z5Var.size();
        return z5Var.mo50356b(size == 0 ? 10 : size + size);
    }

    /* renamed from: k */
    public static Object m23958k(Object obj, Method method, Object... objArr) {
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

    /* renamed from: l */
    public static <T extends C14819t5> void m23959l(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    /* renamed from: o */
    public static <T extends C14819t5> T m23960o(Class<T> cls) {
        Map<Object, C14819t5<?, ?>> map = zza;
        T t = (C14819t5) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C14819t5) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C14819t5) ((C14819t5) C14869x7.m24151i(cls)).mo50282q(6);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: p */
    public static C14666h6 m23961p(C14879y5 y5Var) {
        C14666h6 h6Var = (C14666h6) y5Var;
        int i = h6Var.f32868d;
        int i2 = i == 0 ? 10 : i + i;
        if (i2 >= i) {
            return new C14666h6(Arrays.copyOf(h6Var.f32867c, i2), h6Var.f32868d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final /* synthetic */ C14819t5 mo50805b() {
        return (C14819t5) mo50282q(6);
    }

    /* renamed from: c */
    public final int mo50826c() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int d = C14892z6.f33192c.mo51009a(getClass()).mo50438d(this);
        this.zzd = d;
        return d;
    }

    /* renamed from: d */
    public final /* synthetic */ C14782q5 mo50827d() {
        C14782q5 q5Var = (C14782q5) mo50282q(5);
        q5Var.mo50811l(this);
        return q5Var;
    }

    /* renamed from: e */
    public final int mo50866e() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C14892z6.f33192c.mo51009a(getClass()).mo50440f(this, (C14819t5) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ C14782q5 mo50828f() {
        return (C14782q5) mo50282q(5);
    }

    /* renamed from: h */
    public final void mo50867h(int i) {
        this.zzd = i;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int b = C14892z6.f33192c.mo51009a(getClass()).mo50436b(this);
        this.zzb = b;
        return b;
    }

    /* renamed from: m */
    public final <MessageType extends C14819t5<MessageType, BuilderType>, BuilderType extends C14782q5<MessageType, BuilderType>> BuilderType mo50871m() {
        return (C14782q5) mo50282q(5);
    }

    /* renamed from: n */
    public final BuilderType mo50872n() {
        BuilderType buildertype = (C14782q5) mo50282q(5);
        buildertype.mo50811l(this);
        return buildertype;
    }

    /* renamed from: q */
    public abstract Object mo50282q(int i);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C14820t6.m23973c(this, sb, 0);
        return sb.toString();
    }
}
