package com.etsy.android.p327ui.home.home;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.home.HomeViewModel$loadHome$5 */
public final class HomeViewModel$loadHome$5 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$loadHome$5(HomeViewModel homeViewModel) {
        super(1);
        this.this$0 = homeViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "error");
        HomeViewModel.m18172b(this.this$0, th);
    }
}
