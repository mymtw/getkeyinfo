package com.etsy.android.vespa.viewholders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.DeeplinkTableRow;
import kotlin.jvm.internal.C19383o;
import p423pf.C13233d;

/* renamed from: com.etsy.android.vespa.viewholders.j */
public final class C12095j extends C12086e<DeeplinkTableRow> {

    /* renamed from: c */
    public final C8672b f26979c;

    /* renamed from: d */
    public final C13233d f26980d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12095j(ViewGroup viewGroup, C8703p pVar, C13233d dVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_deeplink_table_row, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        C19383o.m32797g(dVar, "clickHandler");
        this.f26979c = pVar;
        this.f26980d = dVar;
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sk_ic_navigateright, 0);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        DeeplinkTableRow deeplinkTableRow = (DeeplinkTableRow) obj;
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        if (deeplinkTableRow != null) {
            textView.setText(deeplinkTableRow.getText());
            View view2 = this.itemView;
            C19383o.m32796f(view2, "itemView");
            ViewExtensions.m12865i(view2, deeplinkTableRow, new DeeplinkTableRowViewHolder$bind$1$1(this, deeplinkTableRow));
        }
    }
}
