package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class AddCardResponseData {
    @C18417a("addCard")
    private final CheckoutSession addCard;

    public AddCardResponseData(CheckoutSession checkoutSession) {
        this.addCard = checkoutSession;
    }

    public static /* synthetic */ AddCardResponseData copy$default(AddCardResponseData addCardResponseData, CheckoutSession checkoutSession, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutSession = addCardResponseData.addCard;
        }
        return addCardResponseData.copy(checkoutSession);
    }

    public final CheckoutSession component1() {
        return this.addCard;
    }

    public final AddCardResponseData copy(CheckoutSession checkoutSession) {
        return new AddCardResponseData(checkoutSession);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddCardResponseData) && C19383o.m32792b(this.addCard, ((AddCardResponseData) obj).addCard);
    }

    public final CheckoutSession getAddCard() {
        return this.addCard;
    }

    public int hashCode() {
        CheckoutSession checkoutSession = this.addCard;
        if (checkoutSession == null) {
            return 0;
        }
        return checkoutSession.hashCode();
    }

    public String toString() {
        CheckoutSession checkoutSession = this.addCard;
        return "AddCardResponseData(addCard=" + checkoutSession + ")";
    }
}
