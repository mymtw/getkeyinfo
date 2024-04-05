package com.facebook.internal.instrument;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p378jg.C12982b;
import p378jg.C12983c;
import p453tf.C13418j;
import p568fn.C17782b;

public final class InstrumentData {

    /* renamed from: a */
    public String f27374a;

    /* renamed from: b */
    public Type f27375b;

    /* renamed from: c */
    public JSONArray f27376c;

    /* renamed from: d */
    public String f27377d;

    /* renamed from: e */
    public String f27378e;

    /* renamed from: f */
    public String f27379f;

    /* renamed from: g */
    public Long f27380g;

    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        public final String getLogPrefix() {
            int i = C12982b.f28594b[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        public String toString() {
            int i = C12982b.f28593a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public InstrumentData(JSONArray jSONArray) {
        this.f27375b = Type.Analysis;
        this.f27380g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f27376c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f27380g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C19383o.m32796f(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f27374a = stringBuffer2;
    }

    /* renamed from: a */
    public final boolean mo39441a() {
        Type type = this.f27375b;
        if (type == null) {
            return false;
        }
        int i = C12983c.f28595a[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (!(i == 3 || i == 4 || i == 5) || this.f27379f == null || this.f27380g == null) {
                    return false;
                }
            } else if (this.f27379f == null || this.f27378e == null || this.f27380g == null) {
                return false;
            }
        } else if (this.f27376c == null || this.f27380g == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo39442b() {
        if (mo39441a()) {
            C17782b.m29889u0(this.f27374a, toString());
        }
    }

    public final String toString() {
        JSONObject jSONObject;
        Type type = this.f27375b;
        JSONObject jSONObject2 = null;
        if (type != null) {
            int i = C12983c.f28596b[type.ordinal()];
            if (i == 1) {
                jSONObject = new JSONObject();
                JSONArray jSONArray = this.f27376c;
                if (jSONArray != null) {
                    jSONObject.put("feature_names", jSONArray);
                }
                Long l = this.f27380g;
                if (l != null) {
                    jSONObject.put(ResponseConstants.TIMESTAMP, l);
                }
            } else if (i == 2 || i == 3 || i == 4 || i == 5) {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("device_os_version", Build.VERSION.RELEASE);
                    jSONObject.put("device_model", Build.MODEL);
                    String str = this.f27377d;
                    if (str != null) {
                        jSONObject.put("app_version", str);
                    }
                    Long l2 = this.f27380g;
                    if (l2 != null) {
                        jSONObject.put(ResponseConstants.TIMESTAMP, l2);
                    }
                    String str2 = this.f27378e;
                    if (str2 != null) {
                        jSONObject.put("reason", str2);
                    }
                    String str3 = this.f27379f;
                    if (str3 != null) {
                        jSONObject.put("callstack", str3);
                    }
                    Type type2 = this.f27375b;
                    if (type2 != null) {
                        jSONObject.put("type", type2);
                    }
                } catch (JSONException unused) {
                }
            }
            jSONObject2 = jSONObject;
        }
        if (jSONObject2 != null) {
            String jSONObject3 = jSONObject2.toString();
            C19383o.m32796f(jSONObject3, "params.toString()");
            return jSONObject3;
        }
        String jSONObject4 = new JSONObject().toString();
        C19383o.m32796f(jSONObject4, "JSONObject().toString()");
        return jSONObject4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InstrumentData(java.lang.Throwable r8, com.facebook.internal.instrument.InstrumentData.Type r9) {
        /*
            r7 = this;
            r7.<init>()
            r7.f27375b = r9
            int r0 = p365hg.C12869i0.f28368a
            android.content.Context r0 = p453tf.C13418j.m21106b()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r3 = r0.getPackageName()
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0020 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            r7.f27377d = r0
            if (r8 != 0) goto L_0x0027
            r0 = r2
            goto L_0x003a
        L_0x0027:
            java.lang.Throwable r0 = r8.getCause()
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = r8.toString()
            goto L_0x003a
        L_0x0032:
            java.lang.Throwable r0 = r8.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x003a:
            r7.f27378e = r0
            if (r8 != 0) goto L_0x003f
            goto L_0x0068
        L_0x003f:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L_0x0044:
            if (r8 == 0) goto L_0x0064
            if (r8 == r2) goto L_0x0064
            java.lang.StackTraceElement[] r2 = r8.getStackTrace()
            int r3 = r2.length
            r4 = r1
        L_0x004e:
            if (r4 >= r3) goto L_0x005c
            r5 = r2[r4]
            java.lang.String r5 = r5.toString()
            r0.put(r5)
            int r4 = r4 + 1
            goto L_0x004e
        L_0x005c:
            java.lang.Throwable r2 = r8.getCause()
            r6 = r2
            r2 = r8
            r8 = r6
            goto L_0x0044
        L_0x0064:
            java.lang.String r2 = r0.toString()
        L_0x0068:
            r7.f27379f = r2
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r8
            long r0 = r0 / r2
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r7.f27380g = r8
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            java.lang.String r9 = r9.getLogPrefix()
            r8.append(r9)
            java.lang.Long r9 = r7.f27380g
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.append(r9)
            java.lang.String r9 = ".json"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "StringBuffer().append(t.…ppend(\".json\").toString()"
            kotlin.jvm.internal.C19383o.m32796f(r8, r9)
            r7.f27374a = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.instrument.InstrumentData.<init>(java.lang.Throwable, com.facebook.internal.instrument.InstrumentData$Type):void");
    }

    public InstrumentData(String str, String str2) {
        this.f27375b = Type.AnrReport;
        int i = C12869i0.f28368a;
        Context b = C13418j.m21106b();
        String str3 = null;
        if (b != null) {
            try {
                PackageInfo packageInfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
                if (packageInfo != null) {
                    str3 = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f27377d = str3;
        this.f27378e = str;
        this.f27379f = str2;
        this.f27380g = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f27380g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        C19383o.m32796f(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f27374a = stringBuffer2;
    }

    public InstrumentData(File file) {
        Type type;
        String name = file.getName();
        C19383o.m32796f(name, "file.name");
        this.f27374a = name;
        if (C19457k.m33025c1(name, "crash_log_", false)) {
            type = Type.CrashReport;
        } else if (C19457k.m33025c1(name, "shield_log_", false)) {
            type = Type.CrashShield;
        } else if (C19457k.m33025c1(name, "thread_check_log_", false)) {
            type = Type.ThreadCheck;
        } else if (C19457k.m33025c1(name, "analysis_log_", false)) {
            type = Type.Analysis;
        } else if (C19457k.m33025c1(name, "anr_log_", false)) {
            type = Type.AnrReport;
        } else {
            type = Type.Unknown;
        }
        this.f27375b = type;
        JSONObject j0 = C17782b.m29870j0(this.f27374a);
        if (j0 != null) {
            this.f27380g = Long.valueOf(j0.optLong(ResponseConstants.TIMESTAMP, 0));
            this.f27377d = j0.optString("app_version", (String) null);
            this.f27378e = j0.optString("reason", (String) null);
            this.f27379f = j0.optString("callstack", (String) null);
            this.f27376c = j0.optJSONArray("feature_names");
        }
    }
}
