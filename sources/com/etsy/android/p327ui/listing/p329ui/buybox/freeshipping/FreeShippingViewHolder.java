package com.etsy.android.p327ui.listing.p329ui.buybox.freeshipping;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p013v4.media.C0069a;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.uikit.text.typeface.CustomTypefaceSpan;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.util.EtsyLinkify$createCustomSpannable$formattedSpan$1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p280x0.C8292f;
import p435rb.C13350a;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.freeshipping.FreeShippingViewHolder */
public final class FreeShippingViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22543b;

    /* renamed from: c */
    public final TextView f22544c;

    /* renamed from: d */
    public final TextView f22545d;

    /* renamed from: e */
    public final Typeface f22546e = C8292f.m16582a(this.itemView.getContext(), R.font.clg_typeface_bold);

    public FreeShippingViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_free_shipping, false));
        this.f22543b = cVar;
        View findViewById = this.itemView.findViewById(R.id.listing_free_shipping_title);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…ting_free_shipping_title)");
        this.f22544c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.listing_free_shipping_body);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…sting_free_shipping_body)");
        this.f22545d = (TextView) findViewById2;
    }

    /* renamed from: b */
    public final void mo33629b() {
        EtsyLinkify.m19614h(this.f22545d);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        C19394m mVar;
        if (jVar instanceof C10258a) {
            C10258a aVar = (C10258a) jVar;
            String str = aVar.f22547a;
            C19394m mVar2 = null;
            if (str != null) {
                ViewExtensions.m12869m(this.f22544c);
                this.f22544c.setText(str);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(this.f22544c);
            }
            Spanned spanned = aVar.f22548b;
            if (spanned != null) {
                Context context = this.itemView.getContext();
                C19383o.m32796f(context, "itemView.context");
                int d = C13350a.m21013d(context, R.attr.clg_color_text_link);
                Typeface typeface = this.f22546e;
                FreeShippingViewHolder$bind$1$3$spannableBody$1 freeShippingViewHolder$bind$1$3$spannableBody$1 = new FreeShippingViewHolder$bind$1$3$spannableBody$1(this);
                Spanned i = EtsyLinkify.m19615i(d, spanned, false);
                SpannableString spannableString = new SpannableString(i);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                C19383o.m32796f(uRLSpanArr, "spans");
                for (URLSpan uRLSpan : uRLSpanArr) {
                    int spanStart = i.getSpanStart(uRLSpan);
                    int spanEnd = i.getSpanEnd(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    EtsyLinkify$createCustomSpannable$formattedSpan$1 etsyLinkify$createCustomSpannable$formattedSpan$1 = new EtsyLinkify$createCustomSpannable$formattedSpan$1(d, freeShippingViewHolder$bind$1$3$spannableBody$1, uRLSpan, uRLSpan.getURL());
                    spannableString.setSpan(new CustomTypefaceSpan(typeface), spanStart, spanEnd, 0);
                    spannableString.setSpan(etsyLinkify$createCustomSpannable$formattedSpan$1, spanStart, spanEnd, 0);
                }
                ViewExtensions.m12869m(this.f22545d);
                this.f22545d.setMovementMethod(LinkMovementMethod.getInstance());
                this.f22545d.setText(spannableString);
                mVar2 = C19394m.f43287a;
            }
            if (mVar2 == null) {
                ViewExtensions.m12860d(this.f22545d);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
