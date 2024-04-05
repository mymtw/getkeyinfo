package com.etsy.android.uikit.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.PageLink;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.uikit.viewholder.o */
public final class C12003o extends C12086e<PageLink> {

    /* renamed from: c */
    public final C13171a<PageLink> f26746c;

    public C12003o(ViewGroup viewGroup, C13171a<PageLink> aVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_card_view_section_collage_link_footer, viewGroup, false));
        this.f26746c = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        PageLink pageLink = (PageLink) obj;
        C19383o.m32797g(pageLink, "pageLink");
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        ViewExtensions.m12866j(textView, new ListSectionCollageLinkFooterViewHolder$bind$1$1(this, pageLink));
        textView.setText(pageLink.getLinkTitle());
        textView.setContentDescription(textView.getResources().getString(R.string.item_button, new Object[]{pageLink.getLinkTitle()}));
    }
}
