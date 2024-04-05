package com.google.android.material.snackbar;

import android.os.Build;
import android.view.WindowInsets;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: com.google.android.material.snackbar.e */
public final class C15437e implements BaseTransientBottomBar.C15431e {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f34675a;

    public C15437e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f34675a = baseTransientBottomBar;
    }

    /* renamed from: a */
    public final void mo54775a() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f34675a.f34654c.getRootWindowInsets()) != null) {
            this.f34675a.f34662k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            this.f34675a.mo54738f();
        }
    }
}
