package p410oa;

import android.content.Context;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.cart.C9242a0;
import com.etsy.android.p327ui.cart.C9293d;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10583h;
import com.etsy.android.p327ui.user.privacy.C11622b;
import com.etsy.android.p327ui.util.C11786n;
import com.google.android.gms.common.GoogleApiAvailability;
import dagger.internal.C17555d;
import p309ad.C8505b;
import p340ea.C12673n;
import p350fe.C12741o;
import p418pa.C13198d;
import p456ua.C13461f;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: oa.f */
public final class C13146f implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f28911a;

    /* renamed from: b */
    public final C19011a f28912b;

    /* renamed from: c */
    public final C19011a f28913c;

    /* renamed from: d */
    public final C19011a f28914d;

    public /* synthetic */ C13146f(C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f28911a = i;
        this.f28912b = aVar;
        this.f28913c = aVar2;
        this.f28914d = aVar3;
    }

    public final Object get() {
        switch (this.f28911a) {
            case 0:
                return new C13145e((Context) this.f28912b.get(), (C8694h) this.f28913c.get(), (GoogleApiAvailability) this.f28914d.get());
            case 1:
                return new C9242a0((C9293d) this.f28912b.get(), (C9323l) this.f28913c.get(), (C12741o) this.f28914d.get());
            case 2:
                return new C10583h((C8505b) this.f28912b.get(), (C11786n) this.f28913c.get(), (C13573c) this.f28914d.get());
            default:
                return new C11622b((C13198d) this.f28912b.get(), (C13461f) this.f28913c.get(), (C12673n) this.f28914d.get());
        }
    }
}
