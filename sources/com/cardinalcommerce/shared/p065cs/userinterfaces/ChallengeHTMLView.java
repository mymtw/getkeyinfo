package com.cardinalcommerce.shared.p065cs.userinterfaces;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.C3039b;
import com.cardinalcommerce.cardinalmobilesdk.p045a.p047c.C6139d;
import com.cardinalcommerce.emvco.p063a.p064e.C6260c;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import com.cardinalcommerce.shared.p065cs.p070f.C6297o;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.C6323c;
import com.cardinalcommerce.shared.p065cs.userinterfaces.uielements.CCATextView;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import com.etsy.android.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Set;
import p237s8.C7906b;
import p247t8.C8045c;
import p247t8.C8046d;
import p257u8.C8171a;
import p257u8.C8178g;

/* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView */
public class ChallengeHTMLView extends AppCompatActivity implements C7906b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f14004a;

    /* renamed from: b */
    private C6272b f14005b;

    /* renamed from: c */
    private boolean f14006c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ProgressBar f14007d;

    /* renamed from: e */
    private BroadcastReceiver f14008e = new C6299a();

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView$a */
    public class C6299a extends BroadcastReceiver {
        public C6299a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("finish_activity")) {
                C6297o b = C6297o.m12685b(ChallengeHTMLView.this.getApplicationContext());
                C6260c cVar = b.f13997k;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                C6139d dVar = b.f13998l;
                if (dVar != null) {
                    dVar.cancel(true);
                }
                ChallengeHTMLView.this.finish();
            }
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView$b */
    public class C6300b implements C6323c.C6324a {
        public C6300b() {
        }

        public final void onClick(View view) {
            ChallengeHTMLView.this.m12704c();
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView$c */
    public class C6301c extends WebViewClient {
        public C6301c() {
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.isEmpty()) {
                return false;
            }
            ChallengeHTMLView.this.m12694a(Uri.parse(str));
            return false;
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView$d */
    public class C6302d implements Runnable {
        public C6302d() {
        }

        public final void run() {
            ChallengeHTMLView.this.f14004a.stopLoading();
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView$e */
    public class C6303e implements Runnable {
        public C6303e() {
        }

        public final void run() {
            ChallengeHTMLView.this.getWindow().setFlags(16, 16);
            ChallengeHTMLView.this.f14007d.setVisibility(0);
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView$f */
    public class C6304f implements Runnable {
        public C6304f() {
        }

        public final void run() {
            ChallengeHTMLView.this.getWindow().clearFlags(16);
            ChallengeHTMLView.this.f14007d.setVisibility(8);
        }
    }

    /* renamed from: com.cardinalcommerce.shared.cs.userinterfaces.ChallengeHTMLView$g */
    public class C6305g implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C6272b f14015b;

        public C6305g(C6272b bVar) {
            this.f14015b = bVar;
        }

        public final void run() {
            ChallengeHTMLView.this.m12702b(this.f14015b);
            ChallengeHTMLView.this.m12708f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12694a(Uri uri) {
        new Handler(getMainLooper()).post(new C6302d());
        if (!uri.toString().contains("data:text/html")) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            StringBuilder sb = new StringBuilder();
            try {
                for (String next : queryParameterNames) {
                    if (!sb.toString().isEmpty()) {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(next, StandardCharsets.UTF_8.toString()));
                    sb.append("=");
                    sb.append(URLEncoder.encode(uri.getQueryParameter(next), StandardCharsets.UTF_8.toString()));
                }
                m12699a(C3039b.m7190y(sb.toString()));
            } catch (UnsupportedEncodingException unused) {
                m12705d();
            }
        }
    }

    /* renamed from: a */
    private void m12698a(C8045c cVar) {
        m12707e();
        C6297o.m12685b(getApplicationContext()).mo17852e(cVar, this, "05");
    }

    /* renamed from: b */
    private void m12701b() {
        String d = this.f14005b.mo17773d();
        if (!d.equalsIgnoreCase("")) {
            String str = new String(Base64.decode(d, 8), StandardCharsets.UTF_8);
            if (!str.isEmpty()) {
                this.f14004a.loadDataWithBaseURL("HTTPS://EMV3DS/challenge/refresh", str, "text/html", "UTF-8", (String) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12702b(C6272b bVar) {
        String replaceAll = new String(Base64.decode(bVar.mo17772c(), 8), StandardCharsets.UTF_8).replaceAll("\"POST\"", "\"GET\"").replaceAll("\"post\"", "\"get\"").replaceAll("<input type=\"submit\"", "<input type=\"submit\" name=\"submit\"");
        if (!replaceAll.isEmpty()) {
            this.f14004a.loadDataWithBaseURL("HTTPS://EMV3DS/challenge", replaceAll, "text/html", "UTF-8", (String) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12704c() {
        C8046d dVar = new C8046d();
        dVar.f17559a = C8171a.f17933f;
        m12698a(new C8045c(this.f14005b, dVar));
    }

    /* renamed from: d */
    private void m12705d() {
        C8046d dVar = new C8046d();
        dVar.f17559a = C8171a.f17934g;
        m12698a(new C8045c(this.f14005b, dVar));
    }

    /* renamed from: e */
    private void m12707e() {
        runOnUiThread(new C6303e());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m12708f() {
        runOnUiThread(new C6304f());
    }

    /* renamed from: a */
    public void mo17857a() {
        m12708f();
        finish();
    }

    /* renamed from: a */
    public void mo17858a(C6272b bVar) {
        runOnUiThread(new C6305g(bVar));
    }

    public void onBackPressed() {
        m12708f();
        m12704c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.f14008e, new IntentFilter("finish_activity"));
        char[] cArr = C8171a.f17928a;
        getWindow().setFlags(8192, 8192);
        Bundle extras = getIntent().getExtras();
        Objects.requireNonNull(extras);
        Bundle bundle2 = extras;
        this.f14005b = (C6272b) extras.getSerializable("StepUpData");
        UiCustomization uiCustomization = (UiCustomization) getIntent().getExtras().getSerializable("UiCustomization");
        setContentView((int) R.layout.activity_html_ui_view);
        CCATextView cCATextView = (CCATextView) findViewById(R.id.toolbarButton);
        cCATextView.setCCAOnClickListener(new C6300b());
        this.f14007d = (ProgressBar) findViewById(R.id.pbHeaderProgress);
        WebView webView = (WebView) findViewById(R.id.webviewUi);
        this.f14004a = webView;
        webView.getSettings().setJavaScriptEnabled(false);
        this.f14004a.setWebViewClient(new C6301c());
        m12702b(this.f14005b);
        C8178g.m16452d(cCATextView, uiCustomization, this);
        C8178g.m16450b((Toolbar) findViewById(R.id.toolbar), uiCustomization, this);
    }

    public void onDestroy() {
        unregisterReceiver(this.f14008e);
        super.onDestroy();
    }

    public void onPause() {
        this.f14006c = true;
        super.onPause();
    }

    public void onResume() {
        if (this.f14006c) {
            m12701b();
        }
        super.onResume();
    }

    /* renamed from: a */
    private void m12699a(char[] cArr) {
        C8046d dVar = new C8046d();
        dVar.f17561c = cArr;
        m12698a(new C8045c(this.f14005b, dVar));
    }
}
