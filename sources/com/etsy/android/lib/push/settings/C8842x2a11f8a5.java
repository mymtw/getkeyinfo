package com.etsy.android.lib.push.settings;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.apiv3.PushNotificationSetting;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.lib.push.settings.NotificationSettings$updateNotificationSettingsWithChannelInfo$1$1$1 */
public final class C8842x2a11f8a5 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ PushNotificationSetting $currentSetting;
    public final /* synthetic */ NotificationSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8842x2a11f8a5(NotificationSettings notificationSettings, PushNotificationSetting pushNotificationSetting) {
        super(1);
        this.this$0 = notificationSettings;
        this.$currentSetting = pushNotificationSetting;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        C8694h hVar = this.this$0.f19454a;
        StringBuilder h = C0072d.m201h("Failed to update ");
        h.append(this.$currentSetting.getKey());
        h.append(" notification settings!");
        hVar.mo21306a(h.toString());
        this.this$0.f19460g.mo45474a("push_notification_settings.update_failure");
    }
}
