package p219r;

import androidx.compose.runtime.C1418v0;
import java.util.Arrays;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;

/* renamed from: r.d */
public final class C7733d<T> {

    /* renamed from: a */
    public int[] f17151a;

    /* renamed from: b */
    public Object[] f17152b;

    /* renamed from: c */
    public C7731c<T>[] f17153c;

    /* renamed from: d */
    public int f17154d;

    public C7733d() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.f17151a = iArr;
        this.f17152b = new Object[50];
        this.f17153c = new C7731c[50];
    }

    /* renamed from: a */
    public final void mo20225a(Object obj, Object obj2) {
        C7731c<T> cVar;
        int i;
        C19383o.m32797g(obj, "value");
        C19383o.m32797g(obj2, "scope");
        if (this.f17154d > 0) {
            i = mo20227c(obj);
            if (i >= 0) {
                cVar = mo20230f(i);
                cVar.add(obj2);
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.f17154d;
        int[] iArr = this.f17151a;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            this.f17152b[i4] = obj;
            cVar = this.f17153c[i4];
            if (cVar == null) {
                cVar = new C7731c<>();
                this.f17153c[i4] = cVar;
            }
            int i5 = this.f17154d;
            if (i2 < i5) {
                int[] iArr2 = this.f17151a;
                C19318k.m32600R0(i2 + 1, i2, i5, iArr2, iArr2);
            }
            this.f17151a[i2] = i4;
            this.f17154d++;
        } else {
            int length = iArr.length * 2;
            Object[] copyOf = Arrays.copyOf(this.f17153c, length);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            this.f17153c = (C7731c[]) copyOf;
            C7731c<T> cVar2 = new C7731c<>();
            this.f17153c[i3] = cVar2;
            Object[] copyOf2 = Arrays.copyOf(this.f17152b, length);
            C19383o.m32796f(copyOf2, "copyOf(this, newSize)");
            this.f17152b = copyOf2;
            copyOf2[i3] = obj;
            int[] iArr3 = new int[length];
            int i6 = this.f17154d;
            while (true) {
                i6++;
                if (i6 >= length) {
                    break;
                }
                iArr3[i6] = i6;
            }
            int i7 = this.f17154d;
            if (i2 < i7) {
                C19318k.m32600R0(i2 + 1, i2, i7, this.f17151a, iArr3);
            }
            iArr3[i2] = i3;
            if (i2 > 0) {
                C19318k.m32604V0(this.f17151a, iArr3, i2, 6);
            }
            this.f17151a = iArr3;
            this.f17154d++;
            cVar = cVar2;
        }
        cVar.add(obj2);
    }

    /* renamed from: b */
    public final boolean mo20226b(Object obj) {
        C19383o.m32797g(obj, "element");
        return mo20227c(obj) >= 0;
    }

    /* renamed from: c */
    public final int mo20227c(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = 0;
        int i2 = this.f17154d - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            Object obj2 = this.f17152b[this.f17151a[i3]];
            C19383o.m32794d(obj2);
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i2 = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    Object obj3 = this.f17152b[this.f17151a[i4]];
                    C19383o.m32794d(obj3);
                    if (obj3 == obj) {
                        return i4;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i5 = i3 + 1;
                int i6 = this.f17154d;
                while (true) {
                    if (i5 >= i6) {
                        i5 = this.f17154d;
                        break;
                    }
                    Object obj4 = this.f17152b[this.f17151a[i5]];
                    C19383o.m32794d(obj4);
                    if (obj4 == obj) {
                        return i5;
                    }
                    if (System.identityHashCode(obj4) != identityHashCode) {
                        break;
                    }
                    i5++;
                }
                return -(i5 + 1);
            }
        }
        return -(i + 1);
    }

    /* renamed from: d */
    public final boolean mo20228d(Object obj, C1418v0 v0Var) {
        int i;
        C7731c<T> cVar;
        C19383o.m32797g(obj, "value");
        C19383o.m32797g(v0Var, "scope");
        int c = mo20227c(obj);
        if (c < 0 || (cVar = this.f17153c[i]) == null) {
            return false;
        }
        boolean remove = cVar.remove(v0Var);
        if (cVar.f17147b == 0) {
            int i2 = c + 1;
            int i3 = this.f17154d;
            if (i2 < i3) {
                int[] iArr = this.f17151a;
                C19318k.m32600R0(c, i2, i3, iArr, iArr);
            }
            int[] iArr2 = this.f17151a;
            int i4 = this.f17154d - 1;
            iArr2[i4] = (i = this.f17151a[c]);
            this.f17152b[i] = null;
            this.f17154d = i4;
        }
        return remove;
    }

    /* renamed from: e */
    public final void mo20229e(T t) {
        C19383o.m32797g(t, "scope");
        int i = this.f17154d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.f17151a[i3];
            C7731c<T> cVar = this.f17153c[i4];
            C19383o.m32794d(cVar);
            cVar.remove(t);
            if (cVar.f17147b > 0) {
                if (i2 != i3) {
                    int[] iArr = this.f17151a;
                    int i5 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i5;
                }
                i2++;
            }
        }
        int i6 = this.f17154d;
        for (int i7 = i2; i7 < i6; i7++) {
            this.f17152b[this.f17151a[i7]] = null;
        }
        this.f17154d = i2;
    }

    /* renamed from: f */
    public final C7731c<T> mo20230f(int i) {
        C7731c<T> cVar = this.f17153c[this.f17151a[i]];
        C19383o.m32794d(cVar);
        return cVar;
    }
}
