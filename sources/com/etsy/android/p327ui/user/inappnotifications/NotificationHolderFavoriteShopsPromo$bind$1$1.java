package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.NotificationHolderFavoriteShopsPromo$bind$1$1 */
final class NotificationHolderFavoriteShopsPromo$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11540a $dependencies;
    public final /* synthetic */ InAppNotificationFavoriteShopsPromo $notification;
    public final /* synthetic */ NotificationHolderFavoriteShopsPromo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationHolderFavoriteShopsPromo$bind$1$1(NotificationHolderFavoriteShopsPromo notificationHolderFavoriteShopsPromo, C11540a aVar, InAppNotificationFavoriteShopsPromo inAppNotificationFavoriteShopsPromo) {
        super(1);
        this.this$0 = notificationHolderFavoriteShopsPromo;
        this.$dependencies = aVar;
        this.$notification = inAppNotificationFavoriteShopsPromo;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C1993m.m4359T(this.this$0.f25463b, this.$dependencies);
        this.this$0.f25464c.invoke(new C11564q.C11570f(this.$notification.getLandingPageLink()));
    }
}
