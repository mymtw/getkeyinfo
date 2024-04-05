package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.PageLink;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cardview.viewholders.s0 */
public final class C9214s0 extends C12086e<LandingPageLink> {

    /* renamed from: c */
    public final C13171a<PageLink> f20346c;

    public C9214s0(ViewGroup viewGroup, C13171a<PageLink> aVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.textview_theme_tag, viewGroup, false));
        this.f20346c = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        LandingPageLink landingPageLink = (LandingPageLink) obj;
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.themeTag)).setText(landingPageLink != null ? landingPageLink.getLinkTitle() : null);
        TextView textView = (TextView) view.findViewById(R.id.themeTag);
        C19383o.m32796f(textView, "themeTag");
        ViewExtensions.m12866j(textView, new RelatedLinkViewHolder$bind$1$1(landingPageLink, this));
    }
}
