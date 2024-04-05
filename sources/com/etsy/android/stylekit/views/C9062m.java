package com.etsy.android.stylekit.views;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.etsy.android.stylekit.views.m */
public final /* synthetic */ class C9062m implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ CollageSelectDropdown f19942b;

    /* renamed from: c */
    public final /* synthetic */ AdapterView.OnItemClickListener f19943c;

    public /* synthetic */ C9062m(CollageSelectDropdown collageSelectDropdown, AdapterView.OnItemClickListener onItemClickListener) {
        this.f19942b = collageSelectDropdown;
        this.f19943c = onItemClickListener;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CollageSelectDropdown.m34896setOnItemClickListener$lambda3(this.f19942b, this.f19943c, adapterView, view, i, j);
    }
}
