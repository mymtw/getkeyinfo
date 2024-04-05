package com.paypal.android.platform.authsdk.otplogin.p533ui.error;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p716xo.C18829b;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.OtpErrorViewModelFactory */
public final class OtpErrorViewModelFactory extends C2870k0.C2874d {
    private final C18829b authHandlerProviders;
    private final C19285c exception$delegate = C19350d.m32677b(OtpErrorViewModelFactory$exception$2.INSTANCE);

    public OtpErrorViewModelFactory(C18829b bVar) {
        C19383o.m32797g(bVar, "authHandlerProviders");
        this.authHandlerProviders = bVar;
    }

    private final IllegalStateException getException() {
        return (IllegalStateException) this.exception$delegate.getValue();
    }

    public <T extends C2866i0> T create(Class<T> cls) {
        C19383o.m32797g(cls, "modelClass");
        if (cls.isAssignableFrom(OtpErrorViewModel.class)) {
            return new OtpErrorViewModel(this.authHandlerProviders);
        }
        throw getException();
    }
}
