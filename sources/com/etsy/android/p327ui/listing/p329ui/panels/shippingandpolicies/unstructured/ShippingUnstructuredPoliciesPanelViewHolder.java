package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured;

import android.support.p013v4.media.C0069a;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies;
import com.etsy.android.p327ui.cardview.viewholders.C9182h1;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.GiftOptionsHelper;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.ShippingCalculatorHelper;
import com.etsy.android.stylekit.views.CollageContentToggle;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.view.PaymentMethodsView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13597g;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.unstructured.ShippingUnstructuredPoliciesPanelViewHolder */
public final class ShippingUnstructuredPoliciesPanelViewHolder extends C10424k {

    /* renamed from: w */
    public static final /* synthetic */ int f23264w = 0;

    /* renamed from: b */
    public final C13573c f23265b;

    /* renamed from: c */
    public final CollageContentToggle f23266c;

    /* renamed from: d */
    public final PaymentMethodsView f23267d;

    /* renamed from: e */
    public final TextView f23268e;

    /* renamed from: f */
    public final CollageHeadingTextView f23269f;

    /* renamed from: g */
    public final TextView f23270g;

    /* renamed from: h */
    public final TextView f23271h;

    /* renamed from: i */
    public final TextView f23272i;

    /* renamed from: j */
    public final TextView f23273j;

    /* renamed from: k */
    public final TextView f23274k;

    /* renamed from: l */
    public final Button f23275l;

    /* renamed from: m */
    public final CollageHeadingTextView f23276m;

    /* renamed from: n */
    public final CollageHeadingTextView f23277n;

    /* renamed from: o */
    public final TextView f23278o;

    /* renamed from: p */
    public final TextView f23279p;

    /* renamed from: q */
    public final CollageHeadingTextView f23280q;

    /* renamed from: r */
    public final TextView f23281r;

    /* renamed from: s */
    public final TextView f23282s;

    /* renamed from: t */
    public final ShippingCalculatorHelper f23283t;

    /* renamed from: u */
    public final GiftOptionsHelper f23284u;

    /* renamed from: v */
    public final C19857l<String, C19394m> f23285v = new C10614x33d3c8f6(this);

    public ShippingUnstructuredPoliciesPanelViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_shipping_unstructured_policies, false));
        this.f23265b = cVar;
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageContentToggle");
        CollageContentToggle collageContentToggle = (CollageContentToggle) view;
        this.f23266c = collageContentToggle;
        View findViewById = this.itemView.findViewById(R.id.payment_methods);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.payment_methods)");
        this.f23267d = (PaymentMethodsView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.text_payment_method_others);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…xt_payment_method_others)");
        this.f23268e = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.estimated_delivery_first_line);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.…ated_delivery_first_line)");
        this.f23269f = (CollageHeadingTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.estimated_delivery_second_line);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.…ted_delivery_second_line)");
        this.f23270g = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.shipping_origin);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.shipping_origin)");
        this.f23271h = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.shipping_time);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.shipping_time)");
        this.f23272i = (TextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.section_calculated_shipping);
        C19383o.m32796f(findViewById7, "itemView.findViewById(R.…tion_calculated_shipping)");
        View findViewById8 = this.itemView.findViewById(R.id.section_gift_options);
        C19383o.m32796f(findViewById8, "itemView.findViewById(R.id.section_gift_options)");
        View findViewById9 = this.itemView.findViewById(R.id.seller_details_header);
        C19383o.m32796f(findViewById9, "itemView.findViewById(R.id.seller_details_header)");
        this.f23273j = (TextView) findViewById9;
        View findViewById10 = this.itemView.findViewById(R.id.trader_distinction);
        C19383o.m32796f(findViewById10, "itemView.findViewById(R.id.trader_distinction)");
        this.f23274k = (TextView) findViewById10;
        View findViewById11 = this.itemView.findViewById(R.id.seller_details_see_more);
        C19383o.m32796f(findViewById11, "itemView.findViewById(R.….seller_details_see_more)");
        this.f23275l = (Button) findViewById11;
        View findViewById12 = this.itemView.findViewById(R.id.heading_returns);
        C19383o.m32796f(findViewById12, "itemView.findViewById(R.id.heading_returns)");
        this.f23276m = (CollageHeadingTextView) findViewById12;
        View findViewById13 = this.itemView.findViewById(R.id.listing_level_return_title);
        C19383o.m32796f(findViewById13, "itemView.findViewById(R.…sting_level_return_title)");
        this.f23277n = (CollageHeadingTextView) findViewById13;
        View findViewById14 = this.itemView.findViewById(R.id.listing_level_return_subtitle);
        C19383o.m32796f(findViewById14, "itemView.findViewById(R.…ng_level_return_subtitle)");
        this.f23278o = (TextView) findViewById14;
        View findViewById15 = this.itemView.findViewById(R.id.listing_level_return_description);
        C19383o.m32796f(findViewById15, "itemView.findViewById(R.…level_return_description)");
        this.f23279p = (TextView) findViewById15;
        View findViewById16 = this.itemView.findViewById(R.id.listing_level_deadline_title);
        C19383o.m32796f(findViewById16, "itemView.findViewById(R.…ing_level_deadline_title)");
        this.f23280q = (CollageHeadingTextView) findViewById16;
        View findViewById17 = this.itemView.findViewById(R.id.listing_level_deadline_subtitle);
        C19383o.m32796f(findViewById17, "itemView.findViewById(R.…_level_deadline_subtitle)");
        this.f23281r = (TextView) findViewById17;
        View findViewById18 = this.itemView.findViewById(R.id.listing_level_deadline_description);
        C19383o.m32796f(findViewById18, "itemView.findViewById(R.…vel_deadline_description)");
        this.f23282s = (TextView) findViewById18;
        this.f23283t = new ShippingCalculatorHelper(findViewById7, cVar);
        this.f23284u = new GiftOptionsHelper(findViewById8, cVar);
        C0761x.m1669H(new C19857l<Boolean, C19394m>(this) {
            public final /* synthetic */ ShippingUnstructuredPoliciesPanelViewHolder this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C19394m.f43287a;
            }

            public final void invoke(boolean z) {
                this.this$0.f23265b.mo38043a(new C13597g.C13749v3(z));
            }
        }, collageContentToggle);
    }

    /* renamed from: b */
    public final void mo33629b() {
        EtsyLinkify.m19614h(this.f23269f);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        C19394m mVar;
        ListingLevelReturnPolicies listingLevelReturnPolicies;
        if (jVar instanceof C10615a) {
            C10615a aVar = (C10615a) jVar;
            this.f23266c.setTitle(aVar.f23287b);
            this.f23266c.setDescription(aVar.f23293h);
            PaymentMethodsView paymentMethodsView = this.f23267d;
            paymentMethodsView.setCreditCardsVisible(aVar.f23290e);
            paymentMethodsView.setPayPalVisible(aVar.f23291f);
            paymentMethodsView.setGooglePayVisible(false);
            paymentMethodsView.setGiftCardsVisible(false);
            CharSequence charSequence = aVar.f23292g;
            if (charSequence != null) {
                ViewExtensions.m12869m(this.f23268e);
                this.f23268e.setText(charSequence);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(this.f23268e);
            }
            if (C18263b.m30837c0(aVar.f23298m)) {
                this.f23272i.setText(aVar.f23298m);
                ViewExtensions.m12869m(this.f23272i);
            } else {
                this.f23272i.setText("");
                ViewExtensions.m12860d(this.f23272i);
            }
            if (C18263b.m30837c0(aVar.f23297l)) {
                this.f23271h.setText(aVar.f23297l);
                ViewExtensions.m12869m(this.f23271h);
            } else {
                this.f23271h.setText("");
                ViewExtensions.m12860d(this.f23271h);
            }
            if (C18263b.m30839d0(aVar.f23294i) || C18263b.m30839d0(aVar.f23295j)) {
                ViewExtensions.m12860d(this.f23271h);
                ViewExtensions.m12860d(this.f23272i);
                this.f23271h.setText("");
                this.f23272i.setText("");
            }
            if (C18263b.m30837c0(aVar.f23294i)) {
                CollageHeadingTextView collageHeadingTextView = this.f23269f;
                collageHeadingTextView.setText(aVar.f23294i);
                collageHeadingTextView.setMovementMethod(LinkMovementMethod.getInstance());
                ViewExtensions.m12869m(collageHeadingTextView);
                EtsyLinkify.m19609c(this.f23269f, true, this.f23285v);
            } else {
                CollageHeadingTextView collageHeadingTextView2 = this.f23269f;
                ViewExtensions.m12860d(collageHeadingTextView2);
                collageHeadingTextView2.setText("");
                collageHeadingTextView2.setMovementMethod((MovementMethod) null);
                EtsyLinkify.m19614h(this.f23269f);
            }
            if (C18263b.m30837c0(aVar.f23295j)) {
                TextView textView = this.f23270g;
                textView.setText(aVar.f23295j);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                ViewExtensions.m12869m(textView);
            } else {
                TextView textView2 = this.f23270g;
                ViewExtensions.m12860d(textView2);
                textView2.setText("");
                textView2.setMovementMethod((MovementMethod) null);
            }
            this.f23283t.mo34140a(aVar.f23299n, aVar.f23300o);
            this.f23284u.mo34138a(aVar.f23296k);
            if (!aVar.f23303r || (listingLevelReturnPolicies = aVar.f23304s) == null) {
                ViewExtensions.m12860d(this.f23276m);
                ViewExtensions.m12860d(this.f23277n);
                ViewExtensions.m12860d(this.f23278o);
                ViewExtensions.m12860d(this.f23279p);
                ViewExtensions.m12860d(this.f23280q);
                ViewExtensions.m12860d(this.f23281r);
                ViewExtensions.m12860d(this.f23282s);
            } else {
                ViewExtensions.m12869m(this.f23276m);
                ViewExtensions.m12869m(this.f23277n);
                ViewExtensions.m12869m(this.f23278o);
                ViewExtensions.m12869m(this.f23279p);
                this.f23277n.setText(listingLevelReturnPolicies.getReturnsTitle());
                this.f23278o.setText(listingLevelReturnPolicies.getReturnsSubtitle());
                this.f23279p.setText(listingLevelReturnPolicies.getReturnsDescription());
                if (aVar.f23305t) {
                    ViewExtensions.m12869m(this.f23280q);
                    ViewExtensions.m12869m(this.f23281r);
                    ViewExtensions.m12869m(this.f23282s);
                    this.f23280q.setText(listingLevelReturnPolicies.getDeadlineTitle());
                    this.f23281r.setText(listingLevelReturnPolicies.getDeadlineSubtitle());
                    this.f23282s.setText(listingLevelReturnPolicies.getDeadlineDescription());
                }
            }
            if (aVar.f23301p == null || aVar.f23302q == null) {
                ViewExtensions.m12860d(this.f23273j);
                ViewExtensions.m12860d(this.f23274k);
                ViewExtensions.m12860d(this.f23275l);
            } else {
                ViewExtensions.m12869m(this.f23273j);
                this.f23274k.setText(aVar.f23301p);
                EtsyLinkify.m19609c(this.f23274k, true, new ShippingUnstructuredPoliciesPanelViewHolder$bindSellerDetails$1(this));
                ViewExtensions.m12869m(this.f23274k);
                this.f23275l.setOnClickListener(new C9182h1(2, this, aVar));
                ViewExtensions.m12869m(this.f23275l);
            }
            this.f23266c.setExpanded(aVar.f23286a);
            return;
        }
        throw new IllegalArgumentException();
    }
}
