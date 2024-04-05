package androidx.compose.p015ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNode;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5 */
public final class AndroidViewHolder$layoutNode$1$5 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ AndroidViewHolder f4696a;

    /* renamed from: b */
    public final /* synthetic */ LayoutNode f4697b;

    public AndroidViewHolder$layoutNode$1$5(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        this.f4696a = androidViewHolder;
        this.f4697b = layoutNode;
    }

    /* renamed from: a */
    public final int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo7887g(i);
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(list, "measurables");
        if (C7280a.m13965j(j) != 0) {
            this.f4696a.getChildAt(0).setMinimumWidth(C7280a.m13965j(j));
        }
        if (C7280a.m13964i(j) != 0) {
            this.f4696a.getChildAt(0).setMinimumHeight(C7280a.m13964i(j));
        }
        AndroidViewHolder androidViewHolder = this.f4696a;
        int j2 = C7280a.m13965j(j);
        int h = C7280a.m13963h(j);
        ViewGroup.LayoutParams layoutParams = this.f4696a.getLayoutParams();
        C19383o.m32794d(layoutParams);
        int access$obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(j2, h, layoutParams.width);
        AndroidViewHolder androidViewHolder2 = this.f4696a;
        int i = C7280a.m13964i(j);
        int g = C7280a.m13962g(j);
        ViewGroup.LayoutParams layoutParams2 = this.f4696a.getLayoutParams();
        C19383o.m32794d(layoutParams2);
        androidViewHolder.measure(access$obtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(i, g, layoutParams2.height));
        return xVar.mo4387Z(this.f4696a.getMeasuredWidth(), this.f4696a.getMeasuredHeight(), C19294b0.m32559p0(), new AndroidViewHolder$layoutNode$1$5$measure$1(this.f4696a, this.f4697b));
    }

    /* renamed from: c */
    public final int mo3261c(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo7887g(i);
    }

    /* renamed from: d */
    public final int mo3262d(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo7886f(i);
    }

    /* renamed from: e */
    public final int mo3263e(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo7886f(i);
    }

    /* renamed from: f */
    public final int mo7886f(int i) {
        AndroidViewHolder androidViewHolder = this.f4696a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        C19383o.m32794d(layoutParams);
        androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.f4696a.getMeasuredHeight();
    }

    /* renamed from: g */
    public final int mo7887g(int i) {
        AndroidViewHolder androidViewHolder = this.f4696a;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidViewHolder androidViewHolder2 = this.f4696a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
        C19383o.m32794d(layoutParams);
        androidViewHolder.measure(makeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, i, layoutParams.height));
        return this.f4696a.getMeasuredWidth();
    }
}
