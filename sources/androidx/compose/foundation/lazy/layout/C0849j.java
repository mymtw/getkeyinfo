package androidx.compose.foundation.lazy.layout;

import android.support.p013v4.media.C0069a;
import androidx.compose.foundation.lazy.C0826i;
import androidx.compose.foundation.lazy.layout.C0837b;
import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import p003a2.C0015b;
import p219r.C7734e;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.lazy.layout.j */
public final class C0849j<T> implements C0837b<T> {

    /* renamed from: a */
    public final C7734e<C0837b.C0838a<T>> f1812a = new C7734e<>(new C0837b.C0838a[16]);

    /* renamed from: b */
    public int f1813b;

    /* renamed from: c */
    public C0837b.C0838a<T> f1814c;

    /* renamed from: a */
    public final int mo4382a() {
        return this.f1813b;
    }

    /* renamed from: b */
    public final void mo4389b(int i, C0826i iVar) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C0015b.m88g("size should be >=0, but was ", i).toString());
        } else if (i != 0) {
            C0837b.C0838a aVar = new C0837b.C0838a(this.f1813b, i, iVar);
            this.f1813b += i;
            this.f1812a.mo20232c(aVar);
        }
    }

    /* renamed from: c */
    public final void mo4390c(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f1813b) {
            z = true;
        }
        if (!z) {
            StringBuilder h = C0069a.m177h("Index ", i, ", size ");
            h.append(this.f1813b);
            throw new IndexOutOfBoundsException(h.toString());
        }
    }

    /* renamed from: d */
    public final void mo4391d(int i, int i2, C19857l<? super C0837b.C0838a<T>, C19394m> lVar) {
        mo4390c(i);
        mo4390c(i2);
        if (i2 >= i) {
            int C = C19388s.m32813C(i, this.f1812a);
            int i3 = ((C0837b.C0838a) this.f1812a.f17155b[C]).f1793a;
            while (i3 <= i2) {
                C0837b.C0838a aVar = (C0837b.C0838a) this.f1812a.f17155b[C];
                lVar.invoke(aVar);
                i3 += aVar.f1794b;
                C++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
    }

    public final C0837b.C0838a<T> get(int i) {
        mo4390c(i);
        C0837b.C0838a<T> aVar = this.f1814c;
        if (aVar != null) {
            int i2 = aVar.f1793a;
            boolean z = false;
            if (i < aVar.f1794b + i2 && i2 <= i) {
                z = true;
            }
            if (z) {
                return aVar;
            }
        }
        C7734e<C0837b.C0838a<T>> eVar = this.f1812a;
        C0837b.C0838a<T> aVar2 = (C0837b.C0838a) eVar.f17155b[C19388s.m32813C(i, eVar)];
        this.f1814c = aVar2;
        return aVar2;
    }
}
