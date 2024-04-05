package com.etsy.android.p327ui.you;

import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.you.YouFragment$onViewCreated$5 */
public final class YouFragment$onViewCreated$5 extends Lambda implements C19857l<List<? extends C11806c>, C19394m> {
    public final /* synthetic */ YouFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YouFragment$onViewCreated$5(YouFragment youFragment) {
        super(1);
        this.this$0 = youFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends C11806c>) (List) obj);
        return C19394m.f43287a;
    }

    public final void invoke(List<? extends C11806c> list) {
        this.this$0.getMenuAdapter().mo11950j(list);
    }
}
