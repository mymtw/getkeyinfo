package com.etsy.android.p327ui.search;

import android.view.View;
import androidx.appcompat.widget.SearchView;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.SearchViewHelper$wrapAndSetClearButtonOnClickListener$1 */
final class SearchViewHelper$wrapAndSetClearButtonOnClickListener$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ SearchView.SearchAutoComplete $searchText;
    public final /* synthetic */ C10866i this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchViewHelper$wrapAndSetClearButtonOnClickListener$1(C10866i iVar, SearchView.SearchAutoComplete searchAutoComplete) {
        super(1);
        this.this$0 = iVar;
        this.$searchText = searchAutoComplete;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        View.OnClickListener onClickListener = this.this$0.f24101e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            return;
        }
        SearchView.SearchAutoComplete searchAutoComplete = this.$searchText;
        if (searchAutoComplete != null) {
            searchAutoComplete.setText("");
            this.this$0.mo36072d();
        }
        View.OnClickListener onClickListener2 = this.this$0.f24100d;
        if (onClickListener2 != null) {
            onClickListener2.onClick(view);
        }
    }
}
