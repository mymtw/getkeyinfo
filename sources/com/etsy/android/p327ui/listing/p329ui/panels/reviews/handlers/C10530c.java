package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingVideoReviewBottomSheetNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingVideoReviewNavigationKey;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.c */
public final class C10530c {

    /* renamed from: a */
    public final C13573c f23100a;

    /* renamed from: b */
    public final C8623e f23101b;

    public C10530c(C13573c cVar, C8623e eVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(eVar, "configMap");
        this.f23100a = cVar;
        this.f23101b = eVar;
    }

    /* renamed from: a */
    public final C13574d mo34116a(ListingViewState.C10092d dVar, C13597g.C13616c3 c3Var) {
        C19383o.m32797g(c3Var, "event");
        if (!C19543e0.m33306Y(c3Var.f30090b) || c3Var.f30089a >= c3Var.f30090b.size()) {
            return C13574d.C13575a.f29662a;
        }
        this.f23100a.mo38043a(new C13597g.C13633f("listing_screen_video_reviews_thumbnail_tapped"));
        ListingVideoReviewNavigationKey.C10704a aVar = ListingVideoReviewNavigationKey.Companion;
        boolean b = this.f23101b.mo21132b(C8592b.f18847y1);
        String b2 = dVar.mo33467b();
        List<ReviewUiModel> list = c3Var.f30090b;
        int i = c3Var.f30089a;
        aVar.getClass();
        C19383o.m32797g(b2, "referrer");
        C19383o.m32797g(list, ResponseConstants.REVIEWS);
        return new C13574d.C13576b.C13585i(b ? new ListingVideoReviewBottomSheetNavigationKey(b2, list, i) : new ListingVideoReviewNavigationKey(b2, list, i));
    }
}
