package com.etsy.android.uikit.p331ui.core;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p435rb.C13350a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.uikit.ui.core.NumericRatingView */
public final class NumericRatingView extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;

    /* renamed from: com.etsy.android.uikit.ui.core.NumericRatingView$RatingStarColor */
    public enum RatingStarColor {
        GOLD,
        DEFAULT
    }

    /* renamed from: com.etsy.android.uikit.ui.core.NumericRatingView$RatingTextColor */
    public enum RatingTextColor {
        LIGHT_GRAY
    }

    /* renamed from: com.etsy.android.uikit.ui.core.NumericRatingView$ReviewCountColor */
    public enum ReviewCountColor {
        NONE,
        BLUE,
        GRAY,
        LIGHT_GRAY
    }

    /* renamed from: com.etsy.android.uikit.ui.core.NumericRatingView$ReviewCountDisplayType */
    public enum ReviewCountDisplayType {
        FULL,
        COMPACT
    }

    /* renamed from: com.etsy.android.uikit.ui.core.NumericRatingView$a */
    public /* synthetic */ class C11887a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26431a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f26432b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f26433c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f26434d;

        static {
            int[] iArr = new int[ReviewCountDisplayType.values().length];
            iArr[ReviewCountDisplayType.FULL.ordinal()] = 1;
            iArr[ReviewCountDisplayType.COMPACT.ordinal()] = 2;
            f26431a = iArr;
            int[] iArr2 = new int[ReviewCountColor.values().length];
            iArr2[ReviewCountColor.BLUE.ordinal()] = 1;
            iArr2[ReviewCountColor.GRAY.ordinal()] = 2;
            iArr2[ReviewCountColor.LIGHT_GRAY.ordinal()] = 3;
            f26432b = iArr2;
            int[] iArr3 = new int[RatingStarColor.values().length];
            iArr3[RatingStarColor.GOLD.ordinal()] = 1;
            f26433c = iArr3;
            int[] iArr4 = new int[RatingTextColor.values().length];
            iArr4[RatingTextColor.LIGHT_GRAY.ordinal()] = 1;
            f26434d = iArr4;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NumericRatingView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NumericRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NumericRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.view_numeric_rating, this, true);
    }

    public static /* synthetic */ void setRatingData$default(NumericRatingView numericRatingView, float f, int i, ReviewCountDisplayType reviewCountDisplayType, ReviewCountColor reviewCountColor, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            reviewCountColor = ReviewCountColor.NONE;
        }
        numericRatingView.setRatingData(f, i, reviewCountDisplayType, reviewCountColor);
    }

    public static /* synthetic */ void setRatingStarColor$default(NumericRatingView numericRatingView, RatingStarColor ratingStarColor, int i, Object obj) {
        if ((i & 1) != 0) {
            ratingStarColor = RatingStarColor.DEFAULT;
        }
        numericRatingView.setRatingStarColor(ratingStarColor);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setNumericRatingTextColor(RatingTextColor ratingTextColor) {
        C19383o.m32797g(ratingTextColor, "ratingTextColor");
        if (C11887a.f26434d[ratingTextColor.ordinal()] == 1) {
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            int d = C13350a.m21013d(context, R.attr.clg_color_text_tertiary);
            TextView textView = (TextView) findViewById(R.id.numeric_rating);
            if (textView != null) {
                textView.setTextColor(d);
                return;
            }
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setRatingData(float f, int i, ReviewCountDisplayType reviewCountDisplayType, ReviewCountColor reviewCountColor) {
        String str;
        C19383o.m32797g(reviewCountDisplayType, "displayType");
        Resources resources = getContext().getResources();
        String format = NumberFormat.getNumberInstance(Locale.getDefault()).format(Integer.valueOf(i));
        ((TextView) findViewById(R.id.numeric_rating)).setText(C15588c1.m25356x0(f, 1));
        TextView textView = (TextView) findViewById(R.id.numeric_rating_review_count);
        int i2 = C11887a.f26431a[reviewCountDisplayType.ordinal()];
        if (i2 == 1) {
            str = resources.getString(R.string.parentheses, new Object[]{format});
        } else if (i2 == 2) {
            str = resources.getString(R.string.parentheses, new Object[]{C15588c1.m25296O(i)});
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setText(str);
        int i3 = reviewCountColor == null ? -1 : C11887a.f26432b[reviewCountColor.ordinal()];
        int i4 = i3 != 1 ? i3 != 2 ? i3 != 3 ? R.attr.clg_color_text_primary : R.attr.clg_color_text_tertiary : R.attr.clg_color_text_secondary : R.attr.clg_color_badge_notification_secondary;
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i4, typedValue, true);
        ((TextView) findViewById(R.id.numeric_rating_review_count)).setTextColor(typedValue.data);
    }

    public final void setRatingStarColor(RatingStarColor ratingStarColor) {
        if ((ratingStarColor == null ? -1 : C11887a.f26433c[ratingStarColor.ordinal()]) == 1) {
            Drawable drawable = ((ImageView) findViewById(R.id.numeric_rating_star)).getDrawable();
            Context context = getContext();
            Object obj = C8184a.f17966a;
            drawable.setTint(C8184a.C8188d.m16468a(context, R.color.clg_color_beeswax));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NumericRatingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
