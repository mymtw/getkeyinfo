package com.etsy.android.config.flags.p073ui;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.collagecompose.ThemeKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.config.flags.ui.ConfigsListComposableKt$ConfigsListPreview$1 */
final class ConfigsListComposableKt$ConfigsListPreview$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $statusText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigsListComposableKt$ConfigsListPreview$1(String str, int i, int i2) {
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
        String str = this.$statusText;
        int i2 = this.$$changed | 1;
        int i3 = this.$$default;
        ComposerImpl h = dVar.mo5440h(492526094);
        if ((i2 & 1) != 0 || !h.mo5442i()) {
            if ((i3 & 1) != 0) {
                str = "Clean up";
            }
            ThemeKt.m19959a(false, ComposableSingletons$ConfigsListComposableKt.f14214a, h, 48, 1);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ConfigsListComposableKt$ConfigsListPreview$1(str, i2, i3);
        }
    }
}
