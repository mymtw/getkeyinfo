package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.internal.WebDialog;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12836c;
import p365hg.C12851e0;
import p365hg.C12869i0;
import p401mg.C13080a;
import p453tf.C13418j;

public final class FacebookWebFallbackDialog extends WebDialog {
    public static final C12253a Companion = new C12253a();
    private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
    private static final String TAG = FacebookWebFallbackDialog.class.getName();
    private boolean waitingForDialogToClose;

    /* renamed from: com.facebook.internal.FacebookWebFallbackDialog$a */
    public static final class C12253a {
    }

    /* renamed from: com.facebook.internal.FacebookWebFallbackDialog$b */
    public static final class C12254b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ FacebookWebFallbackDialog f27343b;

        public C12254b(FacebookWebFallbackDialog facebookWebFallbackDialog) {
            this.f27343b = facebookWebFallbackDialog;
        }

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    FacebookWebFallbackDialog.super.cancel();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    public /* synthetic */ FacebookWebFallbackDialog(Context context, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2);
    }

    public static final FacebookWebFallbackDialog newInstance(Context context, String str, String str2) {
        Companion.getClass();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "url");
        C19383o.m32797g(str2, "expectedRedirectUrl");
        WebDialog.Companion.getClass();
        WebDialog.C12265b.m20112a(context);
        return new FacebookWebFallbackDialog(context, str, str2, (DefaultConstructorMarker) null);
    }

    public void cancel() {
        WebView webView = getWebView();
        if (!isPageFinished() || isListenerCalled() || webView == null || !webView.isShown()) {
            super.cancel();
        } else if (!this.waitingForDialogToClose) {
            this.waitingForDialogToClose = true;
            webView.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new C12254b(this), (long) 1500);
        }
    }

    public Bundle parseResponseUri(String str) {
        Uri parse = Uri.parse(str);
        C19383o.m32796f(parse, "responseUri");
        Bundle J = C12869i0.m20554J(parse.getQuery());
        String string = J.getString("bridge_args");
        J.remove("bridge_args");
        if (!C12869i0.m20546B(string)) {
            try {
                J.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C12836c.m20473a(new JSONObject(string)));
            } catch (JSONException e) {
                String str2 = TAG;
                if (C13418j.f29389i && !C12869i0.m20546B(str2)) {
                    Log.d(str2, "Unable to parse bridge_args JSON", e);
                }
            }
        }
        String string2 = J.getString("method_results");
        J.remove("method_results");
        if (!C12869i0.m20546B(string2)) {
            try {
                J.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C12836c.m20473a(new JSONObject(string2)));
            } catch (JSONException e2) {
                String str3 = TAG;
                if (C13418j.f29389i && !C12869i0.m20546B(str3)) {
                    Log.d(str3, "Unable to parse bridge_args JSON", e2);
                }
            }
        }
        J.remove(ResponseConstants.VERSION);
        String str4 = C12851e0.f28342a;
        Class<C12851e0> cls = C12851e0.class;
        int i = 0;
        if (!C13080a.m20762b(cls)) {
            try {
                i = C12851e0.f28345d[0].intValue();
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
        J.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", i);
        return J;
    }

    private FacebookWebFallbackDialog(Context context, String str, String str2) {
        super(context, str);
        setExpectedRedirectUrl(str2);
    }
}
