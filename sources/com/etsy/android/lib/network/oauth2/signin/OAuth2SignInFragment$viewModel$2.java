package com.etsy.android.lib.network.oauth2.signin;

import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class OAuth2SignInFragment$viewModel$2 extends Lambda implements C19846a<OAuth2SignInViewModel> {
    public final /* synthetic */ OAuth2SignInFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OAuth2SignInFragment$viewModel$2(OAuth2SignInFragment oAuth2SignInFragment) {
        super(0);
        this.this$0 = oAuth2SignInFragment;
    }

    public final OAuth2SignInViewModel invoke() {
        OAuth2SignInFragment oAuth2SignInFragment = this.this$0;
        return (OAuth2SignInViewModel) new C2870k0((C2880m0) oAuth2SignInFragment, (C2870k0.C2872b) oAuth2SignInFragment.getViewModelFactory()).mo10829a(OAuth2SignInViewModel.class);
    }
}
