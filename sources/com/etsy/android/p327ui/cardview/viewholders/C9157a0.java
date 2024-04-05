package com.etsy.android.p327ui.cardview.viewholders;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopicFirstFeatured;
import com.etsy.android.p327ui.cardview.clickhandlers.C9145z;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p415of.C13184m;
import p415of.C13186o;
import p472wb.C13811h;

/* renamed from: com.etsy.android.ui.cardview.viewholders.a0 */
public final class C9157a0 extends C12086e<C13184m> {

    /* renamed from: c */
    public final RecyclerView f20142c;

    /* renamed from: d */
    public final C9145z f20143d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9157a0(RecyclerView recyclerView, C9145z zVar) {
        super(recyclerView);
        C19383o.m32797g(zVar, "clickHandler");
        this.f20142c = recyclerView;
        this.f20143d = zVar;
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2));
        recyclerView.addItemDecoration(new C13811h(this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_12)));
        int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        recyclerView.setPadding(dimensionPixelSize, recyclerView.getPaddingTop(), dimensionPixelSize, dimensionPixelSize);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13184m mVar = (C13184m) obj;
        if (mVar != null) {
            C13186o oVar = mVar.getItems().get(0);
            C19383o.m32795e(oVar, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.vespa.FormattedTopicFirstFeatured");
            ((FormattedTopicFirstFeatured) oVar).setFeatured(true);
            this.f20142c.setAdapter(new C9226y(mVar, this.f20143d));
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f20142c.setAdapter((RecyclerView.Adapter) null);
    }
}
