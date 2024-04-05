package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import com.etsy.android.R;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.e */
public final class C10235e {

    /* renamed from: a */
    public final C13573c f22520a;

    public C10235e(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22520a = cVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33618a(C13597g.C13675l lVar) {
        C19383o.m32797g(lVar, "event");
        C10225a aVar = lVar.f30169a;
        if (!aVar.f22491c) {
            return C13574d.C13575a.f29662a;
        }
        int i = aVar.f22489a;
        if (i == R.string.view_in_cart) {
            this.f22520a.mo38043a(C13597g.C13751v5.f30279a);
        } else if (i == R.string.add_to_cart) {
            this.f22520a.mo38043a(new C13597g.C13688m5(new C13597g.C13605b(aVar.f22492d), true, 4));
        }
        return C13574d.C13575a.f29662a;
    }
}
