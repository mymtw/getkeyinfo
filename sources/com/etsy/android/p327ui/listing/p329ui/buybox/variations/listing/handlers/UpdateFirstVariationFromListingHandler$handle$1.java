package com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10349a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.listing.handlers.UpdateFirstVariationFromListingHandler$handle$1 */
final class UpdateFirstVariationFromListingHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13632e5 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateFirstVariationFromListingHandler$handle$1(C13597g.C13632e5 e5Var) {
        super(1);
        this.$event = e5Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13632e5 e5Var = this.$event;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                C10423j jVar = bVar.f22383i;
                C10349a aVar = null;
                C10349a aVar2 = jVar instanceof C10349a ? (C10349a) jVar : null;
                if (aVar2 != null) {
                    aVar = C10349a.m18393b(aVar2, e5Var.f30110a, (String) null, 1);
                }
                bVar.f22383i = aVar;
            }
        });
    }
}
