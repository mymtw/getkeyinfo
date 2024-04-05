package com.etsy.android.p327ui.favorites.add;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.j */
public final class C9769j extends RecyclerView.C3084b0 {

    /* renamed from: f */
    public static final /* synthetic */ int f21606f = 0;

    /* renamed from: b */
    public final long f21607b;

    /* renamed from: c */
    public final C8672b f21608c;

    /* renamed from: d */
    public final C13265p f21609d;

    /* renamed from: e */
    public final C19857l<CheckableListingCollection, C19394m> f21610e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9769j(View view, long j, C8672b bVar, C13265p pVar, C19857l<? super CheckableListingCollection, C19394m> lVar) {
        super(view);
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(pVar, "session");
        this.f21607b = j;
        this.f21608c = bVar;
        this.f21609d = pVar;
        this.f21610e = lVar;
    }

    /* renamed from: e */
    public final void mo32774e(CheckableListingCollection checkableListingCollection) {
        if (checkableListingCollection.getIsChecked()) {
            ViewExtensions.m12869m((ImageView) this.itemView.findViewById(R.id.checkIcon));
        } else {
            ViewExtensions.m12863g((ImageView) this.itemView.findViewById(R.id.checkIcon));
        }
    }
}
