package com.etsy.android.p327ui.user.inappnotifications.cartcoupon;

import android.view.View;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.p327ui.cart.C9296f;
import com.etsy.android.p327ui.user.inappnotifications.C11540a;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon$bind$1$3 */
public final class NotificationHolderCartCoupon$bind$1$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11549a $notification;
    public final /* synthetic */ NotificationHolderCartCoupon this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderCartCoupon$bind$1$3(C11549a aVar, NotificationHolderCartCoupon notificationHolderCartCoupon) {
        super(1);
        this.$notification = aVar;
        this.this$0 = notificationHolderCartCoupon;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        if (C19543e0.m33306Y(this.$notification.f25565i) && C19543e0.m33306Y(this.$notification.f25573q)) {
            NotificationHolderCartCoupon notificationHolderCartCoupon = this.this$0;
            C11549a aVar = this.$notification;
            String str = aVar.f25557a;
            String str2 = aVar.f25568l;
            long j = aVar.f25562f;
            long j2 = aVar.f25572p;
            List<String> list = aVar.f25573q;
            C19383o.m32794d(list);
            C9296f.C9301e eVar = new C9296f.C9301e(j, j2, str2, list.get(0));
            C11549a aVar2 = this.$notification;
            String str3 = aVar2.f25558b;
            Long l = aVar2.f25559c;
            int i = NotificationHolderCartCoupon.f25547j;
            notificationHolderCartCoupon.getClass();
            C1993m.m4359T(notificationHolderCartCoupon.f25549b, new C11540a("notification_tapped_cart", l, str3, (Long) null, (Long) null, (Boolean) null, str, (String) null, 184));
            notificationHolderCartCoupon.f25550c.invoke(new C11564q.C11567c(eVar));
        }
    }
}
