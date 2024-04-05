package com.etsy.android.p327ui.favorites.search;

import com.etsy.android.R;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.search.SearchView$searchEditText$2 */
public final class SearchView$searchEditText$2 extends Lambda implements C19846a<TextInputEditText> {
    public final /* synthetic */ SearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView$searchEditText$2(SearchView searchView) {
        super(0);
        this.this$0 = searchView;
    }

    public final TextInputEditText invoke() {
        return (TextInputEditText) this.this$0.findViewById(R.id.list_item_search_in_favorites_search_text_input_edit_text);
    }
}
