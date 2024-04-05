package com.etsy.android.p327ui.shop.viewholder;

import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: com.etsy.android.ui.shop.viewholder.d */
public final class C11268d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ CharSequence f24875b;

    /* renamed from: c */
    public final /* synthetic */ TextView f24876c;

    /* renamed from: d */
    public final /* synthetic */ TextView f24877d;

    /* renamed from: e */
    public final /* synthetic */ C11274g f24878e;

    public C11268d(C11274g gVar, Spanned spanned, TextView textView, TextView textView2) {
        this.f24878e = gVar;
        this.f24875b = spanned;
        this.f24876c = textView;
        this.f24877d = textView2;
    }

    public final void run() {
        CharSequence charSequence = this.f24875b;
        TextView textView = this.f24876c;
        int lineCount = new StaticLayout(charSequence, textView.getPaint(), textView.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
        this.f24878e.f24890e.put(this.f24875b, Integer.valueOf(lineCount));
        this.f24877d.setVisibility(lineCount > 3 ? 0 : 4);
    }
}
