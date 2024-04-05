package com.etsy.android.uikit.viewholder;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.vespa.viewholders.C12086e;
import p415of.C13171a;

/* renamed from: com.etsy.android.uikit.viewholder.k */
public class C11997k extends C12086e<C11998a> {

    /* renamed from: c */
    public final Button f26731c = ((Button) mo38986f(R.id.button));

    /* renamed from: d */
    public final TextView f26732d;

    /* renamed from: e */
    public final C13171a f26733e;

    public C11997k(ViewGroup viewGroup, C13171a aVar) {
        super(C0326j.m859c(viewGroup, R.layout.collage_button_with_description, viewGroup, false));
        TextView textView = (TextView) mo38986f(16908308);
        textView.setVisibility(0);
        this.f26733e = aVar;
        this.f26732d = textView;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C11998a aVar = (C11998a) obj;
        if ((aVar.f26736c & 1) == 1) {
            this.f26731c.setText(aVar.f26734a);
            this.f26731c.setVisibility(0);
        } else {
            this.f26731c.setVisibility(8);
        }
        if ((aVar.f26736c & 2) == 2) {
            this.f26732d.setText(aVar.f26735b);
            this.f26732d.setVisibility(0);
        } else {
            this.f26732d.setVisibility(8);
        }
        this.f26731c.setOnClickListener(new C11996j(this, aVar));
    }

    /* renamed from: com.etsy.android.uikit.viewholder.k$a */
    public static class C11998a {

        /* renamed from: a */
        public String f26734a;

        /* renamed from: b */
        public String f26735b;

        /* renamed from: c */
        public int f26736c;

        /* renamed from: d */
        public Object f26737d;

        public C11998a(String str, String str2) {
            this.f26734a = str;
            this.f26735b = str2;
        }

        public C11998a(String str, String str2, ShopSection shopSection) {
            this.f26734a = str;
            this.f26735b = str2;
            this.f26737d = shopSection;
        }
    }
}
