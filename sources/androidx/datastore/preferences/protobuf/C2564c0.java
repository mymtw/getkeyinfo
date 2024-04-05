package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.datastore.preferences.protobuf.C2631w;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.c0 */
public final class C2564c0 extends C2563c<Long> implements RandomAccess, C2626t0 {

    /* renamed from: c */
    public long[] f5842c;

    /* renamed from: d */
    public int f5843d;

    static {
        new C2564c0(new long[0], 0).f5841b = false;
    }

    public C2564c0() {
        this(new long[10], 0);
    }

    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo9596a();
        if (i < 0 || i > (i2 = this.f5843d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5843d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        long[] jArr = this.f5842c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f5842c, i, jArr2, i + 1, this.f5843d - i);
            this.f5842c = jArr2;
        }
        this.f5842c[i] = longValue;
        this.f5843d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo9596a();
        Charset charset = C2631w.f5973a;
        collection.getClass();
        if (!(collection instanceof C2564c0)) {
            return super.addAll(collection);
        }
        C2564c0 c0Var = (C2564c0) collection;
        int i = c0Var.f5843d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5843d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f5842c;
            if (i3 > jArr.length) {
                this.f5842c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c0Var.f5842c, 0, this.f5842c, this.f5843d, c0Var.f5843d);
            this.f5843d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo9609c(long j) {
        mo9596a();
        int i = this.f5843d;
        long[] jArr = this.f5842c;
        if (i == jArr.length) {
            long[] jArr2 = new long[C0072d.m196b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f5842c = jArr2;
        }
        long[] jArr3 = this.f5842c;
        int i2 = this.f5843d;
        this.f5843d = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: e */
    public final void mo9610e(int i) {
        if (i < 0 || i >= this.f5843d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5843d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2564c0)) {
            return super.equals(obj);
        }
        C2564c0 c0Var = (C2564c0) obj;
        if (this.f5843d != c0Var.f5843d) {
            return false;
        }
        long[] jArr = c0Var.f5842c;
        for (int i = 0; i < this.f5843d; i++) {
            if (this.f5842c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo9610e(i);
        return Long.valueOf(this.f5842c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5843d; i2++) {
            i = (i * 31) + C2631w.m6276a(this.f5842c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final C2631w.C2635d mo9612i(int i) {
        if (i >= this.f5843d) {
            return new C2564c0(Arrays.copyOf(this.f5842c, i), this.f5843d);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo9596a();
        for (int i = 0; i < this.f5843d; i++) {
            if (obj.equals(Long.valueOf(this.f5842c[i]))) {
                long[] jArr = this.f5842c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f5843d - i) - 1);
                this.f5843d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo9596a();
        if (i2 >= i) {
            long[] jArr = this.f5842c;
            System.arraycopy(jArr, i2, jArr, i, this.f5843d - i2);
            this.f5843d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo9596a();
        mo9610e(i);
        long[] jArr = this.f5842c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f5843d;
    }

    public C2564c0(long[] jArr, int i) {
        this.f5842c = jArr;
        this.f5843d = i;
    }

    public final Object remove(int i) {
        mo9596a();
        mo9610e(i);
        long[] jArr = this.f5842c;
        long j = jArr[i];
        int i2 = this.f5843d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f5843d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean add(Object obj) {
        mo9609c(((Long) obj).longValue());
        return true;
    }
}
