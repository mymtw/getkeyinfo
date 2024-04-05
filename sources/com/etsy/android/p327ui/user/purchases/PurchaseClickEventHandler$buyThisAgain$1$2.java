package com.etsy.android.p327ui.user.purchases;

import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.user.AddToCartResponse;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.purchases.PurchaseClickEventHandler$buyThisAgain$1$2 */
final class PurchaseClickEventHandler$buyThisAgain$1$2 extends Lambda implements C19857l<AddToCartResponse, C19394m> {
    public final /* synthetic */ CartBadgeCountRepo $cartBadgeCountRepo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseClickEventHandler$buyThisAgain$1$2(CartBadgeCountRepo cartBadgeCountRepo) {
        super(1);
        this.$cartBadgeCountRepo = cartBadgeCountRepo;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AddToCartResponse) obj);
        return C19394m.f43287a;
    }

    public final void invoke(AddToCartResponse addToCartResponse) {
        C19394m mVar;
        Integer num = addToCartResponse.f24990a;
        if (num != null) {
            this.$cartBadgeCountRepo.mo31438c(num.intValue());
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            this.$cartBadgeCountRepo.mo31437b();
        }
    }
}
