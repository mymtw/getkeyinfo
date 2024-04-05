package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.i */
public final class C1319i<E> extends C1311a<E> {

    /* renamed from: d */
    public int f2882d;

    /* renamed from: e */
    public Object[] f2883e;

    /* renamed from: f */
    public boolean f2884f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1319i(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        C19383o.m32797g(objArr, "root");
        this.f2882d = i3;
        Object[] objArr2 = new Object[i3];
        this.f2883e = objArr2;
        boolean z = i == i2;
        this.f2884f = z;
        objArr2[0] = objArr;
        mo5791b(i - (z ? 1 : 0), 1);
    }

    /* renamed from: a */
    public final E mo5790a() {
        int i = this.f2865b & 31;
        Object obj = this.f2883e[this.f2882d - 1];
        if (obj != null) {
            return ((Object[]) obj)[i];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    /* renamed from: b */
    public final void mo5791b(int i, int i2) {
        int i3 = (this.f2882d - i2) * 5;
        while (i2 < this.f2882d) {
            Object[] objArr = this.f2883e;
            Object[] objArr2 = objArr[i2 - 1];
            if (objArr2 != null) {
                objArr[i2] = objArr2[(i >> i3) & 31];
                i3 -= 5;
                i2++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
    }

    public final E next() {
        int i;
        if (hasNext()) {
            E a = mo5790a();
            int i2 = this.f2865b + 1;
            this.f2865b = i2;
            if (i2 == this.f2866c) {
                this.f2884f = true;
                return a;
            }
            int i3 = 0;
            while (true) {
                i = this.f2865b;
                if (((i >> i3) & 31) != 0) {
                    break;
                }
                i3 += 5;
            }
            if (i3 > 0) {
                mo5791b(i, ((this.f2882d - 1) - (i3 / 5)) + 1);
            }
            return a;
        }
        throw new NoSuchElementException();
    }

    public final E previous() {
        int i;
        if (hasPrevious()) {
            this.f2865b--;
            int i2 = 0;
            if (this.f2884f) {
                this.f2884f = false;
                return mo5790a();
            }
            while (true) {
                i = this.f2865b;
                if (((i >> i2) & 31) != 31) {
                    break;
                }
                i2 += 5;
            }
            if (i2 > 0) {
                mo5791b(i, ((this.f2882d - 1) - (i2 / 5)) + 1);
            }
            return mo5790a();
        }
        throw new NoSuchElementException();
    }
}
