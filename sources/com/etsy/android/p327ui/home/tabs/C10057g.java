package com.etsy.android.p327ui.home.tabs;

import android.widget.PopupWindow;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.tabs.g */
public final /* synthetic */ class C10057g implements PopupWindow.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ HomePagerFragment f22157b;

    public /* synthetic */ C10057g(HomePagerFragment homePagerFragment) {
        this.f22157b = homePagerFragment;
    }

    public final void onDismiss() {
        HomePagerFragment homePagerFragment = this.f22157b;
        C19383o.m32797g(homePagerFragment, "this$0");
        homePagerFragment.getViewModel().f22139y = true;
    }
}
