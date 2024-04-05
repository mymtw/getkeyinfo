package com.etsy.android.stylekit.views;

import android.view.View;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginFragment;
import com.paypal.pyplcheckout.auth.p541ui.NativeAuthParentFragment;
import p726zi.C18917l;

/* renamed from: com.etsy.android.stylekit.views.e */
public final /* synthetic */ class C9054e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19927b;

    /* renamed from: c */
    public final /* synthetic */ Object f19928c;

    public /* synthetic */ C9054e(Object obj, int i) {
        this.f19927b = i;
        this.f19928c = obj;
    }

    public final void onClick(View view) {
        switch (this.f19927b) {
            case 0:
                CollageContentToggle.m34885setPopOut$lambda2((CollageContentToggle) this.f19928c, view);
                return;
            case 1:
                CollageTypeAhead.m34904setSmall$lambda1((CollageTypeAhead) this.f19928c, view);
                return;
            case 2:
                HomePagerFragment.m35002onCreateView$lambda2((HomePagerFragment) this.f19928c, view);
                return;
            case 3:
                ThirdPartySignInFragment.m35020onViewCreated$lambda7((ThirdPartySignInFragment) this.f19928c, view);
                return;
            case 4:
                C18917l.m32011a((C18917l) this.f19928c, view);
                return;
            case 5:
                SplitLoginFragment.m35142setUpViewsAction$lambda6((SplitLoginFragment) this.f19928c, view);
                return;
            default:
                NativeAuthParentFragment.m35213onViewCreated$lambda1((NativeAuthParentFragment) this.f19928c, view);
                return;
        }
    }
}
