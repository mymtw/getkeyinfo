package com.etsy.android.p327ui.favorites.search;

import android.text.Editable;
import android.text.TextWatcher;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.favorites.search.SearchView$bindSearch$lambda-6$lambda-5$$inlined$addTextChangedListener$default$1 */
public final class C9884x6477de38 implements TextWatcher {
    public final /* synthetic */ SearchView this$0;

    public C9884x6477de38(SearchView searchView) {
        this.this$0 = searchView;
    }

    public void afterTextChanged(Editable editable) {
        this.this$0.getSearchInputLayout().setEndIconVisible(C18263b.m30839d0(editable));
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
