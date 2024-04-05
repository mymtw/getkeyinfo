package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f0 */
public abstract class C3144f0 extends RecyclerView.C3094l {

    /* renamed from: g */
    public boolean f7228g = true;

    /* renamed from: a */
    public final boolean mo11625a(RecyclerView.C3084b0 b0Var, RecyclerView.C3094l.C3097c cVar, RecyclerView.C3094l.C3097c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f7068a) == (i2 = cVar2.f7068a) && cVar.f7069b == cVar2.f7069b)) {
            mo11841n(b0Var);
            return true;
        }
        return mo11843p(b0Var, i, cVar.f7069b, i2, cVar2.f7069b);
    }

    /* renamed from: b */
    public final boolean mo11626b(RecyclerView.C3084b0 b0Var, RecyclerView.C3084b0 b0Var2, RecyclerView.C3094l.C3097c cVar, RecyclerView.C3094l.C3097c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f7068a;
        int i4 = cVar.f7069b;
        if (b0Var2.shouldIgnore()) {
            int i5 = cVar.f7068a;
            i = cVar.f7069b;
            i2 = i5;
        } else {
            i2 = cVar2.f7068a;
            i = cVar2.f7069b;
        }
        return mo11842o(b0Var, b0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public final boolean mo11627c(RecyclerView.C3084b0 b0Var, RecyclerView.C3094l.C3097c cVar, RecyclerView.C3094l.C3097c cVar2) {
        int i = cVar.f7068a;
        int i2 = cVar.f7069b;
        View view = b0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f7068a;
        int top = cVar2 == null ? view.getTop() : cVar2.f7069b;
        if (b0Var.isRemoved() || (i == left && i2 == top)) {
            mo11844q(b0Var);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo11843p(b0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public final boolean mo11628d(RecyclerView.C3084b0 b0Var, RecyclerView.C3094l.C3097c cVar, RecyclerView.C3094l.C3097c cVar2) {
        int i = cVar.f7068a;
        int i2 = cVar2.f7068a;
        if (i == i2 && cVar.f7069b == cVar2.f7069b) {
            mo11631h(b0Var);
            return false;
        }
        return mo11843p(b0Var, i, cVar.f7069b, i2, cVar2.f7069b);
    }

    /* renamed from: f */
    public boolean mo11629f(RecyclerView.C3084b0 b0Var) {
        return !this.f7228g || b0Var.isInvalid();
    }

    /* renamed from: n */
    public abstract void mo11841n(RecyclerView.C3084b0 b0Var);

    /* renamed from: o */
    public abstract boolean mo11842o(RecyclerView.C3084b0 b0Var, RecyclerView.C3084b0 b0Var2, int i, int i2, int i3, int i4);

    /* renamed from: p */
    public abstract boolean mo11843p(RecyclerView.C3084b0 b0Var, int i, int i2, int i3, int i4);

    /* renamed from: q */
    public abstract void mo11844q(RecyclerView.C3084b0 b0Var);
}
