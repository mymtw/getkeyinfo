package com.paypal.checkout.order.patch;

import java.util.List;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;

public final class PatchOrderRequest {
    private final List<OrderUpdate> orderUpdates;

    public PatchOrderRequest(List<? extends OrderUpdate> list) {
        C19383o.m32797g(list, "orderUpdates");
        this.orderUpdates = list;
    }

    public static /* synthetic */ PatchOrderRequest copy$default(PatchOrderRequest patchOrderRequest, List<OrderUpdate> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = patchOrderRequest.orderUpdates;
        }
        return patchOrderRequest.copy(list);
    }

    public final List<OrderUpdate> component1() {
        return this.orderUpdates;
    }

    public final PatchOrderRequest copy(List<? extends OrderUpdate> list) {
        C19383o.m32797g(list, "orderUpdates");
        return new PatchOrderRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PatchOrderRequest) && C19383o.m32792b(this.orderUpdates, ((PatchOrderRequest) obj).orderUpdates);
    }

    public final List<OrderUpdate> getOrderUpdates() {
        return this.orderUpdates;
    }

    public int hashCode() {
        return this.orderUpdates.hashCode();
    }

    public String toString() {
        List<OrderUpdate> list = this.orderUpdates;
        return "PatchOrderRequest(orderUpdates=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PatchOrderRequest(OrderUpdate... orderUpdateArr) {
        this((List<? extends OrderUpdate>) C19318k.m32599Q0(orderUpdateArr));
        C19383o.m32797g(orderUpdateArr, "orderUpdate");
    }
}
