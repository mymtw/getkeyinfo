package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p437rd.C13354a;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.UpdateFirstVariationFromInventoryUiHandler$handle$1$1 */
public final class UpdateFirstVariationFromInventoryUiHandler$handle$1$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13625d5 $event;
    public final /* synthetic */ C10334a $variationOne;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateFirstVariationFromInventoryUiHandler$handle$1$1(C13597g.C13625d5 d5Var, C10334a aVar) {
        super(1);
        this.$event = d5Var;
        this.$variationOne = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        C13354a aVar = gVar.f22863d;
        gVar.f22863d = aVar != null ? aVar.mo46041e(this.$event.f30101a.getValue()) : null;
        final C10334a aVar2 = this.$variationOne;
        final C13597g.C13625d5 d5Var = this.$event;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                bVar.f22383i = C10334a.m18378b(aVar2, d5Var.f30101a, (String) null, 39);
            }
        });
    }
}
