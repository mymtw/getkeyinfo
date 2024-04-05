package com.etsy.android.vespa.viewholders;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.vespa.viewholders.t */
public final class C12108t extends C12086e<BasicSectionHeader> {
    public C12108t(ViewGroup viewGroup) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_card_view_section_header_deeplink, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        BasicSectionHeader basicSectionHeader = (BasicSectionHeader) obj;
        C19383o.m32797g(basicSectionHeader, ResponseConstants.HEADER);
        TextView textView = (TextView) this.itemView.findViewById(R.id.txt_module_title);
        C19383o.m32796f(textView, "itemView.txt_module_title");
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.txt_module_subtitle);
        C19383o.m32796f(textView2, "itemView.txt_module_subtitle");
        String title = basicSectionHeader.getTitle();
        String str = "";
        if (title == null) {
            title = str;
        }
        if (TextUtils.isEmpty(title)) {
            textView.setVisibility(8);
        } else {
            String title2 = basicSectionHeader.getTitle();
            if (title2 == null) {
                title2 = str;
            }
            textView.setText(title2);
            textView.setVisibility(0);
        }
        String subtitle = basicSectionHeader.getSubtitle();
        if (subtitle == null) {
            subtitle = str;
        }
        if (TextUtils.isEmpty(subtitle)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            String subtitle2 = basicSectionHeader.getSubtitle();
            if (subtitle2 != null) {
                str = subtitle2;
            }
            textView2.setText(str);
        }
        this.itemView.setBackgroundColor(basicSectionHeader.getBackgroundColorTop());
    }
}
