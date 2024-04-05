package androidx.compose.runtime;

import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: androidx.compose.runtime.e1 */
public final class C1310e1 implements Iterator<Object>, C19875a {

    /* renamed from: b */
    public int f2854b;

    /* renamed from: c */
    public final /* synthetic */ int f2855c;

    /* renamed from: d */
    public final /* synthetic */ C1306d1 f2856d;

    public C1310e1(int i, int i2, C1306d1 d1Var) {
        this.f2855c = i2;
        this.f2856d = d1Var;
        this.f2854b = i;
    }

    public final boolean hasNext() {
        return this.f2854b < this.f2855c;
    }

    public final Object next() {
        if (!hasNext()) {
            return null;
        }
        C1306d1 d1Var = this.f2856d;
        Object[] objArr = d1Var.f2834c;
        int i = this.f2854b;
        this.f2854b = i + 1;
        return objArr[d1Var.mo5673h(i)];
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
