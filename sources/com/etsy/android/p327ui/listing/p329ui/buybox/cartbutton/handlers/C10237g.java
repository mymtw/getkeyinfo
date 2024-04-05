package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import p490yd.C13914b;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.g */
public final class C10237g {

    /* renamed from: a */
    public final C13914b f22522a;

    /* renamed from: b */
    public final C13573c f22523b;

    public C10237g(C13573c cVar, C13914b bVar) {
        C19383o.m32797g(bVar, "toaster");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22522a = bVar;
        this.f22523b = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33620a() {
        this.f22523b.mo38043a(C13597g.C13769y3.f30300a);
        C13914b.m21425a(this.f22522a, R.string.cart_error);
        return C13574d.C13575a.f29662a;
    }
}
