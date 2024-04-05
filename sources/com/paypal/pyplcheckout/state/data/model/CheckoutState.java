package com.paypal.pyplcheckout.state.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class CheckoutState {

    public static final class PostApprove extends CheckoutState {
        public static final PostApprove INSTANCE = new PostApprove();

        private PostApprove() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class PostReview extends CheckoutState {
        public static final PostReview INSTANCE = new PostReview();

        private PostReview() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class PreApprove extends CheckoutState {
        public static final PreApprove INSTANCE = new PreApprove();

        private PreApprove() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class PreReview extends CheckoutState {
        public static final PreReview INSTANCE = new PreReview();

        private PreReview() {
            super((DefaultConstructorMarker) null);
        }
    }

    private CheckoutState() {
    }

    public /* synthetic */ CheckoutState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
