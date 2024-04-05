package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p013v4.media.C0072d;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.appboy.Constants;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginTargetApp;
import com.google.logging.type.LogSeverity;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p365hg.C12865g0;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p401mg.C13080a;
import p453tf.C13418j;

public class WebDialog extends Dialog {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int BACKGROUND_GRAY = -872415232;
    public static final C12265b Companion = new C12265b();
    /* access modifiers changed from: private */
    public static final int DEFAULT_THEME = R.style.com_facebook_activity_theme;
    public static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
    private static final String DISPLAY_TOUCH = "touch";
    private static final String LOG_TAG = "FacebookSDK.WebDialog";
    private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
    private static final int MAX_PADDING_SCREEN_WIDTH = 800;
    private static final double MIN_SCALE_FACTOR = 0.5d;
    private static final int NO_PADDING_SCREEN_HEIGHT = 800;
    private static final int NO_PADDING_SCREEN_WIDTH = 480;
    private static final String PLATFORM_DIALOG_PATH_REGEX = "^/(v\\d+\\.\\d+/)??dialog/.*";
    /* access modifiers changed from: private */
    public static C12267d initCallback;
    /* access modifiers changed from: private */
    public static volatile int webDialogTheme;
    /* access modifiers changed from: private */
    public FrameLayout contentFrameLayout;
    /* access modifiers changed from: private */
    public ImageView crossImageView;
    /* access modifiers changed from: private */
    public String expectedRedirectUrl;
    /* access modifiers changed from: private */
    public boolean isDetached;
    private boolean isListenerCalled;
    /* access modifiers changed from: private */
    public boolean isPageFinished;
    private C12268e onCompleteListener;
    /* access modifiers changed from: private */
    public ProgressDialog spinner;
    private C12269f uploadTask;
    /* access modifiers changed from: private */
    public String url;
    /* access modifiers changed from: private */
    public WebView webView;
    private WindowManager.LayoutParams windowParams;

    /* renamed from: com.facebook.internal.WebDialog$a */
    public static class C12264a {

        /* renamed from: a */
        public Context f27358a;

        /* renamed from: b */
        public String f27359b;

        /* renamed from: c */
        public C12268e f27360c;

        /* renamed from: d */
        public Bundle f27361d;

        public C12264a(FragmentActivity fragmentActivity, String str, Bundle bundle, int i) {
            if (str == null) {
                int i2 = C12869i0.f28368a;
                C12879l0.m20601e(fragmentActivity, ResponseConstants.CONTEXT);
                str = C13418j.m21107c();
            }
            C12879l0.m20602f(str, "applicationId");
            this.f27359b = str;
            this.f27358a = fragmentActivity;
            if (bundle != null) {
                this.f27361d = bundle;
            } else {
                this.f27361d = new Bundle();
            }
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$b */
    public static final class C12265b {
        /* renamed from: a */
        public static void m20112a(Context context) {
            if (context != null) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    if ((applicationInfo != null ? applicationInfo.metaData : null) != null && WebDialog.webDialogTheme == 0) {
                        int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                        if (i == 0) {
                            i = WebDialog.DEFAULT_THEME;
                        }
                        WebDialog.webDialogTheme = i;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$c */
    public final class C12266c extends WebViewClient {
        public C12266c() {
        }

        public final void onPageFinished(WebView webView, String str) {
            ProgressDialog access$getSpinner$p;
            C19383o.m32797g(webView, "view");
            C19383o.m32797g(str, "url");
            super.onPageFinished(webView, str);
            if (!WebDialog.this.isDetached && (access$getSpinner$p = WebDialog.this.spinner) != null) {
                access$getSpinner$p.dismiss();
            }
            FrameLayout access$getContentFrameLayout$p = WebDialog.this.contentFrameLayout;
            if (access$getContentFrameLayout$p != null) {
                access$getContentFrameLayout$p.setBackgroundColor(0);
            }
            WebView webView2 = WebDialog.this.getWebView();
            if (webView2 != null) {
                webView2.setVisibility(0);
            }
            ImageView access$getCrossImageView$p = WebDialog.this.crossImageView;
            if (access$getCrossImageView$p != null) {
                access$getCrossImageView$p.setVisibility(0);
            }
            WebDialog.this.isPageFinished = true;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog access$getSpinner$p;
            C19383o.m32797g(webView, "view");
            C19383o.m32797g(str, "url");
            C12869i0.m20551G(WebDialog.LOG_TAG, "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (!WebDialog.this.isDetached && (access$getSpinner$p = WebDialog.this.spinner) != null) {
                access$getSpinner$p.show();
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C19383o.m32797g(webView, "view");
            C19383o.m32797g(str, "description");
            C19383o.m32797g(str2, "failingUrl");
            super.onReceivedError(webView, i, str, str2);
            WebDialog.this.sendErrorToListener(new FacebookDialogException(str, i, str2));
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C19383o.m32797g(webView, "view");
            C19383o.m32797g(sslErrorHandler, "handler");
            C19383o.m32797g(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            WebDialog.this.sendErrorToListener(new FacebookDialogException((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.C19383o.m32797g(r6, r0)
                java.lang.String r6 = "url"
                kotlin.jvm.internal.C19383o.m32797g(r7, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Redirect URL: "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                p365hg.C12869i0.m20551G(r0, r6)
                android.net.Uri r6 = android.net.Uri.parse(r7)
                java.lang.String r0 = "parsedURL"
                kotlin.jvm.internal.C19383o.m32796f(r6, r0)
                java.lang.String r0 = r6.getPath()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x003f
                java.lang.String r6 = r6.getPath()
                java.lang.String r0 = "^/(v\\d+\\.\\d+/)??dialog/.*"
                boolean r6 = java.util.regex.Pattern.matches(r0, r6)
                if (r6 == 0) goto L_0x003f
                r6 = r1
                goto L_0x0040
            L_0x003f:
                r6 = r2
            L_0x0040:
                com.facebook.internal.WebDialog r0 = com.facebook.internal.WebDialog.this
                java.lang.String r0 = r0.expectedRedirectUrl
                boolean r0 = kotlin.text.C19457k.m33025c1(r7, r0, r2)
                if (r0 == 0) goto L_0x00d1
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this
                android.os.Bundle r6 = r6.parseResponseUri(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0060
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0060:
                java.lang.String r0 = "error_msg"
                java.lang.String r0 = r6.getString(r0)
                if (r0 != 0) goto L_0x006e
                java.lang.String r0 = "error_message"
                java.lang.String r0 = r6.getString(r0)
            L_0x006e:
                if (r0 != 0) goto L_0x0076
                java.lang.String r0 = "error_description"
                java.lang.String r0 = r6.getString(r0)
            L_0x0076:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                r3 = -1
                if (r2 == 0) goto L_0x008a
                boolean r4 = p365hg.C12869i0.m20546B(r2)
                if (r4 != 0) goto L_0x008a
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x008a }
                goto L_0x008b
            L_0x008a:
                r2 = r3
            L_0x008b:
                boolean r4 = p365hg.C12869i0.m20546B(r7)
                if (r4 == 0) goto L_0x009f
                boolean r4 = p365hg.C12869i0.m20546B(r0)
                if (r4 == 0) goto L_0x009f
                if (r2 != r3) goto L_0x009f
                com.facebook.internal.WebDialog r7 = com.facebook.internal.WebDialog.this
                r7.sendSuccessToListener(r6)
                goto L_0x00d0
            L_0x009f:
                if (r7 == 0) goto L_0x00b7
                java.lang.String r6 = "access_denied"
                boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r7, r6)
                if (r6 != 0) goto L_0x00b1
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r7, r6)
                if (r6 == 0) goto L_0x00b7
            L_0x00b1:
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this
                r6.cancel()
                goto L_0x00d0
            L_0x00b7:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x00c1
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this
                r6.cancel()
                goto L_0x00d0
            L_0x00c1:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r0)
                com.facebook.internal.WebDialog r7 = com.facebook.internal.WebDialog.this
                com.facebook.FacebookServiceException r2 = new com.facebook.FacebookServiceException
                r2.<init>(r6, r0)
                r7.sendErrorToListener(r2)
            L_0x00d0:
                return r1
            L_0x00d1:
                java.lang.String r0 = "fbconnect://cancel"
                boolean r0 = kotlin.text.C19457k.m33025c1(r7, r0, r2)
                if (r0 == 0) goto L_0x00df
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this
                r6.cancel()
                return r1
            L_0x00df:
                if (r6 != 0) goto L_0x0101
                java.lang.String r6 = "touch"
                boolean r6 = kotlin.text.C19459m.m33036e1(r7, r6, r2)
                if (r6 == 0) goto L_0x00ea
                goto L_0x0101
            L_0x00ea:
                com.facebook.internal.WebDialog r6 = com.facebook.internal.WebDialog.this     // Catch:{ ActivityNotFoundException -> 0x00ff }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00ff }
                android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00ff }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00ff }
                r0.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00ff }
                r6.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00ff }
                goto L_0x0100
            L_0x00ff:
                r1 = r2
            L_0x0100:
                return r1
            L_0x0101:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.C12266c.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$d */
    public interface C12267d {
        /* renamed from: a */
        void mo39432a();
    }

    /* renamed from: com.facebook.internal.WebDialog$e */
    public interface C12268e {
        /* renamed from: a */
        void mo39379a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: com.facebook.internal.WebDialog$f */
    public final class C12269f extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        public Exception[] f27363a = new Exception[0];

        /* renamed from: b */
        public final String f27364b;

        /* renamed from: c */
        public final Bundle f27365c;

        /* renamed from: d */
        public final /* synthetic */ WebDialog f27366d;

        /* renamed from: com.facebook.internal.WebDialog$f$a */
        public static final class C12270a implements GraphRequest.C12195b {

            /* renamed from: a */
            public final /* synthetic */ C12269f f27367a;

            /* renamed from: b */
            public final /* synthetic */ String[] f27368b;

            /* renamed from: c */
            public final /* synthetic */ int f27369c;

            /* renamed from: d */
            public final /* synthetic */ CountDownLatch f27370d;

            public C12270a(C12269f fVar, String[] strArr, int i, CountDownLatch countDownLatch) {
                this.f27367a = fVar;
                this.f27368b = strArr;
                this.f27369c = i;
                this.f27370d = countDownLatch;
            }

            /* renamed from: a */
            public final void mo39238a(GraphResponse graphResponse) {
                try {
                    FacebookRequestError facebookRequestError = graphResponse.f27247d;
                    String str = "Error staging photo.";
                    if (facebookRequestError != null) {
                        String errorMessage = facebookRequestError.getErrorMessage();
                        if (errorMessage != null) {
                            str = errorMessage;
                        }
                        throw new FacebookGraphResponseException(graphResponse, str);
                    }
                    JSONObject jSONObject = graphResponse.f27246c;
                    if (jSONObject != null) {
                        String optString = jSONObject.optString(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                        if (optString != null) {
                            this.f27368b[this.f27369c] = optString;
                            this.f27370d.countDown();
                            return;
                        }
                        throw new FacebookException(str);
                    }
                    throw new FacebookException(str);
                } catch (Exception e) {
                    this.f27367a.f27363a[this.f27369c] = e;
                }
            }
        }

        public C12269f(WebDialog webDialog, String str, Bundle bundle) {
            C19383o.m32797g(str, ResponseConstants.ACTION);
            this.f27366d = webDialog;
            this.f27364b = str;
            this.f27365c = bundle;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:26|27|(2:30|28)|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            r11 = r3.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            if (r11.hasNext() != false) goto L_0x008a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
            ((com.facebook.GraphRequestAsyncTask) r11.next()).cancel(true);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0080 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String[] mo39433a(java.lang.Void... r11) {
            /*
                r10 = this;
                boolean r0 = p401mg.C13080a.m20762b(r10)
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.C19383o.m32797g(r11, r0)     // Catch:{ all -> 0x0095 }
                android.os.Bundle r11 = r10.f27365c     // Catch:{ all -> 0x0095 }
                java.lang.String r0 = "media"
                java.lang.String[] r11 = r11.getStringArray(r0)     // Catch:{ all -> 0x0095 }
                if (r11 == 0) goto L_0x0094
                int r0 = r11.length     // Catch:{ all -> 0x0095 }
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0095 }
                int r2 = r11.length     // Catch:{ all -> 0x0095 }
                java.lang.Exception[] r2 = new java.lang.Exception[r2]     // Catch:{ all -> 0x0095 }
                r10.f27363a = r2     // Catch:{ all -> 0x0095 }
                java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0095 }
                int r3 = r11.length     // Catch:{ all -> 0x0095 }
                r2.<init>(r3)     // Catch:{ all -> 0x0095 }
                java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x0095 }
                r3.<init>()     // Catch:{ all -> 0x0095 }
                com.facebook.AccessToken$c r4 = com.facebook.AccessToken.Companion     // Catch:{ all -> 0x0095 }
                r4.getClass()     // Catch:{ all -> 0x0095 }
                com.facebook.AccessToken r4 = com.facebook.AccessToken.C12174c.m19981d()     // Catch:{ all -> 0x0095 }
                r5 = 0
                r6 = 1
                int r7 = r11.length     // Catch:{ Exception -> 0x0080 }
            L_0x0036:
                if (r5 >= r7) goto L_0x007c
                boolean r8 = r10.isCancelled()     // Catch:{ Exception -> 0x0080 }
                if (r8 == 0) goto L_0x0053
                java.util.Iterator r11 = r3.iterator()     // Catch:{ Exception -> 0x0080 }
            L_0x0042:
                boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x0080 }
                if (r0 == 0) goto L_0x0052
                java.lang.Object r0 = r11.next()     // Catch:{ Exception -> 0x0080 }
                com.facebook.GraphRequestAsyncTask r0 = (com.facebook.GraphRequestAsyncTask) r0     // Catch:{ Exception -> 0x0080 }
                r0.cancel(r6)     // Catch:{ Exception -> 0x0080 }
                goto L_0x0042
            L_0x0052:
                return r1
            L_0x0053:
                r8 = r11[r5]     // Catch:{ Exception -> 0x0080 }
                android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0080 }
                boolean r9 = p365hg.C12869i0.m20547C(r8)     // Catch:{ Exception -> 0x0080 }
                if (r9 == 0) goto L_0x0069
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0080 }
                r0[r5] = r8     // Catch:{ Exception -> 0x0080 }
                r2.countDown()     // Catch:{ Exception -> 0x0080 }
                goto L_0x0079
            L_0x0069:
                com.facebook.internal.WebDialog$f$a r9 = new com.facebook.internal.WebDialog$f$a     // Catch:{ Exception -> 0x0080 }
                r9.<init>(r10, r0, r5, r2)     // Catch:{ Exception -> 0x0080 }
                com.facebook.GraphRequest r8 = com.facebook.share.internal.C12378m.m20215c(r4, r8, r9)     // Catch:{ Exception -> 0x0080 }
                com.facebook.GraphRequestAsyncTask r8 = r8.mo39227d()     // Catch:{ Exception -> 0x0080 }
                r3.add(r8)     // Catch:{ Exception -> 0x0080 }
            L_0x0079:
                int r5 = r5 + 1
                goto L_0x0036
            L_0x007c:
                r2.await()     // Catch:{ Exception -> 0x0080 }
                return r0
            L_0x0080:
                java.util.Iterator r11 = r3.iterator()     // Catch:{ all -> 0x0095 }
            L_0x0084:
                boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0095 }
                if (r0 == 0) goto L_0x0094
                java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x0095 }
                com.facebook.GraphRequestAsyncTask r0 = (com.facebook.GraphRequestAsyncTask) r0     // Catch:{ all -> 0x0095 }
                r0.cancel(r6)     // Catch:{ all -> 0x0095 }
                goto L_0x0084
            L_0x0094:
                return r1
            L_0x0095:
                r11 = move-exception
                p401mg.C13080a.m20761a(r10, r11)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.C12269f.mo39433a(java.lang.Void[]):java.lang.String[]");
        }

        /* renamed from: b */
        public final void mo39434b(String[] strArr) {
            if (!C13080a.m20762b(this)) {
                try {
                    ProgressDialog access$getSpinner$p = this.f27366d.spinner;
                    if (access$getSpinner$p != null) {
                        access$getSpinner$p.dismiss();
                    }
                    for (Exception exc : this.f27363a) {
                        if (exc != null) {
                            this.f27366d.sendErrorToListener(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.f27366d.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List Q0 = C19318k.m32599Q0(strArr);
                    if (Q0.contains((Object) null)) {
                        this.f27366d.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    C12869i0.m20555K(this.f27365c, new JSONArray(Q0));
                    this.f27366d.url = C12869i0.m20563b(C12865g0.m20540a(), this.f27365c, C13418j.m21109e() + "/" + "dialog/" + this.f27364b).toString();
                    ImageView access$getCrossImageView$p = this.f27366d.crossImageView;
                    if (access$getCrossImageView$p != null) {
                        Drawable drawable = access$getCrossImageView$p.getDrawable();
                        C19383o.m32796f(drawable, "checkNotNull(crossImageView).drawable");
                        this.f27366d.setUpWebView((drawable.getIntrinsicWidth() / 2) + 1);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }

        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (C13080a.m20762b(this)) {
                return null;
            }
            try {
                return mo39433a((Void[]) objArr);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
                return null;
            }
        }

        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (!C13080a.m20762b(this)) {
                try {
                    mo39434b((String[]) obj);
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$g */
    public static final class C12271g implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ WebDialog f27371b;

        public C12271g(WebDialog webDialog) {
            this.f27371b = webDialog;
        }

        public final void onClick(View view) {
            if (!C13080a.m20762b(this)) {
                try {
                    this.f27371b.cancel();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$h */
    public static final class C12272h implements DialogInterface.OnCancelListener {

        /* renamed from: b */
        public final /* synthetic */ WebDialog f27372b;

        public C12272h(WebDialog webDialog) {
            this.f27372b = webDialog;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f27372b.cancel();
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$i */
    public static final class C12273i implements View.OnTouchListener {

        /* renamed from: b */
        public static final C12273i f27373b = new C12273i();

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    public /* synthetic */ WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, C12268e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i, loginTargetApp, eVar);
    }

    private final void createCrossImage() {
        ImageView imageView = new ImageView(getContext());
        this.crossImageView = imageView;
        imageView.setOnClickListener(new C12271g(this));
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        Drawable drawable = context.getResources().getDrawable(R.drawable.com_facebook_close);
        ImageView imageView2 = this.crossImageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.crossImageView;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
    }

    private final int getScaledSize(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = MIN_SCALE_FACTOR;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            d = MIN_SCALE_FACTOR + ((((double) (i3 - i4)) / ((double) (i3 - i2))) * MIN_SCALE_FACTOR);
        }
        return (int) (((double) i) * d);
    }

    public static final int getWebDialogTheme() {
        Companion.getClass();
        C12879l0.m20603g();
        return webDialogTheme;
    }

    public static final void initDefaultTheme(Context context) {
        Companion.getClass();
        C12265b.m20112a(context);
    }

    public static final WebDialog newInstance(Context context, String str, Bundle bundle, int i, C12268e eVar) {
        Companion.getClass();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C12265b.m20112a(context);
        return new WebDialog(context, str, bundle, i, LoginTargetApp.FACEBOOK, eVar, (DefaultConstructorMarker) null);
    }

    public static final void setInitCallback(C12267d dVar) {
        Companion.getClass();
        initCallback = dVar;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void setUpWebView(int i) {
        WebSettings settings;
        WebSettings settings2;
        WebSettings settings3;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.webView = new WebDialog$setUpWebView$1(this, getContext());
        C12267d dVar = initCallback;
        if (dVar != null) {
            dVar.mo39432a();
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setVerticalScrollBarEnabled(false);
        }
        WebView webView3 = this.webView;
        if (webView3 != null) {
            webView3.setHorizontalScrollBarEnabled(false);
        }
        WebView webView4 = this.webView;
        if (webView4 != null) {
            webView4.setWebViewClient(new C12266c());
        }
        WebView webView5 = this.webView;
        if (!(webView5 == null || (settings3 = webView5.getSettings()) == null)) {
            settings3.setJavaScriptEnabled(true);
        }
        WebView webView6 = this.webView;
        if (webView6 != null) {
            String str = this.url;
            if (str != null) {
                webView6.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        WebView webView7 = this.webView;
        if (webView7 != null) {
            webView7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView8 = this.webView;
        if (webView8 != null) {
            webView8.setVisibility(4);
        }
        WebView webView9 = this.webView;
        if (!(webView9 == null || (settings2 = webView9.getSettings()) == null)) {
            settings2.setSavePassword(false);
        }
        WebView webView10 = this.webView;
        if (!(webView10 == null || (settings = webView10.getSettings()) == null)) {
            settings.setSaveFormData(false);
        }
        WebView webView11 = this.webView;
        if (webView11 != null) {
            webView11.setFocusable(true);
        }
        WebView webView12 = this.webView;
        if (webView12 != null) {
            webView12.setFocusableInTouchMode(true);
        }
        WebView webView13 = this.webView;
        if (webView13 != null) {
            webView13.setOnTouchListener(C12273i.f27373b);
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.webView);
        linearLayout.setBackgroundColor(BACKGROUND_GRAY);
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    public static final void setWebDialogTheme(int i) {
        Companion.getClass();
        if (i == 0) {
            i = DEFAULT_THEME;
        }
        webDialogTheme = i;
    }

    public void cancel() {
        if (this.onCompleteListener != null && !this.isListenerCalled) {
            sendErrorToListener(new FacebookOperationCanceledException());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.stopLoading();
        }
        if (!this.isDetached && (progressDialog = this.spinner) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final C12268e getOnCompleteListener() {
        return this.onCompleteListener;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final boolean isListenerCalled() {
        return this.isListenerCalled;
    }

    public final boolean isPageFinished() {
        return this.isPageFinished;
    }

    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        boolean z = false;
        this.isDetached = false;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        int i = C12869i0.f28368a;
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            z = true;
        }
        if (z && (layoutParams = this.windowParams) != null) {
            IBinder iBinder = null;
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                StringBuilder h = C0072d.m201h("Set token on onAttachedToWindow(): ");
                WindowManager.LayoutParams layoutParams2 = this.windowParams;
                if (layoutParams2 != null) {
                    iBinder = layoutParams2.token;
                }
                h.append(iBinder);
                C12869i0.m20551G(LOG_TAG, h.toString());
            }
        }
        super.onAttachedToWindow();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.spinner = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.spinner;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.spinner;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.spinner;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new C12272h(this));
        }
        requestWindowFeature(1);
        this.contentFrameLayout = new FrameLayout(getContext());
        resize();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        createCrossImage();
        if (this.url != null) {
            ImageView imageView = this.crossImageView;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                C19383o.m32796f(drawable, "checkNotNull(crossImageView).drawable");
                setUpWebView((drawable.getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.contentFrameLayout;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public void onDetachedFromWindow() {
        this.isDetached = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "event");
        if (i == 4) {
            WebView webView2 = this.webView;
            if (webView2 == null || webView2 == null || !webView2.canGoBack()) {
                cancel();
            } else {
                WebView webView3 = this.webView;
                if (webView3 != null) {
                    webView3.goBack();
                }
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onStart() {
        super.onStart();
        C12269f fVar = this.uploadTask;
        if (fVar != null) {
            if ((fVar != null ? fVar.getStatus() : null) == AsyncTask.Status.PENDING) {
                C12269f fVar2 = this.uploadTask;
                if (fVar2 != null) {
                    fVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.spinner;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        resize();
    }

    public void onStop() {
        C12269f fVar = this.uploadTask;
        if (fVar != null) {
            fVar.cancel(true);
            ProgressDialog progressDialog = this.spinner;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        C19383o.m32797g(layoutParams, ResponseConstants.PARAMS);
        if (layoutParams.token == null) {
            this.windowParams = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    public Bundle parseResponseUri(String str) {
        Uri parse = Uri.parse(str);
        C19383o.m32796f(parse, "u");
        Bundle J = C12869i0.m20554J(parse.getQuery());
        J.putAll(C12869i0.m20554J(parse.getFragment()));
        return J;
    }

    public final void resize() {
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            int i3 = i < i2 ? i : i2;
            if (i < i2) {
                i = i2;
            }
            int min = Math.min(getScaledSize(i3, displayMetrics.density, NO_PADDING_SCREEN_WIDTH, LogSeverity.EMERGENCY_VALUE), displayMetrics.widthPixels);
            int min2 = Math.min(getScaledSize(i, displayMetrics.density, LogSeverity.EMERGENCY_VALUE, MAX_PADDING_SCREEN_HEIGHT), displayMetrics.heightPixels);
            Window window = getWindow();
            if (window != null) {
                window.setLayout(min, min2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final void sendErrorToListener(Throwable th) {
        if (this.onCompleteListener != null && !this.isListenerCalled) {
            this.isListenerCalled = true;
            FacebookException facebookException = th instanceof FacebookException ? (FacebookException) th : new FacebookException(th);
            C12268e eVar = this.onCompleteListener;
            if (eVar != null) {
                eVar.mo39379a((Bundle) null, facebookException);
            }
            dismiss();
        }
    }

    public final void sendSuccessToListener(Bundle bundle) {
        C12268e eVar = this.onCompleteListener;
        if (eVar != null && !this.isListenerCalled) {
            this.isListenerCalled = true;
            if (eVar != null) {
                eVar.mo39379a(bundle, (FacebookException) null);
            }
            dismiss();
        }
    }

    public final void setExpectedRedirectUrl(String str) {
        C19383o.m32797g(str, "expectedRedirectUrl");
        this.expectedRedirectUrl = str;
    }

    public final void setOnCompleteListener(C12268e eVar) {
        this.onCompleteListener = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebDialog(Context context, String str) {
        this(context, str, webDialogTheme);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "url");
        Companion.getClass();
        C12879l0.m20603g();
    }

    public static final WebDialog newInstance(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, C12268e eVar) {
        Companion.getClass();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(loginTargetApp, "targetApp");
        C12265b.m20112a(context);
        return new WebDialog(context, str, bundle, i, loginTargetApp, eVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private WebDialog(android.content.Context r1, java.lang.String r2, int r3) {
        /*
            r0 = this;
            if (r3 != 0) goto L_0x000e
            com.facebook.internal.WebDialog$b r3 = Companion
            r3.getClass()
            p365hg.C12879l0.m20603g()
            int r3 = webDialogTheme
        L_0x000e:
            r0.<init>(r1, r3)
            java.lang.String r1 = "fbconnect://success"
            r0.expectedRedirectUrl = r1
            r0.url = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.<init>(android.content.Context, java.lang.String, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private WebDialog(android.content.Context r4, java.lang.String r5, android.os.Bundle r6, int r7, com.facebook.login.LoginTargetApp r8, com.facebook.internal.WebDialog.C12268e r9) {
        /*
            r3 = this;
            if (r7 != 0) goto L_0x000e
            com.facebook.internal.WebDialog$b r7 = Companion
            r7.getClass()
            p365hg.C12879l0.m20603g()
            int r7 = webDialogTheme
        L_0x000e:
            r3.<init>(r4, r7)
            java.lang.String r7 = "fbconnect://success"
            r3.expectedRedirectUrl = r7
            if (r6 != 0) goto L_0x001c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L_0x001c:
            boolean r4 = p365hg.C12869i0.m20586y(r4)
            if (r4 == 0) goto L_0x0024
            java.lang.String r7 = "fbconnect://chrome_os_success"
        L_0x0024:
            r3.expectedRedirectUrl = r7
            java.lang.String r4 = "redirect_uri"
            r6.putString(r4, r7)
            java.lang.String r4 = "display"
            java.lang.String r7 = "touch"
            r6.putString(r4, r7)
            java.lang.String r4 = p453tf.C13418j.m21107c()
            java.lang.String r7 = "client_id"
            r6.putString(r7, r4)
            java.util.Locale r4 = java.util.Locale.ROOT
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r1 = 0
            java.lang.String r2 = "12.3.0"
            r0[r1] = r2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            java.lang.String r1 = "android-%s"
            java.lang.String r4 = java.lang.String.format(r4, r1, r0)
            java.lang.String r0 = "java.lang.String.format(locale, format, *args)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            java.lang.String r0 = "sdk"
            r6.putString(r0, r4)
            r3.onCompleteListener = r9
            java.lang.String r4 = "share"
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r5, r4)
            if (r4 == 0) goto L_0x0073
            java.lang.String r4 = "media"
            boolean r4 = r6.containsKey(r4)
            if (r4 == 0) goto L_0x0073
            com.facebook.internal.WebDialog$f r4 = new com.facebook.internal.WebDialog$f
            r4.<init>(r3, r5, r6)
            r3.uploadTask = r4
            goto L_0x00b3
        L_0x0073:
            int[] r4 = p365hg.C12881m0.f28396a
            int r8 = r8.ordinal()
            r4 = r4[r8]
            if (r4 == r7) goto L_0x00a3
            java.lang.String r4 = p365hg.C12865g0.m20540a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = p453tf.C13418j.m21109e()
            r7.append(r8)
            java.lang.String r8 = "/"
            r7.append(r8)
            java.lang.String r8 = "dialog/"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.net.Uri r4 = p365hg.C12869i0.m20563b(r4, r6, r5)
            goto L_0x00ad
        L_0x00a3:
            java.lang.String r4 = p365hg.C12865g0.m20542c()
            java.lang.String r5 = "oauth/authorize"
            android.net.Uri r4 = p365hg.C12869i0.m20563b(r4, r6, r5)
        L_0x00ad:
            java.lang.String r4 = r4.toString()
            r3.url = r4
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.<init>(android.content.Context, java.lang.String, android.os.Bundle, int, com.facebook.login.LoginTargetApp, com.facebook.internal.WebDialog$e):void");
    }
}
