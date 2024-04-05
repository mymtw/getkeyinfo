package com.cardinalcommerce.shared.p065cs.p070f;

import android.os.AsyncTask;
import android.os.Build;
import androidx.preference.C3039b;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.i */
public class C6288i implements Serializable {

    /* renamed from: j */
    public static final char[] f13876j = C3039b.m7190y("Android");

    /* renamed from: a */
    public char[] f13877a = ((char[]) f13876j.clone());

    /* renamed from: b */
    public char[] f13878b = C3039b.m7190y(Build.VERSION.RELEASE);

    /* renamed from: c */
    public char[] f13879c;

    /* renamed from: d */
    public char[] f13880d;

    /* renamed from: e */
    public char[] f13881e;

    /* renamed from: f */
    public char[] f13882f;

    /* renamed from: g */
    public int f13883g;

    /* renamed from: h */
    public int f13884h;

    /* renamed from: i */
    public char[] f13885i;

    /* renamed from: com.cardinalcommerce.shared.cs.f.i$a */
    public class C6289a implements Runnable {
        public C6289a() {
        }

        public final void run() {
            C3039b.m7156Z(C6288i.this.f13877a);
            C3039b.m7156Z(C6288i.this.f13878b);
            C3039b.m7156Z(C6288i.this.f13879c);
            C3039b.m7156Z(C6288i.this.f13880d);
            C3039b.m7156Z(C6288i.this.f13881e);
            C3039b.m7156Z(C6288i.this.f13882f);
            C6288i iVar = C6288i.this;
            iVar.f13883g = 0;
            iVar.f13884h = 0;
            C3039b.m7156Z(iVar.f13885i);
        }
    }

    public C6288i() {
        int i = Build.VERSION.SDK_INT;
        this.f13879c = C3039b.m7190y(String.valueOf(i));
        this.f13880d = C3039b.m7190y(Build.VERSION_CODES.class.getFields()[i].getName());
        this.f13881e = C3039b.m7190y(Build.VERSION.CODENAME);
        this.f13882f = C3039b.m7190y(Build.VERSION.INCREMENTAL);
        this.f13883g = Build.VERSION.PREVIEW_SDK_INT;
        this.f13884h = i;
        this.f13885i = C3039b.m7190y(Build.VERSION.SECURITY_PATCH);
    }

    /* renamed from: a */
    public JSONObject mo17837a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("ApiVersion", C3039b.m7142L(this.f13879c));
            jSONObject.putOpt("CodeName", C3039b.m7142L(this.f13881e));
            jSONObject.putOpt("Incremental", C3039b.m7142L(this.f13882f));
            jSONObject.putOpt("OsName", C3039b.m7142L(this.f13880d));
            jSONObject.putOpt("PreviewSdkInt", Integer.valueOf(this.f13883g));
            jSONObject.putOpt("SdkInt", Integer.valueOf(this.f13884h));
            jSONObject.putOpt("SecurityPatch", C3039b.m7142L(this.f13885i));
            jSONObject.putOpt("Type", C3039b.m7142L(this.f13877a));
            jSONObject.putOpt("Version", C3039b.m7142L(this.f13878b));
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void mo17838b() {
        AsyncTask.execute(new C6289a());
    }
}
