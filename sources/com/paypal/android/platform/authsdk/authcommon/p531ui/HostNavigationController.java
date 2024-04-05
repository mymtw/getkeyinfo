package com.paypal.android.platform.authsdk.authcommon.p531ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.reflect.C19400c;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.HostNavigationController */
public interface HostNavigationController extends NavigationController {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.HostNavigationController$Companion */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String WEB_SCREEN_PRESENT = "web-screen-present";

        private Companion() {
        }

        public final String getWEB_SCREEN_PRESENT() {
            return WEB_SCREEN_PRESENT;
        }
    }

    void dismiss();

    String getCurrentFragmentTag();

    void navigate(C19400c<? extends Fragment> cVar, Bundle bundle);

    void popBackStack();

    void popBackStackByTag(String str);
}
