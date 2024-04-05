package com.etsy.android.uikit.viewholder;

import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ListingCardImagesCoordinator$fetchAdditionalImages$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public static final ListingCardImagesCoordinator$fetchAdditionalImages$1 INSTANCE = new ListingCardImagesCoordinator$fetchAdditionalImages$1();

    public ListingCardImagesCoordinator$fetchAdditionalImages$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        LogCatKt.m17045a().mo21309d("Failed to load more images for listing card", th);
    }
}
