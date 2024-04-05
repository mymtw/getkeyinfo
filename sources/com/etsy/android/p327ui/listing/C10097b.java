package com.etsy.android.p327ui.listing;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.favorites.C9853h;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.bottombuybuttoms.HorizontalBuyButtonsViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.ExpressCheckoutViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.gpay.GooglePayViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.CartButtonViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery.C10257d;
import com.etsy.android.p327ui.listing.p329ui.buybox.freeshipping.FreeShippingViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.klarna.KlarnaInfoViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge.C10270f;
import com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge.C10273i;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.PersonalizationOptionalViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.PersonalizationRequiredViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.quantity.C10303d;
import com.etsy.android.p327ui.listing.p329ui.buybox.shopname.ShopNameViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.signal.ListingSignalColumnsViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.termsandconditions.TermsAndConditionsViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.title.C10310b;
import com.etsy.android.p327ui.listing.p329ui.buybox.title.TitleViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.transparentpricing.TransparentPricingViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.VariationOneFromInventoryUiViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.VariationTwoFromInventoryUiViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.VariationOneFromListingViewHolder;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.VariationTwoFromListingViewHolder;
import com.etsy.android.p327ui.listing.p329ui.footer.ListingFooterViewHolder;
import com.etsy.android.p327ui.listing.p329ui.listingpromotion.ListingPromotionViewHolder;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.button.MoreFromShopButtonViewHolder;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.MoreFromShopRowViewHolder;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanelViewHolder;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanelViewHolder;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsVariantPanelViewHolder;
import com.etsy.android.p327ui.listing.p329ui.panels.overview.OverviewPanelViewHolder;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.ReviewsPanelViewHolder;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.ShippingAndPoliciesPanelViewHolder;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.ShippingUnstructuredPoliciesPanelViewHolder;
import com.etsy.android.p327ui.listing.p329ui.productwarninginfo.ProductWarningInfoViewHolder;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.SellerInfoViewHolder;
import com.etsy.android.p327ui.listing.p329ui.shop.shopheader.ShopHeaderWithNumericRatingViewHolder;
import com.etsy.android.p327ui.listing.viewholders.C10672a;
import com.etsy.android.p327ui.listing.viewholders.ListingImagesViewHolder;
import com.etsy.android.p327ui.util.C11786n;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p362hd.C12816d;
import p375jd.C12972b;
import p375jd.C12973c;
import p375jd.C12975e;
import p375jd.C12976f;
import p382kd.C12994b;
import p390ld.C13012a;
import p390ld.C13014b;
import p406nd.C13112b;
import p421pd.C13218b;
import p429qd.C13299b;
import p443sd.C13374b;
import p459ud.C13480c;
import p459ud.C13483f;
import p459ud.C13485h;
import p466vc.C13573c;
import p467vd.C13781b;
import p496za.C13943a;

/* renamed from: com.etsy.android.ui.listing.b */
public final class C10097b extends C3200w<C10423j, C10424k> {

    /* renamed from: c */
    public final C10310b f22252c;

    /* renamed from: d */
    public final C13573c f22253d;

    /* renamed from: e */
    public final C10672a f22254e;

    /* renamed from: f */
    public final C9853h f22255f;

    /* renamed from: g */
    public final C11786n f22256g;

    /* renamed from: h */
    public final C13483f f22257h;

    /* renamed from: i */
    public final C10156h f22258i;

    /* renamed from: j */
    public final Handler f22259j;

    /* renamed from: k */
    public final C8923u f22260k;

    /* renamed from: l */
    public final C8703p f22261l;

    /* renamed from: m */
    public final C13943a f22262m;

    /* renamed from: n */
    public final ConcurrentLinkedQueue<View> f22263n = new ConcurrentLinkedQueue<>();

    /* renamed from: com.etsy.android.ui.listing.b$a */
    public static final class C10098a extends C3167n.C3172e<C10423j> {
        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            return C19383o.m32792b((C10423j) obj, (C10423j) obj2);
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b(C19386q.m32807a(((C10423j) obj).getClass()), C19386q.m32807a(((C10423j) obj2).getClass()));
        }
    }

    /* renamed from: com.etsy.android.ui.listing.b$b */
    public /* synthetic */ class C10099b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22264a;

        static {
            int[] iArr = new int[ListingViewTypes.values().length];
            iArr[ListingViewTypes.SPACE.ordinal()] = 1;
            iArr[ListingViewTypes.ITEM_DETAILS_PANEL.ordinal()] = 2;
            iArr[ListingViewTypes.LISTING_PROMOTION.ordinal()] = 3;
            iArr[ListingViewTypes.REVIEWS_PANEL.ordinal()] = 4;
            iArr[ListingViewTypes.PERSONALIZATION_REQUIRED.ordinal()] = 5;
            iArr[ListingViewTypes.PERSONALIZATION_OPTIONAL.ordinal()] = 6;
            iArr[ListingViewTypes.TERMS_AND_CONDITIONS.ordinal()] = 7;
            iArr[ListingViewTypes.PRICE.ordinal()] = 8;
            iArr[ListingViewTypes.PRICE_WITH_DISCOUNT.ordinal()] = 9;
            iArr[ListingViewTypes.TITLE.ordinal()] = 10;
            iArr[ListingViewTypes.SHOP_NAME.ordinal()] = 11;
            iArr[ListingViewTypes.SHOP_HEADER_WITH_NUMERIC_RATING.ordinal()] = 12;
            iArr[ListingViewTypes.HORIZONTAL_INFO_TABLE.ordinal()] = 13;
            iArr[ListingViewTypes.STOCK_INDICATOR.ordinal()] = 14;
            iArr[ListingViewTypes.KLARNA_INFO.ordinal()] = 15;
            iArr[ListingViewTypes.TRANSPARENT_PRICING.ordinal()] = 16;
            iArr[ListingViewTypes.IMAGES.ordinal()] = 17;
            iArr[ListingViewTypes.SALE_ENDING_SOON_BADGE.ordinal()] = 18;
            iArr[ListingViewTypes.VAT_TAX_DESCRIPTION.ordinal()] = 19;
            iArr[ListingViewTypes.FREE_SHIPPING.ordinal()] = 20;
            iArr[ListingViewTypes.VARIATION_ONE_FROM_INVENTORY_UI.ordinal()] = 21;
            iArr[ListingViewTypes.VARIATION_TWO_FROM_INVENTORY_UI.ordinal()] = 22;
            iArr[ListingViewTypes.VARIATION_ONE_FROM_LISTING.ordinal()] = 23;
            iArr[ListingViewTypes.VARIATION_TWO_FROM_LISTING.ordinal()] = 24;
            iArr[ListingViewTypes.FAQS_PANEL.ordinal()] = 25;
            iArr[ListingViewTypes.SELLER_INFO.ordinal()] = 26;
            iArr[ListingViewTypes.MORE_FROM_SHOP_TITLE.ordinal()] = 27;
            iArr[ListingViewTypes.MORE_FROM_SHOP_ROW.ordinal()] = 28;
            iArr[ListingViewTypes.MORE_FROM_SHOP_BUTTON.ordinal()] = 29;
            iArr[ListingViewTypes.RECOMMENDATIONS_LOADING.ordinal()] = 30;
            iArr[ListingViewTypes.RECOMMENDATIONS_SDL.ordinal()] = 31;
            iArr[ListingViewTypes.GOOGLE_PAY.ordinal()] = 32;
            iArr[ListingViewTypes.UNIT_PRICING.ordinal()] = 33;
            iArr[ListingViewTypes.CART_BUTTON.ordinal()] = 34;
            iArr[ListingViewTypes.EXPRESS_CHECKOUT.ordinal()] = 35;
            iArr[ListingViewTypes.ESTIMATED_DELIVERY.ordinal()] = 36;
            iArr[ListingViewTypes.INELIGIBLE_SHIPPING.ordinal()] = 37;
            iArr[ListingViewTypes.QUANTITY.ordinal()] = 38;
            iArr[ListingViewTypes.LOTTIE_NUDGE.ordinal()] = 39;
            iArr[ListingViewTypes.OVERVIEW_PANEL.ordinal()] = 40;
            iArr[ListingViewTypes.SHIPPING_POLICIES_UNSTRUCTURED_PANEL.ordinal()] = 41;
            iArr[ListingViewTypes.SHIPPING_AND_POLICIES_PANEL.ordinal()] = 42;
            iArr[ListingViewTypes.FOOTER.ordinal()] = 43;
            iArr[ListingViewTypes.PRODUCT_WARNING_INFO.ordinal()] = 44;
            iArr[ListingViewTypes.DIVIDER.ordinal()] = 45;
            iArr[ListingViewTypes.HORIZONTAL_BUY_BUTTONS.ordinal()] = 46;
            f22264a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10097b(C10098a aVar, C10310b bVar, C13573c cVar, C10672a aVar2, C9853h hVar, C11786n nVar, C13483f fVar, C10156h hVar2, Handler handler, C8923u uVar, C8703p pVar, C13943a aVar3) {
        super(aVar);
        C19383o.m32797g(aVar, "diffCallback");
        C19383o.m32797g(bVar, "listingTitleExpander");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(aVar2, "imagesListingImagesDependencies");
        C19383o.m32797g(hVar, "favoriteAnimator");
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(fVar, "recommendationsSdlDependencies");
        C19383o.m32797g(hVar2, "listingViewEligibility");
        C19383o.m32797g(handler, "handler");
        C19383o.m32797g(uVar, "translationHelper");
        C19383o.m32797g(pVar, "analyticsTracker");
        C19383o.m32797g(aVar3, "sharedPreferencesProvider");
        this.f22252c = bVar;
        this.f22253d = cVar;
        this.f22254e = aVar2;
        this.f22255f = hVar;
        this.f22256g = nVar;
        this.f22257h = fVar;
        this.f22258i = hVar2;
        this.f22259j = handler;
        this.f22260k = uVar;
        this.f22261l = pVar;
        this.f22262m = aVar3;
    }

    public final int getItemViewType(int i) {
        return ((C10423j) getItem(i)).mo33574a().ordinal();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C10424k kVar = (C10424k) b0Var;
        C19383o.m32797g(kVar, "holder");
        Object item = getItem(i);
        C19383o.m32796f(item, "getItem(position)");
        kVar.mo33569e((C10423j) item);
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        boolean b = this.f22258i.f22335a.mo21132b(C8592b.C8601i.f18891e);
        switch (C10099b.f22264a[ListingViewTypes.values()[i].ordinal()]) {
            case 1:
                return new C13781b(viewGroup);
            case 2:
                if (!this.f22258i.mo33537a()) {
                    return new ItemDetailsPanelViewHolder(viewGroup, this.f22260k, this.f22253d);
                }
                return new ItemDetailsVariantPanelViewHolder(viewGroup, this.f22253d, this.f22256g);
            case 3:
                return new ListingPromotionViewHolder(viewGroup, this.f22253d);
            case 4:
                return new ReviewsPanelViewHolder(viewGroup, this.f22260k, this.f22253d, this.f22262m, this.f22258i, this.f22256g);
            case 5:
                return new PersonalizationRequiredViewHolder(viewGroup, this.f22253d);
            case 6:
                return new PersonalizationOptionalViewHolder(viewGroup, this.f22253d);
            case 7:
                return new TermsAndConditionsViewHolder(viewGroup, this.f22253d);
            case 8:
                return b ? new C12972b(viewGroup) : new C12973c(viewGroup, this.f22258i);
            case 9:
                return b ? new C12975e(viewGroup) : new C12976f(viewGroup, this.f22258i);
            case 10:
                return new TitleViewHolder(viewGroup, b, this.f22252c, this.f22253d);
            case 11:
                return new ShopNameViewHolder(viewGroup, this.f22253d);
            case 12:
                return new ShopHeaderWithNumericRatingViewHolder(viewGroup, this.f22253d);
            case 13:
                return new ListingSignalColumnsViewHolder(viewGroup, this.f22253d);
            case 14:
                return b ? new C13012a(viewGroup) : new C13014b(viewGroup);
            case 15:
                return new KlarnaInfoViewHolder(viewGroup, this.f22253d);
            case 16:
                return new TransparentPricingViewHolder(viewGroup, this.f22253d);
            case 17:
                return new ListingImagesViewHolder(viewGroup, this.f22254e, this.f22253d, b);
            case 18:
                return new C12994b(viewGroup);
            case 19:
                return new C13218b(viewGroup);
            case 20:
                return new FreeShippingViewHolder(viewGroup, this.f22253d);
            case 21:
                return new VariationOneFromInventoryUiViewHolder(viewGroup, this.f22253d);
            case 22:
                return new VariationTwoFromInventoryUiViewHolder(viewGroup, this.f22253d);
            case 23:
                return new VariationOneFromListingViewHolder(viewGroup, this.f22253d);
            case 24:
                return new VariationTwoFromListingViewHolder(viewGroup, this.f22253d);
            case 25:
                return new FaqsPanelViewHolder(viewGroup, this.f22253d, this.f22256g);
            case 26:
                return new SellerInfoViewHolder(viewGroup, this.f22253d, this.f22256g);
            case 27:
                return new C13374b(viewGroup);
            case 28:
                return new MoreFromShopRowViewHolder(viewGroup, this.f22253d, this.f22255f);
            case 29:
                return new MoreFromShopButtonViewHolder(viewGroup, this.f22253d);
            case 30:
                return new C13480c(viewGroup);
            case 31:
                return new C13485h(viewGroup, this.f22257h, new WeakReference(this.f22263n));
            case 32:
                return new GooglePayViewHolder(viewGroup, this.f22253d);
            case 33:
                return new C13112b(viewGroup);
            case 34:
                return new CartButtonViewHolder(viewGroup, this.f22253d);
            case 35:
                return new ExpressCheckoutViewHolder(viewGroup, this.f22253d);
            case 36:
                return new C10257d(viewGroup, this.f22253d);
            case 37:
                return new C12816d(viewGroup, this.f22253d);
            case 38:
                return new C10303d(viewGroup, this.f22253d);
            case 39:
                return b ? new C10270f(viewGroup, this.f22261l, this.f22253d) : new C10273i(viewGroup, this.f22261l, this.f22253d);
            case 40:
                return new OverviewPanelViewHolder(viewGroup, this.f22253d);
            case 41:
                return new ShippingUnstructuredPoliciesPanelViewHolder(viewGroup, this.f22253d);
            case 42:
                return new ShippingAndPoliciesPanelViewHolder(viewGroup, this.f22253d);
            case 43:
                return new ListingFooterViewHolder(viewGroup, this.f22253d);
            case 44:
                return new ProductWarningInfoViewHolder(viewGroup, this.f22253d);
            case 45:
                return new C13299b(viewGroup);
            case 46:
                return new HorizontalBuyButtonsViewHolder(viewGroup, this.f22253d);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
        C10424k kVar = (C10424k) b0Var;
        C19383o.m32797g(kVar, "holder");
        kVar.mo33629b();
    }
}
