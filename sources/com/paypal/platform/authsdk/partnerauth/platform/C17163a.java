package com.paypal.platform.authsdk.partnerauth.platform;

import android.support.p013v4.media.C0069a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationContext;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.platform.authsdk.partnerauth.platform.a */
public abstract class C17163a {

    /* renamed from: a */
    public final AuthenticationContext f37647a;

    /* renamed from: b */
    public final Authentication.Listener f37648b;

    /* renamed from: c */
    public final String f37649c;

    /* renamed from: com.paypal.platform.authsdk.partnerauth.platform.a$a */
    public static final class C17164a extends C17163a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17164a(AuthenticationContext authenticationContext, Authentication.Listener listener) {
            super(authenticationContext, listener);
            C19383o.m32797g(authenticationContext, "authenticationContext");
            C19383o.m32797g(listener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
    }

    public C17163a(AuthenticationContext authenticationContext, Authentication.Listener listener) {
        String e = C0069a.m174e("randomUUID().toString()");
        this.f37647a = authenticationContext;
        this.f37648b = listener;
        this.f37649c = e;
    }
}
