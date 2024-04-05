package com.jakewharton.rxbinding2.widget;

import android.support.p013v4.media.C0072d;
import android.widget.SearchView;

final class AutoValue_SearchViewQueryTextEvent extends C17020h {
    private final boolean isSubmitted;
    private final CharSequence queryText;
    private final SearchView view;

    public AutoValue_SearchViewQueryTextEvent(SearchView searchView, CharSequence charSequence, boolean z) {
        if (searchView != null) {
            this.view = searchView;
            if (charSequence != null) {
                this.queryText = charSequence;
                this.isSubmitted = z;
                return;
            }
            throw new NullPointerException("Null queryText");
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17020h)) {
            return false;
        }
        C17020h hVar = (C17020h) obj;
        return this.view.equals(hVar.view()) && this.queryText.equals(hVar.queryText()) && this.isSubmitted == hVar.isSubmitted();
    }

    public int hashCode() {
        return ((((this.view.hashCode() ^ 1000003) * 1000003) ^ this.queryText.hashCode()) * 1000003) ^ (this.isSubmitted ? 1231 : 1237);
    }

    public boolean isSubmitted() {
        return this.isSubmitted;
    }

    public CharSequence queryText() {
        return this.queryText;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchViewQueryTextEvent{view=");
        h.append(this.view);
        h.append(", queryText=");
        h.append(this.queryText);
        h.append(", isSubmitted=");
        h.append(this.isSubmitted);
        h.append("}");
        return h.toString();
    }

    public SearchView view() {
        return this.view;
    }
}
