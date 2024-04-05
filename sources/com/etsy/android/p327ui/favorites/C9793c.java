package com.etsy.android.p327ui.favorites;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10531d;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.NewShippingDestinationSelectedHandler;
import com.etsy.android.p327ui.search.shopresults.C10949h;
import com.etsy.android.p327ui.search.shopresults.SearchShopsRepository;
import com.etsy.android.uikit.webview.C12024d;
import dagger.internal.C17555d;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.favorites.c */
public final class C9793c implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f21651a;

    /* renamed from: b */
    public final C19011a f21652b;

    public /* synthetic */ C9793c(C17555d dVar, int i) {
        this.f21651a = i;
        this.f21652b = dVar;
    }

    public final Object get() {
        switch (this.f21651a) {
            case 0:
                return new C9792b((C8618c) this.f21652b.get());
            case 1:
                return new C10531d((C8623e) this.f21652b.get());
            case 2:
                return new NewShippingDestinationSelectedHandler((C13573c) this.f21652b.get());
            case 3:
                return new SearchShopsRepository((C10949h) this.f21652b.get());
            default:
                return new C12024d((C8618c) this.f21652b.get());
        }
    }
}
