package com.etsy.android.p327ui.listing.p329ui.listingimages.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10419g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p437rd.C13354a;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.listingimages.handlers.ListingImageGalleryResultReceivedHandler$handle$1$1 */
public final class ListingImageGalleryResultReceivedHandler$handle$1$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13726s1 $event;
    public final /* synthetic */ int $newSelectedImageIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingImageGalleryResultReceivedHandler$handle$1$1(int i, C13597g.C13726s1 s1Var) {
        super(1);
        this.$newSelectedImageIndex = i;
        this.$event = s1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        C13354a aVar = gVar.f22863d;
        gVar.f22863d = aVar != null ? C13354a.m21024b(aVar, this.$newSelectedImageIndex, this.$event.f30246b, 115) : null;
    }
}
