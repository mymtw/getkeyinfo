package com.etsy.android.p327ui.cardview.viewholders;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.p327ui.cardview.clickhandlers.C9134o;
import com.etsy.android.p327ui.search.p330v2.relatedcategories.C11031a;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;

/* renamed from: com.etsy.android.ui.cardview.viewholders.q */
public final class C9208q extends C12086e<C9205p> {

    /* renamed from: c */
    public C11031a f20327c = new C11031a((C9134o) null);

    public C9208q(RecyclerView recyclerView) {
        super(recyclerView);
        this.itemView.setFocusableInTouchMode(true);
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(this.f20327c);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        List<IFormattedTaxonomyCategory> list;
        C9205p pVar = (C9205p) obj;
        if (!(pVar == null || (list = pVar.f20320b) == null)) {
            C11031a aVar = this.f20327c;
            aVar.getClass();
            aVar.f24458c = list;
            aVar.notifyDataSetChanged();
        }
        ViewExtensions.m12863g(this.itemView);
    }
}
