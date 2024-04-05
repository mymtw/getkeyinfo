package com.etsy.android.vespa.viewholders;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import p415of.C13171a;
import p415of.C13186o;

/* renamed from: com.etsy.android.vespa.viewholders.e0 */
public final class C12087e0 extends C12086e<C13186o> {

    /* renamed from: c */
    public final C13171a f26963c;

    public C12087e0(ViewGroup viewGroup, C13171a aVar) {
        super(C0326j.m859c(viewGroup, R.layout.clg_select_item, viewGroup, false));
        this.f26963c = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13186o oVar = (C13186o) obj;
        ((TextView) this.itemView.findViewById(R.id.clg_select_dropdown_item_text)).setText(oVar.toString());
        if (this.f26963c != null) {
            this.itemView.setOnClickListener(new C12085d0(this, oVar));
        }
    }
}
