package com.paypal.pyplcheckout.p543di;

import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$1 */
public final class SdkComponentKt$activityViewModels$1 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ SdkComponent $sdkComponent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SdkComponentKt$activityViewModels$1(SdkComponent sdkComponent) {
        super(0);
        this.$sdkComponent = sdkComponent;
    }

    public final C2870k0.C2872b invoke() {
        return this.$sdkComponent.getViewModelProviderFactory();
    }
}
