package com.etsy.android.qualtrics;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.play.core.appupdate.C15562d;
import com.qualtrics.digital.C17304k;
import com.qualtrics.digital.C17314t;
import com.qualtrics.digital.C17315u;
import com.qualtrics.digital.C17318x;
import com.qualtrics.digital.QualtricsNotificationManager;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.qualtrics.f */
public final /* synthetic */ class C8963f implements Callable {

    /* renamed from: b */
    public final /* synthetic */ QualtricsWrapper f19760b;

    /* renamed from: c */
    public final /* synthetic */ String f19761c;

    /* renamed from: d */
    public final /* synthetic */ String f19762d;

    /* renamed from: e */
    public final /* synthetic */ String f19763e;

    /* renamed from: f */
    public final /* synthetic */ Context f19764f;

    public /* synthetic */ C8963f(QualtricsWrapper qualtricsWrapper, String str, String str2, String str3, Context context) {
        this.f19760b = qualtricsWrapper;
        this.f19761c = str;
        this.f19762d = str2;
        this.f19763e = str3;
        this.f19764f = context;
    }

    public final Object call() {
        QualtricsWrapper qualtricsWrapper = this.f19760b;
        String str = this.f19761c;
        String str2 = this.f19762d;
        String str3 = this.f19763e;
        Context context = this.f19764f;
        C19383o.m32797g(qualtricsWrapper, "this$0");
        C19383o.m32797g(str, "$brandId");
        C19383o.m32797g(str2, "$projectId");
        C19383o.m32797g(str3, "$interceptId");
        C19383o.m32797g(context, "$context");
        C17315u a = C17315u.m29063a();
        C19383o.m32796f(a, "instance()");
        C8962e eVar = qualtricsWrapper.f19746d;
        try {
            if (!C17315u.m29064b("ZN", str2)) {
                Log.e("Qualtrics", String.format(Locale.US, "Invalid %s, initialization cancelled", new Object[]{"zone ID"}));
                if (eVar != null) {
                    QualtricsWrapper qualtricsWrapper2 = eVar.f19759a;
                    C19383o.m32797g(qualtricsWrapper2, "this$0");
                    qualtricsWrapper2.f19745c.set(false);
                }
            } else if (!C17315u.m29064b("SI", str3)) {
                Log.e("Qualtrics", String.format(Locale.US, "Invalid %s, initialization cancelled", new Object[]{"intercept ID"}));
                if (eVar != null) {
                    QualtricsWrapper qualtricsWrapper3 = eVar.f19759a;
                    C19383o.m32797g(qualtricsWrapper3, "this$0");
                    qualtricsWrapper3.f19745c.set(false);
                }
            } else {
                if (C15562d.f35021f == null) {
                    C15562d.f35021f = new C15562d();
                }
                C15562d.f35021f.getClass();
                long timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
                QualtricsNotificationManager.createChannel(context);
                C17314t tVar = a.f37842a;
                tVar.getClass();
                if (context instanceof Application) {
                    tVar.f37840a = context;
                } else {
                    tVar.f37840a = context.getApplicationContext();
                }
                C17304k kVar = new C17304k(context, str, str2, str3);
                a.f37843b = kVar;
                if (eVar != null) {
                    kVar.f37827d = new WeakReference<>(eVar);
                    kVar.mo68219b();
                } else {
                    kVar.mo68219b();
                }
            }
        } catch (Throwable th) {
            C17318x.m29067a().mo68224c(th);
        }
        return C19394m.f43287a;
    }
}
