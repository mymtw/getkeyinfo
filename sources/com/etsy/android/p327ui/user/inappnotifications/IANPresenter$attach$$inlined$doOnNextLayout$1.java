package com.etsy.android.p327ui.user.inappnotifications;

import android.view.View;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.inappnotifications.IANPresenter$attach$$inlined$doOnNextLayout$1 */
public final class IANPresenter$attach$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C11553g this$0;

    public IANPresenter$attach$$inlined$doOnNextLayout$1(C11553g gVar) {
        this.this$0 = gVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        C11553g gVar = this.this$0;
        gVar.mo37562b(gVar.f25580a.getRecyclerView());
    }
}
