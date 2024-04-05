package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.C10285a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.required.handlers.ShowPersonalizationInputErrorHandler$handle$1 */
public final class ShowPersonalizationInputErrorHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13775z3 $event;
    public final /* synthetic */ C10423j $personalizationUiModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowPersonalizationInputErrorHandler$handle$1(C10423j jVar, C13597g.C13775z3 z3Var) {
        super(1);
        this.$personalizationUiModel = jVar;
        this.$event = z3Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C10423j jVar = this.$personalizationUiModel;
        final C13597g.C13775z3 z3Var = this.$event;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                bVar.f22388n = C10285a.m18346b((C10285a) jVar, true, Integer.valueOf(z3Var.f30307a), (String) null, 22);
            }
        });
    }
}
