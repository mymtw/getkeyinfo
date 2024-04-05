package com.etsy.android.p327ui.home.tabs;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerFragment$onViewCreated$7 */
public final class HomePagerFragment$onViewCreated$7 extends Lambda implements C19857l<C19394m, C19394m> {
    public final /* synthetic */ View $view;
    public final /* synthetic */ HomePagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePagerFragment$onViewCreated$7(View view, HomePagerFragment homePagerFragment) {
        super(1);
        this.$view = view;
        this.this$0 = homePagerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C19394m) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C19394m mVar) {
        C19383o.m32797g(mVar, "it");
        this.$view.post(new C10058h(this.this$0));
    }
}
