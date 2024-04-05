package p291y3;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p156k.C7167d;
import p291y3.C8373c;
import p291y3.C8386j;

/* renamed from: y3.h */
public final class C8383h extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C8386j.C8387a f18380a;

    /* renamed from: b */
    public final /* synthetic */ String f18381b;

    /* renamed from: c */
    public final /* synthetic */ Context f18382c;

    /* renamed from: d */
    public final /* synthetic */ Uri f18383d;

    public C8383h(C8373c cVar, String str, Context context, Uri uri) {
        this.f18380a = cVar;
        this.f18381b = str;
        this.f18382c = context;
        this.f18383d = uri;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C8386j.f18388a = null;
        if (this.f18381b != null) {
            Context context = this.f18382c;
            Uri uri = this.f18383d;
            C8386j.C8387a aVar = this.f18380a;
            String a = C8386j.m16727a(context);
            if (a != null) {
                C7167d.m13828a(context, a, new C8384i(uri, aVar));
                return;
            }
            return;
        }
        C8373c cVar = (C8373c) this.f18380a;
        cVar.getClass();
        Log.d("BitlySDK", "Bitly SDK correlator completed");
        C8373c.C8374a aVar2 = cVar.f18361b;
        if (aVar2 != null) {
            Context context2 = ((C8370a) aVar2).f18350a;
            PreferenceManager.getDefaultSharedPreferences(context2).edit().putBoolean("bitly.should.check.deeplink", true).apply();
            C8375d.m16722a(context2, 0, true);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ((C8373c) this.f18380a).getClass();
        Log.d("BitlySDK", "Bitly SDK correlator started");
    }
}
