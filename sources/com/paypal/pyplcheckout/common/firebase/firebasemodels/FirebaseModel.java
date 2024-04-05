package com.paypal.pyplcheckout.common.firebase.firebasemodels;

public interface FirebaseModel {
    String getJsonMessage();

    String getMessageId();

    void setJsonMessage(String str);

    void setMessageId(String str);
}
