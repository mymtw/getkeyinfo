package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10408e;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import com.etsy.android.p327ui.listing.p329ui.C10665x;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.handlers.UpdateContentMachineTranslationHandler$handle$1 */
public final class UpdateContentMachineTranslationHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13618c5 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateContentMachineTranslationHandler$handle$1(C13597g.C13618c5 c5Var) {
        super(1);
        this.$event = c5Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13618c5 c5Var = this.$event;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                final C13597g.C13618c5 c5Var = c5Var;
                bVar.mo33565a(new C19857l<C10665x, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10665x) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10665x xVar) {
                        C19383o.m32797g(xVar, "$this$title");
                        xVar.f23484b = c5Var.f30092a;
                    }
                });
            }
        });
        final C13597g.C13618c5 c5Var2 = this.$event;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10625r rVar) {
                C19383o.m32797g(rVar, "$this$panels");
                final C13597g.C13618c5 c5Var = c5Var2;
                rVar.mo34252b(new C19857l<C10408e, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((C10408e) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(C10408e eVar) {
                        C19383o.m32797g(eVar, "$this$itemDetailsPanel");
                        eVar.f22792j = true;
                        eVar.f22790h = c5Var.f30093b;
                    }
                });
            }
        });
    }
}
