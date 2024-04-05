package p239t;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.measurement.internal.C14921a0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C19312e;
import kotlin.jvm.internal.C19383o;
import p270w.C8227a;

/* renamed from: t.e */
public final class C7917e<K, V> extends C19312e<K, V> {

    /* renamed from: b */
    public C7915c<K, V> f17377b;

    /* renamed from: c */
    public C14921a0 f17378c = new C14921a0();

    /* renamed from: d */
    public C7931s<K, V> f17379d;

    /* renamed from: e */
    public V f17380e;

    /* renamed from: f */
    public int f17381f;

    /* renamed from: g */
    public int f17382g;

    public C7917e(C7915c<K, V> cVar) {
        C19383o.m32797g(cVar, "map");
        this.f17377b = cVar;
        this.f17379d = cVar.f17372b;
        this.f17382g = cVar.f17373c;
    }

    /* renamed from: a */
    public final Set<Map.Entry<K, V>> mo20411a() {
        return new C7919g(this);
    }

    /* renamed from: b */
    public final Set<K> mo20412b() {
        return new C7921i(this);
    }

    /* renamed from: c */
    public final int mo20413c() {
        return this.f17382g;
    }

    public final void clear() {
        C7931s sVar = C7931s.f17394e;
        this.f17379d = C7931s.f17394e;
        mo20418f(0);
    }

    public final boolean containsKey(Object obj) {
        return this.f17379d.mo20451d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* renamed from: d */
    public final Collection<V> mo20416d() {
        return new C7923k(this);
    }

    /* renamed from: e */
    public final C7915c<K, V> mo20417e() {
        C7931s<K, V> sVar = this.f17379d;
        C7915c<K, V> cVar = this.f17377b;
        if (sVar != cVar.f17372b) {
            this.f17378c = new C14921a0();
            cVar = new C7915c<>(this.f17379d, mo20413c());
        }
        this.f17377b = cVar;
        return cVar;
    }

    /* renamed from: f */
    public final void mo20418f(int i) {
        this.f17382g = i;
        this.f17381f++;
    }

    public final V get(Object obj) {
        return this.f17379d.mo20454g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final V put(K k, V v) {
        this.f17380e = null;
        this.f17379d = this.f17379d.mo20458l(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.f17380e;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        C19383o.m32797g(map, ResponseConstants.FROM);
        C7915c cVar = null;
        C7915c cVar2 = map instanceof C7915c ? (C7915c) map : null;
        if (cVar2 == null) {
            C7917e eVar = map instanceof C7917e ? (C7917e) map : null;
            if (eVar != null) {
                cVar = eVar.mo20417e();
            }
        } else {
            cVar = cVar2;
        }
        if (cVar != null) {
            C8227a aVar = new C8227a(0);
            int i = this.f17382g;
            this.f17379d = this.f17379d.mo20459m(cVar.f17372b, 0, aVar, this);
            int i2 = (cVar.f17373c + i) - aVar.f18059a;
            if (i != i2) {
                mo20418f(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    public final boolean remove(Object obj, Object obj2) {
        int c = mo20413c();
        C7931s<K, V> o = this.f17379d.mo20461o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            C7931s sVar = C7931s.f17394e;
            o = C7931s.f17394e;
        }
        this.f17379d = o;
        if (c != mo20413c()) {
            return true;
        }
        return false;
    }

    public final V remove(Object obj) {
        this.f17380e = null;
        C7931s<K, V> n = this.f17379d.mo20460n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            C7931s sVar = C7931s.f17394e;
            n = C7931s.f17394e;
        }
        this.f17379d = n;
        return this.f17380e;
    }
}
