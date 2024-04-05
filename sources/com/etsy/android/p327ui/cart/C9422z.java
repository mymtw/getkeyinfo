package com.etsy.android.p327ui.cart;

import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.p327ui.cardview.viewholders.C9183i;
import com.etsy.android.p327ui.cardview.viewholders.C9187j0;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.p327ui.cart.clicklisteners.C9283h;
import com.etsy.android.p327ui.cart.clicklisteners.C9285j;
import com.etsy.android.p327ui.cart.clicklisteners.C9287l;
import com.etsy.android.p327ui.cart.clicklisteners.C9288m;
import com.etsy.android.p327ui.cart.clicklisteners.C9292o;
import com.etsy.android.p327ui.cart.clicklisteners.CartShopHeaderClickHandler;
import com.etsy.android.p327ui.cart.viewholders.AddPromotionViewHolder;
import com.etsy.android.p327ui.cart.viewholders.AppliedCouponViewHolder;
import com.etsy.android.p327ui.cart.viewholders.C9367a0;
import com.etsy.android.p327ui.cart.viewholders.C9368b;
import com.etsy.android.p327ui.cart.viewholders.C9372d;
import com.etsy.android.p327ui.cart.viewholders.C9373d0;
import com.etsy.android.p327ui.cart.viewholders.C9375e0;
import com.etsy.android.p327ui.cart.viewholders.C9376f;
import com.etsy.android.p327ui.cart.viewholders.C9377f0;
import com.etsy.android.p327ui.cart.viewholders.C9378g;
import com.etsy.android.p327ui.cart.viewholders.C9381h0;
import com.etsy.android.p327ui.cart.viewholders.C9388j;
import com.etsy.android.p327ui.cart.viewholders.C9390k;
import com.etsy.android.p327ui.cart.viewholders.C9391k0;
import com.etsy.android.p327ui.cart.viewholders.C9392l;
import com.etsy.android.p327ui.cart.viewholders.C9393l0;
import com.etsy.android.p327ui.cart.viewholders.C9399m0;
import com.etsy.android.p327ui.cart.viewholders.C9405s;
import com.etsy.android.p327ui.cart.viewholders.C9406t;
import com.etsy.android.p327ui.cart.viewholders.C9407u;
import com.etsy.android.p327ui.cart.viewholders.C9409w;
import com.etsy.android.p327ui.cart.viewholders.C9410x;
import com.etsy.android.p327ui.cart.viewholders.C9414y;
import com.etsy.android.p327ui.cart.viewholders.C9416z;
import com.etsy.android.p327ui.cart.viewholders.CartListingGiftCardViewHolder;
import com.etsy.android.p327ui.cart.viewholders.CartListingViewHolder;
import com.etsy.android.p327ui.cart.viewholders.CartReceiptViewHolder;
import com.etsy.android.p327ui.cart.viewholders.PromotionViewHolder;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.viewholder.C12016y;
import com.etsy.android.vespa.viewholders.C12086e;
import com.etsy.android.vespa.viewholders.HTMLTextViewHolder;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p415of.C13171a;
import p415of.C13172b;
import p415of.C13179h;
import p415of.C13180i;
import p415of.C13182k;
import p431qf.C13327b;
import p456ua.C13461f;
import p472wb.C13801b;
import p478x9.C13851a;

/* renamed from: com.etsy.android.ui.cart.z */
public final class C9422z extends C13172b {

    /* renamed from: j */
    public C9329o f20901j;

    /* renamed from: k */
    public final C11780h f20902k;

    /* renamed from: l */
    public final C13461f f20903l;

    /* renamed from: m */
    public final C13801b f20904m;

    /* renamed from: n */
    public final C8267e f20905n;

    /* renamed from: o */
    public final C12724a f20906o;

    /* renamed from: p */
    public final C12741o f20907p;

    /* renamed from: q */
    public final C13851a f20908q;

    /* renamed from: r */
    public final C10865h f20909r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9422z(Fragment fragment, C8703p pVar, C9329o oVar, C9333r rVar, C9332q qVar, C11780h hVar, C13461f fVar, C13801b bVar, C8267e eVar, C12724a aVar, C12741o oVar2, C13851a aVar2, C10865h hVar2) {
        super(new C13179h(fragment, pVar, (C13180i) null, (C13182k) null));
        Fragment fragment2 = fragment;
        C8703p pVar2 = pVar;
        C9333r rVar2 = rVar;
        C19383o.m32797g(fragment, "value");
        C19383o.m32797g(pVar, "value");
        this.f20901j = oVar;
        C11780h hVar3 = hVar;
        this.f20902k = hVar3;
        C13461f fVar2 = fVar;
        this.f20903l = fVar2;
        this.f20904m = bVar;
        this.f20905n = eVar;
        this.f20906o = aVar;
        this.f20907p = oVar2;
        this.f20908q = aVar2;
        this.f20909r = hVar2;
        this.f28982a.mo19994h(R.id.view_type_multishop_shop_header, new CartShopHeaderClickHandler(rVar, fragment, hVar3, fVar2, this.f28983b, qVar));
        C9283h hVar4 = new C9283h(fragment, this.f28983b, rVar2);
        this.f28982a.mo19994h(R.id.view_type_multishop_cart_listing, hVar4);
        this.f28982a.mo19994h(R.id.view_type_multishop_cart_listing_unavailable, hVar4);
        this.f28982a.mo19994h(R.id.view_type_multishop_cart_listing_gift_card, hVar4);
        this.f28982a.mo19994h(R.id.view_type_multishop_checkout_section, new C9287l(fragment, this.f28983b, rVar2));
        this.f28982a.mo19994h(R.id.view_type_multishop_shipping, new C9292o(fragment, this.f28983b, rVar2));
        this.f28982a.mo19994h(R.id.view_type_gift_options, new C9288m(fragment, this.f28983b, rVar2));
        this.f28982a.mo19994h(R.id.view_type_multishop_cart_receipt, new C9285j(fragment, this.f28983b));
        C9282g gVar = new C9282g(fragment, this.f28983b, rVar2);
        this.f28982a.mo19994h(R.id.view_type_multishop_message_to_seller, gVar);
        this.f28982a.mo19994h(R.id.view_type_multishop_payment_add_coupon, gVar);
        this.f28982a.mo19994h(R.id.view_type_multishop_add_promotion, gVar);
        this.f28982a.mo19994h(R.id.view_type_apply_coupon, gVar);
        this.f28982a.mo19994h(R.id.view_type_applied_coupon, gVar);
        this.f28982a.mo19994h(R.id.view_type_multishop_payment_applied_coupon, gVar);
        this.f28982a.mo19994h(R.id.view_type_multishop_payment_apply_gift_card, gVar);
        this.f28982a.mo19994h(R.id.view_type_multishop_payment_update_shipping_country, gVar);
        this.f28982a.mo19994h(R.id.view_type_multishop_payment_options, gVar);
        this.f28982a.mo19994h(R.id.view_type_multishop_message_bubble, gVar);
        this.f28982a.mo19994h(R.id.view_type_multishop_message_banner, gVar);
        this.f28982a.mo19994h(R.id.view_type_promotion, gVar);
        this.f28982a.mo19994h(R.id.view_type_collage_alert, gVar);
    }

    /* renamed from: b */
    public final C12086e mo31854b(ViewGroup viewGroup, int i) {
        C12086e eVar;
        Fragment d = mo45892d();
        Resources resources = d != null ? d.getResources() : null;
        switch (i) {
            case R.id.view_type_applied_coupon:
                eVar = new AppliedCouponViewHolder(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                break;
            case R.id.view_type_apply_coupon:
                eVar = new C9368b(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null), this.f28983b);
                break;
            default:
                switch (i) {
                    case R.id.view_type_carbon_emission_signal:
                        return new C9372d(viewGroup);
                    case R.id.view_type_collage_alert:
                        eVar = new C9183i(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null), this.f28983b);
                        break;
                    case R.id.view_type_discount_total_line_item:
                        C13171a aVar = (C13171a) this.f28982a.mo19993f(i, (Integer) null);
                        eVar = new C9375e0(viewGroup, i);
                        break;
                    case R.id.view_type_html_text:
                        return new HTMLTextViewHolder(viewGroup, 0);
                    case R.id.view_type_multishop_payment_update_shipping_country:
                        eVar = new C9381h0(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null), this.f28983b);
                        break;
                    case R.id.view_type_promotion:
                        eVar = new PromotionViewHolder(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                        break;
                    default:
                        switch (i) {
                            case R.id.view_type_cart_group_divider:
                                return new C9376f(viewGroup);
                            case R.id.view_type_cart_group_item_divider:
                                return new C9378g(viewGroup);
                            default:
                                switch (i) {
                                    case R.id.view_type_gift_options:
                                        eVar = new C9405s(viewGroup, (C9288m) this.f28982a.mo19993f(i, (Integer) null));
                                        break;
                                    case R.id.view_type_grand_total_line_item:
                                        break;
                                    default:
                                        switch (i) {
                                            case R.id.view_type_multishop_add_promotion:
                                                eVar = new AddPromotionViewHolder(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                                                break;
                                            case R.id.view_type_multishop_cart_group:
                                                return viewGroup.getContext().getResources().getBoolean(R.bool.width_960) ? new C9406t(viewGroup, this) : new C9399m0(viewGroup, this);
                                            case R.id.view_type_multishop_cart_listing:
                                                eVar = new CartListingViewHolder(viewGroup, (C9283h) this.f28982a.mo19993f(i, (Integer) null), this.f28983b, false);
                                                break;
                                            case R.id.view_type_multishop_cart_listing_gift_card:
                                                eVar = new CartListingGiftCardViewHolder(viewGroup, (C9283h) this.f28982a.mo19993f(i, (Integer) null));
                                                break;
                                            case R.id.view_type_multishop_cart_listing_unavailable:
                                                eVar = new CartListingViewHolder(viewGroup, (C9283h) this.f28982a.mo19993f(i, (Integer) null), this.f28983b, true);
                                                break;
                                            case R.id.view_type_multishop_cart_receipt:
                                                if (d == null) {
                                                    return null;
                                                }
                                                C9187j0.C9188a aVar2 = new C9187j0.C9188a();
                                                aVar2.f20245a = d;
                                                C19383o.m32797g(viewGroup, "value");
                                                aVar2.f20246b = viewGroup;
                                                aVar2.mo31429j(this.f28983b);
                                                aVar2.f20257m = true;
                                                C13801b bVar = this.f20904m;
                                                C19383o.m32797g(bVar, "value");
                                                aVar2.f20248d = bVar;
                                                aVar2.mo31421b(new C13327b(resources.getDimensionPixelSize(R.dimen.clg_space_8), resources.getDimensionPixelSize(R.dimen.clg_space_8), 0, 0, resources.getDimensionPixelSize(R.dimen.clg_space_8)));
                                                aVar2.mo31425f(this.f20902k);
                                                aVar2.mo31427h(this.f20903l);
                                                aVar2.f20256l = this.f28985d;
                                                aVar2.mo31420a(this.f20905n);
                                                aVar2.mo31423d(this.f20906o);
                                                aVar2.mo31426g(this.f20907p);
                                                aVar2.mo31424e(this.f20908q);
                                                aVar2.mo31428i(this.f20909r);
                                                return new CartReceiptViewHolder(viewGroup, (C9285j) mo45891c(i), aVar2.mo31422c());
                                            case R.id.view_type_multishop_cart_thank_you_group:
                                                return new C9390k(viewGroup, this);
                                            case R.id.view_type_multishop_checkout_section:
                                                eVar = new C9392l(viewGroup, (C9287l) this.f28982a.mo19993f(i, (Integer) null), this.f20901j);
                                                break;
                                            default:
                                                switch (i) {
                                                    case R.id.view_type_multishop_message_banner:
                                                        eVar = new C9407u(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                                                        break;
                                                    case R.id.view_type_multishop_message_bubble:
                                                        eVar = new C9388j(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                                                        break;
                                                    case R.id.view_type_multishop_message_to_seller:
                                                        eVar = new C9409w(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                                                        break;
                                                    case R.id.view_type_multishop_payment_add_coupon:
                                                        eVar = new C9410x(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                                                        break;
                                                    case R.id.view_type_multishop_payment_applied_coupon:
                                                        eVar = new C9414y(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                                                        break;
                                                    case R.id.view_type_multishop_payment_apply_gift_card:
                                                        eVar = new C9416z(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                                                        break;
                                                    case R.id.view_type_multishop_payment_header:
                                                        return new C9367a0(viewGroup);
                                                    case R.id.view_type_multishop_payment_options:
                                                        eVar = new C9373d0(viewGroup, (C9282g) this.f28982a.mo19993f(i, (Integer) null));
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case R.id.view_type_multishop_shipping:
                                                                eVar = new C9391k0(viewGroup, (C9292o) this.f28982a.mo19993f(i, (Integer) null));
                                                                break;
                                                            case R.id.view_type_multishop_shop_header:
                                                                eVar = new C9393l0(viewGroup, (CartShopHeaderClickHandler) this.f28982a.mo19993f(i, (Integer) null));
                                                                break;
                                                            case R.id.view_type_multishop_space:
                                                                return new C12016y(viewGroup.getContext(), viewGroup);
                                                            default:
                                                                switch (i) {
                                                                    case R.id.view_type_total_line_item:
                                                                        break;
                                                                    case R.id.view_type_totals_note:
                                                                        return new C9377f0(viewGroup);
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                        C13171a aVar3 = (C13171a) this.f28982a.mo19993f(i, (Integer) null);
                        eVar = new C9375e0(viewGroup, i);
                        break;
                }
        }
        return eVar;
    }
}
