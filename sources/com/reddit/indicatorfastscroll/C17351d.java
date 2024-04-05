package com.reddit.indicatorfastscroll;

import android.support.p013v4.media.C0072d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19410j;
import p753kq.C19846a;
import p759nq.C19920b;

/* renamed from: com.reddit.indicatorfastscroll.d */
public final class C17351d<T> implements C19920b {

    /* renamed from: b */
    public boolean f37880b;

    /* renamed from: c */
    public T f37881c;

    /* renamed from: d */
    public final C19846a<C19394m> f37882d;

    public C17351d(C19846a<C19394m> aVar) {
        this.f37882d = aVar;
    }

    /* renamed from: a */
    public final void mo68379a(Object obj, C19410j<?> jVar, T t) {
        C19383o.m32798h(jVar, "property");
        boolean z = this.f37880b;
        this.f37880b = true;
        this.f37881c = t;
        if (z) {
            this.f37882d.invoke();
        }
    }

    public final T getValue(Object obj, C19410j<?> jVar) {
        C19383o.m32798h(jVar, "property");
        if (this.f37880b) {
            return this.f37881c;
        }
        StringBuilder h = C0072d.m201h("Property ");
        h.append(jVar.getName());
        h.append(" should be initialized before get.");
        throw new IllegalStateException(h.toString());
    }
}
