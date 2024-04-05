package com.paypal.android.platform.authsdk.otplogin.p533ui.error;

import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorFragment$viewModel$2 */
public final class OtpErrorFragment$viewModel$2 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ OtpErrorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpErrorFragment$viewModel$2(OtpErrorFragment otpErrorFragment) {
        super(0);
        this.this$0 = otpErrorFragment;
    }

    public final C2870k0.C2872b invoke() {
        return new OtpErrorViewModelFactory(this.this$0.getAuthHandlerProvidersFromIntent());
    }
}
