package com.etsy.android.config.flags.events;

import android.app.NotificationManager;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.C10078j0;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.favoriting.C10125c;
import com.etsy.android.p327ui.listing.p329ui.ListingSections;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10236f;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.C10329c;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.ContentMachineTranslationToggleHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.translations.C10546c;
import com.etsy.android.p327ui.user.inappnotifications.C11554h;
import com.etsy.android.p327ui.user.inappnotifications.C11587z;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import p336dc.C12645c;
import p346fa.C12703a;
import p350fe.C12741o;
import p434ra.C13342i;
import p444se.C13375a;
import p466vc.C13573c;
import p475we.C13826b;
import p478x9.C13860g;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.config.flags.events.n */
public final class C6367n implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f14191a;

    /* renamed from: b */
    public final C19011a f14192b;

    public /* synthetic */ C6367n(C19011a aVar, int i) {
        this.f14191a = i;
        this.f14192b = aVar;
    }

    public final Object get() {
        switch (this.f14191a) {
            case 0:
                return new C6366m((C12703a) this.f14192b.get());
            case 1:
                return new C13342i((NotificationManager) this.f14192b.get());
            case 2:
                return new C10078j0((C12741o) this.f14192b.get());
            case 3:
                return new C12645c((C13943a) this.f14192b.get());
            case 4:
                return new C10125c((C13573c) this.f14192b.get());
            case 5:
                return new ListingSections((C10156h) this.f14192b.get());
            case 6:
                return new C10236f((C13573c) this.f14192b.get());
            case 7:
                return new C10329c((C11786n) this.f14192b.get());
            case 8:
                return new ContentMachineTranslationToggleHandler((C10156h) this.f14192b.get());
            case 9:
                return new C10546c((C13573c) this.f14192b.get());
            case 10:
                return new C13375a((C13860g) this.f14192b.get());
            case 11:
                return new C13826b((C8618c) this.f14192b.get());
            default:
                return new C11554h((C11587z) this.f14192b.get());
        }
    }
}
