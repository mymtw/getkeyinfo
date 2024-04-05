package p145io.branch.referral.network;

import android.support.p013v4.media.C0073e;
import org.apache.commons.cli.HelpFormatter;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7031c0;
import p145io.branch.referral.C7077r;
import p145io.branch.referral.Defines$Jsonkey;

/* renamed from: io.branch.referral.network.BranchRemoteInterface */
public abstract class BranchRemoteInterface {

    /* renamed from: io.branch.referral.network.BranchRemoteInterface$BranchRemoteException */
    public static class BranchRemoteException extends Exception {
        /* access modifiers changed from: private */
        public int branchErrorCode;

        public BranchRemoteException(int i) {
            this.branchErrorCode = i;
        }
    }

    /* renamed from: io.branch.referral.network.BranchRemoteInterface$a */
    public static class C7061a {

        /* renamed from: a */
        public final String f15714a;

        /* renamed from: b */
        public final int f15715b;

        /* renamed from: c */
        public String f15716c;

        public C7061a(String str, int i) {
            this.f15714a = str;
            this.f15715b = i;
        }
    }

    /* renamed from: a */
    public static boolean m13651a(String str, JSONObject jSONObject) {
        try {
            if (!jSONObject.has(Defines$Jsonkey.UserData.getKey())) {
                jSONObject.put(Defines$Jsonkey.SDK.getKey(), "android5.2.2");
            }
            if (str.equals("bnc_no_value")) {
                return false;
            }
            jSONObject.put(Defines$Jsonkey.BranchKey.getKey(), str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0044 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p145io.branch.referral.C7031c0 m13652c(p145io.branch.referral.network.BranchRemoteInterface.C7061a r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = r6.f15714a
            int r6 = r6.f15715b
            io.branch.referral.c0 r1 = new io.branch.referral.c0
            r1.<init>(r6)
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x002d
            java.util.Locale r2 = java.util.Locale.getDefault()
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r4] = r6
            r6 = 2
            r5[r6] = r0
            java.lang.String r6 = "Server returned: [%s] Status: [%d]; Data: %s"
            java.lang.String r6 = java.lang.String.format(r2, r6, r5)
            p145io.branch.referral.C7077r.m13675a(r6)
            goto L_0x003a
        L_0x002d:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r0
            java.lang.String r8 = "returned %s"
            java.lang.String r6 = java.lang.String.format(r8, r6)
            p145io.branch.referral.C7077r.m13675a(r6)
        L_0x003a:
            if (r0 == 0) goto L_0x0092
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0044 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x0044 }
            r1.f15641b = r6     // Catch:{ JSONException -> 0x0044 }
            goto L_0x0092
        L_0x0044:
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x004c }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x004c }
            r1.f15641b = r6     // Catch:{ JSONException -> 0x004c }
            goto L_0x0092
        L_0x004c:
            r6 = move-exception
            io.branch.referral.Defines$Jsonkey r8 = p145io.branch.referral.Defines$Jsonkey.QRCodeTag
            java.lang.String r8 = r8.getKey()
            boolean r7 = r7.contains(r8)
            java.lang.String r8 = "JSON exception: "
            if (r7 == 0) goto L_0x0080
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006c }
            r6.<init>()     // Catch:{ JSONException -> 0x006c }
            io.branch.referral.Defines$Jsonkey r7 = p145io.branch.referral.Defines$Jsonkey.QRCodeResponseString     // Catch:{ JSONException -> 0x006c }
            java.lang.String r7 = r7.getKey()     // Catch:{ JSONException -> 0x006c }
            r6.put(r7, r0)     // Catch:{ JSONException -> 0x006c }
            r1.f15641b = r6     // Catch:{ JSONException -> 0x006c }
            goto L_0x0092
        L_0x006c:
            r6 = move-exception
            java.lang.StringBuilder r7 = android.support.p013v4.media.C0072d.m201h(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            p145io.branch.referral.C7077r.m13675a(r6)
            goto L_0x0092
        L_0x0080:
            java.lang.StringBuilder r7 = android.support.p013v4.media.C0072d.m201h(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            p145io.branch.referral.C7077r.m13675a(r6)
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.network.BranchRemoteInterface.m13652c(io.branch.referral.network.BranchRemoteInterface$a, java.lang.String, java.lang.String):io.branch.referral.c0");
    }

    /* renamed from: b */
    public final C7031c0 mo19295b(String str, String str2, String str3, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!m13651a(str3, jSONObject)) {
            return new C7031c0(-114);
        }
        C7077r.m13675a("posting to " + str);
        C7077r.m13675a("Post value = " + jSONObject.toString());
        try {
            C7061a d = ((C7062a) this).mo19296d(0, str, jSONObject);
            C7031c0 c = m13652c(d, str2, d.f15716c);
            if (Branch.m13575j() != null) {
                Branch j = Branch.m13575j();
                StringBuilder k = C0073e.m211k(str2, HelpFormatter.DEFAULT_OPT_PREFIX);
                k.append(Defines$Jsonkey.Branch_Round_Trip_Time.getKey());
                j.mo19193a(k.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return c;
        } catch (BranchRemoteException e) {
            if (e.branchErrorCode == -111) {
                C7031c0 c0Var = new C7031c0(-111);
                if (Branch.m13575j() != null) {
                    Branch j2 = Branch.m13575j();
                    StringBuilder k2 = C0073e.m211k(str2, HelpFormatter.DEFAULT_OPT_PREFIX);
                    k2.append(Defines$Jsonkey.Branch_Round_Trip_Time.getKey());
                    j2.mo19193a(k2.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
                }
                return c0Var;
            }
            C7031c0 c0Var2 = new C7031c0(-113);
            if (Branch.m13575j() != null) {
                Branch j3 = Branch.m13575j();
                StringBuilder k3 = C0073e.m211k(str2, HelpFormatter.DEFAULT_OPT_PREFIX);
                k3.append(Defines$Jsonkey.Branch_Round_Trip_Time.getKey());
                j3.mo19193a(k3.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return c0Var2;
        } catch (Throwable th) {
            if (Branch.m13575j() != null) {
                Branch j4 = Branch.m13575j();
                StringBuilder k4 = C0073e.m211k(str2, HelpFormatter.DEFAULT_OPT_PREFIX);
                k4.append(Defines$Jsonkey.Branch_Round_Trip_Time.getKey());
                j4.mo19193a(k4.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            throw th;
        }
    }
}
