package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$viewModel$2 */
public final class SplitLoginFragment$viewModel$2 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ SplitLoginFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginFragment$viewModel$2(SplitLoginFragment splitLoginFragment) {
        super(0);
        this.this$0 = splitLoginFragment;
    }

    public final C2870k0.C2872b invoke() {
        return new SplitLoginViewModelFactory(this.this$0.getRepositoryFromIntent(), this.this$0.getAuthHandlerProvidersFromIntent());
    }
}
