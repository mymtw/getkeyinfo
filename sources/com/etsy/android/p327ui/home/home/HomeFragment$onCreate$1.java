package com.etsy.android.p327ui.home.home;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.home.HomeFragment$onCreate$1 */
public final class HomeFragment$onCreate$1 extends Lambda implements C19861p<String, String, C19394m> {
    public final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeFragment$onCreate$1(HomeFragment homeFragment) {
        super(2);
        this.this$0 = homeFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, String str2) {
        C19383o.m32797g(str, "displayLocation");
        C19383o.m32797g(str2, "loggingKey");
        HomeViewModel access$getViewModel = this.this$0.getViewModel();
        access$getViewModel.getClass();
        access$getViewModel.f21982g.mo20868b(str, str2);
    }
}
