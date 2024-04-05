package com.google.common.collect;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.p */
public abstract class C16206p {

    /* renamed from: a */
    public static final C16207a f36306a = new C16207a();

    /* renamed from: b */
    public static final C16208b f36307b = new C16208b(-1);

    /* renamed from: c */
    public static final C16208b f36308c = new C16208b(1);

    /* renamed from: com.google.common.collect.p$a */
    public static class C16207a extends C16206p {
        /* renamed from: h */
        public static C16206p m26227h(int i) {
            return i < 0 ? C16206p.f36307b : i > 0 ? C16206p.f36308c : C16206p.f36306a;
        }

        /* renamed from: a */
        public final C16206p mo57708a(int i, int i2) {
            return m26227h(i < i2 ? -1 : i > i2 ? 1 : 0);
        }

        /* renamed from: b */
        public final C16206p mo57709b(long j, long j2) {
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            return m26227h(i < 0 ? -1 : i > 0 ? 1 : 0);
        }

        /* renamed from: c */
        public final C16206p mo57710c(Comparable comparable, Comparable comparable2) {
            return m26227h(comparable.compareTo(comparable2));
        }

        /* renamed from: d */
        public final C16206p mo57711d(@NullableDecl Object obj, @NullableDecl Object obj2, Ordering ordering) {
            return m26227h(ordering.compare(obj, obj2));
        }

        /* renamed from: e */
        public final C16206p mo57712e(boolean z, boolean z2) {
            return m26227h(z == z2 ? 0 : z ? 1 : -1);
        }

        /* renamed from: f */
        public final C16206p mo57713f(boolean z, boolean z2) {
            return m26227h(z2 == z ? 0 : z2 ? 1 : -1);
        }

        /* renamed from: g */
        public final int mo57714g() {
            return 0;
        }
    }

    /* renamed from: com.google.common.collect.p$b */
    public static final class C16208b extends C16206p {

        /* renamed from: d */
        public final int f36309d;

        public C16208b(int i) {
            this.f36309d = i;
        }

        /* renamed from: a */
        public final C16206p mo57708a(int i, int i2) {
            return this;
        }

        /* renamed from: b */
        public final C16206p mo57709b(long j, long j2) {
            return this;
        }

        /* renamed from: c */
        public final C16206p mo57710c(@NullableDecl Comparable comparable, @NullableDecl Comparable comparable2) {
            return this;
        }

        /* renamed from: d */
        public final C16206p mo57711d(@NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Ordering ordering) {
            return this;
        }

        /* renamed from: e */
        public final C16206p mo57712e(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: f */
        public final C16206p mo57713f(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: g */
        public final int mo57714g() {
            return this.f36309d;
        }
    }

    /* renamed from: a */
    public abstract C16206p mo57708a(int i, int i2);

    /* renamed from: b */
    public abstract C16206p mo57709b(long j, long j2);

    /* renamed from: c */
    public abstract C16206p mo57710c(Comparable<?> comparable, Comparable<?> comparable2);

    /* renamed from: d */
    public abstract C16206p mo57711d(@NullableDecl Object obj, @NullableDecl Object obj2, Ordering ordering);

    /* renamed from: e */
    public abstract C16206p mo57712e(boolean z, boolean z2);

    /* renamed from: f */
    public abstract C16206p mo57713f(boolean z, boolean z2);

    /* renamed from: g */
    public abstract int mo57714g();
}
