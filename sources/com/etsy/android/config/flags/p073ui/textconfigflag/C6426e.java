package com.etsy.android.config.flags.p073ui.textconfigflag;

import com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher;
import com.etsy.android.lib.network.oauth2.C8753e0;
import com.etsy.android.lib.network.oauth2.C8798x;
import com.etsy.android.p327ui.listing.favoriting.C10128f;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10240j;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.bottomsheet.handlers.C10325c;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.ItemDetailsPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.ShippingAndPoliciesPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.shop.handlers.StarSellerBadgeTappedHandler;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.search.C10885k;
import dagger.internal.C17555d;
import p350fe.C12741o;
import p444se.C13378d;
import p466vc.C13573c;
import p481xc.C13874c;
import p489yc.C13903b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.config.flags.ui.textconfigflag.e */
public final class C6426e implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f14244a;

    /* renamed from: b */
    public final C19011a f14245b;

    public /* synthetic */ C6426e(C19011a aVar, int i) {
        this.f14244a = i;
        this.f14245b = aVar;
    }

    public final Object get() {
        switch (this.f14244a) {
            case 0:
                return new C6425d((ConfigFlagsEventDispatcher) this.f14245b.get());
            case 1:
                return new C8753e0((C8798x) this.f14245b.get());
            case 2:
                return new C10128f((C13573c) this.f14245b.get());
            case 3:
                return new C13874c((C13573c) this.f14245b.get());
            case 4:
                return new C10240j((C13903b) this.f14245b.get());
            case 5:
                return new C10325c((C13573c) this.f14245b.get());
            case 6:
                return new ItemDetailsPanelClickedHandler((C13573c) this.f14245b.get());
            case 7:
                return new ShippingAndPoliciesPanelClickedHandler((C13573c) this.f14245b.get());
            case 8:
                return new StarSellerBadgeTappedHandler((C13573c) this.f14245b.get());
            case 9:
                return new C10885k((C10865h) this.f14245b.get());
            default:
                return new C13378d((C12741o) this.f14245b.get());
        }
    }
}
