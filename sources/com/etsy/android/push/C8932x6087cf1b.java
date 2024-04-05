package com.etsy.android.push;

import android.widget.CompoundButton;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.push.BOENotificationSettingsPresenter$notificationToggleCheckedChanged$1 */
final class C8932x6087cf1b extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ CompoundButton $buttonView;
    public final /* synthetic */ BOENotificationSettingsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8932x6087cf1b(BOENotificationSettingsPresenter bOENotificationSettingsPresenter, CompoundButton compoundButton) {
        super(1);
        this.this$0 = bOENotificationSettingsPresenter;
        this.$buttonView = compoundButton;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f19705c.mo45474a("notification_settings.update_preference.failed");
        BOENotificationSettingsFragment bOENotificationSettingsFragment = this.this$0.f19707e;
        if (bOENotificationSettingsFragment != null) {
            bOENotificationSettingsFragment.handleUpdateFailure(this.$buttonView);
        }
    }
}
