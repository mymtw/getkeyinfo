package androidx.compose.runtime.snapshots;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.C19383o;
import p755lq.C19875a;

/* renamed from: androidx.compose.runtime.snapshots.q */
public final class C1400q<T> implements ListIterator<T>, C19875a {

    /* renamed from: b */
    public final SnapshotStateList<T> f3045b;

    /* renamed from: c */
    public int f3046c;

    /* renamed from: d */
    public int f3047d;

    public C1400q(SnapshotStateList<T> snapshotStateList, int i) {
        C19383o.m32797g(snapshotStateList, ResponseConstants.LIST);
        this.f3045b = snapshotStateList;
        this.f3046c = i - 1;
        this.f3047d = snapshotStateList.mo5955a();
    }

    /* renamed from: a */
    public final void mo6049a() {
        if (this.f3045b.mo5955a() != this.f3047d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void add(T t) {
        mo6049a();
        this.f3045b.add(this.f3046c + 1, t);
        this.f3046c++;
        this.f3047d = this.f3045b.mo5955a();
    }

    public final boolean hasNext() {
        return this.f3046c < this.f3045b.size() - 1;
    }

    public final boolean hasPrevious() {
        return this.f3046c >= 0;
    }

    public final T next() {
        mo6049a();
        int i = this.f3046c + 1;
        C1396n.m2995a(i, this.f3045b.size());
        T t = this.f3045b.get(i);
        this.f3046c = i;
        return t;
    }

    public final int nextIndex() {
        return this.f3046c + 1;
    }

    public final T previous() {
        mo6049a();
        C1396n.m2995a(this.f3046c, this.f3045b.size());
        this.f3046c--;
        return this.f3045b.get(this.f3046c);
    }

    public final int previousIndex() {
        return this.f3046c;
    }

    public final void remove() {
        mo6049a();
        this.f3045b.remove(this.f3046c);
        this.f3046c--;
        this.f3047d = this.f3045b.mo5955a();
    }

    public final void set(T t) {
        mo6049a();
        this.f3045b.set(this.f3046c, t);
        this.f3047d = this.f3045b.mo5955a();
    }
}
