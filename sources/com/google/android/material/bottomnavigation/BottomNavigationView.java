package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0340p0;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.internal.C15367g;
import com.google.android.material.internal.C15370j;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import java.util.WeakHashMap;
import p260v0.C8184a;
import p610kp.C18161c;

public class BottomNavigationView extends NavigationBarView {
    public static final int MAX_ITEM_COUNT = 5;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public class C15212a implements C15370j.C15372b {
        /* renamed from: a */
        public final C2348w0 mo53146a(View view, C2348w0 w0Var, C15370j.C15373c cVar) {
            cVar.f34525d = w0Var.mo8944d() + cVar.f34525d;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            boolean z = true;
            if (C2364y.C2369e.m5233d(view) != 1) {
                z = false;
            }
            int e = w0Var.mo8945e();
            int f = w0Var.mo8947f();
            int i = cVar.f34522a + (z ? f : e);
            cVar.f34522a = i;
            int i2 = cVar.f34524c;
            if (!z) {
                e = f;
            }
            int i3 = i2 + e;
            cVar.f34524c = i3;
            C2364y.C2369e.m5240k(view, i, cVar.f34523b, i3, cVar.f34525d);
            return w0Var;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C15213b extends NavigationBarView.C15384b {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface C15214c extends NavigationBarView.C15385c {
    }

    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addCompatibilityTopDivider(Context context) {
        View view = new View(context);
        Object obj = C8184a.f17966a;
        view.setBackgroundColor(C8184a.C8188d.m16468a(context, R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void applyWindowInsets() {
        C15370j.m24960a(this, new C15212a());
    }

    private int makeMinHeightSpec(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        int paddingTop = getPaddingTop();
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    public NavigationBarMenuView createNavigationBarMenuView(Context context) {
        return new BottomNavigationMenuView(context);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, makeMinHeightSpec(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(C15213b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(C15214c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132018404);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        C0340p0 e = C15367g.m24958e(context2, attributeSet, C18161c.f39689h, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(e.mo3097a(1, true));
        if (e.mo3108l(0)) {
            setMinimumHeight(e.mo3100d(0, 0));
        }
        e.mo3109n();
        if (shouldDrawCompatibilityTopDivider()) {
            addCompatibilityTopDivider(context2);
        }
        applyWindowInsets();
    }
}
