package com.etsy.android.p327ui.search;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.SearchViewHelper$createSearchView$3$1 */
final class SearchViewHelper$createSearchView$3$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C10866i this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchViewHelper$createSearchView$3$1(C10866i iVar) {
        super(1);
        this.this$0 = iVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C10866i iVar = this.this$0;
        View.OnClickListener onClickListener = iVar.f24102f;
        if (onClickListener != null) {
            onClickListener.onClick(iVar.f24106j);
        }
    }
}
