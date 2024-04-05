package com.etsy.android.p327ui.listing.p329ui.panels.reviews;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.ReviewVideo;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.Shop;
import com.etsy.android.lib.models.apiv3.listing.ShopHighlight;
import com.etsy.android.lib.models.apiv3.listing.ShopRating;
import com.etsy.android.lib.models.apiv3.listing.ShopReview;
import com.etsy.android.lib.models.apiv3.listing.ShopTransaction;
import com.etsy.android.lib.models.apiv3.listing.ShopsReviewsUserCard;
import com.etsy.android.lib.models.apiv3.listing.Subratings;
import com.etsy.android.lib.models.apiv3.listing.TransactionReview;
import com.etsy.android.lib.models.apiv3.listing.Video;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;
import p003a2.C0023f;
import p498zc.C13949d;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.a */
public final class C10521a extends C10423j implements C13949d {

    /* renamed from: a */
    public final long f23083a;

    /* renamed from: b */
    public final Reviews f23084b;

    /* renamed from: c */
    public final List<ReviewUiModel> f23085c;

    /* renamed from: d */
    public final List<ReviewUiModel> f23086d;

    /* renamed from: e */
    public final int f23087e;

    /* renamed from: f */
    public final int f23088f;

    /* renamed from: g */
    public final float f23089g;

    /* renamed from: h */
    public final ShopRating f23090h;

    /* renamed from: i */
    public final ShopHighlight f23091i;

    /* renamed from: j */
    public final Subratings f23092j;

    /* renamed from: k */
    public final Reviews.ReviewType f23093k;

    /* renamed from: l */
    public final boolean f23094l;

    /* renamed from: m */
    public final boolean f23095m;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.a$a */
    public static final class C10522a {
        /* renamed from: a */
        public static C10521a m18494a(ListingFetch listingFetch) {
            Long shopId;
            Float rating;
            List<ShopReview> listingReviews;
            Date date;
            Boolean isSellerApproved;
            Float rating2;
            Shop shop = listingFetch.getShop();
            Subratings subratings = null;
            if (shop == null || (shopId = shop.getShopId()) == null) {
                return null;
            }
            long longValue = shopId.longValue();
            Shop shop2 = listingFetch.getShop();
            ShopHighlight shopHighlight = shop2 != null ? shop2.getShopHighlight() : null;
            Reviews reviews = listingFetch.getReviews();
            if (reviews == null) {
                return null;
            }
            List<ReviewVideo> reviewVideos = listingFetch.getReviewVideos();
            if (reviewVideos != null) {
                reviews.setListingReviewVideos(reviewVideos);
            }
            ArrayList arrayList = new ArrayList();
            Reviews reviews2 = listingFetch.getReviews();
            if (!(reviews2 == null || (listingReviews = reviews2.getListingReviews()) == null)) {
                for (ShopReview shopReview : listingReviews) {
                    C19383o.m32797g(shopReview, "<this>");
                    TransactionReview review = shopReview.getReview();
                    if ((review != null ? review.getCreateDate() : null) != null) {
                        TransactionReview review2 = shopReview.getReview();
                        Long createDate = review2 != null ? review2.getCreateDate() : null;
                        C19383o.m32794d(createDate);
                        date = new Date(createDate.longValue() * 1000);
                    } else {
                        date = null;
                    }
                    ShopsReviewsUserCard buyerUser = shopReview.getBuyerUser();
                    Long userId = buyerUser != null ? buyerUser.getUserId() : null;
                    ShopsReviewsUserCard buyerUser2 = shopReview.getBuyerUser();
                    String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(buyerUser2 != null ? buyerUser2.getRealNameOrLoginName() : null);
                    ShopsReviewsUserCard buyerUser3 = shopReview.getBuyerUser();
                    String avatarUrl = buyerUser3 != null ? buyerUser3.getAvatarUrl() : null;
                    ShopsReviewsUserCard buyerUser4 = shopReview.getBuyerUser();
                    String profileUrl = buyerUser4 != null ? buyerUser4.getProfileUrl() : null;
                    TransactionReview review3 = shopReview.getReview();
                    Float valueOf = Float.valueOf((review3 == null || (rating2 = review3.getRating()) == null) ? 0.0f : rating2.floatValue());
                    TransactionReview review4 = shopReview.getReview();
                    String unescapeHtml42 = StringEscapeUtils.unescapeHtml4(review4 != null ? review4.getReview() : null);
                    TransactionReview review5 = shopReview.getReview();
                    String unescapeHtml43 = StringEscapeUtils.unescapeHtml4(review5 != null ? review5.getTranslatedReview() : null);
                    TransactionReview review6 = shopReview.getReview();
                    MachineTranslationViewState machineTranslationViewState = new MachineTranslationViewState(review6 != null ? review6.getTranslatedReview() : null);
                    TransactionReview review7 = shopReview.getReview();
                    String language = review7 != null ? review7.getLanguage() : null;
                    AppreciationPhoto appreciationPhoto = shopReview.getAppreciationPhoto();
                    boolean booleanValue = (appreciationPhoto == null || (isSellerApproved = appreciationPhoto.isSellerApproved()) == null) ? false : isSellerApproved.booleanValue();
                    AppreciationPhoto appreciationPhoto2 = shopReview.getAppreciationPhoto();
                    Video appreciationVideo = shopReview.getAppreciationVideo();
                    ShopTransaction transaction = shopReview.getTransaction();
                    Long transactionId = transaction != null ? transaction.getTransactionId() : null;
                    TransactionReview review8 = shopReview.getReview();
                    Long listingId = review8 != null ? review8.getListingId() : null;
                    ShopTransaction transaction2 = shopReview.getTransaction();
                    String unescapeHtml44 = StringEscapeUtils.unescapeHtml4(transaction2 != null ? transaction2.getTitle() : null);
                    ShopTransaction transaction3 = shopReview.getTransaction();
                    String imageUrl150x150 = transaction3 != null ? transaction3.getImageUrl150x150() : null;
                    ShopTransaction transaction4 = shopReview.getTransaction();
                    String imageUrlSmall = transaction4 != null ? transaction4.getImageUrlSmall() : null;
                    ShopsReviewsUserCard shopUser = shopReview.getShopUser();
                    String unescapeHtml45 = StringEscapeUtils.unescapeHtml4(shopUser != null ? shopUser.getRealNameOrLoginName() : null);
                    ShopsReviewsUserCard shopUser2 = shopReview.getShopUser();
                    String avatarUrl2 = shopUser2 != null ? shopUser2.getAvatarUrl() : null;
                    ShopTransaction transaction5 = shopReview.getTransaction();
                    arrayList.add(new ReviewUiModel(userId, unescapeHtml4, avatarUrl, profileUrl, date, valueOf, unescapeHtml42, unescapeHtml43, machineTranslationViewState, language, booleanValue, appreciationPhoto2, appreciationVideo, transactionId, listingId, unescapeHtml44, imageUrl150x150, imageUrlSmall, unescapeHtml45, avatarUrl2, StringEscapeUtils.unescapeHtml4(transaction5 != null ? transaction5.getResponse() : null), (Date) null));
                }
            }
            int totalListingReviewsCount = reviews.getTotalListingReviewsCount();
            int totalShopReviewsCount = reviews.getTotalShopReviewsCount();
            ShopRating shopRating = listingFetch.getShopRating();
            ShopRating shopRating2 = listingFetch.getShopRating();
            float floatValue = (shopRating2 == null || (rating = shopRating2.getRating()) == null) ? 0.0f : rating.floatValue();
            ShopRating shopRating3 = listingFetch.getShopRating();
            if (shopRating3 != null) {
                subratings = shopRating3.getSubratings();
            }
            return new C10521a(longValue, reviews, arrayList, (List) null, totalListingReviewsCount, totalShopReviewsCount, floatValue, shopRating, shopHighlight, subratings, (Reviews.ReviewType) null, false, 7176);
        }
    }

    public C10521a() {
        throw null;
    }

    public C10521a(long j, Reviews reviews, List list, List list2, int i, int i2, float f, ShopRating shopRating, ShopHighlight shopHighlight, Subratings subratings, Reviews.ReviewType reviewType, boolean z, int i3) {
        Reviews reviews2 = reviews;
        int i4 = i3;
        Subratings subratings2 = null;
        List list3 = (i4 & 4) != 0 ? null : list;
        List list4 = (i4 & 8) != 0 ? EmptyList.INSTANCE : list2;
        int i5 = (i4 & 16) != 0 ? 0 : i;
        int i6 = (i4 & 32) != 0 ? 0 : i2;
        float f2 = (i4 & 64) != 0 ? 0.0f : f;
        ShopRating shopRating2 = (i4 & 128) != 0 ? null : shopRating;
        ShopHighlight shopHighlight2 = (i4 & 256) != 0 ? null : shopHighlight;
        subratings2 = (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) == 0 ? subratings : subratings2;
        Reviews.ReviewType reviewType2 = (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? Reviews.ReviewType.LISTING : reviewType;
        boolean z2 = (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? true : z;
        C19383o.m32797g(reviews2, ResponseConstants.REVIEWS);
        C19383o.m32797g(list4, "translatedReviews");
        C19383o.m32797g(reviewType2, "selectedReviewType");
        this.f23083a = j;
        this.f23084b = reviews2;
        this.f23085c = list3;
        this.f23086d = list4;
        this.f23087e = i5;
        this.f23088f = i6;
        this.f23089g = f2;
        this.f23090h = shopRating2;
        this.f23091i = shopHighlight2;
        this.f23092j = subratings2;
        this.f23093k = reviewType2;
        this.f23094l = z2;
        this.f23095m = false;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.REVIEWS_PANEL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10521a)) {
            return false;
        }
        C10521a aVar = (C10521a) obj;
        return this.f23083a == aVar.f23083a && C19383o.m32792b(this.f23084b, aVar.f23084b) && C19383o.m32792b(this.f23085c, aVar.f23085c) && C19383o.m32792b(this.f23086d, aVar.f23086d) && this.f23087e == aVar.f23087e && this.f23088f == aVar.f23088f && C19383o.m32792b(Float.valueOf(this.f23089g), Float.valueOf(aVar.f23089g)) && C19383o.m32792b(this.f23090h, aVar.f23090h) && C19383o.m32792b(this.f23091i, aVar.f23091i) && C19383o.m32792b(this.f23092j, aVar.f23092j) && this.f23093k == aVar.f23093k && this.f23094l == aVar.f23094l && this.f23095m == aVar.f23095m;
    }

    public final int hashCode() {
        int hashCode = (this.f23084b.hashCode() + (Long.hashCode(this.f23083a) * 31)) * 31;
        List<ReviewUiModel> list = this.f23085c;
        int i = 0;
        int c = C0023f.m104c(this.f23089g, C0069a.m170a(this.f23088f, C0069a.m170a(this.f23087e, C13983i.m21488g(this.f23086d, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31);
        ShopRating shopRating = this.f23090h;
        int hashCode2 = (c + (shopRating == null ? 0 : shopRating.hashCode())) * 31;
        ShopHighlight shopHighlight = this.f23091i;
        int hashCode3 = (hashCode2 + (shopHighlight == null ? 0 : shopHighlight.hashCode())) * 31;
        Subratings subratings = this.f23092j;
        if (subratings != null) {
            i = subratings.hashCode();
        }
        int hashCode4 = (this.f23093k.hashCode() + ((hashCode3 + i) * 31)) * 31;
        boolean z = this.f23094l;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f23095m;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewsPanel(shopId=");
        h.append(this.f23083a);
        h.append(", reviews=");
        h.append(this.f23084b);
        h.append(", listingReviews=");
        h.append(this.f23085c);
        h.append(", translatedReviews=");
        h.append(this.f23086d);
        h.append(", listingReviewsCount=");
        h.append(this.f23087e);
        h.append(", shopReviewsCount=");
        h.append(this.f23088f);
        h.append(", shopAverageRating=");
        h.append(this.f23089g);
        h.append(", shopRating=");
        h.append(this.f23090h);
        h.append(", shopHighlight=");
        h.append(this.f23091i);
        h.append(", subratings=");
        h.append(this.f23092j);
        h.append(", selectedReviewType=");
        h.append(this.f23093k);
        h.append(", isExpanded=");
        h.append(this.f23094l);
        h.append(", showBuyerVideosAlert=");
        return C0391c.m1058d(h, this.f23095m, ')');
    }
}
