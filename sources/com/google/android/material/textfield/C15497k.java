package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;

/* renamed from: com.google.android.material.textfield.k */
public final class C15497k implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C15486h f34785a;

    public C15497k(C15486h hVar) {
        this.f34785a = hVar;
    }

    public final void onDismiss() {
        C15486h hVar = this.f34785a;
        hVar.f34764j = true;
        hVar.f34766l = System.currentTimeMillis();
        this.f34785a.mo55110f(false);
    }
}
