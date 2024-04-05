package androidx.datastore.preferences.protobuf;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.datastore.preferences.protobuf.C2631w;
import com.google.android.gms.common.api.Api;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.v */
public final class C2629v extends C2563c<Integer> implements RandomAccess, C2626t0 {

    /* renamed from: c */
    public int[] f5968c;

    /* renamed from: d */
    public int f5969d;

    static {
        new C2629v(0, new int[0]).f5841b = false;
    }

    public C2629v() {
        this(0, new int[10]);
    }

    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo9596a();
        if (i < 0 || i > (i2 = this.f5969d)) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5969d);
            throw new IndexOutOfBoundsException(h.toString());
        }
        int[] iArr = this.f5968c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f5968c, i, iArr2, i + 1, this.f5969d - i);
            this.f5968c = iArr2;
        }
        this.f5968c[i] = intValue;
        this.f5969d++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo9596a();
        Charset charset = C2631w.f5973a;
        collection.getClass();
        if (!(collection instanceof C2629v)) {
            return super.addAll(collection);
        }
        C2629v vVar = (C2629v) collection;
        int i = vVar.f5969d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5969d;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f5968c;
            if (i3 > iArr.length) {
                this.f5968c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(vVar.f5968c, 0, this.f5968c, this.f5969d, vVar.f5969d);
            this.f5969d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo9897c(int i) {
        mo9596a();
        int i2 = this.f5969d;
        int[] iArr = this.f5968c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C0072d.m196b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f5968c = iArr2;
        }
        int[] iArr3 = this.f5968c;
        int i3 = this.f5969d;
        this.f5969d = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: e */
    public final void mo9898e(int i) {
        if (i < 0 || i >= this.f5969d) {
            StringBuilder h = C0069a.m177h("Index:", i, ", Size:");
            h.append(this.f5969d);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2629v)) {
            return super.equals(obj);
        }
        C2629v vVar = (C2629v) obj;
        if (this.f5969d != vVar.f5969d) {
            return false;
        }
        int[] iArr = vVar.f5968c;
        for (int i = 0; i < this.f5969d; i++) {
            if (this.f5968c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        mo9898e(i);
        return Integer.valueOf(this.f5968c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5969d; i2++) {
            i = (i * 31) + this.f5968c[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final C2631w.C2635d mo9612i(int i) {
        if (i >= this.f5969d) {
            return new C2629v(this.f5969d, Arrays.copyOf(this.f5968c, i));
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo9596a();
        for (int i = 0; i < this.f5969d; i++) {
            if (obj.equals(Integer.valueOf(this.f5968c[i]))) {
                int[] iArr = this.f5968c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f5969d - i) - 1);
                this.f5969d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        mo9596a();
        if (i2 >= i) {
            int[] iArr = this.f5968c;
            System.arraycopy(iArr, i2, iArr, i, this.f5969d - i2);
            this.f5969d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo9596a();
        mo9898e(i);
        int[] iArr = this.f5968c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f5969d;
    }

    public C2629v(int i, int[] iArr) {
        this.f5968c = iArr;
        this.f5969d = i;
    }

    public final Object remove(int i) {
        mo9596a();
        mo9898e(i);
        int[] iArr = this.f5968c;
        int i2 = iArr[i];
        int i3 = this.f5969d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f5969d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean add(Object obj) {
        mo9897c(((Integer) obj).intValue());
        return true;
    }
}
