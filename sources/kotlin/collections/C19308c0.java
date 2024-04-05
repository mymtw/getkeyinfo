package kotlin.collections;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.session.C0087d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;

/* renamed from: kotlin.collections.c0 */
public final class C19308c0<T> extends C19289b<T> implements RandomAccess {

    /* renamed from: b */
    public final Object[] f43174b;

    /* renamed from: c */
    public final int f43175c;

    /* renamed from: d */
    public int f43176d;

    /* renamed from: e */
    public int f43177e;

    /* renamed from: kotlin.collections.c0$a */
    public static final class C19309a extends C19286a<T> {

        /* renamed from: d */
        public int f43178d;

        /* renamed from: e */
        public int f43179e;

        /* renamed from: f */
        public final /* synthetic */ C19308c0<T> f43180f;

        public C19309a(C19308c0<T> c0Var) {
            this.f43180f = c0Var;
            this.f43178d = c0Var.mo5763a();
            this.f43179e = c0Var.f43176d;
        }

        /* renamed from: a */
        public final void mo71570a() {
            if (this.f43178d == 0) {
                this.f43154b = State.Done;
                return;
            }
            mo71572c(this.f43180f.f43174b[this.f43179e]);
            this.f43179e = (this.f43179e + 1) % this.f43180f.f43175c;
            this.f43178d--;
        }
    }

    public C19308c0(Object[] objArr, int i) {
        this.f43174b = objArr;
        boolean z = true;
        if (i >= 0) {
            if (i > objArr.length ? false : z) {
                this.f43175c = objArr.length;
                this.f43177e = i;
                return;
            }
            StringBuilder h = C0069a.m177h("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            h.append(objArr.length);
            throw new IllegalArgumentException(h.toString().toString());
        }
        throw new IllegalArgumentException(C0015b.m88g("ring buffer filled size should not be negative but it is ", i).toString());
    }

    /* renamed from: a */
    public final int mo5763a() {
        return this.f43177e;
    }

    /* renamed from: c */
    public final void mo71717c(int i) {
        boolean z = true;
        if (i >= 0) {
            if (i > this.f43177e) {
                z = false;
            }
            if (!z) {
                StringBuilder h = C0069a.m177h("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
                h.append(this.f43177e);
                throw new IllegalArgumentException(h.toString().toString());
            } else if (i > 0) {
                int i2 = this.f43176d;
                int i3 = this.f43175c;
                int i4 = (i2 + i) % i3;
                if (i2 > i4) {
                    C19318k.m32609a1(i2, this.f43174b, i3);
                    C19318k.m32609a1(0, this.f43174b, i4);
                } else {
                    C19318k.m32609a1(i2, this.f43174b, i4);
                }
                this.f43176d = i4;
                this.f43177e -= i;
            }
        } else {
            throw new IllegalArgumentException(C0015b.m88g("n shouldn't be negative but it is ", i).toString());
        }
    }

    public final T get(int i) {
        int a = mo5763a();
        if (i >= 0 && i < a) {
            return this.f43174b[(this.f43176d + i) % this.f43175c];
        }
        throw new IndexOutOfBoundsException(C0087d.m235e("index: ", i, ", size: ", a));
    }

    public final Iterator<T> iterator() {
        return new C19309a(this);
    }

    public final Object[] toArray() {
        return toArray(new Object[mo5763a()]);
    }

    public final <T> T[] toArray(T[] tArr) {
        C19383o.m32797g(tArr, "array");
        if (tArr.length < mo5763a()) {
            tArr = Arrays.copyOf(tArr, mo5763a());
            C19383o.m32796f(tArr, "copyOf(this, newSize)");
        }
        int a = mo5763a();
        int i = this.f43176d;
        int i2 = 0;
        int i3 = 0;
        while (i3 < a && i < this.f43175c) {
            tArr[i3] = this.f43174b[i];
            i3++;
            i++;
        }
        while (i3 < a) {
            tArr[i3] = this.f43174b[i2];
            i3++;
            i2++;
        }
        if (tArr.length > mo5763a()) {
            tArr[mo5763a()] = null;
        }
        return tArr;
    }
}
