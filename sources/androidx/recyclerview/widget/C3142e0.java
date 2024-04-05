package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.e0 */
public final class C3142e0 {
    /* renamed from: a */
    public static int m7688a(RecyclerView.C3117y yVar, C3129b0 b0Var, View view, View view2, RecyclerView.C3100o oVar, boolean z) {
        if (oVar.mo11676y() == 0 || yVar.mo11715b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.C3100o.m7396I(view) - RecyclerView.C3100o.m7396I(view2)) + 1;
        }
        return Math.min(b0Var.mo11812l(), b0Var.mo11802b(view2) - b0Var.mo11805e(view));
    }

    /* renamed from: b */
    public static int m7689b(RecyclerView.C3117y yVar, C3129b0 b0Var, View view, View view2, RecyclerView.C3100o oVar, boolean z, boolean z2) {
        if (oVar.mo11676y() == 0 || yVar.mo11715b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (yVar.mo11715b() - Math.max(RecyclerView.C3100o.m7396I(view), RecyclerView.C3100o.m7396I(view2))) - 1) : Math.max(0, Math.min(RecyclerView.C3100o.m7396I(view), RecyclerView.C3100o.m7396I(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(b0Var.mo11802b(view2) - b0Var.mo11805e(view))) / ((float) (Math.abs(RecyclerView.C3100o.m7396I(view) - RecyclerView.C3100o.m7396I(view2)) + 1)))) + ((float) (b0Var.mo11811k() - b0Var.mo11805e(view))));
    }

    /* renamed from: c */
    public static int m7690c(RecyclerView.C3117y yVar, C3129b0 b0Var, View view, View view2, RecyclerView.C3100o oVar, boolean z) {
        if (oVar.mo11676y() == 0 || yVar.mo11715b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return yVar.mo11715b();
        }
        return (int) ((((float) (b0Var.mo11802b(view2) - b0Var.mo11805e(view))) / ((float) (Math.abs(RecyclerView.C3100o.m7396I(view) - RecyclerView.C3100o.m7396I(view2)) + 1))) * ((float) yVar.mo11715b()));
    }
}
