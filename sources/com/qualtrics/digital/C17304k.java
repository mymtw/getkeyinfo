package com.qualtrics.digital;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import com.bugsnag.android.C5747g0;
import com.etsy.android.lib.network.oauth2.signin.C8778g;
import com.google.gson.C16708i;
import com.google.gson.C16796j;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import okhttp3.logging.HttpLoggingInterceptor;
import p568fn.C17782b;
import p753kq.C19857l;
import p767qr.C20071a;
import retrofit2.C20089b;
import retrofit2.C20092d;
import retrofit2.C20145v;
import retrofit2.C20146w;

/* renamed from: com.qualtrics.digital.k */
public final class C17304k {

    /* renamed from: a */
    public String f37824a;

    /* renamed from: b */
    public boolean f37825b = false;

    /* renamed from: c */
    public int f37826c = 0;

    /* renamed from: d */
    public WeakReference<C17302i> f37827d;

    /* renamed from: com.qualtrics.digital.k$a */
    public class C17305a implements C20092d<C17313s> {

        /* renamed from: b */
        public final /* synthetic */ C17307m f37828b;

        public C17305a(C17307m mVar) {
            this.f37828b = mVar;
        }

        /* renamed from: j */
        public final void mo1135j(C20089b<C17313s> bVar, Throwable th) {
            this.f37828b.mo68221a();
            Log.e("Qualtrics", "Unexpected response getting asset versions");
            Log.e("Qualtrics", th.toString());
            WeakReference<C17302i> weakReference = C17304k.this.f37827d;
            if (weakReference != null && weakReference.get() != null) {
                C17304k.this.f37827d.get().mo30564a(new C5747g0(th.toString(), Boolean.FALSE));
            }
        }

        /* renamed from: m */
        public final void mo1137m(C20089b<C17313s> bVar, C20145v<C17313s> vVar) {
            C17318x a = C17318x.m29067a();
            String str = C17304k.this.f37824a;
            if (a.f37847a == null) {
                C17318x.m29068b("record page view");
            } else {
                Log.i("Qualtrics", "Recording page view...");
                a.f37847a.mo68214a(1, a.f37849c, str, (String) null, (String) null, a.f37848b, (System.currentTimeMillis() / 1000) + "", C17318x.f37845e, "1.8", Build.VERSION.RELEASE + "_" + Build.VERSION.SDK_INT, Build.MANUFACTURER + "_" + Build.MODEL).mo74362G(new C17782b());
            }
            C17313s sVar = (C17313s) vVar.f44615b;
            C17304k kVar = C17304k.this;
            if (sVar == null) {
                kVar.mo68220c("Could not deserialize asset versions");
            } else {
                kVar.mo68220c("Expected ExecutionEnabled field not present for intercept");
            }
        }
    }

    public C17304k(Context context, String str, String str2, String str3) {
        this.f37824a = str3;
        String packageName = context.getPackageName();
        C17318x a = C17318x.m29067a();
        String lowerCase = str2.replace("_", "").toLowerCase();
        a.f37848b = packageName;
        a.f37849c = str;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        C19383o.m32797g(level, "level");
        httpLoggingInterceptor.f44224c = level;
        C16796j jVar = new C16796j();
        jVar.mo59628b(new LogicDeserializer(), C17309o.class);
        C16708i a2 = jVar.mo59627a();
        C20146w.C20148b bVar = new C20146w.C20148b();
        bVar.mo74394b(String.format(Locale.US, "https://%s-%s.%s", new Object[]{lowerCase, str, "siteintercept.qualtrics.com"}));
        C20009t.C20010a aVar = new C20009t.C20010a();
        aVar.mo72993a(new C17317w(a.f37848b));
        aVar.mo72993a(httpLoggingInterceptor);
        bVar.f44628b = new C20009t(aVar);
        bVar.f44630d.add(new C20071a(a2));
        C20146w c = bVar.mo74395c();
        SharedPreferences a3 = C17315u.m29063a().f37842a.mo68223a();
        String string = a3 != null ? a3.getString("Qualtrics_IS_REACT_NATIVE", (String) null) : null;
        if (string != null && string.equals("true")) {
            C17318x.f37845e = "MobileAndroidReactNative";
        }
        a.f37847a = (C17303j) c.mo74387b(C17303j.class);
        if (C17308n.f37832g == null) {
            C17308n.f37832g = new C17308n();
        }
        C17308n nVar = C17308n.f37832g;
        nVar.f37835c = packageName;
        nVar.f37836d = str;
        nVar.f37837e = str2;
        nVar.f37838f = str3;
        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor();
        httpLoggingInterceptor2.f44224c = level;
        C20146w.C20148b bVar2 = new C20146w.C20148b();
        bVar2.mo74394b("https://survey.qualtrics.com");
        C20009t.C20010a aVar2 = new C20009t.C20010a();
        aVar2.mo72993a(new C17317w(nVar.f37835c));
        aVar2.mo72993a(httpLoggingInterceptor2);
        bVar2.f44628b = new C20009t(aVar2);
        bVar2.f44630d.add(new C20071a(new C16708i()));
        nVar.f37833a = (C17301h) bVar2.mo74395c().mo74387b(C17301h.class);
    }

    /* renamed from: a */
    public final void mo68218a(C8778g gVar) {
        boolean z = this.f37825b;
        boolean z2 = true;
        if (this.f37826c > 2) {
            Log.i("Qualtrics", "Maximum number of retries performed");
        } else {
            WeakReference<C17302i> weakReference = this.f37827d;
            if (weakReference == null || weakReference.get() == null) {
                mo68219b();
            } else {
                this.f37827d = new WeakReference<>(this.f37827d.get());
                mo68219b();
            }
            this.f37826c++;
        }
        TargetingResultStatus targetingResultStatus = TargetingResultStatus.error;
        C19383o.m32797g((C19857l) gVar.f19320b, "$callback");
        if (targetingResultStatus != TargetingResultStatus.passed) {
            z2 = false;
        }
        if (z2) {
            C19383o.m32796f((Object) null, "it.surveyUrl");
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo68219b() {
        StringBuilder h = C0072d.m201h("/SIE/AssetVersions.php?Q_InterceptID=");
        h.append(this.f37824a);
        C17307m mVar = new C17307m("assetVersions", h.toString());
        C17318x a = C17318x.m29067a();
        String str = this.f37824a;
        C17305a aVar = new C17305a(mVar);
        C17303j jVar = a.f37847a;
        if (jVar == null) {
            C17318x.m29068b("get asset versions");
            return;
        }
        jVar.mo68216c(str, C17318x.f37845e, "1.8", Build.VERSION.RELEASE + "_" + Build.VERSION.SDK_INT, Build.MANUFACTURER + "_" + Build.MODEL).mo74362G(aVar);
    }

    /* renamed from: c */
    public final void mo68220c(String str) {
        Log.e("Qualtrics", str + ", aborting SDK initialization...");
        WeakReference<C17302i> weakReference = this.f37827d;
        if (weakReference != null && weakReference.get() != null) {
            this.f37827d.get().mo30564a(new C5747g0(C0326j.m864i(str, ", aborting SDK initialization..."), Boolean.FALSE));
        }
    }
}
