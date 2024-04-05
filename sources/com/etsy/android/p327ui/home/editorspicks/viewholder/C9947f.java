package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.text.Layout;
import android.widget.TextView;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.f */
public final class C9947f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C9948g f21923b;

    /* renamed from: c */
    public final /* synthetic */ C9950i f21924c;

    public C9947f(TextView textView, C9948g gVar, C9950i iVar) {
        this.f21923b = gVar;
        this.f21924c = iVar;
    }

    public final void run() {
        Layout layout = this.f21923b.f21929g.getLayout();
        if (layout != null) {
            C9950i iVar = this.f21924c;
            boolean z = true;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
                z = false;
            }
            iVar.f21941e = Boolean.valueOf(z);
            this.f21923b.mo33133g(this.f21924c.f21941e);
        }
    }
}
