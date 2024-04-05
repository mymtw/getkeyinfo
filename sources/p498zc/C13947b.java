package p498zc;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.C10097b;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: zc.b */
public final class C13947b extends RecyclerView.C3099n {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.clg_space_16);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            C19383o.m32795e(adapter, "null cannot be cast to non-null type com.etsy.android.ui.listing.ListingAdapter");
            Object item = ((C10097b) adapter).getItem(childAdapterPosition);
            C19383o.m32796f(item, "getItem(position)");
            if (((C10423j) item) instanceof C13949d) {
                rect.setEmpty();
            } else {
                rect.set(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            }
        }
    }
}
