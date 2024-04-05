package com.etsy.android.stylekit.views.ratings;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p173m.C7279a;
import p260v0.C8184a;

public final class RatingDrawable extends Drawable {
    public static final int $stable = 8;
    public static final C9071a Companion = new C9071a();
    private static final int STATE_EMPTY_ICON = 0;
    private static final int STATE_FILLED_ICON = 2;
    private static final int STATE_HALF_ICON = 1;
    private final Drawable emptyIcon;
    private final Drawable filledIcon;
    private final Drawable halfIcon;
    private final int iconSize;
    private final int iconSpacing;
    private final int[] iconStates;
    private final int maxRating;
    private float rating;

    /* renamed from: com.etsy.android.stylekit.views.ratings.RatingDrawable$a */
    public static final class C9071a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RatingDrawable(Context context, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, i2, (i3 & 8) != 0 ? null : num);
    }

    private final void assignIconStates() {
        int halfStepCount = getHalfStepCount(this.rating);
        for (int i = 0; i < this.maxRating; i++) {
            int i2 = i * 2;
            if (i2 + 2 <= halfStepCount) {
                this.iconStates[i] = 2;
            } else if (i2 > halfStepCount) {
                this.iconStates[i] = 0;
            } else if (i2 + 1 == halfStepCount) {
                this.iconStates[i] = 1;
            } else {
                this.iconStates[i] = 0;
            }
        }
    }

    private final int getHalfStepCount(float f) {
        return C7279a.m13954l(f * 2.0f);
    }

    public void draw(Canvas canvas) {
        int i;
        C19383o.m32797g(canvas, "canvas");
        int i2 = this.iconSize;
        int length = this.iconStates.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 != 0) {
                i = (this.iconSpacing * i3) + (i3 * i2);
            } else {
                i = i3 * i2;
            }
            int i4 = this.iconStates[i3];
            if (i4 == 1) {
                int i5 = i + i2;
                this.emptyIcon.setBounds(i, 0, i5, this.iconSize);
                this.emptyIcon.draw(canvas);
                this.halfIcon.setBounds(i, 0, i5, this.iconSize);
                this.halfIcon.draw(canvas);
            } else if (i4 != 2) {
                this.emptyIcon.setBounds(i, 0, i + i2, this.iconSize);
                this.emptyIcon.draw(canvas);
            } else {
                this.filledIcon.setBounds(i, 0, i + i2, this.iconSize);
                this.filledIcon.draw(canvas);
            }
        }
    }

    public final float getIconVisualRating() {
        int length = this.iconStates.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            int i2 = this.iconStates[i];
            if (i2 == 0) {
                return f;
            }
            f += i2 == 1 ? 0.5f : 1.0f;
        }
        return f;
    }

    public int getIntrinsicHeight() {
        return this.iconSize;
    }

    public int getIntrinsicWidth() {
        int i = this.iconSize;
        int i2 = this.maxRating;
        return ((i2 - 1) * this.iconSpacing) + (i * i2);
    }

    public final int getMaxRating() {
        return this.maxRating;
    }

    public int getMinimumHeight() {
        return getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return getIntrinsicWidth();
    }

    public int getOpacity() {
        return -1;
    }

    public final float getRating() {
        return this.rating;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setRating(float f) {
        boolean z = getHalfStepCount(f) != getHalfStepCount(this.rating);
        this.rating = f;
        if (z) {
            assignIconStates();
            invalidateSelf();
        }
    }

    public RatingDrawable(Context context, int i, int i2, Integer num) {
        this.iconSize = i;
        this.iconSpacing = i2;
        this.maxRating = 5;
        this.iconStates = new int[5];
        assignIconStates();
        C19383o.m32794d(context);
        Object obj = C8184a.f17966a;
        Drawable b = C8184a.C8187c.m16466b(context, R.drawable.clg_ic_rating_star);
        C19383o.m32794d(b);
        Drawable mutate = b.mutate();
        C19383o.m32796f(mutate, "getDrawable(context!!, R…c_rating_star)!!.mutate()");
        this.filledIcon = mutate;
        Drawable b2 = C8184a.C8187c.m16466b(context, R.drawable.clg_ic_rating_emptystar);
        C19383o.m32794d(b2);
        Drawable mutate2 = b2.mutate();
        C19383o.m32796f(mutate2, "getDrawable(context, R.d…ing_emptystar)!!.mutate()");
        this.emptyIcon = mutate2;
        Drawable b3 = C8184a.C8187c.m16466b(context, R.drawable.clg_ic_rating_halfstar);
        C19383o.m32794d(b3);
        Drawable mutate3 = b3.mutate();
        C19383o.m32796f(mutate3, "getDrawable(context, R.d…ting_halfstar)!!.mutate()");
        this.halfIcon = mutate3;
        if (num != null) {
            mutate.setTint(num.intValue());
            mutate2.setTint(num.intValue());
            mutate3.setTint(num.intValue());
        }
    }
}
