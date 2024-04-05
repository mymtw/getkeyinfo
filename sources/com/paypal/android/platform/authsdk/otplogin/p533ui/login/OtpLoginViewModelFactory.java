package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewModel;
import kotlin.jvm.internal.C19383o;
import p716xo.C18829b;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModelFactory */
public final class OtpLoginViewModelFactory extends C2870k0.C2874d {
    private final C18829b authHandlerProviders;
    private final OtpLoginRepositoryImpl repository;

    public OtpLoginViewModelFactory(OtpLoginRepositoryImpl otpLoginRepositoryImpl, C18829b bVar) {
        C19383o.m32797g(bVar, "authHandlerProviders");
        this.repository = otpLoginRepositoryImpl;
        this.authHandlerProviders = bVar;
    }

    public <T extends C2866i0> T create(Class<T> cls) {
        C19383o.m32797g(cls, "modelClass");
        if (cls.isAssignableFrom(OtpLoginViewModel.class)) {
            return new OtpLoginViewModel(this.repository, this.authHandlerProviders);
        }
        if (cls.isAssignableFrom(OtpPhoneViewModel.class)) {
            return new OtpPhoneViewModel(this.repository, this.authHandlerProviders);
        }
        throw new IllegalArgumentException();
    }
}
