package com.paypal.pyplcheckout.flavorauth;

import androidx.fragment.app.Fragment;
import com.paypal.android.platform.authsdk.authcommon.p531ui.AuthPresenter;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.OtpErrorFragment;
import com.paypal.pyplcheckout.auth.p541ui.NativeAuthScreen;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class ThirdPartyAuthPresenter implements AuthPresenter {
    private C19846a<C19394m> dismissAuthFlow;
    private C19861p<? super Fragment, ? super Boolean, C19394m> dismissFragment;
    private C19857l<? super NativeAuthScreen, C19394m> loadFragment;
    private C19857l<? super Boolean, C19394m> loadingListener;

    public final void clearListeners() {
        this.loadFragment = null;
        this.dismissFragment = null;
        this.dismissAuthFlow = null;
    }

    public final void dismissAuthFlow() {
        C19846a<C19394m> aVar = this.dismissAuthFlow;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public void onLoaderStatusChanged(boolean z, Fragment fragment) {
        C19383o.m32797g(fragment, "fragment");
        C19857l<? super Boolean, C19394m> lVar = this.loadingListener;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    public void onViewDismissRequested(Fragment fragment, boolean z) {
        C19383o.m32797g(fragment, "fragment");
        C19861p<? super Fragment, ? super Boolean, C19394m> pVar = this.dismissFragment;
        if (pVar != null) {
            pVar.invoke(fragment, Boolean.valueOf(z));
        }
    }

    public void onViewPresentRequested(Fragment fragment, boolean z) {
        C19383o.m32797g(fragment, "fragment");
        boolean z2 = !(fragment instanceof OtpErrorFragment);
        C19857l<? super NativeAuthScreen, C19394m> lVar = this.loadFragment;
        if (lVar != null) {
            lVar.invoke(new NativeAuthScreen(fragment, z2));
        }
    }

    public final void setListeners(C19857l<? super NativeAuthScreen, C19394m> lVar, C19861p<? super Fragment, ? super Boolean, C19394m> pVar, C19846a<C19394m> aVar) {
        C19383o.m32797g(lVar, "loadFragment");
        C19383o.m32797g(pVar, "dismissFragment");
        C19383o.m32797g(aVar, "dismissAuthFlow");
        this.loadFragment = lVar;
        this.dismissFragment = pVar;
        this.dismissAuthFlow = aVar;
    }

    public final void setLoadingListener(C19857l<? super Boolean, C19394m> lVar) {
        C19383o.m32797g(lVar, "loadingListener");
        this.loadingListener = lVar;
    }
}
