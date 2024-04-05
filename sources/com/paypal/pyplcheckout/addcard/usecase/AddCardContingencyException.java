package com.paypal.pyplcheckout.addcard.usecase;

import com.paypal.pyplcheckout.pojo.AddCardError;
import com.paypal.pyplcheckout.services.ApiErrorException;

public final class AddCardContingencyException extends ApiErrorException {
    private final AddCardError error;
    private final String fundingInstrumentId;

    public AddCardContingencyException(String str, AddCardError addCardError) {
        super("AddCard3DSError: " + addCardError);
        this.fundingInstrumentId = str;
        this.error = addCardError;
    }

    public final AddCardError getError() {
        return this.error;
    }

    public final String getFundingInstrumentId() {
        return this.fundingInstrumentId;
    }
}
