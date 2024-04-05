package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl;
import kotlin.jvm.internal.C19383o;
import p716xo.C18829b;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModelFactory */
public final class SplitLoginViewModelFactory extends C2870k0.C2874d {
    private final C18829b authHandlerProviders;
    private final SplitLoginRepositoryImpl repository;

    public SplitLoginViewModelFactory(SplitLoginRepositoryImpl splitLoginRepositoryImpl, C18829b bVar) {
        C19383o.m32797g(bVar, "authHandlerProviders");
        this.repository = splitLoginRepositoryImpl;
        this.authHandlerProviders = bVar;
    }

    public <T extends C2866i0> T create(Class<T> cls) {
        C19383o.m32797g(cls, "modelClass");
        if (cls.isAssignableFrom(SplitLoginViewModel.class)) {
            return new SplitLoginViewModel(this.repository, this.authHandlerProviders);
        }
        throw new IllegalArgumentException();
    }
}
