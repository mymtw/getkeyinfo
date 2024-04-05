package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.datastore.preferences.protobuf.C2631w;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.v0 */
public final class C2630v0<E> extends C2563c<E> implements RandomAccess {

    /* renamed from: e */
    public static final C2630v0<Object> f5970e;

    /* renamed from: c */
    public E[] f5971c;

    /* renamed from: d */
    public int f5972d;

    static {
        C2630v0<Object> v0Var = new C2630v0<>(new Object[0], 0);
        f5970e = v0Var;
        v0Var.f5841b = false;
    }

    public C2630v0(E[] eArr, int i) {
        this.f5971c = eArr;
        this.f5972d = i;
    }

    public final boolean add(E e) {
        mo9596a();
        int i = this.f5972d;
        E[] eArr = this.f5971c;
        if (i == eArr.length) {
            this.f5971c = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f5971c;
        int i2 = this.f5972d;
        this.f5972d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: c */
    public final void mo9905c(int i) {
        if (i < 0 || i >= this.f5972d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5972d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final E get(int i) {
        mo9905c(i);
        return this.f5971c[i];
    }

    /* renamed from: i */
    public final C2631w.C2635d mo9612i(int i) {
        if (i >= this.f5972d) {
            return new C2630v0(Arrays.copyOf(this.f5971c, i), this.f5972d);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo9596a();
        mo9905c(i);
        E[] eArr = this.f5971c;
        E e = eArr[i];
        int i2 = this.f5972d;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f5972d--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo9596a();
        mo9905c(i);
        E[] eArr = this.f5971c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f5972d;
    }

    public final void add(int i, E e) {
        int i2;
        mo9596a();
        if (i < 0 || i > (i2 = this.f5972d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5972d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        E[] eArr = this.f5971c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f5971c, i, eArr2, i + 1, this.f5972d - i);
            this.f5971c = eArr2;
        }
        this.f5971c[i] = e;
        this.f5972d++;
        this.modCount++;
    }
}
