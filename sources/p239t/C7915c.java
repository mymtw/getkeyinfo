package p239t;

import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.C19383o;
import p228s.C7792d;
import p239t.C7931s;
import p259v.C8181a;

/* renamed from: t.c */
public final class C7915c<K, V> extends AbstractMap<K, V> implements C7792d<K, V> {

    /* renamed from: d */
    public static final C7915c f17371d = new C7915c(C7931s.f17394e, 0);

    /* renamed from: b */
    public final C7931s<K, V> f17372b;

    /* renamed from: c */
    public final int f17373c;

    public C7915c(C7931s<K, V> sVar, int i) {
        C19383o.m32797g(sVar, "node");
        this.f17372b = sVar;
        this.f17373c = i;
    }

    /* renamed from: a */
    public final C7915c mo20403a(Object obj, C8181a aVar) {
        C7931s.C7932a u = this.f17372b.mo20467u(obj != null ? obj.hashCode() : 0, obj, aVar, 0);
        return u == null ? this : new C7915c(u.f17399a, this.f17373c + u.f17400b);
    }

    public final C7917e builder() {
        return new C7917e(this);
    }

    public final boolean containsKey(Object obj) {
        return this.f17372b.mo20451d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final V get(Object obj) {
        return this.f17372b.mo20454g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
