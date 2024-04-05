package com.google.common.primitives;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.common.primitives.a */
public final class C16299a {

    /* renamed from: a */
    public static final Map<Class<?>, Class<?>> f36403a;

    /* renamed from: b */
    public static final Map<Class<?>, Class<?>> f36404b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        Class cls = Boolean.TYPE;
        Class<Boolean> cls2 = Boolean.class;
        linkedHashMap.put(cls, cls2);
        linkedHashMap2.put(cls2, cls);
        Class cls3 = Byte.TYPE;
        Class<Byte> cls4 = Byte.class;
        linkedHashMap.put(cls3, cls4);
        linkedHashMap2.put(cls4, cls3);
        Class cls5 = Character.TYPE;
        Class<Character> cls6 = Character.class;
        linkedHashMap.put(cls5, cls6);
        linkedHashMap2.put(cls6, cls5);
        Class cls7 = Double.TYPE;
        Class<Double> cls8 = Double.class;
        linkedHashMap.put(cls7, cls8);
        linkedHashMap2.put(cls8, cls7);
        Class cls9 = Float.TYPE;
        Class<Float> cls10 = Float.class;
        linkedHashMap.put(cls9, cls10);
        linkedHashMap2.put(cls10, cls9);
        Class cls11 = Integer.TYPE;
        Class<Integer> cls12 = Integer.class;
        linkedHashMap.put(cls11, cls12);
        linkedHashMap2.put(cls12, cls11);
        Class cls13 = Long.TYPE;
        Class<Long> cls14 = Long.class;
        linkedHashMap.put(cls13, cls14);
        linkedHashMap2.put(cls14, cls13);
        Class cls15 = Short.TYPE;
        Class<Short> cls16 = Short.class;
        linkedHashMap.put(cls15, cls16);
        linkedHashMap2.put(cls16, cls15);
        Class cls17 = Void.TYPE;
        Class<Void> cls18 = Void.class;
        linkedHashMap.put(cls17, cls18);
        linkedHashMap2.put(cls18, cls17);
        f36403a = Collections.unmodifiableMap(linkedHashMap);
        f36404b = Collections.unmodifiableMap(linkedHashMap2);
    }

    /* renamed from: a */
    public static <T> Class<T> m26394a(Class<T> cls) {
        cls.getClass();
        Class<T> cls2 = f36403a.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
