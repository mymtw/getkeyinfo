package com.etsy.android.vespa.viewholders;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;

/* renamed from: com.etsy.android.vespa.viewholders.u */
public final class C12109u extends C12086e<BasicSectionHeader> {

    /* renamed from: c */
    public TextView f27007c = ((TextView) mo38986f(R.id.txt_module_title));

    /* renamed from: d */
    public TextView f27008d = ((TextView) mo38986f(R.id.txt_module_subtitle));

    public C12109u(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_section_header, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        BasicSectionHeader basicSectionHeader = (BasicSectionHeader) obj;
        if (TextUtils.isEmpty(basicSectionHeader.getTitle())) {
            this.f27007c.setVisibility(8);
        } else {
            this.f27007c.setText(basicSectionHeader.getTitle());
            this.f27007c.setVisibility(0);
            TextView textView = this.f27007c;
            textView.setContentDescription(textView.getResources().getString(R.string.item_heading, new Object[]{basicSectionHeader.getTitle()}));
        }
        if (TextUtils.isEmpty(basicSectionHeader.getSubtitle())) {
            this.f27008d.setVisibility(8);
            return;
        }
        this.f27008d.setVisibility(0);
        this.f27008d.setText(basicSectionHeader.getSubtitle());
        TextView textView2 = this.f27008d;
        textView2.setContentDescription(textView2.getResources().getString(R.string.item_heading, new Object[]{basicSectionHeader.getSubtitle()}));
    }
}
