package com.etsy.android.p327ui.listing.p329ui.toppanel.contactShopInfo;

import android.view.View;
import android.widget.Button;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.toppanel.contactShopInfo.ContactShopHelper */
public final class ContactShopHelper {

    /* renamed from: a */
    public final C13573c f23421a;

    /* renamed from: b */
    public final Button f23422b;

    /* renamed from: c */
    public final Button f23423c;

    public ContactShopHelper(View view, C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f23421a = cVar;
        View findViewById = view.findViewById(R.id.button_contact_shop);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.button_contact_shop)");
        this.f23422b = (Button) findViewById;
        View findViewById2 = view.findViewById(R.id.button_contact_shop_no_background);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.b…ntact_shop_no_background)");
        this.f23423c = (Button) findViewById2;
    }

    /* renamed from: a */
    public final void mo34312a(C10655b bVar) {
        if (bVar == null) {
            ViewExtensions.m12860d(this.f23422b);
            ViewExtensions.m12860d(this.f23423c);
            return;
        }
        ViewExtensions.m12860d(this.f23422b);
        ViewExtensions.m12869m(this.f23423c);
        ViewExtensions.m12866j(this.f23423c, new ContactShopHelper$bind$1(this));
    }

    /* renamed from: b */
    public final void mo34313b(C10655b bVar) {
        if (bVar == null) {
            ViewExtensions.m12860d(this.f23422b);
            ViewExtensions.m12860d(this.f23423c);
            return;
        }
        ViewExtensions.m12869m(this.f23422b);
        ViewExtensions.m12860d(this.f23423c);
        ViewExtensions.m12866j(this.f23422b, new ContactShopHelper$bindTransparent$1(this));
    }
}
