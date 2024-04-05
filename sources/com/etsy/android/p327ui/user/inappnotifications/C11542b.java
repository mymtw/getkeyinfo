package com.etsy.android.p327ui.user.inappnotifications;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationType;
import com.etsy.android.p327ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon;
import com.etsy.android.p327ui.user.inappnotifications.thankyoucoupon.NotificationHolderThankYouCoupon;
import com.etsy.android.uikit.adapter.C11829a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.b */
public final class C11542b extends C11829a<InAppNotification> {

    /* renamed from: b */
    public final C8672b f25538b;

    /* renamed from: c */
    public final C19857l<C11564q, C19394m> f25539c;

    /* renamed from: d */
    public final SparseIntArray f25540d = new SparseIntArray();

    /* renamed from: com.etsy.android.ui.user.inappnotifications.b$a */
    public /* synthetic */ class C11543a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25541a;

        static {
            int[] iArr = new int[InAppNotificationType.values().length];
            iArr[InAppNotificationType.FIRST.ordinal()] = 1;
            iArr[InAppNotificationType.YFNOS.ordinal()] = 2;
            iArr[InAppNotificationType.SHOPSALE.ordinal()] = 3;
            iArr[InAppNotificationType.NFYFS.ordinal()] = 4;
            iArr[InAppNotificationType.CLOS.ordinal()] = 5;
            iArr[InAppNotificationType.FBIS.ordinal()] = 6;
            iArr[InAppNotificationType.RFC.ordinal()] = 7;
            iArr[InAppNotificationType.ABANDONED_CART_OFFER.ordinal()] = 8;
            iArr[InAppNotificationType.COLLECTION_RECS.ordinal()] = 9;
            iArr[InAppNotificationType.ONE_FAVORITE_LEFT.ordinal()] = 10;
            iArr[InAppNotificationType.FAVORITE_SHOPS_PROMO.ordinal()] = 11;
            iArr[InAppNotificationType.SYNTHETIC_HEADER.ordinal()] = 12;
            iArr[InAppNotificationType.SYNTHETIC_FOOTER.ordinal()] = 13;
            iArr[InAppNotificationType.THANK_YOU_COUPON.ordinal()] = 14;
            iArr[InAppNotificationType.THANK_YOU_COUPON_REMINDER.ordinal()] = 15;
            iArr[InAppNotificationType.RECOMMENDED_SHOPS_STANDARD.ordinal()] = 16;
            iArr[InAppNotificationType.RECOMMENDED_SHOPS_HIGHLIGHTED.ordinal()] = 17;
            f25541a = iArr;
        }
    }

    public C11542b(FragmentActivity fragmentActivity, C8703p pVar, C19857l lVar) {
        super(fragmentActivity);
        this.f25538b = pVar;
        this.f25539c = lVar;
    }

    public final void clear() {
        this.f25540d.clear();
        super.clear();
    }

    public final int getListItemViewType(int i) {
        switch (C11543a.f25541a[((InAppNotification) this.mItems.get(i)).getNotification_type().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 8;
            case 11:
                return 9;
            case 12:
                return 10;
            case 13:
                return 11;
            case 14:
            case 15:
                return 12;
            case 16:
                return 13;
            case 17:
                return 14;
            default:
                throw new UnknownInAppNotificationException((String) null, 1, (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r5v25, types: [androidx.recyclerview.widget.LinearLayoutManager] */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindListItemViewHolder(androidx.recyclerview.widget.RecyclerView.C3084b0 r32, int r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            java.lang.String r3 = "holder"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            java.util.ArrayList<T> r3 = r0.mItems
            java.lang.Object r3 = r3.get(r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification) r3
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsHighlighted
            r5 = 0
            r6 = 2
            java.lang.String r7 = "<get-subTitle>(...)"
            java.lang.String r8 = "<get-title>(...)"
            java.lang.String r9 = "notification"
            r10 = 0
            if (r4 == 0) goto L_0x0146
            com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsHighlighted r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsHighlighted) r3
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            kotlin.c r2 = r1.f25495e
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r4 = r3.getText()
            r2.setText(r4)
            kotlin.c r2 = r1.f25496f
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r7)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r4 = r3.getSubText()
            r2.setText(r4)
            com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink r2 = r3.getLandingPageLink()
            if (r2 == 0) goto L_0x0078
            kotlin.c r4 = r1.f25494d
            java.lang.Object r4 = r4.getValue()
            java.lang.String r7 = "<get-recommendedShopsLink>(...)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r7)
            com.etsy.android.stylekit.views.CollageButton r4 = (com.etsy.android.stylekit.views.CollageButton) r4
            java.lang.String r8 = r2.getLinkTitleField()
            r4.setText(r8)
            kotlin.c r4 = r1.f25494d
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r4, r7)
            com.etsy.android.stylekit.views.CollageButton r4 = (com.etsy.android.stylekit.views.CollageButton) r4
            com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$bind$1$1 r7 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$bind$1$1
            r7.<init>(r1, r2, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r4, r7)
        L_0x0078:
            r2 = r10
        L_0x0079:
            r4 = 4
            if (r2 >= r4) goto L_0x07f3
            java.util.List r4 = r3.getRecommendedShops()
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x07f3
            kotlin.c r4 = r1.f25502l
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = r4.get(r2)
            com.google.android.material.card.MaterialCardView r4 = (com.google.android.material.card.MaterialCardView) r4
            java.util.List r7 = r3.getRecommendedShops()
            java.lang.Object r7 = r7.get(r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard r7 = (com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard) r7
            java.lang.String r8 = r3.getFeedId()
            java.lang.Long r9 = r3.getFeedIndex()
            android.content.Context r11 = r4.getContext()
            java.lang.String r12 = "shopView.context"
            kotlin.jvm.internal.C19383o.m32796f(r11, r12)
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int r11 = r11.widthPixels
            int r11 = r11 / r6
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r12 = r10
        L_0x00c0:
            r13 = 3
            if (r12 >= r13) goto L_0x00eb
            java.util.List r13 = r7.getDisplayListings()
            int r13 = r13.size()
            if (r12 >= r13) goto L_0x00eb
            java.util.List r13 = r7.getDisplayListings()
            java.lang.Object r13 = r13.get(r12)
            com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard r13 = (com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard) r13
            com.etsy.android.lib.models.apiv3.listing.ListingImage r13 = r13.getImg()
            if (r13 == 0) goto L_0x00e2
            java.lang.String r13 = androidx.compose.foundation.layout.C0761x.m1711b1(r13, r11)
            goto L_0x00e3
        L_0x00e2:
            r13 = r5
        L_0x00e3:
            if (r13 == 0) goto L_0x00e8
            r15.add(r13)
        L_0x00e8:
            int r12 = r12 + 1
            goto L_0x00c0
        L_0x00eb:
            com.etsy.android.ui.user.inappnotifications.j r11 = new com.etsy.android.ui.user.inappnotifications.j
            long r17 = r7.getUserId()
            long r19 = r7.getShopId()
            java.lang.String r21 = r7.getShopName()
            com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$bindShop$1$dependencies$1 r12 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsHighlighted$bindShop$1$dependencies$1
            r12.<init>(r1, r8, r9)
            r16 = r11
            r22 = r12
            r16.<init>(r17, r19, r21, r22)
            com.etsy.android.ui.user.inappnotifications.IANShopUiModel r8 = new com.etsy.android.ui.user.inappnotifications.IANShopUiModel
            java.lang.String r13 = r7.getShopName()
            com.etsy.android.lib.models.apiv3.inappnotifications.IANShopRating r9 = r7.getRating()
            if (r9 == 0) goto L_0x0117
            java.lang.Float r9 = r9.getRating()
            r14 = r9
            goto L_0x0118
        L_0x0117:
            r14 = r5
        L_0x0118:
            com.etsy.android.lib.models.apiv3.inappnotifications.IANShopRating r9 = r7.getRating()
            if (r9 == 0) goto L_0x0127
            int r9 = r9.getRatingCount()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0128
        L_0x0127:
            r9 = r5
        L_0x0128:
            boolean r16 = r7.isFavorite()
            java.lang.String r17 = r7.getSellerAvatarUrl()
            com.etsy.android.ui.user.inappnotifications.IANShopUiModel$ShopCardType r19 = com.etsy.android.p327ui.user.inappnotifications.IANShopUiModel.ShopCardType.CHIP_SHOP
            r12 = r8
            r7 = r15
            r15 = r9
            r18 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            com.etsy.android.ui.user.inappnotifications.IANShopCardViewHolderBinder r7 = new com.etsy.android.ui.user.inappnotifications.IANShopCardViewHolderBinder
            r7.<init>()
            r7.mo37431a(r4, r8, r11)
            int r2 = r2 + 1
            goto L_0x0079
        L_0x0146:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsStandard
            if (r4 == 0) goto L_0x01d6
            com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsStandard r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsStandard) r3
            android.util.SparseIntArray r4 = r0.f25540d
            int r2 = r4.get(r2, r10)
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            kotlin.c r4 = r1.f25508f
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r4, r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r6 = r3.getText()
            r4.setText(r6)
            kotlin.c r4 = r1.f25507e
            java.lang.Object r4 = r4.getValue()
            java.lang.String r6 = "<get-heading>(...)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            com.etsy.android.stylekit.views.CollageHeadingLayout r4 = (com.etsy.android.stylekit.views.CollageHeadingLayout) r4
            com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard$bind$1 r6 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard$bind$1
            r6.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r4, r6)
            kotlin.c r4 = r1.f25509g
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r4, r7)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r6 = r3.getSubText()
            r4.setText(r6)
            androidx.recyclerview.widget.RecyclerView r4 = r1.mo37519e()
            android.view.View r6 = r1.itemView
            android.content.Context r6 = r6.getContext()
            java.lang.String r7 = "itemView.context"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            r6.<init>(r10, r10)
            r4.setLayoutManager(r6)
            androidx.recyclerview.widget.RecyclerView r4 = r1.mo37519e()
            com.etsy.android.ui.user.inappnotifications.i r6 = new com.etsy.android.ui.user.inappnotifications.i
            java.util.List r7 = r3.getRecommendedShops()
            com.etsy.android.lib.logger.b r8 = r1.f25504b
            com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard$bind$2 r9 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard$bind$2
            r9.<init>(r1, r3)
            r6.<init>(r7, r8, r9)
            r4.setAdapter(r6)
            if (r2 <= 0) goto L_0x07f3
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37519e()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r3 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x01cf
            r5 = r1
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
        L_0x01cf:
            if (r5 == 0) goto L_0x07f3
            r5.mo11315u0(r2)
            goto L_0x07f3
        L_0x01d6:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCoupon
            java.lang.String r7 = "<this>"
            if (r4 == 0) goto L_0x022c
            com.etsy.android.ui.user.inappnotifications.thankyoucoupon.NotificationHolderThankYouCoupon r1 = (com.etsy.android.p327ui.user.inappnotifications.thankyoucoupon.NotificationHolderThankYouCoupon) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCoupon r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCoupon) r3
            kotlin.jvm.internal.C19383o.m32797g(r3, r7)
            com.etsy.android.ui.user.inappnotifications.thankyoucoupon.a r2 = new com.etsy.android.ui.user.inappnotifications.thankyoucoupon.a
            r8 = r2
            java.lang.String r10 = r3.getFeedId()
            java.lang.Long r11 = r3.getFeedIndex()
            java.lang.String r12 = r3.getText()
            java.lang.String r13 = r3.getTimePassed()
            long r14 = r3.getShopId()
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r16 = r3.getShopIcon()
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r17 = r3.getClickType()
            boolean r18 = r3.isRead()
            java.lang.String r19 = r3.getButtonText()
            java.lang.String r20 = r3.getCouponCode()
            boolean r21 = r3.getButtonEnabled()
            java.lang.String r22 = r3.getPromoText()
            java.lang.String r23 = r3.getUnavailableText()
            long r24 = r3.getPromoId()
            java.lang.String r26 = r3.getDisclaimerText()
            java.lang.String r9 = "thankyou_coupon"
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            r1.mo37594f(r2)
            goto L_0x07f3
        L_0x022c:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder
            if (r4 == 0) goto L_0x0280
            com.etsy.android.ui.user.inappnotifications.thankyoucoupon.NotificationHolderThankYouCoupon r1 = (com.etsy.android.p327ui.user.inappnotifications.thankyoucoupon.NotificationHolderThankYouCoupon) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder) r3
            kotlin.jvm.internal.C19383o.m32797g(r3, r7)
            com.etsy.android.ui.user.inappnotifications.thankyoucoupon.a r2 = new com.etsy.android.ui.user.inappnotifications.thankyoucoupon.a
            r8 = r2
            java.lang.String r10 = r3.getFeedId()
            java.lang.Long r11 = r3.getFeedIndex()
            java.lang.String r12 = r3.getText()
            java.lang.String r13 = r3.getTimePassed()
            long r14 = r3.getShopId()
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r16 = r3.getShopIcon()
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r17 = r3.getClickType()
            boolean r18 = r3.isRead()
            java.lang.String r19 = r3.getButtonText()
            java.lang.String r20 = r3.getCouponCode()
            boolean r21 = r3.getButtonEnabled()
            java.lang.String r22 = r3.getPromoText()
            java.lang.String r23 = r3.getUnavailableText()
            long r24 = r3.getPromoId()
            java.lang.String r26 = r3.getDisclaimerText()
            java.lang.String r9 = "thankyou_coupon_reminder"
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            r1.mo37594f(r2)
            goto L_0x07f3
        L_0x0280:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft
            java.lang.String r8 = "<get-shopAvatar>(...)"
            java.lang.String r11 = "itemView"
            java.lang.String r12 = "<get-notificationText>(...)"
            if (r4 == 0) goto L_0x0303
            com.etsy.android.ui.user.inappnotifications.NotificationHolderOneFavoriteLeft r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderOneFavoriteLeft) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft) r3
            android.util.SparseIntArray r4 = r0.f25540d
            int r15 = r4.get(r2, r10)
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            com.etsy.android.ui.user.inappnotifications.k r2 = new com.etsy.android.ui.user.inappnotifications.k
            int r14 = com.etsy.android.p327ui.user.inappnotifications.NotificationHolderOneFavoriteLeft.f25484g
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r16 = r3.getShopIcon()
            java.lang.String r17 = r3.getText()
            java.lang.String r18 = r3.getTimePassed()
            boolean r19 = r3.isRead()
            java.util.List r20 = r3.getListings()
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            com.etsy.android.ui.user.inappnotifications.n r4 = new com.etsy.android.ui.user.inappnotifications.n
            com.etsy.android.lib.logger.b r5 = r1.f25486b
            com.etsy.android.ui.user.inappnotifications.NotificationHolderOneFavoriteLeft$bind$dependencies$1 r6 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderOneFavoriteLeft$bind$dependencies$1
            r6.<init>(r1, r3)
            r4.<init>(r5, r6)
            android.view.View r5 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r5, r11)
            com.etsy.android.p327ui.user.inappnotifications.C11560m.m19346a(r5, r2, r4)
            java.lang.String r2 = r3.getAccessibilityText()
            if (r2 == 0) goto L_0x02db
            kotlin.c r4 = r1.f25490f
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r4, r12)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setContentDescription(r2)
        L_0x02db:
            kotlin.c r2 = r1.f25489e
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderOneFavoriteLeft$bind$2 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderOneFavoriteLeft$bind$2
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            kotlin.c r2 = r1.f25490f
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r12)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderOneFavoriteLeft$bind$3 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderOneFavoriteLeft$bind$3
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            goto L_0x07f3
        L_0x0303:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC
            if (r4 == 0) goto L_0x0361
            com.etsy.android.ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon r1 = (com.etsy.android.p327ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC) r3
            kotlin.jvm.internal.C19383o.m32797g(r3, r7)
            com.etsy.android.ui.user.inappnotifications.cartcoupon.a r4 = new com.etsy.android.ui.user.inappnotifications.cartcoupon.a
            r11 = r4
            java.lang.String r13 = r3.getFeedId()
            java.lang.Long r14 = r3.getFeedIndex()
            java.lang.String r15 = r3.getText()
            java.lang.String r16 = r3.getTimePassed()
            long r17 = r3.getShopId()
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r19 = r3.getShopIcon()
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r20 = r3.getClickType()
            java.util.List r21 = r3.getListings()
            boolean r22 = r3.isRead()
            java.lang.String r23 = r3.getButtonText()
            java.lang.String r24 = r3.getCouponCode()
            boolean r25 = r3.getButtonEnabled()
            java.lang.String r26 = r3.getPromoText()
            java.lang.String r27 = r3.getUnavailableText()
            long r28 = r3.getPromoOfferId()
            java.util.List r30 = r3.getPromoOfferTokens()
            java.lang.String r12 = "recently_favorited_coupon"
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30)
            android.util.SparseIntArray r3 = r0.f25540d
            int r2 = r3.get(r2, r10)
            r1.mo37552f(r4, r2)
            goto L_0x07f3
        L_0x0361:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationAbandonedCartOffer
            if (r4 == 0) goto L_0x03bf
            com.etsy.android.ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon r1 = (com.etsy.android.p327ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationAbandonedCartOffer r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationAbandonedCartOffer) r3
            kotlin.jvm.internal.C19383o.m32797g(r3, r7)
            com.etsy.android.ui.user.inappnotifications.cartcoupon.a r4 = new com.etsy.android.ui.user.inappnotifications.cartcoupon.a
            r11 = r4
            java.lang.String r13 = r3.getFeedId()
            java.lang.Long r14 = r3.getFeedIndex()
            java.lang.String r15 = r3.getText()
            java.lang.String r16 = r3.getTimePassed()
            long r17 = r3.getShopId()
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r19 = r3.getShopIcon()
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationClickType r20 = r3.getClickType()
            java.util.List r21 = r3.getListings()
            boolean r22 = r3.isRead()
            java.lang.String r23 = r3.getButtonText()
            java.lang.String r24 = r3.getCouponCode()
            boolean r25 = r3.getButtonEnabled()
            java.lang.String r26 = r3.getPromoText()
            java.lang.String r27 = r3.getUnavailableText()
            long r28 = r3.getPromoOfferId()
            java.util.List r30 = r3.getPromoOfferTokens()
            java.lang.String r12 = "abandoned_cart_offer"
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30)
            android.util.SparseIntArray r3 = r0.f25540d
            int r2 = r3.get(r2, r10)
            r1.mo37552f(r4, r2)
            goto L_0x07f3
        L_0x03bf:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS
            if (r4 == 0) goto L_0x0428
            com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderNFYFS) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS) r3
            android.util.SparseIntArray r4 = r0.f25540d
            int r15 = r4.get(r2, r10)
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            com.etsy.android.ui.user.inappnotifications.k r2 = new com.etsy.android.ui.user.inappnotifications.k
            int r14 = com.etsy.android.p327ui.user.inappnotifications.NotificationHolderNFYFS.f25477g
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r16 = r3.getShopIcon()
            java.lang.String r17 = r3.getText()
            java.lang.String r18 = r3.getTimePassed()
            boolean r19 = r3.isRead()
            java.util.List r20 = r3.getListings()
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            com.etsy.android.ui.user.inappnotifications.n r4 = new com.etsy.android.ui.user.inappnotifications.n
            com.etsy.android.lib.logger.b r5 = r1.f25479b
            com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS$bind$dependencies$1 r6 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS$bind$dependencies$1
            r6.<init>(r1, r3)
            r4.<init>(r5, r6)
            android.view.View r5 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r5, r11)
            com.etsy.android.p327ui.user.inappnotifications.C11560m.m19346a(r5, r2, r4)
            kotlin.c r2 = r1.f25482e
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS$bind$1 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS$bind$1
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            kotlin.c r2 = r1.f25483f
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r12)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS$bind$2 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS$bind$2
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            goto L_0x07f3
        L_0x0428:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS
            if (r4 == 0) goto L_0x04ad
            com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderYFNOS) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS) r3
            android.util.SparseIntArray r4 = r0.f25540d
            int r15 = r4.get(r2, r10)
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            java.lang.String r2 = r3.getAccessibilityText()
            if (r2 == 0) goto L_0x044d
            kotlin.c r4 = r1.f25522e
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r4, r12)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setContentDescription(r2)
        L_0x044d:
            com.etsy.android.ui.user.inappnotifications.k r2 = new com.etsy.android.ui.user.inappnotifications.k
            int r14 = com.etsy.android.p327ui.user.inappnotifications.NotificationHolderYFNOS.f25517g
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r16 = r3.getShopIcon()
            java.lang.String r17 = r3.getText()
            java.lang.String r18 = r3.getTimePassed()
            boolean r19 = r3.isRead()
            java.util.List r20 = r3.getListings()
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            com.etsy.android.ui.user.inappnotifications.n r4 = new com.etsy.android.ui.user.inappnotifications.n
            com.etsy.android.lib.logger.b r5 = r1.f25519b
            com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS$bind$dependencies$1 r6 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS$bind$dependencies$1
            r6.<init>(r1, r3)
            r4.<init>(r5, r6)
            android.view.View r5 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r5, r11)
            com.etsy.android.p327ui.user.inappnotifications.C11560m.m19346a(r5, r2, r4)
            java.util.List r2 = r3.getListings()
            boolean r2 = kotlinx.coroutines.C19543e0.m33306Y(r2)
            kotlin.c r4 = r1.f25523f
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r4, r8)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS$bind$2 r5 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS$bind$2
            r5.<init>(r2, r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r4, r5)
            kotlin.c r4 = r1.f25522e
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r4, r12)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS$bind$3 r5 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS$bind$3
            r5.<init>(r2, r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r4, r5)
            goto L_0x07f3
        L_0x04ad:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale
            if (r4 == 0) goto L_0x0516
            com.etsy.android.ui.user.inappnotifications.NotificationHolderShopSale r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderShopSale) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale) r3
            android.util.SparseIntArray r4 = r0.f25540d
            int r15 = r4.get(r2, r10)
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            com.etsy.android.ui.user.inappnotifications.k r2 = new com.etsy.android.ui.user.inappnotifications.k
            int r14 = com.etsy.android.p327ui.user.inappnotifications.NotificationHolderShopSale.f25510g
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r16 = r3.getShopIcon()
            java.lang.String r17 = r3.getText()
            java.lang.String r18 = r3.getTimePassed()
            boolean r19 = r3.isRead()
            java.util.List r20 = r3.getListings()
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            com.etsy.android.ui.user.inappnotifications.n r4 = new com.etsy.android.ui.user.inappnotifications.n
            com.etsy.android.lib.logger.b r5 = r1.f25512b
            com.etsy.android.ui.user.inappnotifications.NotificationHolderShopSale$bind$dependencies$1 r6 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderShopSale$bind$dependencies$1
            r6.<init>(r1, r3)
            r4.<init>(r5, r6)
            android.view.View r5 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r5, r11)
            com.etsy.android.p327ui.user.inappnotifications.C11560m.m19346a(r5, r2, r4)
            kotlin.c r2 = r1.f25515e
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderShopSale$bind$1 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderShopSale$bind$1
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            kotlin.c r2 = r1.f25516f
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r12)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderShopSale$bind$2 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderShopSale$bind$2
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            goto L_0x07f3
        L_0x0516:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS
            if (r4 == 0) goto L_0x0593
            com.etsy.android.ui.user.inappnotifications.NotificationHolderCLOS r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderCLOS) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS) r3
            android.util.SparseIntArray r4 = r0.f25540d
            int r15 = r4.get(r2, r10)
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            com.etsy.android.ui.user.inappnotifications.k r2 = new com.etsy.android.ui.user.inappnotifications.k
            int r14 = com.etsy.android.p327ui.user.inappnotifications.NotificationHolderCLOS.f25448g
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r16 = r3.getShopIcon()
            java.lang.String r17 = r3.getText()
            java.lang.String r18 = r3.getTimePassed()
            boolean r19 = r3.isRead()
            java.util.List r20 = r3.getListings()
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            com.etsy.android.ui.user.inappnotifications.n r4 = new com.etsy.android.ui.user.inappnotifications.n
            com.etsy.android.lib.logger.b r5 = r1.f25450b
            com.etsy.android.ui.user.inappnotifications.NotificationHolderCLOS$bind$dependencies$1 r6 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderCLOS$bind$dependencies$1
            r6.<init>(r1, r3)
            r4.<init>(r5, r6)
            android.view.View r5 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r5, r11)
            com.etsy.android.p327ui.user.inappnotifications.C11560m.m19346a(r5, r2, r4)
            java.lang.String r2 = r3.getAccessibilityText()
            if (r2 == 0) goto L_0x056b
            kotlin.c r4 = r1.f25454f
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r4, r12)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setContentDescription(r2)
        L_0x056b:
            kotlin.c r2 = r1.f25453e
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderCLOS$bind$2 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderCLOS$bind$2
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            kotlin.c r2 = r1.f25454f
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r12)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderCLOS$bind$3 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderCLOS$bind$3
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            goto L_0x07f3
        L_0x0593:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS
            if (r4 == 0) goto L_0x05fc
            com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderFBIS) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS) r3
            android.util.SparseIntArray r4 = r0.f25540d
            int r15 = r4.get(r2, r10)
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            com.etsy.android.ui.user.inappnotifications.k r2 = new com.etsy.android.ui.user.inappnotifications.k
            int r14 = com.etsy.android.p327ui.user.inappnotifications.NotificationHolderFBIS.f25455g
            com.etsy.android.lib.models.apiv3.listing.ShopIcon r16 = r3.getShopIcon()
            java.lang.String r17 = r3.getText()
            java.lang.String r18 = r3.getTimePassed()
            boolean r19 = r3.isRead()
            java.util.List r20 = r3.getListings()
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            com.etsy.android.ui.user.inappnotifications.n r4 = new com.etsy.android.ui.user.inappnotifications.n
            com.etsy.android.lib.logger.b r5 = r1.f25457b
            com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS$bind$dependencies$1 r6 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS$bind$dependencies$1
            r6.<init>(r1, r3)
            r4.<init>(r5, r6)
            android.view.View r5 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r5, r11)
            com.etsy.android.p327ui.user.inappnotifications.C11560m.m19346a(r5, r2, r4)
            kotlin.c r2 = r1.f25460e
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r8)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS$bind$1 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS$bind$1
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            kotlin.c r2 = r1.f25461f
            java.lang.Object r2 = r2.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r2, r12)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS$bind$2 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS$bind$2
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            goto L_0x07f3
        L_0x05fc:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFirst
            if (r4 == 0) goto L_0x063f
            com.etsy.android.ui.user.inappnotifications.NotificationHolderFirst r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderFirst) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFirst r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFirst) r3
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            java.lang.String r2 = r3.getText()
            if (r2 == 0) goto L_0x0623
            kotlin.c r4 = r1.f25467b
            java.lang.Object r4 = r4.getValue()
            kotlin.jvm.internal.C19383o.m32796f(r4, r12)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.text.Spanned r2 = p628nj.C18263b.m30867s0(r2)
            java.lang.String r2 = r2.toString()
            r4.setText(r2)
        L_0x0623:
            kotlin.c r1 = r1.f25468c
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "<get-subText>(...)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r3.getSubtext()
            if (r2 == 0) goto L_0x063a
            android.text.Spanned r5 = p628nj.C18263b.m30867s0(r2)
        L_0x063a:
            r1.setText(r5)
            goto L_0x07f3
        L_0x063f:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec
            r7 = 1
            if (r4 == 0) goto L_0x06db
            com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderListRecs) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec) r3
            android.util.SparseIntArray r4 = r0.f25540d
            int r14 = r4.get(r2, r10)
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            com.etsy.android.ui.user.inappnotifications.k r2 = new com.etsy.android.ui.user.inappnotifications.k
            int r13 = com.etsy.android.p327ui.user.inappnotifications.NotificationHolderListRecs.f25471f
            java.lang.String r16 = r3.getText()
            java.lang.String r17 = r3.getTimePassed()
            boolean r18 = r3.isRead()
            java.util.List r19 = r3.getListings()
            r15 = 0
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            com.etsy.android.ui.user.inappnotifications.n r4 = new com.etsy.android.ui.user.inappnotifications.n
            com.etsy.android.lib.logger.b r5 = r1.f25473b
            com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs$bind$dependencies$1 r8 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs$bind$dependencies$1
            r8.<init>(r1, r3)
            r4.<init>(r5, r8)
            android.view.View r5 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r5, r11)
            com.etsy.android.p327ui.user.inappnotifications.C11560m.m19346a(r5, r2, r4)
            java.lang.String r2 = r3.getButtonText()
            if (r2 == 0) goto L_0x068a
            boolean r2 = kotlin.text.C19457k.m33020X0(r2)
            if (r2 == 0) goto L_0x068b
        L_0x068a:
            r10 = r7
        L_0x068b:
            if (r10 == 0) goto L_0x069c
            android.widget.Button r2 = r1.mo37504g()
            com.etsy.android.extensions.ViewExtensions.m12860d(r2)
            android.widget.Button r2 = r1.mo37504g()
            r2.setImportantForAccessibility(r6)
            goto L_0x06cc
        L_0x069c:
            android.widget.Button r2 = r1.mo37504g()
            java.lang.String r4 = r3.getButtonText()
            r2.setText(r4)
            android.widget.Button r2 = r1.mo37504g()
            java.lang.String r4 = r3.getButtonText()
            r2.setContentDescription(r4)
            android.widget.Button r2 = r1.mo37504g()
            r2.setImportantForAccessibility(r7)
            android.widget.Button r2 = r1.mo37504g()
            com.etsy.android.extensions.ViewExtensions.m12869m(r2)
            android.widget.Button r2 = r1.mo37504g()
            com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs$bind$1$1 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs$bind$1$1
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
        L_0x06cc:
            android.view.View r2 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r2, r11)
            com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs$bind$2 r4 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs$bind$2
            r4.<init>(r1, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r2, r4)
            goto L_0x07f3
        L_0x06db:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo
            if (r4 == 0) goto L_0x078f
            com.etsy.android.ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo) r3
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            java.lang.String r4 = r3.getText()
            java.lang.String r6 = r3.getSubText()
            com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink r7 = r3.getLandingPageLink()
            if (r7 == 0) goto L_0x06f8
            java.lang.String r5 = r7.getLinkTitleField()
        L_0x06f8:
            java.lang.String r7 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r4, r7)
            java.lang.String r7 = "subText"
            kotlin.jvm.internal.C19383o.m32797g(r6, r7)
            android.view.View r7 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r7, r11)
            r8 = 2131430319(0x7f0b0baf, float:1.8482336E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setText(r4)
            r4 = 2131430318(0x7f0b0bae, float:1.8482334E38)
            android.view.View r4 = r7.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r6)
            boolean r4 = p628nj.C18263b.m30839d0(r5)
            r6 = 2131430315(0x7f0b0bab, float:1.8482327E38)
            if (r4 == 0) goto L_0x0744
            android.view.View r4 = r7.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r5)
            android.view.View r4 = r7.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setContentDescription(r5)
            android.view.View r4 = r7.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.etsy.android.extensions.ViewExtensions.m12869m(r4)
            goto L_0x074d
        L_0x0744:
            android.view.View r4 = r7.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.etsy.android.extensions.ViewExtensions.m12860d(r4)
        L_0x074d:
            android.view.View r4 = r1.itemView
            com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink r5 = r3.getLandingPageLink()
            if (r5 == 0) goto L_0x0779
            com.etsy.android.ui.user.inappnotifications.a r5 = new com.etsy.android.ui.user.inappnotifications.a
            java.lang.Long r8 = r3.getFeedIndex()
            java.lang.String r9 = r3.getFeedId()
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 248(0xf8, float:3.48E-43)
            java.lang.String r7 = "notification_tapped_favorite_shop"
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r6 = ""
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)
            com.etsy.android.ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo$bind$1$1 r6 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo$bind$1$1
            r6.<init>(r1, r5, r3)
            com.etsy.android.extensions.ViewExtensions.m12866j(r4, r6)
        L_0x0779:
            kotlin.c r4 = r1.f25465d
            java.lang.Object r4 = r4.getValue()
            java.lang.String r5 = "<get-dismissButton>(...)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            android.widget.Button r4 = (android.widget.Button) r4
            com.etsy.android.ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo$bind$1$2 r5 = new com.etsy.android.ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo$bind$1$2
            r5.<init>(r3, r1, r2)
            com.etsy.android.extensions.ViewExtensions.m12866j(r4, r5)
            goto L_0x07f3
        L_0x078f:
            boolean r4 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationSyntheticHeader
            if (r4 == 0) goto L_0x07f1
            com.etsy.android.ui.user.inappnotifications.NotificationHolderHeader r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderHeader) r1
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationSyntheticHeader r3 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationSyntheticHeader) r3
            if (r2 != 0) goto L_0x079a
            r10 = r7
        L_0x079a:
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationSyntheticHeader r2 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationSyntheticHeader.copy$default(r3, r5, r10, r7, r5)
            java.lang.String r3 = "data"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            kotlin.c r3 = r1.f25470b
            java.lang.Object r3 = r3.getValue()
            java.lang.String r4 = "<get-text>(...)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r4 = r2.getText()
            r3.setText(r4)
            boolean r2 = r2.isFirstItem()
            if (r2 == 0) goto L_0x07d7
            android.view.View r2 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r2, r11)
            android.view.View r1 = r1.itemView
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131165389(0x7f0700cd, float:1.7944994E38)
            int r1 = r1.getDimensionPixelSize(r3)
            kotlin.reflect.C19421p.m32938f0(r1, r2)
            goto L_0x07f3
        L_0x07d7:
            android.view.View r2 = r1.itemView
            kotlin.jvm.internal.C19383o.m32796f(r2, r11)
            android.view.View r1 = r1.itemView
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131165386(0x7f0700ca, float:1.7944988E38)
            int r1 = r1.getDimensionPixelSize(r3)
            kotlin.reflect.C19421p.m32938f0(r1, r2)
            goto L_0x07f3
        L_0x07f1:
            boolean r1 = r3 instanceof com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationSyntheticFooter
        L_0x07f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.inappnotifications.C11542b.onBindListItemViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        switch (i) {
            case 0:
                int i2 = NotificationHolderFirst.f25466d;
                return new NotificationHolderFirst(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications_first, false));
            case 1:
                int i3 = NotificationHolderYFNOS.f25517g;
                return new NotificationHolderYFNOS(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications, false), this.f25538b, this.f25539c);
            case 2:
                int i4 = NotificationHolderShopSale.f25510g;
                return new NotificationHolderShopSale(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications, false), this.f25538b, this.f25539c);
            case 3:
                int i5 = NotificationHolderNFYFS.f25477g;
                return new NotificationHolderNFYFS(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications, false), this.f25538b, this.f25539c);
            case 4:
                int i6 = NotificationHolderCLOS.f25448g;
                return new NotificationHolderCLOS(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications, false), this.f25538b, this.f25539c);
            case 5:
                int i7 = NotificationHolderFBIS.f25455g;
                return new NotificationHolderFBIS(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications, false), this.f25538b, this.f25539c);
            case 6:
                int i8 = NotificationHolderCartCoupon.f25547j;
                return new NotificationHolderCartCoupon(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications_cart_coupon, false), this.f25538b, this.f25539c);
            case 7:
                int i9 = NotificationHolderListRecs.f25471f;
                return new NotificationHolderListRecs(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications_listrecs, false), this.f25538b, this.f25539c);
            case 8:
                int i10 = NotificationHolderOneFavoriteLeft.f25484g;
                return new NotificationHolderOneFavoriteLeft(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications, false), this.f25538b, this.f25539c);
            case 9:
                int i11 = NotificationHolderFavoriteShopsPromo.f25462e;
                return new NotificationHolderFavoriteShopsPromo(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications_banner, false), this.f25538b, this.f25539c);
            case 10:
                int i12 = NotificationHolderHeader.f25469c;
                return new NotificationHolderHeader(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications_header, false));
            case 11:
                int i13 = C11579u.f25667b;
                return new C11579u(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications_footer, false));
            case 12:
                int i14 = NotificationHolderThankYouCoupon.f25642j;
                return new NotificationHolderThankYouCoupon(C0114h.m305j0(viewGroup, R.layout.list_item_in_app_notifications_ty_coupon, false), this.f25538b, this.f25539c);
            case 13:
                int i15 = NotificationHolderRecommendedShopsStandard.f25503h;
                return new NotificationHolderRecommendedShopsStandard(C0114h.m305j0(viewGroup, R.layout.list_item_updates_recommended_shops_standard, false), this.f25538b, this.f25539c);
            case 14:
                int i16 = NotificationHolderRecommendedShopsHighlighted.f25491m;
                return new NotificationHolderRecommendedShopsHighlighted(C0114h.m305j0(viewGroup, R.layout.list_item_updates_recommended_shops_highlighted, false), this.f25538b, this.f25539c);
            default:
                throw new UnknownInAppNotificationException(String.valueOf(i));
        }
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: type inference failed for: r1v17, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: type inference failed for: r1v22, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: type inference failed for: r1v27, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: type inference failed for: r1v32, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: type inference failed for: r1v37, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: type inference failed for: r1v42, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: type inference failed for: r1v47, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: type inference failed for: r1v52, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewRecycled(androidx.recyclerview.widget.RecyclerView.C3084b0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            int r0 = r6.getAdapterPosition()
            boolean r1 = r6 instanceof com.etsy.android.p327ui.user.inappnotifications.NotificationHolderYFNOS
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002e
            r1 = r6
            com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderYFNOS) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37526e()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0021
            r2 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x0021:
            if (r2 == 0) goto L_0x0027
            int r3 = r2.mo11279P0()
        L_0x0027:
            android.util.SparseIntArray r1 = r5.f25540d
            r1.put(r0, r3)
            goto L_0x0141
        L_0x002e:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.user.inappnotifications.NotificationHolderShopSale
            if (r1 == 0) goto L_0x0051
            r1 = r6
            com.etsy.android.ui.user.inappnotifications.NotificationHolderShopSale r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderShopSale) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37522f()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0044
            r2 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x0044:
            if (r2 == 0) goto L_0x004a
            int r3 = r2.mo11279P0()
        L_0x004a:
            android.util.SparseIntArray r1 = r5.f25540d
            r1.put(r0, r3)
            goto L_0x0141
        L_0x0051:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.user.inappnotifications.NotificationHolderNFYFS
            if (r1 == 0) goto L_0x0074
            r1 = r6
            com.etsy.android.ui.user.inappnotifications.NotificationHolderNFYFS r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderNFYFS) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37508f()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0067
            r2 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x0067:
            if (r2 == 0) goto L_0x006d
            int r3 = r2.mo11279P0()
        L_0x006d:
            android.util.SparseIntArray r1 = r5.f25540d
            r1.put(r0, r3)
            goto L_0x0141
        L_0x0074:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.user.inappnotifications.NotificationHolderCLOS
            if (r1 == 0) goto L_0x0097
            r1 = r6
            com.etsy.android.ui.user.inappnotifications.NotificationHolderCLOS r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderCLOS) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37493f()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x008a
            r2 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x008a:
            if (r2 == 0) goto L_0x0090
            int r3 = r2.mo11279P0()
        L_0x0090:
            android.util.SparseIntArray r1 = r5.f25540d
            r1.put(r0, r3)
            goto L_0x0141
        L_0x0097:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.user.inappnotifications.NotificationHolderFBIS
            if (r1 == 0) goto L_0x00ba
            r1 = r6
            com.etsy.android.ui.user.inappnotifications.NotificationHolderFBIS r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderFBIS) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37497f()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x00ad
            r2 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x00ad:
            if (r2 == 0) goto L_0x00b3
            int r3 = r2.mo11279P0()
        L_0x00b3:
            android.util.SparseIntArray r1 = r5.f25540d
            r1.put(r0, r3)
            goto L_0x0141
        L_0x00ba:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon
            if (r1 == 0) goto L_0x00dc
            r1 = r6
            com.etsy.android.ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon r1 = (com.etsy.android.p327ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37554h()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x00d0
            r2 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x00d0:
            if (r2 == 0) goto L_0x00d6
            int r3 = r2.mo11279P0()
        L_0x00d6:
            android.util.SparseIntArray r1 = r5.f25540d
            r1.put(r0, r3)
            goto L_0x0141
        L_0x00dc:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.user.inappnotifications.NotificationHolderOneFavoriteLeft
            if (r1 == 0) goto L_0x00fe
            r1 = r6
            com.etsy.android.ui.user.inappnotifications.NotificationHolderOneFavoriteLeft r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderOneFavoriteLeft) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37512f()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x00f2
            r2 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x00f2:
            if (r2 == 0) goto L_0x00f8
            int r3 = r2.mo11279P0()
        L_0x00f8:
            android.util.SparseIntArray r1 = r5.f25540d
            r1.put(r0, r3)
            goto L_0x0141
        L_0x00fe:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.user.inappnotifications.NotificationHolderListRecs
            if (r1 == 0) goto L_0x0120
            r1 = r6
            com.etsy.android.ui.user.inappnotifications.NotificationHolderListRecs r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderListRecs) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37503f()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0114
            r2 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x0114:
            if (r2 == 0) goto L_0x011a
            int r3 = r2.mo11279P0()
        L_0x011a:
            android.util.SparseIntArray r1 = r5.f25540d
            r1.put(r0, r3)
            goto L_0x0141
        L_0x0120:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard
            if (r1 == 0) goto L_0x0141
            r1 = r6
            com.etsy.android.ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard r1 = (com.etsy.android.p327ui.user.inappnotifications.NotificationHolderRecommendedShopsStandard) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo37519e()
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0136
            r2 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x0136:
            if (r2 == 0) goto L_0x013c
            int r3 = r2.mo11279P0()
        L_0x013c:
            android.util.SparseIntArray r1 = r5.f25540d
            r1.put(r0, r3)
        L_0x0141:
            super.onViewRecycled(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.inappnotifications.C11542b.onViewRecycled(androidx.recyclerview.widget.RecyclerView$b0):void");
    }
}
