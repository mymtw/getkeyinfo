package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.Lambda;
import p464va.C13547b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo$bind$1$2 */
final class NotificationHolderFavoriteShopsPromo$bind$1$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ InAppNotificationFavoriteShopsPromo $notification;
    public final /* synthetic */ int $position;
    public final /* synthetic */ NotificationHolderFavoriteShopsPromo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderFavoriteShopsPromo$bind$1$2(InAppNotificationFavoriteShopsPromo inAppNotificationFavoriteShopsPromo, NotificationHolderFavoriteShopsPromo notificationHolderFavoriteShopsPromo, int i) {
        super(1);
        this.$notification = inAppNotificationFavoriteShopsPromo;
        this.this$0 = notificationHolderFavoriteShopsPromo;
        this.$position = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f25464c.invoke(new C11564q.C11565a(this.$position, new C13547b(this.$notification.getDismissAction().getApiPathField(), C19294b0.m32559p0(), this.$notification.getDismissAction().getApiMethod())));
    }
}
