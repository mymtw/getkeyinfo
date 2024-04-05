package com.etsy.android.config.flags;

import androidx.compose.foundation.layout.C0763z;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import com.etsy.android.config.flags.C6383l;
import com.etsy.android.config.flags.events.C6350c;
import com.etsy.android.config.flags.p073ui.search.SearchInputComposableKt;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;

public final class ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$2 extends Lambda implements C19862q<C0763z, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19857l<C6350c, C19394m> $dispatch;
    public final /* synthetic */ C1342k1<C6383l> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$2(C1342k1<? extends C6383l> k1Var, C19857l<? super C6350c, C19394m> lVar, int i) {
        super(3);
        this.$state = k1Var;
        this.$dispatch = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0763z) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0763z zVar, C1302d dVar, int i) {
        String str;
        boolean z;
        C19383o.m32797g(zVar, "$this$TopAppBar");
        if ((i & 81) != 16 || !dVar.mo5442i()) {
            C6383l value = this.$state.getValue();
            if (value instanceof C6383l.C6384a) {
                str = ((C6383l.C6384a) value).f14209b;
            } else {
                boolean z2 = true;
                if (C19383o.m32792b(value, C6383l.C6385b.f14211a)) {
                    z = true;
                } else {
                    z = C19383o.m32792b(value, C6383l.C6386c.f14212a);
                }
                if (!z) {
                    z2 = C19383o.m32792b(value, C6383l.C6387d.f14213a);
                }
                if (z2) {
                    str = "";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            C19857l<C6350c, C19394m> lVar = this.$dispatch;
            dVar.mo5465u(1157296644);
            boolean I = dVar.mo5408I(lVar);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = new ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$2$1$1(lVar);
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            C19857l lVar2 = (C19857l) v;
            C19857l<C6350c, C19394m> lVar3 = this.$dispatch;
            dVar.mo5465u(1157296644);
            boolean I2 = dVar.mo5408I(lVar3);
            Object v2 = dVar.mo5467v();
            if (I2 || v2 == C1302d.C1303a.f2828a) {
                v2 = new ConfigFlagsFragmentKt$ConfigFlagsScreen$1$1$2$2$1(lVar3);
                dVar.mo5454o(v2);
            }
            dVar.mo5406H();
            SearchInputComposableKt.m12834a(str, lVar2, (C19846a) v2, dVar, 0);
            return;
        }
        dVar.mo5396C();
    }
}
