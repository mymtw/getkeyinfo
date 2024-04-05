package com.etsy.android.p327ui.cart;

import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.UserCounters;
import com.etsy.android.p327ui.cart.C9265c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.CartBadgeCountRepo$fetchCartCount$2 */
public final class CartBadgeCountRepo$fetchCartCount$2 extends Lambda implements C19857l<C9265c, C19394m> {
    public final /* synthetic */ CartBadgeCountRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CartBadgeCountRepo$fetchCartCount$2(CartBadgeCountRepo cartBadgeCountRepo) {
        super(1);
        this.this$0 = cartBadgeCountRepo;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9265c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9265c cVar) {
        int i = 0;
        if (cVar instanceof C9265c.C9267b) {
            CartBadgeCountRepo cartBadgeCountRepo = this.this$0;
            C19383o.m32796f(cVar, "result");
            cartBadgeCountRepo.getClass();
            UserCounters userCounters = ((C9265c.C9267b) cVar).f20467a;
            if (userCounters != null) {
                i = userCounters.getCartCount();
            }
            cartBadgeCountRepo.mo31438c(i);
            cartBadgeCountRepo.f20398d = true;
        } else if (cVar instanceof C9265c.C9266a) {
            CartBadgeCountRepo cartBadgeCountRepo2 = this.this$0;
            C19383o.m32796f(cVar, "result");
            cartBadgeCountRepo2.getClass();
            LogCatKt.m17045a().error(((C9265c.C9266a) cVar).f20466a);
            cartBadgeCountRepo2.mo31438c(0);
            cartBadgeCountRepo2.f20398d = true;
        }
    }
}
