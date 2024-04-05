package com.etsy.android.lib.push.settings;

import android.app.NotificationChannel;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.apiv3.PushNotificationSetting;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.lib.push.settings.NotificationSettings$updateNotificationSettingsWithChannelInfo$1$1$2 */
public final class C8843x2a11f8a6 extends Lambda implements C19857l<C20145v<Void>, C19394m> {
    public final /* synthetic */ NotificationChannel $channel;
    public final /* synthetic */ PushNotificationSetting $currentSetting;
    public final /* synthetic */ NotificationSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8843x2a11f8a6(PushNotificationSetting pushNotificationSetting, NotificationChannel notificationChannel, NotificationSettings notificationSettings) {
        super(1);
        this.$currentSetting = pushNotificationSetting;
        this.$channel = notificationChannel;
        this.this$0 = notificationSettings;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C20145v<Void>) (C20145v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C20145v<Void> vVar) {
        if (vVar.mo74384a()) {
            this.$currentSetting.setEnabled(C15562d.m25169G(this.$channel));
            C8694h hVar = this.this$0.f19454a;
            StringBuilder h = C0072d.m201h("Updated ");
            h.append(this.$currentSetting.getKey());
            h.append(" notification settings - enabled: ");
            h.append(this.$currentSetting.getEnabled());
            h.append('!');
            hVar.mo21312f(h.toString());
        }
    }
}
