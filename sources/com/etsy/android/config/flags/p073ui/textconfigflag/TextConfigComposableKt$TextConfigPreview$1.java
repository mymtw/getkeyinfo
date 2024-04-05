package com.etsy.android.config.flags.p073ui.textconfigflag;

import androidx.compose.runtime.C1302d;
import com.etsy.android.R;
import com.etsy.collagecompose.BadgeStyle;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.textconfigflag.TextConfigComposableKt$TextConfigPreview$1 */
final class TextConfigComposableKt$TextConfigPreview$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ String $flagValue;
    public final /* synthetic */ String $statusText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextConfigComposableKt$TextConfigPreview$1(String str, String str2, int i) {
        super(2);
        this.$flagValue = str;
        this.$statusText = str2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            String str = this.$flagValue;
            String str2 = this.$statusText;
            BadgeStyle badgeStyle = BadgeStyle.Primary;
            Integer valueOf = Integer.valueOf(R.drawable.clg_icon_core_gear_fill_v1);
            C64201 r6 = C64201.INSTANCE;
            int i2 = this.$$dirty;
            TextConfigComposableKt.m12844a("AnalyticsUpdateSessionIdAfterBackgroundSec", "#team-name, @owner", str, str2, badgeStyle, valueOf, r6, dVar, 1597494 | ((i2 << 6) & 896) | ((i2 << 6) & 7168));
            return;
        }
        dVar.mo5396C();
    }
}
