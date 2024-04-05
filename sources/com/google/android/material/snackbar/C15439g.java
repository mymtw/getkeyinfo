package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.g */
public final class C15439g implements SwipeDismissBehavior.C15195b {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f34677a;

    public C15439g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f34677a = baseTransientBottomBar;
    }

    /* renamed from: a */
    public final void mo54776a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f34677a.mo54734b(0);
    }
}
