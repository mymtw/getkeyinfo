package com.etsy.android.p327ui.favorites.search;

import android.view.View;
import com.etsy.android.p327ui.favorites.CreateACollectionClickHandler;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.search.SearchView$setOnCreateCollectionButtonClickedListener$1 */
public final class SearchView$setOnCreateCollectionButtonClickedListener$1 extends Lambda implements C19857l<View, C19394m> {
    public static final SearchView$setOnCreateCollectionButtonClickedListener$1 INSTANCE = new SearchView$setOnCreateCollectionButtonClickedListener$1();

    public SearchView$setOnCreateCollectionButtonClickedListener$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        new CreateACollectionClickHandler().onClick(view);
    }
}
