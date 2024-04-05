package com.etsy.android.p327ui.cardview.viewholders;

import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.ViewHolderLifecycleObserver */
public final class ViewHolderLifecycleObserver implements C2857f {

    /* renamed from: b */
    public final C9204o1 f20139b;

    public ViewHolderLifecycleObserver(Lifecycle lifecycle, C9175f0 f0Var) {
        this.f20139b = f0Var;
        lifecycle.mo10733a(this);
    }

    public final void onCreate(C2887s sVar) {
        this.f20139b.mo31407a();
    }

    public final void onDestroy(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        this.f20139b.onDestroy();
    }
}
