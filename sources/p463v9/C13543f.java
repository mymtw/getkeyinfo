package p463v9;

import androidx.work.C3437q;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.util.C8916o;
import com.etsy.android.p327ui.listing.favoriting.C10129g;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.ShowCartButtonHandler;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.C10341a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10599b;
import com.etsy.android.p327ui.listing.p329ui.shop.handlers.StarSellerBadgeViewedHandler;
import com.etsy.android.push.C8940c;
import com.etsy.android.push.C8941d;
import dagger.internal.C17555d;
import p366ia.C12920a;
import p425q9.C13265p;
import p466vc.C13573c;
import p481xc.C13878f;
import p490yd.C13914b;
import p740eq.C19011a;

/* renamed from: v9.f */
public final class C13543f implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f29619a;

    /* renamed from: b */
    public final C19011a f29620b;

    public /* synthetic */ C13543f(C19011a aVar, int i) {
        this.f29619a = i;
        this.f29620b = aVar;
    }

    public final Object get() {
        switch (this.f29619a) {
            case 0:
                return new C13542e((C3437q) this.f29620b.get());
            case 1:
                return new C12920a((C8591a) this.f29620b.get());
            case 2:
                return new C8940c((C8941d) this.f29620b.get());
            case 3:
                return new C10129g((C8916o) this.f29620b.get());
            case 4:
                return new C13878f((C13573c) this.f29620b.get());
            case 5:
                return new ShowCartButtonHandler((C13265p) this.f29620b.get());
            case 6:
                return new C10341a((C13914b) this.f29620b.get());
            case 7:
                return new C10599b((C13573c) this.f29620b.get());
            default:
                return new StarSellerBadgeViewedHandler((C13573c) this.f29620b.get());
        }
    }
}
