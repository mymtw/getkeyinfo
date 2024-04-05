package com.etsy.android.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.C9055f;
import kotlin.jvm.internal.C19383o;
import p357gf.C12793b;

public class RatingIconView extends LinearLayout {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_NUM_STARS = 5;
    private Drawable emptyStar;
    private Drawable fullStar;
    private Drawable halfStar;
    private boolean isEditable = false;
    private int numStars = 5;
    private float rating;
    private C11922a ratingChangeListener;
    private int starSizePixels;
    private int starSpacingPixels;

    /* renamed from: com.etsy.android.uikit.view.RatingIconView$a */
    public interface C11922a {
        /* renamed from: a */
        void mo38603a();
    }

    static {
        Class<RatingIconView> cls = RatingIconView.class;
    }

    public RatingIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        if (!isInEditMode()) {
            setOrientation(0);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1993m.f4498m);
            boolean z = obtainStyledAttributes.getBoolean(4, false);
            this.starSizePixels = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.starSpacingPixels = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.rating = (float) obtainStyledAttributes.getInt(1, 0);
            this.isEditable = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            int i = z ? R.drawable.sk_ic_star_no_padding : R.drawable.sk_ic_star;
            int i2 = z ? R.drawable.sk_ic_halfstar_no_padding : R.drawable.sk_ic_halfstar;
            Context context = getContext();
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.clg_color_bg_secondary, typedValue, true);
            int i3 = typedValue.resourceId;
            Context context2 = getContext();
            C19383o.m32797g(context2, ResponseConstants.CONTEXT);
            TypedValue typedValue2 = new TypedValue();
            context2.getTheme().resolveAttribute(R.attr.clg_color_text_primary, typedValue2, true);
            int i4 = typedValue2.resourceId;
            this.emptyStar = C12793b.m20434a(i, getContext(), i3);
            this.fullStar = C12793b.m20434a(i, getContext(), i4);
            this.halfStar = new LayerDrawable(new Drawable[]{this.emptyStar, C12793b.m20434a(i2, getContext(), i4)});
            setRating(this.rating);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateView$0(View view) {
        setRating(((float) indexOfChild(view)) + 1.0f);
    }

    private void updateView() {
        removeAllViews();
        if (this.numStars > 0) {
            int round = Math.round(this.rating * 2.0f);
            int i = 0;
            while (i < this.numStars * 2) {
                ImageView imageView = new ImageView(getContext());
                if (this.isEditable) {
                    imageView.setOnClickListener(new C9055f(this, 5));
                }
                int i2 = this.starSizePixels;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
                if (i > 0) {
                    layoutParams.leftMargin = this.starSpacingPixels;
                }
                imageView.setLayoutParams(layoutParams);
                int i3 = i + 2;
                if (i3 <= round) {
                    imageView.setImageDrawable(this.fullStar);
                } else if (i > round) {
                    imageView.setImageDrawable(this.emptyStar);
                } else if (i + 1 == round) {
                    imageView.setImageDrawable(this.halfStar);
                } else {
                    imageView.setImageDrawable(this.emptyStar);
                }
                addView(imageView);
                i = i3;
            }
        }
        setContentDescription(getResources().getString(R.string.star_rating, new Object[]{Integer.valueOf((int) this.rating)}));
    }

    public float getRating() {
        return this.rating;
    }

    public void setIsEditable(boolean z) {
        this.isEditable = z;
        updateView();
    }

    public void setNumStars(int i) {
        this.numStars = i;
        updateView();
    }

    public void setOnRatingChangeListener(C11922a aVar) {
        this.ratingChangeListener = aVar;
    }

    public void setRating(float f) {
        this.rating = f;
        if (f < 0.0f) {
            this.rating = 0.0f;
        }
        updateView();
        C11922a aVar = this.ratingChangeListener;
        if (aVar != null) {
            aVar.mo38603a();
        }
    }

    public RatingIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
