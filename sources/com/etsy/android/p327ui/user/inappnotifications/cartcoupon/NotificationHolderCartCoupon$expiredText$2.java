package com.etsy.android.p327ui.user.inappnotifications.cartcoupon;

import android.widget.TextView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon$expiredText$2 */
public final class NotificationHolderCartCoupon$expiredText$2 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ NotificationHolderCartCoupon this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderCartCoupon$expiredText$2(NotificationHolderCartCoupon notificationHolderCartCoupon) {
        super(0);
        this.this$0 = notificationHolderCartCoupon;
    }

    public final TextView invoke() {
        return (TextView) this.this$0.itemView.findViewById(R.id.ian_cart_coupon_coupon_expired_text);
    }
}
