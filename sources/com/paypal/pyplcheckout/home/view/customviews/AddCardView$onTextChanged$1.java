package com.paypal.pyplcheckout.home.view.customviews;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.C19394m;
import p753kq.C19863r;

public final class AddCardView$onTextChanged$1 implements TextWatcher {
    public final /* synthetic */ C19863r<CharSequence, Integer, Integer, Integer, C19394m> $block;

    public AddCardView$onTextChanged$1(C19863r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C19394m> rVar) {
        this.$block = rVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$block.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
