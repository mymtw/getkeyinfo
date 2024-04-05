package com.etsy.android.lib.network.oauth2.signin;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.push.registration.C8838k;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10454b;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.handlers.ReviewsPanelClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10582g;
import com.etsy.android.p327ui.shop.C11129a1;
import com.etsy.android.p327ui.shop.C11132b1;
import com.etsy.android.p327ui.user.purchases.C11655m;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import p349fd.C12720d;
import p350fe.C12741o;
import p410oa.C13144d;
import p466vc.C13573c;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.j */
public final class C8782j implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19328a;

    /* renamed from: b */
    public final C19011a f19329b;

    public /* synthetic */ C8782j(C19011a aVar, int i) {
        this.f19328a = i;
        this.f19329b = aVar;
    }

    public final Object get() {
        switch (this.f19328a) {
            case 0:
                return new C8781i((FragmentActivity) this.f19329b.get());
            case 1:
                return new C13144d((Context) this.f19329b.get());
            case 2:
                return new C8838k((C8618c) this.f19329b.get());
            case 3:
                return new C12720d((C13573c) this.f19329b.get());
            case 4:
                return new C10454b((C13573c) this.f19329b.get());
            case 5:
                return new ReviewsPanelClickedHandler((C13573c) this.f19329b.get());
            case 6:
                return new C10582g((C13943a) this.f19329b.get());
            case 7:
                return new C11132b1((C11129a1) this.f19329b.get());
            case 8:
                return new C11655m((C12741o) this.f19329b.get());
            default:
                return new C11786n((Application) this.f19329b.get());
        }
    }
}
