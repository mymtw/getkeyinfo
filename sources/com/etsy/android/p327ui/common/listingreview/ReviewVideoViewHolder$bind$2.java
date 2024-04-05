package com.etsy.android.p327ui.common.listingreview;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.ReviewVideoViewHolder$bind$2 */
final class ReviewVideoViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ int $position;
    public final /* synthetic */ C9442d this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewVideoViewHolder$bind$2(C9442d dVar, int i) {
        super(1);
        this.this$0 = dVar;
        this.$position = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19857l<Integer, C19394m> lVar = this.this$0.f20938b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(this.$position));
        }
    }
}
