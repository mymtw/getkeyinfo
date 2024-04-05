package com.paypal.android.platform.authsdk.authcommon.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19459m;
import p642oo.C18333a;
import p642oo.C18334b;

public final class WebViewUtils {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String STAGE_QA_URI = "qa.";
    private static final String STAGE_URI = "stage.";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: showDialogOnSslError$lambda-0  reason: not valid java name */
        public static final void m35122showDialogOnSslError$lambda0(SslErrorHandler sslErrorHandler, DialogInterface dialogInterface, int i) {
            C19383o.m32797g(sslErrorHandler, "$handler");
            sslErrorHandler.proceed();
        }

        /* access modifiers changed from: private */
        /* renamed from: showDialogOnSslError$lambda-1  reason: not valid java name */
        public static final void m35123showDialogOnSslError$lambda1(DialogOnSslErrorHandler dialogOnSslErrorHandler, DialogInterface dialogInterface, int i) {
            C19383o.m32797g(dialogOnSslErrorHandler, "$dialogSslErrorHandler");
            dialogOnSslErrorHandler.cancel();
        }

        public final boolean isWebViewAvailable$auth_sdk_thirdPartyRelease(Activity activity) {
            C19383o.m32797g(activity, "activity");
            try {
                new WebView(activity);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public final void relaxStageSSL(WebView webView, String str) {
            C19383o.m32797g(webView, "webview");
            C19383o.m32797g(str, "url");
            if (C19459m.m33036e1(str, WebViewUtils.STAGE_URI, false) || C19459m.m33036e1(str, WebViewUtils.STAGE_QA_URI, false)) {
                webView.clearSslPreferences();
            }
        }

        public final void showDialogOnSslError(SslErrorHandler sslErrorHandler, Activity activity, DialogOnSslErrorHandler dialogOnSslErrorHandler) {
            C19383o.m32797g(sslErrorHandler, "handler");
            C19383o.m32797g(activity, "activity");
            C19383o.m32797g(dialogOnSslErrorHandler, "dialogSslErrorHandler");
            if (activity.isFinishing()) {
                sslErrorHandler.cancel();
                dialogOnSslErrorHandler.cancel();
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage("SSL certificate check error \n\nWARNING: This page may be unsafe. Please click on Continue if you wish to proceed, otherwise contact our customer center for further assistance.");
            builder.setPositiveButton("Continue", new C18333a(sslErrorHandler));
            builder.setNegativeButton("Cancel", new C18334b(dialogOnSslErrorHandler));
            builder.create().show();
        }
    }

    public interface DialogOnSslErrorHandler {
        void cancel();
    }
}
