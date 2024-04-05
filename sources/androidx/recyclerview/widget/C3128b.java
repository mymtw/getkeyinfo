package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b */
public final class C3128b implements C3202x {

    /* renamed from: a */
    public final RecyclerView.Adapter f7190a;

    public C3128b(RecyclerView.Adapter adapter) {
        this.f7190a = adapter;
    }

    /* renamed from: a */
    public final void mo11816a(int i, int i2) {
        this.f7190a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: b */
    public final void mo11817b(int i, int i2) {
        this.f7190a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: c */
    public final void mo11818c(int i, int i2, Object obj) {
        this.f7190a.notifyItemRangeChanged(i, i2, obj);
    }

    /* renamed from: d */
    public final void mo11819d(int i, int i2) {
        this.f7190a.notifyItemMoved(i, i2);
    }
}
