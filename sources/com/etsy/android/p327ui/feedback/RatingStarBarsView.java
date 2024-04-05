package com.etsy.android.p327ui.feedback;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.compose.p015ui.text.font.C1948d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.etsy.android.R;
import com.etsy.android.feedback.data.Rating;
import com.etsy.android.lib.models.RatingsPercents;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.text.NumberFormat;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435rb.C13350a;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.feedback.RatingStarBarsView */
public final class RatingStarBarsView extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private C9902a fiveStarRow;
    private C9902a fourStarRow;
    private C19857l<? super Rating, C19394m> onRatingClicked;
    private C9902a oneStarRow;
    private C9902a threeStarRow;
    private C9902a twoStarRow;

    /* renamed from: com.etsy.android.ui.feedback.RatingStarBarsView$a */
    public static final class C9902a {

        /* renamed from: a */
        public int f21840a = 0;

        /* renamed from: b */
        public final Rating f21841b;

        /* renamed from: c */
        public final TextView f21842c;

        /* renamed from: d */
        public final LinearProgressIndicator f21843d;

        /* renamed from: e */
        public final TextView f21844e;

        /* renamed from: f */
        public final Group f21845f;

        public C9902a(Rating rating, TextView textView, LinearProgressIndicator linearProgressIndicator, TextView textView2, Group group) {
            C19383o.m32797g(rating, ResponseConstants.RATING);
            this.f21841b = rating;
            this.f21842c = textView;
            this.f21843d = linearProgressIndicator;
            this.f21844e = textView2;
            this.f21845f = group;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9902a)) {
                return false;
            }
            C9902a aVar = (C9902a) obj;
            return this.f21840a == aVar.f21840a && this.f21841b == aVar.f21841b && C19383o.m32792b(this.f21842c, aVar.f21842c) && C19383o.m32792b(this.f21843d, aVar.f21843d) && C19383o.m32792b(this.f21844e, aVar.f21844e) && C19383o.m32792b(this.f21845f, aVar.f21845f);
        }

        public final int hashCode() {
            int hashCode = this.f21841b.hashCode();
            int hashCode2 = this.f21842c.hashCode();
            int hashCode3 = this.f21843d.hashCode();
            int hashCode4 = this.f21844e.hashCode();
            return this.f21845f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Integer.hashCode(this.f21840a) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("StarRow(percent=");
            h.append(this.f21840a);
            h.append(", rating=");
            h.append(this.f21841b);
            h.append(", title=");
            h.append(this.f21842c);
            h.append(", bar=");
            h.append(this.f21843d);
            h.append(", label=");
            h.append(this.f21844e);
            h.append(", group=");
            h.append(this.f21845f);
            h.append(')');
            return h.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RatingStarBarsView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RatingStarBarsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RatingStarBarsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.view_rating_star_bars, this, true);
        Rating rating = Rating.FIVE_STAR;
        View findViewById = findViewById(R.id.rating_five_star_title);
        C19383o.m32796f(findViewById, "findViewById(R.id.rating_five_star_title)");
        View findViewById2 = findViewById(R.id.rating_five_star_bar);
        C19383o.m32796f(findViewById2, "findViewById(R.id.rating_five_star_bar)");
        View findViewById3 = findViewById(R.id.rating_five_star_percent);
        C19383o.m32796f(findViewById3, "findViewById(R.id.rating_five_star_percent)");
        View findViewById4 = findViewById(R.id.rating_five_star_group);
        C19383o.m32796f(findViewById4, "findViewById(R.id.rating_five_star_group)");
        this.fiveStarRow = new C9902a(rating, (TextView) findViewById, (LinearProgressIndicator) findViewById2, (TextView) findViewById3, (Group) findViewById4);
        Rating rating2 = Rating.FOUR_STAR;
        View findViewById5 = findViewById(R.id.rating_four_star_title);
        C19383o.m32796f(findViewById5, "findViewById(R.id.rating_four_star_title)");
        View findViewById6 = findViewById(R.id.rating_four_star_bar);
        C19383o.m32796f(findViewById6, "findViewById(R.id.rating_four_star_bar)");
        View findViewById7 = findViewById(R.id.rating_four_star_percent);
        C19383o.m32796f(findViewById7, "findViewById(R.id.rating_four_star_percent)");
        View findViewById8 = findViewById(R.id.rating_four_star_group);
        C19383o.m32796f(findViewById8, "findViewById(R.id.rating_four_star_group)");
        this.fourStarRow = new C9902a(rating2, (TextView) findViewById5, (LinearProgressIndicator) findViewById6, (TextView) findViewById7, (Group) findViewById8);
        Rating rating3 = Rating.THREE_STAR;
        View findViewById9 = findViewById(R.id.rating_three_star_title);
        C19383o.m32796f(findViewById9, "findViewById(R.id.rating_three_star_title)");
        View findViewById10 = findViewById(R.id.rating_three_star_bar);
        C19383o.m32796f(findViewById10, "findViewById(R.id.rating_three_star_bar)");
        View findViewById11 = findViewById(R.id.rating_three_star_percent);
        C19383o.m32796f(findViewById11, "findViewById(R.id.rating_three_star_percent)");
        View findViewById12 = findViewById(R.id.rating_three_star_group);
        C19383o.m32796f(findViewById12, "findViewById(R.id.rating_three_star_group)");
        this.threeStarRow = new C9902a(rating3, (TextView) findViewById9, (LinearProgressIndicator) findViewById10, (TextView) findViewById11, (Group) findViewById12);
        Rating rating4 = Rating.TWO_STAR;
        View findViewById13 = findViewById(R.id.rating_two_star_title);
        C19383o.m32796f(findViewById13, "findViewById(R.id.rating_two_star_title)");
        View findViewById14 = findViewById(R.id.rating_two_star_bar);
        C19383o.m32796f(findViewById14, "findViewById(R.id.rating_two_star_bar)");
        View findViewById15 = findViewById(R.id.rating_two_star_percent);
        C19383o.m32796f(findViewById15, "findViewById(R.id.rating_two_star_percent)");
        View findViewById16 = findViewById(R.id.rating_two_star_group);
        C19383o.m32796f(findViewById16, "findViewById(R.id.rating_two_star_group)");
        this.twoStarRow = new C9902a(rating4, (TextView) findViewById13, (LinearProgressIndicator) findViewById14, (TextView) findViewById15, (Group) findViewById16);
        Rating rating5 = Rating.ONE_STAR;
        View findViewById17 = findViewById(R.id.rating_one_star_title);
        C19383o.m32796f(findViewById17, "findViewById(R.id.rating_one_star_title)");
        View findViewById18 = findViewById(R.id.rating_one_star_bar);
        C19383o.m32796f(findViewById18, "findViewById(R.id.rating_one_star_bar)");
        View findViewById19 = findViewById(R.id.rating_one_star_percent);
        C19383o.m32796f(findViewById19, "findViewById(R.id.rating_one_star_percent)");
        View findViewById20 = findViewById(R.id.rating_one_star_group);
        C19383o.m32796f(findViewById20, "findViewById(R.id.rating_one_star_group)");
        this.oneStarRow = new C9902a(rating5, (TextView) findViewById17, (LinearProgressIndicator) findViewById18, (TextView) findViewById19, (Group) findViewById20);
    }

    private final void populatePercentage(int i, C9902a aVar) {
        aVar.f21840a = i;
        aVar.f21843d.setProgressCompat(i, true);
        TextView textView = aVar.f21844e;
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMaximumFractionDigits(0);
        String format = percentInstance.format(Float.valueOf(((float) i) / 100.0f));
        C19383o.m32796f(format, "formatter.format(decimal)");
        textView.setText(format);
        if (i == 0) {
            C19388s.m32888u0(aVar.f21845f, false);
            aVar.f21842c.setTypeface(Typeface.DEFAULT);
            TextView textView2 = aVar.f21842c;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            textView2.setTextColor(C13350a.m21013d(context, R.attr.clg_color_text_tertiary));
            return;
        }
        C19388s.m32890v0(aVar.f21845f, true, new RatingStarBarsView$populatePercentage$1(this, aVar));
    }

    private final void updateRatingViews(C9902a aVar, Rating rating) {
        if (aVar.f21840a != 0) {
            if (rating == Rating.NONE) {
                TextView textView = aVar.f21842c;
                Context context = getContext();
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                textView.setTextColor(C1948d.m4271c(context, R.color.rating_star_label_text_color));
                aVar.f21844e.setTypeface(Typeface.DEFAULT);
                LinearProgressIndicator linearProgressIndicator = aVar.f21843d;
                Context context2 = getContext();
                C19383o.m32796f(context2, ResponseConstants.CONTEXT);
                linearProgressIndicator.setTrackColor(C13350a.m21013d(context2, R.attr.clg_color_bg_secondary));
                LinearProgressIndicator linearProgressIndicator2 = aVar.f21843d;
                Context context3 = getContext();
                C19383o.m32796f(context3, ResponseConstants.CONTEXT);
                linearProgressIndicator2.setIndicatorColor(C1948d.m4271c(context3, R.color.rating_star_bar_indicator_selected));
            } else if (aVar.f21841b == rating) {
                TextView textView2 = aVar.f21842c;
                Context context4 = getContext();
                C19383o.m32796f(context4, ResponseConstants.CONTEXT);
                textView2.setTextColor(C13350a.m21013d(context4, R.attr.clg_color_text_primary));
                aVar.f21844e.setTypeface(Typeface.DEFAULT_BOLD);
                LinearProgressIndicator linearProgressIndicator3 = aVar.f21843d;
                Context context5 = getContext();
                C19383o.m32796f(context5, ResponseConstants.CONTEXT);
                linearProgressIndicator3.setTrackColor(C1948d.m4271c(context5, R.color.rating_star_bar_track_selected));
                LinearProgressIndicator linearProgressIndicator4 = aVar.f21843d;
                Context context6 = getContext();
                C19383o.m32796f(context6, ResponseConstants.CONTEXT);
                linearProgressIndicator4.setIndicatorColor(C1948d.m4271c(context6, R.color.rating_star_bar_indicator_selected));
            } else {
                TextView textView3 = aVar.f21842c;
                Context context7 = getContext();
                C19383o.m32796f(context7, ResponseConstants.CONTEXT);
                textView3.setTextColor(C1948d.m4271c(context7, R.color.rating_star_label_text_color));
                aVar.f21844e.setTypeface(Typeface.DEFAULT);
                LinearProgressIndicator linearProgressIndicator5 = aVar.f21843d;
                Context context8 = getContext();
                C19383o.m32796f(context8, ResponseConstants.CONTEXT);
                linearProgressIndicator5.setTrackColor(C13350a.m21013d(context8, R.attr.clg_color_bg_secondary));
                LinearProgressIndicator linearProgressIndicator6 = aVar.f21843d;
                Context context9 = getContext();
                C19383o.m32796f(context9, ResponseConstants.CONTEXT);
                linearProgressIndicator6.setIndicatorColor(C1948d.m4271c(context9, R.color.rating_star_bar_indicator));
            }
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

    public final C19857l<Rating, C19394m> getOnRatingClicked() {
        return this.onRatingClicked;
    }

    public final void ratingSelected(Rating rating) {
        C19383o.m32797g(rating, "selectedRating");
        updateRatingViews(this.fiveStarRow, rating);
        updateRatingViews(this.fourStarRow, rating);
        updateRatingViews(this.threeStarRow, rating);
        updateRatingViews(this.twoStarRow, rating);
        updateRatingViews(this.oneStarRow, rating);
    }

    public final void setData(RatingsPercents ratingsPercents) {
        C19383o.m32797g(ratingsPercents, "ratingsPercents");
        populatePercentage(ratingsPercents.getFiveStars(), this.fiveStarRow);
        populatePercentage(ratingsPercents.getFourStars(), this.fourStarRow);
        populatePercentage(ratingsPercents.getThreeStars(), this.threeStarRow);
        populatePercentage(ratingsPercents.getTwoStars(), this.twoStarRow);
        populatePercentage(ratingsPercents.getOneStars(), this.oneStarRow);
    }

    public final void setOnRatingClicked(C19857l<? super Rating, C19394m> lVar) {
        this.onRatingClicked = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RatingStarBarsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
