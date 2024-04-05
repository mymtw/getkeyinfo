package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p437rd.C13354a;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.UpdateSecondVariationFromInventoryUiHandler$handle$1$1 */
public final class UpdateSecondVariationFromInventoryUiHandler$handle$1$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13660i5 $event;
    public final /* synthetic */ C10336b $variationTwoFromInventory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateSecondVariationFromInventoryUiHandler$handle$1$1(C13597g.C13660i5 i5Var, C10336b bVar) {
        super(1);
        this.$event = i5Var;
        this.$variationTwoFromInventory = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        C13354a aVar = gVar.f22863d;
        gVar.f22863d = aVar != null ? aVar.mo46041e(this.$event.f30153a.getValue()) : null;
        final C10336b bVar = this.$variationTwoFromInventory;
        final C13597g.C13660i5 i5Var = this.$event;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                bVar.f22384j = C10336b.m18381b(bVar, i5Var.f30153a, (String) null, 39);
            }
        });
    }
}
