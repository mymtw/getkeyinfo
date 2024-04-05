package com.etsy.android.push;

import android.support.p013v4.media.C0072d;
import android.widget.CompoundButton;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.apiv3.PushNotificationSetting;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.push.BOENotificationSettingsPresenter$notificationToggleCheckedChanged$2 */
final class C8933x6087cf1c extends Lambda implements C19857l<C20145v<Void>, C19394m> {
    public final /* synthetic */ CompoundButton $buttonView;
    public final /* synthetic */ PushNotificationSetting $notificationSetting;
    public final /* synthetic */ BOENotificationSettingsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8933x6087cf1c(BOENotificationSettingsPresenter bOENotificationSettingsPresenter, PushNotificationSetting pushNotificationSetting, CompoundButton compoundButton) {
        super(1);
        this.this$0 = bOENotificationSettingsPresenter;
        this.$notificationSetting = pushNotificationSetting;
        this.$buttonView = compoundButton;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C20145v<Void>) (C20145v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C20145v<Void> vVar) {
        if (vVar.mo74384a()) {
            this.this$0.f19705c.mo45474a("notification_settings.update_preference.success");
            BOENotificationSettingsFragment bOENotificationSettingsFragment = this.this$0.f19707e;
            if (bOENotificationSettingsFragment != null) {
                bOENotificationSettingsFragment.handleUpdateSuccess();
            }
            C8694h hVar = this.this$0.f19704b;
            StringBuilder h = C0072d.m201h("Successfully updated notification settings: ");
            h.append(this.$notificationSetting.getKey());
            hVar.mo21310e(h.toString());
            return;
        }
        this.this$0.f19705c.mo45474a("notification_settings.update_preference.failed");
        BOENotificationSettingsFragment bOENotificationSettingsFragment2 = this.this$0.f19707e;
        if (bOENotificationSettingsFragment2 != null) {
            bOENotificationSettingsFragment2.handleUpdateFailure(this.$buttonView);
        }
    }
}
