package com.etsy.android.p327ui.common.listingreview.redesign;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ShopRating;
import com.etsy.android.lib.models.apiv3.listing.Subrating;
import com.etsy.android.lib.models.apiv3.listing.Subratings;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ShopSubratingsGraphView */
public final class ShopSubratingsGraphView extends FrameLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final View fullGraphView;
    private final LinearProgressIndicator qualityBar;
    private final Group qualityGroup;
    private final TextView qualityValueLabel;
    private final TextView ratingCountLabel;
    private final TextView ratingCountLabelSimplified;
    private final LinearProgressIndicator serviceBar;
    private final Group serviceGroup;
    private final TextView serviceValueLabel;
    private final LinearProgressIndicator shippingBar;
    private final Group shippingGroup;
    private final TextView shippingValueLabel;
    private final TextView shopRatingLabel;
    private final TextView shopRatingLabelSimplified;
    private final CollageRatingView shopRatingStars;
    private final View simplifiedGraphView;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShopSubratingsGraphView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShopSubratingsGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopSubratingsGraphView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.view_shop_subratings_graph, this, true);
        View findViewById = findViewById(R.id.shop_subratings_graph_full);
        C19383o.m32796f(findViewById, "findViewById(R.id.shop_subratings_graph_full)");
        this.fullGraphView = findViewById;
        View findViewById2 = findViewById(R.id.shop_subratings_graph_simplified);
        C19383o.m32796f(findViewById2, "findViewById(R.id.shop_s…ratings_graph_simplified)");
        this.simplifiedGraphView = findViewById2;
        View findViewById3 = findViewById(R.id.shop_subratings_large_rating);
        C19383o.m32796f(findViewById3, "findViewById(R.id.shop_subratings_large_rating)");
        this.shopRatingLabel = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.shop_subratings_number_ratings);
        C19383o.m32796f(findViewById4, "findViewById(R.id.shop_subratings_number_ratings)");
        this.ratingCountLabel = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.shop_subratings_quality_bar);
        C19383o.m32796f(findViewById5, "findViewById(R.id.shop_subratings_quality_bar)");
        this.qualityBar = (LinearProgressIndicator) findViewById5;
        View findViewById6 = findViewById(R.id.shop_subratings_shipping_bar);
        C19383o.m32796f(findViewById6, "findViewById(R.id.shop_subratings_shipping_bar)");
        this.shippingBar = (LinearProgressIndicator) findViewById6;
        View findViewById7 = findViewById(R.id.shop_subratings_service_bar);
        C19383o.m32796f(findViewById7, "findViewById(R.id.shop_subratings_service_bar)");
        this.serviceBar = (LinearProgressIndicator) findViewById7;
        View findViewById8 = findViewById(R.id.shop_subratings_quality_rating);
        C19383o.m32796f(findViewById8, "findViewById(R.id.shop_subratings_quality_rating)");
        this.qualityValueLabel = (TextView) findViewById8;
        View findViewById9 = findViewById(R.id.shop_subratings_shipping_rating);
        C19383o.m32796f(findViewById9, "findViewById(R.id.shop_subratings_shipping_rating)");
        this.shippingValueLabel = (TextView) findViewById9;
        View findViewById10 = findViewById(R.id.shop_subratings_service_rating);
        C19383o.m32796f(findViewById10, "findViewById(R.id.shop_subratings_service_rating)");
        this.serviceValueLabel = (TextView) findViewById10;
        View findViewById11 = findViewById(R.id.shop_subratings_quality_group);
        C19383o.m32796f(findViewById11, "findViewById(R.id.shop_subratings_quality_group)");
        this.qualityGroup = (Group) findViewById11;
        View findViewById12 = findViewById(R.id.shop_subratings_shipping_group);
        C19383o.m32796f(findViewById12, "findViewById(R.id.shop_subratings_shipping_group)");
        this.shippingGroup = (Group) findViewById12;
        View findViewById13 = findViewById(R.id.shop_subratings_service_group);
        C19383o.m32796f(findViewById13, "findViewById(R.id.shop_subratings_service_group)");
        this.serviceGroup = (Group) findViewById13;
        View findViewById14 = findViewById(R.id.shop_subratings_large_rating_simplified);
        C19383o.m32796f(findViewById14, "findViewById(R.id.shop_s…_large_rating_simplified)");
        this.shopRatingLabelSimplified = (TextView) findViewById14;
        View findViewById15 = findViewById(R.id.shop_subratings_rating_stars);
        C19383o.m32796f(findViewById15, "findViewById(R.id.shop_subratings_rating_stars)");
        this.shopRatingStars = (CollageRatingView) findViewById15;
        View findViewById16 = findViewById(R.id.shop_subratings_number_ratings_simplified);
        C19383o.m32796f(findViewById16, "findViewById(R.id.shop_s…umber_ratings_simplified)");
        this.ratingCountLabelSimplified = (TextView) findViewById16;
    }

    private final int calculateProgress(float f) {
        return (int) ((f / 5.0f) * ((float) 100));
    }

    private final String formatRatingCount(Integer num) {
        if (num == null) {
            return "";
        }
        String O = C15588c1.m25296O(num.intValue());
        String quantityString = getResources().getQuantityString(R.plurals.rating_count_plurals, num.intValue(), new Object[]{O});
        C19383o.m32796f(quantityString, "resources.getQuantityStr…ingCount, formattedCount)");
        return quantityString;
    }

    private final String formatShopRating(Float f) {
        return String.valueOf(f != null ? Float.valueOf(C15588c1.m25295N0(f.floatValue())) : null);
    }

    private final void populateFull(ShopRating shopRating) {
        this.shopRatingLabel.setText(formatShopRating(shopRating.getRating()));
        this.ratingCountLabel.setText(formatRatingCount(shopRating.getRatingCount()));
        Subratings subratings = shopRating.getSubratings();
        if (subratings != null) {
            populateSubrating(subratings.getItemQuality(), this.qualityBar, this.qualityValueLabel, this.qualityGroup);
            populateSubrating(subratings.getShipping(), this.shippingBar, this.shippingValueLabel, this.shippingGroup);
            populateSubrating(subratings.getSellerCustomerService(), this.serviceBar, this.serviceValueLabel, this.serviceGroup);
        }
    }

    private final void populateSimplified(ShopRating shopRating) {
        this.shopRatingLabelSimplified.setText(formatShopRating(shopRating.getRating()));
        this.ratingCountLabelSimplified.setText(formatRatingCount(shopRating.getRatingCount()));
        Float rating = shopRating.getRating();
        if (rating != null) {
            this.shopRatingStars.setRating(rating.floatValue());
        }
    }

    private final void populateSubrating(Subrating subrating, LinearProgressIndicator linearProgressIndicator, TextView textView, Group group) {
        if ((subrating != null ? subrating.getAverage() : null) != null) {
            Float average = subrating.getAverage();
            C19383o.m32794d(average);
            if (average.floatValue() > 0.0f) {
                Float average2 = subrating.getAverage();
                C19383o.m32794d(average2);
                float floatValue = average2.floatValue();
                linearProgressIndicator.setProgress(calculateProgress(floatValue));
                textView.setText(String.valueOf(C15588c1.m25295N0(floatValue)));
                ViewExtensions.m12869m(group);
                return;
            }
        }
        ViewExtensions.m12860d(group);
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

    public final void setData(ShopRating shopRating) {
        Integer ratingCount;
        if ((shopRating != null ? shopRating.getRatingCount() : null) == null || ((ratingCount = shopRating.getRatingCount()) != null && ratingCount.intValue() == 0)) {
            ViewExtensions.m12860d(this);
            return;
        }
        Subratings subratings = shopRating.getSubratings();
        if (subratings == null || subratings.isEmpty()) {
            ViewExtensions.m12860d(this.fullGraphView);
            ViewExtensions.m12869m(this.simplifiedGraphView);
            populateSimplified(shopRating);
            return;
        }
        ViewExtensions.m12860d(this.simplifiedGraphView);
        ViewExtensions.m12869m(this.fullGraphView);
        populateFull(shopRating);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShopSubratingsGraphView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
