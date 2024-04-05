package com.paypal.android.platform.authsdk.authcommon.p531ui;

import androidx.fragment.app.Fragment;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.PartnerHostNavigationController */
public interface PartnerHostNavigationController extends NavigationController {
    void dismiss(Fragment fragment, boolean z);

    void navigate(Fragment fragment, boolean z);
}
