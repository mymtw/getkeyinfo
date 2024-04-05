package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.requests.apiv3.SearchSuggestionsEndpoint;
import com.etsy.android.p327ui.home.editorspicks.C9940h;
import com.etsy.android.p327ui.home.editorspicks.EditorPicksRepository;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10237g;
import com.etsy.android.p327ui.search.SearchSuggestionsRepository;
import com.etsy.android.p327ui.search.redirect.C10926b;
import com.etsy.android.p327ui.search.redirect.SearchRedirectRepository;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p466vc.C13573c;
import p490yd.C13914b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.favorites.add.z */
public final class C9791z implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f21647a;

    /* renamed from: b */
    public final C19011a f21648b;

    /* renamed from: c */
    public final C19011a f21649c;

    public /* synthetic */ C9791z(C19011a aVar, C19011a aVar2, int i) {
        this.f21647a = i;
        this.f21648b = aVar;
        this.f21649c = aVar2;
    }

    public final Object get() {
        switch (this.f21647a) {
            case 0:
                return new C9790y((C17414y) this.f21648b.get(), (C9770k) this.f21649c.get());
            case 1:
                return new C9940h((EditorPicksRepository) this.f21648b.get(), (C12703a) this.f21649c.get());
            case 2:
                return new C10237g((C13573c) this.f21649c.get(), (C13914b) this.f21648b.get());
            case 3:
                return new SearchSuggestionsRepository((SearchSuggestionsEndpoint) this.f21648b.get(), (C8694h) this.f21649c.get());
            default:
                return new SearchRedirectRepository((C10926b) this.f21648b.get(), (C17414y) this.f21649c.get());
        }
    }
}
