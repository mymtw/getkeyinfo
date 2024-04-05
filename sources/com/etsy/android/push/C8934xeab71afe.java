package com.etsy.android.push;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.push.BOENotificationSettingsPresenter$populateFromNotificationChannels$1 */
final class C8934xeab71afe extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ BOENotificationSettingsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8934xeab71afe(BOENotificationSettingsPresenter bOENotificationSettingsPresenter) {
        super(1);
        this.this$0 = bOENotificationSettingsPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        Context context;
        String str = null;
        Object tag = view != null ? view.getTag() : null;
        C19383o.m32795e(tag, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) tag;
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        BOENotificationSettingsFragment bOENotificationSettingsFragment = this.this$0.f19707e;
        if (!(bOENotificationSettingsFragment == null || (context = bOENotificationSettingsFragment.getContext()) == null)) {
            str = context.getPackageName();
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", str);
        intent.putExtra("android.provider.extra.CHANNEL_ID", str2);
        BOENotificationSettingsFragment bOENotificationSettingsFragment2 = this.this$0.f19707e;
        if (bOENotificationSettingsFragment2 != null) {
            bOENotificationSettingsFragment2.startActivityForResult(intent, 2);
        }
    }
}
