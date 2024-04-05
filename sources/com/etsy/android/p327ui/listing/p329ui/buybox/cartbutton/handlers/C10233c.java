package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import androidx.compose.p015ui.text.font.C1948d;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.util.C8916o;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.c */
public final class C10233c {

    /* renamed from: a */
    public final C13573c f22508a;

    /* renamed from: b */
    public final C8916o f22509b;

    public C10233c(C13573c cVar, C8916o oVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(oVar, "etsyVibrator");
        this.f22508a = cVar;
        this.f22509b = oVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33617a() {
        boolean z = C1948d.m4276h(this.f22509b.f19673a) != 0;
        this.f22508a.mo38043a(new C13597g.C13633f("device_haptic_pref", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.HAPTIC_PREF, z ? "on" : "off"))));
        if (z) {
            C1948d.m4270b(this.f22509b.f19673a, 125);
        }
        return C13574d.C13575a.f29662a;
    }
}
