package p409o9;

import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.ViewPerformanceTracker;
import com.etsy.android.lib.logger.perf.C8708e;
import com.etsy.android.lib.network.C8721a;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.p327ui.home.etsylens.C9973d;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.C10348f;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10446n;
import com.etsy.android.p327ui.listing.screenshots.C10191b;
import com.etsy.android.p327ui.util.C11786n;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p466vc.C13573c;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: o9.i */
public final class C13129i implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f28862a;

    /* renamed from: b */
    public final C19011a f28863b;

    /* renamed from: c */
    public final C19011a f28864c;

    public /* synthetic */ C13129i(C19011a aVar, C19011a aVar2, int i) {
        this.f28862a = i;
        this.f28863b = aVar;
        this.f28864c = aVar2;
    }

    public final Object get() {
        switch (this.f28862a) {
            case 0:
                return new C13128h((C13121c) this.f28863b.get(), (C17414y) this.f28864c.get());
            case 1:
                return new ViewPerformanceTracker((C8708e) this.f28863b.get(), (C8694h) this.f28864c.get());
            case 2:
                return new C8721a((C8629a) this.f28863b.get(), (C13888d) this.f28864c.get());
            case 3:
                return new C9974e((C11786n) this.f28863b.get(), (C9973d) this.f28864c.get());
            case 4:
                return new C10191b((C13573c) this.f28863b.get(), (C8694h) this.f28864c.get());
            case 5:
                return new C10348f((Connectivity) this.f28863b.get(), (C13573c) this.f28864c.get());
            default:
                return new C10446n((C13573c) this.f28863b.get(), (C11786n) this.f28864c.get());
        }
    }
}
