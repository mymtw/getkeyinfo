package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p755lq.C19875a;

/* renamed from: androidx.compose.runtime.o */
public final class C1352o implements Iterable<Object>, Iterator<Object>, C19875a {

    /* renamed from: b */
    public final C1301c1 f2949b;

    /* renamed from: c */
    public final int f2950c;

    /* renamed from: d */
    public int f2951d;

    public C1352o(C1301c1 c1Var, int i) {
        C19383o.m32797g(c1Var, "table");
        this.f2949b = c1Var;
        int t = C0005b.m61t(i, c1Var.f2820b);
        int i2 = i + 1;
        this.f2950c = i2 < c1Var.f2821c ? C0005b.m61t(i2, c1Var.f2820b) : c1Var.f2823e;
        this.f2951d = t;
    }

    public final boolean hasNext() {
        return this.f2951d < this.f2950c;
    }

    public final Iterator<Object> iterator() {
        return this;
    }

    public final Object next() {
        Object obj;
        int i = this.f2951d;
        if (i >= 0) {
            Object[] objArr = this.f2949b.f2822d;
            if (i < objArr.length) {
                obj = objArr[i];
                this.f2951d = i + 1;
                return obj;
            }
        }
        obj = null;
        this.f2951d = i + 1;
        return obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
