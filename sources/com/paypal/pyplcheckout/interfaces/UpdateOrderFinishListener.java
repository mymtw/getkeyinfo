package com.paypal.pyplcheckout.interfaces;

import com.paypal.pyplcheckout.exception.PYPLException;

public interface UpdateOrderFinishListener {
    void onFailure(PYPLException pYPLException);

    void onSuccess(String str);
}
