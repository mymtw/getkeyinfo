package com.paypal.pyplcheckout.utils;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class ReturnToProviderOperationType {

    public static final class Cancel extends ReturnToProviderOperationType {
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
            super((DefaultConstructorMarker) null);
        }

        public String toString() {
            return "cancel";
        }
    }

    public static final class Payment extends ReturnToProviderOperationType {
        public static final Payment INSTANCE = new Payment();

        private Payment() {
            super((DefaultConstructorMarker) null);
        }

        public String toString() {
            return ResponseConstants.PAYMENT;
        }
    }

    private ReturnToProviderOperationType() {
    }

    public /* synthetic */ ReturnToProviderOperationType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Failure extends ReturnToProviderOperationType {
        private final PEnums.EventCode errorCode;
        private final ErrorReason errorReason;
        private final Exception exception;
        private final boolean invokeOnErrorCallback;
        private final PEnums.StateName stateName;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Failure(Exception exc, PEnums.EventCode eventCode, ErrorReason errorReason2, PEnums.StateName stateName2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(exc, eventCode, (i & 4) != 0 ? ErrorReason.NONE : errorReason2, (i & 8) != 0 ? PEnums.StateName.NONE : stateName2, (i & 16) != 0 ? true : z);
        }

        public final PEnums.EventCode getErrorCode() {
            return this.errorCode;
        }

        public final ErrorReason getErrorReason() {
            return this.errorReason;
        }

        public final Exception getException() {
            return this.exception;
        }

        public final boolean getInvokeOnErrorCallback() {
            return this.invokeOnErrorCallback;
        }

        public final PEnums.StateName getStateName() {
            return this.stateName;
        }

        public String toString() {
            return EventsNameKt.FAILED;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(Exception exc, PEnums.EventCode eventCode, ErrorReason errorReason2, PEnums.StateName stateName2, boolean z) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(exc, "exception");
            C19383o.m32797g(eventCode, "errorCode");
            C19383o.m32797g(errorReason2, "errorReason");
            C19383o.m32797g(stateName2, "stateName");
            this.exception = exc;
            this.errorCode = eventCode;
            this.errorReason = errorReason2;
            this.stateName = stateName2;
            this.invokeOnErrorCallback = z;
        }
    }
}
