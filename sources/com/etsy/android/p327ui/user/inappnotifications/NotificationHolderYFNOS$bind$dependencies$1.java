package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import com.etsy.android.p327ui.user.inappnotifications.C11573r;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderYFNOS$bind$dependencies$1 */
final class NotificationHolderYFNOS$bind$dependencies$1 extends Lambda implements C19857l<C11573r, C19394m> {
    public final /* synthetic */ InAppNotificationYFNOS $notification;
    public final /* synthetic */ NotificationHolderYFNOS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderYFNOS$bind$dependencies$1(NotificationHolderYFNOS notificationHolderYFNOS, InAppNotificationYFNOS inAppNotificationYFNOS) {
        super(1);
        this.this$0 = notificationHolderYFNOS;
        this.$notification = inAppNotificationYFNOS;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11573r) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11573r rVar) {
        C19383o.m32797g(rVar, "event");
        NotificationHolderYFNOS notificationHolderYFNOS = this.this$0;
        String feedId = this.$notification.getFeedId();
        Long valueOf = Long.valueOf(this.$notification.getListingId());
        int i = NotificationHolderYFNOS.f25517g;
        notificationHolderYFNOS.getClass();
        if (rVar instanceof C11573r.C11574a) {
            C11573r.C11574a aVar = (C11573r.C11574a) rVar;
            notificationHolderYFNOS.f25520c.invoke(new C11564q.C11568d(aVar.f25637a, aVar.f25638b, feedId, valueOf));
        } else if (rVar instanceof C11573r.C11575b) {
            C11573r.C11575b bVar = (C11573r.C11575b) rVar;
            notificationHolderYFNOS.mo37527f(bVar.f25639a.getListingId().getIdAsLongDeprecated(), feedId, valueOf);
            notificationHolderYFNOS.f25520c.invoke(new C11564q.C11571g(bVar.f25639a));
        }
    }
}
