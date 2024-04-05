package com.google.common.base;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.google.common.base.C15788i;
import com.google.common.base.C15792k;
import com.google.common.base.JdkPattern;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p010a9.C0048b;

public final class Predicates {

    public static class AndPredicate<T> implements C15795m<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends C15795m<? super T>> components;

        public AndPredicate() {
            throw null;
        }

        public AndPredicate(List list, C15774a aVar) {
            this.components = list;
        }

        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!((C15795m) this.components.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.m25582a(this.components, "and");
        }
    }

    public static class CompositionPredicate<A, B> implements C15795m<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        public final C15784e<A, ? extends B> f35553f;

        /* renamed from: p */
        public final C15795m<B> f35554p;

        public CompositionPredicate() {
            throw null;
        }

        public CompositionPredicate(C15795m mVar, C15784e eVar, C15774a aVar) {
            mVar.getClass();
            this.f35554p = mVar;
            eVar.getClass();
            this.f35553f = eVar;
        }

        public boolean apply(@NullableDecl A a) {
            return this.f35554p.apply(this.f35553f.apply(a));
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof CompositionPredicate)) {
                return false;
            }
            CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
            return this.f35553f.equals(compositionPredicate.f35553f) && this.f35554p.equals(compositionPredicate.f35554p);
        }

        public int hashCode() {
            return this.f35553f.hashCode() ^ this.f35554p.hashCode();
        }

        public String toString() {
            return this.f35554p + "(" + this.f35553f + ")";
        }
    }

    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ContainsPatternFromStringPredicate(String str) {
            super(new JdkPattern(Pattern.compile(str)));
            C15792k.C15793a aVar = C15792k.f35574a;
            str.getClass();
            C15792k.f35574a.getClass();
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Predicates.containsPattern(");
            h.append(this.pattern.pattern());
            h.append(")");
            return h.toString();
        }
    }

    public static class ContainsPatternPredicate implements C15795m<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        public final C15783d pattern;

        public ContainsPatternPredicate(C15783d dVar) {
            dVar.getClass();
            this.pattern = dVar;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ContainsPatternPredicate)) {
                return false;
            }
            ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
            return C15791j.m25606a(this.pattern.pattern(), containsPatternPredicate.pattern.pattern()) && this.pattern.flags() == containsPatternPredicate.pattern.flags();
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.pattern.pattern(), Integer.valueOf(this.pattern.flags())});
        }

        public String toString() {
            C15788i.C15789a b = C15788i.m25603b(this.pattern);
            b.mo55782b(this.pattern.pattern(), "pattern");
            b.mo55782b(String.valueOf(this.pattern.flags()), "pattern.flags");
            return C0048b.m163a("Predicates.contains(", b.toString(), ")");
        }

        public boolean apply(CharSequence charSequence) {
            return ((JdkPattern.C15767a) this.pattern.matcher(charSequence)).f35550a.find();
        }
    }

    public static class InPredicate<T> implements C15795m<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        public InPredicate() {
            throw null;
        }

        public InPredicate(Collection collection, C15774a aVar) {
            collection.getClass();
            this.target = collection;
        }

        public boolean apply(@NullableDecl T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof InPredicate) {
                return this.target.equals(((InPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Predicates.in(");
            h.append(this.target);
            h.append(")");
            return h.toString();
        }
    }

    public static class InstanceOfPredicate implements C15795m<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        public InstanceOfPredicate() {
            throw null;
        }

        public InstanceOfPredicate(Class cls, C15774a aVar) {
            cls.getClass();
            this.clazz = cls;
        }

        public boolean apply(@NullableDecl Object obj) {
            return this.clazz.isInstance(obj);
        }

        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.clazz == ((InstanceOfPredicate) obj).clazz;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            return C0326j.m863h(this.clazz, C0072d.m201h("Predicates.instanceOf("), ")");
        }
    }

    public static class IsEqualToPredicate<T> implements C15795m<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final T target;

        public IsEqualToPredicate() {
            throw null;
        }

        public IsEqualToPredicate(Object obj, C15774a aVar) {
            this.target = obj;
        }

        public boolean apply(T t) {
            return this.target.equals(t);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.target.equals(((IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            return C0071c.m192d(C0072d.m201h("Predicates.equalTo("), this.target, ")");
        }
    }

    public static class NotPredicate<T> implements C15795m<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final C15795m<T> predicate;

        public NotPredicate(C15795m<T> mVar) {
            mVar.getClass();
            this.predicate = mVar;
        }

        public boolean apply(@NullableDecl T t) {
            return !this.predicate.apply(t);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof NotPredicate) {
                return this.predicate.equals(((NotPredicate) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Predicates.not(");
            h.append(this.predicate);
            h.append(")");
            return h.toString();
        }
    }

    public enum ObjectPredicate implements C15795m<Object> {
        ALWAYS_TRUE {
            public boolean apply(@NullableDecl Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(@NullableDecl Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(@NullableDecl Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(@NullableDecl Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        public <T> C15795m<T> withNarrowedType() {
            return this;
        }
    }

    public static class OrPredicate<T> implements C15795m<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends C15795m<? super T>> components;

        public OrPredicate() {
            throw null;
        }

        public OrPredicate(List list, C15774a aVar) {
            this.components = list;
        }

        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (((C15795m) this.components.get(i)).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof OrPredicate) {
                return this.components.equals(((OrPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.m25582a(this.components, "or");
        }
    }

    public static class SubtypeOfPredicate implements C15795m<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        public SubtypeOfPredicate() {
            throw null;
        }

        public SubtypeOfPredicate(Class cls, C15774a aVar) {
            cls.getClass();
            this.clazz = cls;
        }

        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof SubtypeOfPredicate) && this.clazz == ((SubtypeOfPredicate) obj).clazz;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            return C0326j.m863h(this.clazz, C0072d.m201h("Predicates.subtypeOf("), ")");
        }

        public boolean apply(Class<?> cls) {
            return this.clazz.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public static String m25582a(List list, String str) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object next : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: b */
    public static <T> C15795m<T> m25583b() {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    /* renamed from: c */
    public static <A, B> C15795m<A> m25584c(C15795m<B> mVar, C15784e<A, ? extends B> eVar) {
        return new CompositionPredicate(mVar, eVar, (C15774a) null);
    }

    /* renamed from: d */
    public static <T> C15795m<T> m25585d(@NullableDecl T t) {
        return t == null ? ObjectPredicate.IS_NULL.withNarrowedType() : new IsEqualToPredicate(t, (C15774a) null);
    }

    /* renamed from: e */
    public static <T> C15795m<T> m25586e(Collection<? extends T> collection) {
        return new InPredicate(collection, (C15774a) null);
    }

    /* renamed from: f */
    public static <T> C15795m<T> m25587f(C15795m<T> mVar) {
        return new NotPredicate(mVar);
    }
}
