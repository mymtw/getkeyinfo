package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$setUpViewsAction$$inlined$doAfterTextChanged$1 */
public final class C17107x67207e08 implements TextWatcher {
    public final /* synthetic */ SplitLoginFragment this$0;

    public C17107x67207e08(SplitLoginFragment splitLoginFragment) {
        this.this$0 = splitLoginFragment;
    }

    public void afterTextChanged(Editable editable) {
        this.this$0.getViewModel().getEmailEditText().set(String.valueOf(editable));
        this.this$0.getViewModel().onEmailTextChanged();
        this.this$0.updateErrorView();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
