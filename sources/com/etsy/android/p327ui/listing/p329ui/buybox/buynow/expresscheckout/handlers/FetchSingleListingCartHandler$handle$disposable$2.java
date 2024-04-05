package com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers;

import com.etsy.android.lib.models.apiv3.cart.SingleListingCart;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.handlers.FetchSingleListingCartHandler$handle$disposable$2 */
public final class FetchSingleListingCartHandler$handle$disposable$2 extends Lambda implements C19857l<SingleListingCart, C19394m> {
    public final /* synthetic */ C13597g.C13760x0 $event;
    public final /* synthetic */ FetchSingleListingCartHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchSingleListingCartHandler$handle$disposable$2(C13597g.C13760x0 x0Var, FetchSingleListingCartHandler fetchSingleListingCartHandler) {
        super(1);
        this.$event = x0Var;
        this.this$0 = fetchSingleListingCartHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SingleListingCart) obj);
        return C19394m.f43287a;
    }

    public final void invoke(SingleListingCart singleListingCart) {
        Object obj;
        if (this.$event.f30288a) {
            obj = new C13597g.C13621d1(singleListingCart);
        } else {
            obj = new C13597g.C13752w(singleListingCart);
        }
        this.this$0.f22470d.mo38043a(obj);
    }
}
