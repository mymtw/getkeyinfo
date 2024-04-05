package p517bn;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.C16563d;
import com.google.firebase.installations.C16566g;
import com.google.firebase.platforminfo.C16687f;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p149j3.C7107h;
import p575gm.C17793c;
import p604kj.C18096a;
import p604kj.C18110o;
import p604kj.C18111p;
import p604kj.C18112q;
import p604kj.C18115t;
import p605kk.C18123g;
import p605kk.C18126j;
import p628nj.C18263b;
import p722ym.C18895a;

/* renamed from: bn.p */
public final class C14125p {

    /* renamed from: a */
    public final C17793c f31112a;

    /* renamed from: b */
    public final C14129t f31113b;

    /* renamed from: c */
    public final C18096a f31114c;

    /* renamed from: d */
    public final C18895a<C16687f> f31115d;

    /* renamed from: e */
    public final C18895a<HeartBeatInfo> f31116e;

    /* renamed from: f */
    public final C16563d f31117f;

    public C14125p(C17793c cVar, C14129t tVar, C18895a<C16687f> aVar, C18895a<HeartBeatInfo> aVar2, C16563d dVar) {
        cVar.mo69021a();
        C18096a aVar3 = new C18096a(cVar.f38672a);
        this.f31112a = cVar;
        this.f31113b = tVar;
        this.f31114c = aVar3;
        this.f31115d = aVar;
        this.f31116e = aVar2;
        this.f31117f = dVar;
    }

    /* renamed from: a */
    public final void mo47007a(String str, Bundle bundle, String str2) throws ExecutionException, InterruptedException {
        int i;
        String str3;
        String str4;
        String str5;
        HeartBeatInfo.HeartBeat a;
        PackageInfo b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C17793c cVar = this.f31112a;
        cVar.mo69021a();
        bundle.putString("gmp_app_id", cVar.f38674c.f38685b);
        C14129t tVar = this.f31113b;
        synchronized (tVar) {
            if (tVar.f31125d == 0 && (b = tVar.mo47011b("com.google.android.gms")) != null) {
                tVar.f31125d = b.versionCode;
            }
            i = tVar.f31125d;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        C14129t tVar2 = this.f31113b;
        synchronized (tVar2) {
            if (tVar2.f31123b == null) {
                tVar2.mo47013d();
            }
            str3 = tVar2.f31123b;
        }
        bundle.putString("app_ver", str3);
        C14129t tVar3 = this.f31113b;
        synchronized (tVar3) {
            if (tVar3.f31124c == null) {
                tVar3.mo47013d();
            }
            str4 = tVar3.f31124c;
        }
        bundle.putString("app_ver_name", str4);
        C17793c cVar2 = this.f31112a;
        cVar2.mo69021a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(cVar2.f38673b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String token = ((C16566g) C18126j.m30613a(this.f31117f.getToken())).getToken();
            if (!TextUtils.isEmpty(token)) {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) C18126j.m30613a(this.f31117f.getId()));
        bundle.putString("cliv", "fcm-23.0.0");
        HeartBeatInfo heartBeatInfo = this.f31116e.get();
        C16687f fVar = this.f31115d.get();
        if (heartBeatInfo != null && fVar != null && (a = heartBeatInfo.mo59048a("fire-iid")) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a.getCode()));
            bundle.putString("Firebase-Client", fVar.mo59430a());
        }
    }

    /* renamed from: b */
    public final C18123g mo47008b(String str, Bundle bundle, String str2) {
        int i;
        int i2;
        PackageInfo packageInfo;
        try {
            mo47007a(str, bundle, str2);
            C18096a aVar = this.f31114c;
            C18112q qVar = aVar.f39512c;
            synchronized (qVar) {
                if (qVar.f39553b == 0) {
                    try {
                        packageInfo = Wrappers.packageManager(qVar.f39552a).getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(valueOf);
                        Log.w("Metadata", sb.toString());
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        qVar.f39553b = packageInfo.versionCode;
                    }
                }
                i = qVar.f39553b;
            }
            if (i < 12000000) {
                return aVar.f39512c.mo69651a() != 0 ? aVar.mo69627a(bundle).mo69662i(C18115t.f39559b, new C7107h(3, aVar, bundle)) : C18126j.m30616d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            C18111p a = C18111p.m30565a(aVar.f39511b);
            synchronized (a) {
                i2 = a.f39551d;
                a.f39551d = i2 + 1;
            }
            return a.mo69650b(new C18110o(i2, bundle)).mo69660g(C18115t.f39559b, C18263b.f40071j1);
        } catch (InterruptedException | ExecutionException e2) {
            return C18126j.m30616d(e2);
        }
    }
}
