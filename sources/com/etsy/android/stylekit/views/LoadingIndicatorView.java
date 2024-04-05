package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p388lb.C13006a;

public final class LoadingIndicatorView extends AppCompatImageView {
    public static final int $stable = 8;
    private ColorScheme colorScheme;
    private LoadingIndicatorDrawable drawable;
    private boolean isLarge;

    public enum ColorScheme {
        NORMAL(1),
        LIGHT(2),
        INVERT(3);
        
        private final int value;

        private ColorScheme(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void updateDrawable() {
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.setCallback((Drawable.Callback) null);
        }
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        LoadingIndicatorDrawable loadingIndicatorDrawable2 = new LoadingIndicatorDrawable(context, this.colorScheme, this.isLarge);
        this.drawable = loadingIndicatorDrawable2;
        loadingIndicatorDrawable2.setCallback(this);
        setImageDrawable(this.drawable);
    }

    public void onAttachedToWindow() {
        LoadingIndicatorDrawable loadingIndicatorDrawable;
        super.onAttachedToWindow();
        if (getVisibility() == 0 && (loadingIndicatorDrawable = this.drawable) != null) {
            loadingIndicatorDrawable.start();
        }
    }

    public void onDetachedFromWindow() {
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        if (loadingIndicatorDrawable != null) {
            loadingIndicatorDrawable.stop();
        }
        super.onDetachedFromWindow();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
            i3 = Math.min(loadingIndicatorDrawable != null ? loadingIndicatorDrawable.getIntrinsicWidth() : 0, View.MeasureSpec.getSize(i));
        } else if (mode != 1073741824) {
            LoadingIndicatorDrawable loadingIndicatorDrawable2 = this.drawable;
            i3 = loadingIndicatorDrawable2 != null ? loadingIndicatorDrawable2.getIntrinsicWidth() : 0;
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            LoadingIndicatorDrawable loadingIndicatorDrawable3 = this.drawable;
            if (loadingIndicatorDrawable3 != null) {
                i4 = loadingIndicatorDrawable3.getIntrinsicHeight();
            }
            i4 = Math.min(i4, View.MeasureSpec.getSize(i2));
        } else if (mode2 != 1073741824) {
            LoadingIndicatorDrawable loadingIndicatorDrawable4 = this.drawable;
            if (loadingIndicatorDrawable4 != null) {
                i4 = loadingIndicatorDrawable4.getIntrinsicHeight();
            }
        } else {
            i4 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i3, getPaddingBottom() + getPaddingTop() + i4);
    }

    public void onVisibilityChanged(View view, int i) {
        C19383o.m32797g(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
            if (loadingIndicatorDrawable != null) {
                loadingIndicatorDrawable.start();
                return;
            }
            return;
        }
        LoadingIndicatorDrawable loadingIndicatorDrawable2 = this.drawable;
        if (loadingIndicatorDrawable2 != null) {
            loadingIndicatorDrawable2.stop();
        }
    }

    public final void setColorScheme(ColorScheme colorScheme2) {
        C19383o.m32797g(colorScheme2, "colorScheme");
        this.colorScheme = colorScheme2;
        updateDrawable();
    }

    public final void setIsLarge(boolean z) {
        this.isLarge = z;
        updateDrawable();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        ColorScheme colorScheme2 = ColorScheme.NORMAL;
        this.colorScheme = colorScheme2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28658y, 0, 0);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…adingIndicatorView, 0, 0)");
            this.isLarge = obtainStyledAttributes.getBoolean(1, false);
            int i2 = obtainStyledAttributes.getInt(0, 1);
            if (i2 != 1) {
                if (i2 == 2) {
                    colorScheme2 = ColorScheme.LIGHT;
                } else if (i2 == 3) {
                    colorScheme2 = ColorScheme.INVERT;
                }
            }
            this.colorScheme = colorScheme2;
            obtainStyledAttributes.recycle();
        }
        updateDrawable();
    }
}
