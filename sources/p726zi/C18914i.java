package p726zi;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0342q0;
import com.etsy.android.uikit.view.draggable.C11942a;

/* renamed from: zi.i */
public final /* synthetic */ class C18914i implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C18917l f42134b;

    public /* synthetic */ C18914i(C18917l lVar) {
        this.f42134b = lVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        C18917l lVar = this.f42134b;
        int width = (lVar.f42140a.getWidth() - lVar.f42140a.getPaddingLeft()) - lVar.f42140a.getPaddingRight();
        int height = (lVar.f42140a.getHeight() - lVar.f42140a.getPaddingBottom()) - lVar.f42140a.getPaddingTop();
        int d = C18917l.m32012d(lVar.f42142c);
        ViewGroup viewGroup = lVar.f42142c;
        boolean z = false;
        int paddingRight = d - (viewGroup != null ? lVar.f42142c.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
        ViewGroup viewGroup2 = lVar.f42142c;
        if (viewGroup2 == null) {
            i9 = 0;
        } else {
            i9 = viewGroup2.getHeight();
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i9 += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
        }
        ViewGroup viewGroup3 = lVar.f42142c;
        int paddingBottom = i9 - (viewGroup3 != null ? lVar.f42142c.getPaddingBottom() + viewGroup3.getPaddingTop() : 0);
        int max = Math.max(paddingRight, C18917l.m32012d(lVar.f42150k) + C18917l.m32012d(lVar.f42148i));
        ViewGroup viewGroup4 = lVar.f42143d;
        if (viewGroup4 == null) {
            i10 = 0;
        } else {
            i10 = viewGroup4.getHeight();
            ViewGroup.LayoutParams layoutParams2 = viewGroup4.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                i10 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            }
        }
        boolean z2 = width <= max || height <= (i10 * 2) + paddingBottom;
        if (lVar.f42137A != z2) {
            lVar.f42137A = z2;
            view.post(new C0342q0(lVar, 6));
        }
        if (i3 - i != i7 - i5) {
            z = true;
        }
        if (!lVar.f42137A && z) {
            view.post(new C11942a(lVar, 2));
        }
    }
}
