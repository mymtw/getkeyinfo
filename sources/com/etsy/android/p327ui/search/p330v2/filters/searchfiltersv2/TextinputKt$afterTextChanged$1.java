package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.TextinputKt$afterTextChanged$1 */
public final class TextinputKt$afterTextChanged$1 implements TextWatcher {
    public final /* synthetic */ C19857l<String, C19394m> $afterTextChanged;

    public TextinputKt$afterTextChanged$1(C19857l<? super String, C19394m> lVar) {
        this.$afterTextChanged = lVar;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        this.$afterTextChanged.invoke(str);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
