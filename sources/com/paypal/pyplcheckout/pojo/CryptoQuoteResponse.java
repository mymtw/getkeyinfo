package com.paypal.pyplcheckout.pojo;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class CryptoQuoteResponse {
    @C18417a("data")
    private CryptoData data;
    @C18417a("errors")
    private List<Error> errors;

    public CryptoQuoteResponse(CryptoData cryptoData) {
        C19383o.m32797g(cryptoData, "data");
        this.data = cryptoData;
    }

    public final CryptoData getData() {
        return this.data;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final String getFirstError() {
        Error error;
        List<Error> list = this.errors;
        if (list == null || (error = list.get(0)) == null) {
            return null;
        }
        return error.getMessage();
    }

    public final boolean hasContingencyErrors() {
        List<Error> list = this.errors;
        if (list == null) {
            return false;
        }
        return ErrorKt.containsContingencies(list);
    }

    public final void setData(CryptoData cryptoData) {
        this.data = cryptoData;
    }

    public final void setErrors(List<Error> list) {
        this.errors = list;
    }
}
