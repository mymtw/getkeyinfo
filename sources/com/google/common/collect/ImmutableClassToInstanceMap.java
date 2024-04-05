package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.C16299a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable(containerOf = {"B"})
public final class ImmutableClassToInstanceMap<B> extends C16240y<Class<? extends B>, B> implements Serializable {

    /* renamed from: b */
    public static final ImmutableClassToInstanceMap<Object> f35896b = new ImmutableClassToInstanceMap<>(ImmutableMap.m25853of());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    /* renamed from: com.google.common.collect.ImmutableClassToInstanceMap$b */
    public static final class C15948b<B> {
        public C15948b() {
            ImmutableMap.builder();
        }
    }

    public static <B> C15948b<B> builder() {
        return new C15948b<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof ImmutableClassToInstanceMap) {
            return (ImmutableClassToInstanceMap) map;
        }
        ImmutableMap.C15958b builder = ImmutableMap.builder();
        for (Map.Entry next : map.entrySet()) {
            Class cls = (Class) next.getKey();
            builder.mo56613b(cls, C16299a.m26394a(cls).cast(next.getValue()));
        }
        ImmutableMap a = builder.mo56612a();
        return a.isEmpty() ? m25821of() : new ImmutableClassToInstanceMap<>(a);
    }

    /* renamed from: of */
    public static <B> ImmutableClassToInstanceMap<B> m25821of() {
        return f35896b;
    }

    @NullableDecl
    public <T extends B> T getInstance(Class<T> cls) {
        ImmutableMap immutableMap = this.delegate;
        cls.getClass();
        return immutableMap.get(cls);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    public Object readResolve() {
        return isEmpty() ? m25821of() : this;
    }

    public ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    /* renamed from: of */
    public static <B, T extends B> ImmutableClassToInstanceMap<B> m25822of(Class<T> cls, T t) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.m25854of(cls, t));
    }

    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }
}
