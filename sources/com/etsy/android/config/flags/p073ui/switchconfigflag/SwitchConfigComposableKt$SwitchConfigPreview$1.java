package com.etsy.android.config.flags.p073ui.switchconfigflag;

import androidx.compose.runtime.C1302d;
import com.etsy.android.R;
import com.etsy.collagecompose.BadgeStyle;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.switchconfigflag.SwitchConfigComposableKt$SwitchConfigPreview$1 */
final class SwitchConfigComposableKt$SwitchConfigPreview$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ String $statusText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchConfigComposableKt$SwitchConfigPreview$1(String str, int i) {
        super(2);
        this.$statusText = str;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            SwitchConfigComposableKt.m12835a("AnalyticsUpdateSessionIdAfterBackgroundSec", "#team-name, @owner", false, this.$statusText, BadgeStyle.Primary, Integer.valueOf(R.drawable.clg_icon_core_gear_fill_v1), C64151.INSTANCE, C64162.INSTANCE, dVar, ((this.$$dirty << 9) & 7168) | 14180790);
            return;
        }
        dVar.mo5396C();
    }
}
