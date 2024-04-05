package com.etsy.android.stylekit.views;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.etsy.android.stylekit.views.n */
public final /* synthetic */ class C9063n implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ CollageSelectAdapter f19944b;

    /* renamed from: c */
    public final /* synthetic */ CollageSelectDropdown f19945c;

    public /* synthetic */ C9063n(CollageSelectAdapter collageSelectAdapter, CollageSelectDropdown collageSelectDropdown) {
        this.f19944b = collageSelectAdapter;
        this.f19945c = collageSelectDropdown;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CollageSelectDropdown.m34895setCollageAdapter$lambda2(this.f19944b, this.f19945c, adapterView, view, i, j);
    }
}
