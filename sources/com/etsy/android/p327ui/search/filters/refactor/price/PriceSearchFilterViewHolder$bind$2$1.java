package com.etsy.android.p327ui.search.filters.refactor.price;

import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.price.PriceSearchFilterViewHolder$bind$2$1 */
public final class PriceSearchFilterViewHolder$bind$2$1 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ PriceSearchFilterViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PriceSearchFilterViewHolder$bind$2$1(PriceSearchFilterViewHolder priceSearchFilterViewHolder) {
        super(1);
        this.this$0 = priceSearchFilterViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "minText");
        this.this$0.f24022b.invoke(new C10813l.C10816c(true, str));
    }
}
