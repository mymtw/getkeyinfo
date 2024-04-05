package p259v;

import androidx.compose.runtime.Recomposer;
import java.util.Iterator;
import kotlin.collections.C19314g;
import kotlin.jvm.internal.C19383o;
import p228s.C7793e;
import p235s6.C7823a0;
import p239t.C7915c;
import p239t.C7931s;

/* renamed from: v.b */
public final class C8182b<E> extends C19314g<E> implements C7793e<E> {

    /* renamed from: e */
    public static final C8182b f17959e;

    /* renamed from: b */
    public final Object f17960b;

    /* renamed from: c */
    public final Object f17961c;

    /* renamed from: d */
    public final C7915c<E, C8181a> f17962d;

    static {
        C7823a0 a0Var = C7823a0.f17285b;
        f17959e = new C8182b(a0Var, a0Var, C7915c.f17371d);
    }

    public C8182b(Object obj, Object obj2, C7915c<E, C8181a> cVar) {
        C19383o.m32797g(cVar, "hashMap");
        this.f17960b = obj;
        this.f17961c = obj2;
        this.f17962d = cVar;
    }

    /* renamed from: R */
    public final C8182b mo20338R(Recomposer.C1284b bVar) {
        if (this.f17962d.containsKey(bVar)) {
            return this;
        }
        if (isEmpty()) {
            return new C8182b(bVar, bVar, this.f17962d.mo20403a(bVar, new C8181a()));
        }
        Object obj = this.f17961c;
        C8181a aVar = this.f17962d.get(obj);
        C19383o.m32794d(aVar);
        return new C8182b(this.f17960b, bVar, this.f17962d.mo20403a(obj, new C8181a(aVar.f17957a, bVar)).mo20403a(bVar, new C8181a(obj, C7823a0.f17285b)));
    }

    /* renamed from: a */
    public final int mo5763a() {
        C7915c<E, C8181a> cVar = this.f17962d;
        cVar.getClass();
        return cVar.f17373c;
    }

    public final boolean contains(Object obj) {
        return this.f17962d.containsKey(obj);
    }

    public final Iterator<E> iterator() {
        return new C8183c(this.f17960b, this.f17962d);
    }

    public final C8182b remove(Object obj) {
        C8181a aVar = this.f17962d.get(obj);
        if (aVar == null) {
            return this;
        }
        C7915c<E, C8181a> cVar = this.f17962d;
        boolean z = false;
        C7931s<K, V> v = cVar.f17372b.mo20468v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (cVar.f17372b != v) {
            cVar = v == null ? C7915c.f17371d : new C7915c<>(v, cVar.f17373c - 1);
        }
        Object obj2 = aVar.f17957a;
        C7823a0 a0Var = C7823a0.f17285b;
        if (obj2 != a0Var) {
            C8181a aVar2 = cVar.get(obj2);
            C19383o.m32794d(aVar2);
            cVar = cVar.mo20403a(aVar.f17957a, new C8181a(aVar2.f17957a, aVar.f17958b));
        }
        Object obj3 = aVar.f17958b;
        if (obj3 != a0Var) {
            C8181a aVar3 = cVar.get(obj3);
            C19383o.m32794d(aVar3);
            cVar = cVar.mo20403a(aVar.f17958b, new C8181a(aVar.f17957a, aVar3.f17958b));
        }
        Object obj4 = aVar.f17957a;
        Object obj5 = !(obj4 != a0Var) ? aVar.f17958b : this.f17960b;
        if (aVar.f17958b != a0Var) {
            z = true;
        }
        if (z) {
            obj4 = this.f17961c;
        }
        return new C8182b(obj5, obj4, cVar);
    }
}
