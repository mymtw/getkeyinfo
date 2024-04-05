package com.etsy.android.lib.network;

import android.content.SharedPreferences;
import com.etsy.android.lib.util.C8916o;
import com.etsy.android.p327ui.cart.saveforlater.C9354b;
import com.etsy.android.p327ui.cart.saveforlater.SaveForLaterRepository;
import com.etsy.android.p327ui.home.landingpage.C10037j;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10233c;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.C10537i;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import p350fe.C12741o;
import p466vc.C13573c;
import p488yb.C13898a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.x */
public final class C8814x implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19367a;

    /* renamed from: b */
    public final C19011a f19368b;

    /* renamed from: c */
    public final C19011a f19369c;

    public /* synthetic */ C8814x(C19011a aVar, C19011a aVar2, int i) {
        this.f19367a = i;
        this.f19368b = aVar;
        this.f19369c = aVar2;
    }

    public final Object get() {
        switch (this.f19367a) {
            case 0:
                return new C8813w((C8808s) this.f19368b.get(), (SharedPreferences) this.f19369c.get());
            case 1:
                return new SaveForLaterRepository((C9354b) this.f19368b.get(), (C13898a) this.f19369c.get());
            case 2:
                return new C10037j((C12741o) this.f19368b.get(), (C11786n) this.f19369c.get());
            case 3:
                return new C10233c((C13573c) this.f19368b.get(), (C8916o) this.f19369c.get());
            default:
                return new C10537i((C10156h) this.f19369c.get(), (C13573c) this.f19368b.get());
        }
    }
}
