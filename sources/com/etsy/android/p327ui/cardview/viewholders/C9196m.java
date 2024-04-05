package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.ExploreBanner;
import com.etsy.android.p327ui.cardview.clickhandlers.C9118c;
import kotlin.jvm.internal.C19383o;
import p356ge.C12790b;
import p363he.C12821d;

/* renamed from: com.etsy.android.ui.cardview.viewholders.m */
public final /* synthetic */ class C9196m implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C9199n f20295b;

    /* renamed from: c */
    public final /* synthetic */ ExploreBanner f20296c;

    public /* synthetic */ C9196m(C9199n nVar, ExploreBanner exploreBanner) {
        this.f20295b = nVar;
        this.f20296c = exploreBanner;
    }

    public final void onClick(View view) {
        C9199n nVar = this.f20295b;
        ExploreBanner exploreBanner = this.f20296c;
        C19383o.m32797g(nVar, "this$0");
        C19383o.m32797g(exploreBanner, "$exploreBanner");
        C9118c cVar = nVar.f20301c;
        cVar.getClass();
        C12790b.m20430b(cVar.mo45889a(), new C12821d(exploreBanner.getDeepLinkUrl()));
    }
}
