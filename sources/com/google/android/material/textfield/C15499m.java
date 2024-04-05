package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.m */
public abstract class C15499m {

    /* renamed from: a */
    public TextInputLayout f34787a;

    /* renamed from: b */
    public Context f34788b;

    /* renamed from: c */
    public CheckableImageButton f34789c;

    /* renamed from: d */
    public final int f34790d;

    public C15499m(TextInputLayout textInputLayout, int i) {
        this.f34787a = textInputLayout;
        this.f34788b = textInputLayout.getContext();
        this.f34789c = textInputLayout.getEndIconView();
        this.f34790d = i;
    }

    /* renamed from: a */
    public abstract void mo55094a();

    /* renamed from: b */
    public boolean mo55108b(int i) {
        return true;
    }

    /* renamed from: c */
    public void mo55095c(boolean z) {
    }
}
