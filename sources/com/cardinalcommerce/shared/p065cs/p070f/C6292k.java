package com.cardinalcommerce.shared.p065cs.p070f;

import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.k */
public final class C6292k {

    /* renamed from: a */
    public final boolean f13890a;

    /* renamed from: b */
    public final boolean f13891b;

    /* renamed from: c */
    public final boolean f13892c;

    /* renamed from: d */
    public final boolean f13893d;

    /* renamed from: e */
    public boolean f13894e;

    /* renamed from: f */
    public final boolean f13895f;

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6292k(android.content.Context r8, boolean r9) {
        /*
            r7 = this;
            r7.<init>()
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "generic"
            boolean r0 = r0.startsWith(r1)
            r2 = 1
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = android.os.Build.DEVICE
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0097
        L_0x0016:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = "unknown"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "goldfish"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = "ranchu"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "google_sdk"
            boolean r3 = r0.contains(r1)
            if (r3 != 0) goto L_0x0097
            java.lang.String r3 = "Emulator"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x0097
            java.lang.String r3 = "Android SDK built for x86"
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "Genymotion"
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r3 = "sdk_google"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x0097
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = "sdk"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = "sdk_x86"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = "vbox86p"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = "emulator"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = "simulator"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r0 = 0
            goto L_0x0098
        L_0x0097:
            r0 = r2
        L_0x0098:
            r7.f13890a = r0
            r7.f13893d = r2
            boolean r1 = android.os.Debug.isDebuggerConnected()
            r7.f13892c = r1
            boolean r2 = m12678a()
            r7.f13891b = r2
            r7.f13894e = r9
            android.content.pm.PackageManager r9 = r8.getPackageManager()
            java.lang.String r8 = r8.getPackageName()
            java.lang.String r8 = r9.getInstallerPackageName(r8)
            com.cardinalcommerce.shared.cs.f.j$1 r9 = new com.cardinalcommerce.shared.cs.f.j$1
            r9.<init>()
            boolean r8 = r9.contains(r8)
            r7.f13895f = r8
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r2 == 0) goto L_0x00de
            java.lang.String r2 = "SW01"
            r9.put(r2)
            v8.b r4 = new v8.b
            com.cardinalcommerce.shared.cs.b.d r5 = com.cardinalcommerce.shared.p065cs.p067b.C6269d.HIGH
            java.lang.String r6 = "The device is jailbroken."
            r4.<init>((java.lang.String) r2, (java.lang.String) r6, (com.cardinalcommerce.shared.p065cs.p067b.C6269d) r5)
            r3.add(r4)
        L_0x00de:
            boolean r2 = r7.f13894e
            if (r2 == 0) goto L_0x00f3
            java.lang.String r2 = "SW02"
            r9.put(r2)
            v8.b r4 = new v8.b
            com.cardinalcommerce.shared.cs.b.d r5 = com.cardinalcommerce.shared.p065cs.p067b.C6269d.HIGH
            java.lang.String r6 = "The integrity of the SDK has been tampered."
            r4.<init>((java.lang.String) r2, (java.lang.String) r6, (com.cardinalcommerce.shared.p065cs.p067b.C6269d) r5)
            r3.add(r4)
        L_0x00f3:
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = "SW03"
            r9.put(r0)
            v8.b r2 = new v8.b
            com.cardinalcommerce.shared.cs.b.d r4 = com.cardinalcommerce.shared.p065cs.p067b.C6269d.HIGH
            java.lang.String r5 = "An emulator is being used to run the App."
            r2.<init>((java.lang.String) r0, (java.lang.String) r5, (com.cardinalcommerce.shared.p065cs.p067b.C6269d) r4)
            r3.add(r2)
        L_0x0106:
            if (r1 == 0) goto L_0x0119
            java.lang.String r0 = "SW04"
            r9.put(r0)
            v8.b r1 = new v8.b
            com.cardinalcommerce.shared.cs.b.d r2 = com.cardinalcommerce.shared.p065cs.p067b.C6269d.MEDIUM
            java.lang.String r4 = "A debugger is attached to the App."
            r1.<init>((java.lang.String) r0, (java.lang.String) r4, (com.cardinalcommerce.shared.p065cs.p067b.C6269d) r2)
            r3.add(r1)
        L_0x0119:
            if (r8 != 0) goto L_0x012c
            java.lang.String r8 = "SW06"
            r9.put(r8)
            v8.b r9 = new v8.b
            com.cardinalcommerce.shared.cs.b.d r0 = com.cardinalcommerce.shared.p065cs.p067b.C6269d.HIGH
            java.lang.String r1 = "The App is not installed from trusted source."
            r9.<init>((java.lang.String) r8, (java.lang.String) r1, (com.cardinalcommerce.shared.p065cs.p067b.C6269d) r0)
            r3.add(r9)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.p065cs.p070f.C6292k.<init>(android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public static boolean m12678a() {
        boolean z;
        boolean z2;
        String str = Build.TAGS;
        if (!(str != null && str.contains("test-keys"))) {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
            int i = 0;
            while (true) {
                if (i >= 10) {
                    z = false;
                    break;
                } else if (new File(strArr[i]).exists()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                Process process = null;
                try {
                    Process exec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
                    z2 = new BufferedReader(new InputStreamReader(exec.getInputStream())).readLine() != null;
                    exec.destroy();
                } catch (Throwable unused) {
                    if (process != null) {
                        process.destroy();
                    }
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final JSONObject mo17841b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("IsAppTrusted", Boolean.valueOf(this.f13895f));
            jSONObject.putOpt("IsJailbroken", Boolean.valueOf(this.f13891b));
            jSONObject.putOpt("IsSDKTempered", Boolean.valueOf(this.f13894e));
            jSONObject.putOpt("IsEmulator", Boolean.valueOf(this.f13890a));
            jSONObject.putOpt("IsDebuggerAttached", Boolean.valueOf(this.f13892c));
            jSONObject.putOpt("IsOSSupported", Boolean.valueOf(this.f13893d));
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }
}
