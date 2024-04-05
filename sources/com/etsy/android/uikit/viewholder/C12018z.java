package com.etsy.android.uikit.viewholder;

import android.view.View;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.uikit.viewholder.z */
public final class C12018z extends C12086e<C12019a> {

    /* renamed from: c */
    public final TextView f26787c;

    /* renamed from: d */
    public final TextView f26788d;

    /* renamed from: com.etsy.android.uikit.viewholder.z$a */
    public static class C12019a {

        /* renamed from: a */
        public final CharSequence f26789a;

        /* renamed from: b */
        public final CharSequence f26790b;

        public C12019a(String str, String str2) {
            this.f26789a = str;
            this.f26790b = str2;
        }
    }

    public C12018z(View view) {
        super(view);
        this.f26787c = (TextView) view.findViewById(R.id.title);
        this.f26788d = (TextView) view.findViewById(R.id.subtitle);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C12019a aVar = (C12019a) obj;
        this.f26787c.setText(aVar.f26789a);
        this.f26788d.setText(aVar.f26790b);
    }
}
