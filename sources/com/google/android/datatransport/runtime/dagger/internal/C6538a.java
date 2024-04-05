package com.google.android.datatransport.runtime.dagger.internal;

import p041ch.C4802a;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.a */
public final class C6538a<T> implements C19011a<T>, C4802a<T> {

    /* renamed from: c */
    public static final Object f14463c = new Object();

    /* renamed from: a */
    public volatile C19011a<T> f14464a;

    /* renamed from: b */
    public volatile Object f14465b = f14463c;

    public C6538a(C19011a<T> aVar) {
        this.f14464a = aVar;
    }

    /* renamed from: a */
    public static C19011a m12922a(C6539b bVar) {
        return bVar instanceof C6538a ? bVar : new C6538a(bVar);
    }

    /* renamed from: b */
    public static void m12923b(Object obj, Object obj2) {
        if ((obj != f14463c) && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
    }

    public final T get() {
        T t = this.f14465b;
        T t2 = f14463c;
        if (t == t2) {
            synchronized (this) {
                t = this.f14465b;
                if (t == t2) {
                    t = this.f14464a.get();
                    m12923b(this.f14465b, t);
                    this.f14465b = t;
                    this.f14464a = null;
                }
            }
        }
        return t;
    }
}
