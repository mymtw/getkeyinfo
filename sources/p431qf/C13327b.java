package p431qf;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: qf.b */
public final class C13327b extends RecyclerView.C3099n {

    /* renamed from: a */
    public final int f29241a;

    /* renamed from: b */
    public final int f29242b;

    /* renamed from: c */
    public final int f29243c;

    /* renamed from: d */
    public final int f29244d;

    /* renamed from: e */
    public final int f29245e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13327b(int i, int i2, int i3, int i4, int i5, int i6) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, 0, (i5 & 16) != 0 ? 0 : i4);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C3117y yVar) {
        C19383o.m32797g(rect, "outRect");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(recyclerView, ResponseConstants.PARENT);
        C19383o.m32797g(yVar, "state");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, 0, 0);
        }
        view.setLayoutParams(marginLayoutParams);
        rect.top = this.f29243c;
        rect.bottom = this.f29244d;
        if (yVar.mo11715b() == 1) {
            rect.left = this.f29241a;
            rect.right = this.f29242b;
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.left = this.f29241a;
        } else if (childAdapterPosition == yVar.mo11715b() - 1) {
            rect.left = this.f29245e;
            rect.right = this.f29242b;
        } else {
            rect.left = this.f29245e;
        }
    }

    public C13327b(int i, int i2, int i3, int i4, int i5) {
        this.f29241a = i;
        this.f29242b = i2;
        this.f29243c = i3;
        this.f29244d = i4;
        this.f29245e = i5;
    }
}
