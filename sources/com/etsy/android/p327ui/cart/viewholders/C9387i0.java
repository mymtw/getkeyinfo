package com.etsy.android.p327ui.cart.viewholders;

import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.IHtmlText;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.cart.viewholders.i0 */
public final class C9387i0 extends C12086e<IHtmlText> {

    /* renamed from: c */
    public final C19846a<C19394m> f20788c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9387i0(ViewGroup viewGroup, C19846a<C19394m> aVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_fancy_html_text, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        this.f20788c = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        IHtmlText iHtmlText = (IHtmlText) obj;
        C19383o.m32797g(iHtmlText, "htmlText");
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.html_text)).setText(C18263b.m30867s0(iHtmlText.getText()));
        URLSpan[] urls = ((TextView) view.findViewById(R.id.html_text)).getUrls();
        C19383o.m32796f(urls, "html_text.urls");
        if (!(urls.length == 0)) {
            ((TextView) view.findViewById(R.id.html_text)).setLinkTextColor(((TextView) view.findViewById(R.id.html_text)).getTextColors().getDefaultColor());
            URLSpan[] urls2 = ((TextView) view.findViewById(R.id.html_text)).getUrls();
            C19383o.m32796f(urls2, "html_text.urls");
            for (URLSpan sdlModalHtmlTextViewHolder$bind$1$1 : urls2) {
                TextView textView = (TextView) view.findViewById(R.id.html_text);
                C19383o.m32796f(textView, "html_text");
                EtsyLinkify.m19608b(textView, true, false, new SdlModalHtmlTextViewHolder$bind$1$1(view, sdlModalHtmlTextViewHolder$bind$1$1, this));
            }
        }
    }
}
