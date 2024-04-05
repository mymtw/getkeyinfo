package com.etsy.android.feedback;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.feedback.data.Rating;
import com.etsy.android.feedback.data.SortType;
import com.etsy.android.lib.logger.elk.uploading.C8683d;
import com.etsy.android.lib.models.RatingsPercents;
import com.etsy.android.lib.models.ReceiptReview;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Review;
import com.etsy.android.lib.models.Shop;
import com.etsy.android.lib.models.apiv3.listing.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.Video;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.cart.C9243b;
import com.etsy.android.p327ui.shop.C11129a1;
import com.etsy.android.p327ui.shop.C11132b1;
import com.etsy.android.p327ui.shop.C11201t;
import com.etsy.android.p327ui.shop.C11309y0;
import com.etsy.android.p327ui.shop.ReviewsModelVariant;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.search.savedsearch.C8981e;
import com.etsy.android.util.C12059p;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p131h9.C6962a;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p277w8.C8264b;
import p277w8.C8266d;
import p321cc.C8569c;
import p321cc.C8579d;
import p425q9.C13250b;
import p425q9.C13265p;
import p456ua.C13458c;
import p456ua.C13459d;
import p456ua.C13461f;
import p486y9.C13888d;
import p628nj.C18263b;
import retrofit2.C20145v;

public final class FeedbackViewModel extends C2866i0 {

    /* renamed from: b */
    public final C6462g f14264b;

    /* renamed from: c */
    public final C8569c f14265c;

    /* renamed from: d */
    public final C11309y0 f14266d;

    /* renamed from: e */
    public final C11132b1 f14267e;

    /* renamed from: f */
    public final C11201t f14268f;

    /* renamed from: g */
    public final C13888d f14269g;

    /* renamed from: h */
    public final C13265p f14270h;

    /* renamed from: i */
    public final C13461f f14271i;

    /* renamed from: j */
    public final boolean f14272j;

    /* renamed from: k */
    public final C6473r f14273k;

    /* renamed from: l */
    public final C11786n f14274l;

    /* renamed from: m */
    public final C2895z<C6440b> f14275m;

    /* renamed from: n */
    public final C2895z f14276n;

    /* renamed from: o */
    public final C2895z<C12059p<C6438a>> f14277o;

    /* renamed from: p */
    public final C2895z f14278p;

    /* renamed from: q */
    public Shop f14279q;

    /* renamed from: r */
    public C6962a f14280r = new C6962a(SortType.RECOMMENDED, Rating.NONE, false, false, false);

    /* renamed from: s */
    public final C2895z<C6448c> f14281s;

    /* renamed from: t */
    public final C2895z f14282t;

    /* renamed from: u */
    public final C7091a f14283u;

    /* renamed from: v */
    public final C2895z<Boolean> f14284v;

    /* renamed from: w */
    public final C2895z f14285w;

    /* renamed from: com.etsy.android.feedback.FeedbackViewModel$a */
    public static abstract class C6438a {

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$a$a */
        public static final class C6439a extends C6438a {

            /* renamed from: a */
            public final String f14286a;

            /* renamed from: b */
            public final String f14287b;

            /* renamed from: c */
            public final Long f14288c;

            /* renamed from: d */
            public final String f14289d;

            /* renamed from: e */
            public final String f14290e;

            public C6439a(Long l, String str, String str2, String str3, String str4) {
                this.f14286a = str;
                this.f14287b = str2;
                this.f14288c = l;
                this.f14289d = str3;
                this.f14290e = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6439a)) {
                    return false;
                }
                C6439a aVar = (C6439a) obj;
                return C19383o.m32792b(this.f14286a, aVar.f14286a) && C19383o.m32792b(this.f14287b, aVar.f14287b) && C19383o.m32792b(this.f14288c, aVar.f14288c) && C19383o.m32792b(this.f14289d, aVar.f14289d) && C19383o.m32792b(this.f14290e, aVar.f14290e);
            }

            public final int hashCode() {
                String str = this.f14286a;
                int i = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f14287b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Long l = this.f14288c;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                String str3 = this.f14289d;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f14290e;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return hashCode4 + i;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("ContactShop(username=");
                h.append(this.f14286a);
                h.append(", userDisplayName=");
                h.append(this.f14287b);
                h.append(", userId=");
                h.append(this.f14288c);
                h.append(", subject=");
                h.append(this.f14289d);
                h.append(", message=");
                return C0391c.m1057c(h, this.f14290e, ')');
            }
        }
    }

    /* renamed from: com.etsy.android.feedback.FeedbackViewModel$b */
    public static abstract class C6440b {

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$b$a */
        public static final class C6441a extends C6440b {

            /* renamed from: a */
            public static final C6441a f14291a = new C6441a();
        }

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$b$b */
        public static final class C6442b extends C6440b {

            /* renamed from: a */
            public static final C6442b f14292a = new C6442b();
        }

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$b$c */
        public static final class C6443c extends C6440b {

            /* renamed from: a */
            public final List<ReviewUiModel> f14293a;

            /* renamed from: b */
            public final int f14294b;

            /* renamed from: c */
            public final int f14295c;

            /* renamed from: d */
            public final RatingsPercents f14296d;

            public C6443c(ArrayList arrayList, int i, int i2, RatingsPercents ratingsPercents) {
                this.f14293a = arrayList;
                this.f14294b = i;
                this.f14295c = i2;
                this.f14296d = ratingsPercents;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6443c)) {
                    return false;
                }
                C6443c cVar = (C6443c) obj;
                return C19383o.m32792b(this.f14293a, cVar.f14293a) && this.f14294b == cVar.f14294b && this.f14295c == cVar.f14295c && C19383o.m32792b(this.f14296d, cVar.f14296d);
            }

            public final int hashCode() {
                int a = C0069a.m170a(this.f14295c, C0069a.m170a(this.f14294b, this.f14293a.hashCode() * 31, 31), 31);
                RatingsPercents ratingsPercents = this.f14296d;
                return a + (ratingsPercents == null ? 0 : ratingsPercents.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Loaded(reviews=");
                h.append(this.f14293a);
                h.append(", maxCount=");
                h.append(this.f14294b);
                h.append(", filteredCount=");
                h.append(this.f14295c);
                h.append(", starsPercent=");
                h.append(this.f14296d);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$b$d */
        public static final class C6444d extends C6440b {

            /* renamed from: a */
            public final Shop f14297a;

            public C6444d(Shop shop) {
                C19383o.m32797g(shop, ResponseConstants.SHOP);
                this.f14297a = shop;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6444d) && C19383o.m32792b(this.f14297a, ((C6444d) obj).f14297a);
            }

            public final int hashCode() {
                return this.f14297a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("LoadedShop(shop=");
                h.append(this.f14297a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$b$e */
        public static final class C6445e extends C6440b {

            /* renamed from: a */
            public static final C6445e f14298a = new C6445e();
        }

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$b$f */
        public static final class C6446f extends C6440b {

            /* renamed from: a */
            public final ReviewUiModel f14299a;

            public C6446f(ReviewUiModel reviewUiModel) {
                C19383o.m32797g(reviewUiModel, "translatedReview");
                this.f14299a = reviewUiModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6446f) && C19383o.m32792b(this.f14299a, ((C6446f) obj).f14299a);
            }

            public final int hashCode() {
                return this.f14299a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("ReviewTranslated(translatedReview=");
                h.append(this.f14299a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$b$g */
        public static final class C6447g extends C6440b {

            /* renamed from: a */
            public final ReviewUiModel f14300a;

            public C6447g(ReviewUiModel reviewUiModel) {
                C19383o.m32797g(reviewUiModel, "review");
                this.f14300a = reviewUiModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6447g) && C19383o.m32792b(this.f14300a, ((C6447g) obj).f14300a);
            }

            public final int hashCode() {
                return this.f14300a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("TranslationError(review=");
                h.append(this.f14300a);
                h.append(')');
                return h.toString();
            }
        }
    }

    /* renamed from: com.etsy.android.feedback.FeedbackViewModel$c */
    public static abstract class C6448c {

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$c$a */
        public static final class C6449a extends C6448c {

            /* renamed from: a */
            public final C6962a f14301a;

            public C6449a(C6962a aVar) {
                C19383o.m32797g(aVar, "sortFiltersData");
                this.f14301a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6449a) && C19383o.m32792b(this.f14301a, ((C6449a) obj).f14301a);
            }

            public final int hashCode() {
                return this.f14301a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("InitialSortFilters(sortFiltersData=");
                h.append(this.f14301a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$c$b */
        public static final class C6450b extends C6448c {

            /* renamed from: a */
            public final Rating f14302a;

            public C6450b(Rating rating) {
                C19383o.m32797g(rating, "currentRating");
                this.f14302a = rating;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6450b) && this.f14302a == ((C6450b) obj).f14302a;
            }

            public final int hashCode() {
                return this.f14302a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("RatingSelection(currentRating=");
                h.append(this.f14302a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$c$c */
        public static final class C6451c extends C6448c {

            /* renamed from: a */
            public final C6962a f14303a;

            public C6451c(C6962a aVar) {
                this.f14303a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6451c) && C19383o.m32792b(this.f14303a, ((C6451c) obj).f14303a);
            }

            public final int hashCode() {
                return this.f14303a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("SortFiltersUpdated(sortFiltersData=");
                h.append(this.f14303a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.feedback.FeedbackViewModel$c$d */
        public static final class C6452d extends C6448c {

            /* renamed from: a */
            public final SortType f14304a;

            public C6452d(SortType sortType) {
                C19383o.m32797g(sortType, "currentSort");
                this.f14304a = sortType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6452d) && this.f14304a == ((C6452d) obj).f14304a;
            }

            public final int hashCode() {
                return this.f14304a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("SortingSelection(currentSort=");
                h.append(this.f14304a);
                h.append(')');
                return h.toString();
            }
        }
    }

    public FeedbackViewModel(C6462g gVar, C8569c cVar, C11309y0 y0Var, C11132b1 b1Var, C11201t tVar, C13888d dVar, C13265p pVar, C13461f fVar, boolean z, C6473r rVar, C11786n nVar) {
        C19383o.m32797g(gVar, "data");
        C19383o.m32797g(cVar, "listingRepository");
        C19383o.m32797g(y0Var, "shopInfoRepository");
        C19383o.m32797g(b1Var, "shopReviewsRepository");
        C19383o.m32797g(tVar, "reviewsTranslationRepository");
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(rVar, "reviewsEligibility");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f14264b = gVar;
        this.f14265c = cVar;
        this.f14266d = y0Var;
        this.f14267e = b1Var;
        this.f14268f = tVar;
        this.f14269g = dVar;
        this.f14270h = pVar;
        this.f14271i = fVar;
        this.f14272j = z;
        this.f14273k = rVar;
        this.f14274l = nVar;
        C2895z<C6440b> zVar = new C2895z<>();
        this.f14275m = zVar;
        this.f14276n = zVar;
        C2895z<C12059p<C6438a>> zVar2 = new C2895z<>();
        this.f14277o = zVar2;
        this.f14278p = zVar2;
        C2895z<C6448c> zVar3 = new C2895z<>(new C6448c.C6449a(this.f14280r));
        this.f14281s = zVar3;
        this.f14282t = zVar3;
        this.f14283u = new C7091a();
        C2895z<Boolean> zVar4 = new C2895z<>(Boolean.FALSE);
        this.f14284v = zVar4;
        this.f14285w = zVar4;
    }

    /* renamed from: b */
    public static final void m12873b(FeedbackViewModel feedbackViewModel, ReviewUiModel reviewUiModel) {
        feedbackViewModel.getClass();
        reviewUiModel.getTranslationState().setTranslationFailed();
        feedbackViewModel.f14275m.postValue(new C6440b.C6447g(ReviewUiModel.copy$default(reviewUiModel, (Long) null, (String) null, (String) null, (String) null, (Date) null, (Float) null, (String) null, (String) null, reviewUiModel.getTranslationState(), (String) null, false, (AppreciationPhoto) null, (Video) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, 4194047, (Object) null)));
    }

    /* renamed from: d */
    public static ArrayList m12874d(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReceiptReview receiptReview = (ReceiptReview) it.next();
            if (receiptReview.getReviews().size() > 1) {
                List<Review> reviews = receiptReview.getReviews();
                C19383o.m32796f(reviews, "receiptReview.reviews");
                for (Review cloneWithSingleReview : reviews) {
                    ReceiptReview cloneWithSingleReview2 = receiptReview.cloneWithSingleReview(cloneWithSingleReview);
                    C19383o.m32796f(cloneWithSingleReview2, "receiptReview\n          …eWithSingleReview(review)");
                    arrayList.add(C18263b.m30811F(cloneWithSingleReview2, str, str2));
                }
            } else {
                arrayList.add(C18263b.m30811F(receiptReview, str, str2));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = (r0 = r0.getShopUserProfile()).getUserId();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18344c() {
        /*
            r9 = this;
            com.etsy.android.lib.models.Shop r0 = r9.f14279q
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.etsy.android.lib.models.apiv3.UserProfileV3 r0 = r0.getShopUserProfile()
            if (r0 == 0) goto L_0x001a
            com.etsy.android.lib.models.datatypes.EtsyId r0 = r0.getUserId()
            if (r0 == 0) goto L_0x001a
            long r2 = r0.getIdAsLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            if (r0 != 0) goto L_0x0021
            com.etsy.android.feedback.g r0 = r9.f14264b
            java.lang.Long r0 = r0.f14334f
        L_0x0021:
            r3 = r0
            com.etsy.android.lib.models.Shop r0 = r9.f14279q
            if (r0 == 0) goto L_0x0031
            com.etsy.android.lib.models.apiv3.UserProfileV3 r0 = r0.getShopUserProfile()
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.getLoginName()
            goto L_0x0032
        L_0x0031:
            r0 = r1
        L_0x0032:
            if (r0 != 0) goto L_0x0038
            com.etsy.android.feedback.g r0 = r9.f14264b
            java.lang.String r0 = r0.f14336h
        L_0x0038:
            r4 = r0
            com.etsy.android.lib.models.Shop r0 = r9.f14279q
            if (r0 == 0) goto L_0x0048
            com.etsy.android.lib.models.apiv3.UserProfileV3 r0 = r0.getShopUserProfile()
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r0.getDisplayName()
            goto L_0x0049
        L_0x0048:
            r0 = r1
        L_0x0049:
            if (r0 != 0) goto L_0x004f
            com.etsy.android.feedback.g r0 = r9.f14264b
            java.lang.String r0 = r0.f14337i
        L_0x004f:
            r5 = r0
            com.etsy.android.feedback.g r0 = r9.f14264b
            java.lang.String r2 = r0.f14335g
            if (r2 == 0) goto L_0x0078
            java.lang.String r0 = r0.f14331c
            if (r0 == 0) goto L_0x0078
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.etsy.android.feedback.g r2 = r9.f14264b
            java.lang.String r2 = r2.f14335g
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            com.etsy.android.feedback.g r2 = r9.f14264b
            java.lang.String r2 = r2.f14331c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6 = r0
            goto L_0x0079
        L_0x0078:
            r6 = r1
        L_0x0079:
            com.etsy.android.feedback.g r0 = r9.f14264b
            java.lang.String r0 = r0.f14332d
            if (r0 == 0) goto L_0x008e
            com.etsy.android.ui.util.n r1 = r9.f14274l
            r2 = 2131952449(0x7f130341, float:1.9541341E38)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r0
            java.lang.String r1 = r1.mo38059c(r2, r7)
        L_0x008e:
            r7 = r1
            if (r3 == 0) goto L_0x009c
            androidx.lifecycle.z<com.etsy.android.util.p<com.etsy.android.feedback.FeedbackViewModel$a>> r0 = r9.f14277o
            com.etsy.android.feedback.FeedbackViewModel$a$a r1 = new com.etsy.android.feedback.FeedbackViewModel$a$a
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            com.etsy.android.util.C12060q.m19870a(r0, r1)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.FeedbackViewModel.mo18344c():void");
    }

    /* renamed from: e */
    public final void mo18345e(String str, int i, String str2, boolean z) {
        C8579d dVar;
        C8569c cVar = this.f14265c;
        if (this.f14272j) {
            C6962a aVar = this.f14280r;
            SortType sortType = aVar.f15444a;
            Rating rating = aVar.f15445b;
            Integer num = null;
            if (rating == Rating.NONE) {
                rating = null;
            }
            boolean z2 = aVar.f15446c;
            Boolean valueOf = z2 ? Boolean.valueOf(z2) : null;
            boolean z3 = this.f14280r.f15447d;
            Boolean valueOf2 = z3 ? Boolean.valueOf(z3) : null;
            Long l = this.f14264b.f14330b;
            C19383o.m32794d(l);
            long longValue = l.longValue();
            String value = sortType.getValue();
            if (rating != null) {
                num = rating.getValue();
            }
            dVar = new C8579d(longValue, i, true, value, num, valueOf, valueOf2, Boolean.valueOf(z || C19383o.m32792b(valueOf2, Boolean.TRUE)));
        } else {
            Long l2 = this.f14264b.f14330b;
            C19383o.m32794d(l2);
            dVar = new C8579d(l2.longValue(), i, false, (String) null, (Integer) null, (Boolean) null, (Boolean) null, Boolean.FALSE);
        }
        cVar.getClass();
        C8071s<C20145v<C19928a0>> a = cVar.f18658a.mo32302a(dVar.f18666a, dVar.f18667b, dVar.f18668c, String.valueOf(dVar.f18669d), dVar.f18670e, dVar.f18671f, dVar.f18672g, dVar.f18673h, dVar.f18674i);
        C13458c cVar2 = new C13458c(cVar, 3);
        a.getClass();
        ConsumerSingleObserver g = C0391c.m1056b(this.f14271i, C0472h.m1243e(this.f14271i, new C19211l(new C19208j(a, cVar2), new C13459d(cVar, 2)))).mo20658g(new C6460e(this, str, str2), new C8264b(this, 1));
        C7091a aVar2 = this.f14283u;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(g);
    }

    /* renamed from: f */
    public final void mo18346f(String str, int i, String str2, boolean z) {
        C6462g gVar = this.f14264b;
        if (gVar.f14329a == Reviews.ReviewType.LISTING) {
            mo18345e(str, i, str2, z);
            return;
        }
        Long l = gVar.f14330b;
        String str3 = null;
        String l2 = l != null ? l.toString() : null;
        EtsyId etsyId = new EtsyId(this.f14264b.f14333e);
        this.f14270h.mo45960e();
        SortType sortType = SortType.MOST_RECENT;
        ReviewsModelVariant reviewsModelVariant = ReviewsModelVariant.CONTROL;
        C11132b1 b1Var = this.f14267e;
        b1Var.getClass();
        C11129a1 a1Var = b1Var.f24624a;
        String id = etsyId.getId();
        String value = sortType != null ? sortType.getValue() : null;
        if (reviewsModelVariant != null) {
            str3 = reviewsModelVariant.getValue();
        }
        C8071s<C20145v<C19928a0>> a = a1Var.mo36826a(id, l2, value, str3, 24, i);
        C9243b bVar = new C9243b(3);
        a.getClass();
        ConsumerSingleObserver g = C0391c.m1056b(this.f14271i, C0472h.m1243e(this.f14271i, new C19211l(new C19208j(a, bVar), new C8981e(3)))).mo20658g(new C6461f(this, str, str2), new C8266d(this, 1));
        C7091a aVar = this.f14283u;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(g);
    }

    /* renamed from: g */
    public final void mo18347g() {
        C6962a aVar = this.f14280r;
        C6962a a = C6962a.m13497a(aVar, (SortType) null, (Rating) null, !aVar.f15446c, false, false, 27);
        this.f14280r = a;
        this.f14281s.postValue(new C6448c.C6451c(a));
        C6962a aVar2 = this.f14280r;
        boolean z = aVar2.f15447d;
        if (z) {
            C6962a a2 = C6962a.m13497a(aVar2, (SortType) null, (Rating) null, false, !z, false, 23);
            this.f14280r = a2;
            this.f14281s.postValue(new C6448c.C6451c(a2));
        }
        mo18351k();
    }

    /* renamed from: h */
    public final void mo18348h() {
        C6962a aVar = this.f14280r;
        C6962a a = C6962a.m13497a(aVar, (SortType) null, (Rating) null, false, !aVar.f15447d, false, 23);
        this.f14280r = a;
        this.f14281s.postValue(new C6448c.C6451c(a));
        C6962a aVar2 = this.f14280r;
        boolean z = aVar2.f15446c;
        if (z) {
            C6962a a2 = C6962a.m13497a(aVar2, (SortType) null, (Rating) null, !z, false, false, 27);
            this.f14280r = a2;
            this.f14281s.postValue(new C6448c.C6451c(a2));
        }
        mo18351k();
    }

    /* renamed from: i */
    public final void mo18349i(ReviewUiModel reviewUiModel) {
        ReviewUiModel reviewUiModel2 = reviewUiModel;
        C19383o.m32797g(reviewUiModel2, "review");
        if (reviewUiModel.getTranslatedReview() != null) {
            reviewUiModel.getTranslationState().setTranslated();
            this.f14275m.postValue(new C6440b.C6446f(ReviewUiModel.copy$default(reviewUiModel, (Long) null, (String) null, (String) null, (String) null, (Date) null, (Float) null, (String) null, reviewUiModel.getTranslatedReview(), reviewUiModel.getTranslationState(), (String) null, false, (AppreciationPhoto) null, (Video) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Date) null, 4193919, (Object) null)));
            return;
        }
        C11201t tVar = this.f14268f;
        Long transactionId = reviewUiModel.getTransactionId();
        C19383o.m32794d(transactionId);
        EtsyId etsyId = new EtsyId(transactionId.longValue());
        C8071s<C20145v<C19928a0>> a = tVar.f24765a.mo36865a(new EtsyId(this.f14264b.f14333e), etsyId, this.f14269g.mo46717a());
        C13250b bVar = new C13250b(5);
        a.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f14271i, C0472h.m1243e(this.f14271i, new C19211l(new C19208j(a, bVar), new C8683d(4)))), new FeedbackViewModel$translateReview$1(this, reviewUiModel2), new FeedbackViewModel$translateReview$2(reviewUiModel2, this));
        C7091a aVar = this.f14283u;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getShopUserProfile();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18350j() {
        /*
            r2 = this;
            com.etsy.android.lib.models.Shop r0 = r2.f14279q
            if (r0 == 0) goto L_0x000f
            com.etsy.android.lib.models.apiv3.UserProfileV3 r0 = r0.getShopUserProfile()
            if (r0 == 0) goto L_0x000f
            com.etsy.android.lib.models.datatypes.EtsyId r0 = r0.getUserId()
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 != 0) goto L_0x001b
            com.etsy.android.feedback.g r0 = r2.f14264b
            java.lang.Long r0 = r0.f14334f
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0031
            com.etsy.android.feedback.r r0 = r2.f14273k
            com.etsy.android.lib.config.e r0 = r0.f14376a
            com.etsy.android.lib.config.EtsyConfigKey r1 = com.etsy.android.lib.config.C8592b.f18772Z0
            boolean r0 = r0.mo21132b(r1)
            if (r0 == 0) goto L_0x0031
            androidx.lifecycle.z<java.lang.Boolean> r0 = r2.f14284v
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.feedback.FeedbackViewModel.mo18350j():void");
    }

    /* renamed from: k */
    public final void mo18351k() {
        this.f14275m.postValue(C6440b.C6445e.f14298a);
        mo18345e((String) null, 0, (String) null, false);
    }

    /* renamed from: l */
    public final void mo18352l(Rating rating) {
        C19383o.m32797g(rating, ResponseConstants.RATING);
        C6962a a = C6962a.m13497a(this.f14280r, (SortType) null, rating, false, false, false, 29);
        this.f14280r = a;
        this.f14281s.postValue(new C6448c.C6451c(a));
        mo18351k();
    }

    public final void onCleared() {
        this.f14283u.mo19405d();
    }
}
