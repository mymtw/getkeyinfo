package com.etsy.android.p327ui.listing.p329ui.panels.overview;

import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.overview.OverviewPanelClickedHandler$handle$1 */
public final class OverviewPanelClickedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13706p2 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverviewPanelClickedHandler$handle$1(C13597g.C13706p2 p2Var) {
        super(1);
        this.$event = p2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13706p2 p2Var = this.$event;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C10518b bVar;
                C19383o.m32797g(rVar, "$this$panels");
                C10518b bVar2 = rVar.f23317a;
                if (bVar2 != null) {
                    boolean z = p2Var.f30219a;
                    List<CharSequence> list = bVar2.f23067a;
                    boolean z2 = bVar2.f23069c;
                    C19383o.m32797g(list, "bullets");
                    bVar = new C10518b(list, z, z2);
                } else {
                    bVar = null;
                }
                rVar.f23317a = bVar;
            }
        });
    }
}
