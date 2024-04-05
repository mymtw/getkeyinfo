package com.etsy.android.vespa.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.vespa.viewholders.h */
public final class C12092h extends C12086e<IPageLink> {

    /* renamed from: c */
    public final C13171a<IPageLink> f26971c;

    /* renamed from: d */
    public final boolean f26972d;

    /* renamed from: e */
    public final Button f26973e;

    public C12092h(ViewGroup viewGroup, C13171a<IPageLink> aVar, boolean z) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_card_group_footer, viewGroup, false));
        this.f26971c = aVar;
        this.f26972d = z;
        View f = mo38986f(R.id.txt_link_title);
        C19383o.m32795e(f, "null cannot be cast to non-null type android.widget.Button");
        this.f26973e = (Button) f;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        IPageLink iPageLink = (IPageLink) obj;
        if (iPageLink != null) {
            this.f26973e.setText(iPageLink.getLinkTitle());
            Button button = this.f26973e;
            button.setContentDescription(iPageLink.getLinkTitle() + ' ' + iPageLink.getPageTitle());
            View view = this.itemView;
            C19383o.m32796f(view, "itemView");
            ViewExtensions.m12866j(view, new CardGroupFooterViewHolder$bind$1$1(this, iPageLink));
        }
        if (this.f26972d) {
            ViewExtensions.m12860d(this.itemView);
        } else {
            ViewExtensions.m12869m(this.itemView);
        }
    }
}
