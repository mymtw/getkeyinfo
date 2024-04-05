package com.etsy.android.config.flags.p073ui.search;

import com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher;
import com.etsy.android.lib.network.oauth2.C8747b0;
import com.etsy.android.lib.network.oauth2.C8749c0;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.favoriting.C10126d;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.ErrorUpdatingContentMachineTranslationHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10598a;
import com.etsy.android.p327ui.listing.p329ui.shop.handlers.C10642a;
import com.etsy.android.p327ui.search.interstitial.C10875a;
import com.etsy.android.p327ui.search.interstitial.C10876b;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p350fe.C12741o;
import p444se.C13376b;
import p466vc.C13573c;
import p475we.C13827c;
import p481xc.C13872a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.config.flags.ui.search.f */
public final class C6414f implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f14223a;

    /* renamed from: b */
    public final C19011a f14224b;

    public /* synthetic */ C6414f(C19011a aVar, int i) {
        this.f14223a = i;
        this.f14224b = aVar;
    }

    public final Object get() {
        switch (this.f14223a) {
            case 0:
                return new C6413e((ConfigFlagsEventDispatcher) this.f14224b.get());
            case 1:
                return new C8749c0((C8747b0) this.f14224b.get());
            case 2:
                return new C10126d((C13573c) this.f14224b.get());
            case 3:
                return new C13872a((C13573c) this.f14224b.get());
            case 4:
                return new ErrorUpdatingContentMachineTranslationHandler((C10156h) this.f14224b.get());
            case 5:
                return new C10598a((C13573c) this.f14224b.get());
            case 6:
                return new C10642a((C13573c) this.f14224b.get());
            case 7:
                return new C10875a((C10876b) this.f14224b.get());
            case 8:
                return new C13376b((C12741o) this.f14224b.get());
            default:
                return new C13827c((C12703a) this.f14224b.get());
        }
    }
}
