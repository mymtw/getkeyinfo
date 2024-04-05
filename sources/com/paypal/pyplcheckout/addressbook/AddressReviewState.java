package com.paypal.pyplcheckout.addressbook;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class AddressReviewState {

    public static final class Loading extends AddressReviewState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class ShowAddressSuccess extends AddressReviewState {
        public static final ShowAddressSuccess INSTANCE = new ShowAddressSuccess();

        private ShowAddressSuccess() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class ShowAddressSuggestion extends AddressReviewState {
        public static final ShowAddressSuggestion INSTANCE = new ShowAddressSuggestion();

        private ShowAddressSuggestion() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class ShowError extends AddressReviewState {
        private final int errorMessage;
        private final Exception exception;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShowError(int i, Exception exc) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(exc, "exception");
            this.errorMessage = i;
            this.exception = exc;
        }

        public static /* synthetic */ ShowError copy$default(ShowError showError, int i, Exception exc, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showError.errorMessage;
            }
            if ((i2 & 2) != 0) {
                exc = showError.exception;
            }
            return showError.copy(i, exc);
        }

        public final int component1() {
            return this.errorMessage;
        }

        public final Exception component2() {
            return this.exception;
        }

        public final ShowError copy(int i, Exception exc) {
            C19383o.m32797g(exc, "exception");
            return new ShowError(i, exc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) obj;
            return this.errorMessage == showError.errorMessage && C19383o.m32792b(this.exception, showError.exception);
        }

        public final int getErrorMessage() {
            return this.errorMessage;
        }

        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode() + (Integer.hashCode(this.errorMessage) * 31);
        }

        public String toString() {
            int i = this.errorMessage;
            Exception exc = this.exception;
            return "ShowError(errorMessage=" + i + ", exception=" + exc + ")";
        }
    }

    private AddressReviewState() {
    }

    public /* synthetic */ AddressReviewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
