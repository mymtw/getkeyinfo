package com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10350b;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.listing.handlers.UpdateSecondVariationFromListingHandler$handle$1 */
final class UpdateSecondVariationFromListingHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13667j5 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateSecondVariationFromListingHandler$handle$1(C13597g.C13667j5 j5Var) {
        super(1);
        this.$event = j5Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13667j5 j5Var = this.$event;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                C10423j jVar = bVar.f22384j;
                C10350b bVar2 = null;
                C10350b bVar3 = jVar instanceof C10350b ? (C10350b) jVar : null;
                if (bVar3 != null) {
                    bVar2 = C10350b.m18395b(bVar3, j5Var.f30160a, (String) null, 1);
                }
                bVar.f22384j = bVar2;
            }
        });
    }
}
