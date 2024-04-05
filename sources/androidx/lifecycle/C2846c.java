package androidx.lifecycle;

import android.support.p013v4.media.C0072d;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.c */
public final class C2846c {

    /* renamed from: c */
    public static C2846c f6460c = new C2846c();

    /* renamed from: a */
    public final HashMap f6461a = new HashMap();

    /* renamed from: b */
    public final HashMap f6462b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.c$a */
    public static class C2847a {

        /* renamed from: a */
        public final HashMap f6463a = new HashMap();

        /* renamed from: b */
        public final Map<C2848b, Lifecycle.Event> f6464b;

        public C2847a(HashMap hashMap) {
            this.f6464b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List list = (List) this.f6463a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f6463a.put(event, list);
                }
                list.add((C2848b) entry.getKey());
            }
        }

        /* renamed from: a */
        public static void m6790a(List<C2848b> list, C2887s sVar, Lifecycle.Event event, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C2848b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i = bVar.f6465a;
                        if (i == 0) {
                            bVar.f6466b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f6466b.invoke(obj, new Object[]{sVar});
                        } else if (i == 2) {
                            bVar.f6466b.invoke(obj, new Object[]{sVar, event});
                        }
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.c$b */
    public static final class C2848b {

        /* renamed from: a */
        public final int f6465a;

        /* renamed from: b */
        public final Method f6466b;

        public C2848b(int i, Method method) {
            this.f6465a = i;
            this.f6466b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2848b)) {
                return false;
            }
            C2848b bVar = (C2848b) obj;
            return this.f6465a == bVar.f6465a && this.f6466b.getName().equals(bVar.f6466b.getName());
        }

        public final int hashCode() {
            return this.f6466b.getName().hashCode() + (this.f6465a * 31);
        }
    }

    /* renamed from: c */
    public static void m6787c(HashMap hashMap, C2848b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) hashMap.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f6466b;
            StringBuilder h = C0072d.m201h("Method ");
            h.append(method.getName());
            h.append(" in ");
            h.append(cls.getName());
            h.append(" already declared with different @OnLifecycleEvent value: previous value ");
            h.append(event2);
            h.append(", new value ");
            h.append(event);
            throw new IllegalArgumentException(h.toString());
        } else if (event2 == null) {
            hashMap.put(bVar, event);
        }
    }

    /* renamed from: a */
    public final C2847a mo10801a(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(mo10802b(superclass).f6464b);
        }
        for (Class b : cls.getInterfaces()) {
            for (Map.Entry next : mo10802b(b).f6464b.entrySet()) {
                m6787c(hashMap, (C2848b) next.getKey(), (Lifecycle.Event) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            C2845b0 b0Var = (C2845b0) method.getAnnotation(C2845b0.class);
            if (b0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C2887s.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = b0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m6787c(hashMap, new C2848b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C2847a aVar = new C2847a(hashMap);
        this.f6461a.put(cls, aVar);
        this.f6462b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public final C2847a mo10802b(Class<?> cls) {
        C2847a aVar = (C2847a) this.f6461a.get(cls);
        return aVar != null ? aVar : mo10801a(cls, (Method[]) null);
    }
}
