package com.paypal.checkout.shipping;

import com.paypal.checkout.order.actions.OnPatchComplete;
import kotlin.C19394m;
import p753kq.C19846a;

public final class ShippingChangeActions$patchOrder$1 implements OnPatchComplete {
    public final /* synthetic */ C19846a<C19394m> $onComplete;

    public ShippingChangeActions$patchOrder$1(C19846a<C19394m> aVar) {
        this.$onComplete = aVar;
    }

    public void onPatchComplete() {
        this.$onComplete.invoke();
    }
}
