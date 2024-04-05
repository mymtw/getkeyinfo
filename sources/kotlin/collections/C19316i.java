package kotlin.collections;

import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: kotlin.collections.i */
public final class C19316i<E> extends C19310d<E> {

    /* renamed from: e */
    public static final Object[] f43183e = new Object[0];

    /* renamed from: b */
    public int f43184b;

    /* renamed from: c */
    public Object[] f43185c = f43183e;

    /* renamed from: d */
    public int f43186d;

    /* renamed from: a */
    public final void mo71743a(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f43185c.length;
        while (i < length && it.hasNext()) {
            this.f43185c[i] = it.next();
            i++;
        }
        int i2 = this.f43184b;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f43185c[i3] = it.next();
        }
        this.f43186d = collection.size() + size();
    }

    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        C19383o.m32797g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        mo71748c(collection.size() + size());
        mo71743a(mo71752g(size() + this.f43184b), collection);
        return true;
    }

    public final void addLast(E e) {
        mo71748c(size() + 1);
        this.f43185c[mo71752g(size() + this.f43184b)] = e;
        this.f43186d = size() + 1;
    }

    /* renamed from: c */
    public final void mo71748c(int i) {
        if (i >= 0) {
            Object[] objArr = this.f43185c;
            if (i > objArr.length) {
                if (objArr == f43183e) {
                    if (i < 10) {
                        i = 10;
                    }
                    this.f43185c = new Object[i];
                    return;
                }
                int length = objArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i < 0) {
                    i2 = i;
                }
                if (i2 - 2147483639 > 0) {
                    i2 = i > 2147483639 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 2147483639;
                }
                Object[] objArr2 = new Object[i2];
                C19318k.m32603U0(objArr, 0, objArr2, this.f43184b, objArr.length);
                Object[] objArr3 = this.f43185c;
                int length2 = objArr3.length;
                int i3 = this.f43184b;
                C19318k.m32603U0(objArr3, length2 - i3, objArr2, 0, i3);
                this.f43184b = 0;
                this.f43185c = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final void clear() {
        int g = mo71752g(size() + this.f43184b);
        int i = this.f43184b;
        if (i < g) {
            C19318k.m32609a1(i, this.f43185c, g);
        } else if (!isEmpty()) {
            Object[] objArr = this.f43185c;
            C19318k.m32609a1(this.f43184b, objArr, objArr.length);
            C19318k.m32609a1(0, this.f43185c, g);
        }
        this.f43184b = 0;
        this.f43186d = 0;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int mo71751e(int i) {
        if (i == C19318k.m32614f1(this.f43185c)) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: g */
    public final int mo71752g(int i) {
        Object[] objArr = this.f43185c;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final E get(int i) {
        int size = size();
        if (i >= 0 && i < size) {
            return this.f43185c[mo71752g(this.f43184b + i)];
        }
        throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", size));
    }

    public final int getSize() {
        return this.f43186d;
    }

    public final int indexOf(Object obj) {
        int i;
        int g = mo71752g(size() + this.f43184b);
        int i2 = this.f43184b;
        if (i2 < g) {
            while (i2 < g) {
                if (C19383o.m32792b(obj, this.f43185c[i2])) {
                    i = this.f43184b;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < g) {
            return -1;
        } else {
            int length = this.f43185c.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < g) {
                        if (C19383o.m32792b(obj, this.f43185c[i3])) {
                            i2 = i3 + this.f43185c.length;
                            i = this.f43184b;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (C19383o.m32792b(obj, this.f43185c[i2])) {
                    i = this.f43184b;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int lastIndexOf(Object obj) {
        int i;
        int i2;
        int g = mo71752g(size() + this.f43184b);
        int i3 = this.f43184b;
        if (i3 < g) {
            i = g - 1;
            if (i3 <= i) {
                while (!C19383o.m32792b(obj, this.f43185c[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.f43184b;
            }
            return -1;
        }
        if (i3 > g) {
            int i4 = g - 1;
            while (true) {
                if (-1 >= i4) {
                    int f1 = C19318k.m32614f1(this.f43185c);
                    int i5 = this.f43184b;
                    if (i5 <= f1) {
                        while (!C19383o.m32792b(obj, this.f43185c[i])) {
                            if (i != i5) {
                                f1 = i - 1;
                            }
                        }
                        i2 = this.f43184b;
                    }
                } else if (C19383o.m32792b(obj, this.f43185c[i4])) {
                    i = i4 + this.f43185c.length;
                    i2 = this.f43184b;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0098
            java.lang.Object[] r0 = r11.f43185c
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0098
        L_0x0019:
            int r0 = r11.f43184b
            int r3 = r11.size()
            int r3 = r3 + r0
            int r0 = r11.mo71752g(r3)
            int r3 = r11.f43184b
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r4 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r5 = r11.f43185c
            r5 = r5[r3]
            boolean r6 = r12.contains(r5)
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x003f
            java.lang.Object[] r6 = r11.f43185c
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f43185c
            kotlin.collections.C19318k.m32609a1(r4, r12, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f43185c
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f43185c
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f43185c
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.mo71752g(r6)
        L_0x006d:
            if (r1 >= r0) goto L_0x0089
            java.lang.Object[] r5 = r11.f43185c
            r6 = r5[r1]
            r5[r1] = r4
            boolean r5 = r12.contains(r6)
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0085
            java.lang.Object[] r5 = r11.f43185c
            r5[r3] = r6
            int r3 = r11.mo71751e(r3)
            goto L_0x0086
        L_0x0085:
            r7 = r2
        L_0x0086:
            int r1 = r1 + 1
            goto L_0x006d
        L_0x0089:
            r4 = r3
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0098
            int r12 = r11.f43184b
            int r4 = r4 - r12
            if (r4 >= 0) goto L_0x0096
            java.lang.Object[] r12 = r11.f43185c
            int r12 = r12.length
            int r4 = r4 + r12
        L_0x0096:
            r11.f43186d = r4
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C19316i.removeAll(java.util.Collection):boolean");
    }

    public final E removeAt(int i) {
        int size = size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", size));
        } else if (i == C17782b.m29859Y(this)) {
            if (!isEmpty()) {
                int g = mo71752g(C17782b.m29859Y(this) + this.f43184b);
                E[] eArr = this.f43185c;
                E e = eArr[g];
                eArr[g] = null;
                this.f43186d = size() - 1;
                return e;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i == 0) {
            return removeFirst();
        } else {
            int g2 = mo71752g(this.f43184b + i);
            E e2 = this.f43185c[g2];
            if (i < (size() >> 1)) {
                int i2 = this.f43184b;
                if (g2 >= i2) {
                    Object[] objArr = this.f43185c;
                    C19318k.m32603U0(objArr, i2 + 1, objArr, i2, g2);
                } else {
                    Object[] objArr2 = this.f43185c;
                    C19318k.m32603U0(objArr2, 1, objArr2, 0, g2);
                    Object[] objArr3 = this.f43185c;
                    objArr3[0] = objArr3[objArr3.length - 1];
                    int i3 = this.f43184b;
                    C19318k.m32603U0(objArr3, i3 + 1, objArr3, i3, objArr3.length - 1);
                }
                Object[] objArr4 = this.f43185c;
                int i4 = this.f43184b;
                objArr4[i4] = null;
                this.f43184b = mo71751e(i4);
            } else {
                int g3 = mo71752g(C17782b.m29859Y(this) + this.f43184b);
                if (g2 <= g3) {
                    Object[] objArr5 = this.f43185c;
                    C19318k.m32603U0(objArr5, g2, objArr5, g2 + 1, g3 + 1);
                } else {
                    Object[] objArr6 = this.f43185c;
                    C19318k.m32603U0(objArr6, g2, objArr6, g2 + 1, objArr6.length);
                    Object[] objArr7 = this.f43185c;
                    objArr7[objArr7.length - 1] = objArr7[0];
                    C19318k.m32603U0(objArr7, 0, objArr7, 1, g3 + 1);
                }
                this.f43185c[g3] = null;
            }
            this.f43186d = size() - 1;
            return e2;
        }
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.f43185c;
            int i = this.f43184b;
            E e = eArr[i];
            eArr[i] = null;
            this.f43184b = mo71751e(i);
            this.f43186d = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0095
            java.lang.Object[] r0 = r11.f43185c
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0095
        L_0x0019:
            int r0 = r11.f43184b
            int r3 = r11.size()
            int r3 = r3 + r0
            int r0 = r11.mo71752g(r3)
            int r3 = r11.f43184b
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r4 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r5 = r11.f43185c
            r5 = r5[r3]
            boolean r6 = r12.contains(r5)
            if (r6 == 0) goto L_0x003e
            java.lang.Object[] r6 = r11.f43185c
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f43185c
            kotlin.collections.C19318k.m32609a1(r4, r12, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f43185c
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f43185c
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f43185c
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.mo71752g(r6)
        L_0x006b:
            if (r1 >= r0) goto L_0x0086
            java.lang.Object[] r5 = r11.f43185c
            r6 = r5[r1]
            r5[r1] = r4
            boolean r5 = r12.contains(r6)
            if (r5 == 0) goto L_0x0082
            java.lang.Object[] r5 = r11.f43185c
            r5[r3] = r6
            int r3 = r11.mo71751e(r3)
            goto L_0x0083
        L_0x0082:
            r7 = r2
        L_0x0083:
            int r1 = r1 + 1
            goto L_0x006b
        L_0x0086:
            r4 = r3
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0095
            int r12 = r11.f43184b
            int r4 = r4 - r12
            if (r4 >= 0) goto L_0x0093
            java.lang.Object[] r12 = r11.f43185c
            int r12 = r12.length
            int r4 = r4 + r12
        L_0x0093:
            r11.f43186d = r4
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C19316i.retainAll(java.util.Collection):boolean");
    }

    public final E set(int i, E e) {
        int size = size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", size));
        }
        int g = mo71752g(this.f43184b + i);
        E[] eArr = this.f43185c;
        E e2 = eArr[g];
        eArr[g] = e;
        return e2;
    }

    public final <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        if (tArr.length < size()) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), size());
            C19383o.m32795e(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (Object[]) newInstance;
        }
        int g = mo71752g(size() + this.f43184b);
        int i = this.f43184b;
        if (i < g) {
            C19318k.m32605W0(this.f43185c, tArr, 0, i, g, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f43185c;
            C19318k.m32603U0(objArr, 0, tArr, this.f43184b, objArr.length);
            Object[] objArr2 = this.f43185c;
            C19318k.m32603U0(objArr2, objArr2.length - this.f43184b, tArr, 0, g);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public final void add(int i, E e) {
        int size = size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", size));
        } else if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            mo71748c(size() + 1);
            int i2 = this.f43184b;
            int f1 = i2 == 0 ? C19318k.m32614f1(this.f43185c) : i2 - 1;
            this.f43184b = f1;
            this.f43185c[f1] = e;
            this.f43186d = size() + 1;
        } else {
            mo71748c(size() + 1);
            int g = mo71752g(this.f43184b + i);
            if (i < ((size() + 1) >> 1)) {
                int f12 = g == 0 ? C19318k.m32614f1(this.f43185c) : g - 1;
                int i3 = this.f43184b;
                int f13 = i3 == 0 ? C19318k.m32614f1(this.f43185c) : i3 - 1;
                int i4 = this.f43184b;
                if (f12 >= i4) {
                    Object[] objArr = this.f43185c;
                    objArr[f13] = objArr[i4];
                    C19318k.m32603U0(objArr, i4, objArr, i4 + 1, f12 + 1);
                } else {
                    Object[] objArr2 = this.f43185c;
                    C19318k.m32603U0(objArr2, i4 - 1, objArr2, i4, objArr2.length);
                    Object[] objArr3 = this.f43185c;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C19318k.m32603U0(objArr3, 0, objArr3, 1, f12 + 1);
                }
                this.f43185c[f12] = e;
                this.f43184b = f13;
            } else {
                int g2 = mo71752g(size() + this.f43184b);
                if (g < g2) {
                    Object[] objArr4 = this.f43185c;
                    C19318k.m32603U0(objArr4, g + 1, objArr4, g, g2);
                } else {
                    Object[] objArr5 = this.f43185c;
                    C19318k.m32603U0(objArr5, 1, objArr5, 0, g2);
                    Object[] objArr6 = this.f43185c;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C19318k.m32603U0(objArr6, g + 1, objArr6, g, objArr6.length - 1);
                }
                this.f43185c[g] = e;
            }
            this.f43186d = size() + 1;
        }
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        C19383o.m32797g(collection, "elements");
        int size = size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", size));
        } else if (collection.isEmpty()) {
            return false;
        } else {
            if (i == size()) {
                return addAll(collection);
            }
            mo71748c(collection.size() + size());
            int g = mo71752g(size() + this.f43184b);
            int g2 = mo71752g(this.f43184b + i);
            int size2 = collection.size();
            if (i < ((size() + 1) >> 1)) {
                int i2 = this.f43184b;
                int i3 = i2 - size2;
                if (g2 < i2) {
                    Object[] objArr = this.f43185c;
                    C19318k.m32603U0(objArr, i3, objArr, i2, objArr.length);
                    if (size2 >= g2) {
                        Object[] objArr2 = this.f43185c;
                        C19318k.m32603U0(objArr2, objArr2.length - size2, objArr2, 0, g2);
                    } else {
                        Object[] objArr3 = this.f43185c;
                        C19318k.m32603U0(objArr3, objArr3.length - size2, objArr3, 0, size2);
                        Object[] objArr4 = this.f43185c;
                        C19318k.m32603U0(objArr4, 0, objArr4, size2, g2);
                    }
                } else if (i3 >= 0) {
                    Object[] objArr5 = this.f43185c;
                    C19318k.m32603U0(objArr5, i3, objArr5, i2, g2);
                } else {
                    Object[] objArr6 = this.f43185c;
                    i3 += objArr6.length;
                    int i4 = g2 - i2;
                    int length = objArr6.length - i3;
                    if (length >= i4) {
                        C19318k.m32603U0(objArr6, i3, objArr6, i2, g2);
                    } else {
                        C19318k.m32603U0(objArr6, i3, objArr6, i2, i2 + length);
                        Object[] objArr7 = this.f43185c;
                        C19318k.m32603U0(objArr7, 0, objArr7, this.f43184b + length, g2);
                    }
                }
                this.f43184b = i3;
                int i5 = g2 - size2;
                if (i5 < 0) {
                    i5 += this.f43185c.length;
                }
                mo71743a(i5, collection);
            } else {
                int i6 = g2 + size2;
                if (g2 < g) {
                    int i7 = size2 + g;
                    Object[] objArr8 = this.f43185c;
                    if (i7 <= objArr8.length) {
                        C19318k.m32603U0(objArr8, i6, objArr8, g2, g);
                    } else if (i6 >= objArr8.length) {
                        C19318k.m32603U0(objArr8, i6 - objArr8.length, objArr8, g2, g);
                    } else {
                        int length2 = g - (i7 - objArr8.length);
                        C19318k.m32603U0(objArr8, 0, objArr8, length2, g);
                        Object[] objArr9 = this.f43185c;
                        C19318k.m32603U0(objArr9, i6, objArr9, g2, length2);
                    }
                } else {
                    Object[] objArr10 = this.f43185c;
                    C19318k.m32603U0(objArr10, size2, objArr10, 0, g);
                    Object[] objArr11 = this.f43185c;
                    if (i6 >= objArr11.length) {
                        C19318k.m32603U0(objArr11, i6 - objArr11.length, objArr11, g2, objArr11.length);
                    } else {
                        C19318k.m32603U0(objArr11, 0, objArr11, objArr11.length - size2, objArr11.length);
                        Object[] objArr12 = this.f43185c;
                        C19318k.m32603U0(objArr12, i6, objArr12, g2, objArr12.length - size2);
                    }
                }
                mo71743a(g2, collection);
            }
            return true;
        }
    }

    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
