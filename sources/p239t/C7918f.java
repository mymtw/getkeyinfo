package p239t;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;

/* renamed from: t.f */
public class C7918f<K, V, T> extends C7916d<K, V, T> {

    /* renamed from: e */
    public final C7917e<K, V> f17383e;

    /* renamed from: f */
    public K f17384f;

    /* renamed from: g */
    public boolean f17385g;

    /* renamed from: h */
    public int f17386h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7918f(C7917e<K, V> eVar, C7933t<K, V, T>[] tVarArr) {
        super(eVar.f17379d, tVarArr);
        C19383o.m32797g(eVar, "builder");
        this.f17383e = eVar;
        this.f17386h = eVar.f17381f;
    }

    /* renamed from: c */
    public final void mo20424c(int i, C7931s<?, ?> sVar, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            C7933t<K, V, T> tVar = this.f17374b[i2];
            Object[] objArr = sVar.f17398d;
            int length = objArr.length;
            tVar.getClass();
            tVar.f17401b = objArr;
            tVar.f17402c = length;
            tVar.f17403d = 0;
            while (true) {
                C7933t<K, V, T> tVar2 = this.f17374b[i2];
                if (!C19383o.m32792b(tVar2.f17401b[tVar2.f17403d], k)) {
                    this.f17374b[i2].f17403d += 2;
                } else {
                    this.f17375c = i2;
                    return;
                }
            }
        } else {
            int i4 = 1 << ((i >> i3) & 31);
            if (sVar.mo20455h(i4)) {
                int f = sVar.mo20453f(i4);
                C7933t<K, V, T> tVar3 = this.f17374b[i2];
                Object[] objArr2 = sVar.f17398d;
                tVar3.getClass();
                C19383o.m32797g(objArr2, "buffer");
                tVar3.f17401b = objArr2;
                tVar3.f17402c = Integer.bitCount(sVar.f17395a) * 2;
                tVar3.f17403d = f;
                this.f17375c = i2;
                return;
            }
            int t = sVar.mo20466t(i4);
            C7931s<?, ?> s = sVar.mo20465s(t);
            C7933t<K, V, T> tVar4 = this.f17374b[i2];
            Object[] objArr3 = sVar.f17398d;
            tVar4.getClass();
            C19383o.m32797g(objArr3, "buffer");
            tVar4.f17401b = objArr3;
            tVar4.f17402c = Integer.bitCount(sVar.f17395a) * 2;
            tVar4.f17403d = t;
            mo20424c(i, s, k, i2 + 1);
        }
    }

    public final T next() {
        if (this.f17383e.f17381f != this.f17386h) {
            throw new ConcurrentModificationException();
        } else if (this.f17376d) {
            C7933t<K, V, T> tVar = this.f17374b[this.f17375c];
            this.f17384f = tVar.f17401b[tVar.f17403d];
            this.f17385g = true;
            return super.next();
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        if (this.f17385g) {
            boolean z = this.f17376d;
            if (!z) {
                C7917e<K, V> eVar = this.f17383e;
                K k = this.f17384f;
                C19389t.m32909c(eVar);
                eVar.remove(k);
            } else if (z) {
                C7933t<K, V, T> tVar = this.f17374b[this.f17375c];
                Object obj = tVar.f17401b[tVar.f17403d];
                C7917e<K, V> eVar2 = this.f17383e;
                K k2 = this.f17384f;
                C19389t.m32909c(eVar2);
                eVar2.remove(k2);
                mo20424c(obj != null ? obj.hashCode() : 0, this.f17383e.f17379d, obj, 0);
            } else {
                throw new NoSuchElementException();
            }
            this.f17384f = null;
            this.f17385g = false;
            this.f17386h = this.f17383e.f17381f;
            return;
        }
        throw new IllegalStateException();
    }
}
