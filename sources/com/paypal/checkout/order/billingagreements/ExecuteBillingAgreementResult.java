package com.paypal.checkout.order.billingagreements;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public abstract class ExecuteBillingAgreementResult {

    public static final class Error extends ExecuteBillingAgreementResult {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String DEFAULT_ERROR_MESSAGE = "Execute BA token has failed";
        public static final String ERROR_REASON_BA_ID_FAILED = "Execute BA token response was not successful.";
        public static final String ERROR_REASON_EMPTY_RESPONSE = "Empty response while trying to fetch BA-ID";
        public static final String ERROR_REASON_LSAT_UPGRADE_FAILED = "LSAT failed while executing BA token.";
        public static final String ERROR_REASON_NULL_BA_TOKEN = "No Billing Token when trying to execute billing agreement";
        private final String errorMessage;
        private final String reason;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "reason");
            this.reason = str;
            this.errorMessage = str2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.reason;
            }
            if ((i & 2) != 0) {
                str2 = error.errorMessage;
            }
            return error.copy(str, str2);
        }

        public final String component1() {
            return this.reason;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final Error copy(String str, String str2) {
            C19383o.m32797g(str, "reason");
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
            return C19383o.m32792b(this.reason, error.reason) && C19383o.m32792b(this.errorMessage, error.errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.errorMessage;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return C0048b.m164c("Error(reason=", this.reason, ", errorMessage=", this.errorMessage, ")");
        }
    }

    public static final class Success extends ExecuteBillingAgreementResult {
        private final String billingId;
        private final String status;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "billingId");
            C19383o.m32797g(str2, ResponseConstants.STATUS);
            this.billingId = str;
            this.status = str2;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.billingId;
            }
            if ((i & 2) != 0) {
                str2 = success.status;
            }
            return success.copy(str, str2);
        }

        public final String component1() {
            return this.billingId;
        }

        public final String component2() {
            return this.status;
        }

        public final Success copy(String str, String str2) {
            C19383o.m32797g(str, "billingId");
            C19383o.m32797g(str2, ResponseConstants.STATUS);
            return new Success(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return C19383o.m32792b(this.billingId, success.billingId) && C19383o.m32792b(this.status, success.status);
        }

        public final String getBillingId() {
            return this.billingId;
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode() + (this.billingId.hashCode() * 31);
        }

        public String toString() {
            return C0048b.m164c("Success(billingId=", this.billingId, ", status=", this.status, ")");
        }
    }

    private ExecuteBillingAgreementResult() {
    }

    public /* synthetic */ ExecuteBillingAgreementResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
