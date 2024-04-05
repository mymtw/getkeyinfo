package com.etsy.android.p327ui.you;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.you.YouFragment$onViewCreated$3 */
public final class YouFragment$onViewCreated$3 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ YouFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YouFragment$onViewCreated$3(YouFragment youFragment) {
        super(1);
        this.this$0 = youFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Boolean bool) {
        YouFragment youFragment = this.this$0;
        C19383o.m32796f(bool, "it");
        youFragment.onSignInChanged(bool.booleanValue());
    }
}
