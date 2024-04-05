package com.etsy.android.lib.logger.perf;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.favorites.C9859l;
import com.etsy.android.p327ui.listing.favoriting.C10136l;
import com.etsy.android.p327ui.listing.p329ui.listingimages.handlers.C10428b;
import com.etsy.android.p327ui.listing.p329ui.panels.overview.OverviewPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10612k;
import com.etsy.android.p327ui.listing.p329ui.toppanel.contactShopInfo.C10654a;
import com.etsy.android.p327ui.search.filters.refactor.C10836m;
import com.etsy.android.p327ui.user.inappnotifications.C11584x;
import com.google.firebase.perf.session.SessionManager;
import dagger.internal.C17555d;
import p350fe.C12724a;
import p448ta.C13385a;
import p448ta.C13388d;
import p466vc.C13573c;
import p489yc.C13906d;
import p560en.C17726a;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.logger.perf.b */
public final class C8705b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19124a;

    /* renamed from: b */
    public final Object f19125b;

    public /* synthetic */ C8705b(Object obj, int i) {
        this.f19124a = i;
        this.f19125b = obj;
    }

    public final Object get() {
        switch (this.f19124a) {
            case 0:
                return new C8704a((C8709f) ((C19011a) this.f19125b).get());
            case 1:
                return new C13388d((C13385a) ((C19011a) this.f19125b).get());
            case 2:
                return new C10136l((C13573c) ((C19011a) this.f19125b).get());
            case 3:
                return new C13906d((C13573c) ((C19011a) this.f19125b).get());
            case 4:
                return new C10428b((C13573c) ((C19011a) this.f19125b).get());
            case 5:
                return new OverviewPanelClickedHandler((C13573c) ((C19011a) this.f19125b).get());
            case 6:
                return new C10612k((C13573c) ((C19011a) this.f19125b).get());
            case 7:
                return new C10654a((C13573c) ((C19011a) this.f19125b).get());
            case 8:
                return new C12724a((C8618c) ((C19011a) this.f19125b).get());
            case 9:
                return new C10836m((C8618c) ((C19011a) this.f19125b).get());
            case 10:
                return new C11584x((C9859l) ((C19011a) this.f19125b).get());
            default:
                ((C17726a) this.f19125b).getClass();
                SessionManager instance = SessionManager.getInstance();
                C17782b.m29838E(instance);
                return instance;
        }
    }
}
