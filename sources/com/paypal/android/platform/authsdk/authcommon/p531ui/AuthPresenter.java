package com.paypal.android.platform.authsdk.authcommon.p531ui;

import androidx.fragment.app.Fragment;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.AuthPresenter */
public interface AuthPresenter {
    void onLoaderStatusChanged(boolean z, Fragment fragment);

    void onViewDismissRequested(Fragment fragment, boolean z);

    void onViewPresentRequested(Fragment fragment, boolean z);
}
