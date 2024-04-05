package com.etsy.android.p327ui.shop.tabs;

import com.etsy.android.lib.dagger.C8641a;
import com.etsy.android.lib.network.oauth2.C8746b;
import com.etsy.android.p327ui.shop.tabs.overview.C11232a;
import com.etsy.android.p327ui.shop.tabs.overview.C11233b;
import com.etsy.android.p327ui.shop.tabs.overview.C11234c;
import com.etsy.android.p327ui.shop.tabs.overview.C11235d;
import com.etsy.android.p327ui.shop.tabs.overview.C11237e;
import com.etsy.android.p327ui.shop.tabs.overview.C11238f;
import com.etsy.android.p327ui.shop.tabs.overview.C11240g;
import com.etsy.android.p327ui.shop.tabs.overview.C11241h;
import dagger.internal.C17555d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.shop.tabs.e */
public final class C11218e implements C17555d<C11217d> {

    /* renamed from: a */
    public final C19011a<C11240g> f24796a;

    /* renamed from: b */
    public final C19011a<C11233b> f24797b;

    /* renamed from: c */
    public final C19011a<C11234c> f24798c;

    /* renamed from: d */
    public final C19011a<C11237e> f24799d;

    /* renamed from: e */
    public final C19011a<C11232a> f24800e;

    public C11218e(C8746b bVar, C8641a aVar) {
        C11241h hVar = C11241h.C11242a.f24822a;
        C11235d dVar = C11235d.C11236a.f24820a;
        C11238f fVar = C11238f.C11239a.f24821a;
        this.f24796a = hVar;
        this.f24797b = bVar;
        this.f24798c = dVar;
        this.f24799d = fVar;
        this.f24800e = aVar;
    }

    public final Object get() {
        return new C11217d(this.f24796a.get(), this.f24797b.get(), this.f24798c.get(), this.f24799d.get(), this.f24800e.get());
    }
}
