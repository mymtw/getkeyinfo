package com.etsy.android.p327ui.home.tabs;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerViewModel$initialize$2 */
final class HomePagerViewModel$initialize$2 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ HomePagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePagerViewModel$initialize$2(HomePagerViewModel homePagerViewModel) {
        super(1);
        this.this$0 = homePagerViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Boolean bool) {
        this.this$0.mo33342f();
        C19383o.m32796f(bool, "signedIn");
        if (bool.booleanValue()) {
            this.this$0.mo33341e();
        }
    }
}
