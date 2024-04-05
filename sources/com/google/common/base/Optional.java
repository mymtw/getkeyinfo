package com.google.common.base;

import com.google.common.base.AbstractIterator;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.base.Optional$a */
    public static class C15768a implements Iterable<T> {

        /* renamed from: b */
        public final /* synthetic */ Iterable f35551b;

        /* renamed from: com.google.common.base.Optional$a$a */
        public class C15769a extends AbstractIterator<T> {

            /* renamed from: d */
            public final Iterator<? extends Optional<? extends T>> f35552d;

            public C15769a(C15768a aVar) {
                Iterator<? extends Optional<? extends T>> it = aVar.f35551b.iterator();
                it.getClass();
                this.f35552d = it;
            }

            /* renamed from: a */
            public final T mo55654a() {
                while (this.f35552d.hasNext()) {
                    Optional optional = (Optional) this.f35552d.next();
                    if (optional.isPresent()) {
                        return optional.get();
                    }
                }
                this.f35540b = AbstractIterator.State.DONE;
                return null;
            }
        }

        public C15768a(Iterable iterable) {
            this.f35551b = iterable;
        }

        public final Iterator<T> iterator() {
            return new C15769a(this);
        }
    }

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(@NullableDecl T t) {
        return t == null ? absent() : new Present(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m25577of(T t) {
        t.getClass();
        return new Present(t);
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        iterable.getClass();
        return new C15768a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo55648or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo55649or(C15804s<? extends T> sVar);

    /* renamed from: or */
    public abstract T mo55650or(T t);

    @NullableDecl
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(C15784e<? super T, V> eVar);
}
