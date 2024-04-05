package com.etsy.android.uikit.viewholder;

import com.etsy.android.uikit.viewholder.C12009u;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ListingCardImagesCoordinator$fetchAdditionalImages$2 extends Lambda implements C19857l<C12009u.C12010a, C19394m> {
    public final /* synthetic */ ListingCardImagesCoordinator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingCardImagesCoordinator$fetchAdditionalImages$2(ListingCardImagesCoordinator listingCardImagesCoordinator) {
        super(1);
        this.this$0 = listingCardImagesCoordinator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C12009u.C12010a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C12009u.C12010a aVar) {
        if (aVar instanceof C12009u.C12010a.C12012b) {
            C12009u.C12010a.C12012b bVar = (C12009u.C12010a.C12012b) aVar;
            this.this$0.f26571b.mo30643f(bVar.f26771a);
            this.this$0.f26572c.setHasFetchedAdditionalImages(true);
            this.this$0.f26572c.setListingImages(bVar.f26771a);
        }
    }
}
