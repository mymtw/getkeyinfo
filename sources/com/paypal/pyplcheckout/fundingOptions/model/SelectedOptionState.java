package com.paypal.pyplcheckout.fundingOptions.model;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.pojo.FundingOption;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public abstract class SelectedOptionState {

    public static final class AddCard extends SelectedOptionState {
        private final boolean isNative;

        public AddCard(boolean z) {
            super((DefaultConstructorMarker) null);
            this.isNative = z;
        }

        public static /* synthetic */ AddCard copy$default(AddCard addCard, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = addCard.isNative;
            }
            return addCard.copy(z);
        }

        public final boolean component1() {
            return this.isNative;
        }

        public final AddCard copy(boolean z) {
            return new AddCard(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddCard) && this.isNative == ((AddCard) obj).isNative;
        }

        public int hashCode() {
            boolean z = this.isNative;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isNative() {
            return this.isNative;
        }

        public String toString() {
            boolean z = this.isNative;
            return "AddCard(isNative=" + z + ")";
        }
    }

    public static final class Crypto extends SelectedOptionState {
        private final FundingOption fundingOption;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Crypto(FundingOption fundingOption2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(fundingOption2, "fundingOption");
            this.fundingOption = fundingOption2;
        }

        public static /* synthetic */ Crypto copy$default(Crypto crypto, FundingOption fundingOption2, int i, Object obj) {
            if ((i & 1) != 0) {
                fundingOption2 = crypto.fundingOption;
            }
            return crypto.copy(fundingOption2);
        }

        public final FundingOption component1() {
            return this.fundingOption;
        }

        public final Crypto copy(FundingOption fundingOption2) {
            C19383o.m32797g(fundingOption2, "fundingOption");
            return new Crypto(fundingOption2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Crypto) && C19383o.m32792b(this.fundingOption, ((Crypto) obj).fundingOption);
        }

        public final FundingOption getFundingOption() {
            return this.fundingOption;
        }

        public int hashCode() {
            return this.fundingOption.hashCode();
        }

        public String toString() {
            FundingOption fundingOption2 = this.fundingOption;
            return "Crypto(fundingOption=" + fundingOption2 + ")";
        }
    }

    public static final class None extends SelectedOptionState {
        public static final None INSTANCE = new None();

        private None() {
            super((DefaultConstructorMarker) null);
        }
    }

    public static final class PayPalBalance extends SelectedOptionState {
        private final FundingOption fundingOption;
        private final String label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PayPalBalance(FundingOption fundingOption2, String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(fundingOption2, "fundingOption");
            C19383o.m32797g(str, ResponseConstants.LABEL);
            this.fundingOption = fundingOption2;
            this.label = str;
        }

        public static /* synthetic */ PayPalBalance copy$default(PayPalBalance payPalBalance, FundingOption fundingOption2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                fundingOption2 = payPalBalance.fundingOption;
            }
            if ((i & 2) != 0) {
                str = payPalBalance.label;
            }
            return payPalBalance.copy(fundingOption2, str);
        }

        public final FundingOption component1() {
            return this.fundingOption;
        }

        public final String component2() {
            return this.label;
        }

        public final PayPalBalance copy(FundingOption fundingOption2, String str) {
            C19383o.m32797g(fundingOption2, "fundingOption");
            C19383o.m32797g(str, ResponseConstants.LABEL);
            return new PayPalBalance(fundingOption2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayPalBalance)) {
                return false;
            }
            PayPalBalance payPalBalance = (PayPalBalance) obj;
            return C19383o.m32792b(this.fundingOption, payPalBalance.fundingOption) && C19383o.m32792b(this.label, payPalBalance.label);
        }

        public final FundingOption getFundingOption() {
            return this.fundingOption;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + (this.fundingOption.hashCode() * 31);
        }

        public String toString() {
            FundingOption fundingOption2 = this.fundingOption;
            String str = this.label;
            return "PayPalBalance(fundingOption=" + fundingOption2 + ", label=" + str + ")";
        }
    }

    public static final class PaymentSource extends SelectedOptionState {
        private final FundingOption fundingOption;
        private final String label;
        private final String lastDigits;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PaymentSource(FundingOption fundingOption2, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(fundingOption2, "fundingOption");
            C19383o.m32797g(str, ResponseConstants.LABEL);
            C19383o.m32797g(str2, "lastDigits");
            this.fundingOption = fundingOption2;
            this.label = str;
            this.lastDigits = str2;
        }

        public static /* synthetic */ PaymentSource copy$default(PaymentSource paymentSource, FundingOption fundingOption2, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                fundingOption2 = paymentSource.fundingOption;
            }
            if ((i & 2) != 0) {
                str = paymentSource.label;
            }
            if ((i & 4) != 0) {
                str2 = paymentSource.lastDigits;
            }
            return paymentSource.copy(fundingOption2, str, str2);
        }

        public final FundingOption component1() {
            return this.fundingOption;
        }

        public final String component2() {
            return this.label;
        }

        public final String component3() {
            return this.lastDigits;
        }

        public final PaymentSource copy(FundingOption fundingOption2, String str, String str2) {
            C19383o.m32797g(fundingOption2, "fundingOption");
            C19383o.m32797g(str, ResponseConstants.LABEL);
            C19383o.m32797g(str2, "lastDigits");
            return new PaymentSource(fundingOption2, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentSource)) {
                return false;
            }
            PaymentSource paymentSource = (PaymentSource) obj;
            return C19383o.m32792b(this.fundingOption, paymentSource.fundingOption) && C19383o.m32792b(this.label, paymentSource.label) && C19383o.m32792b(this.lastDigits, paymentSource.lastDigits);
        }

        public final FundingOption getFundingOption() {
            return this.fundingOption;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getLastDigits() {
            return this.lastDigits;
        }

        public int hashCode() {
            return this.lastDigits.hashCode() + C0023f.m105e(this.label, this.fundingOption.hashCode() * 31, 31);
        }

        public String toString() {
            FundingOption fundingOption2 = this.fundingOption;
            String str = this.label;
            String str2 = this.lastDigits;
            StringBuilder sb = new StringBuilder();
            sb.append("PaymentSource(fundingOption=");
            sb.append(fundingOption2);
            sb.append(", label=");
            sb.append(str);
            sb.append(", lastDigits=");
            return C0023f.m110k(sb, str2, ")");
        }
    }

    private SelectedOptionState() {
    }

    public /* synthetic */ SelectedOptionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class CreditsOffer extends SelectedOptionState {
        private final Type type;

        public enum Type {
            CREDIT,
            PAY_LATER
        }

        public CreditsOffer() {
            this((Type) null, 1, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CreditsOffer(Type type2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Type.CREDIT : type2);
        }

        public static /* synthetic */ CreditsOffer copy$default(CreditsOffer creditsOffer, Type type2, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = creditsOffer.type;
            }
            return creditsOffer.copy(type2);
        }

        public final Type component1() {
            return this.type;
        }

        public final CreditsOffer copy(Type type2) {
            C19383o.m32797g(type2, "type");
            return new CreditsOffer(type2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CreditsOffer) && this.type == ((CreditsOffer) obj).type;
        }

        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            Type type2 = this.type;
            return "CreditsOffer(type=" + type2 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CreditsOffer(Type type2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(type2, "type");
            this.type = type2;
        }
    }
}
