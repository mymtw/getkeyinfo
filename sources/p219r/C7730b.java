package p219r;

import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;

/* renamed from: r.b */
public final class C7730b<Key, Value> {

    /* renamed from: a */
    public Object[] f17144a = new Object[16];

    /* renamed from: b */
    public Object[] f17145b = new Object[16];

    /* renamed from: c */
    public int f17146c;

    /* renamed from: a */
    public final int mo20206a(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = 0;
        int i2 = this.f17146c - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            Object obj2 = this.f17144a[i3];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i2 = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    Object obj3 = this.f17144a[i4];
                    if (obj3 == obj) {
                        return i4;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i5 = i3 + 1;
                int i6 = this.f17146c;
                while (true) {
                    if (i5 >= i6) {
                        i5 = this.f17146c;
                        break;
                    }
                    Object obj4 = this.f17144a[i5];
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

    /* renamed from: b */
    public final void mo20207b(Key key, Value value) {
        C19383o.m32797g(key, "key");
        int a = mo20206a(key);
        if (a >= 0) {
            this.f17145b[a] = value;
            return;
        }
        int i = -(a + 1);
        int i2 = this.f17146c;
        Object[] objArr = this.f17144a;
        boolean z = i2 == objArr.length;
        Object[] objArr2 = z ? new Object[(i2 * 2)] : objArr;
        int i3 = i + 1;
        C19318k.m32603U0(objArr, i3, objArr2, i, i2);
        if (z) {
            C19318k.m32605W0(this.f17144a, objArr2, 0, 0, i, 6);
        }
        objArr2[i] = key;
        this.f17144a = objArr2;
        Object[] objArr3 = z ? new Object[(this.f17146c * 2)] : this.f17145b;
        C19318k.m32603U0(this.f17145b, i3, objArr3, i, this.f17146c);
        if (z) {
            C19318k.m32605W0(this.f17145b, objArr3, 0, 0, i, 6);
        }
        objArr3[i] = value;
        this.f17145b = objArr3;
        this.f17146c++;
    }
}
