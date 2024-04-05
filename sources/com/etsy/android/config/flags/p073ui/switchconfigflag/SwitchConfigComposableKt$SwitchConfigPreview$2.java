package com.etsy.android.config.flags.p073ui.switchconfigflag;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.collagecompose.ThemeKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.switchconfigflag.SwitchConfigComposableKt$SwitchConfigPreview$2 */
final class SwitchConfigComposableKt$SwitchConfigPreview$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $statusText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchConfigComposableKt$SwitchConfigPreview$2(String str, int i, int i2) {
        super(2);
        this.$statusText = str;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        String str = this.$statusText;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        ComposerImpl h = dVar.mo5440h(-834693002);
        int i5 = i4 & 1;
        if (i5 != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(str) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            if (i5 != 0) {
                str = "Clean up";
            }
            ThemeKt.m19959a(false, C18263b.m30805A(h, -2048682318, new SwitchConfigComposableKt$SwitchConfigPreview$1(str, i2)), h, 48, 1);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SwitchConfigComposableKt$SwitchConfigPreview$2(str, i3, i4);
        }
    }
}
