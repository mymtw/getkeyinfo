package com.google.common.collect;

import com.google.common.collect.C16178h1;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.q1 */
public final class C16213q1 {

    /* renamed from: com.google.common.collect.q1$a */
    public static final class C16214a<T> {

        /* renamed from: a */
        public final Field f36314a;

        public C16214a(Field field) {
            this.f36314a = field;
            field.setAccessible(true);
        }

        /* renamed from: a */
        public final void mo57719a(T t, Object obj) {
            try {
                this.f36314a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: a */
    public static <T> C16214a<T> m26244a(Class<T> cls, String str) {
        try {
            return new C16214a<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static <K, V> void m26245b(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: c */
    public static <K, V> void m26246c(C16154c1<K, V> c1Var, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection<V> collection = c1Var.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: d */
    public static <E> void m26247d(C16178h1<E> h1Var, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            h1Var.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: e */
    public static <K, V> void m26248e(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* renamed from: f */
    public static <K, V> void m26249f(C16154c1<K, V> c1Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(c1Var.asMap().size());
        for (Map.Entry next : c1Var.asMap().entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeInt(((Collection) next.getValue()).size());
            for (Object writeObject : (Collection) next.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: g */
    public static <E> void m26250g(C16178h1<E> h1Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(h1Var.entrySet().size());
        for (C16178h1.C16179a next : h1Var.entrySet()) {
            objectOutputStream.writeObject(next.getElement());
            objectOutputStream.writeInt(next.getCount());
        }
    }
}
