package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.compose.p015ui.text.font.C1948d;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.util.C8916o;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.h */
public final class C10238h {

    /* renamed from: a */
    public final C13573c f22524a;

    /* renamed from: b */
    public final C8916o f22525b;

    public C10238h(C13573c cVar, C8916o oVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(oVar, "etsyVibrator");
        this.f22524a = cVar;
        this.f22525b = oVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33621a() {
        boolean z = C1948d.m4276h(this.f22525b.f19673a) != 0;
        this.f22524a.mo38043a(new C13597g.C13633f("device_haptic_pref", C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.HAPTIC_PREF, z ? "on" : "off"))));
        if (z) {
            C8916o oVar = this.f22525b;
            long[] jArr = C15588c1.f35081g;
            oVar.getClass();
            Vibrator e = C1948d.m4273e(oVar.f19673a);
            if (e != null) {
                e.vibrate(VibrationEffect.createWaveform(jArr, -1));
            }
        }
        return C13574d.C13575a.f29662a;
    }
}
