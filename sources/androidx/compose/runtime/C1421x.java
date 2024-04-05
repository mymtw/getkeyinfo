package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C1414b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p755lq.C19875a;

/* renamed from: androidx.compose.runtime.x */
public final class C1421x implements Iterator<C1414b>, C19875a {

    /* renamed from: b */
    public final C1301c1 f3089b;

    /* renamed from: c */
    public final int f3090c;

    /* renamed from: d */
    public int f3091d;

    /* renamed from: e */
    public final int f3092e;

    public C1421x(int i, int i2, C1301c1 c1Var) {
        C19383o.m32797g(c1Var, "table");
        this.f3089b = c1Var;
        this.f3090c = i2;
        this.f3091d = i;
        this.f3092e = c1Var.f2826h;
        if (c1Var.f2825g) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public final void mo6109a() {
        if (this.f3089b.f2826h != this.f3092e) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f3091d < this.f3090c;
    }

    public final Object next() {
        mo6109a();
        int i = this.f3091d;
        this.f3091d = C0005b.m63u(i, this.f3089b.f2820b) + i;
        return new C1419w(this, i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
