package com.etsy.android.stylekit.views;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.etsy.android.stylekit.views.t */
public final /* synthetic */ class C9074t implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ CollageTypeAheadAdapter f19958b;

    /* renamed from: c */
    public final /* synthetic */ CollageTypeAhead f19959c;

    public /* synthetic */ C9074t(CollageTypeAheadAdapter collageTypeAheadAdapter, CollageTypeAhead collageTypeAhead) {
        this.f19958b = collageTypeAheadAdapter;
        this.f19959c = collageTypeAhead;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CollageTypeAhead.m34902setCollageTypeAheadAdapter$lambda2(this.f19958b, this.f19959c, adapterView, view, i, j);
    }
}
