package com.etsy.android.uikit.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.etsy.android.R;

public class ClickableImageView extends AppCompatImageView {
    private static final int COLOR_RES = 2131100557;
    private final int mColor = getResources().getColor(R.color.sk_highlight);

    public ClickableImageView(Context context) {
        super(context);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int[] drawableState = getDrawableState();
            int length = drawableState.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (drawableState[i] == 16842919) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                drawable.setColorFilter(this.mColor, PorterDuff.Mode.SRC_ATOP);
            } else {
                drawable.clearColorFilter();
            }
            invalidate();
        }
    }

    public ClickableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
