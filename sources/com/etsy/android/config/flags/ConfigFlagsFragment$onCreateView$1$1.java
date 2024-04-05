package com.etsy.android.config.flags;

import androidx.compose.runtime.C1302d;
import com.etsy.android.config.flags.events.C6350c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import p753kq.C19857l;
import p753kq.C19861p;

public final class ConfigFlagsFragment$onCreateView$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ ConfigFlagsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigFlagsFragment$onCreateView$1$1(ConfigFlagsFragment configFlagsFragment) {
        super(2);
        this.this$0 = configFlagsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            StateFlowImpl stateFlowImpl = this.this$0.getViewModel().f14132e;
            final ConfigFlagsFragment configFlagsFragment = this.this$0;
            ConfigFlagsFragmentKt.m12822a(stateFlowImpl, new C19857l<C6350c, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C6350c) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(C6350c cVar) {
                    C19383o.m32797g(cVar, "it");
                    ConfigFlagsViewModel viewModel = configFlagsFragment.getViewModel();
                    viewModel.getClass();
                    viewModel.f14130c.mo18133a(cVar);
                }
            }, dVar, 8);
            return;
        }
        dVar.mo5396C();
    }
}
