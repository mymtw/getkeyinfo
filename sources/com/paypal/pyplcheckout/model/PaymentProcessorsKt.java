package com.paypal.pyplcheckout.model;

import com.paypal.pyplcheckout.pojo.CardIssuerType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

public final class PaymentProcessorsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentProcessors.values().length];
            iArr[PaymentProcessors.VISA.ordinal()] = 1;
            iArr[PaymentProcessors.MASTERCARD.ordinal()] = 2;
            iArr[PaymentProcessors.AMEX.ordinal()] = 3;
            iArr[PaymentProcessors.DISCOVER.ordinal()] = 4;
            iArr[PaymentProcessors.DINERSCLUB.ordinal()] = 5;
            iArr[PaymentProcessors.CHINAUNIONPAY.ordinal()] = 6;
            iArr[PaymentProcessors.NOTFOUND.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CardIssuerType getCardIssuerType(PaymentProcessors paymentProcessors) {
        C19383o.m32797g(paymentProcessors, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[paymentProcessors.ordinal()]) {
            case 1:
                return CardIssuerType.VISA;
            case 2:
                return CardIssuerType.MASTER_CARD;
            case 3:
                return CardIssuerType.AMEX;
            case 4:
                return CardIssuerType.DISCOVER;
            case 5:
                return CardIssuerType.DINERS;
            case 6:
                return CardIssuerType.CHINA_UNION_PAY;
            case 7:
                return CardIssuerType.UNSUPPORTED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
