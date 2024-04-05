package com.etsy.android.config.flags;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.material.IconButtonKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import com.etsy.android.config.flags.events.C6350c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19857l<C6350c, C19394m> $dispatch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$1(C19857l<? super C6350c, C19394m> lVar, int i) {
        super(2);
        this.$dispatch = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C19857l<C6350c, C19394m> lVar = this.$dispatch;
            dVar.mo5465u(1157296644);
            boolean I = dVar.mo5408I(lVar);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = new ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$1$1$1(lVar);
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            IconButtonKt.m2184a((C19846a) v, (C1436d) null, false, (C0640j) null, ComposableSingletons$ConfigFlagsFragmentKt.f14128b, dVar, 24576, 14);
            return;
        }
        dVar.mo5396C();
    }
}
