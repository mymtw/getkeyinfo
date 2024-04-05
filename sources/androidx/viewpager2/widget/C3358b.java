package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: androidx.viewpager2.widget.b */
public final class C3358b {

    /* renamed from: b */
    public static final ViewGroup.MarginLayoutParams f7819b;

    /* renamed from: a */
    public LinearLayoutManager f7820a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f7819b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C3358b(LinearLayoutManager linearLayoutManager) {
        this.f7820a = linearLayoutManager;
    }

    /* renamed from: a */
    public static boolean m8089a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m8089a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
