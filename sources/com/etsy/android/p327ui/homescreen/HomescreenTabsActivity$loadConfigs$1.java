package com.etsy.android.p327ui.homescreen;

import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.homescreen.HomescreenTabsActivity$loadConfigs$1 */
public final class HomescreenTabsActivity$loadConfigs$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ HomescreenTabsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomescreenTabsActivity$loadConfigs$1(HomescreenTabsActivity homescreenTabsActivity) {
        super(1);
        this.this$0 = homescreenTabsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "e");
        LogCatKt.m17045a().mo21309d("error awaiting config update on splash screen (HomescreenTabsActivity)", th);
        this.this$0.goHome();
    }
}
