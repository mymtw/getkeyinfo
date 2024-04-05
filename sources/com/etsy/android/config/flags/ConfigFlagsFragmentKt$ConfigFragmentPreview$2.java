package com.etsy.android.config.flags;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.config.flags.C6383l;
import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class ConfigFlagsFragmentKt$ConfigFragmentPreview$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigFlagsFragmentKt$ConfigFragmentPreview$2(int i) {
        super(2);
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2 = this.$$changed | 1;
        ComposerImpl h = dVar.mo5440h(1176342663);
        if (i2 != 0 || !h.mo5442i()) {
            ConfigFlagsFragmentKt.m12822a(C19388s.m32862g(C6383l.C6386c.f14212a), ConfigFlagsFragmentKt$ConfigFragmentPreview$1.INSTANCE, h, 56);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ConfigFlagsFragmentKt$ConfigFragmentPreview$2(i2);
        }
    }
}
