package p431qf;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: qf.a */
public final class C13326a extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f29234a;

    /* renamed from: b */
    public final int f29235b;

    /* renamed from: c */
    public final int f29236c;

    /* renamed from: d */
    public final int f29237d = 0;

    /* renamed from: e */
    public final int f29238e;

    /* renamed from: f */
    public final int f29239f;

    /* renamed from: g */
    public GridLayoutManager f29240g;

    public C13326a(int i, int i2, int i3, int i4, int i5) {
        this.f29234a = i;
        this.f29235b = i2;
        this.f29236c = i3;
        this.f29238e = i4;
        this.f29239f = i5;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        if (this.f29240g == null) {
            RecyclerView.C3100o layoutManager = recyclerView.getLayoutManager();
            C19383o.m32795e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            this.f29240g = (GridLayoutManager) layoutManager;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        boolean z = false;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, 0, 0);
        }
        view.setLayoutParams(marginLayoutParams);
        GridLayoutManager gridLayoutManager = this.f29240g;
        C19383o.m32794d(gridLayoutManager);
        int i = gridLayoutManager.f7003F;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        double d = (double) i;
        double ceil = Math.ceil(((double) yVar.mo11715b()) / d);
        double d2 = ((double) childAdapterPosition) + ((double) 1);
        boolean z2 = childAdapterPosition % i == 0;
        double d3 = d2 / d;
        boolean z3 = Math.ceil(d3) == 1.0d;
        if (Math.ceil(d3) == ceil) {
            z = true;
        }
        rect.left = z3 ? this.f29234a : this.f29238e / 2;
        rect.right = z ? this.f29235b : this.f29238e / 2;
        rect.top = z2 ? this.f29236c : this.f29239f / 2;
        rect.bottom = z2 ? this.f29239f / 2 : this.f29237d;
    }
}
