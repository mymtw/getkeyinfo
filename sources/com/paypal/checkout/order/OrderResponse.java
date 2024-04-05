package com.paypal.checkout.order;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;
import p650pn.C18417a;

public final class OrderResponse {

    /* renamed from: id */
    private final String f37518id;
    @C18417a("payer")
    private final Payer payer;
    @C18417a("purchase_units")
    private final List<PurchaseUnit> purchaseUnits;
    private final OrderStatus status;

    public OrderResponse(String str, OrderStatus orderStatus, List<PurchaseUnit> list, Payer payer2) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(orderStatus, ResponseConstants.STATUS);
        C19383o.m32797g(list, "purchaseUnits");
        this.f37518id = str;
        this.status = orderStatus;
        this.purchaseUnits = list;
        this.payer = payer2;
    }

    public static /* synthetic */ OrderResponse copy$default(OrderResponse orderResponse, String str, OrderStatus orderStatus, List<PurchaseUnit> list, Payer payer2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderResponse.f37518id;
        }
        if ((i & 2) != 0) {
            orderStatus = orderResponse.status;
        }
        if ((i & 4) != 0) {
            list = orderResponse.purchaseUnits;
        }
        if ((i & 8) != 0) {
            payer2 = orderResponse.payer;
        }
        return orderResponse.copy(str, orderStatus, list, payer2);
    }

    public final String component1() {
        return this.f37518id;
    }

    public final OrderStatus component2() {
        return this.status;
    }

    public final List<PurchaseUnit> component3() {
        return this.purchaseUnits;
    }

    public final Payer component4() {
        return this.payer;
    }

    public final OrderResponse copy(String str, OrderStatus orderStatus, List<PurchaseUnit> list, Payer payer2) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(orderStatus, ResponseConstants.STATUS);
        C19383o.m32797g(list, "purchaseUnits");
        return new OrderResponse(str, orderStatus, list, payer2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderResponse)) {
            return false;
        }
        OrderResponse orderResponse = (OrderResponse) obj;
        return C19383o.m32792b(this.f37518id, orderResponse.f37518id) && this.status == orderResponse.status && C19383o.m32792b(this.purchaseUnits, orderResponse.purchaseUnits) && C19383o.m32792b(this.payer, orderResponse.payer);
    }

    public final String getId() {
        return this.f37518id;
    }

    public final Payer getPayer() {
        return this.payer;
    }

    public final List<PurchaseUnit> getPurchaseUnits() {
        return this.purchaseUnits;
    }

    public final OrderStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int g = C13983i.m21488g(this.purchaseUnits, (this.status.hashCode() + (this.f37518id.hashCode() * 31)) * 31, 31);
        Payer payer2 = this.payer;
        return g + (payer2 == null ? 0 : payer2.hashCode());
    }

    public String toString() {
        String str = this.f37518id;
        OrderStatus orderStatus = this.status;
        List<PurchaseUnit> list = this.purchaseUnits;
        Payer payer2 = this.payer;
        return "OrderResponse(id=" + str + ", status=" + orderStatus + ", purchaseUnits=" + list + ", payer=" + payer2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderResponse(String str, OrderStatus orderStatus, List list, Payer payer2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, orderStatus, list, (i & 8) != 0 ? null : payer2);
    }
}
