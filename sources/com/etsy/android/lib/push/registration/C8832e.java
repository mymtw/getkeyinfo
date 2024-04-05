package com.etsy.android.lib.push.registration;

import android.content.Context;
import com.etsy.android.p327ui.listing.favoriting.C10135k;
import com.etsy.android.p327ui.listing.p329ui.panels.overview.C10517a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.C10602d;
import com.etsy.android.p327ui.user.C11613o;
import com.etsy.android.push.C8941d;
import com.google.firebase.messaging.FirebaseMessaging;
import dagger.internal.C17555d;
import p466vc.C13573c;
import p489yc.C13902a;
import p489yc.C13903b;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.push.registration.e */
public final class C8832e implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19423a;

    /* renamed from: b */
    public final C19011a f19424b;

    public /* synthetic */ C8832e(C19011a aVar, int i) {
        this.f19423a = i;
        this.f19424b = aVar;
    }

    public final Object get() {
        switch (this.f19423a) {
            case 0:
                return new C8831d((FirebaseMessaging) this.f19424b.get());
            case 1:
                return new C8941d((Context) this.f19424b.get());
            case 2:
                return new C10135k((C13573c) this.f19424b.get());
            case 3:
                return new C13902a((C13903b) this.f19424b.get());
            case 4:
                return new C10517a((C13573c) this.f19424b.get());
            case 5:
                return new C10602d((C13573c) this.f19424b.get());
            default:
                return new C11613o((C13943a) this.f19424b.get());
        }
    }
}
