package com.paypal.pyplcheckout.common.firebase.firebasemodels;

public interface FirebaseRequestModel extends FirebaseModel {
    String getRequestId();

    void setRequestId(String str);
}
