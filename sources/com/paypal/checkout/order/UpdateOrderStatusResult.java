package com.paypal.checkout.order;

import android.support.p013v4.media.C0069a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class UpdateOrderStatusResult {

    public static abstract class Error extends UpdateOrderStatusResult {

        public static final class InvalidUpdateOrderRequest extends Error {
            public static final InvalidUpdateOrderRequest INSTANCE = new InvalidUpdateOrderRequest();

            private InvalidUpdateOrderRequest() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class LsatTokenUpgradeError extends Error {
            public static final LsatTokenUpgradeError INSTANCE = new LsatTokenUpgradeError();

            private LsatTokenUpgradeError() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class UpdateOrderStatusError extends Error {
            private final int responseCode;

            public UpdateOrderStatusError(int i) {
                super((DefaultConstructorMarker) null);
                this.responseCode = i;
            }

            public static /* synthetic */ UpdateOrderStatusError copy$default(UpdateOrderStatusError updateOrderStatusError, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = updateOrderStatusError.responseCode;
                }
                return updateOrderStatusError.copy(i);
            }

            public final int component1() {
                return this.responseCode;
            }

            public final UpdateOrderStatusError copy(int i) {
                return new UpdateOrderStatusError(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateOrderStatusError) && this.responseCode == ((UpdateOrderStatusError) obj).responseCode;
            }

            public final int getResponseCode() {
                return this.responseCode;
            }

            public int hashCode() {
                return Integer.hashCode(this.responseCode);
            }

            public String toString() {
                return C0069a.m175f("UpdateOrderStatusError(responseCode=", this.responseCode, ")");
            }
        }

        private Error() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class Success extends UpdateOrderStatusResult {
        private final OrderResponse orderResponse;

        public Success(OrderResponse orderResponse2) {
            super((DefaultConstructorMarker) null);
            this.orderResponse = orderResponse2;
        }

        public static /* synthetic */ Success copy$default(Success success, OrderResponse orderResponse2, int i, Object obj) {
            if ((i & 1) != 0) {
                orderResponse2 = success.orderResponse;
            }
            return success.copy(orderResponse2);
        }

        public final OrderResponse component1() {
            return this.orderResponse;
        }

        public final Success copy(OrderResponse orderResponse2) {
            return new Success(orderResponse2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C19383o.m32792b(this.orderResponse, ((Success) obj).orderResponse);
        }

        public final OrderResponse getOrderResponse() {
            return this.orderResponse;
        }

        public int hashCode() {
            OrderResponse orderResponse2 = this.orderResponse;
            if (orderResponse2 == null) {
                return 0;
            }
            return orderResponse2.hashCode();
        }

        public String toString() {
            OrderResponse orderResponse2 = this.orderResponse;
            return "Success(orderResponse=" + orderResponse2 + ")";
        }
    }

    private UpdateOrderStatusResult() {
    }

    public /* synthetic */ UpdateOrderStatusResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
