package com.paypal.pyplcheckout.p543di;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2878l0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$4 */
public final class SdkComponentKt$activityViewModels$4 extends Lambda implements C19846a<C2878l0> {
    public final /* synthetic */ ComponentActivity $activity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdkComponentKt$activityViewModels$4(ComponentActivity componentActivity) {
        super(0);
        this.$activity = componentActivity;
    }

    public final C2878l0 invoke() {
        C2878l0 viewModelStore = this.$activity.getViewModelStore();
        C19383o.m32796f(viewModelStore, "activity.viewModelStore");
        return viewModelStore;
    }
}
