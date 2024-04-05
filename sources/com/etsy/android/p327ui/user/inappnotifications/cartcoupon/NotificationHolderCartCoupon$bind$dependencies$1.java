package com.etsy.android.p327ui.user.inappnotifications.cartcoupon;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.p327ui.user.inappnotifications.C11540a;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import com.etsy.android.p327ui.user.inappnotifications.C11573r;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.cartcoupon.NotificationHolderCartCoupon$bind$dependencies$1 */
public final class NotificationHolderCartCoupon$bind$dependencies$1 extends Lambda implements C19857l<C11573r, C19394m> {
    public final /* synthetic */ C11549a $notification;
    public final /* synthetic */ NotificationHolderCartCoupon this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderCartCoupon$bind$dependencies$1(NotificationHolderCartCoupon notificationHolderCartCoupon, C11549a aVar) {
        super(1);
        this.this$0 = notificationHolderCartCoupon;
        this.$notification = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11573r) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11573r rVar) {
        C19383o.m32797g(rVar, "event");
        NotificationHolderCartCoupon notificationHolderCartCoupon = this.this$0;
        C11549a aVar = this.$notification;
        String str = aVar.f25557a;
        String str2 = aVar.f25558b;
        Long l = aVar.f25559c;
        int i = NotificationHolderCartCoupon.f25547j;
        notificationHolderCartCoupon.getClass();
        if (rVar instanceof C11573r.C11574a) {
            C11573r.C11574a aVar2 = (C11573r.C11574a) rVar;
            notificationHolderCartCoupon.f25550c.invoke(new C11564q.C11568d(aVar2.f25637a, aVar2.f25638b, str2, l));
        } else if (rVar instanceof C11573r.C11575b) {
            C11573r.C11575b bVar = (C11573r.C11575b) rVar;
            C1993m.m4359T(notificationHolderCartCoupon.f25549b, new C11540a("notification_tapped_listing", l, str2, Long.valueOf(bVar.f25639a.getListingId().getIdAsLongDeprecated()), (Long) null, (Boolean) null, str, (String) null, 176));
            notificationHolderCartCoupon.f25550c.invoke(new C11564q.C11571g(bVar.f25639a));
        }
    }
}
