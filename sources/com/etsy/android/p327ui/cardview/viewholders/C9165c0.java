package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.vespa.IVespaListSectionHeader;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.c0 */
public final class C9165c0 extends C12086e<IVespaListSectionHeader> {

    /* renamed from: c */
    public final TextView f20173c;

    /* renamed from: d */
    public final TextView f20174d;

    public C9165c0(ViewGroup viewGroup) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_card_view_header, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.title);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.title)");
        this.f20173c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.subtitle);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.subtitle)");
        this.f20174d = (TextView) findViewById2;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        IVespaListSectionHeader iVespaListSectionHeader = (IVespaListSectionHeader) obj;
        C19383o.m32797g(iVespaListSectionHeader, "data");
        if (C18263b.m30837c0(iVespaListSectionHeader.getTitle())) {
            this.f20173c.setText(iVespaListSectionHeader.getTitle());
            ViewExtensions.m12869m(this.f20173c);
        } else {
            ViewExtensions.m12860d(this.f20173c);
        }
        if (C18263b.m30837c0(iVespaListSectionHeader.getSubtitle())) {
            this.f20174d.setText(iVespaListSectionHeader.getSubtitle());
            ViewExtensions.m12869m(this.f20174d);
            return;
        }
        ViewExtensions.m12860d(this.f20174d);
    }
}
