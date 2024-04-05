package com.cardinalcommerce.cardinalmobilesdk.p045a.p047c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.p013v4.media.C0072d;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import p139i5.C6993a;

/* renamed from: com.cardinalcommerce.cardinalmobilesdk.a.c.a */
public class C6133a extends AsyncTask<Void, Void, Void> {
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public WebView f13247a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f13248b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public byte[] f13249c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f13250d;
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    public final Context f13251e;

    /* renamed from: f */
    private final Handler f13252f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6993a f13253g;

    /* renamed from: com.cardinalcommerce.cardinalmobilesdk.a.c.a$a */
    public class C6134a implements Runnable {

        /* renamed from: com.cardinalcommerce.cardinalmobilesdk.a.c.a$a$a */
        public class C6135a extends WebViewClient {
            public C6135a() {
            }

            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                C6993a c = C6133a.this.f13253g;
                c.getClass();
                c.mo19177d(String.valueOf(10404), str + i, (String) null);
            }

            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                C6993a c = C6133a.this.f13253g;
                String sslError2 = sslError.toString();
                c.getClass();
                c.mo19177d(String.valueOf(10412), sslError2, (String) null);
                sslErrorHandler.cancel();
            }
        }

        public C6134a() {
        }

        @SuppressLint({"SetJavaScriptEnabled"})
        public final void run() {
            WebView unused = C6133a.this.f13247a = new WebView(C6133a.this.f13251e);
            C6133a.this.f13247a.getSettings().setJavaScriptEnabled(true);
            C6133a.this.f13247a.getSettings().setDomStorageEnabled(true);
            C6133a.this.f13247a.setWebViewClient(new C6135a());
            if (!C6133a.this.f13250d || C6133a.this.f13249c == null) {
                C6133a.this.f13247a.loadUrl(C6133a.this.f13248b);
            } else {
                C6133a.this.f13247a.postUrl(C6133a.this.f13248b, C6133a.this.f13249c);
            }
        }
    }

    public C6133a(Context context, String str) {
        C6993a g = C6993a.m13555g();
        this.f13253g = g;
        g.mo19175a("CardinalProcessBin", "Bin profiling initialized", (String) null);
        this.f13252f = new Handler(context.getMainLooper());
        this.f13248b = m12248a(str);
        this.f13250d = false;
        this.f13251e = context;
        m12249a();
    }

    /* renamed from: a */
    private String m12248a(String str) {
        try {
            URI uri = new URI(str);
            String query = uri.getQuery();
            String str2 = "origin=" + URLEncoder.encode("CardinalMobileSdk_Android", "UTF-8");
            if (query != null) {
                str2 = query + "&" + str2;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
        } catch (UnsupportedEncodingException | URISyntaxException e) {
            C6993a aVar = this.f13253g;
            StringBuilder h = C0072d.m201h("Unsupported Encoding Exception \n");
            h.append(e.getLocalizedMessage());
            aVar.mo19177d("CardinalProcessBin", h.toString(), (String) null);
            return "";
        }
    }

    /* renamed from: a */
    private void m12249a() {
        m12250a((Runnable) new C6134a());
    }

    /* renamed from: a */
    private void m12250a(Runnable runnable) {
        this.f13252f.post(runnable);
    }

    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        return null;
    }

    public C6133a(Context context, String str, String str2) {
        String str3;
        C6993a g = C6993a.m13555g();
        this.f13253g = g;
        g.mo19175a("CardinalProcessBin", "Bin profiling initialized with account number", (String) null);
        this.f13248b = m12248a(str);
        try {
            str3 = "bin=" + URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C6993a aVar = this.f13253g;
            StringBuilder h = C0072d.m201h("Unsupported Encoding Exception \n");
            h.append(e.getLocalizedMessage());
            aVar.mo19177d("CardinalProcessBin", h.toString(), (String) null);
            str3 = "";
        }
        this.f13249c = str3.getBytes();
        this.f13250d = true;
        this.f13251e = context;
        this.f13252f = new Handler(context.getMainLooper());
        m12249a();
    }
}
