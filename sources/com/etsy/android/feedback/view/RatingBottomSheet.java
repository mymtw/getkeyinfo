package com.etsy.android.feedback.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.data.Rating;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;
import p753kq.C19857l;

public final class RatingBottomSheet extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private C19857l<? super Rating, C19394m> ratingClickListener;

    /* renamed from: com.etsy.android.feedback.view.RatingBottomSheet$a */
    public /* synthetic */ class C6476a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14383a;

        static {
            int[] iArr = new int[Rating.values().length];
            iArr[Rating.ONE_STAR.ordinal()] = 1;
            iArr[Rating.TWO_STAR.ordinal()] = 2;
            iArr[Rating.THREE_STAR.ordinal()] = 3;
            iArr[Rating.FOUR_STAR.ordinal()] = 4;
            iArr[Rating.FIVE_STAR.ordinal()] = 5;
            iArr[Rating.NONE.ordinal()] = 6;
            f14383a = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RatingBottomSheet(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RatingBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingBottomSheet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.menu_reviews_rating_filter_list, this, true);
        View findViewById = findViewById(R.id.rating_filter_reset);
        C19383o.m32796f(findViewById, "findViewById<View>(R.id.rating_filter_reset)");
        ViewExtensions.m12866j(findViewById, new C19857l<View, C19394m>(this) {
            public final /* synthetic */ RatingBottomSheet this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C19394m.f43287a;
            }

            public final void invoke(View view) {
                C19857l<Rating, C19394m> ratingClickListener = this.this$0.getRatingClickListener();
                if (ratingClickListener != null) {
                    ratingClickListener.invoke(Rating.NONE);
                }
            }
        });
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.rating_filter_ratings);
        Rating[] values = Rating.values();
        ArrayList arrayList = new ArrayList();
        int length = values.length;
        for (int i2 = 0; i2 < length; i2++) {
            Rating rating = values[i2];
            if (rating != Rating.NONE) {
                arrayList.add(rating);
            }
        }
        for (Rating buildRatingRow : C19327t.m32653i1(C19327t.m32660p1(arrayList))) {
            linearLayout.addView(buildRatingRow(from, buildRatingRow));
        }
    }

    private final View buildRatingRow(LayoutInflater layoutInflater, Rating rating) {
        Pair pair;
        Resources resources = getContext().getResources();
        View inflate = layoutInflater.inflate(R.layout.view_rating_filter, this, false);
        int i = C6476a.f14383a[rating.ordinal()];
        if (i == 1) {
            pair = new Pair(resources.getString(R.string.review_one_star), 1);
        } else if (i == 2) {
            pair = new Pair(resources.getString(R.string.review_two_star), 2);
        } else if (i == 3) {
            pair = new Pair(resources.getString(R.string.review_three_star), 3);
        } else if (i == 4) {
            pair = new Pair(resources.getString(R.string.review_four_star), 4);
        } else if (i == 5) {
            pair = new Pair(resources.getString(R.string.review_five_star), 5);
        } else {
            throw new IllegalStateException("Does not support Rating.NONE");
        }
        int intValue = ((Number) pair.component2()).intValue();
        ((TextView) inflate.findViewById(R.id.rating_filter_title)).setText((String) pair.component1());
        ((CollageRatingView) inflate.findViewById(R.id.rating_filter_rating)).setRating((float) intValue);
        inflate.setTag(rating);
        ViewExtensions.m12866j(inflate, new RatingBottomSheet$buildRatingRow$1(this, rating));
        return inflate;
    }

    private final String getRatingCheckedDescription(Rating rating) {
        Resources resources = getContext().getResources();
        switch (C6476a.f14383a[rating.ordinal()]) {
            case 1:
                return resources.getString(R.string.review_one_star_description);
            case 2:
                return resources.getString(R.string.review_two_star_description);
            case 3:
                return resources.getString(R.string.review_three_star_description);
            case 4:
                return resources.getString(R.string.review_four_star_description);
            case 5:
                return resources.getString(R.string.review_five_star_description);
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
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

    public final C19857l<Rating, C19394m> getRatingClickListener() {
        return this.ratingClickListener;
    }

    public final void setRatingClickListener(C19857l<? super Rating, C19394m> lVar) {
        this.ratingClickListener = lVar;
    }

    public final void setSelectedRating(Rating rating) {
        Rating[] values = Rating.values();
        ArrayList<Rating> arrayList = new ArrayList<>();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            Rating rating2 = values[i];
            if (rating2 != Rating.NONE) {
                arrayList.add(rating2);
            }
        }
        for (Rating rating3 : arrayList) {
            View findViewById = ((ViewGroup) findViewWithTag(rating3)).findViewById(R.id.rating_filter_selected);
            findViewById.setVisibility(rating3 == rating ? 0 : 8);
            findViewById.setContentDescription(rating3 == rating ? getRatingCheckedDescription(rating3) : null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RatingBottomSheet(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
