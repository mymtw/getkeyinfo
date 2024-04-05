package com.etsy.android.vespa.viewholders;

import android.support.p013v4.media.C0072d;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import p415of.C13186o;

/* renamed from: com.etsy.android.vespa.viewholders.a0 */
public final class C12079a0 extends C12086e<C13186o> {

    /* renamed from: c */
    public final TextView f26947c = ((TextView) this.itemView.findViewById(R.id.text));

    public C12079a0(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_placeholder, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        TextView textView = this.f26947c;
        StringBuilder h = C0072d.m201h("Placeholder for view type: ");
        h.append(this.itemView.getResources().getResourceEntryName(((C13186o) obj).getViewType()));
        textView.setText(h.toString());
    }
}
