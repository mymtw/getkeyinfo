package com.etsy.android.push;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.etsy.android.p327ui.navigation.exceptions.UnsupportedNavigationException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p356ge.C12788a;
import p370ie.C12950j;
import p753kq.C19857l;

public final class BOENotificationSettingsFragment$onCreateView$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ BOENotificationSettingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BOENotificationSettingsFragment$onCreateView$2(BOENotificationSettingsFragment bOENotificationSettingsFragment) {
        super(1);
        this.this$0 = bOENotificationSettingsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        Context context;
        BOENotificationSettingsFragment bOENotificationSettingsFragment = this.this$0.getPresenter().f19707e;
        if (bOENotificationSettingsFragment != null && (context = bOENotificationSettingsFragment.getContext()) != null) {
            String packageName = context.getPackageName();
            C19383o.m32796f(packageName, "it.packageName");
            C12950j jVar = new C12950j(packageName, context.getApplicationInfo().uid);
            if (context instanceof Activity) {
                C12788a.m20425d((Activity) context, jVar);
                return;
            }
            throw new UnsupportedNavigationException("Context " + context + " is not an Activity");
        }
    }
}
