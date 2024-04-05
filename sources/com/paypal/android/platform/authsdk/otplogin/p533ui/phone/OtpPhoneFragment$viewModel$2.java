package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import androidx.lifecycle.C2870k0;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginViewModelFactory;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment$viewModel$2 */
public final class OtpPhoneFragment$viewModel$2 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ OtpPhoneFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpPhoneFragment$viewModel$2(OtpPhoneFragment otpPhoneFragment) {
        super(0);
        this.this$0 = otpPhoneFragment;
    }

    public final C2870k0.C2872b invoke() {
        return new OtpLoginViewModelFactory(this.this$0.getRepositoryFromArguments(), this.this$0.getAuthHandlerProvidersFromIntent());
    }
}
