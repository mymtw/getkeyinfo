package com.paypal.checkout.order;

import com.paypal.checkout.createorder.OrderIntent;
import com.paypal.checkout.createorder.ProcessingInstruction;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Order {
    @C18417a("application_context")
    private final AppContext appContext;
    private final OrderIntent intent;
    @C18417a("processing_instruction")
    private final ProcessingInstruction processingInstruction;
    @C18417a("purchase_units")
    private final List<PurchaseUnit> purchaseUnitList;

    public static final class Builder {
        private AppContext appContext;
        private OrderIntent intent;
        private ProcessingInstruction processingInstruction;
        private List<PurchaseUnit> purchaseUnitList;

        public final Builder appContext(AppContext appContext2) {
            this.appContext = appContext2;
            return this;
        }

        public final Order build() {
            OrderIntent orderIntent = this.intent;
            if (orderIntent != null) {
                AppContext appContext2 = this.appContext;
                List<PurchaseUnit> list = this.purchaseUnitList;
                if (list != null) {
                    return new Order(orderIntent, appContext2, list, this.processingInstruction);
                }
                C19383o.m32805o("purchaseUnitList");
                throw null;
            }
            C19383o.m32805o("intent");
            throw null;
        }

        public final Builder intent(OrderIntent orderIntent) {
            C19383o.m32797g(orderIntent, "intent");
            this.intent = orderIntent;
            return this;
        }

        public final Builder processingInstruction(ProcessingInstruction processingInstruction2) {
            this.processingInstruction = processingInstruction2;
            return this;
        }

        public final Builder purchaseUnitList(List<PurchaseUnit> list) {
            C19383o.m32797g(list, "purchaseUnitList");
            this.purchaseUnitList = list;
            return this;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Order(OrderIntent orderIntent, AppContext appContext2, List<PurchaseUnit> list) {
        this(orderIntent, appContext2, list, (ProcessingInstruction) null, 8, (DefaultConstructorMarker) null);
        C19383o.m32797g(orderIntent, "intent");
        C19383o.m32797g(list, "purchaseUnitList");
    }

    public Order(OrderIntent orderIntent, AppContext appContext2, List<PurchaseUnit> list, ProcessingInstruction processingInstruction2) {
        C19383o.m32797g(orderIntent, "intent");
        C19383o.m32797g(list, "purchaseUnitList");
        this.intent = orderIntent;
        this.appContext = appContext2;
        this.purchaseUnitList = list;
        this.processingInstruction = processingInstruction2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Order(OrderIntent orderIntent, List<PurchaseUnit> list) {
        this(orderIntent, (AppContext) null, list, (ProcessingInstruction) null, 10, (DefaultConstructorMarker) null);
        C19383o.m32797g(orderIntent, "intent");
        C19383o.m32797g(list, "purchaseUnitList");
    }

    public final AppContext getAppContext() {
        return this.appContext;
    }

    public final OrderIntent getIntent() {
        return this.intent;
    }

    public final ProcessingInstruction getProcessingInstruction() {
        return this.processingInstruction;
    }

    public final List<PurchaseUnit> getPurchaseUnitList() {
        return this.purchaseUnitList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Order(OrderIntent orderIntent, AppContext appContext2, List list, ProcessingInstruction processingInstruction2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderIntent, (i & 2) != 0 ? null : appContext2, list, (i & 8) != 0 ? null : processingInstruction2);
    }
}
