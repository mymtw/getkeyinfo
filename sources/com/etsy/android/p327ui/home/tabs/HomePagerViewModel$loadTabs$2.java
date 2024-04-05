package com.etsy.android.p327ui.home.tabs;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.home.tabs.C10070p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerViewModel$loadTabs$2 */
public final class HomePagerViewModel$loadTabs$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ HomePagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$loadTabs$2(HomePagerViewModel homePagerViewModel) {
        super(1);
        this.this$0 = homePagerViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f22119e.mo45474a("cbf.home.home_tabs.error.load_tabs_error");
        LogCatKt.m17045a().error(th);
        if (this.this$0.f22118d.f22153a.mo21132b(C8592b.f18790f1)) {
            this.this$0.f22125k.mo30457b(th);
        }
        this.this$0.f22128n.setValue(C10070p.C10071a.f22200a);
    }
}
