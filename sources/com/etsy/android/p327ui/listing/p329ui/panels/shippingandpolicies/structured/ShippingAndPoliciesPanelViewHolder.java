package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured;

import android.content.Context;
import android.support.p013v4.media.C0069a;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.foundation.layout.C0761x;
import androidx.room.C3218a0;
import androidx.room.C3260z;
import com.braze.C5380a;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.StructuredShopPayments;
import com.etsy.android.lib.models.apiv3.StructuredShopShipping;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.GiftOptionsHelper;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.ShippingCalculatorHelper;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.view.shop.policies.RefundsView;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPaymentsView;
import com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView;
import com.etsy.android.uikit.view.shop.policies.StructuredShopShippingView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p030bo.app.C3653e7;
import p030bo.app.C3673f7;
import p466vc.C13573c;
import p466vc.C13597g;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.ShippingAndPoliciesPanelViewHolder */
public final class ShippingAndPoliciesPanelViewHolder extends C10424k {

    /* renamed from: x */
    public static final /* synthetic */ int f23196x = 0;

    /* renamed from: b */
    public final C13573c f23197b;

    /* renamed from: c */
    public final CollageContentToggle f23198c;

    /* renamed from: d */
    public final View f23199d;

    /* renamed from: e */
    public final TextView f23200e;

    /* renamed from: f */
    public final TextView f23201f;

    /* renamed from: g */
    public final TextView f23202g;

    /* renamed from: h */
    public final TextView f23203h;

    /* renamed from: i */
    public final TextView f23204i;

    /* renamed from: j */
    public final StructuredShopShippingView f23205j;

    /* renamed from: k */
    public final StructuredShopPaymentsView f23206k;

    /* renamed from: l */
    public final TextView f23207l;

    /* renamed from: m */
    public final RefundsView f23208m;

    /* renamed from: n */
    public final TextView f23209n;

    /* renamed from: o */
    public final TextView f23210o;

    /* renamed from: p */
    public final View f23211p;

    /* renamed from: q */
    public final TextView f23212q;

    /* renamed from: r */
    public final TextView f23213r;

    /* renamed from: s */
    public final TextView f23214s;

    /* renamed from: t */
    public final Button f23215t;

    /* renamed from: u */
    public final ShippingCalculatorHelper f23216u;

    /* renamed from: v */
    public final GiftOptionsHelper f23217v;

    /* renamed from: w */
    public final C19857l<String, C19394m> f23218w = new C10589x7c330ac5(this);

    public ShippingAndPoliciesPanelViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_shipping_and_policies, false));
        this.f23197b = cVar;
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageContentToggle");
        CollageContentToggle collageContentToggle = (CollageContentToggle) view;
        this.f23198c = collageContentToggle;
        View findViewById = this.itemView.findViewById(R.id.dispute_resolution);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.dispute_resolution)");
        this.f23199d = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.txt_dispute_resolution);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.txt_dispute_resolution)");
        this.f23200e = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.heading_shipping);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.heading_shipping)");
        this.f23201f = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.subhead_shipping_time);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.subhead_shipping_time)");
        this.f23202g = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.txt_shipping_time);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.txt_shipping_time)");
        this.f23203h = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.txt_file_delivery);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.txt_file_delivery)");
        this.f23204i = (TextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.structured_policies_shipping);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.…ctured_policies_shipping)");
        this.f23205j = (StructuredShopShippingView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.structured_policies_payments);
        C19383o.m32796f(findViewById8, "itemView.findViewById(R.…ctured_policies_payments)");
        this.f23206k = (StructuredShopPaymentsView) findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.heading_refunds);
        C19383o.m32796f(findViewById9, "itemView.findViewById(R.id.heading_refunds)");
        this.f23207l = (TextView) findViewById9;
        View findViewById10 = this.itemView.findViewById(R.id.policies_refunds);
        C19383o.m32796f(findViewById10, "itemView.findViewById(R.id.policies_refunds)");
        this.f23208m = (RefundsView) findViewById10;
        View findViewById11 = this.itemView.findViewById(R.id.estimated_delivery_first_line);
        C19383o.m32796f(findViewById11, "itemView.findViewById(R.…ated_delivery_first_line)");
        this.f23209n = (TextView) findViewById11;
        View findViewById12 = this.itemView.findViewById(R.id.estimated_delivery_second_line);
        C19383o.m32796f(findViewById12, "itemView.findViewById(R.…ted_delivery_second_line)");
        this.f23210o = (TextView) findViewById12;
        View findViewById13 = this.itemView.findViewById(R.id.section_calculated_shipping);
        C19383o.m32796f(findViewById13, "itemView.findViewById(R.…tion_calculated_shipping)");
        View findViewById14 = this.itemView.findViewById(R.id.section_gift_options);
        C19383o.m32796f(findViewById14, "itemView.findViewById(R.id.section_gift_options)");
        View findViewById15 = this.itemView.findViewById(R.id.additional_terms);
        C19383o.m32796f(findViewById15, "itemView.findViewById(R.id.additional_terms)");
        this.f23211p = findViewById15;
        View findViewById16 = this.itemView.findViewById(R.id.txt_terms_and_conditions);
        C19383o.m32796f(findViewById16, "itemView.findViewById(R.…txt_terms_and_conditions)");
        this.f23212q = (TextView) findViewById16;
        View findViewById17 = this.itemView.findViewById(R.id.seller_details_header);
        C19383o.m32796f(findViewById17, "itemView.findViewById(R.id.seller_details_header)");
        this.f23213r = (TextView) findViewById17;
        View findViewById18 = this.itemView.findViewById(R.id.trader_distinction);
        C19383o.m32796f(findViewById18, "itemView.findViewById(R.id.trader_distinction)");
        this.f23214s = (TextView) findViewById18;
        View findViewById19 = this.itemView.findViewById(R.id.seller_details_see_more);
        C19383o.m32796f(findViewById19, "itemView.findViewById(R.….seller_details_see_more)");
        this.f23215t = (Button) findViewById19;
        this.f23216u = new ShippingCalculatorHelper(findViewById13, cVar);
        this.f23217v = new GiftOptionsHelper(findViewById14, cVar);
        C0761x.m1669H(new C19857l<Boolean, C19394m>(this) {
            public final /* synthetic */ ShippingAndPoliciesPanelViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C19394m.f43287a;
            }

            public final void invoke(boolean z) {
                this.this$0.f23197b.mo38043a(new C13597g.C13728s3(z));
            }
        }, collageContentToggle);
    }

    /* renamed from: b */
    public final void mo33629b() {
        EtsyLinkify.m19614h(this.f23203h);
        EtsyLinkify.m19614h(this.f23200e);
        EtsyLinkify.m19614h(this.f23209n);
        EtsyLinkify.m19614h(this.f23212q);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10590a) {
            C10590a aVar = (C10590a) jVar;
            this.f23198c.setTitle(aVar.f23227c);
            this.f23198c.setDescription(aVar.f23230f);
            if (aVar.f23231g) {
                Context context = this.itemView.getContext();
                C19383o.m32796f(context, "itemView.context");
                EtsyLinkify.m19612f(context, this.f23200e, false, (C19846a) null, 24);
                ViewExtensions.m12869m(this.f23199d);
            } else {
                ViewExtensions.m12860d(this.f23199d);
                EtsyLinkify.m19614h(this.f23200e);
            }
            this.f23201f.setText(aVar.f23232h);
            if (C18263b.m30839d0(aVar.f23233i)) {
                TextView textView = this.f23204i;
                textView.setText(aVar.f23233i);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                ViewExtensions.m12869m(textView);
            } else {
                TextView textView2 = this.f23204i;
                ViewExtensions.m12860d(textView2);
                textView2.setText("");
                textView2.setMovementMethod((MovementMethod) null);
            }
            if (C18263b.m30839d0(aVar.f23235k)) {
                this.f23202g.setText(aVar.f23234j);
                this.f23203h.setText(aVar.f23235k);
                if (aVar.f23236l) {
                    EtsyLinkify.m19609c(this.f23203h, false, new ShippingAndPoliciesPanelViewHolder$bindProcessingTime$1(this));
                } else {
                    EtsyLinkify.m19614h(this.f23203h);
                }
                ViewExtensions.m12869m(this.f23202g);
                ViewExtensions.m12869m(this.f23203h);
            } else {
                ViewExtensions.m12860d(this.f23202g);
                ViewExtensions.m12860d(this.f23203h);
                this.f23202g.setText("");
                this.f23203h.setText("");
                EtsyLinkify.m19614h(this.f23203h);
            }
            if (C18263b.m30839d0(aVar.f23238n) || C18263b.m30839d0(aVar.f23239o)) {
                ViewExtensions.m12860d(this.f23202g);
                ViewExtensions.m12860d(this.f23203h);
                this.f23202g.setText("");
                this.f23203h.setText("");
            }
            if (C18263b.m30839d0(aVar.f23238n)) {
                TextView textView3 = this.f23209n;
                textView3.setText(aVar.f23238n);
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                ViewExtensions.m12869m(textView3);
                EtsyLinkify.m19609c(this.f23209n, true, this.f23218w);
            } else {
                TextView textView4 = this.f23209n;
                ViewExtensions.m12860d(textView4);
                textView4.setText("");
                textView4.setMovementMethod((MovementMethod) null);
                EtsyLinkify.m19614h(this.f23209n);
            }
            if (C18263b.m30839d0(aVar.f23239o)) {
                TextView textView5 = this.f23210o;
                textView5.setText(aVar.f23239o);
                textView5.setMovementMethod(LinkMovementMethod.getInstance());
                ViewExtensions.m12869m(textView5);
            } else {
                TextView textView6 = this.f23210o;
                ViewExtensions.m12860d(textView6);
                textView6.setText("");
                textView6.setMovementMethod((MovementMethod) null);
            }
            StructuredShopShipping structuredShopShipping = aVar.f23241q;
            if (structuredShopShipping != null) {
                StructuredShopShippingView structuredShopShippingView = this.f23205j;
                structuredShopShippingView.setStructuredShopShipping(structuredShopShipping, false);
                structuredShopShippingView.setExpanded(aVar.f23242r);
                structuredShopShippingView.setExpandedListener(new C5380a(this));
                structuredShopShippingView.filterEstimates(aVar.f23240p.f23155a);
                ViewExtensions.m12869m(structuredShopShippingView);
            } else {
                ViewExtensions.m12860d(this.f23205j);
                this.f23205j.setExpandedListener((StructuredShopPoliciesView.C11958c) null);
            }
            this.f23216u.mo34140a(aVar.f23240p, aVar.f23222D);
            if (aVar.f23247w != null) {
                if (aVar.f23245u) {
                    ViewExtensions.m12860d(this.f23207l);
                }
                RefundsView refundsView = this.f23208m;
                refundsView.setRefunds(aVar.f23247w, aVar.f23245u, aVar.f23248x, new C3653e7(this, 4));
                refundsView.setExpanded(aVar.f23249y);
                refundsView.setExpandedListener(new C3673f7(this, 2));
                ViewExtensions.m12869m(refundsView);
            } else {
                ViewExtensions.m12860d(this.f23208m);
                this.f23208m.setExpandedListener((StructuredShopPoliciesView.C11958c) null);
            }
            StructuredShopPayments structuredShopPayments = aVar.f23243s;
            if (structuredShopPayments != null) {
                StructuredShopPaymentsView structuredShopPaymentsView = this.f23206k;
                structuredShopPaymentsView.setStructuredShopPayments(structuredShopPayments, new C3260z(this));
                structuredShopPaymentsView.setExpanded(aVar.f23244t);
                structuredShopPaymentsView.setExpandedListener(new C3218a0(this, 3));
                ViewExtensions.m12869m(structuredShopPaymentsView);
            } else {
                ViewExtensions.m12860d(this.f23206k);
                this.f23206k.setExpandedListener((StructuredShopPoliciesView.C11958c) null);
            }
            if (C18263b.m30839d0(aVar.f23220B)) {
                ViewExtensions.m12869m(this.f23211p);
                this.f23212q.setText(aVar.f23219A);
                EtsyLinkify.m19609c(this.f23212q, true, new C10588x10fd4cd9(this, aVar));
            } else {
                ViewExtensions.m12860d(this.f23211p);
                this.f23212q.setText("");
                EtsyLinkify.m19614h(this.f23212q);
            }
            this.f23217v.mo34138a(aVar.f23221C);
            if (C18263b.m30839d0(aVar.f23224F)) {
                ViewExtensions.m12869m(this.f23213r);
                if (C18263b.m30839d0(aVar.f23223E)) {
                    this.f23214s.setText(aVar.f23223E);
                    EtsyLinkify.m19609c(this.f23214s, true, new ShippingAndPoliciesPanelViewHolder$bindSellerDetails$1(this));
                    ViewExtensions.m12869m(this.f23214s);
                } else {
                    ViewExtensions.m12860d(this.f23214s);
                }
                this.f23215t.setOnClickListener(new C10592b(0, this, aVar));
                ViewExtensions.m12869m(this.f23215t);
            } else {
                ViewExtensions.m12860d(this.f23213r);
                ViewExtensions.m12860d(this.f23214s);
                ViewExtensions.m12860d(this.f23215t);
            }
            this.f23198c.setExpanded(aVar.f23225a);
            return;
        }
        throw new IllegalArgumentException();
    }
}
