package com.paypal.pyplcheckout.sca;

public interface ScaUiListener {
    void onCancelled();

    void onContingencyCleared();

    void onProgress();

    void onStrongAuthenticationComplete();
}
