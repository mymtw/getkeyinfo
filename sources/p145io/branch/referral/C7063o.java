package p145io.branch.referral;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.requests.EtsyRequest;
import java.net.URI;
import java.net.URISyntaxException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.o */
public final class C7063o {

    /* renamed from: h */
    public static C7063o f15718h;

    /* renamed from: a */
    public boolean f15719a;

    /* renamed from: b */
    public boolean f15720b;

    /* renamed from: c */
    public C7065b f15721c = null;

    /* renamed from: d */
    public boolean f15722d = false;

    /* renamed from: e */
    public String f15723e;

    /* renamed from: f */
    public boolean f15724f;

    /* renamed from: g */
    public Dialog f15725g;

    /* renamed from: io.branch.referral.o$a */
    public class C7064a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C7065b f15726a;

        /* renamed from: b */
        public final /* synthetic */ C7066c f15727b;

        /* renamed from: c */
        public final /* synthetic */ WebView f15728c;

        public C7064a(C7065b bVar, C7066c cVar, WebView webView) {
            this.f15726a = bVar;
            this.f15727b = cVar;
            this.f15728c = webView;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C7063o oVar = C7063o.this;
            C7065b bVar = this.f15726a;
            C7066c cVar = this.f15727b;
            WebView webView2 = this.f15728c;
            if (oVar.f15724f || Branch.m13575j() == null || Branch.m13575j().f15586l == null) {
                oVar.f15719a = false;
                if (cVar != null) {
                    ((Branch) cVar).mo19201r(bVar.f15731b);
                    return;
                }
                return;
            }
            Activity activity = Branch.m13575j().f15586l.get();
            if (activity != null) {
                Context applicationContext = activity.getApplicationContext();
                String str2 = bVar.f15730a;
                C7077r h = C7077r.m13677h(applicationContext);
                h.getClass();
                h.f15758b.putInt("bnc_branch_view_use_" + str2, h.mo19319i(0, "bnc_branch_view_use_" + str2) + 1).apply();
                oVar.f15723e = activity.getClass().getName();
                RelativeLayout relativeLayout = new RelativeLayout(activity);
                relativeLayout.setVisibility(8);
                relativeLayout.addView(webView2, new RelativeLayout.LayoutParams(-1, -1));
                relativeLayout.setBackgroundColor(0);
                Dialog dialog = oVar.f15725g;
                if (dialog == null || !dialog.isShowing()) {
                    Dialog dialog2 = new Dialog(activity, 16973834);
                    oVar.f15725g = dialog2;
                    dialog2.setContentView(relativeLayout);
                    relativeLayout.setVisibility(0);
                    webView2.setVisibility(0);
                    oVar.f15725g.show();
                    C7063o.m13657e(relativeLayout);
                    C7063o.m13657e(webView2);
                    oVar.f15719a = true;
                    oVar.f15725g.setOnDismissListener(new C7069p(oVar, cVar, bVar));
                } else if (cVar != null) {
                    ((Branch) cVar).mo19201r(bVar.f15731b);
                }
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C7063o.this.f15724f = true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C7063o oVar = C7063o.this;
            oVar.getClass();
            boolean z = false;
            try {
                URI uri = new URI(str);
                if (uri.getScheme().equalsIgnoreCase("branch-cta")) {
                    if (uri.getHost().equalsIgnoreCase(ResponseConstants.ACCEPT)) {
                        oVar.f15720b = true;
                    } else if (uri.getHost().equalsIgnoreCase("cancel")) {
                        oVar.f15720b = false;
                    }
                    z = true;
                }
            } catch (URISyntaxException unused) {
            }
            if (!z) {
                webView.loadUrl(str);
            } else {
                Dialog dialog = C7063o.this.f15725g;
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
            return z;
        }
    }

    /* renamed from: io.branch.referral.o$b */
    public class C7065b {

        /* renamed from: a */
        public String f15730a = "";

        /* renamed from: b */
        public String f15731b;

        /* renamed from: c */
        public int f15732c = 1;

        /* renamed from: d */
        public String f15733d = "";

        /* renamed from: e */
        public String f15734e = "";

        public C7065b(JSONObject jSONObject, String str) {
            try {
                this.f15731b = str;
                Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.BranchViewID;
                if (jSONObject.has(defines$Jsonkey.getKey())) {
                    this.f15730a = jSONObject.getString(defines$Jsonkey.getKey());
                }
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.BranchViewNumOfUse;
                if (jSONObject.has(defines$Jsonkey2.getKey())) {
                    this.f15732c = jSONObject.getInt(defines$Jsonkey2.getKey());
                }
                Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.BranchViewUrl;
                if (jSONObject.has(defines$Jsonkey3.getKey())) {
                    this.f15733d = jSONObject.getString(defines$Jsonkey3.getKey());
                }
                Defines$Jsonkey defines$Jsonkey4 = Defines$Jsonkey.BranchViewHtml;
                if (jSONObject.has(defines$Jsonkey4.getKey())) {
                    this.f15734e = jSONObject.getString(defines$Jsonkey4.getKey());
                }
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public static boolean m13661a(C7065b bVar, Context context) {
            bVar.getClass();
            C7077r h = C7077r.m13677h(context);
            String str = bVar.f15730a;
            h.getClass();
            int i = h.mo19319i(0, "bnc_branch_view_use_" + str);
            int i2 = bVar.f15732c;
            return i2 > i || i2 == -1;
        }
    }

    /* renamed from: io.branch.referral.o$c */
    public interface C7066c {
    }

    /* renamed from: io.branch.referral.o$d */
    public class C7067d extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public final C7065b f15735a;

        /* renamed from: b */
        public final Context f15736b;

        /* renamed from: c */
        public final C7066c f15737c;

        public C7067d(C7065b bVar, Context context, C7066c cVar) {
            this.f15735a = bVar;
            this.f15736b = context;
            this.f15737c = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object doInBackground(java.lang.Object[] r8) {
            /*
                r7 = this;
                java.lang.Void[] r8 = (java.lang.Void[]) r8
                r8 = 0
                r0 = 200(0xc8, float:2.8E-43)
                r1 = -1
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x004c }
                io.branch.referral.o$b r3 = r7.f15735a     // Catch:{ Exception -> 0x004c }
                java.lang.String r3 = r3.f15733d     // Catch:{ Exception -> 0x004c }
                r2.<init>(r3)     // Catch:{ Exception -> 0x004c }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x004c }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x004c }
                java.lang.String r3 = "GET"
                r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x004c }
                r2.connect()     // Catch:{ Exception -> 0x004c }
                int r3 = r2.getResponseCode()     // Catch:{ Exception -> 0x004c }
                if (r3 != r0) goto L_0x004d
                java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x004b }
                r4.<init>()     // Catch:{ Exception -> 0x004b }
                java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x004b }
                r5 = 1024(0x400, float:1.435E-42)
                byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x004b }
            L_0x0030:
                int r6 = r2.read(r5)     // Catch:{ Exception -> 0x004b }
                if (r6 == r1) goto L_0x003a
                r4.write(r5, r8, r6)     // Catch:{ Exception -> 0x004b }
                goto L_0x0030
            L_0x003a:
                io.branch.referral.o$b r1 = r7.f15735a     // Catch:{ Exception -> 0x004b }
                java.lang.String r5 = "UTF-8"
                java.lang.String r5 = r4.toString(r5)     // Catch:{ Exception -> 0x004b }
                r1.f15734e = r5     // Catch:{ Exception -> 0x004b }
                r4.close()     // Catch:{ Exception -> 0x004b }
                r2.close()     // Catch:{ Exception -> 0x004b }
                goto L_0x004d
            L_0x004b:
                r1 = r3
            L_0x004c:
                r3 = r1
            L_0x004d:
                if (r3 != r0) goto L_0x0050
                r8 = 1
            L_0x0050:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7063o.C7067d.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public final void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                C7063o.this.mo19297a(this.f15735a, this.f15736b, this.f15737c);
            } else {
                C7066c cVar = this.f15737c;
                if (cVar != null) {
                    ((Branch) cVar).mo19201r(this.f15735a.f15731b);
                }
            }
            C7063o.this.f15722d = false;
        }
    }

    /* renamed from: b */
    public static C7063o m13656b() {
        if (f15718h == null) {
            f15718h = new C7063o();
        }
        return f15718h;
    }

    /* renamed from: e */
    public static void m13657e(ViewGroup viewGroup) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setStartOffset(10);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        viewGroup.setVisibility(0);
        viewGroup.startAnimation(alphaAnimation);
    }

    /* renamed from: a */
    public final void mo19297a(C7065b bVar, Context context, C7066c cVar) {
        if (context != null && bVar != null) {
            WebView webView = new WebView(context);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setLayerType(2, (Paint) null);
            this.f15724f = false;
            if (!TextUtils.isEmpty(bVar.f15734e)) {
                webView.loadDataWithBaseURL((String) null, bVar.f15734e, "text/html", EtsyRequest.CONTENT_ENCODING, (String) null);
                webView.setWebViewClient(new C7064a(bVar, cVar, webView));
            }
        }
    }

    /* renamed from: c */
    public final boolean mo19298c(String str, JSONObject jSONObject) {
        Activity activity;
        C7065b bVar = new C7065b(jSONObject, str);
        if (Branch.m13575j().f15586l == null || (activity = Branch.m13575j().f15586l.get()) == null || !C7065b.m13661a(bVar, activity)) {
            return false;
        }
        this.f15721c = new C7065b(jSONObject, str);
        return true;
    }

    /* renamed from: d */
    public final boolean mo19299d(C7065b bVar, Context context, C7066c cVar) {
        if (this.f15719a || this.f15722d) {
            if (cVar != null) {
                ((Branch) cVar).mo19201r(bVar.f15731b);
            }
            return false;
        }
        this.f15719a = false;
        this.f15720b = false;
        if (!(context == null || bVar == null)) {
            if (C7065b.m13661a(bVar, context)) {
                if (!TextUtils.isEmpty(bVar.f15734e)) {
                    mo19297a(bVar, context, cVar);
                } else {
                    this.f15722d = true;
                    new C7067d(bVar, context, cVar).execute(new Void[0]);
                }
                return true;
            } else if (cVar != null) {
                ((Branch) cVar).mo19201r(bVar.f15731b);
            }
        }
        return false;
    }
}
