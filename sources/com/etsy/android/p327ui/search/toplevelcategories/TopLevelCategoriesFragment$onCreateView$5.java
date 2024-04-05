package com.etsy.android.p327ui.search.toplevelcategories;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p430qe.C13311c;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.toplevelcategories.TopLevelCategoriesFragment$onCreateView$5 */
public final class TopLevelCategoriesFragment$onCreateView$5 extends Lambda implements C19857l<C13311c, C19394m> {
    public final /* synthetic */ TopLevelCategoriesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopLevelCategoriesFragment$onCreateView$5(TopLevelCategoriesFragment topLevelCategoriesFragment) {
        super(1);
        this.this$0 = topLevelCategoriesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13311c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13311c cVar) {
        TopLevelCategoriesFragment topLevelCategoriesFragment = this.this$0;
        C19383o.m32796f(cVar, "clickType");
        topLevelCategoriesFragment.processClickType(cVar);
    }
}
