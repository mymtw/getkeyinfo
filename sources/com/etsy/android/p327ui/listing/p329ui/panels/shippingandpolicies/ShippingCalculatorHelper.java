package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.ITrackedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.ShippingCalculatorHelper */
public final class ShippingCalculatorHelper {

    /* renamed from: a */
    public final View f23123a;

    /* renamed from: b */
    public final C13573c f23124b;

    /* renamed from: c */
    public final TextView f23125c;

    /* renamed from: d */
    public final Button f23126d;

    /* renamed from: e */
    public final TextView f23127e;

    /* renamed from: f */
    public final Button f23128f;

    /* renamed from: g */
    public final TextView f23129g;

    /* renamed from: h */
    public final FrameLayout f23130h;

    /* renamed from: i */
    public final TextView f23131i;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.ShippingCalculatorHelper$a */
    public /* synthetic */ class C10549a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23132a;

        static {
            int[] iArr = new int[CalculateShippingState.values().length];
            iArr[CalculateShippingState.HEADER.ordinal()] = 1;
            iArr[CalculateShippingState.VIEW_ONLY.ordinal()] = 2;
            iArr[CalculateShippingState.GONE.ordinal()] = 3;
            f23132a = iArr;
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.ShippingCalculatorHelper$b */
    public static final class C10550b implements ITrackedObject {

        /* renamed from: b */
        public final /* synthetic */ Map<AnalyticsProperty, Object> f23133b;

        public C10550b(Map<AnalyticsProperty, ? extends Object> map) {
            this.f23133b = map;
        }

        @JsonIgnore
        public final List<C8696j> getOnSeenTrackingEvents() {
            return new ArrayList();
        }

        @JsonIgnore
        public final int getTrackedPosition() {
            return 0;
        }

        @JsonIgnore
        public final String getTrackingName() {
            return "";
        }

        public final Map<AnalyticsProperty, Object> getTrackingParameters() {
            return C19294b0.m32558A0(this.f23133b);
        }

        @JsonIgnore
        public final void setOnSeenTrackingEvents(List<C8696j> list) {
            C19383o.m32797g(list, "onSeenTrackingEvents");
        }

        @JsonIgnore
        public final void setTrackedPosition(int i) {
        }

        @JsonIgnore
        public final void setTrackingName(String str) {
        }

        public final void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        }
    }

    public ShippingCalculatorHelper(View view, C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23123a = view;
        this.f23124b = cVar;
        View findViewById = view.findViewById(R.id.heading_calculated_shipping_cost);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…calculated_shipping_cost)");
        this.f23125c = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.button_shipping_cost_calculate);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…_shipping_cost_calculate)");
        this.f23126d = (Button) findViewById2;
        View findViewById3 = view.findViewById(R.id.txt_shipping_costs_view_only_destination);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.…ts_view_only_destination)");
        this.f23127e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.button_shipping_costs_view_only_update);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.…g_costs_view_only_update)");
        this.f23128f = (Button) findViewById4;
        View findViewById5 = view.findViewById(R.id.txt_shipping_costs_view_only_cost);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.…ing_costs_view_only_cost)");
        this.f23129g = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.calculated_shipping_view_loading);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.…ed_shipping_view_loading)");
        this.f23130h = (FrameLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.txt_shipping_cost_error);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.….txt_shipping_cost_error)");
        this.f23131i = (TextView) findViewById7;
    }

    /* renamed from: a */
    public final void mo34140a(C10563f fVar, Map<AnalyticsProperty, ? extends Object> map) {
        C19383o.m32797g(fVar, "calculatedShipping");
        C19383o.m32797g(map, "listingFetchAnalyticsLogAttribute");
        int i = C10549a.f23132a[fVar.f23160f.ordinal()];
        if (i == 1) {
            ViewExtensions.m12869m(this.f23123a);
            this.f23125c.setText(fVar.f23161g);
            ViewExtensions.m12869m(this.f23125c);
            this.f23126d.setText(fVar.f23162h);
            ViewExtensions.m12869m(this.f23126d);
            ViewExtensions.m12866j(this.f23126d, new ShippingCalculatorHelper$bind$1(this, fVar));
            if (C18263b.m30839d0(fVar.f23165k)) {
                this.f23131i.setText(fVar.f23165k);
                ViewExtensions.m12869m(this.f23131i);
            } else {
                this.f23131i.setText("");
                ViewExtensions.m12860d(this.f23131i);
            }
            ViewExtensions.m12860d(this.f23127e);
            ViewExtensions.m12860d(this.f23128f);
            ViewExtensions.m12860d(this.f23129g);
            this.f23128f.setOnClickListener((View.OnClickListener) null);
        } else if (i == 2) {
            ViewExtensions.m12869m(this.f23123a);
            this.f23125c.setText(fVar.f23161g);
            ViewExtensions.m12869m(this.f23125c);
            this.f23126d.setText("");
            ViewExtensions.m12860d(this.f23126d);
            this.f23126d.setOnClickListener((View.OnClickListener) null);
            if (C18263b.m30839d0(fVar.f23165k)) {
                this.f23131i.setText(fVar.f23165k);
                ViewExtensions.m12869m(this.f23131i);
            } else {
                this.f23131i.setText("");
                ViewExtensions.m12860d(this.f23131i);
            }
            ViewExtensions.m12869m(this.f23127e);
            ViewExtensions.m12869m(this.f23128f);
            ViewExtensions.m12869m(this.f23129g);
            this.f23127e.setText(fVar.f23163i);
            this.f23129g.setText(fVar.f23164j);
            this.f23128f.setOnClickListener(new ShippingCalculatorHelper$bind$2(this, fVar, new C8698l[]{new C10550b(map)}));
        } else if (i == 3) {
            ViewExtensions.m12860d(this.f23123a);
            this.f23125c.setText("");
            this.f23126d.setText("");
            this.f23127e.setText("");
            this.f23128f.setText("");
            this.f23129g.setText("");
            this.f23126d.setOnClickListener((View.OnClickListener) null);
            this.f23128f.setOnClickListener((View.OnClickListener) null);
            ViewExtensions.m12860d(this.f23125c);
            ViewExtensions.m12860d(this.f23126d);
            ViewExtensions.m12860d(this.f23127e);
            ViewExtensions.m12860d(this.f23128f);
            ViewExtensions.m12860d(this.f23129g);
        }
        if (fVar.f23166l) {
            ViewExtensions.m12869m(this.f23130h);
        } else {
            ViewExtensions.m12860d(this.f23130h);
        }
    }
}
