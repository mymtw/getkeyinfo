package com.jakewharton.rxbinding2.widget;

import android.widget.SearchView;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.jakewharton.rxbinding2.widget.h */
public abstract class C17020h {
    public static C17020h create(SearchView searchView, CharSequence charSequence, boolean z) {
        return new AutoValue_SearchViewQueryTextEvent(searchView, charSequence, z);
    }

    public abstract boolean isSubmitted();

    public abstract CharSequence queryText();

    public abstract SearchView view();
}
