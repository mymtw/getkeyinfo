package com.google.common.base;

import android.support.p013v4.media.C0071c;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {
        public static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements C15795m<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        @NullableDecl
        private final T target;

        public EquivalentToPredicate(Equivalence<T> equivalence2, @NullableDecl T t) {
            equivalence2.getClass();
            this.equivalence = equivalence2;
            this.target = t;
        }

        public boolean apply(@NullableDecl T t) {
            return this.equivalence.equivalent(t, this.target);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
            return this.equivalence.equals(equivalentToPredicate.equivalence) && C15791j.m25606a(this.target, equivalentToPredicate.target);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.equivalence, this.target});
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.equivalence);
            sb.append(".equivalentTo(");
            return C0071c.m192d(sb, this.target, ")");
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {
        public static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        @NullableDecl
        private final T reference;

        public Wrapper() {
            throw null;
        }

        public Wrapper(Equivalence equivalence2, Object obj, C15766a aVar) {
            equivalence2.getClass();
            this.equivalence = equivalence2;
            this.reference = obj;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.equivalence);
            sb.append(".wrap(");
            return C0071c.m192d(sb, this.reference, ")");
        }
    }

    public static Equivalence<Object> equals() {
        return Equals.INSTANCE;
    }

    public static Equivalence<Object> identity() {
        return Identity.INSTANCE;
    }

    @ForOverride
    public abstract boolean doEquivalent(T t, T t2);

    @ForOverride
    public abstract int doHash(T t);

    public final boolean equivalent(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public final C15795m<T> equivalentTo(@NullableDecl T t) {
        return new EquivalentToPredicate(this, t);
    }

    public final int hash(@NullableDecl T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <F> Equivalence<F> onResultOf(C15784e<F, ? extends T> eVar) {
        return new FunctionalEquivalence(eVar, this);
    }

    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s) {
        return new Wrapper<>(this, s, (C15766a) null);
    }
}
