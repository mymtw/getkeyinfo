package p193o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.h */
public abstract class C7500h<K, V> {

    /* renamed from: a */
    public C7500h<K, V>.b f16724a;

    /* renamed from: b */
    public C7500h<K, V>.c f16725b;

    /* renamed from: c */
    public C7500h<K, V>.e f16726c;

    /* renamed from: o.h$a */
    public final class C7501a<T> implements Iterator<T> {

        /* renamed from: b */
        public final int f16727b;

        /* renamed from: c */
        public int f16728c;

        /* renamed from: d */
        public int f16729d;

        /* renamed from: e */
        public boolean f16730e = false;

        public C7501a(int i) {
            this.f16727b = i;
            this.f16728c = C7500h.this.mo19853d();
        }

        public final boolean hasNext() {
            return this.f16729d < this.f16728c;
        }

        public final T next() {
            if (hasNext()) {
                T b = C7500h.this.mo19851b(this.f16729d, this.f16727b);
                this.f16729d++;
                this.f16730e = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f16730e) {
                int i = this.f16729d - 1;
                this.f16729d = i;
                this.f16728c--;
                this.f16730e = false;
                C7500h.this.mo19857h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.h$b */
    public final class C7502b implements Set<Map.Entry<K, V>> {
        public C7502b() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C7500h.this.mo19853d();
            for (Map.Entry entry : collection) {
                C7500h.this.mo19856g(entry.getKey(), entry.getValue());
            }
            return d != C7500h.this.mo19853d();
        }

        public final void clear() {
            C7500h.this.mo19850a();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C7500h.this.mo19854e(entry.getKey());
            if (e < 0) {
                return false;
            }
            Object b = C7500h.this.mo19851b(e, 1);
            Object value = entry.getValue();
            return b == value || (b != null && b.equals(value));
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return C7500h.m14467j(this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int d = C7500h.this.mo19853d() - 1; d >= 0; d--) {
                Object b = C7500h.this.mo19851b(d, 0);
                Object b2 = C7500h.this.mo19851b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public final boolean isEmpty() {
            return C7500h.this.mo19853d() == 0;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C7504d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return C7500h.this.mo19853d();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.h$d */
    public final class C7504d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        public int f16734b;

        /* renamed from: c */
        public int f16735c;

        /* renamed from: d */
        public boolean f16736d = false;

        public C7504d() {
            this.f16734b = C7500h.this.mo19853d() - 1;
            this.f16735c = -1;
        }

        public final boolean equals(Object obj) {
            if (!this.f16736d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object b = C7500h.this.mo19851b(this.f16735c, 0);
                if (!(key == b || (key != null && key.equals(b)))) {
                    return false;
                }
                Object value = entry.getValue();
                Object b2 = C7500h.this.mo19851b(this.f16735c, 1);
                return value == b2 || (value != null && value.equals(b2));
            }
        }

        public final K getKey() {
            if (this.f16736d) {
                return C7500h.this.mo19851b(this.f16735c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f16736d) {
                return C7500h.this.mo19851b(this.f16735c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f16735c < this.f16734b;
        }

        public final int hashCode() {
            if (this.f16736d) {
                int i = 0;
                Object b = C7500h.this.mo19851b(this.f16735c, 0);
                Object b2 = C7500h.this.mo19851b(this.f16735c, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final Object next() {
            if (hasNext()) {
                this.f16735c++;
                this.f16736d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f16736d) {
                C7500h.this.mo19857h(this.f16735c);
                this.f16735c--;
                this.f16734b--;
                this.f16736d = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v) {
            if (this.f16736d) {
                return C7500h.this.mo19858i(this.f16735c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: j */
    public static <T> boolean m14467j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m14468k(Collection collection, Map map) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo19850a();

    /* renamed from: b */
    public abstract Object mo19851b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo19852c();

    /* renamed from: d */
    public abstract int mo19853d();

    /* renamed from: e */
    public abstract int mo19854e(Object obj);

    /* renamed from: f */
    public abstract int mo19855f(Object obj);

    /* renamed from: g */
    public abstract void mo19856g(K k, V v);

    /* renamed from: h */
    public abstract void mo19857h(int i);

    /* renamed from: i */
    public abstract V mo19858i(int i, V v);

    /* renamed from: l */
    public final Object[] mo19912l(int i, Object[] objArr) {
        int d = mo19853d();
        if (objArr.length < d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo19851b(i2, i);
        }
        if (objArr.length > d) {
            objArr[d] = null;
        }
        return objArr;
    }

    /* renamed from: o.h$c */
    public final class C7503c implements Set<K> {
        public C7503c() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            C7500h.this.mo19850a();
        }

        public final boolean contains(Object obj) {
            return C7500h.this.mo19854e(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map c = C7500h.this.mo19852c();
            for (Object containsKey : collection) {
                if (!c.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return C7500h.m14467j(this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int d = C7500h.this.mo19853d() - 1; d >= 0; d--) {
                Object b = C7500h.this.mo19851b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public final boolean isEmpty() {
            return C7500h.this.mo19853d() == 0;
        }

        public final Iterator<K> iterator() {
            return new C7501a(0);
        }

        public final boolean remove(Object obj) {
            int e = C7500h.this.mo19854e(obj);
            if (e < 0) {
                return false;
            }
            C7500h.this.mo19857h(e);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map c = C7500h.this.mo19852c();
            int size = c.size();
            for (Object remove : collection) {
                c.remove(remove);
            }
            return size != c.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return C7500h.m14468k(collection, C7500h.this.mo19852c());
        }

        public final int size() {
            return C7500h.this.mo19853d();
        }

        public final Object[] toArray() {
            C7500h hVar = C7500h.this;
            int d = hVar.mo19853d();
            Object[] objArr = new Object[d];
            for (int i = 0; i < d; i++) {
                objArr[i] = hVar.mo19851b(i, 0);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return C7500h.this.mo19912l(0, tArr);
        }
    }

    /* renamed from: o.h$e */
    public final class C7505e implements Collection<V> {
        public C7505e() {
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            C7500h.this.mo19850a();
        }

        public final boolean contains(Object obj) {
            return C7500h.this.mo19855f(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return C7500h.this.mo19853d() == 0;
        }

        public final Iterator<V> iterator() {
            return new C7501a(1);
        }

        public final boolean remove(Object obj) {
            int f = C7500h.this.mo19855f(obj);
            if (f < 0) {
                return false;
            }
            C7500h.this.mo19857h(f);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int d = C7500h.this.mo19853d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C7500h.this.mo19851b(i, 1))) {
                    C7500h.this.mo19857h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int d = C7500h.this.mo19853d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C7500h.this.mo19851b(i, 1))) {
                    C7500h.this.mo19857h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return C7500h.this.mo19853d();
        }

        public final Object[] toArray() {
            C7500h hVar = C7500h.this;
            int d = hVar.mo19853d();
            Object[] objArr = new Object[d];
            for (int i = 0; i < d; i++) {
                objArr[i] = hVar.mo19851b(i, 1);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return C7500h.this.mo19912l(1, tArr);
        }
    }
}
