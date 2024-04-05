package com.etsy.android.p327ui.listing.util;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.C19383o;
import p466vc.C13558a;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.util.ListingGlobalLayoutListener */
public final class ListingGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int $stable = 0;
    private final C13573c listingEventDispatcher;

    public ListingGlobalLayoutListener(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.listingEventDispatcher = cVar;
    }

    public void onGlobalLayout() {
        this.listingEventDispatcher.mo38043a(C13558a.C13569k.f29659a);
    }
}
