package com.etsy.android.p327ui.shop;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ReceiptReview;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Review;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.lib.models.ShopAboutVideo;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.ShopHomePage;
import com.etsy.android.lib.models.apiv3.ShopReviewsResult;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingReviewNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopSectionListingsKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.UserProfileKey;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import com.google.logging.type.LogSeverity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19410j;
import kotlin.reflect.C19421p;
import p277w8.C8267e;
import p356ge.C12788a;
import p356ge.C12790b;
import p370ie.C12947g;
import p370ie.C12948h;
import p370ie.C12949i;
import p370ie.C12951k;
import p415of.C13180i;
import p425q9.C13265p;
import p438re.C13356b;
import p568fn.C17782b;
import p628nj.C18263b;
import p759nq.C19919a;

/* renamed from: com.etsy.android.ui.shop.a */
public abstract class C11126a implements C11178m0 {

    /* renamed from: a */
    public final Fragment f24608a;

    /* renamed from: b */
    public final C13180i f24609b;

    /* renamed from: c */
    public EtsyId f24610c;

    /* renamed from: d */
    public final C8267e f24611d;

    public C11126a(Fragment fragment, C11127a0 a0Var, EtsyId etsyId, C8267e eVar) {
        C19383o.m32797g(fragment, "fragment");
        C19383o.m32797g(a0Var, "adapter");
        C19383o.m32797g(eVar, "adImpressionRepository");
        this.f24608a = fragment;
        this.f24609b = a0Var;
        this.f24610c = etsyId;
        this.f24611d = eVar;
    }

    /* renamed from: a */
    public final void mo36803a() {
        C13180i iVar = this.f24609b;
        C19383o.m32795e(iVar, "null cannot be cast to non-null type com.etsy.android.ui.shop.ShopHomeAdapter");
        ShopHomePage shopHomePage = ((C11127a0) iVar).f24614i;
        if (shopHomePage != null) {
            ShopV3 shop = shopHomePage.getShop();
            User owner = shop.getOwner();
            String displayName = owner.getDisplayName();
            C19383o.m32796f(displayName, "shopOwner.displayName");
            String name = displayName.length() == 0 ? shop.getName() : owner.getDisplayName();
            long idAsLong = owner.getUserId().getIdAsLong();
            TrackingBaseActivity n = mo36812n();
            Bundle bundle = new Bundle();
            C13265p pVar = C18263b.f40057V;
            if (pVar == null) {
                C19383o.m32805o("session");
                throw null;
            } else if (pVar.mo45960e()) {
                C13265p pVar2 = C18263b.f40057V;
                if (pVar2 == null) {
                    C19383o.m32805o("session");
                    throw null;
                } else if (pVar2.f29153s.mo30407a()) {
                    String str = name;
                    ConversationDetailsNavigationKey conversationDetailsNavigationKey = r3;
                    ConversationDetailsNavigationKey conversationDetailsNavigationKey2 = new ConversationDetailsNavigationKey(C19421p.m32935c0(n), (Bundle) null, Long.valueOf(idAsLong), (String) null, str, (Long) null, false, true, (String) null, false, 64, (DefaultConstructorMarker) null);
                    C12788a.m20424c(n, conversationDetailsNavigationKey);
                } else {
                    C12788a.m20424c(n, new ConversationComposeNavigationKey(C19421p.m32935c0(n), false, owner.getLoginName(), name, (Long) null, (String) null, (String) null, false, (Bundle) null, 2, (DefaultConstructorMarker) null));
                }
            } else {
                bundle.putString(ResponseConstants.USERNAME, owner.getLoginName());
                bundle.putLong(ConversationComposeNavigationKey.USER_ID, idAsLong);
                bundle.putString("DISPLAY_NAME", name);
                EtsyAction.C8658a aVar = EtsyAction.Companion;
                String c0 = C19421p.m32935c0(n);
                EtsyAction etsyAction = EtsyAction.CONTACT_USER;
                C19383o.m32797g(etsyAction, "signInAction");
                C12788a.m20424c(n, new C12949i(new C12948h(c0, etsyAction, bundle, (String) null, (String) null, (String) null, 32), (Fragment) null, (int) LogSeverity.NOTICE_VALUE));
            }
        }
    }

    /* renamed from: b */
    public final void mo36804b(int i, String str, String str2) {
        C19383o.m32797g(str, "sectionId");
        EtsyId etsyId = this.f24610c;
        if (etsyId != null) {
            ShopSectionListingsKey.C10705a aVar = new ShopSectionListingsKey.C10705a();
            aVar.f23606a = C19421p.m32935c0(mo36812n());
            String id = etsyId.getId();
            C19383o.m32797g(id, "shopId");
            aVar.f23607b = id;
            aVar.f23608c = str;
            C19383o.m32794d(str2);
            aVar.f23609d = str2;
            C19919a aVar2 = aVar.f23610e;
            C19410j<Object>[] jVarArr = ShopSectionListingsKey.C10705a.f23605f;
            aVar2.mo72822a(aVar, jVarArr[0], Integer.valueOf(i));
            String str3 = aVar.f23606a;
            if (str3 != null) {
                String str4 = aVar.f23607b;
                if (str4 != null) {
                    String str5 = aVar.f23608c;
                    if (str5 != null) {
                        String str6 = aVar.f23609d;
                        if (str6 != null) {
                            C12788a.m20424c(mo36812n(), new ShopSectionListingsKey(str3, str4, str5, str6, ((Number) aVar.f23610e.getValue(aVar, jVarArr[0])).intValue()));
                            return;
                        }
                        C19383o.m32805o("sectionTitle");
                        throw null;
                    }
                    C19383o.m32805o("sectionId");
                    throw null;
                }
                C19383o.m32805o("shopId");
                throw null;
            }
            C19383o.m32805o("referrer");
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo36805c(String str) {
        if (str != null) {
            String d = C12790b.m20432d(this.f24608a);
            String string = this.f24608a.getString(R.string.terms_and_conditions_title);
            C19383o.m32796f(string, "fragment.getString(R.str…rms_and_conditions_title)");
            C12790b.m20430b(this.f24608a, new C12951k(d, str, string));
        }
    }

    /* renamed from: e */
    public final C9125j mo36806e() {
        Fragment fragment = this.f24608a;
        C13180i iVar = this.f24609b;
        C8703p analyticsContext = mo36812n().getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "activity.analyticsContext");
        return new C9125j(fragment, iVar, analyticsContext, C9126k.C9128b.f20060a, this.f24611d);
    }

    /* renamed from: f */
    public final void mo36807f(ShopAboutVideo shopAboutVideo) {
        C19383o.m32797g(shopAboutVideo, "video");
        EtsyId etsyId = this.f24610c;
        if (etsyId != null) {
            C8703p analyticsContext = mo36812n().getAnalyticsContext();
            C19383o.m32796f(analyticsContext, "activity.analyticsContext");
            analyticsContext.mo21333d("shop_about_video_tapped", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.SHOP_ID, etsyId.getId())));
        }
        String c0 = C19421p.m32935c0(mo36812n());
        EtsyId shopId = shopAboutVideo.getShopId();
        C19383o.m32796f(shopId, "video.shopId");
        String videoUrl = shopAboutVideo.getVideoUrl();
        C19383o.m32796f(videoUrl, "video.videoUrl");
        C12788a.m20424c(mo36812n(), new C12947g(c0, shopId, videoUrl));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        r6 = r2.getUserId();
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36808i(com.etsy.android.lib.models.apiv3.listing.ShopRating r21) {
        /*
            r20 = this;
            r0 = r20
            of.i r1 = r0.f24609b
            java.lang.String r2 = "null cannot be cast to non-null type com.etsy.android.ui.shop.ShopHomeAdapter"
            kotlin.jvm.internal.C19383o.m32795e(r1, r2)
            com.etsy.android.ui.shop.a0 r1 = (com.etsy.android.p327ui.shop.C11127a0) r1
            com.etsy.android.lib.models.apiv3.ShopHomePage r1 = r1.f24614i
            kotlin.jvm.internal.C19383o.m32794d(r1)
            com.etsy.android.lib.models.apiv3.ShopV3 r1 = r1.getShop()
            com.etsy.android.lib.models.User r2 = r1.getOwner()
            com.etsy.android.lib.models.datatypes.EtsyId r5 = r0.f24610c
            if (r5 == 0) goto L_0x0091
            com.etsy.android.feedback.FeedbackFragment$FeedbackUiData r3 = new com.etsy.android.feedback.FeedbackFragment$FeedbackUiData
            com.etsy.android.lib.models.apiv3.listing.Reviews$ReviewType r7 = com.etsy.android.lib.models.apiv3.listing.Reviews.ReviewType.SHOP
            long r8 = r5.getIdAsLong()
            r4 = 0
            if (r2 == 0) goto L_0x0037
            com.etsy.android.lib.models.datatypes.EtsyId r6 = r2.getUserId()
            if (r6 == 0) goto L_0x0037
            long r10 = r6.getIdAsLong()
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r10 = r6
            goto L_0x0038
        L_0x0037:
            r10 = r4
        L_0x0038:
            java.lang.String r11 = r1.getName()
            if (r2 == 0) goto L_0x0044
            java.lang.String r1 = r2.getLoginName()
            r12 = r1
            goto L_0x0045
        L_0x0044:
            r12 = r4
        L_0x0045:
            if (r2 == 0) goto L_0x004d
            java.lang.String r1 = r2.getDisplayName()
            r13 = r1
            goto L_0x004e
        L_0x004d:
            r13 = r4
        L_0x004e:
            r14 = 0
            r16 = 0
            if (r21 == 0) goto L_0x005e
            java.lang.Integer r1 = r21.getRatingCount()
            if (r1 == 0) goto L_0x005e
            int r1 = r1.intValue()
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            r17 = r1
            r18 = 320(0x140, float:4.48E-43)
            r19 = 0
            r6 = r3
            r15 = r21
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.c<com.etsy.android.uikit.nav.transactions.TransactionDataRepository> r1 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.f26402b
            com.etsy.android.uikit.nav.transactions.TransactionDataRepository r1 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.C11867a.m19552a()
            int r1 = r1.mo38343b(r3)
            com.etsy.android.ui.navigation.keys.fragmentkeys.FeedbackKey r2 = new com.etsy.android.ui.navigation.keys.fragmentkeys.FeedbackKey
            com.etsy.android.uikit.nav.TrackingBaseActivity r3 = r20.mo36812n()
            java.lang.String r4 = kotlin.reflect.C19421p.m32935c0(r3)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r8 = 4
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.etsy.android.uikit.nav.TrackingBaseActivity r1 = r20.mo36812n()
            p356ge.C12788a.m20424c(r1, r2)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.shop.C11126a.mo36808i(com.etsy.android.lib.models.apiv3.listing.ShopRating):void");
    }

    /* renamed from: j */
    public final void mo36809j(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "userId");
        C12788a.m20424c(mo36812n(), new UserProfileKey(C19421p.m32935c0(mo36812n()), etsyId, (Bundle) null));
    }

    /* renamed from: k */
    public final C13356b mo36810k() {
        Fragment fragment = this.f24608a;
        C8703p analyticsContext = mo36812n().getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "activity.analyticsContext");
        return new C13356b(fragment, analyticsContext, this);
    }

    /* renamed from: m */
    public final void mo36811m(EtsyId etsyId) {
        EtsyId etsyId2;
        C19383o.m32797g(etsyId, "transactionId");
        C13180i iVar = this.f24609b;
        C19383o.m32795e(iVar, "null cannot be cast to non-null type com.etsy.android.ui.shop.ShopHomeAdapter");
        ShopHomePage shopHomePage = ((C11127a0) iVar).f24614i;
        C19383o.m32794d(shopHomePage);
        ShopReviewsResult shopReviews = shopHomePage.getShopReviews();
        ReceiptReview receiptReview = null;
        List reviews = shopReviews != null ? shopReviews.getReviews() : null;
        if (reviews == null) {
            reviews = EmptyList.INSTANCE;
        }
        Iterator it = reviews.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ReceiptReview receiptReview2 = (ReceiptReview) it.next();
            if (receiptReview2.getReviews().get(0).getTransactionId().equals(etsyId)) {
                receiptReview = receiptReview2;
                break;
            }
        }
        if (receiptReview != null) {
            Review review = receiptReview.getReviews().get(0);
            Image image = new Image();
            image.setUrl(review.getAppreciationPhoto().getImageUrl());
            String listingImageUrl = review.getListingImageUrl();
            C19383o.m32796f(listingImageUrl, "review.listingImageUrl");
            List d0 = C17782b.m29864d0(listingImageUrl);
            ReviewImage reviewImage = new ReviewImage();
            String userAvatarUrl = receiptReview.getUserAvatarUrl();
            C19383o.m32796f(userAvatarUrl, "receiptReview.userAvatarUrl");
            reviewImage.setBuyerAvatarUrl(userAvatarUrl);
            String reviewMessage = review.getReviewMessage();
            C19383o.m32796f(reviewMessage, "review.reviewMessage");
            reviewImage.setReviewText(reviewMessage);
            reviewImage.setTranslatedReview(review.getTranslatedReview());
            Date date = receiptReview.getDate();
            C19383o.m32796f(date, "receiptReview.date");
            reviewImage.setCreateDate(date);
            String userDisplayName = receiptReview.getUserDisplayName();
            if (userDisplayName != null) {
                reviewImage.setBuyerName(userDisplayName);
            }
            reviewImage.setReviewRating(Integer.valueOf(review.getRating()));
            reviewImage.setImage(image);
            if (review.getListing() != null) {
                etsyId2 = review.getListing().getListingId();
                C19383o.m32796f(etsyId2, "{\n                review…g.listingId\n            }");
            } else {
                etsyId2 = review.getListingId();
                C19383o.m32796f(etsyId2, "{\n                review.listingId\n            }");
            }
            reviewImage.setListingId(etsyId2);
            reviewImage.setListingOnly(!receiptReview.containsReviewForListing(reviewImage.getListingId()));
            reviewImage.setListingTitle(review.getListingTitle());
            reviewImage.setListingImages(d0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(reviewImage);
            ListingReviewNavigationKey.C10703a aVar = ListingReviewNavigationKey.Companion;
            Fragment fragment = this.f24608a;
            boolean b = fragment instanceof ShopHomeFragment ? ((ShopHomeFragment) fragment).getConfigMap().mo21132b(C8592b.f18847y1) : false;
            String c0 = C19421p.m32935c0(mo36812n());
            aVar.getClass();
            C12788a.m20424c(mo36812n(), ListingReviewNavigationKey.C10703a.m18610a(b, c0, arrayList, 0));
        }
    }

    /* renamed from: n */
    public final TrackingBaseActivity mo36812n() {
        FragmentActivity requireActivity = this.f24608a.requireActivity();
        C19383o.m32795e(requireActivity, "null cannot be cast to non-null type com.etsy.android.uikit.nav.TrackingBaseActivity");
        return (TrackingBaseActivity) requireActivity;
    }
}
