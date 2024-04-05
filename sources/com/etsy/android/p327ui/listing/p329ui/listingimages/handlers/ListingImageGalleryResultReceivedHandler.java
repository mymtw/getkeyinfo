package com.etsy.android.p327ui.listing.p329ui.listingimages.handlers;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p437rd.C13354a;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.listingimages.handlers.ListingImageGalleryResultReceivedHandler */
public final class ListingImageGalleryResultReceivedHandler {
    /* renamed from: a */
    public static C13574d m18429a(ListingViewState.C10092d dVar, C13597g.C13726s1 s1Var) {
        C19383o.m32797g(s1Var, "event");
        C13354a aVar = dVar.f22238f.f22801d;
        if (aVar == null) {
            return C13574d.C13575a.f29662a;
        }
        int i = s1Var.f30245a;
        return C0761x.m1709a1(dVar, new ListingImageGalleryResultReceivedHandler$handle$1$1((i < 0 || i >= aVar.f29277a.size()) ? aVar.f29279c : s1Var.f30245a, s1Var));
    }
}
