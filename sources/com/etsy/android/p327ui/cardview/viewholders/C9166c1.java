package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.SavedForLaterCarouselHeader;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cardview.viewholders.c1 */
public final class C9166c1 extends C12086e<SavedForLaterCarouselHeader> {

    /* renamed from: c */
    public final SavedCartClickHandler f20175c;

    /* renamed from: d */
    public final TextView f20176d;

    /* renamed from: e */
    public final TextView f20177e;

    /* renamed from: f */
    public final Button f20178f;

    public C9166c1(ViewGroup viewGroup, SavedCartClickHandler savedCartClickHandler) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_msco_saved_for_later_carousel_header, viewGroup, false));
        this.f20175c = savedCartClickHandler;
        View findViewById = this.itemView.findViewById(R.id.title);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.title)");
        this.f20176d = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.saved_count);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.saved_count)");
        this.f20177e = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.see_all_button);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.see_all_button)");
        this.f20178f = (Button) findViewById3;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        SavedForLaterCarouselHeader savedForLaterCarouselHeader = (SavedForLaterCarouselHeader) obj;
        if (savedForLaterCarouselHeader != null) {
            this.f20176d.setText(savedForLaterCarouselHeader.getTitle());
            this.f20177e.setText(String.valueOf(savedForLaterCarouselHeader.getBadgeCount()));
            ServerDrivenAction action = savedForLaterCarouselHeader.getAction(ServerDrivenAction.TYPE_SEE_ALL_SAVED_FOR_LATER);
            if (action != null) {
                this.f20178f.setText(action.getDisplayName());
                ViewExtensions.m12866j(this.f20178f, new SavedForLaterCarouselHeaderViewHolder$bind$1(this));
                return;
            }
            ViewExtensions.m12860d(this.f20178f);
        }
    }
}
