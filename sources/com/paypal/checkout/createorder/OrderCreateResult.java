package com.paypal.checkout.createorder;

import com.paypal.pyplcheckout.exception.PYPLException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class OrderCreateResult {

    public static final class Error extends OrderCreateResult {
        private final PYPLException exception;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(PYPLException pYPLException) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(pYPLException, "exception");
            this.exception = pYPLException;
        }

        public static /* synthetic */ Error copy$default(Error error, PYPLException pYPLException, int i, Object obj) {
            if ((i & 1) != 0) {
                pYPLException = error.exception;
            }
            return error.copy(pYPLException);
        }

        public final PYPLException component1() {
            return this.exception;
        }

        public final Error copy(PYPLException pYPLException) {
            C19383o.m32797g(pYPLException, "exception");
            return new Error(pYPLException);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && C19383o.m32792b(this.exception, ((Error) obj).exception);
        }

        public final PYPLException getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            PYPLException pYPLException = this.exception;
            return "Error(exception=" + pYPLException + ")";
        }
    }

    public static final class Success extends OrderCreateResult {
        private final String orderId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "orderId");
            this.orderId = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.orderId;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.orderId;
        }

        public final Success copy(String str) {
            C19383o.m32797g(str, "orderId");
            return new Success(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C19383o.m32792b(this.orderId, ((Success) obj).orderId);
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public int hashCode() {
            return this.orderId.hashCode();
        }

        public String toString() {
            return C0048b.m163a("Success(orderId=", this.orderId, ")");
        }
    }

    private OrderCreateResult() {
    }

    public /* synthetic */ OrderCreateResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
