package p638ok;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.badge.BadgeDrawable;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;

/* renamed from: ok.b */
public abstract class C18310b extends C18311c<View> {

    /* renamed from: c */
    public final Rect f40197c = new Rect();

    /* renamed from: d */
    public final Rect f40198d = new Rect();

    /* renamed from: e */
    public int f40199e = 0;

    /* renamed from: f */
    public int f40200f;

    public C18310b() {
    }

    /* renamed from: b */
    public final void mo69848b(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout c = mo52953c(coordinatorLayout.getDependencies(view));
        int i2 = 0;
        if (c != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.f40197c;
            rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, c.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((c.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
            C2348w0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2368d.m5212b(coordinatorLayout) && !C2364y.C2368d.m5212b(view)) {
                    rect.left = lastWindowInsets.mo8945e() + rect.left;
                    rect.right -= lastWindowInsets.mo8947f();
                }
            }
            Rect rect2 = this.f40198d;
            int i3 = layoutParams.gravity;
            if (i3 == 0) {
                i3 = BadgeDrawable.TOP_START;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            if (this.f40200f != 0) {
                float d = mo52954d(c);
                int i4 = this.f40200f;
                i2 = C19543e0.m33285A((int) (d * ((float) i4)), 0, i4);
            }
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            this.f40199e = rect2.top - c.getBottom();
            return;
        }
        coordinatorLayout.onLayoutChild(view, i);
        this.f40199e = 0;
    }

    /* renamed from: c */
    public abstract AppBarLayout mo52953c(List list);

    /* renamed from: d */
    public float mo52954d(View view) {
        return 1.0f;
    }

    /* renamed from: e */
    public int mo52955e(View view) {
        return view.getMeasuredHeight();
    }

    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AppBarLayout c;
        C2348w0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (c = mo52953c(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2368d.m5212b(c) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.mo8944d() + lastWindowInsets.mo8948g();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec((mo52955e(c) + size) - c.getMeasuredHeight(), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public C18310b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
