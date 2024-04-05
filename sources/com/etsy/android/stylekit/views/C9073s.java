package com.etsy.android.stylekit.views;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.etsy.android.stylekit.views.s */
public final /* synthetic */ class C9073s implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ CollageTypeAhead f19956b;

    /* renamed from: c */
    public final /* synthetic */ AdapterView.OnItemClickListener f19957c;

    public /* synthetic */ C9073s(CollageTypeAhead collageTypeAhead, AdapterView.OnItemClickListener onItemClickListener) {
        this.f19956b = collageTypeAhead;
        this.f19957c = onItemClickListener;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CollageTypeAhead.m34903setOnItemClickListener$lambda3(this.f19956b, this.f19957c, adapterView, view, i, j);
    }
}
