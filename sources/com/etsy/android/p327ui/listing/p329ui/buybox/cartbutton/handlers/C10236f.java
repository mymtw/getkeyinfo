package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import com.etsy.android.R;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.f */
public final class C10236f {

    /* renamed from: a */
    public final C13573c f22521a;

    public C10236f(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22521a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33619a(C13597g.C13682m mVar) {
        C19383o.m32797g(mVar, "event");
        C10225a aVar = mVar.f30176a;
        if (!aVar.f22492d && aVar.f22489a == R.string.add_to_cart && aVar.f22491c) {
            this.f22521a.mo38043a(new C13597g.C13688m5(new C13597g.C13598a(mVar.f30177b), false, 2));
        }
        return C13574d.C13575a.f29662a;
    }
}
