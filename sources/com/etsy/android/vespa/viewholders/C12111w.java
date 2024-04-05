package com.etsy.android.vespa.viewholders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import p415of.C13171a;

/* renamed from: com.etsy.android.vespa.viewholders.w */
public final class C12111w extends C12086e<IPageLink> {

    /* renamed from: c */
    public TextView f27011c;

    /* renamed from: d */
    public C13171a f27012d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12111w(ViewGroup viewGroup, C13171a aVar, boolean z) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(z ? R.layout.list_item_card_view_horiz_scroll_footer : R.layout.list_item_card_view_section_footer, viewGroup, false));
        if (z) {
            this.itemView.getLayoutParams().width = this.itemView.getResources().getDimensionPixelSize(R.dimen.horizontal_listing_card_section_item_width);
        }
        this.f27011c = (TextView) mo38986f(R.id.txt_link_title);
        this.f27012d = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        IPageLink iPageLink = (IPageLink) obj;
        this.f27011c.setText(iPageLink.getLinkTitle());
        TextView textView = this.f27011c;
        textView.setContentDescription(textView.getResources().getString(R.string.item_button, new Object[]{iPageLink.getLinkTitle()}));
        this.itemView.setOnClickListener(new C12110v(this, iPageLink));
    }
}
