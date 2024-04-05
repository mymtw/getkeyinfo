package com.cardinalcommerce.shared.p065cs.p070f;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.preference.C3039b;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.cli.HelpFormatter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;
import p260v0.C8184a;

/* renamed from: com.cardinalcommerce.shared.cs.f.d */
public class C6281d implements Serializable {

    /* renamed from: A */
    public float f13811A;

    /* renamed from: B */
    public int f13812B;

    /* renamed from: C */
    public float f13813C;

    /* renamed from: D */
    public double f13814D;

    /* renamed from: E */
    public double f13815E;

    /* renamed from: F */
    public char[] f13816F;

    /* renamed from: G */
    public long f13817G;

    /* renamed from: a */
    public char[] f13818a;

    /* renamed from: b */
    public char[] f13819b;

    /* renamed from: c */
    public char[] f13820c;

    /* renamed from: d */
    public char[] f13821d;

    /* renamed from: e */
    public long f13822e;

    /* renamed from: f */
    public char[] f13823f;

    /* renamed from: g */
    public int f13824g;

    /* renamed from: h */
    public char[] f13825h;

    /* renamed from: i */
    public char[] f13826i;

    /* renamed from: j */
    public char[] f13827j;

    /* renamed from: k */
    public char[] f13828k;

    /* renamed from: l */
    public char[] f13829l;

    /* renamed from: m */
    public char[] f13830m;

    /* renamed from: n */
    public char[] f13831n;

    /* renamed from: o */
    public char[] f13832o;

    /* renamed from: p */
    public char[] f13833p;

    /* renamed from: q */
    public char[] f13834q;

    /* renamed from: r */
    public char[] f13835r;

    /* renamed from: s */
    public char[] f13836s;

    /* renamed from: t */
    public char[] f13837t;

    /* renamed from: u */
    public char[] f13838u;

    /* renamed from: v */
    public char[] f13839v;

    /* renamed from: w */
    public char[] f13840w;

    /* renamed from: x */
    public char[] f13841x;

    /* renamed from: y */
    public char[] f13842y;

    /* renamed from: z */
    public char[] f13843z;

    /* renamed from: com.cardinalcommerce.shared.cs.f.d$a */
    public class C6282a implements Runnable {
        public C6282a() {
        }

        public final void run() {
            C3039b.m7156Z(C6281d.this.f13818a);
            C3039b.m7156Z(C6281d.this.f13819b);
            C3039b.m7156Z(C6281d.this.f13820c);
            C3039b.m7156Z(C6281d.this.f13821d);
            C6281d dVar = C6281d.this;
            dVar.f13822e = 0;
            C3039b.m7156Z(dVar.f13823f);
            C6281d dVar2 = C6281d.this;
            dVar2.f13824g = 0;
            C3039b.m7156Z(dVar2.f13825h);
            C3039b.m7156Z(C6281d.this.f13826i);
            C3039b.m7156Z(C6281d.this.f13827j);
            C3039b.m7156Z(C6281d.this.f13828k);
            C3039b.m7156Z(C6281d.this.f13829l);
            C3039b.m7156Z(C6281d.this.f13830m);
            C3039b.m7156Z(C6281d.this.f13831n);
            C3039b.m7156Z(C6281d.this.f13832o);
            C3039b.m7156Z(C6281d.this.f13833p);
            C3039b.m7156Z(C6281d.this.f13834q);
            C3039b.m7156Z(C6281d.this.f13835r);
            C3039b.m7156Z(C6281d.this.f13836s);
            C3039b.m7156Z(C6281d.this.f13837t);
            C3039b.m7156Z(C6281d.this.f13838u);
            C3039b.m7156Z(C6281d.this.f13839v);
            C3039b.m7156Z(C6281d.this.f13840w);
            C3039b.m7156Z(C6281d.this.f13841x);
            C3039b.m7156Z(C6281d.this.f13842y);
            C3039b.m7156Z(C6281d.this.f13843z);
            C6281d dVar3 = C6281d.this;
            dVar3.f13811A = 0.0f;
            dVar3.f13812B = 0;
            dVar3.f13813C = 0.0f;
            dVar3.f13814D = ShadowDrawableWrapper.COS_45;
            dVar3.f13815E = ShadowDrawableWrapper.COS_45;
            C3039b.m7156Z(dVar3.f13816F);
            C6281d.this.f13817G = 0;
        }
    }

    public C6281d(Context context) {
        String str = Build.SERIAL;
        this.f13821d = C3039b.m7190y(str);
        this.f13825h = C3039b.m7190y(String.valueOf(context.getResources().getDisplayMetrics().densityDpi));
        this.f13824g = (int) context.getResources().getDisplayMetrics().density;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        this.f13823f = C3039b.m7190y(displayMetrics.widthPixels + "*" + displayMetrics.heightPixels);
        this.f13826i = C3039b.m7190y(Resources.getSystem().getConfiguration().locale.toString().replaceAll("_", HelpFormatter.DEFAULT_OPT_PREFIX));
        this.f13827j = null;
        if (C8184a.m16458a(context, "android.permission.BLUETOOTH") == 0) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                this.f13828k = C3039b.m7190y(defaultAdapter.getName());
            }
        } else {
            this.f13828k = C3039b.m7190y("N/A");
        }
        this.f13829l = C3039b.m7190y(Build.BOARD);
        this.f13830m = C3039b.m7190y(Build.BOOTLOADER);
        String str2 = Build.BRAND;
        this.f13819b = C3039b.m7190y(str2);
        this.f13831n = C3039b.m7190y(Build.DEVICE);
        this.f13833p = C3039b.m7190y(Build.DISPLAY);
        this.f13832o = C3039b.m7190y(Build.FINGERPRINT);
        this.f13834q = C3039b.m7190y(Build.HARDWARE);
        this.f13835r = C3039b.m7190y(Build.ID);
        String str3 = Build.MANUFACTURER;
        this.f13820c = C3039b.m7190y(str3);
        this.f13836s = C3039b.m7190y(Build.PRODUCT);
        this.f13837t = C3039b.m7190y(Build.RADIO);
        this.f13838u = C3039b.m7190y(str);
        this.f13842y = C3039b.m7190y(Arrays.toString(Build.SUPPORTED_32_BIT_ABIS));
        this.f13843z = C3039b.m7190y(Arrays.toString(Build.SUPPORTED_64_BIT_ABIS));
        this.f13841x = C3039b.m7190y(Build.TAGS);
        this.f13822e = Build.TIME;
        this.f13840w = C3039b.m7190y(Build.TYPE);
        this.f13839v = C3039b.m7190y(Build.USER);
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        this.f13811A = displayMetrics2.density;
        this.f13812B = displayMetrics2.densityDpi;
        this.f13813C = displayMetrics2.scaledDensity;
        this.f13814D = (double) displayMetrics2.xdpi;
        this.f13815E = (double) displayMetrics2.ydpi;
        this.f13818a = C3039b.m7190y(Build.MODEL);
        this.f13819b = C3039b.m7190y(str2);
        this.f13820c = C3039b.m7190y(str3);
        StatFs statFs = new StatFs(Environment.getRootDirectory().getPath());
        this.f13817G = statFs.getTotalBytes();
        this.f13816F = C3039b.m7190y(statFs.toString());
    }

    /* renamed from: a */
    public JSONObject mo17817a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("AdvertisingId", C3039b.m7142L(this.f13827j));
            jSONObject.putOpt("Board", C3039b.m7142L(this.f13829l));
            jSONObject.putOpt("BootLoader", C3039b.m7142L(this.f13830m));
            jSONObject.putOpt("Brand", C3039b.m7142L(this.f13819b));
            jSONObject.putOpt("ColorDepth", C3039b.m7142L(this.f13825h));
            jSONObject.putOpt("Density", Integer.valueOf(Integer.parseInt(String.valueOf(Math.round(this.f13811A)))));
            jSONObject.putOpt("DensityDpi", Integer.valueOf(this.f13812B));
            jSONObject.putOpt("Device", C3039b.m7142L(this.f13831n));
            jSONObject.putOpt("DeviceName", C3039b.m7142L(this.f13828k));
            jSONObject.putOpt("Display", C3039b.m7142L(this.f13833p));
            jSONObject.putOpt("Fingerprint", C3039b.m7142L(this.f13832o));
            jSONObject.putOpt("GetTotalBytes", Long.valueOf(this.f13817G));
            jSONObject.putOpt("Hardware", C3039b.m7142L(this.f13834q));
            jSONObject.putOpt("Id", C3039b.m7142L(this.f13835r));
            jSONObject.putOpt("Locale", C3039b.m7142L(this.f13826i));
            jSONObject.putOpt("Manufacturer", C3039b.m7142L(this.f13820c));
            jSONObject.putOpt("Model", C3039b.m7142L(this.f13818a));
            jSONObject.putOpt("Product", C3039b.m7142L(this.f13836s));
            jSONObject.putOpt("Radio", C3039b.m7142L(this.f13837t));
            jSONObject.putOpt("ScaledDensity", Float.valueOf(this.f13813C));
            jSONObject.putOpt("ScreenDensity", Integer.valueOf(this.f13824g));
            jSONObject.putOpt("ScreenResolution", C3039b.m7142L(this.f13823f));
            jSONObject.putOpt("Serial", C3039b.m7142L(this.f13838u));
            jSONObject.putOpt("SerialNumber", C3039b.m7142L(this.f13821d));
            if (C3039b.m7186u(this.f13842y)) {
                jSONObject.putOpt("Supported32BitAbis", new JSONArray(Collections.singletonList(C3039b.m7142L(this.f13842y))));
            }
            if (C3039b.m7186u(this.f13843z)) {
                jSONObject.putOpt("Supported64BitAbis", new JSONArray(Collections.singletonList(C3039b.m7142L(this.f13843z))));
            }
            jSONObject.putOpt("Tags", C3039b.m7142L(this.f13841x));
            jSONObject.putOpt("Time", String.valueOf(this.f13822e));
            jSONObject.putOpt("Type", C3039b.m7142L(this.f13840w));
            jSONObject.putOpt(ResponseConstants.Includes.USER, C3039b.m7142L(this.f13839v));
            jSONObject.putOpt("Xdpi", Double.valueOf(this.f13814D));
            jSONObject.putOpt("Ydpi", Double.valueOf(this.f13815E));
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void mo17818b() {
        AsyncTask.execute(new C6282a());
    }
}
