package com.google.common.collect;

import com.google.common.base.C15795m;
import com.google.common.base.Optional;
import java.util.Iterator;

/* renamed from: com.google.common.collect.t */
public abstract class C16221t<E> implements Iterable<E> {

    /* renamed from: b */
    public final Optional<Iterable<E>> f36323b;

    /* renamed from: com.google.common.collect.t$a */
    public static class C16222a extends C16221t<E> {

        /* renamed from: c */
        public final /* synthetic */ Iterable f36324c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16222a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f36324c = iterable2;
        }

        public final Iterator<E> iterator() {
            return this.f36324c.iterator();
        }
    }

    public C16221t() {
        this.f36323b = Optional.absent();
    }

    /* renamed from: c */
    public static <E> C16221t<E> m26253c(Iterable<E> iterable) {
        return iterable instanceof C16221t ? (C16221t) iterable : new C16222a(iterable, iterable);
    }

    /* renamed from: a */
    public final C16221t<E> mo57721a(C15795m<? super E> mVar) {
        Iterable or = this.f36323b.mo55650or(this);
        or.getClass();
        mVar.getClass();
        return m26253c(new C16190k0(or, mVar));
    }

    public final String toString() {
        return C16201n0.m26213d(this.f36323b.mo55650or(this));
    }

    public C16221t(Iterable<E> iterable) {
        iterable.getClass();
        this.f36323b = Optional.fromNullable(this == iterable ? null : iterable);
    }
}
