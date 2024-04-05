package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15562d;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p228s.C7791c;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.d */
public final class C1314d<E> extends AbstractPersistentList<E> {

    /* renamed from: b */
    public final Object[] f2869b;

    /* renamed from: c */
    public final Object[] f2870c;

    /* renamed from: d */
    public final int f2871d;

    /* renamed from: e */
    public final int f2872e;

    public C1314d(int i, int i2, Object[] objArr, Object[] objArr2) {
        C19383o.m32797g(objArr, "root");
        C19383o.m32797g(objArr2, "tail");
        this.f2869b = objArr;
        this.f2870c = objArr2;
        this.f2871d = i;
        this.f2872e = i2;
        if (!(mo5763a() > 32)) {
            StringBuilder h = C0072d.m201h("Trie-based persistent vector should have at least 33 elements, got ");
            h.append(mo5763a());
            throw new IllegalArgumentException(h.toString().toString());
        }
    }

    /* renamed from: v */
    public static Object[] m2722v(Object obj, int i, Object[] objArr, int i2) {
        int i3 = (i2 >> i) & 31;
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C19383o.m32796f(copyOf, "copyOf(this, newSize)");
        if (i == 0) {
            copyOf[i3] = obj;
        } else {
            Object obj2 = copyOf[i3];
            if (obj2 != null) {
                copyOf[i3] = m2722v(obj, i - 5, (Object[]) obj2, i2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
        return copyOf;
    }

    /* renamed from: B */
    public final C7791c<E> mo5762B(int i) {
        C15562d.m25207w(i, this.f2871d);
        int s = mo5778s();
        return i >= s ? mo5777q(this.f2869b, s, this.f2872e, i - s) : mo5777q(mo5776p(this.f2869b, this.f2872e, i, new C1313c(this.f2870c[0])), s, this.f2872e, 0);
    }

    /* renamed from: a */
    public final int mo5763a() {
        return this.f2871d;
    }

    public final C7791c<E> add(int i, E e) {
        C15562d.m25208x(i, mo5763a());
        if (i == mo5763a()) {
            return add(e);
        }
        int s = mo5778s();
        if (i >= s) {
            return mo5770g(this.f2869b, i - s, e);
        }
        C1313c cVar = new C1313c((Object) null);
        return mo5770g(mo5768e(this.f2869b, this.f2872e, i, e, cVar), 0, cVar.f2868b);
    }

    /* renamed from: c */
    public final PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.f2869b, this.f2870c, this.f2872e);
    }

    /* renamed from: e */
    public final Object[] mo5768e(Object[] objArr, int i, int i2, Object obj, C1313c cVar) {
        Object[] objArr2;
        Object[] objArr3 = objArr;
        C1313c cVar2 = cVar;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArr2 = new Object[32];
            } else {
                Object[] copyOf = Arrays.copyOf(objArr, 32);
                C19383o.m32796f(copyOf, "copyOf(this, newSize)");
                objArr2 = copyOf;
            }
            C19318k.m32603U0(objArr, i3 + 1, objArr2, i3, 31);
            cVar2.f2868b = objArr3[31];
            objArr2[i3] = obj;
            return objArr2;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        C19383o.m32796f(copyOf2, "copyOf(this, newSize)");
        int i4 = i - 5;
        Object obj2 = objArr3[i3];
        if (obj2 != null) {
            copyOf2[i3] = mo5768e((Object[]) obj2, i4, i2, obj, cVar);
            while (true) {
                i3++;
                if (i3 >= 32 || copyOf2[i3] == null) {
                    return copyOf2;
                }
                Object obj3 = objArr3[i3];
                if (obj3 != null) {
                    copyOf2[i3] = mo5768e((Object[]) obj3, i4, 0, cVar2.f2868b, cVar);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
            return copyOf2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: f0 */
    public final C7791c<E> mo5769f0(C19857l<? super E, Boolean> lVar) {
        PersistentVectorBuilder c = builder();
        c.mo5715L(lVar);
        return c.mo5726e();
    }

    /* renamed from: g */
    public final C1314d<E> mo5770g(Object[] objArr, int i, Object obj) {
        int s = this.f2871d - mo5778s();
        Object[] copyOf = Arrays.copyOf(this.f2870c, 32);
        C19383o.m32796f(copyOf, "copyOf(this, newSize)");
        if (s < 32) {
            C19318k.m32603U0(this.f2870c, i + 1, copyOf, i, s);
            copyOf[i] = obj;
            return new C1314d<>(this.f2871d + 1, this.f2872e, objArr, copyOf);
        }
        Object[] objArr2 = this.f2870c;
        Object obj2 = objArr2[31];
        C19318k.m32603U0(objArr2, i + 1, copyOf, i, s - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return mo5774m(objArr, copyOf, objArr3);
    }

    public final E get(int i) {
        E[] eArr;
        C15562d.m25207w(i, mo5763a());
        if (mo5778s() <= i) {
            eArr = this.f2870c;
        } else {
            eArr = this.f2869b;
            int i2 = this.f2872e;
            while (i2 > 0) {
                E e = eArr[(i >> i2) & 31];
                if (e != null) {
                    eArr = (Object[]) e;
                    i2 -= 5;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        return eArr[i & 31];
    }

    /* renamed from: l */
    public final Object[] mo5772l(Object[] objArr, int i, int i2, C1313c cVar) {
        Object[] objArr2;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            cVar.f2868b = objArr[i3];
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[i3];
            if (objArr3 != null) {
                objArr2 = mo5772l(objArr3, i - 5, i2, cVar);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
        if (objArr2 == null && i3 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C19383o.m32796f(copyOf, "copyOf(this, newSize)");
        copyOf[i3] = objArr2;
        return copyOf;
    }

    public final ListIterator<E> listIterator(int i) {
        C15562d.m25208x(i, mo5763a());
        return new C1315e(this.f2869b, i, this.f2870c, mo5763a(), (this.f2872e / 5) + 1);
    }

    /* renamed from: m */
    public final C1314d<E> mo5774m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f2871d >> 5;
        int i2 = this.f2872e;
        if (i > (1 << i2)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i3 = i2 + 5;
            return new C1314d<>(this.f2871d + 1, i3, mo5775n(i3, objArr4, objArr2), objArr3);
        }
        return new C1314d<>(this.f2871d + 1, this.f2872e, mo5775n(i2, objArr, objArr2), objArr3);
    }

    /* renamed from: n */
    public final Object[] mo5775n(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int a = ((mo5763a() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            C19383o.m32796f(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[a] = objArr2;
        } else {
            objArr3[a] = mo5775n(i - 5, (Object[]) objArr3[a], objArr2);
        }
        return objArr3;
    }

    /* renamed from: p */
    public final Object[] mo5776p(Object[] objArr, int i, int i2, C1313c cVar) {
        Object[] objArr2;
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            if (i4 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                C19383o.m32796f(objArr2, "copyOf(this, newSize)");
            }
            C19318k.m32603U0(objArr, i4, objArr2, i4 + 1, 32);
            objArr2[31] = cVar.f2868b;
            cVar.f2868b = objArr[i4];
            return objArr2;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((mo5778s() - 1) >> i);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C19383o.m32796f(copyOf, "copyOf(this, newSize)");
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                Object obj = copyOf[i3];
                if (obj != null) {
                    copyOf[i3] = mo5776p((Object[]) obj, i5, 0, cVar);
                    if (i3 == i6) {
                        break;
                    }
                    i3--;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        Object obj2 = copyOf[i4];
        if (obj2 != null) {
            copyOf[i4] = mo5776p((Object[]) obj2, i5, i2, cVar);
            return copyOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: q */
    public final AbstractPersistentList mo5777q(Object[] objArr, int i, int i2, int i3) {
        C1314d dVar;
        int i4 = this.f2871d - i;
        if (i4 != 1) {
            Object[] copyOf = Arrays.copyOf(this.f2870c, 32);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            int i5 = i4 - 1;
            if (i3 < i5) {
                C19318k.m32603U0(this.f2870c, i3, copyOf, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new C1314d((i + i4) - 1, i2, objArr, copyOf);
        } else if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                C19383o.m32796f(objArr, "copyOf(this, newSize)");
            }
            return new C1318h(objArr);
        } else {
            C1313c cVar = new C1313c((Object) null);
            Object[] l = mo5772l(objArr, i2, i - 1, cVar);
            C19383o.m32794d(l);
            Object obj = cVar.f2868b;
            if (obj != null) {
                Object[] objArr2 = (Object[]) obj;
                if (l[1] == null) {
                    Object obj2 = l[0];
                    if (obj2 != null) {
                        dVar = new C1314d(i, i2 - 5, (Object[]) obj2, objArr2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    }
                } else {
                    dVar = new C1314d(i, i2, l, objArr2);
                }
                return dVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
    }

    /* renamed from: s */
    public final int mo5778s() {
        return (mo5763a() - 1) & -32;
    }

    public final C7791c<E> set(int i, E e) {
        C15562d.m25207w(i, this.f2871d);
        if (mo5778s() <= i) {
            Object[] copyOf = Arrays.copyOf(this.f2870c, 32);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            copyOf[i & 31] = e;
            return new C1314d(this.f2871d, this.f2872e, this.f2869b, copyOf);
        }
        return new C1314d(this.f2871d, this.f2872e, m2722v(e, this.f2872e, this.f2869b, i), this.f2870c);
    }

    public final C7791c<E> add(E e) {
        int s = this.f2871d - mo5778s();
        if (s < 32) {
            Object[] copyOf = Arrays.copyOf(this.f2870c, 32);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            copyOf[s] = e;
            return new C1314d(this.f2871d + 1, this.f2872e, this.f2869b, copyOf);
        }
        Object[] objArr = new Object[32];
        objArr[0] = e;
        return mo5774m(this.f2869b, this.f2870c, objArr);
    }
}
