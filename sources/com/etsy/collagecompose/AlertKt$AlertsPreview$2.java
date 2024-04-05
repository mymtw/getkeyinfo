package com.etsy.collagecompose;

import android.content.Context;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

final class AlertKt$AlertsPreview$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertKt$AlertsPreview$2(int i) {
        super(2);
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2 = this.$$changed | 1;
        ComposerImpl h = dVar.mo5440h(-1748388480);
        if (i2 != 0 || !h.mo5442i()) {
            Context context = (Context) h.mo5410J(AndroidCompositionLocals_androidKt.f3987b);
            ThemeKt.m19959a(false, C18263b.m30805A(h, -1782179132, new AlertKt$AlertsPreview$1(new AlertKt$AlertsPreview$backgroundClickToaster$1(context), new AlertKt$AlertsPreview$dismissClickToaster$1(context), new AlertKt$AlertsPreview$mainClickToaster$1(context), new AlertKt$AlertsPreview$altClickToaster$1(context))), h, 48, 1);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AlertKt$AlertsPreview$2(i2);
        }
    }
}
