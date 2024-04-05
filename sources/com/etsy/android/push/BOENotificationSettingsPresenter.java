package com.etsy.android.push;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.push.settings.NotificationSettings;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p346fa.C12703a;
import p456ua.C13461f;

public final class BOENotificationSettingsPresenter {

    /* renamed from: a */
    public final C13461f f19703a;

    /* renamed from: b */
    public final C8694h f19704b;

    /* renamed from: c */
    public final C12703a f19705c;

    /* renamed from: d */
    public final NotificationSettings f19706d;

    /* renamed from: e */
    public BOENotificationSettingsFragment f19707e;

    /* renamed from: f */
    public boolean f19708f = true;

    /* renamed from: g */
    public final C7091a f19709g = new C7091a();

    public BOENotificationSettingsPresenter(C13461f fVar, C8694h hVar, C12703a aVar, NotificationSettings notificationSettings) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(notificationSettings, "notificationSettingsManager");
        this.f19703a = fVar;
        this.f19704b = hVar;
        this.f19705c = aVar;
        this.f19706d = notificationSettings;
    }

    /* renamed from: a */
    public final void mo30537a() {
        BOENotificationSettingsFragment bOENotificationSettingsFragment = this.f19707e;
        if (bOENotificationSettingsFragment != null) {
            bOENotificationSettingsFragment.showLoadingView();
        }
        this.f19709g.mo19403b(SubscribersKt.m32500e(C0391c.m1056b(this.f19703a, C0326j.m860e(this.f19703a, this.f19706d.mo30231c())), new C8935xe6bf6e22(this), new C8936xe6bf6e23(this)));
    }
}
