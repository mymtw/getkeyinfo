package com.etsy.android.stylekit.views;

import android.widget.AutoCompleteTextView;
import kotlin.Pair;
import p753kq.C19857l;

public final class CollageTypeAhead$setValidator$1 implements AutoCompleteTextView.Validator {
    public final /* synthetic */ C19857l<CharSequence, Pair<Boolean, String>> $validator;
    public final /* synthetic */ CollageTypeAhead this$0;

    public CollageTypeAhead$setValidator$1(C19857l<? super CharSequence, Pair<Boolean, String>> lVar, CollageTypeAhead collageTypeAhead) {
        this.$validator = lVar;
        this.this$0 = collageTypeAhead;
    }

    public CharSequence fixText(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public boolean isValid(CharSequence charSequence) {
        Pair invoke = this.$validator.invoke(charSequence);
        if (!((Boolean) invoke.getFirst()).booleanValue()) {
            this.this$0.setErrorText((String) invoke.getSecond());
        } else {
            this.this$0.setErrorText((String) null);
        }
        return ((Boolean) invoke.getFirst()).booleanValue();
    }
}
