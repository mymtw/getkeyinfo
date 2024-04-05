package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import com.google.android.play.core.appupdate.C15562d;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p228s.C7788a;
import p228s.C7791c;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.h */
public final class C1318h<E> extends AbstractPersistentList<E> implements C7788a<E> {

    /* renamed from: c */
    public static final C1318h f2880c = new C1318h(new Object[0]);

    /* renamed from: b */
    public final Object[] f2881b;

    public C1318h(Object[] objArr) {
        this.f2881b = objArr;
    }

    /* renamed from: B */
    public final C7791c<E> mo5762B(int i) {
        C15562d.m25207w(i, this.f2881b.length);
        Object[] objArr = this.f2881b;
        if (objArr.length == 1) {
            return f2880c;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        C19383o.m32796f(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = this.f2881b;
        C19318k.m32603U0(objArr2, i, copyOf, i + 1, objArr2.length);
        return new C1318h(copyOf);
    }

    /* renamed from: a */
    public final int mo5763a() {
        return this.f2881b.length;
    }

    public final C7791c<E> add(int i, E e) {
        C15562d.m25208x(i, this.f2881b.length);
        Object[] objArr = this.f2881b;
        if (i == objArr.length) {
            return add(e);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[(objArr.length + 1)];
            C19318k.m32605W0(objArr, objArr2, 0, 0, i, 6);
            Object[] objArr3 = this.f2881b;
            C19318k.m32603U0(objArr3, i + 1, objArr2, i, objArr3.length);
            objArr2[i] = e;
            return new C1318h(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C19383o.m32796f(copyOf, "copyOf(this, size)");
        Object[] objArr4 = this.f2881b;
        C19318k.m32603U0(objArr4, i + 1, copyOf, i, objArr4.length - 1);
        copyOf[i] = e;
        Object[] objArr5 = this.f2881b;
        Object[] objArr6 = new Object[32];
        objArr6[0] = objArr5[31];
        return new C1314d(objArr5.length + 1, 0, copyOf, objArr6);
    }

    public final C7791c<E> addAll(Collection<? extends E> collection) {
        C19383o.m32797g(collection, "elements");
        if (collection.size() + this.f2881b.length <= 32) {
            Object[] objArr = this.f2881b;
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            int length = this.f2881b.length;
            for (Object obj : collection) {
                copyOf[length] = obj;
                length++;
            }
            return new C1318h(copyOf);
        }
        PersistentVectorBuilder builder = builder();
        builder.addAll(collection);
        return builder.mo5726e();
    }

    public final PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, (Object[]) null, this.f2881b, 0);
    }

    /* renamed from: f0 */
    public final C7791c<E> mo5769f0(C19857l<? super E, Boolean> lVar) {
        Object[] objArr = this.f2881b;
        int length = objArr.length;
        int length2 = objArr.length;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = this.f2881b[i];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.f2881b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    C19383o.m32796f(objArr, "copyOf(this, size)");
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr[length] = obj;
                length++;
            }
        }
        return length == this.f2881b.length ? this : length == 0 ? f2880c : new C1318h(C19318k.m32608Z0(0, length, objArr));
    }

    public final E get(int i) {
        C15562d.m25207w(i, mo5763a());
        return this.f2881b[i];
    }

    public final int indexOf(Object obj) {
        return C19318k.m32615g1(this.f2881b, obj);
    }

    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f2881b;
        C19383o.m32797g(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (C19383o.m32792b(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    public final ListIterator<E> listIterator(int i) {
        C15562d.m25208x(i, mo5763a());
        return new C1312b(this.f2881b, i, mo5763a());
    }

    public final C7791c<E> set(int i, E e) {
        C15562d.m25207w(i, mo5763a());
        Object[] objArr = this.f2881b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C19383o.m32796f(copyOf, "copyOf(this, size)");
        copyOf[i] = e;
        return new C1318h(copyOf);
    }

    public final C7791c<E> add(E e) {
        Object[] objArr = this.f2881b;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            copyOf[this.f2881b.length] = e;
            return new C1318h(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new C1314d(objArr.length + 1, 0, objArr, objArr2);
    }
}
