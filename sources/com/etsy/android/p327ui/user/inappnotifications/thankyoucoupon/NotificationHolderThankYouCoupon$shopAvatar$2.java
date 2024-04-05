package com.etsy.android.p327ui.user.inappnotifications.thankyoucoupon;

import android.widget.ImageView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.thankyoucoupon.NotificationHolderThankYouCoupon$shopAvatar$2 */
public final class NotificationHolderThankYouCoupon$shopAvatar$2 extends Lambda implements C19846a<ImageView> {
    public final /* synthetic */ NotificationHolderThankYouCoupon this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderThankYouCoupon$shopAvatar$2(NotificationHolderThankYouCoupon notificationHolderThankYouCoupon) {
        super(0);
        this.this$0 = notificationHolderThankYouCoupon;
    }

    public final ImageView invoke() {
        return (ImageView) this.this$0.itemView.findViewById(R.id.shop_avatar);
    }
}
