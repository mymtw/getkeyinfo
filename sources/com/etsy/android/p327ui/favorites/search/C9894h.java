package com.etsy.android.p327ui.favorites.search;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.etsy.android.ui.favorites.search.h */
public final /* synthetic */ class C9894h implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ SearchView f21827b;

    /* renamed from: c */
    public final /* synthetic */ C9891e f21828c;

    public /* synthetic */ C9894h(SearchView searchView, C9891e eVar) {
        this.f21827b = searchView;
        this.f21828c = eVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return SearchView.m34981bindSearch$lambda6$lambda5$lambda4(this.f21827b, this.f21828c, textView, i, keyEvent);
    }
}
