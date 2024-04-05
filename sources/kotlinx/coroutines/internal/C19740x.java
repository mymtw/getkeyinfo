package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19824u0;
import kotlinx.coroutines.internal.C19741y;

/* renamed from: kotlinx.coroutines.internal.x */
public class C19740x<T extends C19741y & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f43693a;

    /* renamed from: a */
    public final void mo72486a(T t) {
        t.mo72492a((C19824u0.C19828d) this);
        T[] tArr = this.f43693a;
        if (tArr == null) {
            tArr = new C19741y[4];
            this.f43693a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            tArr = (C19741y[]) copyOf;
            this.f43693a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = t;
        t.setIndex(i);
        mo72490e(i);
    }

    /* renamed from: b */
    public final boolean mo72487b() {
        return this._size == 0;
    }

    /* renamed from: c */
    public final T mo72488c(int i) {
        T[] tArr = this.f43693a;
        C19383o.m32794d(tArr);
        this._size--;
        if (i < this._size) {
            mo72491f(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C19383o.m32794d(t);
                T t2 = tArr[i2];
                C19383o.m32794d(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    mo72491f(i, i2);
                    mo72490e(i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f43693a;
                C19383o.m32794d(tArr2);
                int i4 = i3 + 1;
                if (i4 < this._size) {
                    T t3 = tArr2[i4];
                    C19383o.m32794d(t3);
                    T t4 = tArr2[i3];
                    C19383o.m32794d(t4);
                    if (((Comparable) t3).compareTo(t4) < 0) {
                        i3 = i4;
                    }
                }
                T t5 = tArr2[i];
                C19383o.m32794d(t5);
                T t6 = tArr2[i3];
                C19383o.m32794d(t6);
                if (((Comparable) t5).compareTo(t6) <= 0) {
                    break;
                }
                mo72491f(i, i3);
                i = i3;
            }
        }
        T t7 = tArr[this._size];
        C19383o.m32794d(t7);
        t7.mo72492a((C19824u0.C19828d) null);
        t7.setIndex(-1);
        tArr[this._size] = null;
        return t7;
    }

    /* renamed from: d */
    public final T mo72489d() {
        T c;
        synchronized (this) {
            c = this._size > 0 ? mo72488c(0) : null;
        }
        return c;
    }

    /* renamed from: e */
    public final void mo72490e(int i) {
        while (i > 0) {
            T[] tArr = this.f43693a;
            C19383o.m32794d(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C19383o.m32794d(t);
            T t2 = tArr[i];
            C19383o.m32794d(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                mo72491f(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo72491f(int i, int i2) {
        T[] tArr = this.f43693a;
        C19383o.m32794d(tArr);
        T t = tArr[i2];
        C19383o.m32794d(t);
        T t2 = tArr[i];
        C19383o.m32794d(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
