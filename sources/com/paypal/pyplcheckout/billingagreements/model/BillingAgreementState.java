package com.paypal.pyplcheckout.billingagreements.model;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class BillingAgreementState {

    public static final class SupportedState extends BillingAgreementState {
        private final BillingAgreementType type;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SupportedState(BillingAgreementType billingAgreementType) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(billingAgreementType, "type");
            this.type = billingAgreementType;
        }

        public static /* synthetic */ SupportedState copy$default(SupportedState supportedState, BillingAgreementType billingAgreementType, int i, Object obj) {
            if ((i & 1) != 0) {
                billingAgreementType = supportedState.type;
            }
            return supportedState.copy(billingAgreementType);
        }

        public final BillingAgreementType component1() {
            return this.type;
        }

        public final SupportedState copy(BillingAgreementType billingAgreementType) {
            C19383o.m32797g(billingAgreementType, "type");
            return new SupportedState(billingAgreementType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SupportedState) && this.type == ((SupportedState) obj).type;
        }

        public final BillingAgreementType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            BillingAgreementType billingAgreementType = this.type;
            return "SupportedState(type=" + billingAgreementType + ")";
        }
    }

    public static final class UnsupportedState extends BillingAgreementState {
        public static final UnsupportedState INSTANCE = new UnsupportedState();

        private UnsupportedState() {
            super((DefaultConstructorMarker) null);
        }
    }

    private BillingAgreementState() {
    }

    public /* synthetic */ BillingAgreementState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
