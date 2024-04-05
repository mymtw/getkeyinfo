package com.etsy.android.p327ui.shop.viewholder;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p460ue.C13499i;

/* renamed from: com.etsy.android.ui.shop.viewholder.c0 */
public final class C11267c0 extends C12086e<C13499i> {

    /* renamed from: c */
    public final TextView f24873c = ((TextView) this.itemView.findViewById(R.id.link_text));

    /* renamed from: d */
    public final C13171a f24874d;

    public C11267c0(ViewGroup viewGroup, C13171a aVar) {
        super(C0326j.m859c(viewGroup, R.layout.link_text, viewGroup, false));
        this.f24874d = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13499i iVar = (C13499i) obj;
        this.f24873c.setText(Html.fromHtml(this.itemView.getResources().getString(R.string.terms_and_conditions_read_more, new Object[]{iVar.f29536b})));
        if (this.f24874d == null) {
            URLSpan[] urls = this.f24873c.getUrls();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24873c.getText());
            for (URLSpan removeSpan : urls) {
                spannableStringBuilder.removeSpan(removeSpan);
            }
            this.f24873c.setText(spannableStringBuilder);
            return;
        }
        TextView textView = this.f24873c;
        C11265b0 b0Var = new C11265b0(this, iVar);
        C19383o.m32797g(textView, "textView");
        EtsyLinkify.m19608b(textView, false, true, b0Var);
    }
}
