package com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers;

import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.extensions.ListingFetchExtensionsKt;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.b */
public final class C10528b {

    /* renamed from: a */
    public final C13573c f23098a;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.reviews.handlers.b$a */
    public /* synthetic */ class C10529a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23099a;

        static {
            int[] iArr = new int[Reviews.ReviewType.values().length];
            iArr[Reviews.ReviewType.LISTING.ordinal()] = 1;
            iArr[Reviews.ReviewType.SHOP.ordinal()] = 2;
            f23099a = iArr;
        }
    }

    public C10528b(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23098a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo34115a(ListingViewState.C10092d dVar, C13597g.C13609b3 b3Var) {
        C19383o.m32797g(b3Var, "event");
        int i = C10529a.f23099a[b3Var.f30081a.ordinal()];
        this.f23098a.mo38043a(new C13597g.C13623d3(b3Var.f30082b, i != 1 ? i != 2 ? EmptyList.INSTANCE : ListingFetchExtensionsKt.convertShopReviewImagesToV2(dVar.f22239g) : ListingFetchExtensionsKt.convertListingReviewImagesToV2(dVar.f22239g)));
        return C13574d.C13575a.f29662a;
    }
}
