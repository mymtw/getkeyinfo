package com.paypal.pyplcheckout.threeds.usecase;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class AddCardThreeDsState {

    public static final class Error extends AddCardThreeDsState {
        private final Exception error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(Exception exc) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(exc, "error");
            this.error = exc;
        }

        public static /* synthetic */ Error copy$default(Error error2, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error2.error;
            }
            return error2.copy(exc);
        }

        public final Exception component1() {
            return this.error;
        }

        public final Error copy(Exception exc) {
            C19383o.m32797g(exc, "error");
            return new Error(exc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && C19383o.m32792b(this.error, ((Error) obj).error);
        }

        public final Exception getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            Exception exc = this.error;
            return "Error(error=" + exc + ")";
        }
    }

    public static final class Loading extends AddCardThreeDsState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class ResolvingThreeDs extends AddCardThreeDsState {
        public static final ResolvingThreeDs INSTANCE = new ResolvingThreeDs();

        private ResolvingThreeDs() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Success extends AddCardThreeDsState {
        public static final Success INSTANCE = new Success();

        private Success() {
            super((DefaultConstructorMarker) null);
        }
    }

    private AddCardThreeDsState() {
    }

    public /* synthetic */ AddCardThreeDsState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
