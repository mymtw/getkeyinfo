package p774vq;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import lib.android.paypal.com.magnessdk.network.C19874j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0015b;
import p770sq.C20169c;
import p772tq.C20204b;
import p773uq.C20205a;

/* renamed from: vq.j */
public final class C20215j {

    /* renamed from: a */
    public BitSet f44827a;

    /* renamed from: b */
    public Context f44828b;

    /* renamed from: c */
    public JSONObject f44829c;

    /* renamed from: d */
    public Handler f44830d;

    /* renamed from: e */
    public boolean f44831e = false;

    /* renamed from: f */
    public JSONArray f44832f;

    public C20215j(C20169c cVar, C19874j jVar) {
        JSONObject jSONObject;
        Class<C20215j> cls = C20215j.class;
        this.f44828b = cVar.f44673b;
        this.f44830d = jVar;
        try {
            jSONObject = mo74466g();
            if (jSONObject == null) {
                C20205a.m34554a("submit async remoteConfig request. no cached configuration found.", 0, cls);
                new C20216k(this.f44830d, this).mo74459a();
            } else if (m34574d(jSONObject.optString("conf_version", ""))) {
                boolean z = System.currentTimeMillis() > (jSONObject.optLong("conf_refresh_time_interval", 0) * 1000) + Long.parseLong(C20204b.m34551a(new File(this.f44828b.getFilesDir(), "CONFIG_TIME")));
                if (z) {
                    C20205a.m34554a("submit async remoteConfig request: !isRemoteConfigDisabled: " + true + " isConfigExpired: " + z, 0, cls);
                    new C20216k(this.f44830d, this).mo74459a();
                }
                C20205a.m34554a("Using cached config due to isRemoteConfigDisabled : " + false + " or isConfigExpired : " + z, 0, cls);
                this.f44829c = jSONObject;
                mo74468i();
                C20205a.m34554a(this.f44829c.toString(2), 0, cls);
            } else {
                mo74467h();
            }
        } catch (Exception e) {
            C20205a.m34555b(e, cls);
        }
        C20205a.m34554a("entering getDefaultRemoteConfig", 0, cls);
        jSONObject = new JSONObject();
        try {
            jSONObject.put("conf_version", "4.0");
            jSONObject.put("conf_refresh_time_interval", 86400);
            jSONObject.put("endpoint_url", "https://c.paypal.com/r/v1/device/client-metadata");
        } catch (JSONException e2) {
            C20205a.m34555b(e2, cls);
        }
        this.f44829c = jSONObject;
        mo74468i();
        try {
            C20205a.m34554a(this.f44829c.toString(2), 0, cls);
        } catch (JSONException unused) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m34573a() throws java.io.IOException {
        /*
            java.lang.Class<vq.j> r0 = p774vq.C20215j.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "https://www.paypalobjects.com/digitalassets/c/rda-magnes/magnes_config_android_v4.json"
            r3.<init>(r4)     // Catch:{ all -> 0x0042 }
            java.io.InputStream r3 = r3.openStream()     // Catch:{ all -> 0x0042 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x003d }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x003d }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r3, r6)     // Catch:{ all -> 0x003d }
            r4.<init>(r5)     // Catch:{ all -> 0x003d }
        L_0x001f:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x0029
            r1.append(r2)     // Catch:{ all -> 0x003a }
            goto L_0x001f
        L_0x0029:
            p770sq.C20171d.m34478b(r0, r3)
            p770sq.C20171d.m34478b(r0, r4)
            r2 = 0
            java.lang.String r3 = "leaving getRemoteConfig successfully"
            p773uq.C20205a.m34554a(r3, r2, r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x003a:
            r1 = move-exception
            r2 = r4
            goto L_0x003e
        L_0x003d:
            r1 = move-exception
        L_0x003e:
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x0044
        L_0x0042:
            r1 = move-exception
            r3 = r2
        L_0x0044:
            p770sq.C20171d.m34478b(r0, r2)
            p770sq.C20171d.m34478b(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p774vq.C20215j.m34573a():java.lang.String");
    }

    /* renamed from: d */
    public static boolean m34574d(String str) {
        Class<C20215j> cls = C20215j.class;
        C20205a.m34554a("entering shouldUseCachedConfiguration", 0, cls);
        String[] split = str.split("\\.");
        String[] split2 = "4.0".split("\\.");
        C20205a.m34554a(C0015b.m90i("Comparing Cached version is ", str, " default version is ", "4.0"), 0, cls);
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        return Integer.valueOf(Integer.signum((i >= split.length || i >= split2.length) ? split.length - split2.length : Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])))).intValue() >= 0;
    }

    /* renamed from: b */
    public final void mo74462b(String str) {
        C20205a.m34554a("entering saveConfigData", 0, C20215j.class);
        File file = new File(this.f44828b.getFilesDir(), "CONFIG_DATA");
        File file2 = new File(this.f44828b.getFilesDir(), "CONFIG_TIME");
        C20204b.m34552b(file, str);
        C20204b.m34552b(file2, String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: c */
    public final boolean mo74463c(int i) {
        return this.f44827a.get(i);
    }

    /* renamed from: e */
    public final ArrayList mo74464e() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = this.f44829c.optJSONArray("android_apps_to_check");
        int i = 0;
        while (optJSONArray != null && i < optJSONArray.length()) {
            arrayList.add(optJSONArray.getString(i));
            i++;
        }
        return arrayList;
    }

    /* renamed from: f */
    public final String mo74465f() {
        return this.f44829c.optString("m", "QW5kcm9pZE1hZ25lcw==");
    }

    /* renamed from: g */
    public final JSONObject mo74466g() {
        Class<C20215j> cls = C20215j.class;
        C20205a.m34554a("entering getCachedConfiguration", 0, cls);
        try {
            C20205a.m34554a("Loading loadCachedConfigDataFromDisk", 0, cls);
            String a = C20204b.m34551a(new File(this.f44828b.getFilesDir(), "CONFIG_DATA"));
            if (!a.isEmpty()) {
                C20205a.m34554a("leaving getCachedConfiguration,cached config load successfully", 0, cls);
                return new JSONObject(a);
            }
        } catch (Exception e) {
            C20205a.m34555b(e, cls);
        }
        C20205a.m34554a("leaving getCachedConfiguration,cached config load failed", 0, cls);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b A[SYNTHETIC, Splitter:B:9:0x003b] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74467h() {
        /*
            r7 = this;
            java.lang.String r0 = "deleting CachedConfigDataFromDisk"
            java.lang.Class<tq.b> r1 = p772tq.C20204b.class
            java.lang.Class<vq.j> r2 = p774vq.C20215j.class
            java.lang.String r3 = "entering deleteCachedConfigDataFromDisk"
            r4 = 0
            p773uq.C20205a.m34554a(r3, r4, r2)
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r7.f44828b
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r5 = "CONFIG_DATA"
            r2.<init>(r3, r5)
            java.io.File r3 = new java.io.File
            android.content.Context r5 = r7.f44828b
            java.io.File r5 = r5.getFilesDir()
            java.lang.String r6 = "CONFIG_TIME"
            r3.<init>(r5, r6)
            boolean r5 = r2.exists()     // Catch:{ Exception -> 0x0034 }
            if (r5 == 0) goto L_0x0038
            p773uq.C20205a.m34554a(r0, r4, r1)     // Catch:{ Exception -> 0x0034 }
            boolean r2 = r2.delete()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0039
        L_0x0034:
            r2 = move-exception
            p773uq.C20205a.m34555b(r2, r1)
        L_0x0038:
            r2 = r4
        L_0x0039:
            if (r2 == 0) goto L_0x004c
            boolean r2 = r3.exists()     // Catch:{ Exception -> 0x0048 }
            if (r2 == 0) goto L_0x004c
            p773uq.C20205a.m34554a(r0, r4, r1)     // Catch:{ Exception -> 0x0048 }
            r3.delete()     // Catch:{ Exception -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r0 = move-exception
            p773uq.C20205a.m34555b(r0, r1)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p774vq.C20215j.mo74467h():void");
    }

    /* renamed from: i */
    public final void mo74468i() {
        JSONArray optJSONArray = this.f44829c.optJSONArray("nc");
        if (optJSONArray != null) {
            this.f44832f = optJSONArray;
        }
        BitSet bitSet = new BitSet(100);
        this.f44827a = bitSet;
        bitSet.set(0, 100, true);
        int i = 0;
        while (optJSONArray != null && i < optJSONArray.length()) {
            try {
                this.f44827a.set(optJSONArray.getInt(i), false);
            } catch (JSONException unused) {
            }
            i++;
        }
    }
}
