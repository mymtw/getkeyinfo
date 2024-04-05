package com.etsy.android.uikit.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.appboy.p043ui.C4950e;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.stylekit.views.CollageAlert;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.BackpressureStrategy;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p377jf.C12979a;

public final class EtsyChromeClient extends WebChromeClient implements C2857f {
    public static final int $stable = 8;
    public static final C12020a Companion = new C12020a();
    private static final int PROGRESS_BAR_HIDE_DELAY_MILLIS = 200;
    private static final int PROGRESS_COMPLETE = 100;
    private Disposable cameraDisposable;
    private final C8886e cameraHelper;
    private WeakReference<Fragment> fragmentReference;
    private ProgressBar progressBar;

    /* renamed from: com.etsy.android.uikit.webview.EtsyChromeClient$a */
    public static final class C12020a {
    }

    public EtsyChromeClient(C8886e eVar) {
        C19383o.m32797g(eVar, "cameraHelper");
        this.cameraHelper = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: onProgressChanged$lambda-0  reason: not valid java name */
    public static final void m35098onProgressChanged$lambda0(EtsyChromeClient etsyChromeClient) {
        C19383o.m32797g(etsyChromeClient, "this$0");
        ProgressBar progressBar2 = etsyChromeClient.progressBar;
        if (progressBar2 != null) {
            ViewExtensions.m12860d(progressBar2);
        }
    }

    /* access modifiers changed from: private */
    public final void showErrorAlert(Activity activity, int i) {
        C12979a a = C12979a.C12980a.m20683a(activity);
        a.mo45785e(activity.getString(i));
        a.mo45781a(CollageAlert.AlertType.ERROR);
        a.mo45783c(R.drawable.clg_icon_core_exclamation_v1);
        a.mo45786f();
    }

    /* access modifiers changed from: private */
    public final void startImagePicker() {
        Fragment fragment;
        WeakReference<Fragment> weakReference = this.fragmentReference;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            this.cameraHelper.mo30483j(fragment);
        }
    }

    public final void attachFragment(Fragment fragment) {
        C19383o.m32797g(fragment, "fragment");
        this.fragmentReference = new WeakReference<>(fragment);
    }

    public final void attachProgressBar(ProgressBar progressBar2) {
        C19383o.m32797g(progressBar2, "progressBar");
        this.progressBar = progressBar2;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.cameraHelper.mo30479f(i, i2, intent);
    }

    public /* bridge */ /* synthetic */ void onCreate(C2887s sVar) {
    }

    public void onDestroy(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        Disposable disposable = this.cameraDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.progressBar = null;
    }

    public /* bridge */ /* synthetic */ void onPause(C2887s sVar) {
    }

    public void onProgressChanged(WebView webView, int i) {
        C19383o.m32797g(webView, "view");
        super.onProgressChanged(webView, i);
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(i);
        }
        if (i == 100) {
            new Handler(Looper.getMainLooper()).postDelayed(new C4950e(this, 4), 200);
        }
    }

    public /* bridge */ /* synthetic */ void onResume(C2887s sVar) {
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C19383o.m32797g(webView, "webView");
        C19383o.m32797g(valueCallback, "filePathCallback");
        C19383o.m32797g(fileChooserParams, "fileChooserParams");
        Context context = webView.getContext();
        C19383o.m32795e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        Disposable disposable = this.cameraDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.cameraDisposable = SubscribersKt.m32502g(this.cameraHelper.f19640f.mo20640k(BackpressureStrategy.BUFFER), EtsyChromeClient$onShowFileChooser$1.INSTANCE, new EtsyChromeClient$onShowFileChooser$2(this, activity, valueCallback));
        startImagePicker();
        return true;
    }

    public /* bridge */ /* synthetic */ void onStart(C2887s sVar) {
    }

    public /* bridge */ /* synthetic */ void onStop(C2887s sVar) {
    }
}
