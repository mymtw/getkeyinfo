package p239t;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p755lq.C19878d;

/* renamed from: t.b */
public final class C7914b<K, V> extends C7913a<K, V> implements C19878d.C19879a {

    /* renamed from: d */
    public final C7920h<K, V> f17369d;

    /* renamed from: e */
    public V f17370e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7914b(C7920h<K, V> hVar, K k, V v) {
        super(k, v);
        C19383o.m32797g(hVar, "parentIterator");
        this.f17369d = hVar;
        this.f17370e = v;
    }

    public final V getValue() {
        return this.f17370e;
    }

    public final V setValue(V v) {
        V v2 = this.f17370e;
        this.f17370e = v;
        C7920h<K, V> hVar = this.f17369d;
        K k = this.f17367b;
        C7918f<K, V, Map.Entry<K, V>> fVar = hVar.f17388b;
        if (fVar.f17383e.containsKey(k)) {
            boolean z = fVar.f17376d;
            if (!z) {
                fVar.f17383e.put(k, v);
            } else if (z) {
                C7933t<K, V, T> tVar = fVar.f17374b[fVar.f17375c];
                Object obj = tVar.f17401b[tVar.f17403d];
                fVar.f17383e.put(k, v);
                fVar.mo20424c(obj != null ? obj.hashCode() : 0, fVar.f17383e.f17379d, obj, 0);
            } else {
                throw new NoSuchElementException();
            }
            fVar.f17386h = fVar.f17383e.f17381f;
        }
        return v2;
    }
}
