package com.etsy.android.p327ui.listing.p329ui.buybox.termsandconditions;

import android.support.p013v4.media.C0069a;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.SpanExtensions$trackingClick$1;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.uikit.util.EtsyLinkify;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.termsandconditions.TermsAndConditionsViewHolder */
public final class TermsAndConditionsViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22648b;

    /* renamed from: c */
    public final TextView f22649c;

    public TermsAndConditionsViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_terms_and_conditions, false));
        this.f22648b = cVar;
        View findViewById = this.itemView.findViewById(R.id.terms_text);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.terms_text)");
        this.f22649c = (TextView) findViewById;
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10307a) {
            this.f22649c.setText(((C10307a) jVar).f22650a);
            this.f22649c.setMovementMethod(LinkMovementMethod.getInstance());
            URLSpan[] urls = this.f22649c.getUrls();
            C19383o.m32796f(urls, "termsText.urls");
            ArrayList arrayList = new ArrayList();
            for (URLSpan uRLSpan : urls) {
                if (uRLSpan instanceof EtsyLinkify.UnderlineURLSpan) {
                    arrayList.add(uRLSpan);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                EtsyLinkify.UnderlineURLSpan underlineURLSpan = (EtsyLinkify.UnderlineURLSpan) it.next();
                TermsAndConditionsViewHolder$bind$1 termsAndConditionsViewHolder$bind$1 = new TermsAndConditionsViewHolder$bind$1(this, underlineURLSpan);
                C19383o.m32797g(underlineURLSpan, "<this>");
                underlineURLSpan.setOnClickListener(new SpanExtensions$trackingClick$1(termsAndConditionsViewHolder$bind$1));
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
