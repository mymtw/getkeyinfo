package com.paypal.pyplcheckout.threeds;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class ThreeDsException extends RuntimeException {
    private final ThreeDsExceptionData extras;

    public static final class ThreeDSAuthenticateException extends ThreeDsException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ThreeDSAuthenticateException(ThreeDsExceptionData threeDsExceptionData) {
            super(threeDsExceptionData, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDsExceptionData, "extras");
        }
    }

    public static final class ThreeDSCardinalStepUpFailure extends ThreeDsException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ThreeDSCardinalStepUpFailure(ThreeDsExceptionData threeDsExceptionData) {
            super(threeDsExceptionData, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDsExceptionData, "extras");
        }
    }

    public static final class ThreeDSJwtException extends ThreeDsException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ThreeDSJwtException(ThreeDsExceptionData threeDsExceptionData) {
            super(threeDsExceptionData, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDsExceptionData, "extras");
        }
    }

    public static final class ThreeDSLookUpException extends ThreeDsException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ThreeDSLookUpException(ThreeDsExceptionData threeDsExceptionData) {
            super(threeDsExceptionData, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDsExceptionData, "extras");
        }
    }

    public static final class ThreeDSResolveContingencyException extends ThreeDsException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ThreeDSResolveContingencyException(ThreeDsExceptionData threeDsExceptionData) {
            super(threeDsExceptionData, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDsExceptionData, "extras");
        }
    }

    public static final class ThreeDSUnsupportedFlowException extends ThreeDsException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ThreeDSUnsupportedFlowException(ThreeDsExceptionData threeDsExceptionData) {
            super(threeDsExceptionData, (DefaultConstructorMarker) null);
            C19383o.m32797g(threeDsExceptionData, "extras");
        }
    }

    private ThreeDsException(ThreeDsExceptionData threeDsExceptionData) {
        this.extras = threeDsExceptionData;
    }

    public /* synthetic */ ThreeDsException(ThreeDsExceptionData threeDsExceptionData, DefaultConstructorMarker defaultConstructorMarker) {
        this(threeDsExceptionData);
    }

    public final ThreeDsExceptionData getExtras() {
        return this.extras;
    }
}
