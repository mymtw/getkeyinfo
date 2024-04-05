package com.google.common.util.concurrent;

import com.google.common.base.C15784e;
import com.google.common.collect.Ordering;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: com.google.common.util.concurrent.i */
public final class C16382i {

    /* renamed from: a */
    public static final Ordering<Constructor<?>> f36495a = Ordering.natural().onResultOf(new C16383a()).reverse();

    /* renamed from: com.google.common.util.concurrent.i$a */
    public static class C16383a implements C15784e<Constructor<?>, Boolean> {
        public final Object apply(Object obj) {
            return Boolean.valueOf(Arrays.asList(((Constructor) obj).getParameterTypes()).contains(String.class));
        }
    }

    /* renamed from: a */
    public static void m26509a(Class cls, Exception exc) {
        Object obj;
        for (E e : f36495a.sortedCopy(Arrays.asList(cls.getConstructors()))) {
            Class[] parameterTypes = e.getParameterTypes();
            Object[] objArr = new Object[parameterTypes.length];
            int i = 0;
            while (true) {
                obj = null;
                if (i < parameterTypes.length) {
                    Class cls2 = parameterTypes[i];
                    if (!cls2.equals(String.class)) {
                        if (!cls2.equals(Throwable.class)) {
                            break;
                        }
                        objArr[i] = exc;
                    } else {
                        objArr[i] = exc.toString();
                    }
                    i++;
                } else {
                    try {
                        obj = e.newInstance(objArr);
                        break;
                    } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
                    }
                }
            }
            Exception exc2 = (Exception) obj;
            if (exc2 != null) {
                if (exc2.getCause() == null) {
                    exc2.initCause(exc);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", exc);
    }
}
