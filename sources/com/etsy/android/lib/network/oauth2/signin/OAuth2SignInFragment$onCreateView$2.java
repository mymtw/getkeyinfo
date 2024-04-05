package com.etsy.android.lib.network.oauth2.signin;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

public final class OAuth2SignInFragment$onCreateView$2 extends TrackingOnClickListener {
    public final /* synthetic */ OAuth2SignInFragment this$0;

    public OAuth2SignInFragment$onCreateView$2(OAuth2SignInFragment oAuth2SignInFragment) {
        this.this$0 = oAuth2SignInFragment;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "view");
        this.this$0.loadWebView();
    }
}
