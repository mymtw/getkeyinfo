package com.etsy.android.stylekit.views.ratings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p388lb.C13006a;
import p435rb.C13350a;
import p435rb.C13351b;

public final class CollageRatingView extends AppCompatTextView {
    public static final int $stable = 8;
    private final RatingDrawable ratingDrawable;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRatingView(Context context) {
        this(context, (AttributeSet) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    private final void setupDrawables() {
        setCompoundDrawablesWithIntrinsicBounds((Drawable) this.ratingDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        updateContentDescription();
    }

    private final void updateContentDescription() {
        if (!isInEditMode()) {
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            CharSequence text = getText();
            C19383o.m32796f(text, "text");
            setContentDescription(C13350a.m21016g(context, R.attr.clg_rating_view_content_description, Float.valueOf(this.ratingDrawable.getRating()), Integer.valueOf(this.ratingDrawable.getMaxRating()), text));
        }
    }

    public final float getIconVisualRating() {
        return this.ratingDrawable.getIconVisualRating();
    }

    public final float getRating() {
        return this.ratingDrawable.getRating();
    }

    public final void setRating(float f) {
        if (!(this.ratingDrawable.getRating() == f)) {
            this.ratingDrawable.setRating(f);
            setupDrawables();
            invalidate();
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (!(charSequence == null || charSequence.length() == 0) && this.ratingDrawable != null) {
            updateContentDescription();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        setGravity(getGravity() | 16);
        int i3 = R.style.clg_text_body;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(R.style.clg_text_body, new int[]{16842904});
        int color = obtainStyledAttributes.getColor(0, -16776961);
        obtainStyledAttributes.recycle();
        int i4 = 4;
        int i5 = 18;
        float f = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C13006a.f28651r);
            C19383o.m32796f(obtainStyledAttributes2, "context.obtainStyledAttr…leable.CollageRatingView)");
            f = obtainStyledAttributes2.getFloat(1, 0.0f);
            int i6 = obtainStyledAttributes2.getInt(2, 1);
            if (i6 == 0) {
                i5 = 12;
            } else if (i6 == 2) {
                i5 = 24;
            }
            if (i6 == 0) {
                i4 = 2;
            } else if (i6 == 2) {
                i4 = 8;
            }
            if (i6 == 0) {
                i2 = R.style.clg_text_body_small;
            } else {
                i2 = i6 == 2 ? R.style.clg_text_title_large : i2;
                color = obtainStyledAttributes2.getColor(0, color);
                obtainStyledAttributes2.recycle();
            }
            i3 = i2;
            color = obtainStyledAttributes2.getColor(0, color);
            obtainStyledAttributes2.recycle();
        }
        setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(R.dimen.clg_space_4));
        this.ratingDrawable = new RatingDrawable(context, C13350a.m21015f(Integer.valueOf(i5), context), C13350a.m21014e(Integer.valueOf(i4), context), Integer.valueOf(color));
        C13351b.m21018b(this, i3);
        setRating(f);
        setupDrawables();
    }
}
