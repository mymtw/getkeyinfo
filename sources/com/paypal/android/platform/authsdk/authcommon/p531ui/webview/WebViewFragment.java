package com.paypal.android.platform.authsdk.authcommon.p531ui.webview;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets$Type;
import android.view.WindowMetrics;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.config.flags.C6346d;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.p327ui.C9904g;
import com.paypal.android.platform.authsdk.C17049R;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.WebViewFragment */
public abstract class WebViewFragment extends Fragment {
    /* access modifiers changed from: private */
    public final String TAG = "WebViewFragment";
    private final C19285c backButtonIV$delegate = C19350d.m32677b(new WebViewFragment$backButtonIV$2(this));
    private final C19285c closeButtonIV$delegate = C19350d.m32677b(new WebViewFragment$closeButtonIV$2(this));
    private final C19285c logoIV$delegate = C19350d.m32677b(new WebViewFragment$logoIV$2(this));
    private final C19285c webView$delegate = C19350d.m32677b(new WebViewFragment$webView$2(this));
    private final WebViewClient webViewClient = new WebViewFragment$webViewClient$1(this);

    private final void addObserver() {
        getViewModel().getDisplayBackButtonEvent().observe(getViewLifecycleOwner(), new C6469n(this, 4));
        getViewModel().getDisplayCloseButtonEvent().observe(getViewLifecycleOwner(), new C6346d(this, 2));
        getViewModel().getDisplayLogoEvent().observe(getViewLifecycleOwner(), new C9904g(this, 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: addObserver$lambda-5  reason: not valid java name */
    public static final void m35117addObserver$lambda5(WebViewFragment webViewFragment, Boolean bool) {
        C19383o.m32797g(webViewFragment, "this$0");
        ImageView backButtonIV = webViewFragment.getBackButtonIV();
        C19383o.m32796f(bool, "visibility");
        webViewFragment.setVisibility(backButtonIV, bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: addObserver$lambda-6  reason: not valid java name */
    public static final void m35118addObserver$lambda6(WebViewFragment webViewFragment, Boolean bool) {
        C19383o.m32797g(webViewFragment, "this$0");
        ImageView closeButtonIV = webViewFragment.getCloseButtonIV();
        C19383o.m32796f(bool, "visibility");
        webViewFragment.setVisibility(closeButtonIV, bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: addObserver$lambda-7  reason: not valid java name */
    public static final void m35119addObserver$lambda7(WebViewFragment webViewFragment, Boolean bool) {
        C19383o.m32797g(webViewFragment, "this$0");
        ImageView logoIV = webViewFragment.getLogoIV();
        C19383o.m32796f(bool, "visibility");
        webViewFragment.setVisibility(logoIV, bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public final void cancelOnSslError(SslErrorHandler sslErrorHandler, String str) {
        getViewModel().getResultEvent().postValue(new Result.Failure(new ResultError.Failed(str)));
        sslErrorHandler.cancel();
    }

    private final ImageView getBackButtonIV() {
        return (ImageView) this.backButtonIV$delegate.getValue();
    }

    private final ImageView getCloseButtonIV() {
        return (ImageView) this.closeButtonIV$delegate.getValue();
    }

    private final ImageView getLogoIV() {
        return (ImageView) this.logoIV$delegate.getValue();
    }

    private final int getScreenHeight(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            C19383o.m32796f(currentWindowMetrics, "activity.windowManager.currentWindowMetrics");
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets$Type.systemBars());
            C19383o.m32796f(insetsIgnoringVisibility, "windowMetrics.windowInse…ystemBars()\n            )");
            return (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private final WebView getWebView() {
        return (WebView) this.webView$delegate.getValue();
    }

    private final void loadWebView(WebView webView, String str, Map<String, String> map) {
        C19394m mVar;
        webView.setWebViewClient(this.webViewClient);
        WebSettings settings = webView.getSettings();
        C19383o.m32796f(settings, "webView.getSettings()");
        settings.setJavaScriptEnabled(true);
        WebViewUtils.Companion.relaxStageSSL(webView, str);
        if (map == null) {
            mVar = null;
        } else {
            webView.loadUrl(str, map);
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            webView.loadUrl(str);
        }
    }

    private final void setVisibility(View view, boolean z) {
        if (z) {
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (view != null) {
            view.setVisibility(8);
        }
    }

    public abstract Map<String, String> getHeaderMap();

    public abstract String getUrl();

    public abstract WebViewModel getViewModel();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(C17049R.C17053layout.fragment_web_view, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19394m mVar;
        ViewGroup.LayoutParams layoutParams;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        addObserver();
        if (C19383o.m32792b("thirdParty", "thirdParty")) {
            getViewModel().displayBackButton$auth_sdk_thirdPartyRelease(false);
            getViewModel().displayCloseButton$auth_sdk_thirdPartyRelease(false);
            getViewModel().displayLogo$auth_sdk_thirdPartyRelease(false);
        }
        WebViewUtils.Companion companion = WebViewUtils.Companion;
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        if (!companion.isWebViewAvailable$auth_sdk_thirdPartyRelease(requireActivity)) {
            getViewModel().getResultEvent().postValue(new Result.Failure(new ResultError.Unsupported(WebViewModelKt.getWEBVIEW_NOT_AVAILABLE())));
            return;
        }
        String url = getUrl();
        if (TextUtils.isEmpty(url)) {
            getViewModel().getResultEvent().postValue(new Result.Failure(new ResultError.Failed(WebViewModelKt.getCHALLENGE_URL_NULL_OR_EMPTY())));
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int screenHeight = getScreenHeight(activity);
            WebView webView = getWebView();
            if (!(webView == null || (layoutParams = webView.getLayoutParams()) == null)) {
                layoutParams.height = (int) (((double) screenHeight) * 0.65d);
            }
        }
        if (url != null) {
            Map<String, String> headerMap = getHeaderMap();
            WebView webView2 = getWebView();
            if (webView2 == null) {
                mVar = null;
            } else {
                loadWebView(webView2, url, headerMap);
                mVar = C19394m.f43287a;
            }
            if (mVar == null) {
                getViewModel().getResultEvent().postValue(new Result.Failure(new ResultError.Unsupported(WebViewModelKt.getWEBVIEW_NOT_AVAILABLE())));
            }
        }
    }

    public abstract boolean shouldOverrideUrl(WebView webView, String str);
}
