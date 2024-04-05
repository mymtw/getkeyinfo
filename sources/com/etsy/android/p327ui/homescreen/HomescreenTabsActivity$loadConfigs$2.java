package com.etsy.android.p327ui.homescreen;

import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p486y9.C13887c;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.homescreen.HomescreenTabsActivity$loadConfigs$2 */
public final class HomescreenTabsActivity$loadConfigs$2 extends Lambda implements C19857l<C13887c, C19394m> {
    public final /* synthetic */ HomescreenTabsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomescreenTabsActivity$loadConfigs$2(HomescreenTabsActivity homescreenTabsActivity) {
        super(1);
        this.this$0 = homescreenTabsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13887c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13887c cVar) {
        LogCatKt.m17045a().mo21313g("config updated");
        this.this$0.goHome();
    }
}
