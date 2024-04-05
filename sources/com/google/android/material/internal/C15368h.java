package com.google.android.material.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.google.android.material.internal.h */
public final class C15368h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f34515b;

    public C15368h(EditText editText) {
        this.f34515b = editText;
    }

    public final void run() {
        ((InputMethodManager) this.f34515b.getContext().getSystemService("input_method")).showSoftInput(this.f34515b, 1);
    }
}
