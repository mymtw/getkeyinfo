package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.text.Editable;
import android.text.TextWatcher;
import com.appboy.Constants;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.C19383o;

public final class PayPalNewShippingAddressReviewView$addTextWatcher$1 implements TextWatcher {
    public final /* synthetic */ TextInputLayout $layout;

    public PayPalNewShippingAddressReviewView$addTextWatcher$1(TextInputLayout textInputLayout) {
        this.$layout = textInputLayout;
    }

    public void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout;
        C19383o.m32797g(editable, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        if ((editable.length() > 0) && (textInputLayout = this.$layout) != null) {
            textInputLayout.setError((CharSequence) null);
            this.$layout.setErrorEnabled(false);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C19383o.m32797g(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C19383o.m32797g(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }
}
