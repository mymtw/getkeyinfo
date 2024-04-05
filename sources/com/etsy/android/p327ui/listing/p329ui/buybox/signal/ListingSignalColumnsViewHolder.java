package com.etsy.android.p327ui.listing.p329ui.buybox.signal;

import android.content.Context;
import android.support.p013v4.media.C0069a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.buybox.signal.ListingSignalColumns;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.uikit.p331ui.core.NumericRatingView;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p435rb.C13350a;
import p466vc.C13573c;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumnsViewHolder */
public final class ListingSignalColumnsViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22637b;

    /* renamed from: c */
    public final TextView f22638c;

    /* renamed from: d */
    public final Group f22639d;

    /* renamed from: e */
    public final TextView f22640e;

    /* renamed from: f */
    public final Group f22641f;

    /* renamed from: g */
    public final NumericRatingView f22642g;

    /* renamed from: h */
    public final Group f22643h;

    /* renamed from: i */
    public final View f22644i;

    /* renamed from: j */
    public final View f22645j;

    public ListingSignalColumnsViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_signal_columns, false));
        this.f22637b = cVar;
        View findViewById = this.itemView.findViewById(R.id.signals_estimated_delivery_value);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…estimated_delivery_value)");
        this.f22638c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.signals_estimated_delivery_group);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…estimated_delivery_group)");
        this.f22639d = (Group) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.signals_estimated_shipping_cost_value);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.…ated_shipping_cost_value)");
        this.f22640e = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.signals_estimated_shipping_cost_group);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.…ated_shipping_cost_group)");
        this.f22641f = (Group) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.signals_ratings);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.signals_ratings)");
        NumericRatingView numericRatingView = (NumericRatingView) findViewById5;
        this.f22642g = numericRatingView;
        View findViewById6 = this.itemView.findViewById(R.id.signals_ratings_group);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.signals_ratings_group)");
        this.f22643h = (Group) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.signals_first_divider);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.id.signals_first_divider)");
        this.f22644i = findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.signals_second_divider);
        C19383o.m32796f(findViewById8, "itemView.findViewById(R.id.signals_second_divider)");
        this.f22645j = findViewById8;
        numericRatingView.setRatingStarColor(NumericRatingView.RatingStarColor.GOLD);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        int i;
        if (jVar instanceof ListingSignalColumns) {
            ListingSignalColumns listingSignalColumns = (ListingSignalColumns) jVar;
            if (listingSignalColumns.f22636g == ListingSignalColumns.SignalsState.HIDE) {
                ViewExtensions.m12860d(this.itemView);
                return;
            }
            if (C18263b.m30839d0(listingSignalColumns.f22630a)) {
                this.f22638c.setText(listingSignalColumns.f22630a);
                ViewExtensions.m12869m(this.f22639d);
                ViewExtensions.m12869m(this.f22644i);
            } else {
                ViewExtensions.m12860d(this.f22639d);
                ViewExtensions.m12860d(this.f22644i);
            }
            C10563f fVar = listingSignalColumns.f22631b;
            if (fVar == null || !C18263b.m30839d0(fVar.f23164j)) {
                ViewExtensions.m12860d(this.f22641f);
                ViewExtensions.m12860d(this.f22645j);
            } else {
                TextView textView = this.f22640e;
                textView.setText(listingSignalColumns.f22631b.f23164j);
                if (listingSignalColumns.f22632c) {
                    Context context = textView.getContext();
                    C19383o.m32796f(context, ResponseConstants.CONTEXT);
                    i = C13350a.m21013d(context, R.attr.clg_color_text_pricemodifier);
                } else {
                    Context context2 = textView.getContext();
                    C19383o.m32796f(context2, ResponseConstants.CONTEXT);
                    i = C13350a.m21013d(context2, R.attr.clg_color_text_primary);
                }
                textView.setTextColor(i);
                ViewExtensions.m12869m(this.f22641f);
                ViewExtensions.m12869m(this.f22645j);
            }
            int i2 = listingSignalColumns.f22634e;
            if (i2 > 0) {
                this.f22642g.setRatingData(listingSignalColumns.f22633d, i2, listingSignalColumns.f22635f, NumericRatingView.ReviewCountColor.BLUE);
                C19388s.m32890v0(this.f22643h, true, new ListingSignalColumnsViewHolder$bind$2(this));
                ViewExtensions.m12869m(this.f22643h);
                return;
            }
            ViewExtensions.m12860d(this.f22643h);
            ViewExtensions.m12860d(this.f22645j);
            return;
        }
        throw new IllegalArgumentException();
    }
}
