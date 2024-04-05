package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.requests.apiv3.ShippingDetailsEndpoint;
import com.etsy.android.p327ui.core.C9624l;
import com.etsy.android.p327ui.listing.favoriting.C10124b;
import com.etsy.android.p327ui.search.C10746f;
import com.etsy.android.p327ui.search.C10865h;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p350fe.C12741o;
import p425q9.C13265p;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.a0 */
public final class C8745a0 implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19223a;

    /* renamed from: b */
    public final C19011a f19224b;

    /* renamed from: c */
    public final C19011a f19225c;

    public /* synthetic */ C8745a0(C19011a aVar, C19011a aVar2, int i) {
        this.f19223a = i;
        this.f19224b = aVar;
        this.f19225c = aVar2;
    }

    public final Object get() {
        switch (this.f19223a) {
            case 0:
                return new C8804z((C8769s) this.f19224b.get(), (C12703a) this.f19225c.get());
            case 1:
                return new C9624l((ShippingDetailsEndpoint) this.f19224b.get(), (C13265p) this.f19225c.get());
            case 2:
                return new C10124b((C13265p) this.f19224b.get(), (C13573c) this.f19225c.get());
            default:
                return new C10746f((C10865h) this.f19224b.get(), (C12741o) this.f19225c.get());
        }
    }
}
