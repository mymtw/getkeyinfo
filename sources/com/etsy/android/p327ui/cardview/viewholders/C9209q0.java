package com.etsy.android.p327ui.cardview.viewholders;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.vespa.viewholders.C12086e;
import p357gf.C12796e;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13182k;
import p415of.C13184m;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.q0 */
public final class C9209q0 extends C12086e<C13184m> {

    /* renamed from: c */
    public C13173c f20328c;

    public C9209q0(Fragment fragment, ViewGroup viewGroup, C8703p pVar, C13172b bVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_nested_list_section, viewGroup, false));
        C13173c cVar = new C13173c(fragment, pVar, (C13182k) null, (C13895a) null, (C8923u) null, (C12796e) null);
        this.f20328c = cVar;
        cVar.f28993e = true;
        cVar.f28991c.mo45890a(bVar);
        RecyclerView recyclerView = (RecyclerView) mo38986f(R.id.items);
        fragment.requireActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f20328c.f28991c.f28990i);
        gridLayoutManager.f7008K = this.f20328c.f28996h;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setRecycledViewPool(bVar.f28988g);
        recyclerView.setAdapter(this.f20328c);
        recyclerView.setNestedScrollingEnabled(false);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        this.f20328c.clear();
        this.f20328c.mo45895j((C13184m) obj);
    }
}
