package com.etsy.android.p327ui.home.landingpage;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.home.landingpage.LandingPageFragment$onCreate$1 */
public final class LandingPageFragment$onCreate$1 extends Lambda implements C19861p<String, String, C19394m> {
    public final /* synthetic */ LandingPageFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LandingPageFragment$onCreate$1(LandingPageFragment landingPageFragment) {
        super(2);
        this.this$0 = landingPageFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(String str, String str2) {
        C19383o.m32797g(str, "displayLocation");
        C19383o.m32797g(str2, "loggingKey");
        LandingPageViewModel access$getViewModel = this.this$0.getViewModel();
        access$getViewModel.getClass();
        access$getViewModel.f22048f.mo20868b(str, str2);
    }
}
