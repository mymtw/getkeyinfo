package com.etsy.android.p327ui.home.editorspicks.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.finds.FindsTwoTitledListingsModule;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p442sc.C13372b;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.home.editorspicks.viewholder.h */
public final class C9949h extends C12086e<FindsTwoTitledListingsModule.Footer> {

    /* renamed from: c */
    public final C13372b f21936c;

    /* renamed from: d */
    public final TextView f21937d;

    public C9949h(ViewGroup viewGroup, C13372b bVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_card_view_section_footer, viewGroup, false));
        this.f21936c = bVar;
        View findViewById = this.itemView.findViewById(R.id.txt_link_title);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.txt_link_title)");
        this.f21937d = (TextView) findViewById;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        FindsTwoTitledListingsModule.Footer footer = (FindsTwoTitledListingsModule.Footer) obj;
        C19383o.m32797g(footer, "data");
        if (footer.canDisplay()) {
            ViewExtensions.m12869m(this.itemView);
            this.f21937d.setText(footer.getBottomText());
            View view = this.itemView;
            C19383o.m32796f(view, "rootView");
            ViewExtensions.m12866j(view, new EditorsPicksTwoTitledListingFooterViewHolder$bind$1(this, footer));
            return;
        }
        ViewExtensions.m12860d(this.itemView);
        this.f21937d.setText((CharSequence) null);
        this.itemView.setOnClickListener((View.OnClickListener) null);
    }
}
