package com.etsy.android.p327ui.cardview.clickhandlers;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.ExploreBanner;
import kotlin.jvm.internal.C19383o;
import p356ge.C12790b;
import p363he.C12821d;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.c */
public final class C9118c extends C13171a<ExploreBanner> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9118c(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "analyticsTracker");
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        ExploreBanner exploreBanner = (ExploreBanner) obj;
        C19383o.m32797g(exploreBanner, "data");
        C12790b.m20430b(mo45889a(), new C12821d(exploreBanner.getDeepLinkUrl()));
    }
}
