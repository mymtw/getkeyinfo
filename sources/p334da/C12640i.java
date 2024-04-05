package p334da;

import androidx.work.C3437q;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.cart.C9330p;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.conversation.details.ccm.C9492a;
import com.etsy.android.p327ui.conversation.details.ccm.C9510o;
import com.etsy.android.p327ui.core.C9622j;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10232b;
import com.etsy.android.p327ui.shop.tabs.ShopViewModel;
import dagger.internal.C17554c;
import dagger.internal.C17555d;
import kotlinx.coroutines.CoroutineDispatcher;
import p335db.C12641a;
import p335db.C12642b;
import p350fe.C12741o;
import p428qc.C13294e;
import p428qc.C13297g;
import p466vc.C13573c;
import p478x9.C13851a;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: da.i */
public final class C12640i implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f27880a;

    /* renamed from: b */
    public final C19011a f27881b;

    /* renamed from: c */
    public final C19011a f27882c;

    public /* synthetic */ C12640i(C19011a aVar, C19011a aVar2, int i) {
        this.f27880a = i;
        this.f27881b = aVar;
        this.f27882c = aVar2;
    }

    public final Object get() {
        switch (this.f27880a) {
            case 0:
                return new C12639h((C8618c) this.f27881b.get(), (C3437q) this.f27882c.get());
            case 1:
                return new C12642b((C13943a) this.f27881b.get(), (C12641a) this.f27882c.get());
            case 2:
                return new C9330p((C12741o) this.f27881b.get(), (C13851a) this.f27882c.get());
            case 3:
                return new C9510o((C9492a) this.f27881b.get(), (C9477c) this.f27882c.get());
            case 4:
                return new C9622j((C12741o) this.f27881b.get(), (C13851a) this.f27882c.get());
            case 5:
                return new C13297g((C12741o) this.f27881b.get(), (C13294e) this.f27882c.get());
            case 6:
                return new C10232b((C13573c) this.f27881b.get(), (C8694h) this.f27882c.get());
            default:
                return new ShopViewModel((CoroutineDispatcher) this.f27881b.get(), C17554c.m29426a(this.f27882c));
        }
    }
}
