package com.etsy.android.push;

import android.app.NotificationChannel;
import android.view.View;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.push.settings.C8845b;
import com.etsy.android.stylekit.views.CollageSwitch;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.push.BOENotificationSettingsPresenter$requestPushNotificationSettings$2 */
public final class C8936xe6bf6e23 extends Lambda implements C19857l<C8845b, C19394m> {
    public final /* synthetic */ BOENotificationSettingsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8936xe6bf6e23(BOENotificationSettingsPresenter bOENotificationSettingsPresenter) {
        super(1);
        this.this$0 = bOENotificationSettingsPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8845b) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8845b bVar) {
        if (bVar instanceof C8845b.C8847b) {
            BOENotificationSettingsPresenter bOENotificationSettingsPresenter = this.this$0;
            BOENotificationSettingsFragment bOENotificationSettingsFragment = bOENotificationSettingsPresenter.f19707e;
            if (bOENotificationSettingsFragment != null) {
                bOENotificationSettingsFragment.resetNotificationSubscriptionPanel();
            }
            for (NotificationChannel next : bOENotificationSettingsPresenter.f19706d.f19464k.values()) {
                BOENotificationSettingsFragment bOENotificationSettingsFragment2 = bOENotificationSettingsPresenter.f19707e;
                View inflateSettingsRow = bOENotificationSettingsFragment2 != null ? bOENotificationSettingsFragment2.inflateSettingsRow() : null;
                C19383o.m32794d(inflateSettingsRow);
                CollageSwitch collageSwitch = (CollageSwitch) inflateSettingsRow.findViewById(R.id.zwitch);
                inflateSettingsRow.setTag(next.getId());
                collageSwitch.setClickable(false);
                ViewExtensions.m12866j(inflateSettingsRow, new C8934xeab71afe(bOENotificationSettingsPresenter));
                collageSwitch.setTitle(next.getName().toString());
                collageSwitch.setDescription(next.getDescription());
                collageSwitch.setChecked(C15562d.m25169G(next));
                BOENotificationSettingsFragment bOENotificationSettingsFragment3 = bOENotificationSettingsPresenter.f19707e;
                if (bOENotificationSettingsFragment3 != null) {
                    bOENotificationSettingsFragment3.addViewToNotificationSubscriptionPanel(inflateSettingsRow);
                }
                if (!bOENotificationSettingsPresenter.f19708f) {
                    inflateSettingsRow.setAlpha(0.5f);
                    inflateSettingsRow.setEnabled(false);
                }
            }
            BOENotificationSettingsFragment bOENotificationSettingsFragment4 = bOENotificationSettingsPresenter.f19707e;
            if (bOENotificationSettingsFragment4 != null) {
                bOENotificationSettingsFragment4.showNotificationSubscriptionPanel();
                return;
            }
            return;
        }
        BOENotificationSettingsFragment bOENotificationSettingsFragment5 = this.this$0.f19707e;
        if (bOENotificationSettingsFragment5 != null) {
            bOENotificationSettingsFragment5.showErrorView();
        }
    }
}
