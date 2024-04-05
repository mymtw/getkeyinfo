package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS$bind$2 */
final class NotificationHolderYFNOS$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ boolean $haveListings;
    public final /* synthetic */ InAppNotificationYFNOS $notification;
    public final /* synthetic */ NotificationHolderYFNOS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderYFNOS$bind$2(boolean z, NotificationHolderYFNOS notificationHolderYFNOS, InAppNotificationYFNOS inAppNotificationYFNOS) {
        super(1);
        this.$haveListings = z;
        this.this$0 = notificationHolderYFNOS;
        this.$notification = inAppNotificationYFNOS;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        if (this.$haveListings) {
            C19857l<C11564q, C19394m> lVar = this.this$0.f25520c;
            List<IANListingCard> listings = this.$notification.getListings();
            C19383o.m32794d(listings);
            lVar.invoke(new C11564q.C11571g(listings.get(0)));
            List<IANListingCard> listings2 = this.$notification.getListings();
            C19383o.m32794d(listings2);
            if (listings2.get(0).getListingId() != null) {
                NotificationHolderYFNOS notificationHolderYFNOS = this.this$0;
                List<IANListingCard> listings3 = this.$notification.getListings();
                C19383o.m32794d(listings3);
                Long listingId = listings3.get(0).getListingId();
                C19383o.m32794d(listingId);
                notificationHolderYFNOS.mo37527f(listingId.longValue(), this.$notification.getFeedId(), this.$notification.getFeedIndex());
            }
        }
    }
}
