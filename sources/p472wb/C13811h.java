package p472wb;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: wb.h */
public final class C13811h extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f30422a;

    public C13811h(int i) {
        this.f30422a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        super.getItemOffsets(rect, view, recyclerView, yVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
        if (layoutParams2.getSpanIndex() == 0) {
            layoutParams2.setMarginEnd(this.f30422a / 2);
        } else {
            layoutParams2.setMarginStart(this.f30422a / 2);
        }
        int i = this.f30422a;
        layoutParams2.topMargin = i / 2;
        layoutParams2.bottomMargin = i / 2;
        view.setLayoutParams(layoutParams2);
    }
}
