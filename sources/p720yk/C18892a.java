package p720yk;

import android.content.Context;
import android.view.View;
import com.etsy.android.R;
import com.google.android.material.navigation.NavigationBarItemView;

/* renamed from: yk.a */
public final class C18892a extends NavigationBarItemView {
    public C18892a(Context context) {
        super(context);
    }

    public final int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    public final int getItemLayoutResId() {
        return R.layout.mtrl_navigation_rail_item;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }
}
