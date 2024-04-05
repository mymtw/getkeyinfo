package com.etsy.android.push;

import android.support.p013v4.media.C0072d;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.PushNotificationSetting;
import com.etsy.android.stylekit.views.CollageSwitch;
import com.etsy.android.uikit.util.TrackingOnCheckedChangeListener;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.rxkotlin.SubscribersKt;

public final class BOENotificationSettingsFragment$checkedChangedListener$1 extends TrackingOnCheckedChangeListener {
    public final /* synthetic */ BOENotificationSettingsFragment this$0;

    public BOENotificationSettingsFragment$checkedChangedListener$1(BOENotificationSettingsFragment bOENotificationSettingsFragment) {
        this.this$0 = bOENotificationSettingsFragment;
    }

    public void onViewCheckedChanged(CompoundButton compoundButton, boolean z) {
        C19383o.m32797g(compoundButton, "buttonView");
        BOENotificationSettingsPresenter presenter = this.this$0.getPresenter();
        presenter.getClass();
        ViewParent parent = compoundButton.getParent();
        C19383o.m32795e(parent, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageSwitch");
        Object tag = ((CollageSwitch) parent).getTag();
        C19383o.m32795e(tag, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.PushNotificationSetting");
        PushNotificationSetting pushNotificationSetting = (PushNotificationSetting) tag;
        pushNotificationSetting.setEnabled(compoundButton.isChecked());
        presenter.f19709g.mo19403b(SubscribersKt.m32500e(C0391c.m1056b(presenter.f19703a, C0072d.m199f(presenter.f19703a, presenter.f19706d.mo30232d(pushNotificationSetting.getKey(), pushNotificationSetting.getEnabled()))), new C8932x6087cf1b(presenter, compoundButton), new C8933x6087cf1c(presenter, pushNotificationSetting, compoundButton)));
    }
}
