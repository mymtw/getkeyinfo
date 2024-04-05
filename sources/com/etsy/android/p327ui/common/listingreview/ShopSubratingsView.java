package com.etsy.android.p327ui.common.listingreview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.Subrating;
import com.etsy.android.lib.models.apiv3.listing.Subratings;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.common.listingreview.ShopSubratingsView */
public final class ShopSubratingsView extends ConstraintLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final CollageRatingView customerServiceSubrating;
    private final TextView customerServiceSubratingTitle;
    private final CollageRatingView qualitySubrating;
    private final TextView qualitySubratingTitle;
    private final CollageRatingView shippingSubrating;
    private final TextView shippingSubratingTitle;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShopSubratingsView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShopSubratingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopSubratingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.view_shop_subratings, this, true);
        View findViewById = findViewById(R.id.subrating_quality);
        C19383o.m32796f(findViewById, "findViewById(R.id.subrating_quality)");
        this.qualitySubrating = (CollageRatingView) findViewById;
        View findViewById2 = findViewById(R.id.subrating_quality_title);
        C19383o.m32796f(findViewById2, "findViewById(R.id.subrating_quality_title)");
        this.qualitySubratingTitle = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.subrating_shipping);
        C19383o.m32796f(findViewById3, "findViewById(R.id.subrating_shipping)");
        this.shippingSubrating = (CollageRatingView) findViewById3;
        View findViewById4 = findViewById(R.id.subrating_shipping_title);
        C19383o.m32796f(findViewById4, "findViewById(R.id.subrating_shipping_title)");
        this.shippingSubratingTitle = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.subrating_service);
        C19383o.m32796f(findViewById5, "findViewById(R.id.subrating_service)");
        this.customerServiceSubrating = (CollageRatingView) findViewById5;
        View findViewById6 = findViewById(R.id.subrating_service_title);
        C19383o.m32796f(findViewById6, "findViewById(R.id.subrating_service_title)");
        this.customerServiceSubratingTitle = (TextView) findViewById6;
    }

    private final void bindSubratingViews(Subrating subrating, CollageRatingView collageRatingView, TextView textView) {
        if ((subrating != null ? subrating.getAverage() : null) != null) {
            Float average = subrating.getAverage();
            C19383o.m32794d(average);
            if (average.floatValue() > 0.0f) {
                Float average2 = subrating.getAverage();
                if (average2 != null) {
                    float floatValue = average2.floatValue();
                    collageRatingView.setText(String.valueOf(C15588c1.m25295N0(floatValue)));
                    collageRatingView.setRating(floatValue);
                    return;
                }
                return;
            }
        }
        ViewExtensions.m12860d(collageRatingView);
        ViewExtensions.m12860d(textView);
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

    public final void setSubratings(Subratings subratings) {
        C19383o.m32797g(subratings, "subratings");
        bindSubratingViews(subratings.getItemQuality(), this.qualitySubrating, this.qualitySubratingTitle);
        bindSubratingViews(subratings.getShipping(), this.shippingSubrating, this.shippingSubratingTitle);
        bindSubratingViews(subratings.getSellerCustomerService(), this.customerServiceSubrating, this.customerServiceSubratingTitle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShopSubratingsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
