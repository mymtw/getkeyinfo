package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.internal.PlatformServiceClient;
import kotlin.jvm.internal.C19383o;

public final class LoginStatusClient extends PlatformServiceClient {
    public static final C12302a Companion = new C12302a();
    public static final long DEFAULT_TOAST_DURATION_MS = 5000;
    private final String graphApiVersion;
    private final String loggerRef;
    private final long toastDurationMs;

    /* renamed from: com.facebook.login.LoginStatusClient$a */
    public static final class C12302a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginStatusClient(Context context, String str, String str2, String str3, long j, String str4) {
        super(context, 65546, 65547, 20170411, str, str4);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "applicationId");
        C19383o.m32797g(str2, "loggerRef");
        C19383o.m32797g(str3, "graphApiVersion");
        this.loggerRef = str2;
        this.graphApiVersion = str3;
        this.toastDurationMs = j;
    }

    public void populateRequestBundle(Bundle bundle) {
        C19383o.m32797g(bundle, "data");
        bundle.putString("com.facebook.platform.extra.LOGGER_REF", this.loggerRef);
        bundle.putString("com.facebook.platform.extra.GRAPH_API_VERSION", this.graphApiVersion);
        bundle.putLong("com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS", this.toastDurationMs);
    }
}
