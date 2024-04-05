package com.paypal.checkout.order;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class GetOrderResult {

    public static final class Error extends GetOrderResult {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String ERROR_MESSAGE_GET_ORDER_FAILED = "Get Order failed.";
        public static final String ERROR_REASON_CAPTURE_FAILED = "Get order response was not successful.";
        private final String message;
        private final String reason;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ERROR_MESSAGE_GET_ORDER_FAILED : str, str2);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final String component2() {
            return this.reason;
        }

        public final Error copy(String str, String str2) {
            C19383o.m32797g(str, "message");
            C19383o.m32797g(str2, "reason");
            return new Error(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return C19383o.m32792b(this.message, error.message) && C19383o.m32792b(this.reason, error.reason);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode() + (this.message.hashCode() * 31);
        }

        public String toString() {
            return C0048b.m164c("Error(message=", this.message, ", reason=", this.reason, ")");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "message");
            C19383o.m32797g(str2, "reason");
            this.message = str;
            this.reason = str2;
        }
    }

    public static final class Success extends GetOrderResult {
        private final OrderResponse orderResponse;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(OrderResponse orderResponse2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(orderResponse2, "orderResponse");
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
            C19383o.m32797g(orderResponse2, "orderResponse");
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
            return this.orderResponse.hashCode();
        }

        public String toString() {
            OrderResponse orderResponse2 = this.orderResponse;
            return "Success(orderResponse=" + orderResponse2 + ")";
        }
    }

    private GetOrderResult() {
    }

    public /* synthetic */ GetOrderResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
