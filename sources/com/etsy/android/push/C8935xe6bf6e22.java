package com.etsy.android.push;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.push.BOENotificationSettingsPresenter$requestPushNotificationSettings$1 */
public final class C8935xe6bf6e22 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ BOENotificationSettingsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8935xe6bf6e22(BOENotificationSettingsPresenter bOENotificationSettingsPresenter) {
        super(1);
        this.this$0 = bOENotificationSettingsPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        BOENotificationSettingsFragment bOENotificationSettingsFragment = this.this$0.f19707e;
        if (bOENotificationSettingsFragment != null) {
            bOENotificationSettingsFragment.showErrorView();
        }
    }
}
