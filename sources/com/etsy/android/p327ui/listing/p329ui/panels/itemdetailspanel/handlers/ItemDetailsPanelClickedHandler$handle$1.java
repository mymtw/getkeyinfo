package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10408e;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.ItemDetailsPanelClickedHandler$handle$1 */
public final class ItemDetailsPanelClickedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13712q1 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemDetailsPanelClickedHandler$handle$1(C13597g.C13712q1 q1Var) {
        super(1);
        this.$event = q1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13712q1 q1Var = this.$event;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final C13597g.C13712q1 q1Var = q1Var;
                rVar.mo34252b(new C19857l<C10408e, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10408e) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10408e eVar) {
                        C19383o.m32797g(eVar, "$this$itemDetailsPanel");
                        eVar.f22797o = q1Var.f30226a;
                    }
                });
            }
        });
    }
}
