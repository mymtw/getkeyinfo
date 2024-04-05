package p133i;

import java.util.HashMap;
import p133i.C6971b;

/* renamed from: i.a */
public final class C6970a<K, V> extends C6971b<K, V> {

    /* renamed from: f */
    public HashMap<K, C6971b.C6974c<K, V>> f15451f = new HashMap<>();

    /* renamed from: a */
    public final C6971b.C6974c<K, V> mo19125a(K k) {
        return this.f15451f.get(k);
    }

    /* renamed from: c */
    public final V mo19126c(K k, V v) {
        C6971b.C6974c a = mo19125a(k);
        if (a != null) {
            return a.f15457c;
        }
        HashMap<K, C6971b.C6974c<K, V>> hashMap = this.f15451f;
        C6971b.C6974c<K, V> cVar = new C6971b.C6974c<>(k, v);
        this.f15455e++;
        C6971b.C6974c<K, V> cVar2 = this.f15453c;
        if (cVar2 == null) {
            this.f15452b = cVar;
            this.f15453c = cVar;
        } else {
            cVar2.f15458d = cVar;
            cVar.f15459e = cVar2;
            this.f15453c = cVar;
        }
        hashMap.put(k, cVar);
        return null;
    }

    /* renamed from: e */
    public final V mo19127e(K k) {
        V e = super.mo19127e(k);
        this.f15451f.remove(k);
        return e;
    }
}
