package com.google.common.collect;

import com.google.common.primitives.C16299a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MutableClassToInstanceMap<B> extends C16240y<Class<? extends B>, B> implements Serializable {
    private final Map<Class<? extends B>, B> delegate;

    public static final class SerializedForm<B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Map<Class<? extends B>, B> backingMap;

        public SerializedForm(Map<Class<? extends B>, B> map) {
            this.backingMap = map;
        }

        public Object readResolve() {
            return MutableClassToInstanceMap.create(this.backingMap);
        }
    }

    /* renamed from: com.google.common.collect.MutableClassToInstanceMap$a */
    public static class C16068a extends C16243z<Class<? extends B>, B> {

        /* renamed from: b */
        public final /* synthetic */ Map.Entry f36102b;

        public C16068a(Map.Entry entry) {
            this.f36102b = entry;
        }

        public final Object delegate() {
            return this.f36102b;
        }

        /* renamed from: e */
        public final Map.Entry<Class<? extends B>, B> mo56041e() {
            return this.f36102b;
        }

        public final B setValue(B b) {
            return super.setValue(MutableClassToInstanceMap.access$000((Class) getKey(), b));
        }
    }

    /* renamed from: com.google.common.collect.MutableClassToInstanceMap$b */
    public class C16069b extends C16164e0<Map.Entry<Class<? extends B>, B>> {

        /* renamed from: com.google.common.collect.MutableClassToInstanceMap$b$a */
        public class C16070a extends C16155c2<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            public C16070a(Iterator it) {
                super(it);
            }

            /* renamed from: a */
            public final Object mo56891a(Object obj) {
                return MutableClassToInstanceMap.checkedEntry((Map.Entry) obj);
            }
        }

        public C16069b() {
        }

        public final Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new C16070a(delegate().iterator());
        }

        public final Object[] toArray() {
            return standardToArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }

        public final Set<Map.Entry<Class<? extends B>, B>> delegate() {
            return MutableClassToInstanceMap.this.delegate().entrySet();
        }
    }

    public MutableClassToInstanceMap(Map<Class<? extends B>, B> map) {
        map.getClass();
        this.delegate = map;
    }

    public static Object access$000(Class cls, Object obj) {
        return C16299a.m26394a(cls).cast(obj);
    }

    public static <B> Map.Entry<Class<? extends B>, B> checkedEntry(Map.Entry<Class<? extends B>, B> entry) {
        return new C16068a(entry);
    }

    public static <B> MutableClassToInstanceMap<B> create() {
        return new MutableClassToInstanceMap<>(new HashMap());
    }

    private Object writeReplace() {
        return new SerializedForm(delegate());
    }

    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new C16069b();
    }

    public <T extends B> T getInstance(Class<T> cls) {
        return C16299a.m26394a(cls).cast(get(cls));
    }

    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C16299a.m26394a((Class) entry.getKey()).cast(entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    @CanIgnoreReturnValue
    public <T extends B> T putInstance(Class<T> cls, T t) {
        return C16299a.m26394a(cls).cast(put(cls, t));
    }

    public static <B> MutableClassToInstanceMap<B> create(Map<Class<? extends B>, B> map) {
        return new MutableClassToInstanceMap<>(map);
    }

    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    @CanIgnoreReturnValue
    public B put(Class<? extends B> cls, B b) {
        return super.put(cls, C16299a.m26394a(cls).cast(b));
    }
}
