package p431qf;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.vespa.itemdecorators.TripletGridLayoutManager;
import kotlin.jvm.internal.C19383o;

/* renamed from: qf.d */
public final class C13329d extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f29246a = 0;

    /* renamed from: b */
    public final int f29247b = 0;

    /* renamed from: c */
    public final int f29248c = 0;

    /* renamed from: d */
    public final int f29249d = 0;

    /* renamed from: e */
    public final int f29250e;

    /* renamed from: f */
    public TripletGridLayoutManager f29251f;

    /* renamed from: g */
    public GridLayoutManager.C3075b f29252g;

    public C13329d(int i) {
        this.f29250e = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        if (this.f29251f == null) {
            RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
            C19383o.m32795e(layoutManager, "null cannot be cast to non-null type com.etsy.android.vespa.itemdecorators.TripletGridLayoutManager");
            TripletGridLayoutManager tripletGridLayoutManager = (TripletGridLayoutManager) layoutManager;
            this.f29251f = tripletGridLayoutManager;
            this.f29252g = tripletGridLayoutManager.f7008K;
        }
        TripletGridLayoutManager tripletGridLayoutManager2 = this.f29251f;
        C19383o.m32794d(tripletGridLayoutManager2);
        int i = tripletGridLayoutManager2.f7003F;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        GridLayoutManager.C3075b bVar = this.f29252g;
        C19383o.m32794d(bVar);
        int d = bVar.mo11265d(childAdapterPosition);
        if (childAdapterPosition == 0) {
            rect.left = this.f29246a;
        } else {
            rect.left = this.f29250e;
        }
        if (childAdapterPosition == yVar.mo11715b() - 1 || (d != i && childAdapterPosition == yVar.mo11715b() - 2)) {
            rect.right = this.f29247b;
        } else {
            rect.right = this.f29250e;
        }
        if (d == i) {
            rect.bottom = this.f29249d;
            rect.top = this.f29248c;
            return;
        }
        GridLayoutManager.C3075b bVar2 = this.f29252g;
        C19383o.m32794d(bVar2);
        if (bVar2.mo11264c(childAdapterPosition, i) == 0) {
            rect.bottom = this.f29250e;
            rect.top = this.f29248c;
            return;
        }
        rect.bottom = this.f29249d;
        rect.top = this.f29250e;
    }
}
