package com.etsy.android.p327ui.common.listingreview;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.ReviewImageViewHolder$bind$2 */
final class ReviewImageViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9440b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewImageViewHolder$bind$2(C9440b bVar) {
        super(1);
        this.this$0 = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        Object tag = view != null ? view.getTag() : null;
        C19383o.m32795e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        C19857l<Integer, C19394m> lVar = this.this$0.f20935b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(intValue));
        }
    }
}
