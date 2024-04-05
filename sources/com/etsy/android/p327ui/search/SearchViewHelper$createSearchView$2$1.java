package com.etsy.android.p327ui.search;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.uikit.util.AnimationUtil;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p430qe.C13300a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.SearchViewHelper$createSearchView$2$1 */
final class SearchViewHelper$createSearchView$2$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C10866i this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchViewHelper$createSearchView$2$1(C10866i iVar) {
        super(1);
        this.this$0 = iVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        boolean z;
        C10866i iVar = this.this$0;
        C13300a aVar = iVar.f24108l;
        if (aVar != null) {
            if (!iVar.f24111o) {
                AnimationUtil.m19605a(iVar.f24105i, R.drawable.clg_icon_favorited);
                aVar.onSaveSearch(iVar.f24103g.getQuery().toString());
                z = true;
            } else {
                iVar.f24105i.setImageResource(R.drawable.clg_icon_unfavorited);
                aVar.onDeleteSearch();
                z = false;
            }
            iVar.f24111o = z;
            iVar.mo36076h(z);
        }
    }
}
