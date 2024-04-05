package com.etsy.android.uikit.viewholder;

import android.view.View;
import com.etsy.android.lib.models.apiv3.ILink;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class QueryReformulationsListViewHolder$addCard$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ILink $segment;
    public final /* synthetic */ C12014w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QueryReformulationsListViewHolder$addCard$1(C12014w wVar, ILink iLink) {
        super(1);
        this.this$0 = wVar;
        this.$segment = iLink;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f26977c.mo31328c(this.$segment.getLink());
    }
}
