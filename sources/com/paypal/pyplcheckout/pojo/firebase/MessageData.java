package com.paypal.pyplcheckout.pojo.firebase;

public interface MessageData {
    String getBillingToken();

    String getButtonSessionId();

    String getMessage();

    String getOpType();

    String getOrderId();

    String getPayerId();

    String getPaymentId();

    String getToken();

    void setBillingToken(String str);

    void setButtonSessionId(String str);

    void setMessage(String str);

    void setOpType(String str);

    void setOrderId(String str);

    void setPayerId(String str);

    void setPaymentId(String str);

    void setToken(String str);
}
