package com.etsy.android.stylekit.views;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ListAdapter;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;

public final class CollageTypeAhead$1$1 implements TextWatcher {
    public final /* synthetic */ CollageTypeAhead this$0;

    public CollageTypeAhead$1$1(CollageTypeAhead collageTypeAhead) {
        this.this$0 = collageTypeAhead;
    }

    public void afterTextChanged(Editable editable) {
        C19383o.m32797g(editable, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        ListAdapter adapter = this.this$0.getMaterialInput().getAdapter();
        CollageTypeAheadAdapter collageTypeAheadAdapter = adapter instanceof CollageTypeAheadAdapter ? (CollageTypeAheadAdapter) adapter : null;
        if (collageTypeAheadAdapter != null) {
            collageTypeAheadAdapter.onTextChanged(editable.toString());
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C19383o.m32797g(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
