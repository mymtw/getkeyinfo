package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.ShowCartButtonHandler$handle$1 */
public final class ShowCartButtonHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ ListingViewState.C10092d $state;
    public final /* synthetic */ ShowCartButtonHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShowCartButtonHandler$handle$1(ListingViewState.C10092d dVar, ShowCartButtonHandler showCartButtonHandler) {
        super(1);
        this.$state = dVar;
        this.this$0 = showCartButtonHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final ListingViewState.C10092d dVar = this.$state;
        final ShowCartButtonHandler showCartButtonHandler = this.this$0;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C19383o.m32797g(bVar, "$this$buyBox");
                bVar.f22390p = C10225a.C10226a.m18303a(dVar.f22239g, Long.valueOf(showCartButtonHandler.f22504a.mo45958c().getIdAsLongDeprecated()));
            }
        });
    }
}
