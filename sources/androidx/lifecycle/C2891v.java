package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.v */
public final class C2891v {

    /* renamed from: a */
    public static HashMap f6526a = new HashMap();

    /* renamed from: b */
    public static HashMap f6527b = new HashMap();

    /* renamed from: a */
    public static C2879m m6819a(Constructor<? extends C2879m> constructor, Object obj) {
        try {
            return (C2879m) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static String m6820b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: c */
    public static int m6821c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z;
        Class<C2886r> cls2 = C2886r.class;
        Integer num = (Integer) f6526a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b = m6820b(canonicalName);
                if (!name.isEmpty()) {
                    b = name + "." + b;
                }
                constructor = Class.forName(b).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                f6527b.put(cls, Collections.singletonList(constructor));
            } else {
                C2846c cVar = C2846c.f6460c;
                Boolean bool = (Boolean) cVar.f6462b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                cVar.f6462b.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((C2845b0) declaredMethods[i2].getAnnotation(C2845b0.class)) != null) {
                                cVar.mo10801a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        if (m6821c(superclass) != 1) {
                            arrayList = new ArrayList((Collection) f6527b.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class cls3 = interfaces[i3];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                if (m6821c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) f6527b.get(cls3));
                            }
                            i3++;
                        } else if (arrayList != null) {
                            f6527b.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        f6526a.put(cls, Integer.valueOf(i));
        return i;
    }
}
