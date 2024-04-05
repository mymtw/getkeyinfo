package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.google.android.gms.measurement.internal.C14921a0;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.C19310d;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19375g;
import kotlin.jvm.internal.C19383o;
import p228s.C7791c;
import p753kq.C19857l;
import p755lq.C19876b;

public final class PersistentVectorBuilder<E> extends C19310d<E> implements C19876b {

    /* renamed from: b */
    public C7791c<? extends E> f2857b;

    /* renamed from: c */
    public Object[] f2858c;

    /* renamed from: d */
    public Object[] f2859d;

    /* renamed from: e */
    public int f2860e;

    /* renamed from: f */
    public C14921a0 f2861f = new C14921a0();

    /* renamed from: g */
    public Object[] f2862g;

    /* renamed from: h */
    public Object[] f2863h;

    /* renamed from: i */
    public int f2864i;

    public PersistentVectorBuilder(C7791c<? extends E> cVar, Object[] objArr, Object[] objArr2, int i) {
        C19383o.m32797g(cVar, "vector");
        C19383o.m32797g(objArr2, "vectorTail");
        this.f2857b = cVar;
        this.f2858c = objArr;
        this.f2859d = objArr2;
        this.f2860e = i;
        this.f2862g = objArr;
        this.f2863h = objArr2;
        this.f2864i = cVar.size();
    }

    /* renamed from: g */
    public static void m2684g(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* renamed from: A */
    public final Object[] mo5705A(int i, int i2, Object[] objArr) {
        if (!(i2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i2 == 0) {
            return objArr;
        } else {
            int i3 = (i >> i2) & 31;
            Object[] objArr2 = objArr[i3];
            if (objArr2 != null) {
                Object A = mo5705A(i, i2 - 5, objArr2);
                if (i3 < 31) {
                    int i4 = i3 + 1;
                    if (objArr[i4] != null) {
                        if (mo5736q(objArr)) {
                            Arrays.fill(objArr, i4, 32, (Object) null);
                        }
                        Object[] y = mo5743y();
                        C19318k.m32603U0(objArr, 0, y, 0, i4);
                        objArr = y;
                    }
                }
                if (A == objArr[i3]) {
                    return objArr;
                }
                Object[] v = mo5741v(objArr);
                v[i3] = A;
                return v;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
    }

    /* renamed from: C */
    public final Object[] mo5706C(Object[] objArr, int i, int i2, C1313c cVar) {
        Object[] objArr2;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            cVar.f2868b = objArr[i3];
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[i3];
            if (objArr3 != null) {
                objArr2 = mo5706C(objArr3, i - 5, i2, cVar);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
        if (objArr2 == null && i3 == 0) {
            return null;
        }
        Object[] v = mo5741v(objArr);
        v[i3] = objArr2;
        return v;
    }

    /* renamed from: D */
    public final void mo5707D(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.f2862g = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f2863h = objArr;
            this.f2864i = i;
            this.f2860e = i2;
            return;
        }
        C1313c cVar = new C1313c((Object) null);
        C19383o.m32794d(objArr);
        Object[] C = mo5706C(objArr, i2, i, cVar);
        C19383o.m32794d(C);
        Object obj = cVar.f2868b;
        if (obj != null) {
            this.f2863h = (Object[]) obj;
            this.f2864i = i;
            if (C[1] == null) {
                this.f2862g = (Object[]) C[0];
                this.f2860e = i2 - 5;
                return;
            }
            this.f2862g = C;
            this.f2860e = i2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: E */
    public final Object[] mo5708E(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (!(i2 >= 0)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (i2 == 0) {
                return it.next();
            } else {
                Object[] v = mo5741v(objArr);
                int i3 = (i >> i2) & 31;
                int i4 = i2 - 5;
                v[i3] = mo5708E((Object[]) v[i3], i, i4, it);
                while (true) {
                    i3++;
                    if (i3 >= 32 || !it.hasNext()) {
                        return v;
                    }
                    v[i3] = mo5708E((Object[]) v[i3], 0, i4, it);
                }
                return v;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: F */
    public final Object[] mo5709F(Object[] objArr, int i, Object[][] objArr2) {
        C19375g u0 = C15588c1.m25350u0(objArr2);
        int i2 = i >> 5;
        int i3 = this.f2860e;
        Object[] E = i2 < (1 << i3) ? mo5708E(objArr, i, i3, u0) : mo5741v(objArr);
        while (u0.hasNext()) {
            this.f2860e += 5;
            E = mo5744z(E);
            int i4 = this.f2860e;
            mo5708E(E, 1 << i4, i4, u0);
        }
        return E;
    }

    /* renamed from: G */
    public final void mo5710G(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f2860e;
        if (size > (1 << i)) {
            this.f2862g = mo5711H(this.f2860e + 5, mo5744z(objArr), objArr2);
            this.f2863h = objArr3;
            this.f2860e += 5;
            this.f2864i = size() + 1;
        } else if (objArr == null) {
            this.f2862g = objArr2;
            this.f2863h = objArr3;
            this.f2864i = size() + 1;
        } else {
            this.f2862g = mo5711H(i, objArr, objArr2);
            this.f2863h = objArr3;
            this.f2864i = size() + 1;
        }
    }

    /* renamed from: H */
    public final Object[] mo5711H(int i, Object[] objArr, Object[] objArr2) {
        int size = ((size() - 1) >> i) & 31;
        Object[] v = mo5741v(objArr);
        if (i == 5) {
            v[size] = objArr2;
        } else {
            v[size] = mo5711H(i - 5, (Object[]) v[size], objArr2);
        }
        return v;
    }

    /* renamed from: I */
    public final int mo5712I(C19857l lVar, Object[] objArr, int i, int i2, C1313c cVar, ArrayList arrayList, ArrayList arrayList2) {
        if (mo5736q(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = cVar.f2868b;
        if (obj != null) {
            Object[] objArr2 = (Object[]) obj;
            Object[] objArr3 = objArr2;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                    if (i2 == 32) {
                        objArr3 = arrayList.isEmpty() ^ true ? (Object[]) arrayList.remove(arrayList.size() - 1) : mo5743y();
                        i2 = 0;
                    }
                    objArr3[i2] = obj2;
                    i2++;
                }
            }
            cVar.f2868b = objArr3;
            if (objArr2 != objArr3) {
                arrayList2.add(objArr2);
            }
            return i2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: J */
    public final int mo5713J(C19857l<? super E, Boolean> lVar, Object[] objArr, int i, C1313c cVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = mo5741v(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        cVar.f2868b = objArr2;
        return i2;
    }

    /* renamed from: K */
    public final int mo5714K(C19857l<? super E, Boolean> lVar, int i, C1313c cVar) {
        int J = mo5713J(lVar, this.f2863h, i, cVar);
        if (J == i) {
            return i;
        }
        Object obj = cVar.f2868b;
        if (obj != null) {
            Object[] objArr = (Object[]) obj;
            Arrays.fill(objArr, J, i, (Object) null);
            this.f2863h = objArr;
            this.f2864i = size() - (i - J);
            return J;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r0 != r10) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (mo5714K(r9, r10, r11) != r10) goto L_0x00f0;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5715L(p753kq.C19857l<? super E, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            int r10 = r18.mo5721U()
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c r11 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
            r12 = 0
            r11.<init>((java.lang.Object) r12)
            java.lang.Object[] r0 = r8.f2862g
            r14 = 0
            if (r0 != 0) goto L_0x001b
            int r0 = r8.mo5714K(r9, r10, r11)
            if (r0 == r10) goto L_0x00f1
            goto L_0x00f0
        L_0x001b:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a r15 = r8.mo5739s(r14)
            r7 = 32
            r0 = r7
        L_0x0022:
            if (r0 != r7) goto L_0x0035
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r0 = r15.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r8.mo5713J(r9, r0, r7, r11)
            goto L_0x0022
        L_0x0035:
            if (r0 != r7) goto L_0x004c
            int r0 = r8.mo5714K(r9, r10, r11)
            if (r0 != 0) goto L_0x0048
            java.lang.Object[] r1 = r8.f2862g
            int r2 = r18.size()
            int r3 = r8.f2860e
            r8.mo5707D(r2, r3, r1)
        L_0x0048:
            if (r0 == r10) goto L_0x00f1
            goto L_0x00f0
        L_0x004c:
            int r1 = r15.f2865b
            int r1 = r1 + -1
            int r6 = r1 << 5
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            r4 = r0
        L_0x005d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r15.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r18
            r1 = r19
            r5 = r11
            r13 = r6
            r6 = r17
            r14 = r7
            r7 = r16
            int r4 = r0.mo5712I(r1, r2, r3, r4, r5, r6, r7)
            r6 = r13
            r7 = r14
            r14 = 0
            goto L_0x005d
        L_0x007f:
            r13 = r6
            r14 = r7
            java.lang.Object[] r2 = r8.f2863h
            r0 = r18
            r1 = r19
            r3 = r10
            r5 = r11
            r6 = r17
            r7 = r16
            int r0 = r0.mo5712I(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r11.f2868b
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            if (r1 == 0) goto L_0x0106
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.Arrays.fill(r1, r0, r14, r12)
            boolean r3 = r16.isEmpty()
            if (r3 == 0) goto L_0x00a8
            java.lang.Object[] r3 = r8.f2862g
            kotlin.jvm.internal.C19383o.m32794d(r3)
            goto L_0x00b4
        L_0x00a8:
            java.lang.Object[] r3 = r8.f2862g
            int r4 = r8.f2860e
            java.util.Iterator r5 = r16.iterator()
            java.lang.Object[] r3 = r8.mo5708E(r3, r13, r4, r5)
        L_0x00b4:
            int r4 = r16.size()
            int r4 = r4 << 5
            int r6 = r13 + r4
            r4 = r6 & 31
            if (r4 != 0) goto L_0x00c2
            r4 = 1
            goto L_0x00c3
        L_0x00c2:
            r4 = 0
        L_0x00c3:
            if (r4 == 0) goto L_0x00fa
            if (r6 != 0) goto L_0x00cb
            r4 = 0
            r8.f2860e = r4
            goto L_0x00e9
        L_0x00cb:
            r4 = 0
            int r5 = r6 + -1
        L_0x00ce:
            int r7 = r8.f2860e
            int r9 = r5 >> r7
            if (r9 != 0) goto L_0x00e5
            int r7 = r7 + -5
            r8.f2860e = r7
            r3 = r3[r4]
            if (r3 == 0) goto L_0x00df
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L_0x00ce
        L_0x00df:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x00e5:
            java.lang.Object[] r12 = r8.mo5705A(r5, r7, r3)
        L_0x00e9:
            r8.f2862g = r12
            r8.f2863h = r1
            int r6 = r6 + r0
            r8.f2864i = r6
        L_0x00f0:
            r14 = 1
        L_0x00f1:
            if (r14 == 0) goto L_0x00f9
            int r0 = r8.modCount
            r1 = 1
            int r0 = r0 + r1
            r8.modCount = r0
        L_0x00f9:
            return r14
        L_0x00fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0106:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.mo5715L(kq.l):boolean");
    }

    /* renamed from: N */
    public final Object[] mo5716N(Object[] objArr, int i, int i2, C1313c cVar) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i4];
            Object[] v = mo5741v(objArr);
            C19318k.m32603U0(objArr, i4, v, i4 + 1, 32);
            v[31] = cVar.f2868b;
            cVar.f2868b = obj;
            return v;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((mo5718P() - 1) >> i);
        }
        Object[] v2 = mo5741v(objArr);
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                Object obj2 = v2[i3];
                if (obj2 != null) {
                    v2[i3] = mo5716N((Object[]) obj2, i5, 0, cVar);
                    if (i3 == i6) {
                        break;
                    }
                    i3--;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        Object obj3 = v2[i4];
        if (obj3 != null) {
            v2[i4] = mo5716N((Object[]) obj3, i5, i2, cVar);
            return v2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: O */
    public final Object mo5717O(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.f2863h[0];
            mo5707D(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.f2863h;
        Object obj2 = objArr2[i3];
        Object[] v = mo5741v(objArr2);
        C19318k.m32603U0(objArr2, i3, v, i3 + 1, size);
        v[size - 1] = null;
        this.f2862g = objArr;
        this.f2863h = v;
        this.f2864i = (i + size) - 1;
        this.f2860e = i2;
        return obj2;
    }

    /* renamed from: P */
    public final int mo5718P() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & -32;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] mo5719S(java.lang.Object[] r9, int r10, int r11, E r12, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1313c r13) {
        /*
            r8 = this;
            int r0 = r11 >> r10
            r0 = r0 & 31
            java.lang.Object[] r1 = r8.mo5741v(r9)
            if (r10 != 0) goto L_0x0019
            if (r1 == r9) goto L_0x0012
            int r9 = r8.modCount
            int r9 = r9 + 1
            r8.modCount = r9
        L_0x0012:
            r9 = r1[r0]
            r13.f2868b = r9
            r1[r0] = r12
            return r1
        L_0x0019:
            r9 = r1[r0]
            if (r9 == 0) goto L_0x002d
            r3 = r9
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r4 = r10 + -5
            r2 = r8
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object[] r9 = r2.mo5719S(r3, r4, r5, r6, r7)
            r1[r0] = r9
            return r1
        L_0x002d:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.mo5719S(java.lang.Object[], int, int, java.lang.Object, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c):java.lang.Object[]");
    }

    /* renamed from: T */
    public final void mo5720T(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArr4;
        if (i3 >= 1) {
            Object[] v = mo5741v(objArr);
            objArr2[0] = v;
            int i4 = i & 31;
            int size = ((collection.size() + i) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                C19318k.m32603U0(v, size + 1, objArr3, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    objArr4 = v;
                } else {
                    objArr4 = mo5743y();
                    i3--;
                    objArr2[i3] = objArr4;
                }
                int i7 = i2 - i6;
                C19318k.m32603U0(v, 0, objArr3, i7, i2);
                C19318k.m32603U0(v, size + 1, objArr4, i4, i7);
                objArr3 = objArr4;
            }
            Iterator<? extends E> it = collection.iterator();
            m2684g(v, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] y = mo5743y();
                m2684g(y, 0, it);
                objArr2[i8] = y;
            }
            m2684g(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: U */
    public final int mo5721U() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & -32);
    }

    public final boolean add(E e) {
        this.modCount++;
        int U = mo5721U();
        if (U < 32) {
            Object[] v = mo5741v(this.f2863h);
            v[U] = e;
            this.f2863h = v;
            this.f2864i = size() + 1;
        } else {
            mo5710G(this.f2862g, this.f2863h, mo5744z(e));
        }
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        C19383o.m32797g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int U = mo5721U();
        Iterator<? extends E> it = collection.iterator();
        if (32 - U >= collection.size()) {
            Object[] v = mo5741v(this.f2863h);
            m2684g(v, U, it);
            this.f2863h = v;
            this.f2864i = collection.size() + size();
        } else {
            int size = ((collection.size() + U) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] v2 = mo5741v(this.f2863h);
            m2684g(v2, U, it);
            objArr[0] = v2;
            for (int i = 1; i < size; i++) {
                Object[] y = mo5743y();
                m2684g(y, 0, it);
                objArr[i] = y;
            }
            this.f2862g = mo5709F(this.f2862g, mo5718P(), objArr);
            Object[] y2 = mo5743y();
            m2684g(y2, 0, it);
            this.f2863h = y2;
            this.f2864i = collection.size() + size();
        }
        return true;
    }

    /* renamed from: e */
    public final C7791c<E> mo5726e() {
        C7791c<? extends E> cVar;
        Object[] objArr = this.f2862g;
        if (objArr == this.f2858c && this.f2863h == this.f2859d) {
            cVar = this.f2857b;
        } else {
            this.f2861f = new C14921a0();
            this.f2858c = objArr;
            Object[] objArr2 = this.f2863h;
            this.f2859d = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    cVar = C1318h.f2880c;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f2863h, size());
                    C19383o.m32796f(copyOf, "copyOf(this, newSize)");
                    cVar = new C1318h<>(copyOf);
                }
            } else {
                C19383o.m32794d(objArr);
                cVar = new C1314d<>(size(), this.f2860e, objArr, this.f2863h);
            }
        }
        this.f2857b = cVar;
        return cVar;
    }

    public final E get(int i) {
        E[] eArr;
        C15562d.m25207w(i, size());
        if (mo5718P() <= i) {
            eArr = this.f2863h;
        } else {
            eArr = this.f2862g;
            C19383o.m32794d(eArr);
            int i2 = this.f2860e;
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

    public final int getSize() {
        return this.f2864i;
    }

    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    /* renamed from: l */
    public final int mo5730l() {
        return this.modCount;
    }

    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: m */
    public final void mo5733m(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f2862g != null) {
            int i4 = i >> 5;
            C1311a s = mo5739s(mo5718P() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (s.f2865b - 1 != i4) {
                Object[] objArr4 = (Object[]) s.previous();
                C19318k.m32603U0(objArr4, 0, objArr3, 32 - i2, 32);
                objArr3 = mo5742w(i2, objArr4);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) s.previous();
            int P = i3 - (((mo5718P() >> 5) - 1) - i4);
            if (P < i3) {
                objArr2 = objArr[P];
                C19383o.m32794d(objArr2);
            }
            mo5720T(collection, i, objArr5, 32, objArr, P, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: n */
    public final Object[] mo5734n(Object[] objArr, int i, int i2, Object obj, C1313c cVar) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            cVar.f2868b = objArr[31];
            Object[] v = mo5741v(objArr);
            C19318k.m32603U0(objArr, i3 + 1, v, i3, 31);
            v[i3] = obj;
            return v;
        }
        Object[] v2 = mo5741v(objArr);
        int i4 = i - 5;
        Object obj3 = v2[i3];
        if (obj3 != null) {
            v2[i3] = mo5734n((Object[]) obj3, i4, i2, obj, cVar);
            while (true) {
                i3++;
                if (i3 >= 32 || (obj2 = v2[i3]) == null) {
                    return v2;
                }
                v2[i3] = mo5734n((Object[]) obj2, i4, 0, cVar.f2868b, cVar);
            }
            return v2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: p */
    public final void mo5735p(Object[] objArr, int i, E e) {
        int U = mo5721U();
        Object[] v = mo5741v(this.f2863h);
        if (U < 32) {
            C19318k.m32603U0(this.f2863h, i + 1, v, i, U);
            v[i] = e;
            this.f2862g = objArr;
            this.f2863h = v;
            this.f2864i = size() + 1;
            return;
        }
        Object[] objArr2 = this.f2863h;
        Object obj = objArr2[31];
        C19318k.m32603U0(objArr2, i + 1, v, i, 31);
        v[i] = e;
        mo5710G(objArr, v, mo5744z(obj));
    }

    /* renamed from: q */
    public final boolean mo5736q(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f2861f;
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C19383o.m32797g(collection, "elements");
        return mo5715L(new PersistentVectorBuilder$removeAll$1(collection));
    }

    public final E removeAt(int i) {
        C15562d.m25207w(i, size());
        this.modCount++;
        int P = mo5718P();
        if (i >= P) {
            return mo5717O(this.f2862g, P, this.f2860e, i - P);
        }
        C1313c cVar = new C1313c(this.f2863h[0]);
        Object[] objArr = this.f2862g;
        C19383o.m32794d(objArr);
        mo5717O(mo5716N(objArr, this.f2860e, i, cVar), P, this.f2860e, 0);
        return cVar.f2868b;
    }

    /* renamed from: s */
    public final C1311a mo5739s(int i) {
        if (this.f2862g != null) {
            int P = mo5718P() >> 5;
            C15562d.m25208x(i, P);
            int i2 = this.f2860e;
            if (i2 == 0) {
                Object[] objArr = this.f2862g;
                C19383o.m32794d(objArr);
                return new C1317g(objArr, i);
            }
            Object[] objArr2 = this.f2862g;
            C19383o.m32794d(objArr2);
            return new C1319i(objArr2, i, P, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final E set(int i, E e) {
        C15562d.m25207w(i, size());
        if (mo5718P() <= i) {
            E[] v = mo5741v(this.f2863h);
            if (v != this.f2863h) {
                this.modCount++;
            }
            int i2 = i & 31;
            E e2 = v[i2];
            v[i2] = e;
            this.f2863h = v;
            return e2;
        }
        C1313c cVar = new C1313c((Object) null);
        Object[] objArr = this.f2862g;
        C19383o.m32794d(objArr);
        this.f2862g = mo5719S(objArr, this.f2860e, i, e, cVar);
        return cVar.f2868b;
    }

    /* renamed from: v */
    public final Object[] mo5741v(Object[] objArr) {
        if (objArr == null) {
            return mo5743y();
        }
        if (mo5736q(objArr)) {
            return objArr;
        }
        Object[] y = mo5743y();
        int length = objArr.length;
        C19318k.m32605W0(objArr, y, 0, 0, length > 32 ? 32 : length, 6);
        return y;
    }

    /* renamed from: w */
    public final Object[] mo5742w(int i, Object[] objArr) {
        if (mo5736q(objArr)) {
            C19318k.m32603U0(objArr, i, objArr, 0, 32 - i);
            return objArr;
        }
        Object[] y = mo5743y();
        C19318k.m32603U0(objArr, i, y, 0, 32 - i);
        return y;
    }

    /* renamed from: y */
    public final Object[] mo5743y() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f2861f;
        return objArr;
    }

    /* renamed from: z */
    public final Object[] mo5744z(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f2861f;
        return objArr;
    }

    public final ListIterator<E> listIterator(int i) {
        C15562d.m25208x(i, size());
        return new C1316f(this, i);
    }

    public final void add(int i, E e) {
        C15562d.m25208x(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        this.modCount++;
        int P = mo5718P();
        if (i >= P) {
            mo5735p(this.f2862g, i - P, e);
            return;
        }
        C1313c cVar = new C1313c((Object) null);
        Object[] objArr = this.f2862g;
        C19383o.m32794d(objArr);
        mo5735p(mo5734n(objArr, this.f2860e, i, e, cVar), 0, cVar.f2868b);
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        Object[] objArr;
        int i2 = i;
        Collection<? extends E> collection2 = collection;
        C19383o.m32797g(collection2, "elements");
        C15562d.m25208x(i, size());
        if (i2 == size()) {
            return addAll(collection2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i3 = (i2 >> 5) << 5;
        int size = ((collection.size() + (size() - i3)) - 1) / 32;
        if (size == 0) {
            mo5718P();
            int i4 = i2 & 31;
            Object[] objArr2 = this.f2863h;
            Object[] v = mo5741v(objArr2);
            C19318k.m32603U0(objArr2, (((collection.size() + i2) - 1) & 31) + 1, v, i4, mo5721U());
            m2684g(v, i4, collection.iterator());
            this.f2863h = v;
            this.f2864i = collection.size() + size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int U = mo5721U();
        int size2 = collection.size() + size();
        if (size2 > 32) {
            size2 -= (size2 - 1) & -32;
        }
        if (i2 >= mo5718P()) {
            objArr = mo5743y();
            mo5720T(collection, i, this.f2863h, U, objArr3, size, objArr);
        } else if (size2 > U) {
            int i5 = size2 - U;
            objArr = mo5742w(i5, this.f2863h);
            mo5733m(collection, i, i5, objArr3, size, objArr);
        } else {
            Object[] objArr4 = this.f2863h;
            objArr = mo5743y();
            int i6 = U - size2;
            C19318k.m32603U0(objArr4, 0, objArr, i6, U);
            int i7 = 32 - i6;
            Object[] w = mo5742w(i7, this.f2863h);
            int i8 = size - 1;
            objArr3[i8] = w;
            mo5733m(collection, i, i7, objArr3, i8, w);
        }
        this.f2862g = mo5709F(this.f2862g, i3, objArr3);
        this.f2863h = objArr;
        this.f2864i = collection.size() + size();
        return true;
    }
}
