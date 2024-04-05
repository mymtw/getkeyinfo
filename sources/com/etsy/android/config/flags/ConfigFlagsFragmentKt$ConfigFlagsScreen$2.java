package com.etsy.android.config.flags;

import androidx.compose.runtime.C1302d;
import com.etsy.android.config.flags.events.C6350c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C19689x1;
import p753kq.C19857l;
import p753kq.C19861p;

public final class ConfigFlagsFragmentKt$ConfigFlagsScreen$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19857l<C6350c, C19394m> $dispatch;
    public final /* synthetic */ C19689x1<C6383l> $stateFlow;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigFlagsFragmentKt$ConfigFlagsScreen$2(C19689x1<? extends C6383l> x1Var, C19857l<? super C6350c, C19394m> lVar, int i) {
        super(2);
        this.$stateFlow = x1Var;
        this.$dispatch = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        ConfigFlagsFragmentKt.m12822a(this.$stateFlow, this.$dispatch, dVar, this.$$changed | 1);
    }
}
