package com.etsy.android.lib.util;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.etsy.android.lib.util.t */
public final class C8922t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InputMethodManager f19682b;

    /* renamed from: c */
    public final /* synthetic */ View f19683c;

    public C8922t(EditText editText, InputMethodManager inputMethodManager) {
        this.f19682b = inputMethodManager;
        this.f19683c = editText;
    }

    public final void run() {
        this.f19682b.showSoftInput(this.f19683c, 1);
    }
}
