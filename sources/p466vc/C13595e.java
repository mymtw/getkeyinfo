package p466vc;

import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.cart.SingleListingCart;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.favoriting.AnimateFavoriteChangeHandler;
import com.etsy.android.p327ui.listing.favoriting.C10124b;
import com.etsy.android.p327ui.listing.favoriting.C10125c;
import com.etsy.android.p327ui.listing.favoriting.C10126d;
import com.etsy.android.p327ui.listing.favoriting.C10127e;
import com.etsy.android.p327ui.listing.favoriting.C10128f;
import com.etsy.android.p327ui.listing.favoriting.C10129g;
import com.etsy.android.p327ui.listing.favoriting.C10130h;
import com.etsy.android.p327ui.listing.favoriting.C10135k;
import com.etsy.android.p327ui.listing.favoriting.C10136l;
import com.etsy.android.p327ui.listing.favoriting.MarkListingAsFavoriteHandler;
import com.etsy.android.p327ui.listing.fetch.C10137a;
import com.etsy.android.p327ui.listing.fetch.C10139c;
import com.etsy.android.p327ui.listing.fetch.C10141e;
import com.etsy.android.p327ui.listing.fetch.C10142f;
import com.etsy.android.p327ui.listing.fetch.C10143g;
import com.etsy.android.p327ui.listing.fetch.C10146i;
import com.etsy.android.p327ui.listing.fetch.C10149k;
import com.etsy.android.p327ui.listing.fetch.C10151m;
import com.etsy.android.p327ui.listing.fetch.C10152n;
import com.etsy.android.p327ui.listing.handlers.C10157a;
import com.etsy.android.p327ui.listing.handlers.C10160c;
import com.etsy.android.p327ui.listing.handlers.C10163e;
import com.etsy.android.p327ui.listing.handlers.C10166g;
import com.etsy.android.p327ui.listing.handlers.C10169i;
import com.etsy.android.p327ui.listing.handlers.C10170j;
import com.etsy.android.p327ui.listing.handlers.C10171k;
import com.etsy.android.p327ui.listing.handlers.C10174m;
import com.etsy.android.p327ui.listing.handlers.C10177o;
import com.etsy.android.p327ui.listing.handlers.C10180q;
import com.etsy.android.p327ui.listing.handlers.C10183s;
import com.etsy.android.p327ui.listing.handlers.C10186u;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10425l;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10199a;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10204e;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers.C10214a;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers.C10217c;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers.C10220f;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers.FetchSingleListingCartHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.AddToCartNetworkHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10231a;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10232b;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10233c;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10235e;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10236f;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10237g;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10238h;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10240j;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10241k;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10246n;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10249p;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.ShowCartButtonHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.ShowViewInCartButtonHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery.C10254b;
import com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery.EstimatedDeliveryClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.freeshipping.C10259b;
import com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge.C10263a;
import com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge.C10266c;
import com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge.C10274j;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.handlers.PersonalizationOptionalTextChangedHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.handlers.PersonalizationOptionalToggledHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.handlers.PersonalizationRequiredTextChangedHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.handlers.PersonalizationRequiredToggledHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.handlers.ShowPersonalizationInputErrorHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.price.handlers.HidePriceLoadingHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.price.handlers.ShowPriceLoadingHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.quantity.QuantityChangedHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.title.TitleClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.C10319a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.C10329c;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.C10330d;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.bottomsheet.handlers.C10322a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.bottomsheet.handlers.C10325c;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.bottomsheet.handlers.VariationSelectionSheetDismissedHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.C10341a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.C10342b;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.C10345d;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.C10348f;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.FetchVariationOfferingHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.UpdateFirstVariationFromInventoryUiHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.UpdateSecondVariationFromInventoryUiHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.handlers.C10354a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.handlers.C10357c;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.handlers.C10360e;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.handlers.C10363g;
import com.etsy.android.p327ui.listing.p329ui.footer.C10418b;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10427a;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10428b;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10429c;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10434f;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10435g;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10440j;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10443l;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10446n;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.ImageSelectedHandler;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.ListingImageGalleryResultReceivedHandler;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.button.C10449a;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.handlers.TrackMoreFromShopAnalyticsHandler;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10454b;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10455c;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.C10478b;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.ErrorUpdatingFaqMachineTranslationHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.FaqMachineTranslationLoadingHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.FaqMachineTranslationToggleHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.FaqsPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.FetchFaqMachineTranslationHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.SuccessfulFaqMachineTranslationFetchHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.C10506a;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.C10507b;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.C10510d;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.ContentMachineTranslationToggleHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.ErrorUpdatingContentMachineTranslationHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.FetchContentMachineTranslationHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.ItemDetailsPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.ReadItemDescriptionClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.UpdateContentMachineTranslationHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.overview.C10517a;
import com.etsy.android.p327ui.listing.p329ui.panels.overview.C10518b;
import com.etsy.android.p327ui.listing.p329ui.panels.overview.OverviewPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10527a;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10528b;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10530c;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10531d;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10534f;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10535g;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10536h;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10537i;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10538j;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.ReviewTypeTabSelectedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.ReviewsPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations.C10545b;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations.C10546c;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations.ClearTranslationListHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations.TranslateReviewClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations.UpdateReviewMachineTranslationHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10574a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10575b;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10579e;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10582g;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10583h;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10584i;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.GiftWrapAvailableClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.LoadRegionsHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.NewShippingDestinationSelectedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10598a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10599b;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10602d;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10603e;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10606g;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10609i;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10612k;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.SeeMoreSellerDetailsClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.ShippingAndPoliciesPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.StructuredPaymentsExpandedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.handlers.ShippingUnstructuredPoliciesPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.productwarninginfo.C10621a;
import com.etsy.android.p327ui.listing.p329ui.productwarninginfo.ProductWarningInfoAnalyticsHandler;
import com.etsy.android.p327ui.listing.p329ui.productwarninginfo.ProductWarningInfoClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.recommendations.handlers.C10626a;
import com.etsy.android.p327ui.listing.p329ui.recommendations.handlers.C10629c;
import com.etsy.android.p327ui.listing.p329ui.recommendations.handlers.FetchRecommendationsIfNeededHandler;
import com.etsy.android.p327ui.listing.p329ui.recommendations.handlers.ListingImpressionHandler;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.C10634a;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10637a;
import com.etsy.android.p327ui.listing.p329ui.shop.handlers.C10642a;
import com.etsy.android.p327ui.listing.p329ui.shop.handlers.C10643b;
import com.etsy.android.p327ui.listing.p329ui.shop.handlers.StarSellerBadgeTappedHandler;
import com.etsy.android.p327ui.listing.p329ui.shop.handlers.StarSellerBadgeViewedHandler;
import com.etsy.android.p327ui.listing.p329ui.toppanel.C10650a;
import com.etsy.android.p327ui.listing.p329ui.toppanel.C10653c;
import com.etsy.android.p327ui.listing.p329ui.toppanel.contactShopInfo.C10654a;
import com.etsy.android.p327ui.listing.screenshots.C10190a;
import com.etsy.android.p327ui.listing.screenshots.C10191b;
import com.etsy.android.p327ui.listing.screenshots.C10192c;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LandingPageKey;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p349fd.C12717a;
import p349fd.C12718b;
import p349fd.C12719c;
import p349fd.C12720d;
import p349fd.C12721e;
import p355gd.C12785a;
import p362hd.C12813b;
import p369id.C12935c;
import p369id.C12938e;
import p466vc.C13574d;
import p466vc.C13597g;
import p473wc.C13812a;
import p473wc.C13814c;
import p473wc.C13817e;
import p473wc.C13820g;
import p481xc.C13872a;
import p481xc.C13873b;
import p481xc.C13874c;
import p481xc.C13875d;
import p481xc.C13878f;
import p489yc.C13902a;
import p489yc.C13906d;
import p489yc.C13907e;
import p489yc.C13910g;
import p628nj.C18263b;

/* renamed from: vc.e */
public final class C13595e {

    /* renamed from: A */
    public final FetchFaqMachineTranslationHandler f29684A;

    /* renamed from: A0 */
    public final C10124b f29685A0;

    /* renamed from: A1 */
    public final C13814c f29686A1;

    /* renamed from: A2 */
    public final ProductWarningInfoAnalyticsHandler f29687A2;

    /* renamed from: B */
    public final SuccessfulFaqMachineTranslationFetchHandler f29688B;

    /* renamed from: B0 */
    public final C10126d f29689B0;

    /* renamed from: B1 */
    public final C10537i f29690B1;

    /* renamed from: B2 */
    public final C10152n f29691B2;

    /* renamed from: C */
    public final FaqMachineTranslationLoadingHandler f29692C;

    /* renamed from: C0 */
    public final C10129g f29693C0;

    /* renamed from: C1 */
    public final C10536h f29694C1;

    /* renamed from: C2 */
    public final C10259b f29695C2;

    /* renamed from: D */
    public final ErrorUpdatingFaqMachineTranslationHandler f29696D;

    /* renamed from: D0 */
    public final MarkListingAsFavoriteHandler f29697D0;

    /* renamed from: D1 */
    public final C10538j f29698D1;

    /* renamed from: D2 */
    public final C10517a f29699D2;

    /* renamed from: E */
    public final TranslateReviewClickedHandler f29700E;

    /* renamed from: E0 */
    public final C10127e f29701E0;

    /* renamed from: E1 */
    public final C10528b f29702E1;

    /* renamed from: E2 */
    public final C10440j f29703E2;

    /* renamed from: F */
    public final C10546c f29704F;

    /* renamed from: F0 */
    public final C10128f f29705F0;

    /* renamed from: F1 */
    public final C10530c f29706F1;

    /* renamed from: F2 */
    public final C13777h f29707F2;

    /* renamed from: G */
    public final C10545b f29708G;

    /* renamed from: G0 */
    public final C10135k f29709G0;

    /* renamed from: G1 */
    public final ReviewTypeTabSelectedHandler f29710G1;

    /* renamed from: G2 */
    public final ReadItemDescriptionClickedHandler f29711G2;

    /* renamed from: H */
    public final UpdateReviewMachineTranslationHandler f29712H;

    /* renamed from: H0 */
    public final C10136l f29713H0;

    /* renamed from: H1 */
    public final C10531d f29714H1;

    /* renamed from: H2 */
    public final C10427a f29715H2;

    /* renamed from: I */
    public final ClearTranslationListHandler f29716I;

    /* renamed from: I0 */
    public final AnimateFavoriteChangeHandler f29717I0;

    /* renamed from: I1 */
    public final C10330d f29718I1;

    /* renamed from: I2 */
    public final C10534f f29719I2;

    /* renamed from: J */
    public final PersonalizationOptionalTextChangedHandler f29720J;

    /* renamed from: J0 */
    public final C10637a f29721J0;

    /* renamed from: J1 */
    public final ShowPersonalizationInputErrorHandler f29722J1;

    /* renamed from: J2 */
    public final C10527a f29723J2;

    /* renamed from: K */
    public final PersonalizationRequiredTextChangedHandler f29724K;

    /* renamed from: K0 */
    public final C13873b f29725K0;

    /* renamed from: K1 */
    public final C10329c f29726K1;

    /* renamed from: L */
    public final C10166g f29727L;

    /* renamed from: L0 */
    public final C10130h f29728L0;

    /* renamed from: L1 */
    public final C10319a f29729L1;

    /* renamed from: M */
    public final PersonalizationOptionalToggledHandler f29730M;

    /* renamed from: M0 */
    public final C13875d f29731M0;

    /* renamed from: M1 */
    public final C12935c f29732M1;

    /* renamed from: N */
    public final PersonalizationRequiredToggledHandler f29733N;

    /* renamed from: N0 */
    public final C13872a f29734N0;

    /* renamed from: N1 */
    public final C10535g f29735N1;

    /* renamed from: O */
    public final C10190a f29736O;

    /* renamed from: O0 */
    public final C13878f f29737O0;

    /* renamed from: O1 */
    public final C10238h f29738O1;

    /* renamed from: P */
    public final C10191b f29739P;

    /* renamed from: P0 */
    public final C13812a f29740P0;

    /* renamed from: P1 */
    public final C10214a f29741P1;

    /* renamed from: Q */
    public final C10192c f29742Q;

    /* renamed from: Q0 */
    public final C10654a f29743Q0;

    /* renamed from: Q1 */
    public final FetchSingleListingCartHandler f29744Q1;

    /* renamed from: R */
    public final ImageSelectedHandler f29745R;

    /* renamed from: R0 */
    public final C10634a f29746R0;

    /* renamed from: R1 */
    public final C12785a f29747R1;

    /* renamed from: S */
    public final C10434f f29748S;

    /* renamed from: S0 */
    public final C10599b f29749S0;

    /* renamed from: S1 */
    public final C10157a f29750S1;

    /* renamed from: T */
    public final C10428b f29751T;

    /* renamed from: T0 */
    public final C10602d f29752T0;

    /* renamed from: T1 */
    public final C10170j f29753T1;

    /* renamed from: U */
    public final C10429c f29754U;

    /* renamed from: U0 */
    public final C10598a f29755U0;

    /* renamed from: U1 */
    public final C10217c f29756U1;

    /* renamed from: V */
    public final C10446n f29757V;

    /* renamed from: V0 */
    public final C10125c f29758V0;

    /* renamed from: V1 */
    public final C10220f f29759V1;

    /* renamed from: W */
    public final C10443l f29760W;

    /* renamed from: W0 */
    public final C12720d f29761W0;

    /* renamed from: W1 */
    public final C12813b f29762W1;

    /* renamed from: X */
    public final ListingImageGalleryResultReceivedHandler f29763X;

    /* renamed from: X0 */
    public final EstimatedDeliveryClickedHandler f29764X0;

    /* renamed from: X1 */
    public final C10274j f29765X1;

    /* renamed from: Y */
    public final TitleClickedHandler f29766Y;

    /* renamed from: Y0 */
    public final C10163e f29767Y0;

    /* renamed from: Y1 */
    public final C10263a f29768Y1;

    /* renamed from: Z */
    public final C10643b f29769Z;

    /* renamed from: Z0 */
    public final C10235e f29770Z0;

    /* renamed from: Z1 */
    public final C10151m f29771Z1;

    /* renamed from: a */
    public final C10650a f29772a;

    /* renamed from: a0 */
    public final C13817e f29773a0;

    /* renamed from: a1 */
    public final C10236f f29774a1;

    /* renamed from: a2 */
    public final QuantityChangedHandler f29775a2;

    /* renamed from: b */
    public final C10160c f29776b;

    /* renamed from: b0 */
    public final C10642a f29777b0;

    /* renamed from: b1 */
    public final C10231a f29778b1;

    /* renamed from: b2 */
    public final ReviewsPanelClickedHandler f29779b2;

    /* renamed from: c */
    public final C10180q f29780c;

    /* renamed from: c0 */
    public final C13820g f29781c0;

    /* renamed from: c1 */
    public final C10322a f29782c1;

    /* renamed from: c2 */
    public final OverviewPanelClickedHandler f29783c2;

    /* renamed from: d */
    public final C10183s f29784d;

    /* renamed from: d0 */
    public final StarSellerBadgeTappedHandler f29785d0;

    /* renamed from: d1 */
    public final C10325c f29786d1;

    /* renamed from: d2 */
    public final C10575b f29787d2;

    /* renamed from: e */
    public final C10174m f29788e;

    /* renamed from: e0 */
    public final StarSellerBadgeViewedHandler f29789e0;

    /* renamed from: e1 */
    public final VariationSelectionSheetDismissedHandler f29790e1;

    /* renamed from: e2 */
    public final C10254b f29791e2;

    /* renamed from: f */
    public final C10653c f29792f;

    /* renamed from: f0 */
    public final C10232b f29793f0;

    /* renamed from: f1 */
    public final C10363g f29794f1;

    /* renamed from: f2 */
    public final FaqsPanelClickedHandler f29795f2;

    /* renamed from: g */
    public final C10146i f29796g;

    /* renamed from: g0 */
    public final AddToCartNetworkHandler f29797g0;

    /* renamed from: g1 */
    public final C10354a f29798g1;

    /* renamed from: g2 */
    public final ShippingAndPoliciesPanelClickedHandler f29799g2;

    /* renamed from: h */
    public final C10171k f29800h;

    /* renamed from: h0 */
    public final ShowCartButtonHandler f29801h0;

    /* renamed from: h1 */
    public final C10360e f29802h1;

    /* renamed from: h2 */
    public final ShippingUnstructuredPoliciesPanelClickedHandler f29803h2;

    /* renamed from: i */
    public final C10139c f29804i;

    /* renamed from: i0 */
    public final C10241k f29805i0;

    /* renamed from: i1 */
    public final C10357c f29806i1;

    /* renamed from: i2 */
    public final C10583h f29807i2;

    /* renamed from: j */
    public final C10137a f29808j;

    /* renamed from: j0 */
    public final C10204e f29809j0;

    /* renamed from: j1 */
    public final C10348f f29810j1;

    /* renamed from: j2 */
    public final LoadRegionsHandler f29811j2;

    /* renamed from: k */
    public final C10141e f29812k;

    /* renamed from: k0 */
    public final C10199a f29813k0;

    /* renamed from: k1 */
    public final UpdateFirstVariationFromInventoryUiHandler f29814k1;

    /* renamed from: k2 */
    public final C10579e f29815k2;

    /* renamed from: l */
    public final C10142f f29816l;

    /* renamed from: l0 */
    public final C10237g f29817l0;

    /* renamed from: l1 */
    public final UpdateSecondVariationFromInventoryUiHandler f29818l1;

    /* renamed from: l2 */
    public final C10177o f29819l2;

    /* renamed from: m */
    public final C10143g f29820m;

    /* renamed from: m0 */
    public final ShowViewInCartButtonHandler f29821m0;

    /* renamed from: m1 */
    public final FetchVariationOfferingHandler f29822m1;

    /* renamed from: m2 */
    public final C10606g f29823m2;

    /* renamed from: n */
    public final C10149k f29824n;

    /* renamed from: n0 */
    public final C10246n f29825n0;

    /* renamed from: n1 */
    public final C10342b f29826n1;

    /* renamed from: n2 */
    public final StructuredPaymentsExpandedHandler f29827n2;

    /* renamed from: o */
    public final C10435g f29828o;

    /* renamed from: o0 */
    public final C10249p f29829o0;

    /* renamed from: o1 */
    public final C10345d f29830o1;

    /* renamed from: o2 */
    public final C10603e f29831o2;

    /* renamed from: p */
    public final C10169i f29832p;

    /* renamed from: p0 */
    public final C10240j f29833p0;

    /* renamed from: p1 */
    public final ShowPriceLoadingHandler f29834p1;

    /* renamed from: p2 */
    public final C10584i f29835p2;

    /* renamed from: q */
    public final ItemDetailsPanelClickedHandler f29836q;

    /* renamed from: q0 */
    public final C13906d f29837q0;

    /* renamed from: q1 */
    public final HidePriceLoadingHandler f29838q1;

    /* renamed from: q2 */
    public final NewShippingDestinationSelectedHandler f29839q2;

    /* renamed from: r */
    public final C10506a f29840r;

    /* renamed from: r0 */
    public final C12938e f29841r0;

    /* renamed from: r1 */
    public final C10341a f29842r1;

    /* renamed from: r2 */
    public final C10574a f29843r2;

    /* renamed from: s */
    public final ContentMachineTranslationToggleHandler f29844s;

    /* renamed from: s0 */
    public final C13910g f29845s0;

    /* renamed from: s1 */
    public final FetchRecommendationsIfNeededHandler f29846s1;

    /* renamed from: s2 */
    public final C10582g f29847s2;

    /* renamed from: t */
    public final FetchContentMachineTranslationHandler f29848t;

    /* renamed from: t0 */
    public final C13902a f29849t0;

    /* renamed from: t1 */
    public final C10629c f29850t1;

    /* renamed from: t2 */
    public final GiftWrapAvailableClickedHandler f29851t2;

    /* renamed from: u */
    public final C10510d f29852u;

    /* renamed from: u0 */
    public final C13907e f29853u0;

    /* renamed from: u1 */
    public final C10449a f29854u1;

    /* renamed from: u2 */
    public final C10609i f29855u2;

    /* renamed from: v */
    public final C10507b f29856v;

    /* renamed from: v0 */
    public final C10233c f29857v0;

    /* renamed from: v1 */
    public final C10454b f29858v1;

    /* renamed from: v2 */
    public final C10612k f29859v2;

    /* renamed from: w */
    public final UpdateContentMachineTranslationHandler f29860w;

    /* renamed from: w0 */
    public final C12717a f29861w0;

    /* renamed from: w1 */
    public final C10626a f29862w1;

    /* renamed from: w2 */
    public final SeeMoreSellerDetailsClickedHandler f29863w2;

    /* renamed from: x */
    public final ErrorUpdatingContentMachineTranslationHandler f29864x;

    /* renamed from: x0 */
    public final C12719c f29865x0;

    /* renamed from: x1 */
    public final TrackMoreFromShopAnalyticsHandler f29866x1;

    /* renamed from: x2 */
    public final C10418b f29867x2;

    /* renamed from: y */
    public final C10478b f29868y;

    /* renamed from: y0 */
    public final C12718b f29869y0;

    /* renamed from: y1 */
    public final ListingImpressionHandler f29870y1;

    /* renamed from: y2 */
    public final C13874c f29871y2;

    /* renamed from: z */
    public final FaqMachineTranslationToggleHandler f29872z;

    /* renamed from: z0 */
    public final C12721e f29873z0;

    /* renamed from: z1 */
    public final C10186u f29874z1;

    /* renamed from: z2 */
    public final ProductWarningInfoClickedHandler f29875z2;

    public C13595e(C10650a aVar, C10160c cVar, C10180q qVar, C10183s sVar, C10174m mVar, C10653c cVar2, C10146i iVar, C10171k kVar, C10139c cVar3, C10137a aVar2, C10141e eVar, C10142f fVar, C10143g gVar, C10149k kVar2, C10435g gVar2, C10169i iVar2, ItemDetailsPanelClickedHandler itemDetailsPanelClickedHandler, C10506a aVar3, ContentMachineTranslationToggleHandler contentMachineTranslationToggleHandler, FetchContentMachineTranslationHandler fetchContentMachineTranslationHandler, C10510d dVar, C10507b bVar, UpdateContentMachineTranslationHandler updateContentMachineTranslationHandler, ErrorUpdatingContentMachineTranslationHandler errorUpdatingContentMachineTranslationHandler, C10478b bVar2, FaqMachineTranslationToggleHandler faqMachineTranslationToggleHandler, FetchFaqMachineTranslationHandler fetchFaqMachineTranslationHandler, SuccessfulFaqMachineTranslationFetchHandler successfulFaqMachineTranslationFetchHandler, FaqMachineTranslationLoadingHandler faqMachineTranslationLoadingHandler, ErrorUpdatingFaqMachineTranslationHandler errorUpdatingFaqMachineTranslationHandler, TranslateReviewClickedHandler translateReviewClickedHandler, C10546c cVar4, C10545b bVar3, UpdateReviewMachineTranslationHandler updateReviewMachineTranslationHandler, ClearTranslationListHandler clearTranslationListHandler, PersonalizationOptionalTextChangedHandler personalizationOptionalTextChangedHandler, PersonalizationRequiredTextChangedHandler personalizationRequiredTextChangedHandler, C10166g gVar3, PersonalizationOptionalToggledHandler personalizationOptionalToggledHandler, PersonalizationRequiredToggledHandler personalizationRequiredToggledHandler, C10190a aVar4, C10191b bVar4, C10192c cVar5, ImageSelectedHandler imageSelectedHandler, C10434f fVar2, C10428b bVar5, C10429c cVar6, C10446n nVar, C10443l lVar, ListingImageGalleryResultReceivedHandler listingImageGalleryResultReceivedHandler, TitleClickedHandler titleClickedHandler, C10643b bVar6, C13817e eVar2, C10642a aVar5, C13820g gVar4, StarSellerBadgeTappedHandler starSellerBadgeTappedHandler, StarSellerBadgeViewedHandler starSellerBadgeViewedHandler, C10232b bVar7, AddToCartNetworkHandler addToCartNetworkHandler, ShowCartButtonHandler showCartButtonHandler, C10241k kVar3, C10204e eVar3, C10199a aVar6, C10237g gVar5, ShowViewInCartButtonHandler showViewInCartButtonHandler, C10246n nVar2, C10249p pVar, C10240j jVar, C13906d dVar2, C12938e eVar4, C13910g gVar6, C13902a aVar7, C13907e eVar5, C10233c cVar7, C12717a aVar8, C12719c cVar8, C12718b bVar8, C12721e eVar6, C10124b bVar9, C10126d dVar3, C10129g gVar7, MarkListingAsFavoriteHandler markListingAsFavoriteHandler, C10127e eVar7, C10128f fVar3, C10135k kVar4, C10136l lVar2, AnimateFavoriteChangeHandler animateFavoriteChangeHandler, C10637a aVar9, C13873b bVar10, C10130h hVar, C13875d dVar4, C13872a aVar10, C13878f fVar4, C13812a aVar11, C10654a aVar12, C10634a aVar13, C10599b bVar11, C10602d dVar5, C10598a aVar14, C10125c cVar9, C12720d dVar6, EstimatedDeliveryClickedHandler estimatedDeliveryClickedHandler, C10163e eVar8, C10235e eVar9, C10236f fVar5, C10231a aVar15, C10322a aVar16, C10325c cVar10, VariationSelectionSheetDismissedHandler variationSelectionSheetDismissedHandler, C10363g gVar8, C10354a aVar17, C10360e eVar10, C10357c cVar11, C10348f fVar6, UpdateFirstVariationFromInventoryUiHandler updateFirstVariationFromInventoryUiHandler, UpdateSecondVariationFromInventoryUiHandler updateSecondVariationFromInventoryUiHandler, FetchVariationOfferingHandler fetchVariationOfferingHandler, C10342b bVar12, C10345d dVar7, ShowPriceLoadingHandler showPriceLoadingHandler, HidePriceLoadingHandler hidePriceLoadingHandler, C10341a aVar18, FetchRecommendationsIfNeededHandler fetchRecommendationsIfNeededHandler, C10629c cVar12, C10449a aVar19, C10454b bVar13, C10626a aVar20, TrackMoreFromShopAnalyticsHandler trackMoreFromShopAnalyticsHandler, ListingImpressionHandler listingImpressionHandler, C10186u uVar, C13814c cVar13, C10537i iVar3, C10536h hVar2, C10538j jVar2, C10528b bVar14, C10530c cVar14, ReviewTypeTabSelectedHandler reviewTypeTabSelectedHandler, C10531d dVar8, C10330d dVar9, ShowPersonalizationInputErrorHandler showPersonalizationInputErrorHandler, C10329c cVar15, C10319a aVar21, C12935c cVar16, C10535g gVar9, C10238h hVar3, C10214a aVar22, FetchSingleListingCartHandler fetchSingleListingCartHandler, C12785a aVar23, C10157a aVar24, C10170j jVar3, C10217c cVar17, C10220f fVar7, C12813b bVar15, C10274j jVar4, C10263a aVar25, C10151m mVar2, QuantityChangedHandler quantityChangedHandler, ReviewsPanelClickedHandler reviewsPanelClickedHandler, OverviewPanelClickedHandler overviewPanelClickedHandler, C10575b bVar16, C10254b bVar17, FaqsPanelClickedHandler faqsPanelClickedHandler, ShippingAndPoliciesPanelClickedHandler shippingAndPoliciesPanelClickedHandler, ShippingUnstructuredPoliciesPanelClickedHandler shippingUnstructuredPoliciesPanelClickedHandler, C10583h hVar4, LoadRegionsHandler loadRegionsHandler, C10579e eVar11, C10177o oVar, C10606g gVar10, StructuredPaymentsExpandedHandler structuredPaymentsExpandedHandler, C10603e eVar12, C10584i iVar4, NewShippingDestinationSelectedHandler newShippingDestinationSelectedHandler, C10574a aVar26, C10582g gVar11, GiftWrapAvailableClickedHandler giftWrapAvailableClickedHandler, C10609i iVar5, C10612k kVar5, SeeMoreSellerDetailsClickedHandler seeMoreSellerDetailsClickedHandler, C10418b bVar18, C13874c cVar18, ProductWarningInfoClickedHandler productWarningInfoClickedHandler, ProductWarningInfoAnalyticsHandler productWarningInfoAnalyticsHandler, C10152n nVar3, C10259b bVar19, C10517a aVar27, C10440j jVar5, C13777h hVar5, ReadItemDescriptionClickedHandler readItemDescriptionClickedHandler, C10427a aVar28, C10534f fVar8, C10527a aVar29) {
        C10650a aVar30 = aVar;
        C10160c cVar19 = cVar;
        C10180q qVar2 = qVar;
        C10183s sVar2 = sVar;
        C10174m mVar3 = mVar;
        C10653c cVar20 = cVar2;
        C10146i iVar6 = iVar;
        C10171k kVar6 = kVar;
        C10139c cVar21 = cVar3;
        C10137a aVar31 = aVar2;
        C10141e eVar13 = eVar;
        C10142f fVar9 = fVar;
        C10143g gVar12 = gVar;
        C10149k kVar7 = kVar2;
        C10169i iVar7 = iVar2;
        C19383o.m32797g(aVar30, "backButtonClickedHandler");
        C19383o.m32797g(cVar19, "analyticsGuidHandler");
        C19383o.m32797g(qVar2, "referrerHandler");
        C19383o.m32797g(sVar2, "statusBarHeightHandler");
        C19383o.m32797g(mVar3, "onGlobalLayoutHandler");
        C19383o.m32797g(cVar20, "shareListingHandler");
        C19383o.m32797g(iVar6, "loadingHandler");
        C19383o.m32797g(kVar6, "navigationArgumentsHandler");
        C19383o.m32797g(cVar21, "listingFetchHandler");
        C19383o.m32797g(aVar31, "listingFetchErrorHandler");
        C19383o.m32797g(eVar13, "listingFetchResultReceivedHandler");
        C19383o.m32797g(fVar9, "listingFetchSuccessHandler");
        C19383o.m32797g(gVar12, "listingFetchUnavailableHandler");
        C19383o.m32797g(kVar7, "logListingFetchErrorHandler");
        C19383o.m32797g(gVar2, "imageVisibilityStatusChangedHandler");
        C19383o.m32797g(iVar2, "completelyVisibleItemPositionsHandler");
        C19383o.m32797g(itemDetailsPanelClickedHandler, "itemDetailsPanelClickedHandler");
        C19383o.m32797g(aVar3, "contentMachineTranslationClickedHandler");
        C19383o.m32797g(contentMachineTranslationToggleHandler, "contentMachineTranslationToggleHandler");
        C19383o.m32797g(fetchContentMachineTranslationHandler, "fetchContentMachineTranslationHandler");
        C19383o.m32797g(dVar, "successfulContentMachineTranslationFetchHandler");
        C19383o.m32797g(bVar, "contentMachineTranslationLoadingHandler");
        C19383o.m32797g(updateContentMachineTranslationHandler, "updateContentMachineTranslationHandler");
        C19383o.m32797g(errorUpdatingContentMachineTranslationHandler, "errorUpdatingContentMachineTranslationHandler");
        C19383o.m32797g(bVar2, "faqMachineTranslationClickedHandler");
        C19383o.m32797g(faqMachineTranslationToggleHandler, "faqMachineTranslationToggleHandler");
        C19383o.m32797g(fetchFaqMachineTranslationHandler, "fetchFaqMachineTranslationHandler");
        C19383o.m32797g(successfulFaqMachineTranslationFetchHandler, "successfulFaqMachineTranslationFetchHandler");
        C19383o.m32797g(faqMachineTranslationLoadingHandler, "faqMachineTranslationLoadingHandler");
        C19383o.m32797g(errorUpdatingFaqMachineTranslationHandler, "errorUpdatingFaqMachineTranslationHandler");
        C19383o.m32797g(translateReviewClickedHandler, "translateReviewClickedHandler");
        C19383o.m32797g(cVar4, "successfulReviewMachineTranslationHandler");
        C19383o.m32797g(bVar3, "errorUpdatingReviewMachineTranslationHandler");
        C19383o.m32797g(updateReviewMachineTranslationHandler, "updateReviewMachineTranslationHandler");
        C19383o.m32797g(clearTranslationListHandler, "clearTranslationListHandler");
        C19383o.m32797g(personalizationOptionalTextChangedHandler, "personalizationOptionalTextChangedHandler");
        C19383o.m32797g(personalizationRequiredTextChangedHandler, "personalizationRequiredTextChangedHandler");
        C19383o.m32797g(gVar3, "closeKeyboardHandler");
        C19383o.m32797g(personalizationOptionalToggledHandler, "personalizationOptionalToggledHandler");
        C19383o.m32797g(personalizationRequiredToggledHandler, "personalizationRequiredToggledHandler");
        C19383o.m32797g(aVar4, "screenShotDetectedHandler");
        C19383o.m32797g(bVar4, "screenShotErrorHandler");
        C19383o.m32797g(cVar5, "shareScreenShotClickedHandler");
        C19383o.m32797g(imageSelectedHandler, "imageSelectedHandler");
        C19383o.m32797g(fVar2, "imageTappedHandler");
        C19383o.m32797g(bVar5, "imageDoubleTappedHandler");
        C19383o.m32797g(cVar6, "imagePagerScrollStateChangedHandler");
        C19383o.m32797g(nVar, "visuallySimilarButtonTappedHandler");
        C19383o.m32797g(lVar, "videoStartedHandler");
        C19383o.m32797g(listingImageGalleryResultReceivedHandler, "listingImageGalleryResultReceivedHandler");
        C19383o.m32797g(titleClickedHandler, "titleClickedHandler");
        C19383o.m32797g(bVar6, "shopRatingClickedHandler");
        C19383o.m32797g(eVar2, "openShopHandler");
        C19383o.m32797g(aVar5, "openThisShopHandler");
        C19383o.m32797g(gVar4, "sendMessageHandler");
        C19383o.m32797g(starSellerBadgeTappedHandler, "starSellerBadgeTappedHandler");
        C19383o.m32797g(starSellerBadgeViewedHandler, "starSellerBadgeViewedHandler");
        C19383o.m32797g(bVar7, "addToCartButtonClickedHandler");
        C19383o.m32797g(addToCartNetworkHandler, "addToCartNetworkHandler");
        C19383o.m32797g(showCartButtonHandler, "showCartButtonHandler");
        C19383o.m32797g(kVar3, "listingAddedToCartHandler");
        C19383o.m32797g(eVar3, "addToCartInterstitialShowHandler");
        C19383o.m32797g(aVar6, "addToCartInterstitialDismissHandler");
        C19383o.m32797g(gVar5, "errorAddingListingToCartHandler");
        C19383o.m32797g(showViewInCartButtonHandler, "showViewInCartButtonHandler");
        C19383o.m32797g(nVar2, "stopCartButtonAnimationHandler");
        C19383o.m32797g(pVar, "viewInCartHandler");
        C19383o.m32797g(jVar, "facebookTrackAddToCartHandler");
        C19383o.m32797g(dVar2, "trackListingViewedHandler");
        C19383o.m32797g(eVar4, "trackPersonalizationAvailableHandler");
        C19383o.m32797g(gVar6, "trackViewListingComplementaryHandler");
        C19383o.m32797g(aVar7, "facebookTrackViewListingHandler");
        C19383o.m32797g(eVar5, "trackRecentlyViewedHandler");
        C19383o.m32797g(cVar7, "addToCartHapticFeedbackHandler");
        C19383o.m32797g(aVar8, "googlePayButtonClickedHandler");
        C19383o.m32797g(cVar8, "googlePayExpressCheckoutHandler");
        C19383o.m32797g(bVar8, "googlePayErrorProcessingPaymentHandler");
        C19383o.m32797g(eVar6, "googlePayRequestPaymentHandler");
        C19383o.m32797g(bVar9, "attemptToFavoriteListingHandler");
        C19383o.m32797g(dVar3, "attemptToFavoriteThisListingHandler");
        C19383o.m32797g(gVar7, "favoriteListingVibrationHandler");
        C19383o.m32797g(markListingAsFavoriteHandler, "markListingAsFavoriteHandler");
        C19383o.m32797g(eVar7, "favoriteListingErrorHandler");
        C19383o.m32797g(fVar3, "favoriteListingHandler");
        C19383o.m32797g(kVar4, "onListingFavoritedHandler");
        C19383o.m32797g(lVar2, "onListingUnFavoritedHandler");
        C19383o.m32797g(animateFavoriteChangeHandler, "animateFavoriteChangeHandler");
        C19383o.m32797g(aVar9, "favoriteShopHandler");
        C19383o.m32797g(bVar10, "signInAndFavoriteShopHandler");
        C19383o.m32797g(hVar, "heartUpdateEventHandler");
        C19383o.m32797g(dVar4, "signInHandler");
        C19383o.m32797g(aVar10, "signInAndFavoriteListingHandler");
        C19383o.m32797g(fVar4, "signInResultHandler");
        C19383o.m32797g(aVar11, "contactThisShopHandler");
        C19383o.m32797g(aVar12, "contactShopButtonClickedHandler");
        C19383o.m32797g(aVar13, "messageSellerButtonClickedHandler");
        C19383o.m32797g(bVar11, "shippingTimeTextClickedHandler");
        C19383o.m32797g(dVar5, "structuredPaymentsOtherOptionsTextClickedHandler");
        C19383o.m32797g(aVar14, "noCancellationsOrOtherQuestionsTextClickedHandler");
        C19383o.m32797g(cVar9, "attemptToFavoriteListingWithIdHandler");
        C19383o.m32797g(dVar6, "googlePayProcessPaymentHandler");
        C19383o.m32797g(estimatedDeliveryClickedHandler, "estimatedDeliveryClickedHandler");
        C19383o.m32797g(eVar8, "bottomSheetDismissHandler");
        C19383o.m32797g(eVar9, "cartButtonClickedHandler");
        C19383o.m32797g(fVar5, "cartButtonUpHandler");
        C19383o.m32797g(aVar15, "addToCartAnimationHandler");
        C19383o.m32797g(aVar16, "showVariationSelectionHandler");
        C19383o.m32797g(cVar10, "variationSelectedHandler");
        C19383o.m32797g(variationSelectionSheetDismissedHandler, "variationSelectionSheetDismissedHandler");
        C19383o.m32797g(gVar8, "variationFromListingSelectedHandler");
        C19383o.m32797g(aVar17, "updateFirstVariationFromListingHandler");
        C19383o.m32797g(eVar10, "updateSecondVariationFromListingHandler");
        C19383o.m32797g(cVar11, "updatePriceWithVariationValueHandler");
        C19383o.m32797g(fVar6, "variationFromInventoryUiSelectedHandler");
        C19383o.m32797g(updateFirstVariationFromInventoryUiHandler, "updateFirstVariationFromInventoryUiHandler");
        C19383o.m32797g(updateSecondVariationFromInventoryUiHandler, "updateSecondVariationFromInventoryUiHandler");
        C19383o.m32797g(fetchVariationOfferingHandler, "fetchVariationOfferingHandler");
        C19383o.m32797g(bVar12, "invalidNewOfferingHandler");
        C19383o.m32797g(dVar7, "updateOfferingHandler");
        C19383o.m32797g(showPriceLoadingHandler, "showPriceLoadingHandler");
        C19383o.m32797g(hidePriceLoadingHandler, "hidePriceLoadingHandler");
        C19383o.m32797g(aVar18, "errorUpdatingOfferingHandler");
        C19383o.m32797g(fetchRecommendationsIfNeededHandler, "fetchRecommendationsIfNeededHandler");
        C19383o.m32797g(cVar12, "fetchRecommendationsSuccessHandler");
        C19383o.m32797g(aVar19, "moreFromShopAllItemsClickedHandler");
        C19383o.m32797g(bVar13, "moreFromShopListingClickedHandler");
        C19383o.m32797g(aVar20, "fetchRecommendationsErrorHandler");
        C19383o.m32797g(trackMoreFromShopAnalyticsHandler, "trackMoreFromShopAnalyticsHandler");
        C19383o.m32797g(listingImpressionHandler, "listingImpressionHandler");
        C19383o.m32797g(uVar, "urlClickedHandler");
        C19383o.m32797g(cVar13, "openListingHandler");
        C19383o.m32797g(iVar3, "viewAllReviewsClickedHandler");
        C19383o.m32797g(hVar2, "viewAllPhotoReviewsClickedHandler");
        C19383o.m32797g(jVar2, "viewAllVideoReviewsClickedHandler");
        C19383o.m32797g(bVar14, "reviewCarouselImageClickedHandler");
        C19383o.m32797g(cVar14, "reviewCarouselVideoClickedHandler");
        C19383o.m32797g(reviewTypeTabSelectedHandler, "reviewTypeTabSelectedHandler");
        C19383o.m32797g(dVar8, "reviewClickedHandler");
        C19383o.m32797g(dVar9, "validateListingHandler");
        C19383o.m32797g(showPersonalizationInputErrorHandler, "showPersonalizationInputErrorHandler");
        C19383o.m32797g(cVar15, "showVariationSelectionErrorHandler");
        C19383o.m32797g(aVar21, "scrollToVariationsHandler");
        C19383o.m32797g(cVar16, "scrollToPersonalizationHandler");
        C19383o.m32797g(gVar9, "scrollToReviewsHandler");
        C19383o.m32797g(hVar3, "errorVerifyingListingHapticFeedbackHandler");
        C19383o.m32797g(aVar22, "dialogExpressCheckoutHandler");
        C19383o.m32797g(fetchSingleListingCartHandler, "fetchSingleListingCartHandler");
        C19383o.m32797g(aVar23, "navigateToSingleListingCheckoutHandler");
        C19383o.m32797g(aVar24, "analyticsAdHocEventHandler");
        C19383o.m32797g(jVar3, "grafanaIncrementEventHandler");
        C19383o.m32797g(cVar17, "expressCheckoutButtonClickedHandler");
        C19383o.m32797g(fVar7, "navigateToNativeBuyItNowCheckoutHandler");
        C19383o.m32797g(bVar15, "ineligibleShippingClickedHandler");
        C19383o.m32797g(jVar4, "lottieNudgeVisibilityChangedHandler");
        C19383o.m32797g(aVar25, "lottieAnimationDismissedHandler");
        C19383o.m32797g(mVar2, "networkUnavailableHandler");
        C19383o.m32797g(quantityChangedHandler, "quantityChangedHandler");
        C19383o.m32797g(reviewsPanelClickedHandler, "reviewsPanelClickedHandler");
        C19383o.m32797g(overviewPanelClickedHandler, "overviewPanelClickedHandler");
        C19383o.m32797g(bVar16, "fetchShippingDetailsHandler");
        C19383o.m32797g(bVar17, "estimatedDeliveryAddedHandler");
        C19383o.m32797g(faqsPanelClickedHandler, "faqsPanelClickedHandler");
        C19383o.m32797g(shippingAndPoliciesPanelClickedHandler, "shippingAndPoliciesPanelClickedHandler");
        C19383o.m32797g(shippingUnstructuredPoliciesPanelClickedHandler, "shippingUnstructuredPoliciesPanelClickedHandler");
        C19383o.m32797g(hVar4, "shippingDetailsReceivedHandler");
        C19383o.m32797g(loadRegionsHandler, "loadRegionsHandler");
        C19383o.m32797g(eVar11, "regionsLoadedHandler");
        C19383o.m32797g(oVar, "onHiddenChangedHandler");
        C19383o.m32797g(gVar10, "structuredShippingExpandedHandler");
        C19383o.m32797g(structuredPaymentsExpandedHandler, "structuredPaymentsExpandedHandler");
        C19383o.m32797g(eVar12, "structuredRefundsExpandedHandler");
        C19383o.m32797g(iVar4, "updateShippingDestinationHandler");
        C19383o.m32797g(newShippingDestinationSelectedHandler, "newShippingDestinationSelectedHandler");
        C19383o.m32797g(aVar26, "fetchShippingDetailsFailedHandler");
        C19383o.m32797g(gVar11, "saveNewShippingDestinationHandler");
        C19383o.m32797g(giftWrapAvailableClickedHandler, "giftWrapAvailableClickedHandler");
        C19383o.m32797g(iVar5, "termsAndConditionsClickedHandler");
        C19383o.m32797g(kVar5, "traderDistinctionLinkClickedHandler");
        C19383o.m32797g(seeMoreSellerDetailsClickedHandler, "seeMoreSellerDetailsClickedHandler");
        C19383o.m32797g(bVar18, "reportListingClickedHandler");
        C19383o.m32797g(cVar18, "signInAndReportListingHandler");
        C19383o.m32797g(productWarningInfoClickedHandler, "productWarningInfoClickedHandler");
        C19383o.m32797g(productWarningInfoAnalyticsHandler, "productWarningInfoAnalyticsHandler");
        C19383o.m32797g(nVar3, "sendOfferingDataBreadcrumbHandler");
        C19383o.m32797g(bVar19, "freeShippingUrlClickedHandler");
        C19383o.m32797g(aVar27, "logOverviewPanelVisibleHandler");
        C19383o.m32797g(jVar5, "listingImagesViewPagerBoundHandler");
        C19383o.m32797g(hVar5, "populateAnalyticsShopIdHandler");
        C19383o.m32797g(readItemDescriptionClickedHandler, "readItemDescriptionClickedHandler");
        C19383o.m32797g(aVar28, "conversationSentHandler");
        C19383o.m32797g(fVar8, "reviewsSummaryClickedHandler");
        C19383o.m32797g(aVar29, "navigateToShopReviewsHandler");
        this.f29772a = aVar30;
        this.f29776b = cVar19;
        this.f29780c = qVar2;
        this.f29784d = sVar2;
        this.f29788e = mVar3;
        this.f29792f = cVar20;
        this.f29796g = iVar6;
        this.f29800h = kVar6;
        this.f29804i = cVar21;
        this.f29808j = aVar31;
        this.f29812k = eVar13;
        this.f29816l = fVar9;
        this.f29820m = gVar12;
        this.f29824n = kVar7;
        this.f29828o = gVar2;
        this.f29832p = iVar2;
        this.f29836q = itemDetailsPanelClickedHandler;
        this.f29840r = aVar3;
        this.f29844s = contentMachineTranslationToggleHandler;
        this.f29848t = fetchContentMachineTranslationHandler;
        this.f29852u = dVar;
        this.f29856v = bVar;
        this.f29860w = updateContentMachineTranslationHandler;
        this.f29864x = errorUpdatingContentMachineTranslationHandler;
        this.f29868y = bVar2;
        this.f29872z = faqMachineTranslationToggleHandler;
        this.f29684A = fetchFaqMachineTranslationHandler;
        this.f29688B = successfulFaqMachineTranslationFetchHandler;
        this.f29692C = faqMachineTranslationLoadingHandler;
        this.f29696D = errorUpdatingFaqMachineTranslationHandler;
        this.f29700E = translateReviewClickedHandler;
        this.f29704F = cVar4;
        this.f29708G = bVar3;
        this.f29712H = updateReviewMachineTranslationHandler;
        this.f29716I = clearTranslationListHandler;
        this.f29720J = personalizationOptionalTextChangedHandler;
        this.f29724K = personalizationRequiredTextChangedHandler;
        this.f29727L = gVar3;
        this.f29730M = personalizationOptionalToggledHandler;
        this.f29733N = personalizationRequiredToggledHandler;
        this.f29736O = aVar4;
        this.f29739P = bVar4;
        this.f29742Q = cVar5;
        this.f29745R = imageSelectedHandler;
        this.f29748S = fVar2;
        this.f29751T = bVar5;
        this.f29754U = cVar6;
        this.f29757V = nVar;
        this.f29760W = lVar;
        this.f29763X = listingImageGalleryResultReceivedHandler;
        this.f29766Y = titleClickedHandler;
        this.f29769Z = bVar6;
        this.f29773a0 = eVar2;
        this.f29777b0 = aVar5;
        this.f29781c0 = gVar4;
        this.f29785d0 = starSellerBadgeTappedHandler;
        this.f29789e0 = starSellerBadgeViewedHandler;
        this.f29793f0 = bVar7;
        this.f29797g0 = addToCartNetworkHandler;
        this.f29801h0 = showCartButtonHandler;
        this.f29805i0 = kVar3;
        this.f29809j0 = eVar3;
        this.f29813k0 = aVar6;
        this.f29817l0 = gVar5;
        this.f29821m0 = showViewInCartButtonHandler;
        this.f29825n0 = nVar2;
        this.f29829o0 = pVar;
        this.f29833p0 = jVar;
        this.f29837q0 = dVar2;
        this.f29841r0 = eVar4;
        this.f29845s0 = gVar6;
        this.f29849t0 = aVar7;
        this.f29853u0 = eVar5;
        this.f29857v0 = cVar7;
        this.f29861w0 = aVar8;
        this.f29865x0 = cVar8;
        this.f29869y0 = bVar8;
        this.f29873z0 = eVar6;
        this.f29685A0 = bVar9;
        this.f29689B0 = dVar3;
        this.f29693C0 = gVar7;
        this.f29697D0 = markListingAsFavoriteHandler;
        this.f29701E0 = eVar7;
        this.f29705F0 = fVar3;
        this.f29709G0 = kVar4;
        this.f29713H0 = lVar2;
        this.f29717I0 = animateFavoriteChangeHandler;
        this.f29721J0 = aVar9;
        this.f29725K0 = bVar10;
        this.f29728L0 = hVar;
        this.f29731M0 = dVar4;
        this.f29734N0 = aVar10;
        this.f29737O0 = fVar4;
        this.f29740P0 = aVar11;
        this.f29743Q0 = aVar12;
        this.f29746R0 = aVar13;
        this.f29749S0 = bVar11;
        this.f29752T0 = dVar5;
        this.f29755U0 = aVar14;
        this.f29758V0 = cVar9;
        this.f29761W0 = dVar6;
        this.f29764X0 = estimatedDeliveryClickedHandler;
        this.f29767Y0 = eVar8;
        this.f29770Z0 = eVar9;
        this.f29774a1 = fVar5;
        this.f29778b1 = aVar15;
        this.f29782c1 = aVar16;
        this.f29786d1 = cVar10;
        this.f29790e1 = variationSelectionSheetDismissedHandler;
        this.f29794f1 = gVar8;
        this.f29798g1 = aVar17;
        this.f29802h1 = eVar10;
        this.f29806i1 = cVar11;
        this.f29810j1 = fVar6;
        this.f29814k1 = updateFirstVariationFromInventoryUiHandler;
        this.f29818l1 = updateSecondVariationFromInventoryUiHandler;
        this.f29822m1 = fetchVariationOfferingHandler;
        this.f29826n1 = bVar12;
        this.f29830o1 = dVar7;
        this.f29834p1 = showPriceLoadingHandler;
        this.f29838q1 = hidePriceLoadingHandler;
        this.f29842r1 = aVar18;
        this.f29846s1 = fetchRecommendationsIfNeededHandler;
        this.f29850t1 = cVar12;
        this.f29854u1 = aVar19;
        this.f29858v1 = bVar13;
        this.f29862w1 = aVar20;
        this.f29866x1 = trackMoreFromShopAnalyticsHandler;
        this.f29870y1 = listingImpressionHandler;
        this.f29874z1 = uVar;
        this.f29686A1 = cVar13;
        this.f29690B1 = iVar3;
        this.f29694C1 = hVar2;
        this.f29698D1 = jVar2;
        this.f29702E1 = bVar14;
        this.f29706F1 = cVar14;
        this.f29710G1 = reviewTypeTabSelectedHandler;
        this.f29714H1 = dVar8;
        this.f29718I1 = dVar9;
        this.f29722J1 = showPersonalizationInputErrorHandler;
        this.f29726K1 = cVar15;
        this.f29729L1 = aVar21;
        this.f29732M1 = cVar16;
        this.f29735N1 = gVar9;
        this.f29738O1 = hVar3;
        this.f29741P1 = aVar22;
        this.f29744Q1 = fetchSingleListingCartHandler;
        this.f29747R1 = aVar23;
        this.f29750S1 = aVar24;
        this.f29753T1 = jVar3;
        this.f29756U1 = cVar17;
        this.f29759V1 = fVar7;
        this.f29762W1 = bVar15;
        this.f29765X1 = jVar4;
        this.f29768Y1 = aVar25;
        this.f29771Z1 = mVar2;
        this.f29775a2 = quantityChangedHandler;
        this.f29779b2 = reviewsPanelClickedHandler;
        this.f29783c2 = overviewPanelClickedHandler;
        this.f29787d2 = bVar16;
        this.f29791e2 = bVar17;
        this.f29795f2 = faqsPanelClickedHandler;
        this.f29799g2 = shippingAndPoliciesPanelClickedHandler;
        this.f29803h2 = shippingUnstructuredPoliciesPanelClickedHandler;
        this.f29807i2 = hVar4;
        this.f29811j2 = loadRegionsHandler;
        this.f29815k2 = eVar11;
        this.f29819l2 = oVar;
        this.f29823m2 = gVar10;
        this.f29827n2 = structuredPaymentsExpandedHandler;
        this.f29831o2 = eVar12;
        this.f29835p2 = iVar4;
        this.f29839q2 = newShippingDestinationSelectedHandler;
        this.f29843r2 = aVar26;
        this.f29847s2 = gVar11;
        this.f29851t2 = giftWrapAvailableClickedHandler;
        this.f29855u2 = iVar5;
        this.f29859v2 = kVar5;
        this.f29863w2 = seeMoreSellerDetailsClickedHandler;
        this.f29867x2 = bVar18;
        this.f29871y2 = cVar18;
        this.f29875z2 = productWarningInfoClickedHandler;
        this.f29687A2 = productWarningInfoAnalyticsHandler;
        this.f29691B2 = nVar3;
        this.f29695C2 = bVar19;
        this.f29699D2 = aVar27;
        this.f29703E2 = jVar5;
        this.f29707F2 = hVar5;
        this.f29711G2 = readItemDescriptionClickedHandler;
        this.f29715H2 = aVar28;
        this.f29719I2 = fVar8;
        this.f29723J2 = aVar29;
    }

    /* renamed from: a */
    public final C13574d mo46297a(ListingViewState.C10092d dVar, C13597g gVar) {
        C13574d hVar;
        ListingImage listingImage;
        if (gVar instanceof C13597g.C13714q3) {
            C13597g.C13714q3 q3Var = (C13597g.C13714q3) gVar;
            this.f29792f.getClass();
            C19383o.m32797g(q3Var, "event");
            return new C13574d.C13576b.C13589m(q3Var.f30228a, q3Var.f30229b);
        }
        boolean z = false;
        if (gVar instanceof C13597g.C13691n1) {
            C13597g.C13691n1 n1Var = (C13597g.C13691n1) gVar;
            this.f29828o.getClass();
            C19383o.m32797g(n1Var, "event");
            boolean z2 = n1Var.f30193a == ListingViewState.ImageVisibility.VISIBLE;
            if (z2 == dVar.f22237e) {
                return C13574d.C13575a.f29662a;
            }
            hVar = new C13574d.C13594c(ListingViewState.C10092d.m18242e(dVar, z2, (C10409f) null, (GooglePayData) null, (AppsInventoryAddToCartContext) null, (C10425l) null, false, 1019));
        } else {
            String str = null;
            if (gVar instanceof C13597g.C13703p) {
                C10169i iVar = this.f29832p;
                C13597g.C13703p pVar = (C13597g.C13703p) gVar;
                iVar.getClass();
                C19383o.m32797g(pVar, "event");
                ArrayList m = dVar.mo33485m();
                if (iVar.f22340a.mo33537a()) {
                    Iterator it = m.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (((C10423j) it.next()) instanceof ItemDetailsPanel) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1 && pVar.f30214b >= i) {
                        iVar.f22341b.mo38043a(new C13597g.C13732t0(0));
                    }
                } else {
                    Iterator it2 = m.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (((C10423j) it2.next()) instanceof C10518b) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 != -1 && pVar.f30214b >= i2) {
                        iVar.f22341b.mo38043a(new C13597g.C13732t0(0));
                    }
                }
                Iterator it3 = m.iterator();
                int i3 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (((C10423j) it3.next()) instanceof C10266c) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    Object obj = m.get(i3);
                    C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.ui.listing.ui.buybox.lottienudge.LottieNudge");
                    C10266c cVar = (C10266c) obj;
                    if (i3 >= pVar.f30213a && i3 <= pVar.f30214b) {
                        z = true;
                    }
                    if (z != cVar.f22556c) {
                        iVar.f22341b.mo38043a(new C13597g.C13767y1(z));
                    }
                }
                C10423j jVar = (C10423j) C19327t.m32641W0(pVar.f30214b, m);
                if (jVar instanceof C10455c) {
                    iVar.f22341b.mo38043a(C13597g.C13750v4.f30278a);
                } else if (jVar instanceof C10621a) {
                    iVar.f22341b.mo38043a(C13597g.C13764x4.f30295a);
                }
                return C13574d.C13575a.f29662a;
            } else if (gVar instanceof C13597g.C13712q1) {
                return this.f29836q.mo34081a(dVar, (C13597g.C13712q1) gVar);
            } else {
                if (gVar instanceof C13597g.C13724s) {
                    C10506a aVar = this.f29840r;
                    aVar.getClass();
                    if (C19383o.m32792b(dVar.f22238f.f22803f.f22848f.f23020l, dVar.f22242j.f22899g)) {
                        aVar.f23055a.mo38043a(new C13597g.C13642g1("machine_translation.listings.translate"));
                    } else {
                        aVar.f23055a.mo38043a(new C13597g.C13642g1("machine_translation.listings.untranslate"));
                    }
                    if (dVar.f22242j.f22894b) {
                        aVar.f23055a.mo38043a(C13597g.C13738u.f30261a);
                    } else {
                        aVar.f23055a.mo38043a(C13597g.C13711q0.f30225a);
                    }
                    return C13574d.C13575a.f29662a;
                } else if (gVar instanceof C13597g.C13738u) {
                    return this.f29844s.mo34065a(dVar);
                } else {
                    if (gVar instanceof C13597g.C13711q0) {
                        return this.f29848t.mo34077a(dVar);
                    }
                    if (gVar instanceof C13597g.C13708p4) {
                        C10510d dVar2 = this.f29852u;
                        C13597g.C13708p4 p4Var = (C13597g.C13708p4) gVar;
                        dVar2.getClass();
                        C19383o.m32797g(p4Var, "event");
                        C11786n nVar = dVar2.f23058a;
                        String title = p4Var.f30221a.getTitle();
                        nVar.getClass();
                        String valueOf = String.valueOf(C18263b.m30818M(title));
                        C11786n nVar2 = dVar2.f23058a;
                        String description = p4Var.f30221a.getDescription();
                        nVar2.getClass();
                        dVar2.f23059b.mo38043a(new C13597g.C13618c5(valueOf, String.valueOf(C18263b.m30818M(description))));
                        dVar2.f23059b.mo38043a(C13597g.C13738u.f30261a);
                        return C13574d.C13575a.f29662a;
                    } else if (gVar instanceof C13597g.C13731t) {
                        return this.f29856v.mo34092a((C13597g.C13731t) gVar, dVar);
                    } else {
                        if (gVar instanceof C13597g.C13618c5) {
                            this.f29860w.getClass();
                            return UpdateContentMachineTranslationHandler.m18477a(dVar, (C13597g.C13618c5) gVar);
                        } else if (gVar instanceof C13597g.C13765y) {
                            return this.f29864x.mo34072a(dVar);
                        } else {
                            if (gVar instanceof C13597g.C13655i0) {
                                C10478b bVar = this.f29868y;
                                bVar.getClass();
                                if (dVar.f22242j.f22901i) {
                                    bVar.f23005a.mo38043a(C13597g.C13669k0.f30162a);
                                } else {
                                    bVar.f23005a.mo38043a(C13597g.C13718r0.f30234a);
                                }
                                return C13574d.C13575a.f29662a;
                            } else if (gVar instanceof C13597g.C13669k0) {
                                this.f29872z.getClass();
                                return FaqMachineTranslationToggleHandler.m18457a(dVar);
                            } else if (gVar instanceof C13597g.C13718r0) {
                                return this.f29684A.mo34043a(dVar);
                            } else {
                                if (gVar instanceof C13597g.C13715q4) {
                                    this.f29688B.getClass();
                                    return SuccessfulFaqMachineTranslationFetchHandler.m18461a(dVar, (C13597g.C13715q4) gVar);
                                } else if (gVar instanceof C13597g.C13662j0) {
                                    this.f29692C.getClass();
                                    return FaqMachineTranslationLoadingHandler.m18456a(dVar, (C13597g.C13662j0) gVar);
                                } else if (gVar instanceof C13597g.C13771z) {
                                    this.f29696D.getClass();
                                    return ErrorUpdatingFaqMachineTranslationHandler.m18455a(dVar);
                                } else if (gVar instanceof C13597g.C13611b5) {
                                    return this.f29700E.mo34126a(dVar, (C13597g.C13611b5) gVar);
                                } else {
                                    if (gVar instanceof C13597g.C13722r4) {
                                        C10546c cVar2 = this.f29704F;
                                        C13597g.C13722r4 r4Var = (C13597g.C13722r4) gVar;
                                        cVar2.getClass();
                                        C19383o.m32797g(r4Var, "event");
                                        MachineTranslationViewState machineTranslationViewState = r4Var.f30241c;
                                        machineTranslationViewState.setTranslated();
                                        cVar2.f23117a.mo38043a(new C13597g.C13653h5(r4Var.f30239a, r4Var.f30240b, machineTranslationViewState));
                                        return C13574d.C13575a.f29662a;
                                    } else if (gVar instanceof C13597g.C13606b0) {
                                        C10545b bVar2 = this.f29708G;
                                        C13597g.C13606b0 b0Var = (C13597g.C13606b0) gVar;
                                        bVar2.getClass();
                                        C19383o.m32797g(b0Var, "event");
                                        MachineTranslationViewState machineTranslationViewState2 = b0Var.f30078b;
                                        machineTranslationViewState2.setTranslationFailed();
                                        bVar2.f23116a.mo38043a(new C13597g.C13653h5(b0Var.f30077a, "", machineTranslationViewState2));
                                        return C13574d.C13575a.f29662a;
                                    } else if (gVar instanceof C13597g.C13653h5) {
                                        this.f29712H.getClass();
                                        return UpdateReviewMachineTranslationHandler.m18509a(dVar, (C13597g.C13653h5) gVar);
                                    } else if (gVar instanceof C13597g.C13689n) {
                                        this.f29716I.getClass();
                                        return ClearTranslationListHandler.m18506a(dVar);
                                    } else if (gVar instanceof C13597g.C13713q2) {
                                        this.f29720J.getClass();
                                        return PersonalizationOptionalTextChangedHandler.m18342a(dVar, (C13597g.C13713q2) gVar);
                                    } else if (gVar instanceof C13597g.C13727s2) {
                                        this.f29724K.getClass();
                                        return PersonalizationRequiredTextChangedHandler.m18348a(dVar, (C13597g.C13727s2) gVar);
                                    } else if (gVar instanceof C13597g.C13658i3) {
                                        C10190a aVar2 = this.f29736O;
                                        aVar2.getClass();
                                        aVar2.f22354a.mo38043a(new C13597g.C13642g1("listing_page.screenshot.user_took_screenshot"));
                                        if (!C18263b.m30839d0(dVar.f22239g.getListing().getUrl())) {
                                            return C13574d.C13575a.f29662a;
                                        }
                                        String url = dVar.f22239g.getListing().getUrl();
                                        C19383o.m32794d(url);
                                        List<ListingImage> listingImages = dVar.f22239g.getListingImages();
                                        if (!(listingImages == null || (listingImage = (ListingImage) C19327t.m32640V0(listingImages)) == null)) {
                                            str = listingImage.getUrl570xN();
                                        }
                                        hVar = new C13574d.C13576b.C13590n(url, str);
                                    } else if (gVar instanceof C13597g.C13665j3) {
                                        C10191b bVar3 = this.f29739P;
                                        C13597g.C13665j3 j3Var = (C13597g.C13665j3) gVar;
                                        bVar3.getClass();
                                        C19383o.m32797g(j3Var, "event");
                                        Throwable th = j3Var.f30158a;
                                        if (th instanceof SecurityException) {
                                            bVar3.f22355a.mo38043a(new C13597g.C13642g1("listing_page.screenshot.read_external_storage_permission_not_granted"));
                                            return C13574d.C13575a.f29662a;
                                        }
                                        bVar3.f22356b.mo21306a(th.getMessage());
                                        return C13574d.C13575a.f29662a;
                                    } else if (gVar instanceof C13597g.C13721r3) {
                                        C10192c cVar3 = this.f29742Q;
                                        C13597g.C13721r3 r3Var = (C13597g.C13721r3) gVar;
                                        cVar3.getClass();
                                        C19383o.m32797g(r3Var, "event");
                                        cVar3.f22357a.mo38043a(new C13597g.C13642g1("listing_page.screenshot.user_shared_screenshot"));
                                        return new C13574d.C13576b.C13589m(r3Var.f30237a, r3Var.f30238b);
                                    } else if (gVar instanceof C13597g.C13677l1) {
                                        this.f29745R.getClass();
                                        return ImageSelectedHandler.m18428a(dVar, (C13597g.C13677l1) gVar);
                                    } else if (gVar instanceof C13597g.C13684m1) {
                                        return this.f29748S.mo33980a(dVar, (C13597g.C13684m1) gVar);
                                    } else {
                                        if (gVar instanceof C13597g.C13663j1) {
                                            C10428b bVar4 = this.f29751T;
                                            bVar4.f22904a.mo38043a(new C13597g.C13633f("listing_photo_clicked"));
                                            bVar4.f22904a.mo38043a(new C13597g.C13633f("photo_double_tapped"));
                                            bVar4.f22904a.mo38043a(new C13597g.C13661j(false));
                                            return C13574d.C13575a.f29662a;
                                        } else if (gVar instanceof C13597g.C13670k1) {
                                            C13597g.C13670k1 k1Var = (C13597g.C13670k1) gVar;
                                            this.f29754U.getClass();
                                            C19383o.m32797g(k1Var, "event");
                                            if (k1Var.f30163a != 2) {
                                                return C13574d.C13575a.f29662a;
                                            }
                                            hVar = new C13574d.C13576b.C13577a("listing_image_swipe", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(dVar.mo33477f()))));
                                        } else if (gVar instanceof C13597g.C13758w5) {
                                            C10446n nVar3 = this.f29757V;
                                            C13597g.C13758w5 w5Var = (C13597g.C13758w5) gVar;
                                            nVar3.getClass();
                                            C19383o.m32797g(w5Var, "event");
                                            nVar3.f22912a.mo38043a(new C13597g.C13633f("visually_similar_button_tapped", C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.BUTTON_PLACEMENT, "listing_screen"))));
                                            LandingPageLink landingPageLink = new LandingPageLink();
                                            landingPageLink.setApiPath(w5Var.f30286a);
                                            landingPageLink.setPageTitle(nVar3.f22913b.mo38059c(R.string.visually_similar_page_title, new Object[0]));
                                            landingPageLink.setPaginateForNext(true);
                                            landingPageLink.setPageType("page");
                                            hVar = new C13574d.C13576b.C13585i(new LandingPageKey(dVar.mo33467b(), landingPageLink, (Bundle) null, 4, (DefaultConstructorMarker) null));
                                        } else if (gVar instanceof C13597g.C13723r5) {
                                            this.f29760W.getClass();
                                            return C10443l.m18433a((C13597g.C13723r5) gVar);
                                        } else if (gVar instanceof C13597g.C13726s1) {
                                            this.f29763X.getClass();
                                            return ListingImageGalleryResultReceivedHandler.m18429a(dVar, (C13597g.C13726s1) gVar);
                                        } else if (gVar instanceof C13597g.C13696o) {
                                            this.f29727L.getClass();
                                            return C13574d.C13576b.C13580d.f29668a;
                                        } else if (gVar instanceof C13597g.C13720r2) {
                                            return this.f29730M.mo33650a(dVar);
                                        } else {
                                            if (gVar instanceof C13597g.C13734t2) {
                                                return this.f29733N.mo33659a(dVar);
                                            }
                                            if (gVar instanceof C13597g.C13736t4) {
                                                this.f29766Y.getClass();
                                                return TitleClickedHandler.m18365a(dVar);
                                            } else if (gVar instanceof C13597g.C13756w3) {
                                                return this.f29769Z.mo34289a();
                                            } else {
                                                if (gVar instanceof C13597g.C13692n2) {
                                                    this.f29773a0.getClass();
                                                    return C13817e.m21368a(dVar, (C13597g.C13692n2) gVar);
                                                } else if (gVar instanceof C13597g.C13699o2) {
                                                    this.f29777b0.getClass();
                                                    return C10642a.m18566a(dVar, (C13597g.C13699o2) gVar);
                                                } else if (gVar instanceof C13597g.C13700o3) {
                                                    this.f29781c0.getClass();
                                                    return C13820g.m21369a(dVar, (C13597g.C13700o3) gVar);
                                                } else if (gVar instanceof C13597g.C13666j4) {
                                                    return this.f29785d0.mo34283a(dVar);
                                                } else {
                                                    if (gVar instanceof C13597g.C13673k4) {
                                                        return this.f29789e0.mo34286a(dVar);
                                                    }
                                                    if (gVar instanceof C13597g.C13675l) {
                                                        return this.f29770Z0.mo33618a((C13597g.C13675l) gVar);
                                                    }
                                                    if (gVar instanceof C13597g.C13682m) {
                                                        return this.f29774a1.mo33619a((C13597g.C13682m) gVar);
                                                    }
                                                    if (gVar instanceof C13597g.C13605b) {
                                                        return this.f29793f0.mo33616a(dVar, (C13597g.C13605b) gVar);
                                                    }
                                                    if (gVar instanceof C13597g.C13598a) {
                                                        return this.f29778b1.mo33615a((C13597g.C13598a) gVar);
                                                    }
                                                    if (gVar instanceof C13597g.C13626e) {
                                                        return this.f29797g0.mo33605a(dVar, (C13597g.C13626e) gVar);
                                                    }
                                                    if (gVar instanceof C13597g.C13763x3) {
                                                        this.f29809j0.getClass();
                                                        return C10204e.m18288a(dVar, (C13597g.C13763x3) gVar);
                                                    } else if (gVar instanceof C13597g.C13619d) {
                                                        this.f29813k0.getClass();
                                                        return C10199a.m18287a(dVar);
                                                    } else if (gVar instanceof C13597g.C13759x) {
                                                        return this.f29817l0.mo33620a();
                                                    } else {
                                                        if (gVar instanceof C13597g.C13719r1) {
                                                            this.f29805i0.getClass();
                                                            return C10241k.m18315a(dVar);
                                                        } else if (gVar instanceof C13597g.C13769y3) {
                                                            return this.f29801h0.mo33608a(dVar);
                                                        } else {
                                                            if (gVar instanceof C13597g.C13624d4) {
                                                                this.f29821m0.getClass();
                                                                return ShowViewInCartButtonHandler.m18306a(dVar);
                                                            } else if (gVar instanceof C13597g.C13680l4) {
                                                                this.f29825n0.getClass();
                                                                return C10246n.m18316a(dVar);
                                                            } else if (gVar instanceof C13597g.C13751v5) {
                                                                this.f29829o0.getClass();
                                                                return C10249p.m18317a(dVar);
                                                            } else if (gVar instanceof C13597g.C13612c) {
                                                                return this.f29857v0.mo33617a();
                                                            } else {
                                                                if (gVar instanceof C13597g.C13641g0) {
                                                                    return this.f29833p0.mo33622a(dVar);
                                                                }
                                                                if (gVar instanceof C13597g.C13743u4) {
                                                                    return this.f29837q0.mo46722a();
                                                                }
                                                                if (gVar instanceof C13597g.C13757w4) {
                                                                    this.f29841r0.getClass();
                                                                    return C12938e.m20640a(dVar);
                                                                } else if (gVar instanceof C13597g.C13776z4) {
                                                                    this.f29845s0.getClass();
                                                                    return C13910g.m21424a(dVar);
                                                                } else if (gVar instanceof C13597g.C13648h0) {
                                                                    return this.f29849t0.mo46721a(dVar);
                                                                } else {
                                                                    if (gVar instanceof C13597g.C13770y4) {
                                                                        this.f29853u0.getClass();
                                                                        hVar = new C13574d.C13576b.C13584h(dVar.mo33477f());
                                                                    } else if (gVar instanceof C13597g.C13627e0) {
                                                                        return this.f29764X0.mo33624a(dVar, (C13597g.C13627e0) gVar);
                                                                    } else {
                                                                        if (gVar instanceof C13597g.C13668k) {
                                                                            this.f29767Y0.getClass();
                                                                            return C10163e.m18277a(dVar);
                                                                        } else if (gVar instanceof C13597g.C13685m2) {
                                                                            this.f29686A1.getClass();
                                                                            return C13814c.m21367a(dVar, (C13597g.C13685m2) gVar);
                                                                        } else if (gVar instanceof C13597g.C13737t5) {
                                                                            return this.f29690B1.mo34121a(dVar, (C13597g.C13737t5) gVar);
                                                                        } else {
                                                                            if (gVar instanceof C13597g.C13730s5) {
                                                                                return this.f29694C1.mo34120a(dVar, (C13597g.C13730s5) gVar);
                                                                            }
                                                                            if (gVar instanceof C13597g.C13744u5) {
                                                                                return this.f29698D1.mo34122a(dVar, (C13597g.C13744u5) gVar);
                                                                            }
                                                                            if (gVar instanceof C13597g.C13609b3) {
                                                                                return this.f29702E1.mo34115a(dVar, (C13597g.C13609b3) gVar);
                                                                            }
                                                                            if (gVar instanceof C13597g.C13616c3) {
                                                                                return this.f29706F1.mo34116a(dVar, (C13597g.C13616c3) gVar);
                                                                            }
                                                                            if (gVar instanceof C13597g.C13630e3) {
                                                                                this.f29710G1.getClass();
                                                                                return ReviewTypeTabSelectedHandler.m18495a(dVar, (C13597g.C13630e3) gVar);
                                                                            } else if (gVar instanceof C13597g.C13623d3) {
                                                                                return this.f29714H1.mo34117a(dVar, (C13597g.C13623d3) gVar);
                                                                            } else {
                                                                                if (gVar instanceof C13597g.C13681l5) {
                                                                                    this.f29874z1.getClass();
                                                                                    return C10186u.m18280a(dVar, (C13597g.C13681l5) gVar);
                                                                                } else if (gVar instanceof C13597g.C13688m5) {
                                                                                    return this.f29718I1.mo33706a(dVar, (C13597g.C13688m5) gVar);
                                                                                } else {
                                                                                    if (gVar instanceof C13597g.C13775z3) {
                                                                                        return this.f29722J1.mo33662a(dVar, (C13597g.C13775z3) gVar);
                                                                                    }
                                                                                    if (gVar instanceof C13597g.C13617c4) {
                                                                                        return this.f29726K1.mo33705a(dVar);
                                                                                    }
                                                                                    if (gVar instanceof C13597g.C13686m3) {
                                                                                        this.f29729L1.getClass();
                                                                                        return C10319a.m18370a(dVar);
                                                                                    } else if (gVar instanceof C13597g.C13672k3) {
                                                                                        this.f29732M1.getClass();
                                                                                        return C12935c.m20639a(dVar);
                                                                                    } else if (gVar instanceof C13597g.C13679l3) {
                                                                                        return this.f29735N1.mo34119a(dVar);
                                                                                    } else {
                                                                                        if (gVar instanceof C13597g.C13613c0) {
                                                                                            return this.f29738O1.mo33621a();
                                                                                        }
                                                                                        if (gVar instanceof C13597g.C13752w) {
                                                                                            C10214a aVar3 = this.f29741P1;
                                                                                            SingleListingCart singleListingCart = ((C13597g.C13752w) gVar).f30280a;
                                                                                            aVar3.getClass();
                                                                                            return C10214a.m18294a(dVar, singleListingCart);
                                                                                        } else if (gVar instanceof C13597g.C13760x0) {
                                                                                            return this.f29744Q1.mo33595a(dVar, (C13597g.C13760x0) gVar);
                                                                                        } else {
                                                                                            if (gVar instanceof C13597g.C13636f2) {
                                                                                                this.f29747R1.getClass();
                                                                                                return C12785a.m20421a(dVar, (C13597g.C13636f2) gVar);
                                                                                            } else if (gVar instanceof C13597g.C13633f) {
                                                                                                this.f29750S1.getClass();
                                                                                                return C10157a.m18276a((C13597g.C13633f) gVar);
                                                                                            } else if (gVar instanceof C13597g.C13642g1) {
                                                                                                return this.f29753T1.mo33539a((C13597g.C13642g1) gVar);
                                                                                            } else {
                                                                                                if (gVar instanceof C13597g.C13634f0) {
                                                                                                    return this.f29756U1.mo33598a(dVar, (C13597g.C13634f0) gVar);
                                                                                                }
                                                                                                if (gVar instanceof C13597g.C13622d2) {
                                                                                                    this.f29759V1.getClass();
                                                                                                    return C10220f.m18296a(dVar, (C13597g.C13622d2) gVar);
                                                                                                } else if (gVar instanceof C13597g.C13698o1) {
                                                                                                    this.f29762W1.getClass();
                                                                                                    return C12813b.m20450a(dVar);
                                                                                                } else if (gVar instanceof C13597g.C13767y1) {
                                                                                                    this.f29765X1.getClass();
                                                                                                    return C10274j.m18336a(dVar, (C13597g.C13767y1) gVar);
                                                                                                } else if (gVar instanceof C13597g.C13761x1) {
                                                                                                    this.f29768Y1.getClass();
                                                                                                    return C10263a.m18330a(dVar);
                                                                                                } else if (gVar instanceof C13597g.C13610b4) {
                                                                                                    this.f29782c1.getClass();
                                                                                                    return C10322a.m18372a(dVar, (C13597g.C13610b4) gVar);
                                                                                                } else if (gVar instanceof C13597g.C13709p5) {
                                                                                                    return this.f29786d1.mo33704a(dVar, (C13597g.C13709p5) gVar);
                                                                                                } else {
                                                                                                    if (gVar instanceof C13597g.C13716q5) {
                                                                                                        this.f29790e1.getClass();
                                                                                                        return VariationSelectionSheetDismissedHandler.m18371a(dVar, (C13597g.C13716q5) gVar);
                                                                                                    } else if (gVar instanceof C13597g.C13702o5) {
                                                                                                        return this.f29794f1.mo33738a((C13597g.C13702o5) gVar);
                                                                                                    } else {
                                                                                                        if (gVar instanceof C13597g.C13632e5) {
                                                                                                            this.f29798g1.getClass();
                                                                                                            return C10354a.m18397a(dVar, (C13597g.C13632e5) gVar);
                                                                                                        } else if (gVar instanceof C13597g.C13667j5) {
                                                                                                            this.f29802h1.getClass();
                                                                                                            return C10360e.m18399a(dVar, (C13597g.C13667j5) gVar);
                                                                                                        } else if (gVar instanceof C13597g.C13646g5) {
                                                                                                            this.f29806i1.getClass();
                                                                                                            return C10357c.m18398a((C13597g.C13646g5) gVar, dVar);
                                                                                                        } else if (gVar instanceof C13597g.C13695n5) {
                                                                                                            return this.f29810j1.mo33725a(dVar, (C13597g.C13695n5) gVar);
                                                                                                        } else {
                                                                                                            if (gVar instanceof C13597g.C13625d5) {
                                                                                                                this.f29814k1.getClass();
                                                                                                                return UpdateFirstVariationFromInventoryUiHandler.m18385a(dVar, (C13597g.C13625d5) gVar);
                                                                                                            } else if (gVar instanceof C13597g.C13660i5) {
                                                                                                                this.f29818l1.getClass();
                                                                                                                return UpdateSecondVariationFromInventoryUiHandler.m18386a(dVar, (C13597g.C13660i5) gVar);
                                                                                                            } else if (gVar instanceof C13597g.C13766y0) {
                                                                                                                return this.f29822m1.mo33713a(dVar);
                                                                                                            } else {
                                                                                                                if (gVar instanceof C13597g.C13705p1) {
                                                                                                                    return this.f29826n1.mo33723a((C13597g.C13705p1) gVar);
                                                                                                                }
                                                                                                                if (gVar instanceof C13597g.C13599a0) {
                                                                                                                    return this.f29842r1.mo33722a((C13597g.C13599a0) gVar);
                                                                                                                }
                                                                                                                if (gVar instanceof C13597g.C13732t0) {
                                                                                                                    return this.f29846s1.mo34259a(dVar, (C13597g.C13732t0) gVar);
                                                                                                                }
                                                                                                                if (gVar instanceof C13597g.C13725s0) {
                                                                                                                    this.f29862w1.getClass();
                                                                                                                    return C10626a.m18557a(dVar);
                                                                                                                } else if (gVar instanceof C13597g.C13739u0) {
                                                                                                                    this.f29850t1.getClass();
                                                                                                                    return C10629c.m18558a(dVar, (C13597g.C13739u0) gVar);
                                                                                                                } else if (gVar instanceof C13597g.C13750v4) {
                                                                                                                    return this.f29866x1.mo33991a(dVar);
                                                                                                                } else {
                                                                                                                    if (gVar instanceof C13597g.C13608b2) {
                                                                                                                        return this.f29854u1.mo33989a((C13597g.C13608b2) gVar);
                                                                                                                    }
                                                                                                                    if (gVar instanceof C13597g.C13615c2) {
                                                                                                                        return this.f29858v1.mo34003a((C13597g.C13615c2) gVar);
                                                                                                                    }
                                                                                                                    if (gVar instanceof C13597g.C13740u1) {
                                                                                                                        return this.f29870y1.mo34264a(dVar, (C13597g.C13740u1) gVar);
                                                                                                                    }
                                                                                                                    if (gVar instanceof C13597g.C13649h1) {
                                                                                                                        this.f29728L0.getClass();
                                                                                                                        return C10130h.m18268a(dVar, (C13597g.C13649h1) gVar);
                                                                                                                    } else if (gVar instanceof C13597g.C13647h) {
                                                                                                                        return this.f29685A0.mo33524a(dVar, (C13597g.C13647h) gVar);
                                                                                                                    } else {
                                                                                                                        if (gVar instanceof C13597g.C13661j) {
                                                                                                                            return this.f29689B0.mo33526a(dVar, (C13597g.C13661j) gVar);
                                                                                                                        }
                                                                                                                        if (gVar instanceof C13597g.C13697o0) {
                                                                                                                            return this.f29693C0.mo33529a();
                                                                                                                        }
                                                                                                                        if (gVar instanceof C13597g.C13773z1) {
                                                                                                                            this.f29697D0.getClass();
                                                                                                                            return MarkListingAsFavoriteHandler.m18261a(dVar, (C13597g.C13773z1) gVar);
                                                                                                                        } else if (gVar instanceof C13597g.C13683m0) {
                                                                                                                            return this.f29705F0.mo33528a((C13597g.C13683m0) gVar);
                                                                                                                        } else {
                                                                                                                            if (gVar instanceof C13597g.C13671k2) {
                                                                                                                                return this.f29709G0.mo33530a((C13597g.C13671k2) gVar);
                                                                                                                            }
                                                                                                                            if (gVar instanceof C13597g.C13678l2) {
                                                                                                                                return this.f29713H0.mo33531a((C13597g.C13678l2) gVar);
                                                                                                                            }
                                                                                                                            if (gVar instanceof C13597g.C13690n0) {
                                                                                                                                return this.f29701E0.mo33527a();
                                                                                                                            }
                                                                                                                            if (gVar instanceof C13597g.C13640g) {
                                                                                                                                this.f29717I0.getClass();
                                                                                                                                return AnimateFavoriteChangeHandler.m18260a(dVar, (C13597g.C13640g) gVar);
                                                                                                                            } else if (gVar instanceof C13597g.C13704p0) {
                                                                                                                                return this.f29721J0.mo34279a((C13597g.C13704p0) gVar);
                                                                                                                            } else {
                                                                                                                                if (gVar instanceof C13597g.C13645g4) {
                                                                                                                                    return this.f29725K0.mo46705a((C13597g.C13645g4) gVar);
                                                                                                                                }
                                                                                                                                if (gVar instanceof C13597g.C13631e4) {
                                                                                                                                    this.f29731M0.getClass();
                                                                                                                                    return C13875d.m21403a(dVar, (C13597g.C13631e4) gVar);
                                                                                                                                } else if (gVar instanceof C13597g.C13638f4) {
                                                                                                                                    return this.f29734N0.mo46704a((C13597g.C13638f4) gVar);
                                                                                                                                } else {
                                                                                                                                    if (gVar instanceof C13597g.C13659i4) {
                                                                                                                                        return this.f29737O0.mo46707a((C13597g.C13659i4) gVar);
                                                                                                                                    }
                                                                                                                                    if (gVar instanceof C13597g.C13717r) {
                                                                                                                                        return this.f29740P0.mo46663a(dVar, (C13597g.C13717r) gVar);
                                                                                                                                    }
                                                                                                                                    if (gVar instanceof C13597g.C13710q) {
                                                                                                                                        return this.f29743Q0.mo34316a();
                                                                                                                                    }
                                                                                                                                    if (gVar instanceof C13597g.C13601a2) {
                                                                                                                                        return this.f29746R0.mo34274a();
                                                                                                                                    }
                                                                                                                                    if (gVar instanceof C13597g.C13742u3) {
                                                                                                                                        return this.f29749S0.mo34210a();
                                                                                                                                    }
                                                                                                                                    if (gVar instanceof C13597g.C13694n4) {
                                                                                                                                        return this.f29752T0.mo34211a();
                                                                                                                                    }
                                                                                                                                    if (gVar instanceof C13597g.C13657i2) {
                                                                                                                                        return this.f29755U0.mo34209a();
                                                                                                                                    }
                                                                                                                                    if (gVar instanceof C13597g.C13654i) {
                                                                                                                                        return this.f29758V0.mo33525a(dVar, (C13597g.C13654i) gVar);
                                                                                                                                    }
                                                                                                                                    if (gVar instanceof C13597g.C13656i1) {
                                                                                                                                        this.f29838q1.getClass();
                                                                                                                                        return HidePriceLoadingHandler.m18351a(dVar);
                                                                                                                                    } else if (gVar instanceof C13597g.C13603a4) {
                                                                                                                                        this.f29834p1.getClass();
                                                                                                                                        return ShowPriceLoadingHandler.m18352a(dVar);
                                                                                                                                    } else if (gVar instanceof C13597g.C13639f5) {
                                                                                                                                        return this.f29830o1.mo33724a(dVar, (C13597g.C13639f5) gVar);
                                                                                                                                    } else {
                                                                                                                                        if (gVar instanceof C13597g.C13755w2) {
                                                                                                                                            this.f29775a2.getClass();
                                                                                                                                            return QuantityChangedHandler.m18353a(dVar, (C13597g.C13755w2) gVar);
                                                                                                                                        } else if (gVar instanceof C13597g.C13607b1) {
                                                                                                                                            return this.f29861w0.mo45488a();
                                                                                                                                        } else {
                                                                                                                                            if (gVar instanceof C13597g.C13621d1) {
                                                                                                                                                return this.f29865x0.mo45490a(dVar, (C13597g.C13621d1) gVar);
                                                                                                                                            }
                                                                                                                                            if (gVar instanceof C13597g.C13614c1) {
                                                                                                                                                return this.f29869y0.mo45489a(dVar);
                                                                                                                                            }
                                                                                                                                            if (gVar instanceof C13597g.C13628e1) {
                                                                                                                                                return this.f29761W0.mo45491a(dVar, (C13597g.C13628e1) gVar);
                                                                                                                                            }
                                                                                                                                            if (gVar instanceof C13597g.C13635f1) {
                                                                                                                                                this.f29873z0.getClass();
                                                                                                                                                return C12721e.m20393a((C13597g.C13635f1) gVar);
                                                                                                                                            } else if (gVar instanceof C13597g.C13643g2) {
                                                                                                                                                return this.f29771Z1.mo33536a();
                                                                                                                                            } else {
                                                                                                                                                if (gVar instanceof C13597g.C13637f3) {
                                                                                                                                                    return this.f29779b2.mo34110a(dVar, (C13597g.C13637f3) gVar);
                                                                                                                                                }
                                                                                                                                                if (gVar instanceof C13597g.C13706p2) {
                                                                                                                                                    return this.f29783c2.mo34096a(dVar, (C13597g.C13706p2) gVar);
                                                                                                                                                }
                                                                                                                                                if (gVar instanceof C13597g.C13746v0) {
                                                                                                                                                    return this.f29787d2.mo34185a(dVar, (C13597g.C13746v0) gVar);
                                                                                                                                                }
                                                                                                                                                if (gVar instanceof C13597g.C13620d0) {
                                                                                                                                                    this.f29791e2.getClass();
                                                                                                                                                    return C10254b.m18320a(dVar, (C13597g.C13620d0) gVar);
                                                                                                                                                } else if (gVar instanceof C13597g.C13676l0) {
                                                                                                                                                    return this.f29795f2.mo34039a(dVar, (C13597g.C13676l0) gVar);
                                                                                                                                                } else {
                                                                                                                                                    if (gVar instanceof C13597g.C13728s3) {
                                                                                                                                                        return this.f29799g2.mo34200a(dVar, (C13597g.C13728s3) gVar);
                                                                                                                                                    }
                                                                                                                                                    if (gVar instanceof C13597g.C13749v3) {
                                                                                                                                                        return this.f29803h2.mo34218a(dVar, (C13597g.C13749v3) gVar);
                                                                                                                                                    }
                                                                                                                                                    if (gVar instanceof C13597g.C13735t3) {
                                                                                                                                                        return this.f29807i2.mo34188b(dVar, (C13597g.C13735t3) gVar);
                                                                                                                                                    }
                                                                                                                                                    if (gVar instanceof C13597g.C13747v1) {
                                                                                                                                                        return this.f29811j2.mo34173a();
                                                                                                                                                    }
                                                                                                                                                    if (gVar instanceof C13597g.C13774z2) {
                                                                                                                                                        this.f29815k2.getClass();
                                                                                                                                                        return C10579e.m18522a(dVar);
                                                                                                                                                    } else if (gVar instanceof C13597g.C13664j2) {
                                                                                                                                                        this.f29819l2.getClass();
                                                                                                                                                        return C10177o.m18279a(dVar, (C13597g.C13664j2) gVar);
                                                                                                                                                    } else if (gVar instanceof C13597g.C13701o4) {
                                                                                                                                                        this.f29823m2.getClass();
                                                                                                                                                        return C10606g.m18539a(dVar);
                                                                                                                                                    } else if (gVar instanceof C13597g.C13687m4) {
                                                                                                                                                        this.f29827n2.getClass();
                                                                                                                                                        return StructuredPaymentsExpandedHandler.m18534a(dVar);
                                                                                                                                                    } else if (gVar instanceof C13597g.C13768y2) {
                                                                                                                                                        this.f29831o2.getClass();
                                                                                                                                                        return C10603e.m18538a(dVar);
                                                                                                                                                    } else if (gVar instanceof C13597g.C13674k5) {
                                                                                                                                                        this.f29835p2.getClass();
                                                                                                                                                        return C10584i.m18526a((C13597g.C13674k5) gVar);
                                                                                                                                                    } else if (gVar instanceof C13597g.C13650h2) {
                                                                                                                                                        return this.f29839q2.mo34176a(dVar, (C13597g.C13650h2) gVar);
                                                                                                                                                    } else {
                                                                                                                                                        if (gVar instanceof C13597g.C13753w0) {
                                                                                                                                                            return this.f29843r2.mo34184a(dVar);
                                                                                                                                                        }
                                                                                                                                                        if (gVar instanceof C13597g.C13651h3) {
                                                                                                                                                            return this.f29847s2.mo34186a((C13597g.C13651h3) gVar);
                                                                                                                                                        }
                                                                                                                                                        if (gVar instanceof C13597g.C13600a1) {
                                                                                                                                                            this.f29851t2.getClass();
                                                                                                                                                            return GiftWrapAvailableClickedHandler.m18517a(dVar, (C13597g.C13600a1) gVar);
                                                                                                                                                        } else if (gVar instanceof C13597g.C13729s4) {
                                                                                                                                                            this.f29855u2.getClass();
                                                                                                                                                            return C10609i.m18540a(dVar, (C13597g.C13729s4) gVar);
                                                                                                                                                        } else if (gVar instanceof C13597g.C13604a5) {
                                                                                                                                                            return this.f29859v2.mo34212a(dVar, (C13597g.C13604a5) gVar);
                                                                                                                                                        } else {
                                                                                                                                                            if (gVar instanceof C13597g.C13693n3) {
                                                                                                                                                                return this.f29863w2.mo34197a(dVar, (C13597g.C13693n3) gVar);
                                                                                                                                                            }
                                                                                                                                                            if (gVar instanceof C13597g.C13602a3) {
                                                                                                                                                                return this.f29867x2.mo33960a(dVar, (C13597g.C13602a3) gVar);
                                                                                                                                                            }
                                                                                                                                                            if (gVar instanceof C13597g.C13652h4) {
                                                                                                                                                                return this.f29871y2.mo46706a((C13597g.C13652h4) gVar);
                                                                                                                                                            }
                                                                                                                                                            if (gVar instanceof C13597g.C13748v2) {
                                                                                                                                                                this.f29875z2.getClass();
                                                                                                                                                                return ProductWarningInfoClickedHandler.m18548a(dVar, (C13597g.C13748v2) gVar);
                                                                                                                                                            } else if (gVar instanceof C13597g.C13764x4) {
                                                                                                                                                                return this.f29687A2.mo34222a(dVar);
                                                                                                                                                            } else {
                                                                                                                                                                if (gVar instanceof C13597g.C13707p3) {
                                                                                                                                                                    this.f29691B2.getClass();
                                                                                                                                                                    return C10152n.m18274a(dVar);
                                                                                                                                                                } else if (gVar instanceof C13597g.C13754w1) {
                                                                                                                                                                    return this.f29699D2.mo34101a(dVar);
                                                                                                                                                                } else {
                                                                                                                                                                    if (gVar instanceof C13597g.C13772z0) {
                                                                                                                                                                        return this.f29695C2.mo33633a(dVar, (C13597g.C13772z0) gVar);
                                                                                                                                                                    }
                                                                                                                                                                    if (gVar instanceof C13597g.C13733t1) {
                                                                                                                                                                        this.f29703E2.getClass();
                                                                                                                                                                        return C10440j.m18432a((C13597g.C13733t1) gVar);
                                                                                                                                                                    } else if (gVar instanceof C13597g.C13741u2) {
                                                                                                                                                                        this.f29707F2.getClass();
                                                                                                                                                                        return C13777h.m21324a(dVar);
                                                                                                                                                                    } else if (gVar instanceof C13597g.C13762x2) {
                                                                                                                                                                        this.f29711G2.getClass();
                                                                                                                                                                        return ReadItemDescriptionClickedHandler.m18476a(dVar, (C13597g.C13762x2) gVar);
                                                                                                                                                                    } else if (gVar instanceof C13597g.C13745v) {
                                                                                                                                                                        return this.f29715H2.mo33979a(dVar, (C13597g.C13745v) gVar);
                                                                                                                                                                    } else {
                                                                                                                                                                        if (gVar instanceof C13597g.C13644g3) {
                                                                                                                                                                            return this.f29719I2.mo34118a((C13597g.C13644g3) gVar);
                                                                                                                                                                        }
                                                                                                                                                                        if (gVar instanceof C13597g.C13629e2) {
                                                                                                                                                                            return this.f29723J2.mo34114a(dVar, (C13597g.C13629e2) gVar);
                                                                                                                                                                        }
                                                                                                                                                                        throw new NoWhenBranchMatchedException();
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return hVar;
    }
}
