package com.etsy.android.p327ui.login;

import android.text.Editable;
import android.text.TextWatcher;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: com.etsy.android.ui.login.ThirdPartySignInFragment$onViewCreated$7 */
public final class ThirdPartySignInFragment$onViewCreated$7 implements TextWatcher {
    public final /* synthetic */ ThirdPartySignInFragment this$0;

    public ThirdPartySignInFragment$onViewCreated$7(ThirdPartySignInFragment thirdPartySignInFragment) {
        this.this$0 = thirdPartySignInFragment;
    }

    public void afterTextChanged(Editable editable) {
        C19383o.m32797g(editable, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C19383o.m32797g(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C19383o.m32797g(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        this.this$0.getSignInButton().setEnabled(!C19457k.m33020X0(charSequence));
    }
}
