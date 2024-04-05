package p239t;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: t.d */
public abstract class C7916d<K, V, T> implements Iterator<T>, C19875a {

    /* renamed from: b */
    public final C7933t<K, V, T>[] f17374b;

    /* renamed from: c */
    public int f17375c;

    /* renamed from: d */
    public boolean f17376d = true;

    public C7916d(C7931s<K, V> sVar, C7933t<K, V, T>[] tVarArr) {
        C19383o.m32797g(sVar, "node");
        this.f17374b = tVarArr;
        C7933t<K, V, T> tVar = tVarArr[0];
        Object[] objArr = sVar.f17398d;
        tVar.getClass();
        C19383o.m32797g(objArr, "buffer");
        tVar.f17401b = objArr;
        tVar.f17402c = Integer.bitCount(sVar.f17395a) * 2;
        tVar.f17403d = 0;
        this.f17375c = 0;
        mo20406a();
    }

    /* renamed from: a */
    public final void mo20406a() {
        C7933t<K, V, T>[] tVarArr = this.f17374b;
        int i = this.f17375c;
        C7933t<K, V, T> tVar = tVarArr[i];
        if (!(tVar.f17403d < tVar.f17402c)) {
            while (-1 < i) {
                int b = mo20407b(i);
                if (b == -1) {
                    C7933t<K, V, T> tVar2 = this.f17374b[i];
                    int i2 = tVar2.f17403d;
                    Object[] objArr = tVar2.f17401b;
                    if (i2 < objArr.length) {
                        int length = objArr.length;
                        tVar2.f17403d = i2 + 1;
                        b = mo20407b(i);
                    }
                }
                if (b != -1) {
                    this.f17375c = b;
                    return;
                }
                if (i > 0) {
                    C7933t<K, V, T> tVar3 = this.f17374b[i - 1];
                    int i3 = tVar3.f17403d;
                    int length2 = tVar3.f17401b.length;
                    tVar3.f17403d = i3 + 1;
                }
                C7933t<K, V, T> tVar4 = this.f17374b[i];
                Object[] objArr2 = C7931s.f17394e.f17398d;
                tVar4.getClass();
                C19383o.m32797g(objArr2, "buffer");
                tVar4.f17401b = objArr2;
                tVar4.f17402c = 0;
                tVar4.f17403d = 0;
                i--;
            }
            this.f17376d = false;
        }
    }

    /* renamed from: b */
    public final int mo20407b(int i) {
        C7933t<K, V, T>[] tVarArr = this.f17374b;
        C7933t<K, V, T> tVar = tVarArr[i];
        int i2 = tVar.f17403d;
        if (i2 < tVar.f17402c) {
            return i;
        }
        Object[] objArr = tVar.f17401b;
        if (!(i2 < objArr.length)) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        if (obj != null) {
            C7931s sVar = (C7931s) obj;
            if (i == 6) {
                C7933t<K, V, T> tVar2 = tVarArr[i + 1];
                Object[] objArr2 = sVar.f17398d;
                int length2 = objArr2.length;
                tVar2.getClass();
                tVar2.f17401b = objArr2;
                tVar2.f17402c = length2;
                tVar2.f17403d = 0;
            } else {
                C7933t<K, V, T> tVar3 = tVarArr[i + 1];
                Object[] objArr3 = sVar.f17398d;
                tVar3.getClass();
                C19383o.m32797g(objArr3, "buffer");
                tVar3.f17401b = objArr3;
                tVar3.f17402c = Integer.bitCount(sVar.f17395a) * 2;
                tVar3.f17403d = 0;
            }
            return mo20407b(i + 1);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
    }

    public final boolean hasNext() {
        return this.f17376d;
    }

    public T next() {
        if (this.f17376d) {
            T next = this.f17374b[this.f17375c].next();
            mo20406a();
            return next;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
