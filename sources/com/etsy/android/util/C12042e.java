package com.etsy.android.util;

import com.appboy.Constants;
import com.appsflyer.AppsFlyerConversionListener;
import com.etsy.android.lib.logger.C8694h;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.util.e */
public final class C12042e implements AppsFlyerConversionListener {

    /* renamed from: a */
    public final /* synthetic */ C12043f f26842a;

    public C12042e(C12043f fVar) {
        this.f26842a = fVar;
    }

    public final void onAppOpenAttribution(Map<String, String> map) {
        C19383o.m32797g(map, "map");
    }

    public final void onAttributionFailure(String str) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        C8694h hVar = this.f26842a.f26843a;
        String format = String.format("AppsFlyer.onAttributionFailure: %s", Arrays.copyOf(new Object[]{str}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        hVar.mo21313g(format);
        this.f26842a.f26844b.mo45474a("appsflyer.attribution_failure");
    }

    public final void onConversionDataFail(String str) {
        C19383o.m32797g(str, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        C8694h hVar = this.f26842a.f26843a;
        String format = String.format("AppsFlyer.onInstallConversionFailure: %s", Arrays.copyOf(new Object[]{str}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        hVar.mo21313g(format);
        this.f26842a.f26844b.mo45474a("appsflyer.install_conv_failure");
    }

    public final void onConversionDataSuccess(Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "map");
    }
}
