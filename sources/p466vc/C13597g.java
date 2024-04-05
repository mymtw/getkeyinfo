package p466vc;

import android.content.Intent;
import android.os.Bundle;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.text.Spanned;
import androidx.compose.animation.C0391c;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.lib.models.apiv3.ListingShippingDetails;
import com.etsy.android.lib.models.apiv3.TranslatedFaq;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.cart.SingleListingCart;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.lib.models.apiv3.listing.LightWeightListingLike;
import com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields;
import com.etsy.android.lib.models.apiv3.listing.ProductSafetyNoticeMessage;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.User;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.cart.googlepay.GooglePayCheckoutSpec;
import com.etsy.android.p327ui.core.C9613a;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10207g;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.C10212a;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a;
import com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery.C10253a;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.C10521a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.uikit.adapter.ListingVideoPosition;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.etsy.android.uikit.view.DynamicHeightViewPager;
import com.google.android.gms.wallet.PaymentData;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p003a2.C0023f;
import p400mf.C13074b;
import p413od.C13154a;
import p459ud.C13487j;

/* renamed from: vc.g */
public abstract class C13597g implements C13572b {

    /* renamed from: vc.g$a */
    public static final class C13598a extends C13597g {

        /* renamed from: a */
        public final C9613a f30068a;

        public C13598a(C9613a aVar) {
            C19383o.m32797g(aVar, "addToCartAnimEvent");
            this.f30068a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13598a) && C19383o.m32792b(this.f30068a, ((C13598a) obj).f30068a);
        }

        public final int hashCode() {
            return this.f30068a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AddToCartAnimation(addToCartAnimEvent=");
            h.append(this.f30068a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$a1 */
    public static final class C13600a1 extends C13597g {

        /* renamed from: a */
        public final C10564g f30070a;

        public C13600a1(C10564g gVar) {
            C19383o.m32797g(gVar, "giftInfo");
            this.f30070a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13600a1) && C19383o.m32792b(this.f30070a, ((C13600a1) obj).f30070a);
        }

        public final int hashCode() {
            return this.f30070a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("GiftWrapAvailableClicked(giftInfo=");
            h.append(this.f30070a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$a2 */
    public static final class C13601a2 extends C13597g {

        /* renamed from: a */
        public static final C13601a2 f30071a = new C13601a2();
    }

    /* renamed from: vc.g$a3 */
    public static final class C13602a3 extends C13597g {

        /* renamed from: a */
        public final String f30072a;

        /* renamed from: b */
        public final String f30073b;

        public C13602a3(String str, String str2) {
            C19383o.m32797g(str, "listingId");
            this.f30072a = str;
            this.f30073b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13602a3)) {
                return false;
            }
            C13602a3 a3Var = (C13602a3) obj;
            return C19383o.m32792b(this.f30072a, a3Var.f30072a) && C19383o.m32792b(this.f30073b, a3Var.f30073b);
        }

        public final int hashCode() {
            int hashCode = this.f30072a.hashCode() * 31;
            String str = this.f30073b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReportListingClicked(listingId=");
            h.append(this.f30072a);
            h.append(", listingUrl=");
            return C0391c.m1057c(h, this.f30073b, ')');
        }
    }

    /* renamed from: vc.g$a4 */
    public static final class C13603a4 extends C13597g {

        /* renamed from: a */
        public static final C13603a4 f30074a = new C13603a4();
    }

    /* renamed from: vc.g$a5 */
    public static final class C13604a5 extends C13597g {

        /* renamed from: a */
        public final String f30075a;

        public C13604a5(String str) {
            C19383o.m32797g(str, "url");
            this.f30075a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13604a5) && C19383o.m32792b(this.f30075a, ((C13604a5) obj).f30075a);
        }

        public final int hashCode() {
            return this.f30075a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("TraderDistinctionLinkClicked(url="), this.f30075a, ')');
        }
    }

    /* renamed from: vc.g$b */
    public static final class C13605b extends C13597g {

        /* renamed from: a */
        public final boolean f30076a;

        public C13605b(boolean z) {
            this.f30076a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13605b) && this.f30076a == ((C13605b) obj).f30076a;
        }

        public final int hashCode() {
            boolean z = this.f30076a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("AddToCartButtonClicked(shouldPushToCart="), this.f30076a, ')');
        }
    }

    /* renamed from: vc.g$b0 */
    public static final class C13606b0 extends C13597g {

        /* renamed from: a */
        public final long f30077a;

        /* renamed from: b */
        public final MachineTranslationViewState f30078b;

        public C13606b0(long j, MachineTranslationViewState machineTranslationViewState) {
            C19383o.m32797g(machineTranslationViewState, "machineTranslationViewState");
            this.f30077a = j;
            this.f30078b = machineTranslationViewState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13606b0)) {
                return false;
            }
            C13606b0 b0Var = (C13606b0) obj;
            return this.f30077a == b0Var.f30077a && C19383o.m32792b(this.f30078b, b0Var.f30078b);
        }

        public final int hashCode() {
            return this.f30078b.hashCode() + (Long.hashCode(this.f30077a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ErrorUpdatingReviewMachineTranslation(transactionId=");
            h.append(this.f30077a);
            h.append(", machineTranslationViewState=");
            h.append(this.f30078b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$b1 */
    public static final class C13607b1 extends C13597g {

        /* renamed from: a */
        public static final C13607b1 f30079a = new C13607b1();
    }

    /* renamed from: vc.g$b2 */
    public static final class C13608b2 extends C13597g {

        /* renamed from: a */
        public static final C13608b2 f30080a = new C13608b2();
    }

    /* renamed from: vc.g$b3 */
    public static final class C13609b3 extends C13597g {

        /* renamed from: a */
        public final Reviews.ReviewType f30081a;

        /* renamed from: b */
        public final int f30082b;

        public C13609b3(int i, Reviews.ReviewType reviewType) {
            C19383o.m32797g(reviewType, "type");
            this.f30081a = reviewType;
            this.f30082b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13609b3)) {
                return false;
            }
            C13609b3 b3Var = (C13609b3) obj;
            return this.f30081a == b3Var.f30081a && this.f30082b == b3Var.f30082b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30082b) + (this.f30081a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReviewCarouselImageClicked(type=");
            h.append(this.f30081a);
            h.append(", position=");
            return C0073e.m208h(h, this.f30082b, ')');
        }
    }

    /* renamed from: vc.g$b4 */
    public static final class C13610b4 extends C13597g {

        /* renamed from: a */
        public final C13154a f30083a;

        public C13610b4(C13154a aVar) {
            this.f30083a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13610b4) && C19383o.m32792b(this.f30083a, ((C13610b4) obj).f30083a);
        }

        public final int hashCode() {
            return this.f30083a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShowVariationSelection(variationSelectionBottomSheet=");
            h.append(this.f30083a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$b5 */
    public static final class C13611b5 extends C13597g {

        /* renamed from: a */
        public final ReviewUiModel f30084a;

        public C13611b5(ReviewUiModel reviewUiModel) {
            C19383o.m32797g(reviewUiModel, "reviewUiModel");
            this.f30084a = reviewUiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13611b5) && C19383o.m32792b(this.f30084a, ((C13611b5) obj).f30084a);
        }

        public final int hashCode() {
            return this.f30084a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("TranslateReviewClicked(reviewUiModel=");
            h.append(this.f30084a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$c */
    public static final class C13612c extends C13597g {

        /* renamed from: a */
        public static final C13612c f30085a = new C13612c();
    }

    /* renamed from: vc.g$c0 */
    public static final class C13613c0 extends C13597g {

        /* renamed from: a */
        public static final C13613c0 f30086a = new C13613c0();
    }

    /* renamed from: vc.g$c1 */
    public static final class C13614c1 extends C13597g {

        /* renamed from: a */
        public static final C13614c1 f30087a = new C13614c1();
    }

    /* renamed from: vc.g$c2 */
    public static final class C13615c2 extends C13597g {

        /* renamed from: a */
        public final long f30088a;

        public C13615c2(long j) {
            this.f30088a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13615c2) && this.f30088a == ((C13615c2) obj).f30088a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f30088a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("MoreFromShopListingClicked(listingId="), this.f30088a, ')');
        }
    }

    /* renamed from: vc.g$c3 */
    public static final class C13616c3 extends C13597g {

        /* renamed from: a */
        public final int f30089a;

        /* renamed from: b */
        public final List<ReviewUiModel> f30090b;

        public C13616c3(int i, List<ReviewUiModel> list) {
            C19383o.m32797g(list, "reviewVideos");
            this.f30089a = i;
            this.f30090b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13616c3)) {
                return false;
            }
            C13616c3 c3Var = (C13616c3) obj;
            return this.f30089a == c3Var.f30089a && C19383o.m32792b(this.f30090b, c3Var.f30090b);
        }

        public final int hashCode() {
            return this.f30090b.hashCode() + (Integer.hashCode(this.f30089a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReviewCarouselVideoClicked(position=");
            h.append(this.f30089a);
            h.append(", reviewVideos=");
            return C0070b.m186i(h, this.f30090b, ')');
        }
    }

    /* renamed from: vc.g$c4 */
    public static final class C13617c4 extends C13597g {

        /* renamed from: a */
        public static final C13617c4 f30091a = new C13617c4();
    }

    /* renamed from: vc.g$c5 */
    public static final class C13618c5 extends C13597g {

        /* renamed from: a */
        public final String f30092a;

        /* renamed from: b */
        public final String f30093b;

        public C13618c5(String str, String str2) {
            this.f30092a = str;
            this.f30093b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13618c5)) {
                return false;
            }
            C13618c5 c5Var = (C13618c5) obj;
            return C19383o.m32792b(this.f30092a, c5Var.f30092a) && C19383o.m32792b(this.f30093b, c5Var.f30093b);
        }

        public final int hashCode() {
            return this.f30093b.hashCode() + (this.f30092a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateContentMachineTranslation(titleInAlternateLanguage=");
            h.append(this.f30092a);
            h.append(", descriptionInAlternateLanguage=");
            return C0391c.m1057c(h, this.f30093b, ')');
        }
    }

    /* renamed from: vc.g$d */
    public static final class C13619d extends C13597g {

        /* renamed from: a */
        public static final C13619d f30094a = new C13619d();
    }

    /* renamed from: vc.g$d0 */
    public static final class C13620d0 extends C13597g {

        /* renamed from: a */
        public final C10253a f30095a;

        public C13620d0(C10253a aVar) {
            this.f30095a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13620d0) && C19383o.m32792b(this.f30095a, ((C13620d0) obj).f30095a);
        }

        public final int hashCode() {
            return this.f30095a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("EstimatedDeliveryAdded(estimatedDelivery=");
            h.append(this.f30095a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$d2 */
    public static final class C13622d2 extends C13597g {

        /* renamed from: a */
        public final PaymentOption f30097a;

        public C13622d2(PaymentOption paymentOption) {
            this.f30097a = paymentOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13622d2) && C19383o.m32792b(this.f30097a, ((C13622d2) obj).f30097a);
        }

        public final int hashCode() {
            return this.f30097a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("NavigateToNativeBuyItNowCheckout(paymentOption=");
            h.append(this.f30097a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$d3 */
    public static final class C13623d3 extends C13597g {

        /* renamed from: a */
        public final List<ReviewImage> f30098a;

        /* renamed from: b */
        public final int f30099b;

        public C13623d3(int i, List list) {
            C19383o.m32797g(list, "reviewImages");
            this.f30098a = list;
            this.f30099b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13623d3)) {
                return false;
            }
            C13623d3 d3Var = (C13623d3) obj;
            return C19383o.m32792b(this.f30098a, d3Var.f30098a) && this.f30099b == d3Var.f30099b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30099b) + (this.f30098a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReviewClicked(reviewImages=");
            h.append(this.f30098a);
            h.append(", imageSelectedAtPosition=");
            return C0073e.m208h(h, this.f30099b, ')');
        }
    }

    /* renamed from: vc.g$d4 */
    public static final class C13624d4 extends C13597g {

        /* renamed from: a */
        public static final C13624d4 f30100a = new C13624d4();
    }

    /* renamed from: vc.g$d5 */
    public static final class C13625d5 extends C13597g {

        /* renamed from: a */
        public final AppsInventoryUiOption f30101a;

        public C13625d5(AppsInventoryUiOption appsInventoryUiOption) {
            C19383o.m32797g(appsInventoryUiOption, "option");
            this.f30101a = appsInventoryUiOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13625d5) && C19383o.m32792b(this.f30101a, ((C13625d5) obj).f30101a);
        }

        public final int hashCode() {
            return this.f30101a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateFirstVariationFromInventoryUi(option=");
            h.append(this.f30101a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$e */
    public static final class C13626e extends C13597g {

        /* renamed from: a */
        public final boolean f30102a;

        public C13626e(boolean z) {
            this.f30102a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13626e) && this.f30102a == ((C13626e) obj).f30102a;
        }

        public final int hashCode() {
            boolean z = this.f30102a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("AddToCartNetwork(shouldPushToCart="), this.f30102a, ')');
        }
    }

    /* renamed from: vc.g$e1 */
    public static final class C13628e1 extends C13597g {

        /* renamed from: a */
        public final PaymentData f30104a;

        public C13628e1(PaymentData paymentData) {
            this.f30104a = paymentData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13628e1) && C19383o.m32792b(this.f30104a, ((C13628e1) obj).f30104a);
        }

        public final int hashCode() {
            PaymentData paymentData = this.f30104a;
            if (paymentData == null) {
                return 0;
            }
            return paymentData.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("GooglePayProcessPayment(paymentData=");
            h.append(this.f30104a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$e2 */
    public static final class C13629e2 extends C13597g {

        /* renamed from: a */
        public final Reviews.ReviewType f30105a;

        /* renamed from: b */
        public final C10521a f30106b;

        public C13629e2(Reviews.ReviewType reviewType, C10521a aVar) {
            C19383o.m32797g(reviewType, "reviewType");
            C19383o.m32797g(aVar, "reviewsPanel");
            this.f30105a = reviewType;
            this.f30106b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13629e2)) {
                return false;
            }
            C13629e2 e2Var = (C13629e2) obj;
            return this.f30105a == e2Var.f30105a && C19383o.m32792b(this.f30106b, e2Var.f30106b);
        }

        public final int hashCode() {
            return this.f30106b.hashCode() + (this.f30105a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("NavigateToShopReviews(reviewType=");
            h.append(this.f30105a);
            h.append(", reviewsPanel=");
            h.append(this.f30106b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$e3 */
    public static final class C13630e3 extends C13597g {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13630e3)) {
                return false;
            }
            ((C13630e3) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ReviewTypeTabSelected(type=null)";
        }
    }

    /* renamed from: vc.g$e4 */
    public static final class C13631e4 extends C13597g {

        /* renamed from: a */
        public final EtsyAction f30107a;

        /* renamed from: b */
        public final String f30108b;

        /* renamed from: c */
        public final Bundle f30109c;

        public C13631e4(EtsyAction etsyAction, String str, Bundle bundle, int i) {
            str = (i & 2) != 0 ? null : str;
            bundle = (i & 4) != 0 ? null : bundle;
            C19383o.m32797g(etsyAction, ResponseConstants.ACTION);
            this.f30107a = etsyAction;
            this.f30108b = str;
            this.f30109c = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13631e4)) {
                return false;
            }
            C13631e4 e4Var = (C13631e4) obj;
            return this.f30107a == e4Var.f30107a && C19383o.m32792b(this.f30108b, e4Var.f30108b) && C19383o.m32792b(this.f30109c, e4Var.f30109c);
        }

        public final int hashCode() {
            int hashCode = this.f30107a.hashCode() * 31;
            String str = this.f30108b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f30109c;
            if (bundle != null) {
                i = bundle.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SignIn(action=");
            h.append(this.f30107a);
            h.append(", actionData=");
            h.append(this.f30108b);
            h.append(", actionBundle=");
            h.append(this.f30109c);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$e5 */
    public static final class C13632e5 extends C13597g {

        /* renamed from: a */
        public final VariationValue f30110a;

        public C13632e5(VariationValue variationValue) {
            this.f30110a = variationValue;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13632e5) && C19383o.m32792b(this.f30110a, ((C13632e5) obj).f30110a);
        }

        public final int hashCode() {
            VariationValue variationValue = this.f30110a;
            if (variationValue == null) {
                return 0;
            }
            return variationValue.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateFirstVariationFromListing(option=");
            h.append(this.f30110a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$f0 */
    public static final class C13634f0 extends C13597g {

        /* renamed from: a */
        public final C10212a f30113a;

        public C13634f0(C10212a aVar) {
            C19383o.m32797g(aVar, "expressCheckout");
            this.f30113a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13634f0) && C19383o.m32792b(this.f30113a, ((C13634f0) obj).f30113a);
        }

        public final int hashCode() {
            return this.f30113a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ExpressCheckoutButtonClicked(expressCheckout=");
            h.append(this.f30113a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$f1 */
    public static final class C13635f1 extends C13597g {

        /* renamed from: a */
        public final GooglePayData f30114a;

        public C13635f1(GooglePayData googlePayData) {
            this.f30114a = googlePayData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13635f1) && C19383o.m32792b(this.f30114a, ((C13635f1) obj).f30114a);
        }

        public final int hashCode() {
            return this.f30114a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("GooglePayRequestPayment(googlePayData=");
            h.append(this.f30114a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$f2 */
    public static final class C13636f2 extends C13597g {

        /* renamed from: a */
        public final PaymentOption f30115a;

        /* renamed from: b */
        public final GooglePayCheckoutSpec f30116b;

        public C13636f2(PaymentOption paymentOption, GooglePayCheckoutSpec googlePayCheckoutSpec) {
            this.f30115a = paymentOption;
            this.f30116b = googlePayCheckoutSpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13636f2)) {
                return false;
            }
            C13636f2 f2Var = (C13636f2) obj;
            return C19383o.m32792b(this.f30115a, f2Var.f30115a) && C19383o.m32792b(this.f30116b, f2Var.f30116b);
        }

        public final int hashCode() {
            int hashCode = this.f30115a.hashCode() * 31;
            GooglePayCheckoutSpec googlePayCheckoutSpec = this.f30116b;
            return hashCode + (googlePayCheckoutSpec == null ? 0 : googlePayCheckoutSpec.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("NavigateToSingleListingCheckout(paymentOption=");
            h.append(this.f30115a);
            h.append(", googlePayCheckoutSpec=");
            h.append(this.f30116b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$f3 */
    public static final class C13637f3 extends C13597g {

        /* renamed from: a */
        public final boolean f30117a;

        public C13637f3(boolean z) {
            this.f30117a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13637f3) && this.f30117a == ((C13637f3) obj).f30117a;
        }

        public final int hashCode() {
            boolean z = this.f30117a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("ReviewsPanelClicked(isExpanded="), this.f30117a, ')');
        }
    }

    /* renamed from: vc.g$f4 */
    public static final class C13638f4 extends C13597g {

        /* renamed from: a */
        public final long f30118a;

        public C13638f4(long j) {
            this.f30118a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13638f4) && this.f30118a == ((C13638f4) obj).f30118a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f30118a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("SignInAndFavoriteListing(listingId="), this.f30118a, ')');
        }
    }

    /* renamed from: vc.g$f5 */
    public static final class C13639f5 extends C13597g {

        /* renamed from: a */
        public final AppsInventoryAddToCartContext f30119a;

        public C13639f5(AppsInventoryAddToCartContext appsInventoryAddToCartContext) {
            this.f30119a = appsInventoryAddToCartContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13639f5) && C19383o.m32792b(this.f30119a, ((C13639f5) obj).f30119a);
        }

        public final int hashCode() {
            return this.f30119a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateOffering(newInventoryContext=");
            h.append(this.f30119a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$g */
    public static final class C13640g extends C13597g {

        /* renamed from: a */
        public final long f30120a;

        /* renamed from: b */
        public final boolean f30121b;

        public C13640g(long j, boolean z) {
            this.f30120a = j;
            this.f30121b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13640g)) {
                return false;
            }
            C13640g gVar = (C13640g) obj;
            return this.f30120a == gVar.f30120a && this.f30121b == gVar.f30121b;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f30120a) * 31;
            boolean z = this.f30121b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AnimateFavoriteChange(listingId=");
            h.append(this.f30120a);
            h.append(", showAsFavorite=");
            return C0391c.m1058d(h, this.f30121b, ')');
        }
    }

    /* renamed from: vc.g$g0 */
    public static final class C13641g0 extends C13597g {

        /* renamed from: a */
        public static final C13641g0 f30122a = new C13641g0();
    }

    /* renamed from: vc.g$g1 */
    public static final class C13642g1 extends C13597g {

        /* renamed from: a */
        public final String f30123a;

        public C13642g1(String str) {
            this.f30123a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13642g1) && C19383o.m32792b(this.f30123a, ((C13642g1) obj).f30123a);
        }

        public final int hashCode() {
            return this.f30123a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("GrafanaIncrementEvent(metric="), this.f30123a, ')');
        }
    }

    /* renamed from: vc.g$g2 */
    public static final class C13643g2 extends C13597g {

        /* renamed from: a */
        public static final C13643g2 f30124a = new C13643g2();
    }

    /* renamed from: vc.g$g3 */
    public static final class C13644g3 extends C13597g {

        /* renamed from: a */
        public final Reviews.ReviewType f30125a;

        /* renamed from: b */
        public final C10521a f30126b;

        public C13644g3(Reviews.ReviewType reviewType, C10521a aVar) {
            C19383o.m32797g(reviewType, "reviewType");
            C19383o.m32797g(aVar, "reviewsPanel");
            this.f30125a = reviewType;
            this.f30126b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13644g3)) {
                return false;
            }
            C13644g3 g3Var = (C13644g3) obj;
            return this.f30125a == g3Var.f30125a && C19383o.m32792b(this.f30126b, g3Var.f30126b);
        }

        public final int hashCode() {
            return this.f30126b.hashCode() + (this.f30125a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReviewsSummaryClicked(reviewType=");
            h.append(this.f30125a);
            h.append(", reviewsPanel=");
            h.append(this.f30126b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$g4 */
    public static final class C13645g4 extends C13597g {

        /* renamed from: a */
        public final long f30127a;

        /* renamed from: b */
        public final String f30128b;

        public C13645g4(long j, String str) {
            C19383o.m32797g(str, "shopName");
            this.f30127a = j;
            this.f30128b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13645g4)) {
                return false;
            }
            C13645g4 g4Var = (C13645g4) obj;
            return this.f30127a == g4Var.f30127a && C19383o.m32792b(this.f30128b, g4Var.f30128b);
        }

        public final int hashCode() {
            return this.f30128b.hashCode() + (Long.hashCode(this.f30127a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SignInAndFavoriteShop(shopUserId=");
            h.append(this.f30127a);
            h.append(", shopName=");
            return C0391c.m1057c(h, this.f30128b, ')');
        }
    }

    /* renamed from: vc.g$g5 */
    public static final class C13646g5 extends C13597g {

        /* renamed from: a */
        public final VariationValue f30129a;

        public C13646g5(VariationValue variationValue) {
            this.f30129a = variationValue;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13646g5) && C19383o.m32792b(this.f30129a, ((C13646g5) obj).f30129a);
        }

        public final int hashCode() {
            return this.f30129a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdatePriceWithVariationValue(option=");
            h.append(this.f30129a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$h */
    public static final class C13647h extends C13597g {

        /* renamed from: a */
        public final long f30130a;

        /* renamed from: b */
        public final boolean f30131b;

        /* renamed from: c */
        public final ListingLike f30132c;

        /* renamed from: d */
        public final String f30133d;

        /* renamed from: e */
        public final boolean f30134e;

        public C13647h(long j, LightWeightListingLike lightWeightListingLike, String str, boolean z, boolean z2) {
            this.f30130a = j;
            this.f30131b = z;
            this.f30132c = lightWeightListingLike;
            this.f30133d = str;
            this.f30134e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13647h)) {
                return false;
            }
            C13647h hVar = (C13647h) obj;
            return this.f30130a == hVar.f30130a && this.f30131b == hVar.f30131b && C19383o.m32792b(this.f30132c, hVar.f30132c) && C19383o.m32792b(this.f30133d, hVar.f30133d) && this.f30134e == hVar.f30134e;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f30130a) * 31;
            boolean z = this.f30131b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode2 = (this.f30132c.hashCode() + ((hashCode + (z ? 1 : 0)) * 31)) * 31;
            String str = this.f30133d;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            boolean z3 = this.f30134e;
            if (!z3) {
                z2 = z3;
            }
            return hashCode3 + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AttemptToFavoriteListing(listingId=");
            h.append(this.f30130a);
            h.append(", isHearted=");
            h.append(this.f30131b);
            h.append(", listingLike=");
            h.append(this.f30132c);
            h.append(", contentSource=");
            h.append(this.f30133d);
            h.append(", shouldShowAnimation=");
            return C0391c.m1058d(h, this.f30134e, ')');
        }
    }

    /* renamed from: vc.g$h0 */
    public static final class C13648h0 extends C13597g {

        /* renamed from: a */
        public static final C13648h0 f30135a = new C13648h0();
    }

    /* renamed from: vc.g$h1 */
    public static final class C13649h1 extends C13597g {

        /* renamed from: a */
        public final C13074b f30136a;

        public C13649h1(C13074b bVar) {
            C19383o.m32797g(bVar, "heartUpdate");
            this.f30136a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13649h1) && C19383o.m32792b(this.f30136a, ((C13649h1) obj).f30136a);
        }

        public final int hashCode() {
            return this.f30136a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("HeartUpdateEvent(heartUpdate=");
            h.append(this.f30136a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$h2 */
    public static final class C13650h2 extends C13597g {

        /* renamed from: a */
        public final Country f30137a;

        /* renamed from: b */
        public final String f30138b;

        public C13650h2(Country country, String str) {
            C19383o.m32797g(country, "country");
            this.f30137a = country;
            this.f30138b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13650h2)) {
                return false;
            }
            C13650h2 h2Var = (C13650h2) obj;
            return C19383o.m32792b(this.f30137a, h2Var.f30137a) && C19383o.m32792b(this.f30138b, h2Var.f30138b);
        }

        public final int hashCode() {
            int hashCode = this.f30137a.hashCode() * 31;
            String str = this.f30138b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("NewShippingDestinationSelected(country=");
            h.append(this.f30137a);
            h.append(", postalCode=");
            return C0391c.m1057c(h, this.f30138b, ')');
        }
    }

    /* renamed from: vc.g$h3 */
    public static final class C13651h3 extends C13597g {

        /* renamed from: a */
        public final String f30139a;

        /* renamed from: b */
        public final String f30140b;

        public C13651h3(String str, String str2) {
            C19383o.m32797g(str, "isoCountryCode");
            this.f30139a = str;
            this.f30140b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13651h3)) {
                return false;
            }
            C13651h3 h3Var = (C13651h3) obj;
            return C19383o.m32792b(this.f30139a, h3Var.f30139a) && C19383o.m32792b(this.f30140b, h3Var.f30140b);
        }

        public final int hashCode() {
            int hashCode = this.f30139a.hashCode() * 31;
            String str = this.f30140b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SaveNewShippingDestination(isoCountryCode=");
            h.append(this.f30139a);
            h.append(", postalCode=");
            return C0391c.m1057c(h, this.f30140b, ')');
        }
    }

    /* renamed from: vc.g$h4 */
    public static final class C13652h4 extends C13597g {

        /* renamed from: a */
        public final String f30141a;

        /* renamed from: b */
        public final String f30142b;

        public C13652h4(String str, String str2) {
            C19383o.m32797g(str, "listingId");
            this.f30141a = str;
            this.f30142b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13652h4)) {
                return false;
            }
            C13652h4 h4Var = (C13652h4) obj;
            return C19383o.m32792b(this.f30141a, h4Var.f30141a) && C19383o.m32792b(this.f30142b, h4Var.f30142b);
        }

        public final int hashCode() {
            int hashCode = this.f30141a.hashCode() * 31;
            String str = this.f30142b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SignInAndReportListing(listingId=");
            h.append(this.f30141a);
            h.append(", listingUrl=");
            return C0391c.m1057c(h, this.f30142b, ')');
        }
    }

    /* renamed from: vc.g$h5 */
    public static final class C13653h5 extends C13597g {

        /* renamed from: a */
        public final long f30143a;

        /* renamed from: b */
        public final String f30144b;

        /* renamed from: c */
        public final MachineTranslationViewState f30145c;

        public C13653h5(long j, String str, MachineTranslationViewState machineTranslationViewState) {
            C19383o.m32797g(str, "translatedText");
            this.f30143a = j;
            this.f30144b = str;
            this.f30145c = machineTranslationViewState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13653h5)) {
                return false;
            }
            C13653h5 h5Var = (C13653h5) obj;
            return this.f30143a == h5Var.f30143a && C19383o.m32792b(this.f30144b, h5Var.f30144b) && C19383o.m32792b(this.f30145c, h5Var.f30145c);
        }

        public final int hashCode() {
            return this.f30145c.hashCode() + C0023f.m105e(this.f30144b, Long.hashCode(this.f30143a) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateReviewMachineTranslation(transactionId=");
            h.append(this.f30143a);
            h.append(", translatedText=");
            h.append(this.f30144b);
            h.append(", machineTranslationViewState=");
            h.append(this.f30145c);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$i */
    public static final class C13654i extends C13597g {

        /* renamed from: a */
        public final String f30146a;

        public C13654i(String str) {
            this.f30146a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13654i) && C19383o.m32792b(this.f30146a, ((C13654i) obj).f30146a);
        }

        public final int hashCode() {
            String str = this.f30146a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("AttemptToFavoriteListingWithId(listingId="), this.f30146a, ')');
        }
    }

    /* renamed from: vc.g$i0 */
    public static final class C13655i0 extends C13597g {

        /* renamed from: a */
        public static final C13655i0 f30147a = new C13655i0();
    }

    /* renamed from: vc.g$i1 */
    public static final class C13656i1 extends C13597g {

        /* renamed from: a */
        public static final C13656i1 f30148a = new C13656i1();
    }

    /* renamed from: vc.g$i2 */
    public static final class C13657i2 extends C13597g {

        /* renamed from: a */
        public static final C13657i2 f30149a = new C13657i2();
    }

    /* renamed from: vc.g$i3 */
    public static final class C13658i3 extends C13597g {

        /* renamed from: a */
        public static final C13658i3 f30150a = new C13658i3();
    }

    /* renamed from: vc.g$i4 */
    public static final class C13659i4 extends C13597g {

        /* renamed from: a */
        public final int f30151a;

        /* renamed from: b */
        public final Intent f30152b;

        public C13659i4(int i, Intent intent) {
            this.f30151a = i;
            this.f30152b = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13659i4)) {
                return false;
            }
            C13659i4 i4Var = (C13659i4) obj;
            return this.f30151a == i4Var.f30151a && C19383o.m32792b(this.f30152b, i4Var.f30152b);
        }

        public final int hashCode() {
            return this.f30152b.hashCode() + (Integer.hashCode(this.f30151a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SignInResult(resultCode=");
            h.append(this.f30151a);
            h.append(", intent=");
            h.append(this.f30152b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$i5 */
    public static final class C13660i5 extends C13597g {

        /* renamed from: a */
        public final AppsInventoryUiOption f30153a;

        public C13660i5(AppsInventoryUiOption appsInventoryUiOption) {
            C19383o.m32797g(appsInventoryUiOption, "option");
            this.f30153a = appsInventoryUiOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13660i5) && C19383o.m32792b(this.f30153a, ((C13660i5) obj).f30153a);
        }

        public final int hashCode() {
            return this.f30153a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateSecondVariationFromInventoryUi(option=");
            h.append(this.f30153a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$j0 */
    public static final class C13662j0 extends C13597g {

        /* renamed from: a */
        public final boolean f30155a;

        public C13662j0(boolean z) {
            this.f30155a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13662j0) && this.f30155a == ((C13662j0) obj).f30155a;
        }

        public final int hashCode() {
            boolean z = this.f30155a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("FaqMachineTranslationLoading(isLoading="), this.f30155a, ')');
        }
    }

    /* renamed from: vc.g$j1 */
    public static final class C13663j1 extends C13597g {

        /* renamed from: a */
        public final int f30156a;

        public C13663j1(int i) {
            this.f30156a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13663j1) && this.f30156a == ((C13663j1) obj).f30156a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30156a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("ImageDoubleTapped(position="), this.f30156a, ')');
        }
    }

    /* renamed from: vc.g$j2 */
    public static final class C13664j2 extends C13597g {

        /* renamed from: a */
        public final boolean f30157a;

        public C13664j2(boolean z) {
            this.f30157a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13664j2) && this.f30157a == ((C13664j2) obj).f30157a;
        }

        public final int hashCode() {
            boolean z = this.f30157a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("OnHiddenChanged(hidden="), this.f30157a, ')');
        }
    }

    /* renamed from: vc.g$j3 */
    public static final class C13665j3 extends C13597g {

        /* renamed from: a */
        public final Throwable f30158a;

        public C13665j3(Throwable th) {
            C19383o.m32797g(th, "throwable");
            this.f30158a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13665j3) && C19383o.m32792b(this.f30158a, ((C13665j3) obj).f30158a);
        }

        public final int hashCode() {
            return this.f30158a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("ScreenShotError(throwable="), this.f30158a, ')');
        }
    }

    /* renamed from: vc.g$j4 */
    public static final class C13666j4 extends C13597g {

        /* renamed from: a */
        public static final C13666j4 f30159a = new C13666j4();
    }

    /* renamed from: vc.g$j5 */
    public static final class C13667j5 extends C13597g {

        /* renamed from: a */
        public final VariationValue f30160a;

        public C13667j5(VariationValue variationValue) {
            this.f30160a = variationValue;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13667j5) && C19383o.m32792b(this.f30160a, ((C13667j5) obj).f30160a);
        }

        public final int hashCode() {
            VariationValue variationValue = this.f30160a;
            if (variationValue == null) {
                return 0;
            }
            return variationValue.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateSecondVariationFromListing(option=");
            h.append(this.f30160a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$k */
    public static final class C13668k extends C13597g {

        /* renamed from: a */
        public static final C13668k f30161a = new C13668k();
    }

    /* renamed from: vc.g$k0 */
    public static final class C13669k0 extends C13597g {

        /* renamed from: a */
        public static final C13669k0 f30162a = new C13669k0();
    }

    /* renamed from: vc.g$k1 */
    public static final class C13670k1 extends C13597g {

        /* renamed from: a */
        public final int f30163a;

        public C13670k1(int i) {
            this.f30163a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13670k1) && this.f30163a == ((C13670k1) obj).f30163a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30163a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("ImagePagerScrollStateChanged(state="), this.f30163a, ')');
        }
    }

    /* renamed from: vc.g$k2 */
    public static final class C13671k2 extends C13597g {

        /* renamed from: a */
        public final long f30164a;

        /* renamed from: b */
        public final String f30165b;

        public C13671k2(long j, String str) {
            this.f30164a = j;
            this.f30165b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13671k2)) {
                return false;
            }
            C13671k2 k2Var = (C13671k2) obj;
            return this.f30164a == k2Var.f30164a && C19383o.m32792b(this.f30165b, k2Var.f30165b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f30164a) * 31;
            String str = this.f30165b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("OnListingFavorited(listingId=");
            h.append(this.f30164a);
            h.append(", contentSource=");
            return C0391c.m1057c(h, this.f30165b, ')');
        }
    }

    /* renamed from: vc.g$k3 */
    public static final class C13672k3 extends C13597g {

        /* renamed from: a */
        public static final C13672k3 f30166a = new C13672k3();
    }

    /* renamed from: vc.g$k4 */
    public static final class C13673k4 extends C13597g {

        /* renamed from: a */
        public static final C13673k4 f30167a = new C13673k4();
    }

    /* renamed from: vc.g$k5 */
    public static final class C13674k5 extends C13597g {

        /* renamed from: a */
        public final List<Country> f30168a;

        public C13674k5(List<Country> list) {
            C19383o.m32797g(list, "availableCountries");
            this.f30168a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13674k5) && C19383o.m32792b(this.f30168a, ((C13674k5) obj).f30168a);
        }

        public final int hashCode() {
            return this.f30168a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("UpdateShippingDestination(availableCountries="), this.f30168a, ')');
        }
    }

    /* renamed from: vc.g$l */
    public static final class C13675l extends C13597g {

        /* renamed from: a */
        public final C10225a f30169a;

        public C13675l(C10225a aVar) {
            C19383o.m32797g(aVar, "cartButton");
            this.f30169a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13675l) && C19383o.m32792b(this.f30169a, ((C13675l) obj).f30169a);
        }

        public final int hashCode() {
            return this.f30169a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CartButtonClicked(cartButton=");
            h.append(this.f30169a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$l0 */
    public static final class C13676l0 extends C13597g {

        /* renamed from: a */
        public final boolean f30170a;

        public C13676l0(boolean z) {
            this.f30170a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13676l0) && this.f30170a == ((C13676l0) obj).f30170a;
        }

        public final int hashCode() {
            boolean z = this.f30170a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("FaqsPanelClicked(isExpanded="), this.f30170a, ')');
        }
    }

    /* renamed from: vc.g$l1 */
    public static final class C13677l1 extends C13597g {

        /* renamed from: a */
        public final int f30171a;

        public C13677l1(int i) {
            this.f30171a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13677l1) && this.f30171a == ((C13677l1) obj).f30171a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30171a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("ImageSelected(position="), this.f30171a, ')');
        }
    }

    /* renamed from: vc.g$l2 */
    public static final class C13678l2 extends C13597g {

        /* renamed from: a */
        public final long f30172a;

        public C13678l2(long j) {
            this.f30172a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13678l2) && this.f30172a == ((C13678l2) obj).f30172a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f30172a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("OnListingUnFavorited(listingId="), this.f30172a, ')');
        }
    }

    /* renamed from: vc.g$l3 */
    public static final class C13679l3 extends C13597g {

        /* renamed from: a */
        public static final C13679l3 f30173a = new C13679l3();
    }

    /* renamed from: vc.g$l4 */
    public static final class C13680l4 extends C13597g {

        /* renamed from: a */
        public static final C13680l4 f30174a = new C13680l4();
    }

    /* renamed from: vc.g$l5 */
    public static final class C13681l5 extends C13597g {

        /* renamed from: a */
        public final String f30175a;

        public C13681l5(String str) {
            C19383o.m32797g(str, "url");
            this.f30175a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13681l5) && C19383o.m32792b(this.f30175a, ((C13681l5) obj).f30175a);
        }

        public final int hashCode() {
            return this.f30175a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("UrlClicked(url="), this.f30175a, ')');
        }
    }

    /* renamed from: vc.g$m */
    public static final class C13682m extends C13597g {

        /* renamed from: a */
        public final C10225a f30176a;

        /* renamed from: b */
        public final C9613a f30177b;

        public C13682m(C10225a aVar, C9613a aVar2) {
            this.f30176a = aVar;
            this.f30177b = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13682m)) {
                return false;
            }
            C13682m mVar = (C13682m) obj;
            return C19383o.m32792b(this.f30176a, mVar.f30176a) && C19383o.m32792b(this.f30177b, mVar.f30177b);
        }

        public final int hashCode() {
            return this.f30177b.hashCode() + (this.f30176a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CartButtonTouchedUp(cartButton=");
            h.append(this.f30176a);
            h.append(", addToCartAnimEvent=");
            h.append(this.f30177b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$m0 */
    public static final class C13683m0 extends C13597g {

        /* renamed from: a */
        public final boolean f30178a;

        /* renamed from: b */
        public final long f30179b;

        /* renamed from: c */
        public final String f30180c;

        /* renamed from: d */
        public final ListingLike f30181d;

        /* renamed from: e */
        public final boolean f30182e;

        public C13683m0(long j, ListingLike listingLike, String str, boolean z, boolean z2) {
            C19383o.m32797g(listingLike, "listingLike");
            this.f30178a = z;
            this.f30179b = j;
            this.f30180c = str;
            this.f30181d = listingLike;
            this.f30182e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13683m0)) {
                return false;
            }
            C13683m0 m0Var = (C13683m0) obj;
            return this.f30178a == m0Var.f30178a && this.f30179b == m0Var.f30179b && C19383o.m32792b(this.f30180c, m0Var.f30180c) && C19383o.m32792b(this.f30181d, m0Var.f30181d) && this.f30182e == m0Var.f30182e;
        }

        public final int hashCode() {
            boolean z = this.f30178a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int b = C0071c.m190b(this.f30179b, (z ? 1 : 0) * true, 31);
            String str = this.f30180c;
            int hashCode = (this.f30181d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            boolean z3 = this.f30182e;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FavoriteListing(isHearted=");
            h.append(this.f30178a);
            h.append(", listingId=");
            h.append(this.f30179b);
            h.append(", contentSource=");
            h.append(this.f30180c);
            h.append(", listingLike=");
            h.append(this.f30181d);
            h.append(", shouldShowAnimation=");
            return C0391c.m1058d(h, this.f30182e, ')');
        }
    }

    /* renamed from: vc.g$m1 */
    public static final class C13684m1 extends C13597g {

        /* renamed from: a */
        public final int f30183a;

        /* renamed from: b */
        public final ListingVideoPosition f30184b;

        public C13684m1(int i, ListingVideoPosition listingVideoPosition) {
            this.f30183a = i;
            this.f30184b = listingVideoPosition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13684m1)) {
                return false;
            }
            C13684m1 m1Var = (C13684m1) obj;
            return this.f30183a == m1Var.f30183a && C19383o.m32792b(this.f30184b, m1Var.f30184b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f30183a) * 31;
            ListingVideoPosition listingVideoPosition = this.f30184b;
            return hashCode + (listingVideoPosition == null ? 0 : listingVideoPosition.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ImageTapped(position=");
            h.append(this.f30183a);
            h.append(", listingVideoPosition=");
            h.append(this.f30184b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$m2 */
    public static final class C13685m2 extends C13597g {

        /* renamed from: a */
        public final long f30185a;

        public C13685m2(long j) {
            this.f30185a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13685m2) && this.f30185a == ((C13685m2) obj).f30185a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f30185a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("OpenListing(listingId="), this.f30185a, ')');
        }
    }

    /* renamed from: vc.g$m3 */
    public static final class C13686m3 extends C13597g {

        /* renamed from: a */
        public static final C13686m3 f30186a = new C13686m3();
    }

    /* renamed from: vc.g$m4 */
    public static final class C13687m4 extends C13597g {

        /* renamed from: a */
        public static final C13687m4 f30187a = new C13687m4();
    }

    /* renamed from: vc.g$m5 */
    public static final class C13688m5 extends C13597g {

        /* renamed from: a */
        public final C13572b f30188a;

        /* renamed from: b */
        public final boolean f30189b;

        /* renamed from: c */
        public final boolean f30190c;

        public C13688m5(C13597g gVar, boolean z, int i) {
            boolean z2 = false;
            z = (i & 2) != 0 ? false : z;
            z2 = (i & 4) != 0 ? true : z2;
            this.f30188a = gVar;
            this.f30189b = z;
            this.f30190c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13688m5)) {
                return false;
            }
            C13688m5 m5Var = (C13688m5) obj;
            return C19383o.m32792b(this.f30188a, m5Var.f30188a) && this.f30189b == m5Var.f30189b && this.f30190c == m5Var.f30190c;
        }

        public final int hashCode() {
            int hashCode = this.f30188a.hashCode() * 31;
            boolean z = this.f30189b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f30190c;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ValidateListing(next=");
            h.append(this.f30188a);
            h.append(", shouldVibrateOnError=");
            h.append(this.f30189b);
            h.append(", showErrors=");
            return C0391c.m1058d(h, this.f30190c, ')');
        }
    }

    /* renamed from: vc.g$n */
    public static final class C13689n extends C13597g {

        /* renamed from: a */
        public static final C13689n f30191a = new C13689n();
    }

    /* renamed from: vc.g$n0 */
    public static final class C13690n0 extends C13597g {

        /* renamed from: a */
        public static final C13690n0 f30192a = new C13690n0();
    }

    /* renamed from: vc.g$n1 */
    public static final class C13691n1 extends C13597g {

        /* renamed from: a */
        public final ListingViewState.ImageVisibility f30193a;

        public C13691n1(ListingViewState.ImageVisibility imageVisibility) {
            C19383o.m32797g(imageVisibility, "imageVisibility");
            this.f30193a = imageVisibility;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13691n1) && this.f30193a == ((C13691n1) obj).f30193a;
        }

        public final int hashCode() {
            return this.f30193a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ImageVisibilityStatusChanged(imageVisibility=");
            h.append(this.f30193a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$n2 */
    public static final class C13692n2 extends C13597g {

        /* renamed from: a */
        public final long f30194a;

        /* renamed from: b */
        public final Long f30195b;

        /* renamed from: c */
        public final ShopHomeConfig f30196c;

        public C13692n2(long j, Long l, ShopHomeConfig shopHomeConfig) {
            C19383o.m32797g(shopHomeConfig, "initialConfig");
            this.f30194a = j;
            this.f30195b = l;
            this.f30196c = shopHomeConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13692n2)) {
                return false;
            }
            C13692n2 n2Var = (C13692n2) obj;
            return this.f30194a == n2Var.f30194a && C19383o.m32792b(this.f30195b, n2Var.f30195b) && this.f30196c == n2Var.f30196c;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f30194a) * 31;
            Long l = this.f30195b;
            return this.f30196c.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("OpenShop(shopId=");
            h.append(this.f30194a);
            h.append(", referralListingId=");
            h.append(this.f30195b);
            h.append(", initialConfig=");
            h.append(this.f30196c);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$n3 */
    public static final class C13693n3 extends C13597g {

        /* renamed from: a */
        public final String f30197a;

        /* renamed from: b */
        public final CharSequence f30198b;

        public C13693n3(String str, Spanned spanned) {
            C19383o.m32797g(spanned, DetailsBottomSheetNavigationKey.PARAM_BODY);
            this.f30197a = str;
            this.f30198b = spanned;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13693n3)) {
                return false;
            }
            C13693n3 n3Var = (C13693n3) obj;
            return C19383o.m32792b(this.f30197a, n3Var.f30197a) && C19383o.m32792b(this.f30198b, n3Var.f30198b);
        }

        public final int hashCode() {
            return this.f30198b.hashCode() + (this.f30197a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SeeMoreSellerDetailsClicked(title=");
            h.append(this.f30197a);
            h.append(", body=");
            h.append(this.f30198b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$n4 */
    public static final class C13694n4 extends C13597g {

        /* renamed from: a */
        public static final C13694n4 f30199a = new C13694n4();
    }

    /* renamed from: vc.g$n5 */
    public static final class C13695n5 extends C13597g {

        /* renamed from: a */
        public final C13572b f30200a;

        public C13695n5(C13597g gVar) {
            this.f30200a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13695n5) && C19383o.m32792b(this.f30200a, ((C13695n5) obj).f30200a);
        }

        public final int hashCode() {
            return this.f30200a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("VariationFromInventoryUiSelected(next=");
            h.append(this.f30200a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$o */
    public static final class C13696o extends C13597g {

        /* renamed from: a */
        public static final C13696o f30201a = new C13696o();
    }

    /* renamed from: vc.g$o0 */
    public static final class C13697o0 extends C13597g {

        /* renamed from: a */
        public static final C13697o0 f30202a = new C13697o0();
    }

    /* renamed from: vc.g$o1 */
    public static final class C13698o1 extends C13597g {

        /* renamed from: a */
        public static final C13698o1 f30203a = new C13698o1();
    }

    /* renamed from: vc.g$o2 */
    public static final class C13699o2 extends C13597g {

        /* renamed from: a */
        public final ShopHomeConfig f30204a;

        public C13699o2() {
            this(0);
        }

        public C13699o2(int i) {
            ShopHomeConfig shopHomeConfig = ShopHomeConfig.ITEMS_SEARCH;
            C19383o.m32797g(shopHomeConfig, "initialConfig");
            this.f30204a = shopHomeConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13699o2) && this.f30204a == ((C13699o2) obj).f30204a;
        }

        public final int hashCode() {
            return this.f30204a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("OpenThisShop(initialConfig=");
            h.append(this.f30204a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$o3 */
    public static final class C13700o3 extends C13597g {

        /* renamed from: a */
        public final String f30205a;

        /* renamed from: b */
        public final String f30206b;

        /* renamed from: c */
        public final String f30207c;

        /* renamed from: d */
        public final User f30208d;

        /* renamed from: e */
        public final boolean f30209e;

        public C13700o3(String str, String str2, String str3, User user, boolean z) {
            this.f30205a = str;
            this.f30206b = str2;
            this.f30207c = str3;
            this.f30208d = user;
            this.f30209e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13700o3)) {
                return false;
            }
            C13700o3 o3Var = (C13700o3) obj;
            return C19383o.m32792b(this.f30205a, o3Var.f30205a) && C19383o.m32792b(this.f30206b, o3Var.f30206b) && C19383o.m32792b(this.f30207c, o3Var.f30207c) && C19383o.m32792b(this.f30208d, o3Var.f30208d) && this.f30209e == o3Var.f30209e;
        }

        public final int hashCode() {
            String str = this.f30205a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f30206b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f30207c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            User user = this.f30208d;
            if (user != null) {
                i = user.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.f30209e;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SendMessage(username=");
            h.append(this.f30205a);
            h.append(", subject=");
            h.append(this.f30206b);
            h.append(", message=");
            h.append(this.f30207c);
            h.append(", user=");
            h.append(this.f30208d);
            h.append(", customerCentricMessagingEnabled=");
            return C0391c.m1058d(h, this.f30209e, ')');
        }
    }

    /* renamed from: vc.g$o4 */
    public static final class C13701o4 extends C13597g {

        /* renamed from: a */
        public static final C13701o4 f30210a = new C13701o4();
    }

    /* renamed from: vc.g$o5 */
    public static final class C13702o5 extends C13597g {

        /* renamed from: a */
        public final C13572b f30211a;

        /* renamed from: b */
        public final VariationValue f30212b;

        public C13702o5(C13597g gVar, VariationValue variationValue) {
            this.f30211a = gVar;
            this.f30212b = variationValue;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13702o5)) {
                return false;
            }
            C13702o5 o5Var = (C13702o5) obj;
            return C19383o.m32792b(this.f30211a, o5Var.f30211a) && C19383o.m32792b(this.f30212b, o5Var.f30212b);
        }

        public final int hashCode() {
            int hashCode = this.f30211a.hashCode() * 31;
            VariationValue variationValue = this.f30212b;
            return hashCode + (variationValue == null ? 0 : variationValue.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("VariationFromListingSelected(next=");
            h.append(this.f30211a);
            h.append(", variationValue=");
            h.append(this.f30212b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$p */
    public static final class C13703p extends C13597g {

        /* renamed from: a */
        public final int f30213a;

        /* renamed from: b */
        public final int f30214b;

        public C13703p(int i, int i2) {
            this.f30213a = i;
            this.f30214b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13703p)) {
                return false;
            }
            C13703p pVar = (C13703p) obj;
            return this.f30213a == pVar.f30213a && this.f30214b == pVar.f30214b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30214b) + (Integer.hashCode(this.f30213a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CompletelyVisibleItemPositions(firstPosition=");
            h.append(this.f30213a);
            h.append(", lastPosition=");
            return C0073e.m208h(h, this.f30214b, ')');
        }
    }

    /* renamed from: vc.g$p0 */
    public static final class C13704p0 extends C13597g {

        /* renamed from: a */
        public final long f30215a;

        /* renamed from: b */
        public final String f30216b;

        /* renamed from: c */
        public final boolean f30217c;

        public C13704p0(long j, String str, boolean z) {
            C19383o.m32797g(str, "shopName");
            this.f30215a = j;
            this.f30216b = str;
            this.f30217c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13704p0)) {
                return false;
            }
            C13704p0 p0Var = (C13704p0) obj;
            return this.f30215a == p0Var.f30215a && C19383o.m32792b(this.f30216b, p0Var.f30216b) && this.f30217c == p0Var.f30217c;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f30216b, Long.hashCode(this.f30215a) * 31, 31);
            boolean z = this.f30217c;
            if (z) {
                z = true;
            }
            return e + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FavoriteShop(shopUserId=");
            h.append(this.f30215a);
            h.append(", shopName=");
            h.append(this.f30216b);
            h.append(", isFavorite=");
            return C0391c.m1058d(h, this.f30217c, ')');
        }
    }

    /* renamed from: vc.g$p1 */
    public static final class C13705p1 extends C13597g {

        /* renamed from: a */
        public final String f30218a;

        public C13705p1(String str) {
            this.f30218a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13705p1) && C19383o.m32792b(this.f30218a, ((C13705p1) obj).f30218a);
        }

        public final int hashCode() {
            String str = this.f30218a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("InvalidNewOffering(label="), this.f30218a, ')');
        }
    }

    /* renamed from: vc.g$p2 */
    public static final class C13706p2 extends C13597g {

        /* renamed from: a */
        public final boolean f30219a;

        public C13706p2(boolean z) {
            this.f30219a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13706p2) && this.f30219a == ((C13706p2) obj).f30219a;
        }

        public final int hashCode() {
            boolean z = this.f30219a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("OverviewPanelClicked(isExpanded="), this.f30219a, ')');
        }
    }

    /* renamed from: vc.g$p3 */
    public static final class C13707p3 extends C13597g {

        /* renamed from: a */
        public static final C13707p3 f30220a = new C13707p3();
    }

    /* renamed from: vc.g$p4 */
    public static final class C13708p4 extends C13597g {

        /* renamed from: a */
        public final ListingMachineTranslationTranslatedFields f30221a;

        public C13708p4(ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields) {
            C19383o.m32797g(listingMachineTranslationTranslatedFields, "translatedFields");
            this.f30221a = listingMachineTranslationTranslatedFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13708p4) && C19383o.m32792b(this.f30221a, ((C13708p4) obj).f30221a);
        }

        public final int hashCode() {
            return this.f30221a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SuccessfulContentMachineTranslationFetch(translatedFields=");
            h.append(this.f30221a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$p5 */
    public static final class C13709p5 extends C13597g {

        /* renamed from: a */
        public final C13154a f30222a;

        /* renamed from: b */
        public final int f30223b;

        public C13709p5(C13154a aVar, int i) {
            C19383o.m32797g(aVar, "variationSelectionBottomSheet");
            this.f30222a = aVar;
            this.f30223b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13709p5)) {
                return false;
            }
            C13709p5 p5Var = (C13709p5) obj;
            return C19383o.m32792b(this.f30222a, p5Var.f30222a) && this.f30223b == p5Var.f30223b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30223b) + (this.f30222a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("VariationSelected(variationSelectionBottomSheet=");
            h.append(this.f30222a);
            h.append(", selectedOptionPosition=");
            return C0073e.m208h(h, this.f30223b, ')');
        }
    }

    /* renamed from: vc.g$q */
    public static final class C13710q extends C13597g {

        /* renamed from: a */
        public static final C13710q f30224a = new C13710q();
    }

    /* renamed from: vc.g$q0 */
    public static final class C13711q0 extends C13597g {

        /* renamed from: a */
        public static final C13711q0 f30225a = new C13711q0();
    }

    /* renamed from: vc.g$q1 */
    public static final class C13712q1 extends C13597g {

        /* renamed from: a */
        public final boolean f30226a;

        public C13712q1(boolean z) {
            this.f30226a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13712q1) && this.f30226a == ((C13712q1) obj).f30226a;
        }

        public final int hashCode() {
            boolean z = this.f30226a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("ItemDetailsPanelClicked(isExpanded="), this.f30226a, ')');
        }
    }

    /* renamed from: vc.g$q2 */
    public static final class C13713q2 extends C13597g {

        /* renamed from: a */
        public final String f30227a;

        public C13713q2(String str) {
            C19383o.m32797g(str, "text");
            this.f30227a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13713q2) && C19383o.m32792b(this.f30227a, ((C13713q2) obj).f30227a);
        }

        public final int hashCode() {
            return this.f30227a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("PersonalizationOptionalTextChanged(text="), this.f30227a, ')');
        }
    }

    /* renamed from: vc.g$q3 */
    public static final class C13714q3 extends C13597g {

        /* renamed from: a */
        public final String f30228a;

        /* renamed from: b */
        public final String f30229b;

        public C13714q3(String str, String str2) {
            C19383o.m32797g(str, "url");
            this.f30228a = str;
            this.f30229b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13714q3)) {
                return false;
            }
            C13714q3 q3Var = (C13714q3) obj;
            return C19383o.m32792b(this.f30228a, q3Var.f30228a) && C19383o.m32792b(this.f30229b, q3Var.f30229b);
        }

        public final int hashCode() {
            int hashCode = this.f30228a.hashCode() * 31;
            String str = this.f30229b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShareListing(url=");
            h.append(this.f30228a);
            h.append(", imageUrl=");
            return C0391c.m1057c(h, this.f30229b, ')');
        }
    }

    /* renamed from: vc.g$q4 */
    public static final class C13715q4 extends C13597g {

        /* renamed from: a */
        public final List<TranslatedFaq> f30230a;

        /* renamed from: b */
        public final String f30231b;

        public C13715q4(List<TranslatedFaq> list, String str) {
            C19383o.m32797g(list, "translatedFaqs");
            C19383o.m32797g(str, "language");
            this.f30230a = list;
            this.f30231b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13715q4)) {
                return false;
            }
            C13715q4 q4Var = (C13715q4) obj;
            return C19383o.m32792b(this.f30230a, q4Var.f30230a) && C19383o.m32792b(this.f30231b, q4Var.f30231b);
        }

        public final int hashCode() {
            return this.f30231b.hashCode() + (this.f30230a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SuccessfulFaqMachineTranslationFetch(translatedFaqs=");
            h.append(this.f30230a);
            h.append(", language=");
            return C0391c.m1057c(h, this.f30231b, ')');
        }
    }

    /* renamed from: vc.g$q5 */
    public static final class C13716q5 extends C13597g {

        /* renamed from: a */
        public final C13154a f30232a;

        public C13716q5(C13154a aVar) {
            C19383o.m32797g(aVar, "dismissedModel");
            this.f30232a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13716q5) && C19383o.m32792b(this.f30232a, ((C13716q5) obj).f30232a);
        }

        public final int hashCode() {
            return this.f30232a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("VariationSelectionSheetDismissed(dismissedModel=");
            h.append(this.f30232a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$r0 */
    public static final class C13718r0 extends C13597g {

        /* renamed from: a */
        public static final C13718r0 f30234a = new C13718r0();
    }

    /* renamed from: vc.g$r1 */
    public static final class C13719r1 extends C13597g {

        /* renamed from: a */
        public static final C13719r1 f30235a = new C13719r1();
    }

    /* renamed from: vc.g$r2 */
    public static final class C13720r2 extends C13597g {

        /* renamed from: a */
        public static final C13720r2 f30236a = new C13720r2();
    }

    /* renamed from: vc.g$r3 */
    public static final class C13721r3 extends C13597g {

        /* renamed from: a */
        public final String f30237a;

        /* renamed from: b */
        public final String f30238b;

        public C13721r3(String str, String str2) {
            C19383o.m32797g(str, "url");
            this.f30237a = str;
            this.f30238b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13721r3)) {
                return false;
            }
            C13721r3 r3Var = (C13721r3) obj;
            return C19383o.m32792b(this.f30237a, r3Var.f30237a) && C19383o.m32792b(this.f30238b, r3Var.f30238b);
        }

        public final int hashCode() {
            int hashCode = this.f30237a.hashCode() * 31;
            String str = this.f30238b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShareScreenShotClicked(url=");
            h.append(this.f30237a);
            h.append(", imageUrl=");
            return C0391c.m1057c(h, this.f30238b, ')');
        }
    }

    /* renamed from: vc.g$r4 */
    public static final class C13722r4 extends C13597g {

        /* renamed from: a */
        public final long f30239a;

        /* renamed from: b */
        public final String f30240b;

        /* renamed from: c */
        public final MachineTranslationViewState f30241c;

        public C13722r4(long j, String str, MachineTranslationViewState machineTranslationViewState) {
            C19383o.m32797g(str, "translatedText");
            C19383o.m32797g(machineTranslationViewState, "machineTranslationViewState");
            this.f30239a = j;
            this.f30240b = str;
            this.f30241c = machineTranslationViewState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13722r4)) {
                return false;
            }
            C13722r4 r4Var = (C13722r4) obj;
            return this.f30239a == r4Var.f30239a && C19383o.m32792b(this.f30240b, r4Var.f30240b) && C19383o.m32792b(this.f30241c, r4Var.f30241c);
        }

        public final int hashCode() {
            return this.f30241c.hashCode() + C0023f.m105e(this.f30240b, Long.hashCode(this.f30239a) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SuccessfulReviewMachineTranslationFetch(transactionId=");
            h.append(this.f30239a);
            h.append(", translatedText=");
            h.append(this.f30240b);
            h.append(", machineTranslationViewState=");
            h.append(this.f30241c);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$s */
    public static final class C13724s extends C13597g {

        /* renamed from: a */
        public static final C13724s f30243a = new C13724s();
    }

    /* renamed from: vc.g$s0 */
    public static final class C13725s0 extends C13597g {

        /* renamed from: a */
        public static final C13725s0 f30244a = new C13725s0();
    }

    /* renamed from: vc.g$s1 */
    public static final class C13726s1 extends C13597g {

        /* renamed from: a */
        public final int f30245a;

        /* renamed from: b */
        public final ListingVideoPosition f30246b;

        public C13726s1(int i, ListingVideoPosition listingVideoPosition) {
            this.f30245a = i;
            this.f30246b = listingVideoPosition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13726s1)) {
                return false;
            }
            C13726s1 s1Var = (C13726s1) obj;
            return this.f30245a == s1Var.f30245a && C19383o.m32792b(this.f30246b, s1Var.f30246b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f30245a) * 31;
            ListingVideoPosition listingVideoPosition = this.f30246b;
            return hashCode + (listingVideoPosition == null ? 0 : listingVideoPosition.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingImageGalleryResultReceived(selectedImageIndex=");
            h.append(this.f30245a);
            h.append(", listingVideoPosition=");
            h.append(this.f30246b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$s2 */
    public static final class C13727s2 extends C13597g {

        /* renamed from: a */
        public final String f30247a;

        public C13727s2(String str) {
            C19383o.m32797g(str, "text");
            this.f30247a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13727s2) && C19383o.m32792b(this.f30247a, ((C13727s2) obj).f30247a);
        }

        public final int hashCode() {
            return this.f30247a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("PersonalizationRequiredTextChanged(text="), this.f30247a, ')');
        }
    }

    /* renamed from: vc.g$s3 */
    public static final class C13728s3 extends C13597g {

        /* renamed from: a */
        public final boolean f30248a;

        public C13728s3(boolean z) {
            this.f30248a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13728s3) && this.f30248a == ((C13728s3) obj).f30248a;
        }

        public final int hashCode() {
            boolean z = this.f30248a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("ShippingAndPoliciesPanelClicked(isExpanded="), this.f30248a, ')');
        }
    }

    /* renamed from: vc.g$s4 */
    public static final class C13729s4 extends C13597g {

        /* renamed from: a */
        public final String f30249a;

        /* renamed from: b */
        public final String f30250b;

        public C13729s4(String str, String str2) {
            C19383o.m32797g(str, "title");
            C19383o.m32797g(str2, "termsAndConditions");
            this.f30249a = str;
            this.f30250b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13729s4)) {
                return false;
            }
            C13729s4 s4Var = (C13729s4) obj;
            return C19383o.m32792b(this.f30249a, s4Var.f30249a) && C19383o.m32792b(this.f30250b, s4Var.f30250b);
        }

        public final int hashCode() {
            return this.f30250b.hashCode() + (this.f30249a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("TermsAndConditionsClicked(title=");
            h.append(this.f30249a);
            h.append(", termsAndConditions=");
            return C0391c.m1057c(h, this.f30250b, ')');
        }
    }

    /* renamed from: vc.g$s5 */
    public static final class C13730s5 extends C13597g {

        /* renamed from: a */
        public final Reviews.ReviewType f30251a;

        /* renamed from: b */
        public final C10521a f30252b;

        public C13730s5(Reviews.ReviewType reviewType, C10521a aVar) {
            C19383o.m32797g(reviewType, "reviewType");
            C19383o.m32797g(aVar, "reviewsPanel");
            this.f30251a = reviewType;
            this.f30252b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13730s5)) {
                return false;
            }
            C13730s5 s5Var = (C13730s5) obj;
            return this.f30251a == s5Var.f30251a && C19383o.m32792b(this.f30252b, s5Var.f30252b);
        }

        public final int hashCode() {
            return this.f30252b.hashCode() + (this.f30251a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ViewAllPhotoReviewsClicked(reviewType=");
            h.append(this.f30251a);
            h.append(", reviewsPanel=");
            h.append(this.f30252b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$t */
    public static final class C13731t extends C13597g {

        /* renamed from: a */
        public final boolean f30253a;

        public C13731t(boolean z) {
            this.f30253a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13731t) && this.f30253a == ((C13731t) obj).f30253a;
        }

        public final int hashCode() {
            boolean z = this.f30253a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("ContentMachineTranslationLoading(isLoading="), this.f30253a, ')');
        }
    }

    /* renamed from: vc.g$t0 */
    public static final class C13732t0 extends C13597g {

        /* renamed from: a */
        public final boolean f30254a;

        public C13732t0() {
            this(0);
        }

        public C13732t0(int i) {
            this.f30254a = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13732t0) && this.f30254a == ((C13732t0) obj).f30254a;
        }

        public final int hashCode() {
            boolean z = this.f30254a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("FetchRecommendationsIfNeeded(forceFetch="), this.f30254a, ')');
        }
    }

    /* renamed from: vc.g$t1 */
    public static final class C13733t1 extends C13597g {

        /* renamed from: a */
        public final ViewPager f30255a;

        public C13733t1(DynamicHeightViewPager dynamicHeightViewPager) {
            C19383o.m32797g(dynamicHeightViewPager, "viewPager");
            this.f30255a = dynamicHeightViewPager;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13733t1) && C19383o.m32792b(this.f30255a, ((C13733t1) obj).f30255a);
        }

        public final int hashCode() {
            return this.f30255a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingImagesViewPagerBound(viewPager=");
            h.append(this.f30255a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$t2 */
    public static final class C13734t2 extends C13597g {

        /* renamed from: a */
        public static final C13734t2 f30256a = new C13734t2();
    }

    /* renamed from: vc.g$t3 */
    public static final class C13735t3 extends C13597g {

        /* renamed from: a */
        public final ListingShippingDetails f30257a;

        public C13735t3(ListingShippingDetails listingShippingDetails) {
            C19383o.m32797g(listingShippingDetails, "listingShippingDetails");
            this.f30257a = listingShippingDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13735t3) && C19383o.m32792b(this.f30257a, ((C13735t3) obj).f30257a);
        }

        public final int hashCode() {
            return this.f30257a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShippingDetailsReceived(listingShippingDetails=");
            h.append(this.f30257a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$t4 */
    public static final class C13736t4 extends C13597g {

        /* renamed from: a */
        public static final C13736t4 f30258a = new C13736t4();
    }

    /* renamed from: vc.g$t5 */
    public static final class C13737t5 extends C13597g {

        /* renamed from: a */
        public final Reviews.ReviewType f30259a;

        /* renamed from: b */
        public final C10521a f30260b;

        public C13737t5(Reviews.ReviewType reviewType, C10521a aVar) {
            C19383o.m32797g(reviewType, "reviewType");
            C19383o.m32797g(aVar, "reviewsPanel");
            this.f30259a = reviewType;
            this.f30260b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13737t5)) {
                return false;
            }
            C13737t5 t5Var = (C13737t5) obj;
            return this.f30259a == t5Var.f30259a && C19383o.m32792b(this.f30260b, t5Var.f30260b);
        }

        public final int hashCode() {
            return this.f30260b.hashCode() + (this.f30259a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ViewAllReviewsClicked(reviewType=");
            h.append(this.f30259a);
            h.append(", reviewsPanel=");
            h.append(this.f30260b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$u */
    public static final class C13738u extends C13597g {

        /* renamed from: a */
        public static final C13738u f30261a = new C13738u();
    }

    /* renamed from: vc.g$u0 */
    public static final class C13739u0 extends C13597g {

        /* renamed from: a */
        public final C13487j.C13489b f30262a;

        public C13739u0(C13487j.C13489b bVar) {
            C19383o.m32797g(bVar, "result");
            this.f30262a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13739u0) && C19383o.m32792b(this.f30262a, ((C13739u0) obj).f30262a);
        }

        public final int hashCode() {
            return this.f30262a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FetchRecommendationsSuccess(result=");
            h.append(this.f30262a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$u1 */
    public static final class C13740u1 extends C13597g {

        /* renamed from: a */
        public final int f30263a;

        /* renamed from: b */
        public final String f30264b;

        public C13740u1(int i, String str) {
            this.f30263a = i;
            this.f30264b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13740u1)) {
                return false;
            }
            C13740u1 u1Var = (C13740u1) obj;
            return this.f30263a == u1Var.f30263a && C19383o.m32792b(this.f30264b, u1Var.f30264b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f30263a) * 31;
            String str = this.f30264b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingImpression(displayIndex=");
            h.append(this.f30263a);
            h.append(", loggingKey=");
            return C0391c.m1057c(h, this.f30264b, ')');
        }
    }

    /* renamed from: vc.g$u2 */
    public static final class C13741u2 extends C13597g {

        /* renamed from: a */
        public static final C13741u2 f30265a = new C13741u2();
    }

    /* renamed from: vc.g$u3 */
    public static final class C13742u3 extends C13597g {

        /* renamed from: a */
        public static final C13742u3 f30266a = new C13742u3();
    }

    /* renamed from: vc.g$u4 */
    public static final class C13743u4 extends C13597g {

        /* renamed from: a */
        public static final C13743u4 f30267a = new C13743u4();
    }

    /* renamed from: vc.g$u5 */
    public static final class C13744u5 extends C13597g {

        /* renamed from: a */
        public final Reviews.ReviewType f30268a;

        /* renamed from: b */
        public final C10521a f30269b;

        public C13744u5(Reviews.ReviewType reviewType, C10521a aVar) {
            C19383o.m32797g(reviewType, "reviewType");
            C19383o.m32797g(aVar, "reviewsPanel");
            this.f30268a = reviewType;
            this.f30269b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13744u5)) {
                return false;
            }
            C13744u5 u5Var = (C13744u5) obj;
            return this.f30268a == u5Var.f30268a && C19383o.m32792b(this.f30269b, u5Var.f30269b);
        }

        public final int hashCode() {
            return this.f30269b.hashCode() + (this.f30268a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ViewAllVideoReviewsClicked(reviewType=");
            h.append(this.f30268a);
            h.append(", reviewsPanel=");
            h.append(this.f30269b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$v */
    public static final class C13745v extends C13597g {

        /* renamed from: a */
        public static final C13745v f30270a = new C13745v();
    }

    /* renamed from: vc.g$v0 */
    public static final class C13746v0 extends C13597g {

        /* renamed from: a */
        public final long f30271a;

        /* renamed from: b */
        public final String f30272b;

        /* renamed from: c */
        public final String f30273c;

        public C13746v0(long j, String str, String str2) {
            this.f30271a = j;
            this.f30272b = str;
            this.f30273c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13746v0)) {
                return false;
            }
            C13746v0 v0Var = (C13746v0) obj;
            return this.f30271a == v0Var.f30271a && C19383o.m32792b(this.f30272b, v0Var.f30272b) && C19383o.m32792b(this.f30273c, v0Var.f30273c);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f30271a) * 31;
            String str = this.f30272b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f30273c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FetchShippingDetails(listingId=");
            h.append(this.f30271a);
            h.append(", isoCountryCode=");
            h.append(this.f30272b);
            h.append(", postalCode=");
            return C0391c.m1057c(h, this.f30273c, ')');
        }
    }

    /* renamed from: vc.g$v1 */
    public static final class C13747v1 extends C13597g {

        /* renamed from: a */
        public static final C13747v1 f30274a = new C13747v1();
    }

    /* renamed from: vc.g$v2 */
    public static final class C13748v2 extends C13597g {

        /* renamed from: a */
        public final String f30275a;

        /* renamed from: b */
        public final List<ProductSafetyNoticeMessage> f30276b;

        public C13748v2(String str, List<ProductSafetyNoticeMessage> list) {
            C19383o.m32797g(str, "title");
            C19383o.m32797g(list, ResponseConstants.MESSAGES);
            this.f30275a = str;
            this.f30276b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13748v2)) {
                return false;
            }
            C13748v2 v2Var = (C13748v2) obj;
            return C19383o.m32792b(this.f30275a, v2Var.f30275a) && C19383o.m32792b(this.f30276b, v2Var.f30276b);
        }

        public final int hashCode() {
            return this.f30276b.hashCode() + (this.f30275a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ProductWarningInfoClicked(title=");
            h.append(this.f30275a);
            h.append(", messages=");
            return C0070b.m186i(h, this.f30276b, ')');
        }
    }

    /* renamed from: vc.g$v3 */
    public static final class C13749v3 extends C13597g {

        /* renamed from: a */
        public final boolean f30277a;

        public C13749v3(boolean z) {
            this.f30277a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13749v3) && this.f30277a == ((C13749v3) obj).f30277a;
        }

        public final int hashCode() {
            boolean z = this.f30277a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("ShippingUnstructuredPoliciesPanelClicked(isExpanded="), this.f30277a, ')');
        }
    }

    /* renamed from: vc.g$v4 */
    public static final class C13750v4 extends C13597g {

        /* renamed from: a */
        public static final C13750v4 f30278a = new C13750v4();
    }

    /* renamed from: vc.g$v5 */
    public static final class C13751v5 extends C13597g {

        /* renamed from: a */
        public static final C13751v5 f30279a = new C13751v5();
    }

    /* renamed from: vc.g$w0 */
    public static final class C13753w0 extends C13597g {

        /* renamed from: a */
        public static final C13753w0 f30281a = new C13753w0();
    }

    /* renamed from: vc.g$w1 */
    public static final class C13754w1 extends C13597g {

        /* renamed from: a */
        public static final C13754w1 f30282a = new C13754w1();
    }

    /* renamed from: vc.g$w2 */
    public static final class C13755w2 extends C13597g {

        /* renamed from: a */
        public final int f30283a;

        public C13755w2(int i) {
            this.f30283a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13755w2) && this.f30283a == ((C13755w2) obj).f30283a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30283a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("QuantityChanged(selectedValue="), this.f30283a, ')');
        }
    }

    /* renamed from: vc.g$w3 */
    public static final class C13756w3 extends C13597g {

        /* renamed from: a */
        public static final C13756w3 f30284a = new C13756w3();
    }

    /* renamed from: vc.g$w4 */
    public static final class C13757w4 extends C13597g {

        /* renamed from: a */
        public static final C13757w4 f30285a = new C13757w4();
    }

    /* renamed from: vc.g$w5 */
    public static final class C13758w5 extends C13597g {

        /* renamed from: a */
        public final String f30286a;

        public C13758w5(String str) {
            this.f30286a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13758w5) && C19383o.m32792b(this.f30286a, ((C13758w5) obj).f30286a);
        }

        public final int hashCode() {
            return this.f30286a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("VisuallySimilarButtonTapped(visuallySimilarApiPath="), this.f30286a, ')');
        }
    }

    /* renamed from: vc.g$x */
    public static final class C13759x extends C13597g {

        /* renamed from: a */
        public static final C13759x f30287a = new C13759x();
    }

    /* renamed from: vc.g$x0 */
    public static final class C13760x0 extends C13597g {

        /* renamed from: a */
        public final boolean f30288a;

        public C13760x0(boolean z) {
            this.f30288a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13760x0) && this.f30288a == ((C13760x0) obj).f30288a;
        }

        public final int hashCode() {
            boolean z = this.f30288a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("FetchSingleListingCart(isGooglePay="), this.f30288a, ')');
        }
    }

    /* renamed from: vc.g$x1 */
    public static final class C13761x1 extends C13597g {

        /* renamed from: a */
        public static final C13761x1 f30289a = new C13761x1();
    }

    /* renamed from: vc.g$x2 */
    public static final class C13762x2 extends C13597g {

        /* renamed from: a */
        public final String f30290a;

        /* renamed from: b */
        public final String f30291b;

        /* renamed from: c */
        public final com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState f30292c;

        /* renamed from: d */
        public final boolean f30293d;

        public C13762x2(String str, String str2, com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState machineTranslationViewState, boolean z) {
            C19383o.m32797g(machineTranslationViewState, "machineTranslationViewState");
            this.f30290a = str;
            this.f30291b = str2;
            this.f30292c = machineTranslationViewState;
            this.f30293d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13762x2)) {
                return false;
            }
            C13762x2 x2Var = (C13762x2) obj;
            return C19383o.m32792b(this.f30290a, x2Var.f30290a) && C19383o.m32792b(this.f30291b, x2Var.f30291b) && this.f30292c == x2Var.f30292c && this.f30293d == x2Var.f30293d;
        }

        public final int hashCode() {
            String str = this.f30290a;
            int hashCode = (this.f30292c.hashCode() + C0023f.m105e(this.f30291b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
            boolean z = this.f30293d;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ReadItemDescriptionClicked(title=");
            h.append(this.f30290a);
            h.append(", description=");
            h.append(this.f30291b);
            h.append(", machineTranslationViewState=");
            h.append(this.f30292c);
            h.append(", isShowingTranslatedContent=");
            return C0391c.m1058d(h, this.f30293d, ')');
        }
    }

    /* renamed from: vc.g$x3 */
    public static final class C13763x3 extends C13597g {

        /* renamed from: a */
        public final C10207g f30294a;

        public C13763x3(C10207g gVar) {
            this.f30294a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13763x3) && C19383o.m32792b(this.f30294a, ((C13763x3) obj).f30294a);
        }

        public final int hashCode() {
            return this.f30294a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShowAddToCartInterstitial(uiModel=");
            h.append(this.f30294a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.g$x4 */
    public static final class C13764x4 extends C13597g {

        /* renamed from: a */
        public static final C13764x4 f30295a = new C13764x4();
    }

    /* renamed from: vc.g$y */
    public static final class C13765y extends C13597g {

        /* renamed from: a */
        public static final C13765y f30296a = new C13765y();
    }

    /* renamed from: vc.g$y0 */
    public static final class C13766y0 extends C13597g {

        /* renamed from: a */
        public static final C13766y0 f30297a = new C13766y0();
    }

    /* renamed from: vc.g$y1 */
    public static final class C13767y1 extends C13597g {

        /* renamed from: a */
        public final boolean f30298a;

        public C13767y1(boolean z) {
            this.f30298a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13767y1) && this.f30298a == ((C13767y1) obj).f30298a;
        }

        public final int hashCode() {
            boolean z = this.f30298a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("LottieNudgeVisibilityChanged(isFullyVisible="), this.f30298a, ')');
        }
    }

    /* renamed from: vc.g$y2 */
    public static final class C13768y2 extends C13597g {

        /* renamed from: a */
        public static final C13768y2 f30299a = new C13768y2();
    }

    /* renamed from: vc.g$y3 */
    public static final class C13769y3 extends C13597g {

        /* renamed from: a */
        public static final C13769y3 f30300a = new C13769y3();
    }

    /* renamed from: vc.g$y4 */
    public static final class C13770y4 extends C13597g {

        /* renamed from: a */
        public static final C13770y4 f30301a = new C13770y4();
    }

    /* renamed from: vc.g$z */
    public static final class C13771z extends C13597g {

        /* renamed from: a */
        public static final C13771z f30302a = new C13771z();
    }

    /* renamed from: vc.g$z0 */
    public static final class C13772z0 extends C13597g {

        /* renamed from: a */
        public final String f30303a;

        public C13772z0(String str) {
            C19383o.m32797g(str, "url");
            this.f30303a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13772z0) && C19383o.m32792b(this.f30303a, ((C13772z0) obj).f30303a);
        }

        public final int hashCode() {
            return this.f30303a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("FreeShippingUrlClicked(url="), this.f30303a, ')');
        }
    }

    /* renamed from: vc.g$z1 */
    public static final class C13773z1 extends C13597g {

        /* renamed from: a */
        public final long f30304a;

        /* renamed from: b */
        public final boolean f30305b;

        public C13773z1(long j, boolean z) {
            this.f30304a = j;
            this.f30305b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13773z1)) {
                return false;
            }
            C13773z1 z1Var = (C13773z1) obj;
            return this.f30304a == z1Var.f30304a && this.f30305b == z1Var.f30305b;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f30304a) * 31;
            boolean z = this.f30305b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MarkListingAsFavorite(listingId=");
            h.append(this.f30304a);
            h.append(", isFavorite=");
            return C0391c.m1058d(h, this.f30305b, ')');
        }
    }

    /* renamed from: vc.g$z2 */
    public static final class C13774z2 extends C13597g {

        /* renamed from: a */
        public static final C13774z2 f30306a = new C13774z2();
    }

    /* renamed from: vc.g$z3 */
    public static final class C13775z3 extends C13597g {

        /* renamed from: a */
        public final int f30307a;

        public C13775z3(int i) {
            this.f30307a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13775z3) && this.f30307a == ((C13775z3) obj).f30307a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30307a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("ShowPersonalizationInputError(errorRes="), this.f30307a, ')');
        }
    }

    /* renamed from: vc.g$z4 */
    public static final class C13776z4 extends C13597g {

        /* renamed from: a */
        public static final C13776z4 f30308a = new C13776z4();
    }

    /* renamed from: vc.g$a0 */
    public static final class C13599a0 extends C13597g {

        /* renamed from: a */
        public final String f30069a;

        public C13599a0(String str) {
            this.f30069a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13599a0) && C19383o.m32792b(this.f30069a, ((C13599a0) obj).f30069a);
        }

        public final int hashCode() {
            String str = this.f30069a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ErrorUpdatingOffering(errorMessage="), this.f30069a, ')');
        }

        public C13599a0() {
            this((String) null);
        }
    }

    /* renamed from: vc.g$d1 */
    public static final class C13621d1 extends C13597g {

        /* renamed from: a */
        public final SingleListingCart f30096a;

        public C13621d1(SingleListingCart singleListingCart) {
            this.f30096a = singleListingCart;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13621d1) && C19383o.m32792b(this.f30096a, ((C13621d1) obj).f30096a);
        }

        public final int hashCode() {
            SingleListingCart singleListingCart = this.f30096a;
            if (singleListingCart == null) {
                return 0;
            }
            return singleListingCart.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("GooglePayExpressCheckout(singleListingCart=");
            h.append(this.f30096a);
            h.append(')');
            return h.toString();
        }

        public C13621d1() {
            this((SingleListingCart) null);
        }
    }

    /* renamed from: vc.g$e0 */
    public static final class C13627e0 extends C13597g {

        /* renamed from: a */
        public final String f30103a;

        public C13627e0(String str) {
            this.f30103a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13627e0) && C19383o.m32792b(this.f30103a, ((C13627e0) obj).f30103a);
        }

        public final int hashCode() {
            String str = this.f30103a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("EstimatedDeliveryClicked(body="), this.f30103a, ')');
        }

        public C13627e0() {
            this((String) null);
        }
    }

    /* renamed from: vc.g$j */
    public static final class C13661j extends C13597g {

        /* renamed from: a */
        public final boolean f30154a;

        public C13661j(boolean z) {
            this.f30154a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13661j) && this.f30154a == ((C13661j) obj).f30154a;
        }

        public final int hashCode() {
            boolean z = this.f30154a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("AttemptToFavoriteThisListing(shouldShowAnimation="), this.f30154a, ')');
        }

        public C13661j() {
            this(true);
        }
    }

    /* renamed from: vc.g$r */
    public static final class C13717r extends C13597g {

        /* renamed from: a */
        public final boolean f30233a;

        public C13717r(boolean z) {
            this.f30233a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13717r) && this.f30233a == ((C13717r) obj).f30233a;
        }

        public final int hashCode() {
            boolean z = this.f30233a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("ContactThisShop(includeListingDetails="), this.f30233a, ')');
        }

        public C13717r() {
            this(true);
        }
    }

    /* renamed from: vc.g$r5 */
    public static final class C13723r5 extends C13597g {

        /* renamed from: a */
        public final boolean f30242a;

        public C13723r5(boolean z) {
            this.f30242a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13723r5) && this.f30242a == ((C13723r5) obj).f30242a;
        }

        public final int hashCode() {
            boolean z = this.f30242a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return C0391c.m1058d(C0072d.m201h("VideoStarted(shouldLogVideoStart="), this.f30242a, ')');
        }

        public C13723r5() {
            this(false);
        }
    }

    /* renamed from: vc.g$w */
    public static final class C13752w extends C13597g {

        /* renamed from: a */
        public final SingleListingCart f30280a;

        public C13752w(SingleListingCart singleListingCart) {
            this.f30280a = singleListingCart;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13752w) && C19383o.m32792b(this.f30280a, ((C13752w) obj).f30280a);
        }

        public final int hashCode() {
            SingleListingCart singleListingCart = this.f30280a;
            if (singleListingCart == null) {
                return 0;
            }
            return singleListingCart.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("DialogExpressCheckout(singleListingCart=");
            h.append(this.f30280a);
            h.append(')');
            return h.toString();
        }

        public C13752w() {
            this((SingleListingCart) null);
        }
    }

    /* renamed from: vc.g$f */
    public static final class C13633f extends C13597g {

        /* renamed from: a */
        public final String f30111a;

        /* renamed from: b */
        public final Map<AnalyticsProperty, Object> f30112b;

        public C13633f(String str, Map<AnalyticsProperty, ? extends Object> map) {
            C19383o.m32797g(str, "eventName");
            C19383o.m32797g(map, "parameters");
            this.f30111a = str;
            this.f30112b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13633f)) {
                return false;
            }
            C13633f fVar = (C13633f) obj;
            return C19383o.m32792b(this.f30111a, fVar.f30111a) && C19383o.m32792b(this.f30112b, fVar.f30112b);
        }

        public final int hashCode() {
            return this.f30112b.hashCode() + (this.f30111a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AnalyticsAdHocEvent(eventName=");
            h.append(this.f30111a);
            h.append(", parameters=");
            h.append(this.f30112b);
            h.append(')');
            return h.toString();
        }

        public /* synthetic */ C13633f(String str) {
            this(str, C19294b0.m32559p0());
        }
    }
}
