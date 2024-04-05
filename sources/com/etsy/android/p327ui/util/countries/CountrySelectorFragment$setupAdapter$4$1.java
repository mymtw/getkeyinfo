package com.etsy.android.p327ui.util.countries;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.util.countries.CountrySelectorFragment$setupAdapter$4$1 */
public final class CountrySelectorFragment$setupAdapter$4$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CountrySelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountrySelectorFragment$setupAdapter$4$1(CountrySelectorFragment countrySelectorFragment) {
        super(1);
        this.this$0 = countrySelectorFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.getRecyclerView().scrollToPosition(0);
    }
}
