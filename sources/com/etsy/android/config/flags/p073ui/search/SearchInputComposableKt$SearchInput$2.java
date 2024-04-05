package com.etsy.android.config.flags.p073ui.search;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.C0468d;
import androidx.compose.animation.C0474j;
import androidx.compose.animation.C0476l;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.material.IconButtonKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: com.etsy.android.config.flags.ui.search.SearchInputComposableKt$SearchInput$2 */
public final class SearchInputComposableKt$SearchInput$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19846a<C19394m> $onClearClick;
    public final /* synthetic */ boolean $showClearButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInputComposableKt$SearchInput$2(boolean z, C19846a<C19394m> aVar, int i) {
        super(2);
        this.$showClearButton = z;
        this.$onClearClick = aVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            boolean z = this.$showClearButton;
            C0474j f = EnterExitTransitionKt.m1037f((C0433j0) null, 3);
            C0476l g = EnterExitTransitionKt.m1038g((C0433j0) null, 3);
            final C19846a<C19394m> aVar = this.$onClearClick;
            final int i2 = this.$$dirty;
            AnimatedVisibilityKt.m1028d(z, (C1436d) null, f, g, (String) null, C18263b.m30805A(dVar, -137355294, new C19862q<C0468d, C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C0468d) obj, (C1302d) obj2, ((Number) obj3).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C0468d dVar, C1302d dVar2, int i) {
                    C19383o.m32797g(dVar, "$this$AnimatedVisibility");
                    C19846a<C19394m> aVar = aVar;
                    dVar2.mo5465u(1157296644);
                    boolean I = dVar2.mo5408I(aVar);
                    Object v = dVar2.mo5467v();
                    if (I || v == C1302d.C1303a.f2828a) {
                        v = new SearchInputComposableKt$SearchInput$2$1$1$1(aVar);
                        dVar2.mo5454o(v);
                    }
                    dVar2.mo5406H();
                    IconButtonKt.m2184a((C19846a) v, (C1436d) null, false, (C0640j) null, ComposableSingletons$SearchInputComposableKt.f14218b, dVar2, 24576, 14);
                }
            }), dVar, 200064, 18);
            return;
        }
        dVar.mo5396C();
    }
}
