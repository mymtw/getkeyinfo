package com.paypal.android.platform.authsdk.authcommon.network.utils;

import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import java.util.Objects;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p767qr.C20071a;
import retrofit2.C20146w;

public final class ApiUtilsKt {
    public static final <T> T getAuthApi(AuthCoreComponent authCoreComponent, Class<T> cls) {
        C19383o.m32797g(authCoreComponent, ConstantsKt.AUTH_CORE_COMPONENT);
        C19383o.m32797g(cls, "service");
        C20146w.C20148b bVar = new C20146w.C20148b();
        bVar.mo74394b(authCoreComponent.getClientConfig().getBaseUrl());
        C20009t okHttpClient = authCoreComponent.getOkHttpClient();
        Objects.requireNonNull(okHttpClient, "client == null");
        bVar.f44628b = okHttpClient;
        bVar.f44630d.add(new C20071a(new C16708i()));
        return bVar.mo74395c().mo74387b(cls);
    }
}
