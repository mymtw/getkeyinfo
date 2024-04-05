package com.qualtrics.digital;

import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import p568fn.C17782b;
import retrofit2.C20089b;
import retrofit2.C20092d;
import retrofit2.C20145v;

/* renamed from: com.qualtrics.digital.x */
public final class C17318x {

    /* renamed from: e */
    public static String f37845e = "MobileAndroid";

    /* renamed from: f */
    public static C17318x f37846f;

    /* renamed from: a */
    public C17303j f37847a;

    /* renamed from: b */
    public String f37848b;

    /* renamed from: c */
    public String f37849c;

    /* renamed from: d */
    public Double f37850d = Double.valueOf(ShadowDrawableWrapper.COS_45);

    /* renamed from: com.qualtrics.digital.x$a */
    public class C17319a implements C20092d<Void> {
        /* renamed from: j */
        public final void mo1135j(C20089b<Void> bVar, Throwable th) {
            StringBuilder h = C0072d.m201h("Post error log onFailure: ");
            h.append(th.getMessage());
            Log.e("Qualtrics", h.toString(), th);
        }

        /* renamed from: m */
        public final void mo1137m(C20089b<Void> bVar, C20145v<Void> vVar) {
            StringBuilder h = C0072d.m201h("Post error log onResponse: ");
            h.append(vVar.f44614a.f44365f);
            Log.i("Qualtrics", h.toString());
        }
    }

    /* renamed from: com.qualtrics.digital.x$b */
    public class C17320b implements C20092d<Void> {
        /* renamed from: j */
        public final void mo1135j(C20089b<Void> bVar, Throwable th) {
            StringBuilder h = C0072d.m201h("Error recording click: ");
            h.append(th.getMessage());
            Log.e("Qualtrics", h.toString());
        }

        /* renamed from: m */
        public final void mo1137m(C20089b<Void> bVar, C20145v<Void> vVar) {
            Log.i("Qualtrics", "Click recorded");
        }
    }

    /* renamed from: a */
    public static C17318x m29067a() {
        if (f37846f == null) {
            f37846f = new C17318x();
        }
        return f37846f;
    }

    /* renamed from: b */
    public static void m29068b(String str) {
        Log.e("Qualtrics", String.format(Locale.US, "%s %s %s", new Object[]{"Service not initialized, ", str, " cannot be performed"}));
    }

    /* renamed from: c */
    public final void mo68224c(Throwable th) {
        StringBuilder sb = new StringBuilder(th instanceof NullPointerException ? "Null pointer exception" : th.getMessage());
        sb.append("\\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        Log.e("Qualtrics", sb.toString());
        if (this.f37847a == null) {
            m29068b("post error");
        } else if (C17782b.m29845K(this.f37850d)) {
            this.f37847a.mo68215b("error", sb.toString(), "ClientLog", f37845e, "1.8", Build.VERSION.RELEASE + "_" + Build.VERSION.SDK_INT, Build.MANUFACTURER + "_" + Build.MODEL).mo74362G(new C17319a());
        }
    }

    /* renamed from: d */
    public final void mo68225d(String str, String str2, String str3) {
        if (this.f37847a == null) {
            m29068b("record click");
            return;
        }
        Log.i("Qualtrics", "Recording click...");
        this.f37847a.mo68217d(1, this.f37849c, str, str2, str3, this.f37848b, (System.currentTimeMillis() / 1000) + "", f37845e, "1.8", Build.VERSION.RELEASE + "_" + Build.VERSION.SDK_INT, Build.MANUFACTURER + "_" + Build.MODEL).mo74362G(new C17320b());
    }
}
