package com.paypal.pyplcheckout.utils;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: com.paypal.pyplcheckout.utils.c */
public final /* synthetic */ class C17283c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ DialogMaker f37809b;

    /* renamed from: c */
    public final /* synthetic */ TextView f37810c;

    /* renamed from: d */
    public final /* synthetic */ ProgressBar f37811d;

    public /* synthetic */ C17283c(DialogMaker dialogMaker, TextView textView, ProgressBar progressBar) {
        this.f37809b = dialogMaker;
        this.f37810c = textView;
        this.f37811d = progressBar;
    }

    public final void onClick(View view) {
        this.f37809b.lambda$onCreateView$1(this.f37810c, this.f37811d, view);
    }
}
