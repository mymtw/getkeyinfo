package p133i;

import android.support.p013v4.media.C0072d;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: i.b */
public class C6971b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public C6974c<K, V> f15452b;

    /* renamed from: c */
    public C6974c<K, V> f15453c;

    /* renamed from: d */
    public WeakHashMap<C6977f<K, V>, Boolean> f15454d = new WeakHashMap<>();

    /* renamed from: e */
    public int f15455e = 0;

    /* renamed from: i.b$a */
    public static class C6972a<K, V> extends C6976e<K, V> {
        public C6972a(C6974c<K, V> cVar, C6974c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public final C6974c<K, V> mo19132b(C6974c<K, V> cVar) {
            return cVar.f15459e;
        }

        /* renamed from: c */
        public final C6974c<K, V> mo19133c(C6974c<K, V> cVar) {
            return cVar.f15458d;
        }
    }

    /* renamed from: i.b$b */
    public static class C6973b<K, V> extends C6976e<K, V> {
        public C6973b(C6974c<K, V> cVar, C6974c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public final C6974c<K, V> mo19132b(C6974c<K, V> cVar) {
            return cVar.f15458d;
        }

        /* renamed from: c */
        public final C6974c<K, V> mo19133c(C6974c<K, V> cVar) {
            return cVar.f15459e;
        }
    }

    /* renamed from: i.b$c */
    public static class C6974c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f15456b;

        /* renamed from: c */
        public final V f15457c;

        /* renamed from: d */
        public C6974c<K, V> f15458d;

        /* renamed from: e */
        public C6974c<K, V> f15459e;

        public C6974c(K k, V v) {
            this.f15456b = k;
            this.f15457c = v;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6974c)) {
                return false;
            }
            C6974c cVar = (C6974c) obj;
            return this.f15456b.equals(cVar.f15456b) && this.f15457c.equals(cVar.f15457c);
        }

        public final K getKey() {
            return this.f15456b;
        }

        public final V getValue() {
            return this.f15457c;
        }

        public final int hashCode() {
            return this.f15456b.hashCode() ^ this.f15457c.hashCode();
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f15456b + "=" + this.f15457c;
        }
    }

    /* renamed from: i.b$d */
    public class C6975d implements Iterator<Map.Entry<K, V>>, C6977f<K, V> {

        /* renamed from: b */
        public C6974c<K, V> f15460b;

        /* renamed from: c */
        public boolean f15461c = true;

        public C6975d() {
        }

        /* renamed from: a */
        public final void mo19140a(C6974c<K, V> cVar) {
            C6974c<K, V> cVar2 = this.f15460b;
            if (cVar == cVar2) {
                C6974c<K, V> cVar3 = cVar2.f15459e;
                this.f15460b = cVar3;
                this.f15461c = cVar3 == null;
            }
        }

        public final boolean hasNext() {
            if (this.f15461c) {
                return C6971b.this.f15452b != null;
            }
            C6974c<K, V> cVar = this.f15460b;
            return (cVar == null || cVar.f15458d == null) ? false : true;
        }

        public final Object next() {
            if (this.f15461c) {
                this.f15461c = false;
                this.f15460b = C6971b.this.f15452b;
            } else {
                C6974c<K, V> cVar = this.f15460b;
                this.f15460b = cVar != null ? cVar.f15458d : null;
            }
            return this.f15460b;
        }
    }

    /* renamed from: i.b$e */
    public static abstract class C6976e<K, V> implements Iterator<Map.Entry<K, V>>, C6977f<K, V> {

        /* renamed from: b */
        public C6974c<K, V> f15463b;

        /* renamed from: c */
        public C6974c<K, V> f15464c;

        public C6976e(C6974c<K, V> cVar, C6974c<K, V> cVar2) {
            this.f15463b = cVar2;
            this.f15464c = cVar;
        }

        /* renamed from: a */
        public final void mo19140a(C6974c<K, V> cVar) {
            C6974c<K, V> cVar2 = null;
            if (this.f15463b == cVar && cVar == this.f15464c) {
                this.f15464c = null;
                this.f15463b = null;
            }
            C6974c<K, V> cVar3 = this.f15463b;
            if (cVar3 == cVar) {
                this.f15463b = mo19132b(cVar3);
            }
            C6974c<K, V> cVar4 = this.f15464c;
            if (cVar4 == cVar) {
                C6974c<K, V> cVar5 = this.f15463b;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = mo19133c(cVar4);
                }
                this.f15464c = cVar2;
            }
        }

        /* renamed from: b */
        public abstract C6974c<K, V> mo19132b(C6974c<K, V> cVar);

        /* renamed from: c */
        public abstract C6974c<K, V> mo19133c(C6974c<K, V> cVar);

        public final boolean hasNext() {
            return this.f15464c != null;
        }

        public final Object next() {
            C6974c<K, V> cVar = this.f15464c;
            C6974c<K, V> cVar2 = this.f15463b;
            this.f15464c = (cVar == cVar2 || cVar2 == null) ? null : mo19133c(cVar);
            return cVar;
        }
    }

    /* renamed from: i.b$f */
    public interface C6977f<K, V> {
        /* renamed from: a */
        void mo19140a(C6974c<K, V> cVar);
    }

    /* renamed from: a */
    public C6974c<K, V> mo19125a(K k) {
        C6974c<K, V> cVar = this.f15452b;
        while (cVar != null && !cVar.f15456b.equals(k)) {
            cVar = cVar.f15458d;
        }
        return cVar;
    }

    /* renamed from: c */
    public V mo19126c(K k, V v) {
        C6974c a = mo19125a(k);
        if (a != null) {
            return a.f15457c;
        }
        C6974c<K, V> cVar = new C6974c<>(k, v);
        this.f15455e++;
        C6974c<K, V> cVar2 = this.f15453c;
        if (cVar2 == null) {
            this.f15452b = cVar;
            this.f15453c = cVar;
            return null;
        }
        cVar2.f15458d = cVar;
        cVar.f15459e = cVar2;
        this.f15453c = cVar;
        return null;
    }

    /* renamed from: e */
    public V mo19127e(K k) {
        C6974c a = mo19125a(k);
        if (a == null) {
            return null;
        }
        this.f15455e--;
        if (!this.f15454d.isEmpty()) {
            for (C6977f<K, V> a2 : this.f15454d.keySet()) {
                a2.mo19140a(a);
            }
        }
        C6974c<K, V> cVar = a.f15459e;
        if (cVar != null) {
            cVar.f15458d = a.f15458d;
        } else {
            this.f15452b = a.f15458d;
        }
        C6974c<K, V> cVar2 = a.f15458d;
        if (cVar2 != null) {
            cVar2.f15459e = cVar;
        } else {
            this.f15453c = cVar;
        }
        a.f15458d = null;
        a.f15459e = null;
        return a.f15457c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((p133i.C6971b.C6976e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof p133i.C6971b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            i.b r7 = (p133i.C6971b) r7
            int r1 = r6.f15455e
            int r3 = r7.f15455e
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            i.b$e r3 = (p133i.C6971b.C6976e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            i.b$e r4 = (p133i.C6971b.C6976e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            i.b$e r7 = (p133i.C6971b.C6976e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p133i.C6971b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C6976e eVar = (C6976e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        C6972a aVar = new C6972a(this.f15452b, this.f15453c);
        this.f15454d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("[");
        Iterator it = iterator();
        while (true) {
            C6976e eVar = (C6976e) it;
            if (eVar.hasNext()) {
                h.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    h.append(", ");
                }
            } else {
                h.append("]");
                return h.toString();
            }
        }
    }
}
