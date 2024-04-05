package com.paypal.checkout.paymentbutton;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class PaymentButtonEligibilityStatus {

    public static final class Eligible extends PaymentButtonEligibilityStatus {
        public static final Eligible INSTANCE = new Eligible();

        private Eligible() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Error extends PaymentButtonEligibilityStatus {
        public static final Error INSTANCE = new Error();

        private Error() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Ineligible extends PaymentButtonEligibilityStatus {
        public static final Ineligible INSTANCE = new Ineligible();

        private Ineligible() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class Loading extends PaymentButtonEligibilityStatus {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super((DefaultConstructorMarker) null);
        }
    }

    private PaymentButtonEligibilityStatus() {
    }

    public /* synthetic */ PaymentButtonEligibilityStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
