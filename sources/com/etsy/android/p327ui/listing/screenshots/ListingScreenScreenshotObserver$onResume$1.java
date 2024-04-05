package com.etsy.android.p327ui.listing.screenshots;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.screenshots.ListingScreenScreenshotObserver$onResume$1 */
public final class ListingScreenScreenshotObserver$onResume$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ ListingScreenScreenshotObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingScreenScreenshotObserver$onResume$1(ListingScreenScreenshotObserver listingScreenScreenshotObserver) {
        super(1);
        this.this$0 = listingScreenScreenshotObserver;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        this.this$0.f22352d.mo38043a(new C13597g.C13665j3(th));
        this.this$0.f22353e.dispose();
    }
}
