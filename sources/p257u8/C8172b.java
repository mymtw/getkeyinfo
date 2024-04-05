package p257u8;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.cardinalcommerce.shared.p065cs.p067b.C6266a;
import com.cardinalcommerce.shared.p065cs.p068d.C6270a;
import com.etsy.android.lib.requests.EtsyRequest;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: u8.b */
public class C8172b {

    /* renamed from: b */
    public static boolean f17937b;

    /* renamed from: c */
    public static String f17938c;

    /* renamed from: d */
    public static String f17939d;

    /* renamed from: e */
    public static volatile C8172b f17940e;

    /* renamed from: a */
    public final String f17941a = C8172b.class.getSimpleName();

    /* renamed from: u8.b$a */
    public static class C8173a extends C6270a {
        public C8173a(String str, String str2) {
            Log.d("CARDINAL EVENT LOG \n", str);
            super.mo17766a(str2, str, (int) EtsyRequest.DEFAULT_TIMEOUT);
        }

        /* renamed from: a */
        public final void mo17212a(Exception exc, C6266a aVar) {
        }

        /* renamed from: a */
        public final void mo17213a(String str) {
            C8172b.m16432f().mo19178e();
        }

        /* renamed from: a */
        public final void mo17214a(String str, int i) {
        }
    }

    public C8172b() {
        f17937b = true;
    }

    /* renamed from: f */
    public static C8172b m16432f() {
        if (f17940e == null) {
            synchronized (C8172b.class) {
                if (f17940e == null) {
                    f17940e = new C8172b();
                }
            }
        }
        return f17940e;
    }

    /* renamed from: a */
    public void mo19175a(String str, String str2, String str3) {
        C8175d dVar = new C8175d();
        dVar.f17946d = str;
        dVar.f17943a = str2;
        dVar.f17944b = str3;
        dVar.f17945c = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        mo20803b(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017a A[Catch:{ JSONException -> 0x017e }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20803b(p257u8.C8175d r20) {
        /*
            r19 = this;
            r1 = r20
            boolean r0 = f17937b
            if (r0 == 0) goto L_0x018c
            java.lang.String r2 = f17938c
            java.lang.String r3 = f17939d
            if (r0 == 0) goto L_0x018c
            u8.e r4 = new u8.e
            r4.<init>()
            u8.c r5 = r19.mo19176c()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r6 = "mutator"
            r0.put(r6, r3)
            java.lang.String r7 = "identifier"
            r0.put(r7, r2)
            java.lang.String r8 = r1.f17944b
            java.lang.String r9 = "sessionid"
            r0.put(r9, r8)
            r5.getClass()
            r8 = 0
        L_0x002f:
            int r10 = r5.length()     // Catch:{ JSONException -> 0x0077 }
            if (r8 >= r10) goto L_0x0077
            org.json.JSONObject r10 = r5.getJSONObject(r8)     // Catch:{ JSONException -> 0x0077 }
            java.util.Set r11 = r0.keySet()     // Catch:{ JSONException -> 0x0077 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ JSONException -> 0x0077 }
            r12 = 0
        L_0x0042:
            boolean r13 = r11.hasNext()     // Catch:{ JSONException -> 0x0077 }
            if (r13 == 0) goto L_0x0071
            java.lang.Object r12 = r11.next()     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ JSONException -> 0x0077 }
            boolean r13 = r10.has(r12)     // Catch:{ JSONException -> 0x0077 }
            if (r13 == 0) goto L_0x0062
            java.lang.String r13 = r10.getString(r12)     // Catch:{ JSONException -> 0x0077 }
            java.lang.Object r14 = r0.get(r12)     // Catch:{ JSONException -> 0x0077 }
            boolean r13 = r13.equals(r14)     // Catch:{ JSONException -> 0x0077 }
            if (r13 != 0) goto L_0x006e
        L_0x0062:
            boolean r13 = r10.has(r12)     // Catch:{ JSONException -> 0x0077 }
            if (r13 != 0) goto L_0x0070
            boolean r12 = r12.equals(r9)     // Catch:{ JSONException -> 0x0077 }
            if (r12 == 0) goto L_0x0070
        L_0x006e:
            r12 = 1
            goto L_0x0042
        L_0x0070:
            r12 = 0
        L_0x0071:
            if (r12 == 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            int r8 = r8 + 1
            goto L_0x002f
        L_0x0077:
            r10 = 0
        L_0x0078:
            java.lang.String r8 = "data"
            java.lang.String r11 = "version"
            java.lang.String r12 = "application"
            if (r10 == 0) goto L_0x0139
            java.lang.String r0 = r10.getString(r12)     // Catch:{ JSONException -> 0x0119 }
            java.lang.String r13 = r10.getString(r11)     // Catch:{ JSONException -> 0x0119 }
            java.lang.String r14 = r10.getString(r7)     // Catch:{ JSONException -> 0x0119 }
            java.lang.String r15 = r10.getString(r6)     // Catch:{ JSONException -> 0x0119 }
            boolean r16 = r10.has(r8)     // Catch:{ JSONException -> 0x0119 }
            if (r16 == 0) goto L_0x009b
            org.json.JSONArray r16 = r10.getJSONArray(r8)     // Catch:{ JSONException -> 0x0119 }
            goto L_0x00a0
        L_0x009b:
            org.json.JSONArray r16 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0119 }
            r16.<init>()     // Catch:{ JSONException -> 0x0119 }
        L_0x00a0:
            r17 = r4
            r4 = r16
            boolean r16 = r10.has(r9)     // Catch:{ JSONException -> 0x0113 }
            if (r16 == 0) goto L_0x00ad
            r10.getString(r9)     // Catch:{ JSONException -> 0x0113 }
        L_0x00ad:
            r16 = r3
            java.lang.String r3 = r1.f17944b     // Catch:{ JSONException -> 0x010f }
            r18 = r2
            org.json.JSONObject r2 = r20.mo20804a()     // Catch:{ JSONException -> 0x010d }
            r4.put(r2)     // Catch:{ JSONException -> 0x010d }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x010d }
            r2.<init>()     // Catch:{ JSONException -> 0x010d }
            r2.put(r12, r0)     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r11, r13)     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r7, r14)     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r6, r15)     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r8, r4)     // Catch:{ JSONException -> 0x00d4 }
            if (r3 == 0) goto L_0x00d5
            r2.put(r9, r3)     // Catch:{ JSONException -> 0x00d4 }
            goto L_0x00d5
        L_0x00d4:
            r2 = 0
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            int r3 = r5.length()     // Catch:{ JSONException -> 0x00ee }
            if (r0 >= r3) goto L_0x0109
            org.json.JSONObject r3 = r5.getJSONObject(r0)     // Catch:{ JSONException -> 0x00ee }
            if (r3 != r10) goto L_0x00eb
            if (r2 == 0) goto L_0x00eb
            r5.remove(r0)     // Catch:{ JSONException -> 0x00ee }
            r5.put(r2)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x0109
        L_0x00eb:
            int r0 = r0 + 1
            goto L_0x00d6
        L_0x00ee:
            r0 = move-exception
            java.lang.String r2 = r5.f17942a     // Catch:{ JSONException -> 0x010d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x010d }
            r3.<init>()     // Catch:{ JSONException -> 0x010d }
            java.lang.String r4 = "Exception during replacing logs JSON. Error: "
            r3.append(r4)     // Catch:{ JSONException -> 0x010d }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ JSONException -> 0x010d }
            r3.append(r0)     // Catch:{ JSONException -> 0x010d }
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x010d }
            android.util.Log.e(r2, r0)     // Catch:{ JSONException -> 0x010d }
        L_0x0109:
            r2 = r19
            goto L_0x0182
        L_0x010d:
            r0 = move-exception
            goto L_0x0120
        L_0x010f:
            r0 = move-exception
            r18 = r2
            goto L_0x0120
        L_0x0113:
            r0 = move-exception
            r18 = r2
            r16 = r3
            goto L_0x0120
        L_0x0119:
            r0 = move-exception
            r18 = r2
            r16 = r3
            r17 = r4
        L_0x0120:
            r2 = r19
            java.lang.String r3 = r2.f17941a
            java.lang.String r4 = "Exception during creating logs JSON. Error: "
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0072d.m201h(r4)
            java.lang.String r0 = r0.getLocalizedMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r3, r0)
            goto L_0x0141
        L_0x0139:
            r18 = r2
            r16 = r3
            r17 = r4
            r2 = r19
        L_0x0141:
            int r0 = r5.length()
            r3 = 100
            if (r0 != r3) goto L_0x014e
            u8.c r5 = new u8.c
            r5.<init>()
        L_0x014e:
            java.lang.String r0 = r1.f17944b
            java.lang.String r3 = "CardinalMobileSdk_Android"
            java.lang.String r4 = "2.2.4-1"
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>()
            org.json.JSONObject r1 = r20.mo20804a()
            r10.put(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r1.put(r12, r3)     // Catch:{ JSONException -> 0x017e }
            r1.put(r11, r4)     // Catch:{ JSONException -> 0x017e }
            r3 = r18
            r1.put(r7, r3)     // Catch:{ JSONException -> 0x017e }
            r3 = r16
            r1.put(r6, r3)     // Catch:{ JSONException -> 0x017e }
            r1.put(r8, r10)     // Catch:{ JSONException -> 0x017e }
            if (r0 == 0) goto L_0x017f
            r1.put(r9, r0)     // Catch:{ JSONException -> 0x017e }
            goto L_0x017f
        L_0x017e:
            r1 = 0
        L_0x017f:
            r5.put(r1)
        L_0x0182:
            java.lang.String r0 = r5.toString()
            r1 = r17
            r1.mo20806b(r0)
            goto L_0x018e
        L_0x018c:
            r2 = r19
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p257u8.C8172b.mo20803b(u8.d):void");
    }

    /* renamed from: c */
    public C8174c mo19176c() {
        String a = new C8176e().mo20805a();
        if (!a.isEmpty()) {
            try {
                return new C8174c(a);
            } catch (JSONException e) {
                String str = this.f17941a;
                StringBuilder h = C0072d.m201h("Exception during creating logs JSON. Error: ");
                h.append(e.getLocalizedMessage());
                Log.e(str, h.toString());
            }
        }
        return new C8174c();
    }

    /* renamed from: d */
    public void mo19177d(String str, String str2, String str3) {
        C8175d dVar = new C8175d();
        dVar.f17947e = str;
        dVar.f17943a = str2;
        dVar.f17944b = str3;
        dVar.f17945c = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        dVar.f17948f = true;
        mo20803b(dVar);
    }

    /* renamed from: e */
    public void mo19178e() {
        if (f17937b) {
            new C8176e().mo20806b("");
        }
    }
}
