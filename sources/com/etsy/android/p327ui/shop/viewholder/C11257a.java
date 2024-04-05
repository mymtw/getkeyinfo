package com.etsy.android.p327ui.shop.viewholder;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.ui.shop.viewholder.a */
public final class C11257a extends C12086e<C11258a> {

    /* renamed from: c */
    public ImageView f24855c = ((ImageView) this.itemView.findViewById(R.id.image));

    /* renamed from: d */
    public TextView f24856d = ((TextView) this.itemView.findViewById(R.id.message));

    /* renamed from: com.etsy.android.ui.shop.viewholder.a$a */
    public static class C11258a {

        /* renamed from: a */
        public final int f24857a;

        /* renamed from: b */
        public final CharSequence f24858b;

        /* renamed from: c */
        public final int f24859c = 0;

        public C11258a(int i, String str) {
            this.f24857a = i;
            this.f24858b = str;
        }
    }

    public C11257a(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.empty_layout, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C11258a aVar = (C11258a) obj;
        this.itemView.setBackgroundColor(aVar.f24859c);
        this.f24855c.setImageResource(aVar.f24857a);
        this.f24856d.setText(aVar.f24858b);
    }
}
