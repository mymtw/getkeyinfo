package com.google.common.base;

import android.support.p013v4.media.C0072d;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Converter<A, B> implements C15784e<A, B> {
    @MonotonicNonNullDecl
    @LazyInit

    /* renamed from: b */
    public transient Converter<B, A> f35543b;
    private final boolean handleNullAutomatically;

    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Converter<A, B> first;
        public final Converter<B, C> second;

        public ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
            this.first = converter;
            this.second = converter2;
        }

        @NullableDecl
        public A correctedDoBackward(@NullableDecl C c) {
            return this.first.correctedDoBackward(this.second.correctedDoBackward(c));
        }

        @NullableDecl
        public C correctedDoForward(@NullableDecl A a) {
            return this.second.correctedDoForward(this.first.correctedDoForward(a));
        }

        public A doBackward(C c) {
            throw new AssertionError();
        }

        public C doForward(A a) {
            throw new AssertionError();
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ConverterComposition)) {
                return false;
            }
            ConverterComposition converterComposition = (ConverterComposition) obj;
            return this.first.equals(converterComposition.first) && this.second.equals(converterComposition.second);
        }

        public int hashCode() {
            return this.second.hashCode() + (this.first.hashCode() * 31);
        }

        public String toString() {
            return this.first + ".andThen(" + this.second + ")";
        }
    }

    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final C15784e<? super B, ? extends A> backwardFunction;
        private final C15784e<? super A, ? extends B> forwardFunction;

        public FunctionBasedConverter() {
            throw null;
        }

        public FunctionBasedConverter(C15784e eVar, C15784e eVar2, C15764a aVar) {
            eVar.getClass();
            this.forwardFunction = eVar;
            eVar2.getClass();
            this.backwardFunction = eVar2;
        }

        public A doBackward(B b) {
            return this.backwardFunction.apply(b);
        }

        public B doForward(A a) {
            return this.forwardFunction.apply(a);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof FunctionBasedConverter)) {
                return false;
            }
            FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
            return this.forwardFunction.equals(functionBasedConverter.forwardFunction) && this.backwardFunction.equals(functionBasedConverter.backwardFunction);
        }

        public int hashCode() {
            return this.backwardFunction.hashCode() + (this.forwardFunction.hashCode() * 31);
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Converter.from(");
            h.append(this.forwardFunction);
            h.append(", ");
            h.append(this.backwardFunction);
            h.append(")");
            return h.toString();
        }
    }

    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        public static final IdentityConverter INSTANCE = new IdentityConverter();
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            if (converter != null) {
                return converter;
            }
            throw new NullPointerException("otherConverter");
        }

        public T doBackward(T t) {
            return t;
        }

        public T doForward(T t) {
            return t;
        }

        public IdentityConverter<T> reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Converter<A, B> original;

        public ReverseConverter(Converter<A, B> converter) {
            this.original = converter;
        }

        @NullableDecl
        public B correctedDoBackward(@NullableDecl A a) {
            return this.original.correctedDoForward(a);
        }

        @NullableDecl
        public A correctedDoForward(@NullableDecl B b) {
            return this.original.correctedDoBackward(b);
        }

        public B doBackward(A a) {
            throw new AssertionError();
        }

        public A doForward(B b) {
            throw new AssertionError();
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.original.equals(((ReverseConverter) obj).original);
            }
            return false;
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        public Converter<A, B> reverse() {
            return this.original;
        }

        public String toString() {
            return this.original + ".reverse()";
        }
    }

    /* renamed from: com.google.common.base.Converter$a */
    public class C15764a implements Iterable<B> {

        /* renamed from: b */
        public final /* synthetic */ Iterable f35544b;

        /* renamed from: com.google.common.base.Converter$a$a */
        public class C15765a implements Iterator<B> {

            /* renamed from: b */
            public final Iterator<? extends A> f35546b;

            public C15765a() {
                this.f35546b = C15764a.this.f35544b.iterator();
            }

            public final boolean hasNext() {
                return this.f35546b.hasNext();
            }

            public final B next() {
                return Converter.this.convert(this.f35546b.next());
            }

            public final void remove() {
                this.f35546b.remove();
            }
        }

        public C15764a(Iterable iterable) {
            this.f35544b = iterable;
        }

        public final Iterator<B> iterator() {
            return new C15765a();
        }
    }

    public Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(C15784e<? super A, ? extends B> eVar, C15784e<? super B, ? extends A> eVar2) {
        return new FunctionBasedConverter(eVar, eVar2, (C15764a) null);
    }

    public static <T> Converter<T, T> identity() {
        return IdentityConverter.INSTANCE;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @NullableDecl
    @CanIgnoreReturnValue
    @Deprecated
    public final B apply(@NullableDecl A a) {
        return convert(a);
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public final B convert(@NullableDecl A a) {
        return correctedDoForward(a);
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
        if (iterable != null) {
            return new C15764a(iterable);
        }
        throw new NullPointerException("fromIterable");
    }

    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b) {
        if (!this.handleNullAutomatically) {
            return doBackward(b);
        }
        if (b == null) {
            return null;
        }
        A doBackward = doBackward(b);
        doBackward.getClass();
        return doBackward;
    }

    @NullableDecl
    public B correctedDoForward(@NullableDecl A a) {
        if (!this.handleNullAutomatically) {
            return doForward(a);
        }
        if (a == null) {
            return null;
        }
        B doForward = doForward(a);
        doForward.getClass();
        return doForward;
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        converter.getClass();
        return new ConverterComposition(this, converter);
    }

    @ForOverride
    public abstract A doBackward(B b);

    @ForOverride
    public abstract B doForward(A a);

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.f35543b;
        if (converter != null) {
            return converter;
        }
        ReverseConverter reverseConverter = new ReverseConverter(this);
        this.f35543b = reverseConverter;
        return reverseConverter;
    }

    public Converter(boolean z) {
        this.handleNullAutomatically = z;
    }
}
