package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.squareup.moshi.C17403o;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.C17389b;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = false)
public abstract class InAppNotification {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final InAppNotificationType notification_type;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JsonAdapter.C17360e adapterFactory() {
            PolymorphicJsonAdapterFactory<InAppNotification> b = PolymorphicJsonAdapterFactory.m29127a(InAppNotification.class, "notification_type").mo68486b(InAppNotificationFirst.class, InAppNotificationType.FIRST.name()).mo68486b(InAppNotificationNFYFS.class, InAppNotificationType.NFYFS.name()).mo68486b(InAppNotificationYFNOS.class, InAppNotificationType.YFNOS.name()).mo68486b(InAppNotificationShopSale.class, InAppNotificationType.SHOPSALE.name()).mo68486b(InAppNotificationCLOS.class, InAppNotificationType.CLOS.name()).mo68486b(InAppNotificationFBIS.class, InAppNotificationType.FBIS.name()).mo68486b(InAppNotificationRFC.class, InAppNotificationType.RFC.name()).mo68486b(InAppNotificationAbandonedCartOffer.class, InAppNotificationType.ABANDONED_CART_OFFER.name()).mo68486b(InAppNotificationListRec.class, InAppNotificationType.COLLECTION_RECS.name()).mo68486b(InAppNotificationOneFavoriteLeft.class, InAppNotificationType.ONE_FAVORITE_LEFT.name()).mo68486b(InAppNotificationFavoriteShopsPromo.class, InAppNotificationType.FAVORITE_SHOPS_PROMO.name()).mo68486b(InAppNotificationThankYouCoupon.class, InAppNotificationType.THANK_YOU_COUPON.name()).mo68486b(InAppNotificationThankYouCouponReminder.class, InAppNotificationType.THANK_YOU_COUPON_REMINDER.name()).mo68486b(InAppNotificationRecommendedShopsStandard.class, InAppNotificationType.RECOMMENDED_SHOPS_STANDARD.name()).mo68486b(InAppNotificationRecommendedShopsHighlighted.class, InAppNotificationType.RECOMMENDED_SHOPS_HIGHLIGHTED.name());
            return new PolymorphicJsonAdapterFactory(b.f37945a, b.f37946b, b.f37947c, b.f37948d, new C17389b(b, new UnknownInAppNotification((InAppNotificationType) null, 1, (DefaultConstructorMarker) null)));
        }
    }

    public InAppNotification(InAppNotificationType inAppNotificationType) {
        C19383o.m32797g(inAppNotificationType, "notification_type");
        this.notification_type = inAppNotificationType;
    }

    public final InAppNotificationType getNotification_type() {
        return this.notification_type;
    }
}
