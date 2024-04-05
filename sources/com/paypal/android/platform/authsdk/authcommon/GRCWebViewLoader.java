package com.paypal.android.platform.authsdk.authcommon;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.animation.C0388a;
import com.paypal.android.platform.authsdk.authcommon.utils.UrlSecurityManager;
import com.paypal.android.platform.authsdk.authcommon.utils.UrlUtils;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p003a2.C0015b;

public final class GRCWebViewLoader {
    private final Activity activity;
    private final String appBaseURL;
    private final String appName;
    /* access modifiers changed from: private */
    public final WeakReference<Activity> mWeakActivity;
    /* access modifiers changed from: private */
    public WebView webView;

    public GRCWebViewLoader(Activity activity2, String str, String str2) {
        C19383o.m32797g(activity2, "activity");
        C19383o.m32797g(str, "appBaseURL");
        C19383o.m32797g(str2, "appName");
        this.activity = activity2;
        this.appBaseURL = str;
        this.appName = str2;
        WeakReference<Activity> weakReference = new WeakReference<>(activity2);
        this.mWeakActivity = weakReference;
        Activity activity3 = weakReference.get();
        WebSettings webSettings = null;
        WebView webView2 = activity3 == null ? null : new WebView(activity3);
        this.webView = webView2;
        if (webView2 != null) {
            webView2.setWebViewClient(getWebViewClient());
        }
        WebView webView3 = this.webView;
        webSettings = webView3 != null ? webView3.getSettings() : webSettings;
        if (webSettings != null) {
            webSettings.setJavaScriptEnabled(true);
        }
    }

    private final String composeAdsUrlQueryString(String str) {
        return C0388a.m1049e(new Object[]{str, this.appName}, 2, "p=%s&source=%s", "format(format, *args)");
    }

    private final String getAdsUrl(String str) {
        UrlUtils.Companion companion = UrlUtils.Companion;
        String live_base_url = companion.getLIVE_BASE_URL();
        Activity activity2 = this.mWeakActivity.get();
        if (activity2 != null && isAppDebuggable(activity2) && (C19459m.m33036e1(this.appBaseURL, companion.getPAYPAL_STAGE_DOMAIN(), false) || C19459m.m33036e1(this.appBaseURL, companion.getPAYPAL_QA_DOMAIN(), false))) {
            Uri parse = Uri.parse(this.appBaseURL);
            live_base_url = parse != null ? C0015b.m90i(parse.getScheme(), "://", parse.getHost(), parse.getPath()) : this.appBaseURL;
        }
        return C0388a.m1049e(new Object[]{live_base_url, UUID.randomUUID().toString(), composeAdsUrlQueryString(str)}, 3, "%s/auth/%s/createchallengepage?%s", "format(format, *args)");
    }

    private final WebViewClient getWebViewClient() {
        return new GRCWebViewLoader$getWebViewClient$webViewClient$1(this);
    }

    /* access modifiers changed from: private */
    public final boolean isAppDebuggable(Context context) {
        try {
            PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0);
            C19383o.m32796f(packageInfo, "context.applicationConte…onContext.packageName, 0)");
            return (packageInfo.applicationInfo.flags & 2) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("GRCWebViewLoader", "Exception:" + e);
            return false;
        }
    }

    public final void loadAdsWithChallengeId(String str) {
        WebView webView2;
        C19383o.m32797g(str, "guid");
        String adsUrl = getAdsUrl(GRCWebViewLoaderKt.toAdsChallengeID(str));
        Activity activity2 = this.mWeakActivity.get();
        if (activity2 != null && new UrlSecurityManager(isAppDebuggable(activity2)).isUrlAllowedForLoading$auth_sdk_thirdPartyRelease(adsUrl) && (webView2 = this.webView) != null) {
            webView2.loadUrl(adsUrl);
        }
    }
}
