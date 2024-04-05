package com.etsy.android.p327ui.listing.p329ui.buybox.variations.bottomsheet.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10419g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.bottomsheet.handlers.ShowVariationSelectionHandler$handle$1 */
final class ShowVariationSelectionHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13610b4 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowVariationSelectionHandler$handle$1(C13597g.C13610b4 b4Var) {
        super(1);
        this.$event = b4Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        gVar.f22875p = this.$event.f30083a;
    }
}
