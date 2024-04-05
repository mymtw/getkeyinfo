package com.etsy.android.p327ui.search.shopresults;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.shopresults.d */
public final class C10938d extends C12086e<C10937c> {

    /* renamed from: c */
    public final TextView f24284c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10938d(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_card_shop_search_result_header, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View findViewById = this.itemView.findViewById(R.id.txt_search_results_shops_header);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.…rch_results_shops_header)");
        this.f24284c = (TextView) findViewById;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C10937c cVar = (C10937c) obj;
        if (cVar != null) {
            ViewExtensions.m12869m(this.itemView);
            this.f24284c.setText(cVar.f24283a);
            return;
        }
        ViewExtensions.m12860d(this.itemView);
    }
}
