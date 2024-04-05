package com.etsy.android.p327ui.home.tabs;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p458uc.C13472e;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerFragment$onViewCreated$5 */
public final class HomePagerFragment$onViewCreated$5 extends Lambda implements C19857l<C13472e, C19394m> {
    public final /* synthetic */ HomePagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePagerFragment$onViewCreated$5(HomePagerFragment homePagerFragment) {
        super(1);
        this.this$0 = homePagerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13472e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13472e eVar) {
        C19383o.m32797g(eVar, "uiModel");
        this.this$0.showPurchaseClaimStatus(eVar);
    }
}
