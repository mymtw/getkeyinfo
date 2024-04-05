package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p755lq.C19875a;

/* renamed from: androidx.core.view.o0 */
public final class C2322o0 implements Iterator<View>, C19875a {

    /* renamed from: b */
    public int f5579b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f5580c;

    public C2322o0(ViewGroup viewGroup) {
        this.f5580c = viewGroup;
    }

    public final boolean hasNext() {
        return this.f5579b < this.f5580c.getChildCount();
    }

    public final Object next() {
        ViewGroup viewGroup = this.f5580c;
        int i = this.f5579b;
        this.f5579b = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void remove() {
        ViewGroup viewGroup = this.f5580c;
        int i = this.f5579b - 1;
        this.f5579b = i;
        viewGroup.removeViewAt(i);
    }
}
