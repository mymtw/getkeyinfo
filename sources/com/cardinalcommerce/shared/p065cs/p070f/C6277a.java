package com.cardinalcommerce.shared.p065cs.p070f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.preference.C3039b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.a */
public class C6277a implements Serializable {

    /* renamed from: a */
    public boolean f13800a;

    /* renamed from: b */
    private int f13801b;

    /* renamed from: c */
    private ArrayList<String> f13802c = new ArrayList<>();

    /* renamed from: d */
    private int f13803d;

    /* renamed from: e */
    private int f13804e;

    /* renamed from: f */
    private char[] f13805f;

    public C6277a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
        for (int i = 0; i < installedApplications.size(); i++) {
            this.f13802c.add(installedApplications.get(i).packageName);
        }
        installedApplications.clear();
        this.f13801b = this.f13802c.size();
        this.f13800a = packageManager.isSafeMode();
        this.f13805f = C3039b.m7190y(packageManager.getInstallerPackageName(context.getPackageName()));
        this.f13803d = Arrays.asList(packageManager.getSystemAvailableFeatures()).size();
        this.f13804e = Arrays.asList(packageManager.getSystemSharedLibraryNames()).size();
    }

    /* renamed from: a */
    public ArrayList<String> mo17807a() {
        return this.f13802c;
    }

    /* renamed from: b */
    public char[] mo17808b() {
        return this.f13805f;
    }

    /* renamed from: c */
    public int mo17809c() {
        return this.f13803d;
    }

    /* renamed from: d */
    public int mo17810d() {
        return this.f13804e;
    }

    /* renamed from: e */
    public JSONObject mo17811e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("ApplicationCount", Integer.valueOf(this.f13801b));
            jSONObject.putOpt("IsSafeMode", Boolean.valueOf(this.f13800a));
            jSONObject.putOpt("ApplicationList", new JSONArray(this.f13802c));
            jSONObject.putOpt("SystemAvailableFeatures", Integer.valueOf(this.f13803d));
            jSONObject.putOpt("SystemSharedLibraryNames", Integer.valueOf(this.f13804e));
            jSONObject.putOpt("InstallerPackageName", C3039b.m7142L(this.f13805f));
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }

    /* renamed from: f */
    public void mo17812f() {
        this.f13801b = 0;
        this.f13800a = false;
        this.f13802c = null;
        this.f13803d = 0;
        this.f13804e = 0;
        C3039b.m7156Z(this.f13805f);
    }
}
