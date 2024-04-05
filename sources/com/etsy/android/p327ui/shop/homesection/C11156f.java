package com.etsy.android.p327ui.shop.homesection;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.FAQ;
import com.etsy.android.p327ui.shop.C11143e1;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.ui.shop.homesection.f */
public final class C11156f extends C12086e<FAQ> {

    /* renamed from: c */
    public final C11143e1 f24664c;

    /* renamed from: d */
    public final CollageHeadingTextView f24665d = ((CollageHeadingTextView) this.itemView.findViewById(R.id.faq_question));

    /* renamed from: e */
    public final TextView f24666e = ((TextView) this.itemView.findViewById(R.id.faq_answer));

    public C11156f(ViewGroup viewGroup, C11192q0 q0Var) {
        super(C0326j.m859c(viewGroup, R.layout.shop_home_faq_content, viewGroup, false));
        this.f24664c = q0Var;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        FAQ faq = (FAQ) obj;
        this.f24665d.setText(((C11192q0) this.f24664c).mo36861a(faq.getQuestion(), faq.getQuestionTranslated()));
        this.f24666e.setText(((C11192q0) this.f24664c).mo36861a(faq.getAnswer(), faq.getAnswerTranslated()));
    }
}
