package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AutoCloseBottomSheetBehavior$onHeightChange$1 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ AutoCloseBottomSheetBehavior<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoCloseBottomSheetBehavior$onHeightChange$1(AutoCloseBottomSheetBehavior<V> autoCloseBottomSheetBehavior) {
        super(1);
        this.this$0 = autoCloseBottomSheetBehavior;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener access$getListener$p = this.this$0.listener;
        if (access$getListener$p != null) {
            access$getListener$p.onBottomSheetHeightChanged(i, this.this$0.getState());
        }
    }
}
