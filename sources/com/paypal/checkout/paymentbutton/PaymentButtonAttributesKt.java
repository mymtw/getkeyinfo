package com.paypal.checkout.paymentbutton;

import kotlin.jvm.internal.C19383o;

public final class PaymentButtonAttributesKt {
    public static final IllegalArgumentException createFormattedIllegalArgumentException(String str, int i) {
        C19383o.m32797g(str, "enumName");
        StringBuilder sb = new StringBuilder();
        sb.append("Attempted to create a ");
        sb.append(str);
        sb.append(" with an invalid index. Please use an index that is between 0 and ");
        sb.append(i - 1);
        sb.append(" and try again.");
        return new IllegalArgumentException(sb.toString());
    }
}
